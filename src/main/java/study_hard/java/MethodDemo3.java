package study_hard.java;

public class MethodDemo3 {
  public static void numbering(int num, int limit) {
    
    while(num<limit) {
      System.out.println(num);
      num++;
    }
    
    
  }
  
  public static void main(String[]args) {
    numbering(0,5);
  }

}
