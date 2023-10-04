import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Mükemmel Sayı Sorgulama Programı");
        int n,total=0;
        Scanner inp= new Scanner(System.in);
        System.out.print("Sorgulamak istediğiniz sayıyı giriniz :");
        n = inp.nextInt();
        for(int i = 1; i < n; i++){
            if(n%i==0){
                total+=i;
            }
        } if (total==n){
            System.out.println(n+" Sayısı Bir Mükemmel Sayıdır.");
        }else{
            System.out.println(n+" Sayısı Bir Mükemmel Sayı Değildir.");
        }
    }
}