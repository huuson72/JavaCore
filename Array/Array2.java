package Array;

import java.util.Scanner;
public class Array2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n;
    n = sc.nextInt();
    int a[] = new int[100];
     for(int i = 0 ;i<n;i++){
       a[i] = sc.nextInt();
     }
     System.out.println("Mang truoc khi xoa ");
     for(int i = 0 ;i<n;i++)
            System.out.print(a[i]+" ");
    //  int s = delete(a, n, 2);

    // System.out.println("Mang sau khi xoa ");
    // for(int i = k+1 ;i<n;i++)
    //    a[i-1] = a[i];
    // n--;
    // for(int i = 0 ;i<s;i++)
    //   System.out.print(a[i]+" ");
    // int k = deleteAdvance(a, n, 2);
    // System.out.println("Mang sau khi xoa so 2");
    // for(int i = 0 ;i < k;i++)
    //   System.out.print(a[i]+" ");
    // System.out.println();
    
    int s = InsertX(a, n, 2,1);
    System.out.println("Mang sau khi them so 2 vao vi tri 1");
    for(int i = 0 ;i<s;i++)
            System.out.print(a[i]+" ");


}

    
static int delete(int[] a, int n, int k) {
 
  // Xoa phan tu tai vi tri thu k
  for(int i = k+1 ;i<n;i++)
  a[i-1] = a[i];
return n-1;
}
//Them phan tu vao trong mang
static int InsertX(int a[], int n, int x, int k){ 
  ++n;
  for(int i=n-1;i>k;i--) 
    a[i]=a[i-1]; 
  a[k]=x;
  return n++;  
}
static int deleteAdvance(int[] arr,int n,int key){
  //Xoa phan tu key
  int pos = searchElement(arr, key);
  if (pos == -1) {
      System.out.println("Khong tim thay phan tu can xoa");
  }
  // Xoa phan tu
  for (int i = pos; i < n; i++) {
      arr[i] = arr[i + 1];
  }
  return n - 1;
}
static int searchElement(int[] arr, int x) {
  for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x)
          return i;
  }
  return -1;
}
}
