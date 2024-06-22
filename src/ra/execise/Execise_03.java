package ra.execise;

import java.util.Scanner;

public class Execise_03 {
    public static void main(String[] args) {
        /*
         * 1. Nhập số phần tử, khởi tạo mảng, nhập giá trị các phần tử 2 mảng số nguyên
         * 2. Khởi tạo mảng gộp có số phần tử bằng tổng số phần tử 2 mảng
         * 3. Thực hiện copy các phần tử của 2 mảng sang mảng gộp
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng 1:");
        int size1 = Integer.parseInt(scanner.nextLine());
        int[] number1 = new int[size1];
        for (int i = 0; i < number1.length; i++) {
            System.out.printf("number1[%d]=", i);
            number1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Nhập số phần tử mảng 2:");
        int size2 = Integer.parseInt(scanner.nextLine());
        int[] number2 = new int[size2];
        for (int i = 0; i < number2.length; i++) {
            System.out.printf("number2[%d]=", i);
            number2[i] = Integer.parseInt(scanner.nextLine());
        }

        //Khởi tạo mảng gộp
        int[] numbers = new int[number1.length + number2.length];
        //Khởi tạo chỉ số phần tử đầu tiên chưa có giá trị trong mảng gộp
        int currentIndex = 0;
        //-Copy các phần tử của number1 sang numbers
        for (int i = 0; i < number1.length; i++) {
            numbers[currentIndex] = number1[i];
            currentIndex++;
        }
        //-Copy các phần tử của number2 sang numbers
        for (int i = 0; i < number2.length; i++) {
            numbers[currentIndex] = number2[i];
            currentIndex++;
        }
        System.out.println("GIÁ TRỊ CÁC PHẦN TỬ SAU KHI GỘP:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\t", numbers[i]);
        }
        System.out.println();
    }
}
