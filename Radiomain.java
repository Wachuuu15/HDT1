import java.util.Scanner;

public class Radiomain{

    public static void main(String[] args) {
        /**
         * Aqui se crea las variables
         */
        boolean salir =false;
        Scanner sc = new Scanner(System.in);
        Controlador c = new Controlador();
        int ask = 0;

        while (salir==false) 
        {
            System.out.println("Bienvenido a Radio la buena buena");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Encender/apagar");
            System.out.println("2. Cambia de AM a FM a AM");
            System.out.println("3. Avanzar en el dia de las emisoras"); 
            System.out.println("4. Permite guardar una emisora en uno de los 12 botones");
            System.out.println("5. Permite seleccionar la emisora puesta en un botón");

            try {
                ask = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Ingrese un numero");
            }
            switch (ask) {
                case 1:
                c.encenderApagar();
                System.out.println("Realizado con éxito");
                    break;

                case 2:
                c.FM_AM();
                break;
            
                default:
                    break;
            }

        }
        
        
        sc.close();
        

    }
}
