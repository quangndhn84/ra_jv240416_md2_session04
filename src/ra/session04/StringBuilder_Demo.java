package ra.session04;

public class StringBuilder_Demo {
    public static void main(String[] args) {
        //1. Khởi tạo chuỗi StringBuilder
        StringBuilder strBuilder = new StringBuilder("Rikkei Academy");
        //2. append(String str): nối 2 chuỗi
        System.out.println("Nối chuỗi: "+strBuilder.append(" - Học viện đào tạo CNTT"));
        //3. insert(int offset, String str): chèn chuỗi str vào từ vị trí offset
        System.out.println("Chèn chuỗi: "+strBuilder.insert(0,"Học viện "));
        //4. delete(int startIndex, int endIndex): xóa từ startIndex đến endIndex-1
        System.out.println("Xóa ký tự: "+strBuilder.delete(0,8));
        //5. reverse(): đảo ngược chuỗi
        StringBuilder str1 = new StringBuilder("ABCD");
        System.out.println("Đảo ngược chuỗi: "+str1.reverse());
    }
}
