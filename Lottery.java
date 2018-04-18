import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số: ");
        int number = scanner.nextInt();
        int random = (int) Math.round(Math.random() * 10);
        System.out.println("Số may mắn là :" + random);
//        int random = 56;

        //tách số nhập vào
        int reverse = 0;
        int number_b = number % 10;
        reverse = reverse * 10 + number_b;
        int number_a = (number / 10);

        //Tách số random
        int random_d = (random / 10);
        int random_e = random % 10;

        if (number == random) {
            System.out.println("Bạn đã trúng 10000$");
        } else if (reverse == random) {
            System.out.println("Bạn đã trúng 3000$");
        } else if (number_a == random_e || number_a == random_d || number_b == random_e || number_b == random_d) {
            System.out.println("Bạn đã trúng 1000$");
        } else {
            System.out.println("Rất tiếc bạn không trúng thưởng");
        }
    }
}
