package ra.session04;

public class String_Demo {
    public static void main(String[] args) {
        //1. Khởi tạo chuỗi bằng literal --> immutable
        String str1 = "Rikkei Academy";
        String str2 = "Học viện Rikkei";
        String str3 = "Rikkei Academy";//str1 và str3 cùng trỏ đến 1 vùng nhớ lưu trữ Rikkei Academy trong String Pool
        //2. Khởi tạo chuỗi từ constructor của lớp String
        String str4 = new String("Rikkei Academy");
        String str5 = new String("Rikkei Academy");//str4 và str5 trỏ đến 2 vùng nhớ khác nhau trong heap
        //3. str1.equals(str2): so sánh 2 chuỗi str1 và str2: so sánh giá trị 2 chuỗi
        System.out.println("So sánh 2 chuỗi str1 và str3 với equals: " + str1.equals(str3));
        System.out.println("So sánh 2 chuỗi str1 và str4 với equals: " + str1.equals(str4));
        System.out.println("So sánh 2 chuỗi str4 và str5 với equals: " + str4.equals(str5));
        System.out.println("So sánh 2 chuỗi str1 và str2 với equals: " + str1.equals(str2));
        //So sánh == là so sánh địa chỉ ô nhớ
        System.out.println("So sánh 2 chuỗi str1 và str3 với ==: " + (str1 == str3));
        System.out.println("So sánh 2 chuỗi str4 và str5 với ==: " + (str4 == str5));
        System.out.println("So sánh 2 chuỗi str1 và str4 với ==: " + (str1 == str4));
        //int length(): trả ra độ dài chuỗi
        System.out.println("Độ dài chuỗi str1 là: " + str1.length());
        //char str.charAt(int index): trả ra ký tự tại chỉ số index
        System.out.println("Ký tự có chỉ số 2 trong str1 là: " + str1.charAt(2));
        //String str1.concat(str2): nối 2 chuỗi str1 và str2
        System.out.println("Nối 2 chuỗi str1 và str2: " + str1.concat(" - ".concat(str2)));
        //String str.toUpperCase(): Viết hoa các ký tự trong chuỗi
        System.out.println("Viết hoa chuỗi str1: " + str1.toUpperCase());
        //String str.toLowerCase(): Viết thường các ký tự trong chuỗi
        System.out.println("Viết thường chuỗi str1: " + str1.toLowerCase());
        //String str.trim(): Xóa khoảng trắng (space) 2 đầu chuỗi
        String str6 = "             Rikkei Academy           ";
        System.out.println("Cắt khoảng trắng 2 đầu str6: " + str6.trim());
        //boolean str1.equalsIgnoreCase(str2): so sánh giá trị str1 và str2 không phân biệt hoa thường
        String str7 = "RiKKeI aCADemy";
        System.out.println("So sánh str1 và str7 không phân biệt hoa thường: " + str1.equalsIgnoreCase(str7));
        //int str1.compareTo(str2): trả về độ chênh theo bảng mã ASCCI
        String str8 = "ABCD";
        String str9 = "ABDC";
        System.out.println("So sánh str8 và str9 với compareTo: " + str8.compareTo(str9));
        //boolean str1.contains(str2): Kiểm tra chuỗi str1 có chứa chuỗi str2 hay không
        String str10 = "Học viện Rikkei Academy đào tạo CNTT chất lượng Nhật Bản";
        System.out.println("Kiểm tra str10 có chứa str1 hay không: " + str10.contains(str1));
        //int str1.indexOf(str2): trả ra chỉ số của chuỗi str2 trong chuỗi str1
        System.out.println("Chỉ số chuỗi str1 trong chuỗi str10 là: " + str10.indexOf(str1));
        //String str1.replace(oldStr, newStr): thay thế chuỗi oldStr thành newString trong str1
        System.out.println("Thay thế chuỗi Academy thành Học viện trong chuỗi str1: "
                + str1.replace("Academy", "Học viện"));
        //boolean str1.startWith(str2): Kiểm tra chuỗi str1 bắt đầu là chuỗi str2 hay không
        System.out.println("Kiểm tra chuỗi str1 có phải bắt đầu là Rikkei hay không: "
                + str1.startsWith("Rikkei"));
        //String[] str.split("delimiter"): cắt chuỗi str thành các chuỗi con theo chuỗi delimiter
        String[] arrString = str2.split(" ");
        System.out.println("Các chuỗi con sau khi cắt:");
        for (String element : arrString) {
            System.out.println(element);
        }
        //String str.subString(int index): cắt chuỗi từ vị trí index đến cuối
        System.out.println("Cắt chuỗi str1 từ vị trí thứ 7: "+str1.substring(7));
        //String str.subString(int beginIndex, int endIndex): cắt chuỗi từ vị trí beginIndex đến vị trí endIndex-1
        System.out.println("Cắt chuỗi str1 từ vị trí 0 đến vị trí 5: "+str1.substring(0,6));

    }
}
