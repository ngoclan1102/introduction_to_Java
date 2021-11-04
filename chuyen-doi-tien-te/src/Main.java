import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien USD : ");
        int usd = scanner.nextInt();
        int vnd = 23000;
        int money = usd * vnd;
        System.out.println(vnd + " VND " + "bang " + money + " USD");
    }
}
