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
        int a = (number / 10);
        int b = number % 10;
        // chuỗi lấy số đảo ngược
        String c = b + "" + a;
        //ép kiểu sang int
        int reverse = Integer.parseInt(c);
        //Tách số random
        int d = (random / 10);
        int e = random % 10;

        if (number == random) {
            System.out.println("Bạn đã trúng 10000$");
        } else if (reverse == random) {
            System.out.println("Bạn đã trúng 3000$");
        } else if (a == e || a == d || b == e || b == d) {
            System.out.println("Bạn đã trúng 1000$");
        } else {
            System.out.println("Rất tiếc bạn không trúng thưởng");
        }
    }
}
