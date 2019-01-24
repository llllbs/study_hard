package study_hard.java;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    
    int su;
    Scanner sc = new Scanner(System.in); // 입력을 받는다 
    System.out.println("숫자를 입력하세요>>");
    su = sc.nextInt(); // 다음줄의 숫자를 su에 넣는다
    
    switch(su){
      case 1:
        System.out.println("1 입니다 ");
       break; // break에서 switch 즉시 멈춤
        
      case 2:
        System.out.println("2 입니다");
        break;
        
      case 3:
        System.out.println("3 입니다");
        break;
        
        default: // 그밖의 값을 나타낼때 default 사용
          System.out.println("해당하는 숫자가 없습니다.");
    }
    
    
  }

}

// switch는 byte, short, char, int, enum, String, Character, Byte, Short, Integer만 가능
