import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
       int number = scanner.nextInt();
        if (number >= 10) {
            while (number >= 10) {
                show(number / 100);
                number = number % 10;
            }
            show(number);
        }else {
            show(number);
        }
    }

    public static void show(int so) {
        switch (so) {
            case 0:
                System.out.print("không ");
                break;
            case 1:
                System.out.print("một ");
                break;
            case 2:
                System.out.print("hai ");
                break;
            case 3:
                System.out.print("ba ");
                break;
            case 4:
                System.out.print("bốn ");
                break;
            case 5:
                System.out.print("năm ");
                break;
            case 6:
                System.out.print("sáu ");
                break;
            case 7:
                System.out.print("bảy ");
                break;
            case 8:
                System.out.print("tám ");
                break;
            case 9:
                System.out.print("chín ");
                break;
        }
    }
}
