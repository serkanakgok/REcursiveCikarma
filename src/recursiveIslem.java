import java.util.Scanner;

public class recursiveIslem {
    static void islem(int number) {
        System.out.print(number + " ");
        if (number <= 0) {
            return;
        }
        islem(number - 5);
        if (number > 0) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = read.nextInt();
        islem(n);
    }
}
