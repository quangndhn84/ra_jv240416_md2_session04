package ra.execise;

import java.util.Scanner;

public class Execise_02 {
    public static void main(String[] args) {
        /*
         * 1. Nhập số phần tử mảng 1 chiều số nguyên và khởi tạo mảng
         * 2. Nhập giá trị các phần tử
         * 3. Nhập chỉ số và giá trị phần tử cần thêm
         * 4. Thực hiện thêm phần tử vào mảng
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] oldArr = new int[size];
        System.out.println("NHẬP GIÁ TRỊ CÁC PHẦN TỬ CỦA MẢNG:");
        for (int i = 0; i < oldArr.length; i++) {
            System.out.printf("oldArr[%d]=", i);
            oldArr[i] = Integer.parseInt(scanner.nextLine());
        }
        //Validate bắt buộc phải nhập đúng chỉ số chèn
        int indexInsert;
        System.out.println("Nhập chỉ số phần tử cần chèn:");
        do {
            indexInsert = Integer.parseInt(scanner.nextLine());
            if (indexInsert < 0) {
                System.err.println("Chỉ số phần tử chèn không tồn tại trong mảng, vui lòng nhập lại");
            } else {
                break;
            }
        } while (true);
        System.out.println("Nhập vào giá trị phần tử cần chèn:");
        int valueInsert = Integer.parseInt(scanner.nextLine());
        //Thực hiện chèn
        int[] newArr;
        if (indexInsert < oldArr.length) {
            //- KHởi tạo mảng mới có số phân tử = size + 1
            newArr = new int[oldArr.length + 1];
            //- Copy các phần tử cũ và chèn phần tử mới vào newArr
            for (int i = 0; i < newArr.length; i++) {
                if (i < indexInsert) {
                    newArr[i] = oldArr[i];
                } else if (i == indexInsert) {
                    newArr[i] = valueInsert;
                } else {
                    newArr[i] = oldArr[i - 1];
                }
            }
        } else {
            //- Khởi tạo mảng mới có số phần tử = indexInsert+1
            newArr = new int[indexInsert + 1];
            //- Copy các phần tử cũ sang mảng mới
            for (int i = 0; i < oldArr.length; i++) {
                newArr[i] = oldArr[i];
            }
            //- Phần tử có chỉ số indexInsert = valueInsert
            newArr[indexInsert] = valueInsert;
        }
        System.out.println("GIÁ TRỊ CÁC PHẦN TỬ TRONG MẢNG KHI THÊM 1 PHẦN TỬ:");
        for (int element : newArr) {
            System.out.printf("%d\t", element);
        }
        System.out.println();
    }
}
