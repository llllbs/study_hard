package study_hard.java;

public class MethodDemo4 {
  
  public static String numbering(int num, int limit) {
    
    int i = num;
    String output ="";
    
    while(i<limit) {
      
      output += i;
      i++;
    }
    
    return output;
  }
  
  public static void main(String[] args) {
    String result = numbering(0,5);
    
    System.out.println(result);
  }

}
