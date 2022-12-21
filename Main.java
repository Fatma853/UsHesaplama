import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
    int n, k;
    Scanner input= new Scanner(System.in);
    System.out.println("Üssü alınacak sayıyı giriniz: ");
    n= input.nextInt();
    System.out.println("Üs olacak sayıyı giriniz: ");
    k= input.nextInt();
    long total=1; 

    for (int i =1 ; i<=k ; i++) {
      total= total * n ;
    }
    System.out.println("Sonuç: " + total);
  }
}