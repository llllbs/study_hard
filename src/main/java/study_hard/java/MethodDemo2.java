package study_hard.java;

public class MethodDemo2 {
  public static void numbering(int limit) {// limit 매개변수
    
    int i = 0;
    while(i<limit) {
      System.out.println(i);
      i++;
    }
  }
  
  public static void main(String[]args) {
    numbering(5); // 5 인자
  }

}
