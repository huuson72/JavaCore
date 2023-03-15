package Core;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 6;
    System.out.print("Giai thua thu n : 6 = ");
    Buoi2.Gt(n);

    float a = 2 , b= 3 , c = -5;
    Buoi2.PtBac2(a, b, c);
    System.out.println();
    System.out.printf( "Uoc so chung lon nhat cua 2 so a va b la: %.1f ",Buoi2.USCL(98, 56));
    System.out.println();
    System.out.printf( "Boi so chung lon nhat cua 2 so a va b la: %.1f ",Buoi2.BSCL(98, 56));
    System.out.println();
    System.out.printf("So fibo thu n la: %.1f ",Buoi2.fiBo(n) );
  }


  
}
