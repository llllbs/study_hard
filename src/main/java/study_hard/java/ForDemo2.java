/*
 * 1부터 10까지 짝수의 합
 */

package study_hard.java;

public class ForDemo2 {

  public static void main(String[] args) {
    
    int sum=0;
    
    for(int i=1; i<=10; i++) {
      if(i%2==0) {
        sum = sum+i;
        System.out.println(i);
      }//end if
      
    }// end for
    System.out.println("총합: "+sum);
  }// end main

}// end class
