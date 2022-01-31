/**
 * 
 */


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
            //System.out.println("");
            System.out.println("\nBienvenido a Radio la buena buena");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Encender/apagar");
            System.out.println("2. Cambia de AM a FM a AM");
            System.out.println("3. Avanzar en el dial de las emisoras"); //aun no entiendo que pedo se hace aqui)? xd
            System.out.println("4. Permite guardar una emisora en uno de los 12 botones"); //guardar emisora en un boton
            System.out.println("5. Permite seleccionar la emisora puesta en un botón");//seleccionar boton
            System.out.println("6. Apagar la Radio\n");

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
                c.FM_AM();
                break;

                case 3:

                case 4:

                case 5:
                if (c.getStatus() == false){
                    System.out.println("Encender la radio");

                }else{
                    System.out.println("¿Qué botón desea?");
                    int toca = input.nextInt();
                    input.nextLine();
                    if( (c.getSavedFreqFM(toca) > 0 ) || (c.getSavedFreqAM(toca) > 0)  ) {
                        if( c.getActualMode() == 1) {
                            System.out.println("La emisora favorita elegida es >> " + cRadio.getSavedFreqFM( toca) );
                        }else {
                            System.out.println("La emisora favorita elegida es >> " + cRadio.getSavedFreqAM( toca ));
                        }
                    }else {
                        System.out.println(" No hay emisoras guardadas aun ");
                    }
                             
                    
                }
            
                default:
                    break;

                case 6:
                System.out.println("\nRadio Apagada\n");
                salir = true;
            }

        }
        
        
        sc.close();
        

    }
}
