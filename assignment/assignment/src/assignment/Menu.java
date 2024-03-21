
package assignment;

import java.util.*;

public class Menu {
    
    public static int int_getChoice(ArrayList options){
        int response;
        int n = options.size();
        for(int i=0;i<n;i++){
            System.out.println(options.get(i));
        }
        System.out.println("Please choose an option 1 - " + options.size() + ": ");
        Scanner sc = new Scanner(System.in);
        response = Integer.parseInt(sc.nextLine());
        return response;
    }
    
    
    
    
    
    public static Brand ref_getChoice(ArrayList<Brand> options){
        int response;
        int n = options.size();
        do{
            response = int_getChoice(options);
        }while(response<0 || response > n);
        return options.get(response-1);
        
//        for(int i=0;i<options.length;i++){
//            System.out.println((i+1) + "-" + options[i]);
//            
//        }
//        System.out.print("Choose 1.." + options.length + ": ");
//        Scanner sc = new Scanner(System.in);
//        return Integer.parseInt(sc.nextLine());
    }
}
