package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+ (i+1) +" 점수: " + students[i]); //문자 더하기 숫자는 문자가 된다. ex. i+1 => 01
        }
    }
}
