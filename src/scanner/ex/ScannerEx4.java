package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int dansu = input.nextInt();

        System.out.println(dansu + "단의 구구단");
            
        for (int i = 1; i <= 9; i++) {
            System.out.println(dansu + " x " + i + " = " + dansu * i);
        }

    }
}
