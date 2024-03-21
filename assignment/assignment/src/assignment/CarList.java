package assignment;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CarList extends ArrayList<Car>{
    private ArrayList<Car> listCar = new ArrayList<Car>();
    BrandList brandList = new BrandList();
    Scanner sc = new Scanner(System.in);
    
    //    public CarList() {
    //        listCar = new ArrayList<Car>();
    //    }

    public CarList(BrandList bList) {
        brandList = bList;
    }
    
    public void searchBrand(String ID){
         //System.out.println("Enter Discount: ");
        // double discount = sc.nextDouble();
//        ID = ID.trim().toUpperCase();
        int n = 0;
        try{
            
            for(Car o : listCar){
                //o.setDiscount(discount);
    //            if(list.get(i).getBrandID().equals(ID)) return list.get(i);
                if(o.getBrand().getBrandName().contains(ID)){
                    n++;
//                    System.out.println(o);
                    System.out.println(o.getCarID() + ", " + o.getBrand().getBrandID() + ", " + o.getColor() + ", " + o.getEngineID() + ", Total = " + (o.getBrand().getPrice()));
                }
            }
                if(n==0){
                    System.out.print("Not found");
                    
                    
                }
        }catch(Exception e){
            
        }
    }
    public Car searchCarID(String ID){
        for(int i=0;i<listCar.size();i++){
            if(listCar.get(i).getCarID().contains(ID)) return listCar.get(i);
        }
        return null;
    }
    
    
    
    

    public boolean loadFromFile(String filename) throws FileNotFoundException, IOException{
        File f = new File(filename);
        try (FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)) {
            Brand b = null;
            if(!f.exists()){
                System.out.println("File not exist!");
            }
            String s;
            while((s = br.readLine())!= null){
                try{
                    StringTokenizer sk = new StringTokenizer(s,",");
                    //            try{
                    while(sk.hasMoreTokens()){
                        String id = sk.nextToken().trim();
                        String bid = sk.nextToken().trim();
                        String color = sk.nextToken().trim();
                        String fid = sk.nextToken().trim();
                        String engine = sk.nextToken().trim();
                        int pos = brandList.searchID(bid);

                        b = brandList.listB().get(pos);
                        listCar.add(new Car(id, b, color, fid, engine));
                        //                System.out.println(b);
                        //                System.out.println();
                        //                    System.out.println(listCar);
                        //            }
                        //            }catch(Exception e){
                        //                
                    }
                    
                }catch(Exception e){
                    
                }
                
            }
            
        }
        
        return true;
    }
    
    public void DisplayListCarTotal(){
        try{
            ArrayList<Car> newList = listCar;
            //System.out.println("Enter discount: ");
            //double discount = sc.nextDouble();
//            Car m = new Car();
//            m.inputDiscount();
//            System.out.println(listCar);
            for(Car o : newList){
               // o.setDiscount(discount);
                System.out.println(o.getCarID() + ", " + o.getBrand().getBrandID() + ", " + o.getColor() + ", " + o.getEngineID());
//                return carID + ", " + brand.getBrandID() + ", " + color + ", " + frameID + ", " + engineID + ", Total ="  + (getBrand().getPrice() - discount);
            }
            
           
            
        }catch(Exception e){
            System.out.println("Error at DisplayCar");
        }
    }
    
    public boolean saveToFile(String filename) throws IOException{
        try (FileWriter fr = new FileWriter(filename); BufferedWriter br = new BufferedWriter(fr)) {
            for(int i=0;i<listCar.size();i++){
                if(listCar.get(i) != null){
                    String s = "";
                    s += listCar.get(i) + "\n";
                    br.write(s);
                }
            }
            System.out.println("Data successfully appended at the end of file");
        }
        return true;
    }
    
    public int searchID(String carID){
        int n = listCar.size();
        for(int i=0;i<n;i++){
            if(listCar.get(i).getCarID().equals(carID)) return i;
        }
        return -1;
    }
    
    public Car searchFrame(String fID){
        
        for(Car o : listCar){
            if(o.getFrameID().contains(fID)) return o;
        }
        return null;
    }
    
    public Car searchEngine(String eID){
        
        for(Car o : listCar){
            if(o.getEngineID().contains(eID)) return o;
        }
        return null;
    }
    
    public void addCar(){
        String newCarID, newColor, newFrameID, newEngineID;
        Brand b;
        boolean idDuplicated;
        boolean checkFrame;
        boolean checkEngine;
        do{
            idDuplicated = false;
            checkFrame = false;
            checkEngine = false;
            System.out.println("Enter Car ID: ");
            newCarID = sc.nextLine().trim();
            System.out.println("Choose Brand");
//            for(int i=0;i<brandList.listB().size();i++){
//                Brand n = brandList.listB().get(i);
//                System.out.println(n);
//            }
            b = (Brand)Menu.ref_getChoice(brandList.listB());
            System.out.println("Enter Color: ");
            newColor = sc.nextLine().trim();
            System.out.println("Enter Frame ID(F00000): ");
            newFrameID = sc.nextLine().trim();
            System.out.println("Enter Engine ID(E00000): ");
            newEngineID = sc.nextLine().trim();
            if(searchCarID(newCarID) != null){
                System.out.println("ID is duplicated-------");
                idDuplicated = true;
            }
            if(newColor.isEmpty()) System.out.println("Color is empty-------");
            if(!newFrameID.matches("[F][\\d]{5}") || searchFrame(newFrameID) != null || newFrameID.isEmpty()){
                System.out.println("Check Frame ID-------");
                checkFrame = true;
                
            }
            if(!newEngineID.matches("[E][\\d]{5}") || searchEngine(newEngineID) != null || newEngineID.isEmpty()){
                System.out.println("Check Engine ID-------");
                checkEngine = true;
            }
        }while(idDuplicated == true || newColor.isEmpty() || checkFrame == true || checkEngine == true);
        listCar.add(new Car(newCarID, b, newColor, newFrameID, newEngineID));
        System.out.println("Car " + newCarID + " has been added");
    }
    
    public void printBasedBrandName(){
        int count = 0;
        for(Brand o : brandList){
            String aPartOfBrandName = o.getBrandName();
            for(int i=0;i<listCar.size()-1;i++){
                Car c = this.get(i);
                if(aPartOfBrandName.equals(c.getBrand().getBrandName())){
                    System.out.print(c.screenString());
                    count++;
                }
            }
        }
        if(count == 0) System.out.println("No car is detected!");
    }
    
    public boolean removeCar(){
        System.out.println("Enter Car ID to remove: ");
        String removedID = sc.nextLine();
        int pos = searchID(removedID);
        if(pos<0){
            System.out.println("Not found!");
            return false;
        }
        else{
            listCar.remove(pos);
            System.out.println("Moved successfully");
        }
        return true;
    }
    

    public boolean updateCar(){
        boolean checkFrame;
        boolean checkEngine;
        String newCarID, newColor, newFrameID, newEngineID;
        Brand b;
        System.out.println("Enter Car ID to update: ");
        String updatedID = sc.nextLine();
        int pos = searchID(updatedID);
        if(pos<0){
            System.out.println("Not found!");
            return false;
        }
        else{
            do{
                checkFrame = false;
                checkEngine = false;
                System.out.println("Choose Brand");
                b = (Brand)Menu.ref_getChoice(brandList.listB());
                System.out.println("Enter new Color: ");
                newColor = sc.nextLine().trim();
                System.out.println("Enter new Frame ID(F00000): ");
                newFrameID = sc.nextLine().trim();
                System.out.println("Enter new Engine ID(E00000): ");
                newEngineID = sc.nextLine().trim();
                
//                System.out.println(listCar);
                
                if(newColor.isEmpty()) System.out.println("Color is empty-------"); // || newFrameID.isEmpty()
                if((!newFrameID.matches("[F][\\d]{5}")) || searchFrame(newFrameID) != null || newEngineID.isEmpty()){
                    System.out.println("Check Frame ID-------");
                    checkFrame = true;

                }
                if((!newEngineID.matches("[E][\\d]{5}")) || searchEngine(newEngineID) != null || newEngineID.isEmpty() ){
                    System.out.println("Check Engine ID-------"); //|| newEngineID.isEmpty()
                    checkEngine = true;
                }
                listCar.get(pos).setBrand(b);
                listCar.get(pos).setColor(newColor);
                listCar.get(pos).setFrameID(newFrameID);
                listCar.get(pos).setEngineID(newEngineID);
            
            }while( newColor.isEmpty() || checkFrame == true || checkEngine == true);
        }
        return true;
        
    }
    
//    public boolean updateCar(){
//        System.out.println("Enter Car ID to update");
//        String updatedID = sc.nextLine();
//        return false;
//    }
    
    public void listCars(){
        try{
            //System.out.println("Enter Discount");
            //double discount = sc.nextDouble();
            ArrayList<Car> newList = listCar;
            Collections.sort(listCar);
            for(int i=0;i<listCar.size();i++){
                //listCar.get(i).setDiscount(discount);
                Car c = listCar.get(i);
                System.out.println(c.screenString());
            }
            
        }catch(Exception e){
            
        }
    }

//    @Override
//    public String toString() {
//        return "CarList{" + "listCar=" + listCar + ", brandList=" + brandList + ", sc=" + sc + '}';
//    }
}