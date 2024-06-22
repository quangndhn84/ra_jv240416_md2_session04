package ra.session04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate_Data {
    public static void main(String[] args) {
        /*
         * Nhập vào mã sinh viên gồm 5 ký tự bắt đầu là SV, 3 ký tự sau là các số
         * */
        Scanner scanner = new Scanner(System.in);
        String studentIdRegex = "SV[0-9]{3}";
        System.out.println("Nhập vào mã sinh viên:");
        String studentId;
        do {
            studentId = scanner.nextLine();
            if (Pattern.matches(studentIdRegex, studentId)) {
                break;
            } else {
                System.err.println("Mã sinh viên không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Mã sinh viên vừa nhập: " + studentId);

    }
}
