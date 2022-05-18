package ejemplosInicialesJAVA;

public class EjemploEntrada {
    public static void main(String[] args) {

        int numEnt;  //ENTERO numEnt
        double numReal1;  //REAL numReal1
        float numReal2;   //REAL numReal2
        char carac;       //CARACTER carac
        String cad;       //CADENA cad

        //ESCRIBIR "Introduzca un n�mero entero"
        System.out.println("Introduzca un n�mero entero:");
        numEnt=Entrada.entero(); //LEER numEnt

        System.out.println("Introduzca un n�mero real:");
        numReal1=Entrada.real();

        System.out.println("Introduzca otro n�mero real:");
        numReal2=(float)Entrada.real();

        System.out.println("Introduzca un caracter:");
        carac=Entrada.caracter();

        System.out.println("Introduzca una cadena:");
        cad=Entrada.cadena();

        System.out.println("Ha introducido "+numEnt+" como n�mero entero\n"+
                +numReal1+" como n�mero real1\n"
                +numReal2+" como n�mero real2\n"
                +carac+" como caracter\n"
                +cad+" como cadena");

    }
}
