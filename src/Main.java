import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int n = inp.nextInt();

        int total = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                if(n % i == 0){
                    total += i;
                }
            }
        }
            if(total == n){
                System.out.println(n + " Sayısı Mükemmel Bir Sayıdır.");
            }else{
                System.out.println(n + " Sayısı Mükemmel Bir Sayı Değildir.");
            }
        }
    }
