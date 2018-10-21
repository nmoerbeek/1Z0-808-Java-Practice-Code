package Methods;

import java.util.*;
public class PassObj{
   public static void main(String args[]){
      Stack<Integer> s1 = new Stack<> (); //Creates Memory Reference 1 (1000)
      Stack<Integer> s2 = new Stack<> (); //Creates Memory Reference 2 (2000)
      processStacks (s1,s2);
      System.out.println (s1 + "    "+ s2);//Which results in 100 being displayed for s1 but not for s2
   }
   public static void processStacks(Stack<Integer> x1, Stack<Integer> x2){
      x1.push (new Integer("100")); //When a new item is added to the stack it goes to the existing memory 1000)
      x2 = x1; // When we change memory reference to set item, it does not change the memory reference from 2000 to 1000
   }
 }
