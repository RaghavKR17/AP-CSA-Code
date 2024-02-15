/*
Raghav Krishna Ranganathan
APCS Period 5
Chapter 2, Space Needle Project
*/
public class SpaceNeedle {

       public static final int SIZE = 4;                  
       
       public static void main(String[] args) {
             needleTop();
             needleBase1();
             needleBase2();
             needleBottom();
             needleTop();
             needleTower();
             needleBase1();
             needleBase2();
       }
       
/*
this method prints the lines for the needle pole
            ||
            ||
            ||
            ||
*/
       public static void needleTop() {
             for (int i = 1; i <= SIZE; i++) {
                    for (int j = 1; j <= SIZE * 3; j++) {
                          System.out.print(" ");
                    }
                    System.out.println("||");
             }
       }
       
/*
this method is for the base and the top half of the needle
                  __/||\__
               __/:::||:::\__
            __/::::::||::::::\__
         __/:::::::::||:::::::::\__
*/
       public static void needleBase1() {
             for (int i = 1; i <= SIZE; i++) {
                    int spaces = (SIZE - i) * 3;
                    // print space, spaces times
                    for (int j = 1; j <= spaces; j++) {
                          System.out.print(" ");
                    }                   
                    
                    // print __/
                    System.out.print("__/");
                    int colons = (i - 1) * 3;
                    // print colon, colons times
                    for (int j = 1; j <= colons; j++) {
                          System.out.print(":");
                    }
                    System.out.print("||");
                    
                    
                    for (int j = 1; j <= colons; j++) {
                          System.out.print(":");
                    }
                    System.out.print("\\__");
                    
                    System.out.println();
             }            
       }
       
/*
this method prints the base 
  		 |""""""""""""""""""""""""|
*/
       public static void needleBase2() {
             System.out.print("|");
             for (int i = 1; i <= SIZE * 6; i++) {
                    System.out.print("\"");
             }
             System.out.println("|");
       }
       
/*
this method is for making the tower of the needle
prints the: |%%||%%|
*/
       public static void needleTower() {            
             int parenthe = (SIZE - 2);
             //int spaces = (SIZE * 2) + 1;
             int spaces = SIZE * 3 - 1 - parenthe;
             int towers = SIZE * SIZE;
             for (int j = 1; j <= towers; j++) {
                    for (int i = 1; i <= spaces; i++) {
                          System.out.print(" ");
                    }
                    System.out.print("|");
                    for (int k = 1; k <= parenthe; k++) {
                          System.out.print("%");
                    }
                    System.out.print("||");
                    for (int k = 1; k <= parenthe; k++) {
                          System.out.print("%");
                    }
                    System.out.println("|");

             }
       }
       
/*
this method is for the bottom part of the needle
        	 \_/\/\/\/\/\/\/\/\/\/\/\_/
              \_/\/\/\/\/\/\/\/\/\_/
          		\_/\/\/\/\/\/\/\_/
               	\_/\/\/\/\/\_/
*/
       public static void needleBottom() {
             int width = 6 * SIZE +2;
             for (int i = 1; i <= SIZE; i++) {
                    int spaces = (i - 1) * 2;
                    int vs = (width/2) - 3 - spaces;
                    
                    for (int j = 1; j <= spaces; j++) {
                          System.out.print(" ");

                    }
                    
                    System.out.print("\\_/");
                    
                    for (int v = 1; v <= vs; v++) {
                          System.out.print("\\/");
                    }
                    System.out.print("\\_/");
                    System.out.println();
             }
       }
}

