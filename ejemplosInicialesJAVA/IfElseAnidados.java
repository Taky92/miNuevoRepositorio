package ejemplosInicialesJAVA;

public class IfElseAnidados {
    public static void main(String[] args) {
        int num;

        System.out.println("Introduce un n�mero entero");
        num=Entrada.entero();

        if (num > 0) {
            System.out.println("El n�mero es positivo");
        } else {
            if (num < 0) {
                System.out.println("El n�mero es negativo");
            } else {
                System.out.println("El n�mero es cero");
            }
            if (num == 33) {
                System.out.println("La edad de cristo");
            } else {
                System.out.println("No es la edad de cristo");
            }
        }
        // ...O tambi�n...

		/* if (num>0){
			System.out.println("El n�mero es positivo");
		}
		else {
			if(num<0){
				System.out.println("El n�mero es negativo");
			}
			else {
				System.out.println("El n�mero es cero");
			}

		}*/

    }
}
