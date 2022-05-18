package ejemplosInicialesJAVA;

public class IfElseSimple {
    public static void main(String[] args) {
        int num;

        System.out.println("Introduce un n�mero entero");
        num=Entrada.entero();

        if (num>=0){
            System.out.println("El n�mero es positivo");
        }
        else
        {
            System.out.println("El n�mero es negativo");
            System.out.println("Hemos entrado en el else");
        }

	/* Cuando las estructuras if o bucles contienen una sola l�nea, no se necesitan las llaves {}
		a�n as�, las pondremos para el ejemplo */

    }
}
