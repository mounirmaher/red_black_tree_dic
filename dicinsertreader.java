/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblacktreedic;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mounir
 */
public class dicinsertreader {
      private Scanner x;
    private  String st;
    ArrayList<String> batch = new ArrayList<String>();
    File file = new File("dictionary.txt");
    
    
  
    public void openFile (){
        try {
          x=new Scanner(file);
            
        }
        catch (Exception e) {
            System.out.println("file not found");
        }
    }
    
    public void readFile (){
       
        
        
        while (x.hasNext())
        {
     
            st= x.nextLine().trim();
            batch.add(st);
        
        }
        
    }
    
    public void closeFile(){
        x.close();
    }
    
}
