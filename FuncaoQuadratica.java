import java.util.Scanner;

public class FuncaoQuadratica {

	public static void main(String[] args) {

		double a, b, c, x, delta, X1, X2, raizUnica;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escolha o valor do coeficiente a que acompanhará x^2");
		a = teclado.nextDouble();
		if (a > 0) {
			System.out.println("A concavidade da eq. a ser desenvolvida é para cima, pois a>0");
		} else {
			System.out.println("A concavidade da eq. a ser desenvolvida é para baixo, pois a<0");

		}
		System.out.println("Escolha o valor do coeficiente b que acompanhará x");
		b = teclado.nextDouble();
		System.out.println("Escolha o valor do coeficiente c como termo independente");
		c = teclado.nextDouble();
		System.out.println("Resolver:" + a + "x^2 + " + b + "x + " + c);

		delta = (b * b) - (4 * a * c);
		System.out.println("Delta = " + delta);
		if (delta < 0) {
			System.out.println("A eq. não possui raízes reais");
		} else if (delta == 0) {
			System.out.println("A eq. possui uma única raíz");
			raizUnica = -b / (2 * a);
			System.out.println("A raíz única é:" + raizUnica);
		} else {
			System.out.println("A eq. possui duas raízes reais");

			X1 = (-b + Math.sqrt(delta)) / (2 * a);
			X2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("As raízes da eq. são:");
			System.out.println("X1 = " + X1);
			System.out.println("X2 = " + X2);

		}

	}

}
