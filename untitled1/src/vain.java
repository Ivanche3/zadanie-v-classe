import java.util.Scanner;
public class vain{
    public static void main(String[] args) {
        Scanner ivan_lox = new Scanner(System.in);
        System.out.println("Введите число");
        int a= ivan_lox.nextInt();
        if ( a < 0 ){
            System.out.println("Оно отрицательное");
        } else {
            System.out.println("Всё остальное");
        }
    }
}