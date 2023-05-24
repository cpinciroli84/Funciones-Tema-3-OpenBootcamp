// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       System.out.println("suma(5,7,21)");
       System.out.println(suma(5,7,21));

        Coche miCoche = new Coche();
        System.out.println("miCoche");
        miCoche.agregarPuerta();
        System.out.println("puertas:");
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c){
            return a + b + c;
    }
}

class Coche{
    public int puertas = 0;

    public void agregarPuerta(){
        this.puertas++;
    }

}
