package Core;

import java.util.Scanner;

public class Buoi1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		int n = sc.nextInt();
		Buoi1.PtBac2(a,b,c);
		Buoi1.Gt(n);
		for(int i = 1;i<n;i++){
			System.out.println(Buoi1.fiBo(i)+ " ");
		}
		

	}

  public static void PtBac2(float a,float b,float c){
		 if (a==0){
           if(b==0){
						System.out.println("Pt vo nghiem ");
					 }
					 else{
						 System.out.println("Nghiem cua phuong trinh la: "+(-c/b) );
					 }
					 return;
		 }
		 float delta = (float) (Math.pow(b,2) - 4*a*c);
     float x1 ;
		 float x2 ;
		 if(delta > 0 ){
			 x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
       x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			 String s = String.format("Pt co 2 nghiem phan biet va nghiem cua no la : x1 = %f, x2 = %f",x1,x2);
			 System.out.println(s);
		 }
		 else if(delta ==0){
			float x = (-b)/(2*a);
			System.out.println("Pt co nghiem kep: x1 = x2 = "+ x);
		 }
		 else{
			System.out.println("Pt vo nghiem");
		 }
	}
	public static void Gt(int n){
		int s = 1;
    for (int i = 1; i < n; i++) {
      s *= i;
    }
    System.out.println(s);
	}
	public static long fiBo(int n){
		if (n < 0) {
      return -1;
    } else if (n == 0 || n == 1) {
      return n;
    } else {
      return fiBo(n - 1) + fiBo(n - 2);
    }
  }
	}

