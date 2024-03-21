package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import sun.security.util.PropertyExpander;


public class BrandList extends ArrayList<Brand> {

    public ArrayList<Brand> list;
    Scanner sc = new Scanner(System.in);

    public BrandList() {
        list = new ArrayList<>();
    }

    public BrandList(ArrayList<Brand> list) {
        this.list = list;
    }

    public ArrayList<Brand> listB() {
        return list;
    }

    public Brand search(String ID) {
        ID = ID.trim().toUpperCase();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBrandID().equals(ID)) {
                return list.get(i);
            }
        }
//        System.out.print("Not found_");
        return null;
    }

    public boolean loadFromFile(String filename) throws NullPointerException, FileNotFoundException, IOException {
        File f = new File(filename);
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        if (!f.exists()) {
            System.out.println("file not exist!");
            return false;
        }
//        Scanner scan = new Scanner(new File(filename));
        String s;
        while ((s = br.readLine()) != null) {

//            System.out.println(s);
            try {

                StringTokenizer pcm = new StringTokenizer(s, ",:");
                while (pcm.hasMoreTokens()) {
                    String id = pcm.nextToken().trim();
                    String name = pcm.nextToken().trim();
                    String sound = pcm.nextToken().trim();
                    double price = Double.parseDouble(pcm.nextToken());
                    list.add(new Brand(id, name, sound, price));

                }
            } catch (Exception e) {
                
            }
//

        }
        br.close();
        fr.close();
//        for(Brand l : list) System.out.println(l);
        return true;

    }

    public boolean saveToFile(String filename) throws IOException {
        FileWriter fr = new FileWriter(filename);
        BufferedWriter br = new BufferedWriter(fr);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                String s = "";
                s += list.get(i) + "\n";
                br.write(s);
            }
        }
        System.out.println("Data successfully appended at the end of file");
        br.close();
        fr.close();
        return true;
    }

    //Cach dung?
    public int searchID(String bID) {

        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i).getBrandID().equals(bID)) {
                return i;
            }
        }
        return -1;

    }

    public Brand getUserChoice() {
        Menu mnu = new Menu();
        return (Brand) Menu.ref_getChoice(list);
    }

    public void addBrand() {
        String newBrandID, newBrandName, newSoundBrand;
        double newPrice;
        boolean idDuplicated;
        do {
            idDuplicated = false;
            System.out.println("Enter Brand ID: ");
            newBrandID = sc.nextLine().trim();
            System.out.println("Enter Brand Name: ");
            newBrandName = sc.nextLine().trim();
            System.out.println("Enter Brand Sound: ");
            newSoundBrand = sc.nextLine().trim();
            System.out.println("Enter Brand Price: ");
            newPrice = Double.parseDouble(sc.nextLine());
            if (search(newBrandID) != null) {
                idDuplicated = true;
                System.out.println("ID is duplicated-------");
            }
            if (newBrandID.isEmpty()) {
                System.out.println("Fill ID-------");
            }
            if (newBrandName.isEmpty()) {
                System.out.println("Fill Name-------");
            }
            if (newSoundBrand.isEmpty()) {
                System.out.println("Fill Sound-------");
            }
            if (newPrice < 0) {
                System.out.println("Price must larger than 0-------");
            }
        } while (newBrandID.isEmpty() || idDuplicated == true || newBrandName.isEmpty() || newSoundBrand.isEmpty() || newPrice < 0);
        Brand br = new Brand(newBrandID, newBrandName, newSoundBrand, newPrice);
        list.add(br);
        System.out.println("Brand " + newBrandID + " has been added");

    }

    public void updateBrand() {
        String newBrandID, newBrandName, newSoundBrand;
        double newPrice;
        if (list.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
        } else {
            System.out.println("Enter Brand ID to update: ");
            String bID = sc.nextLine();
            int Pos = searchID(bID);
            if (Pos < 0) {
                System.out.println("Not Found ID!");
            } else {
                do {
                    System.out.println("ID found");
                    System.out.println("Enter new Brand Name: ");
                    newBrandName = sc.nextLine().trim();
                    System.out.println("Enter new Brand Sound: ");
                    newSoundBrand = sc.nextLine().trim();
                    System.out.println("Enter new Brand Price: ");
                    newPrice = Double.parseDouble(sc.nextLine());
                    list.get(Pos).setBrandName(newBrandName);
                    list.get(Pos).setSoundBrand(newSoundBrand);
                    list.get(Pos).setPrice(newPrice);
                    if (newBrandName.isEmpty()) {
                        System.out.println("Fill Name-------");
                    }
                    if (newSoundBrand.isEmpty()) {
                        System.out.println("Fill Sound-------");
                    }
                    if (newPrice < 0) {
                        System.out.println("Price must larger than 0-------");
                    }
                } while (newBrandName.isEmpty() || newSoundBrand.isEmpty() || newPrice < 0);
            }
        }
    }

    public void listBrands() {
        if (list.isEmpty()) {
            System.out.println("Empty list");
        } else {
            System.out.println("Brand list:");
            list.forEach((br) -> {
                System.out.println(br);
            });
            System.out.println("Total: " + list.size() + " brand(s).");
        }

    }
}