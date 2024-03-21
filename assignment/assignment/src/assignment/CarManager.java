
package assignment;



import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.util.NoSuchElementException;

public class CarManager {

    
    public static void main(String[] args) throws IOException, Exception {
        ArrayList<String> options = new ArrayList<>();
        options.add("List all bands");
        options.add("Add a new brand");
        options.add("Search a brand based on its ID");
        options.add("Update a brand");
        options.add("Save brands to the file, named brands.txt");
        options.add("List all cars in ascending order of brand names");
        options.add("List cars based on a part of an input brand name");
        options.add("Add a Car");
        options.add("Remove a car based on its ID");
        options.add("Update a car based on its ID");
        options.add("Save cars to file, named cars.txt");
        options.add("Display all car with total(total = price - discount)");
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        BrandList listB = new BrandList();
        listB.loadFromFile("C:\\Users\\quanb\\Dropbox\\PC\\Documents\\brands.txt");
        CarList listC = new CarList(listB);
        listC.loadFromFile("C:\\Users\\quanb\\Dropbox\\PC\\Documents\\cars.txt");
        do{
            System.out.println("\nCar managing program");
            choice = Menu.int_getChoice(options);
            switch(choice){
                case 1: listB.listBrands(); break;
                
                case 2: listB.addBrand(); break;
                
                case 3: System.out.println("Enter ID to be searched: ");
                
                System.out.println(listB.search(sc.nextLine()));
                break;
                
                case 4: listB.updateBrand(); break;
                
                case 5: listB.saveToFile("C:\\Users\\quanb\\Dropbox\\PC\\Documents\\brands.txt"); break;
                
                case 6: listC.listCars(); break;
                    
                case 7: 
                    System.out.println("Enter brand name: ");
                    String s = sc.nextLine();
                    listC.searchBrand(s);
//                    listC.printBasedBrandName();
                    break; 
                    
                case 8: listC.addCar();
                    break;
                    
                case 9: listC.removeCar(); 
                break;
                
                case 10: listC.updateCar(); 
                break;
                    
                case 11: listC.saveToFile("C:\\Users\\quanb\\Dropbox\\PC\\Documents\\cars.txt");
                break;
                
                case 12: listC.DisplayListCarTotal(); break;
                
                default: System.out.println("Bye!");
            }
        }while(choice > 0 && choice <= 12);
    }
    
}