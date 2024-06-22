package ra.session04;

import java.util.regex.Pattern;

public class Regex_Demo {
    public static void main(String[] args) {
        //Validate mật khẩu phải gồm 6 ký tự gồm ký tự thường hoặc hoa hoặc số
        String passwordRegex = "[a-zA-Z0-9]{6}";
        String password = "a*min1";
        System.out.println("Kết quả so khớp: "+ Pattern.matches(passwordRegex,password));
        System.out.println("So khớp 1: "+Pattern.matches("J.va","Jvva"));
        System.out.println("So khớp 2: "+Pattern.matches("J[ab|mn]va","Jbva"));
        System.out.println("So khớp 3: "+Pattern.matches("J[abcd]va","Jdva"));
    }
}
