import java.util.Scanner;

class HomeTest {
    public static void main(String[] args) {
        ExExeption ex = new ExExeption();

        System.out.println("Ввыедите число");


        Scanner chislo = new Scanner(System.in);
        String x = chislo.next();

        int b = ex.validNumber(x);

      //  int z = b + 80;

        System.out.println(b);



    }
}