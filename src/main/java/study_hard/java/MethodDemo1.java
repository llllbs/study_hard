package study_hard.java;

public class MethodDemo1 {
  
  public static void numbering() {// method 만들기
    
    int i=0;
    while(i<10) {
      System.out.println(i);
      i++;
    }
    
  }
  
  public static void main(String[]args) { // 메인 method에서 만든 method 사용하기
    numbering();
  }

}
