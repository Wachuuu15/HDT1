import java.util.Scanner;

public class Radiomain{

    public static void main(String[] args) {
        /**
         * Aqui se crea las variables
         */
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        Controlador c = new Controlador();
        int ask = 0;

        while (salir != true) 
        {
            System.out.println("\nBienvenido a Radio la buena buena");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Encender / Apagar");
            System.out.println("2. Cambia de AM a FM / Viceversa");
            System.out.println("3. Avanzar en el dial de las emisoras"); 
            System.out.println("4. Guardar Emisora");
            System.out.println("5. Seleccionar Emisora");

            try {
                ask = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("\nIngrese un numero\n");
            }
            switch (ask) {
                case 1:
                c.encenderApagar();
                System.out.println("\nRealizado con éxito\n");
                    break;

                case 2:

                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                break;
            }

        }
        
        
        sc.close();
        

    }
}
