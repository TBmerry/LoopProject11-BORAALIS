import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, summ = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sorgulamak İstediğiniz Sayıyı Seçiniz : ");
        a = input.nextInt();

        for (int i = a-1; i >= 1; i--){
            if (a%i == 0){
                summ += i;
            }
        }
        if (summ == a){
            System.out.println("Mükemmel sayıyı buldunuz!");
        }else {
            System.out.println("Bu bir mükemmel sayı değildir!");
        }
    }
}