package Array;
import java.util.Scanner;
public class Array1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so phan tu cua mang: ");
    int n = sc.nextInt();
    int a[] = new int [n];
    int max = a[0];
    int sum = 0;
   for (int i = 0;i<n;i++) {
	   System.out.print("Nhap phan tu thu"+ (i+1)+": ");
	   a[i] = sc.nextInt();
   }
   for(int i = 0;i<n;i++) {
	   System.out.print(a[i] + " ");
   }
   for(int i = 0;i < n;i++) 
	   if (max < a[i]) 
		   max = a[i];
   for(int i = 0;i < n;i++) 
	    sum += a[i];
  
 System.out.println();
 System.out.println("So lon nhat trong mang la: "+max);
 System.out.println("Tong cua cac phan tu trong mang la: "+sum);
 System.out.println("Cac so chan trong mang la: ");
 for(int i = 0;i < n;i++)
	    if(a[i]%2==0)
	    	System.out.print(a[i]+" ");
 System.out.println();       
 System.out.println("Nhap vao so k: ");
 int cnt = 0;
 int k = sc.nextInt();
 for(int i = 0;i < n;i++)
	 if(a[i]==k) 
		 System.out.print(a[i]+" ");
         cnt ++;
System.out.println(); 
System.out.println("So k xuat hien voi so lan la: "+cnt);
for(int i = 0;i < n;i++)
	for(int j = i+1;j < n;j++)
            if (a[i]>a[j]) {
            	int tmp = a[i];
            	a[i] = a[j];
            	a[j] = tmp;
            }
 System.out.println("Mang sau khi da sap xep la: ");
 for(int i = 0;i < n;i++) {
	 System.out.print(a[i] + " ");
 }
 }
 	
}
 

