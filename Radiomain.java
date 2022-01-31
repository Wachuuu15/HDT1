import java.util.Scanner;

public class Radiomain{

    public static void main(String[] args) {
        /**
         * Aqui se crea las variables
         */
        int salir = 0;
        Scanner sc = new Scanner(System.in);
        Controlador c = new Controlador();
        int ask = 0;
        int numBoton;
        boolean opcion = true;

        while (salir ==  0) 
        {
            System.out.println("\nBienvenido a Radio la buena buena");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Encender / Apagar");
            System.out.println("2. Cambia de AM a FM / Viceversa");
            System.out.println("3. Subir Emisora / Bajar Emisora"); 
            System.out.println("4. Guardar Emisora");
            System.out.println("5. Seleccionar Emisora");
            System.out.println("6. ver Emisora");
            System.out.println("7. Salir");

            try {
                ask = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("\nIngrese un numero\n");
            }
            switch (ask) {
                case 1:
                    c.encenderApagar();
                    if(c.isEncendido() == true){
                        System.out.println("\nLa radio esta encendida\n");
                    }else{
                        System.out.println("\nLa radio esta apagada\n");
                    }

                    break;

                case 2:
                   // boolean opcion;
                    System.out.println("1. AM   2. FM");
                    int M = sc.nextInt();
                    if(M == 1){
                        opcion = true;
                    } else if(M == 2){
                        opcion = false;
                    }
                    c.cambiarSenal(opcion);
                    if(c.isTipoSenal() == true){
                        System.out.println("\nLa radio esta en AM\n");

                    }else if(c.isTipoSenal() == false){
                        System.out.println("\nLa radio esta en FM\n");

                    }
                break;

                case 3:
                    int OP = 0;
                    while(OP == 0){
                        int opcion1;
                        System.out.println("Que desea hacer?");
                        System.out.println("1. Subir de Emisora");
                        System.err.println("2. Bajar de Emisora");
                        System.err.println("3. salir");
                        opcion1 = sc.nextInt();
                        
                        if(opcion1 == 1){
                            c.subirEmisora();
                        } else if(opcion1 == 2){
                            c.bajarEmisora();
                        } else if(opcion1 == 3){
                            OP = 1;
                        } 
                    }

                    

                break;

                case 4:
                    System.out.println("Ingrese un numero de boton");
                    numBoton = sc.nextInt();
                    c.guardarEmisoraActual(numBoton);


                break;

                case 5:
                    System.out.println("Ingrese un numero de boton");
                    numBoton = sc.nextInt();
                    c.seleccionarEmisoraGuardada(numBoton);
                    System.out.println(c.seleccionarEmisoraGuardada(numBoton));
                break;

                case 6:
                    System.out.println(c.getEmisoraActual());
                break;

                case 7:
                    salir = 1;
                break;
            }

        }
        
        
        sc.close();
        

    }
}
