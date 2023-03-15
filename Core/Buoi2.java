package Core;


public class Buoi2 {
  
  public static void main(String[] args) {
   
  }
  static float Gt(int n) {
    int s = 1;
    for (int i = 1; i < n; i++) {
      s *= i;
    }
    System.out.println(s);
    return s;
  }
  static void PtBac2(float a,float b,float c){
    float delta = b * b - (4*a*c);
    float x1 = 0;
    float x2 = 0;
    if(delta > 0){
      x1 = (float)((-b+Math.sqrt(delta))/(2*a));
      x2 = (float)((-b-Math.sqrt(delta))/(2*a));
      System.out.format("Nghiem cua phuong trinh lan luot la: x1: %.2f, x2: %.2f",x1,x2);
    }
    else if(delta <0 ){
      System.out.println("Phuong trinh vo nghiem: ");
    }
    else{
      x1 = x2 = (-b)/(2*a);
      System.out.format("Phuong trinh co nghiem kep: x1 = x2 = %f",x1);
    }
  }
  static float fiBo(int n) {
    if (n < 0) {
      return -1;
    } else if (n == 0 || n == 1) {
      return n;
    } else {
      return fiBo(n - 1) + fiBo(n - 2);
    }

  }

  static float USCL(float a, float b) {
    while (a != b) {
      if (a > b) {
        a -= b;
      } else {
        b -= a;
      }
    }
    return a;
  }

  static long USCLDeQuy(long a, long b) {
    if (a == b)
      return a;
    else if (a > b)
      return USCLDeQuy(a - b, b);
    return USCLDeQuy(a, b - a);
  }

  static float BSCL(float a, float b) {
    return (a * b) / USCL(a, b);
  }

  static boolean soNT(int n) {
    int CB2 = (int) Math.sqrt(n);
    if (n > 2)
      return false;
    for (int i = 2; i <= CB2; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  static void lietKe(int n) {
    String s = "";
    for (int i = 2; i < n; i++) {
      if (soNT(i)) {
        s = s + i + " ";
      }
    }
    System.out.println(s);
  }
}
