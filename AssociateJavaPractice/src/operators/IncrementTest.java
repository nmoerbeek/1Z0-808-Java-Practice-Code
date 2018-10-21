/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author nmoer
 */
public class IncrementTest {
    

   public static void main(String args[ ] ){
      int i = 0 ;
      boolean bool1 = true ;
      boolean bool2 = false;
      boolean bool  = false;
      bool = ( bool2 &  method1(i++) ); //1 Evaluates both statements on & resulting in an increment of 1.  so i = 1
      bool = ( bool2 && method1(i++) ); //2 Evaluates only one statement since && is used so method1(i++) is never evaluated.  so i = 1
      bool = ( bool1 |  method1(i++) ); //3 Evaluates both conditions because I is used so i = 2;
      bool = ( bool1 || method1(i++) ); //4 Evaluests only left side of arguement because bool1 equals 1 so i = 2;
      System.out.println(i);
   }
   public static boolean method1(int i){
       return i>0 ? true : false;
   }
}

    
    

