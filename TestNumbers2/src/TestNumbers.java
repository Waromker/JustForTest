import java.util.Scanner;

public class TestNumbers {
    public static void main(String[] args) {

        System.out.println("Введите число!");
        Scanner chislo = new Scanner(System.in);

        String x = chislo.next();


        IsNumber number = new IsNumber();


        boolean b = number.isNumerics(x);

        if (b == true) {
         int a = new Integer(x);
            System.out.println("Вот и " + a);
        }else {
            String k = chislo.nextLine();
            System.out.println(k + " Это не число!");
        }




    }

}
