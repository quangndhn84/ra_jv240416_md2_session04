package ra.execise;

import java.util.Scanner;

public class Execise_01 {
    public static void main(String[] args) {
        /*
         * 1. Nhập vào số phần tử của mảng, khai báo mảng 1 chiều số nguyên
         * 2. Nhập giá trị các phần tử của mảng
         * 3. Nhập chỉ số phần tử cần xóa
         * 4. Xóa phần tử theo chỉ số trong mảng
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
        //Validate bắt buộc phải nhập đúng chỉ số có tồn tại
        int indexDelete;
        System.out.println("Nhập chỉ số phần tử cần xóa:");
        do {
            indexDelete = Integer.parseInt(scanner.nextLine());
            if (indexDelete < 0 || indexDelete >= oldArr.length) {
                System.err.println("Chỉ số phần tử xóa không tồn tại trong mảng, vui lòng nhập lại");
            }else{
                break;
            }
        } while (true);

        //Thực hiện xóa
        //- Tạo mảng mới có số phần từ = size-1
        int[] newArr = new int[oldArr.length - 1];
        //- Copy các giá trị còn lại trong mảng oldArr sang mảng newArr
        for (int i = 0; i < oldArr.length; i++) {
            if (i < indexDelete) {
                newArr[i] = oldArr[i];
            } else if (i > indexDelete) {
                newArr[i-1] = oldArr[i];
            }
        }
        //- Hiển thị các giá trị mảng newArr
        System.out.println("GIÁ TRỊ CÁC PHẦN TỬ SAU KHI XÓA:");
        for (int element : newArr) {
            System.out.printf("%d\t", element);
        }
        System.out.println();

    }
}
