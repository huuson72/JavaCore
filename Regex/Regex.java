package Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
public static void main(String[] args) {
	String str = "21T1020659"; // Chuỗi cần kiểm tra 10 ky tu
	String regexString = "\\w{10}";
	boolean result = str.matches(regexString); 
	System.out.println(result);
	//Chuoi kiem tra ma khau co it nhat 6 ky tu
	String str1 = "abcdef"; 
	String str2 = "abc1355";
	boolean result1 = str1.matches("\\w{6,}"); 
	boolean result2 = str2.matches("\\w{6,}"); 
	System.out.println(result1);
	System.out.println(result2);
	//Chuoi kiem tra ma khau co it nhat 8 ky tu
	String str3 = "abcdefvc"; 
	boolean result3 = str3.matches("\\w{8,}"); 
	System.out.println(result3);
	//Kiem tra chuoi chua 1 ky tu hoa
	String str4 = "Abcdefg"; // Chuỗi cần kiểm tra
	boolean result4 = str4.matches(".*[A-Z].*"); // Kiểm tra chuỗi có ít nhất 1 ký tự in hoa
	System.out.println(result4); // In kết quả kiểm tra ra màn hình
	
	String str5 = "Abcdefg"; // Chuỗi cần kiểm tra
	boolean result5 = str5.matches("[A-Z].*"); // Kiểm tra ký tự đầu tiên là in hoa
	System.out.println(result5); // In kết quả kiểm tra ra màn hình
	
	String str6 = "ABCDEf"; // Chuỗi cần kiểm tra
	boolean result6 = str6.matches(".*[a-z].*"); // Kiểm tra có ít nhất 1 ký tự thường
	System.out.println(result6); // In kết quả kiểm tra ra màn hình

	String str7 = "Abc123DEF"; // Chuỗi cần kiểm tra
	boolean result7 = str7.matches(".*\\d.*"); // Kiểm tra có ít nhất một chữ số
	System.out.println(result7); // In kết quả kiểm tra ra màn hình

	String str8 = "Abc#123DEF"; // Chuỗi cần kiểm tra
	boolean result8 = str8.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"); // Kiểm tra có ít nhất một ký hiệu đặc biệt
	System.out.println(result8); // In kết quả kiểm tra ra màn hình
}

}
