package study_hard.java;

import java.util.Scanner;

public class LoginDemo {
  
  public static void main(String[] args) {
    
    String id,psw;
    
    Scanner sc = new Scanner(System.in);   
    System.out.println(" id를 입력 하세요 >> ");
    
    id = sc.nextLine();
    
    if(id.equals("kei")) {
      System.out.println("비밀번호를 입력 하세요 >>");
      psw = sc.nextLine();
      
      if(psw.equals("1111")) {
        System.out.println("kei님으로 로그인 되었습니다.");
      }else {
        System.out.println("비밀번호가 틀렸습니다.");
      }
    }else if(id.equals("guest")) {
      System.out.println("게스트로 로그인 하였습니다.");
    }
    
    
  }// end main

}// end class
