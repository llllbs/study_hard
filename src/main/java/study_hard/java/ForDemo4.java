/*
 * 별찍기
 * *****
 * ****
 * ***
 * **
 * *
 */
package study_hard.java;

public class ForDemo4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    for(int i=0; i<=5; i++) {
      for(int j=5; j>i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
