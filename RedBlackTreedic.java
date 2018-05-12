/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblacktreedic;

import java.util.Scanner;

/**
 *
 * @author mounir
 */
public class RedBlackTreedic {

   public static void main(String[] args)

     {            

       
          dicinsertreader in = new dicinsertreader();
          in.openFile();
          in.readFile();
          in.closeFile();
         
         
         
         
         
         
         
         
         
         Scanner scan = new Scanner(System.in);

        /* Creating object of RedBlack Tree */

        RBTree rbt = new RBTree("0"); 

        System.out.println("Red Black Tree Dic Test\n");          

        char ch;

        /*  Perform tree operations  */

        do    

        {

            System.out.println("\nRed Black Tree Operations\n");

            System.out.println("1. insert ");

            System.out.println("2. search");

            System.out.println("3. count nodes");

            System.out.println("4. check empty");

            System.out.println("5. clear tree");
            
            System.out.println("6. insert from txt file");

 

            int choice = scan.nextInt();            

            switch (choice)

            {

            case 1 : 

                System.out.println("Enter integer element to insert");

                rbt.insert( scan.next() );                     

                break;                          

            case 2 : 

                System.out.println("Enter integer element to search");

                System.out.println("Search result : "+ rbt.search( scan.next() ));

                break;                                          

            case 3 : 

                System.out.println("Nodes = "+ rbt.countNodes());

                break;     

            case 4 : 

                System.out.println("Empty status = "+ rbt.isEmpty());

                break;     

            case 5 : 

                System.out.println("\nTree Cleared");

                rbt.makeEmpty();

                break;     
                
                
                case 6 : 

                for (int i = 0; i < in.batch.size(); i++) {
                   
                    rbt.insert( in.batch.get(i) );
                }
                
               

                break;

            default : 

                System.out.println("Wrong Entry \n ");

                break;    

            }

            /*  Display tree  */

            System.out.print("\nPost order : ");

            rbt.postorder();

            System.out.print("\nPre order : ");

            rbt.preorder();

            System.out.print("\nIn order : ");

            rbt.inorder(); 

 

            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);                        

        } while (ch == 'Y'|| ch == 'y');               

     }
    
}
