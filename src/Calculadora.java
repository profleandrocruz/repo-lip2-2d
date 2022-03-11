import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		double valor1 = 10;
		double valor2 = 5;
		double resultSoma = valor1 + valor2;
		
		JOptionPane.showMessageDialog(null,
		"A soma de " + valor1 + " com " + valor2
		+ " é igual a " + resultSoma);

	}

}
