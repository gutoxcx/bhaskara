import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        // equação exemplo:  2x ao quadrado - 7x + 3 = 0.
        // delta = b^2 - 4*a*c
        double a, b, c;
        System.out.print("Digite os valores de a, b e c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double delta = Math.pow(b, 2.0) - 4*a*c;
        System.out.println("O valor de delta é: " + delta);

        //bhaskara -> x(1 e 2) = (-b +- raiz de delta (se for maior que 0)
        if (delta > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes de bhaskara são: %.2f e %.2f%n", x1, x2);
        } else {
            System.out.println("Não há raízes bhaskara, pois delta é maior ou igual a 0.");
        } input.close();
    }
}
