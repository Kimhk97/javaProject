package references;

import java.util.Scanner;

public class Homework1 {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      boolean run = true;
      int studentNum = 0;
      int[][] students = null;
      String m = "f"; // 번호에 이미 값이 입력되어 있으면...
//      if (m != null && m.equals(true)); {
//         System.out.println("이미 입력했습니다.");
//      }
//      while (run) {
//         if (m != null && m.length() != 0) {
//            System.out.println("이미 입력했습니다.");
//         } else {
//            run = false;
//         }
//      }

      
      while (true) {
         System.out.println("----------------------------------------------------------------");
         System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7.수학평균점이상 9.종료");
         System.out.println("----------------------------------------------------------------");
         System.out.println("선택> ");

         int menu = scn.nextInt();

         if (menu == 1) {
            System.out.print("학생수> ");
            studentNum = scn.nextInt();
            students = new int[studentNum][3];

         } else if (menu == 2) {
            for (int i = 0; i < studentNum; i++) {
               System.out.println("학생번호>> ");
               students[i][0] = scn.nextInt(); // 학생번호
               System.out.println("영어점수> ");
               students[i][1] = scn.nextInt(); // 영어점수
               System.out.println("수학점수> ");
               students[i][2] = scn.nextInt(); // 수학점수
            }

         } else if (menu == 3) {
            for (int i = 0; i < studentNum; i++) {
               System.out.println(
                     "학생정보 -  " + "번호:" + students[i][0] + ", 영어:" + students[i][1] + ", 수학:" + students[i][2]);
            }
         } else if (menu == 4) {
            System.out.println("찾고자 하는 학생번호 입력> ");
            int s = scn.nextInt();
            for (int i = 0; i < students.length; i++) {
               if (students[i][0] == s) {
                  System.out.println("학생정보 -  " + "번호:" + students[i][0] + ", 영어:" + students[i][1] + ", 수학:"
                        + students[i][2]);
               }
            }
         } else if (menu == 5) {
            int maxValue = 0;
            int student = 0;
            for (int i = 0; i < students.length; i++) {
               if (students[i][1] > maxValue) {
                  maxValue = students[i][1];
                  student = students[i][0];
               }
            }
            System.out.println("영어최고점: 학생번호 - " + student + " - 영어: " + maxValue);

         } else if (menu == 6) {
            double avg = 0;
            int student = 0;
            for (int i = 0; i < students.length; i++) {
               if ((students[i][1] + students[i][2]) / 2.0 > avg) {
                  avg = (students[i][1] + students[i][2]) / 2.0;
                  student = students[i][0];
               }
            }
            System.out.println("학생번호: " + student + " 평균점수: " + avg);

         } else if (menu == 7) {
            double avg = 0;
            int sum = 0;
            int student = 0;
            int mathScore = 0;
            for (int i = 0; i < students.length; i++) {
               sum += students[i][2];
               mathScore = students[i][2];
               avg = sum / students.length;
               if (mathScore > avg) {
                  student = students[i][0]; // 평균점 이상인 점수가 전체 나와야 하는데 하나만 나옴
               }
            }
            System.out.println("평균점수: " + avg);
            System.out.println("학생번호: " + student + ", 수학점수: " + mathScore);

         } else if (menu == 9) {
            System.out.println("프로그램 종료.");
            break;
         }
      }
   }

}