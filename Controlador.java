public class Controlador{
    
        private boolean encendido; // Determina el estado de la radio, true (encendido) y false (apagado). 
        private boolean tipoSenal; //(true: AM, false: FM);
        private float AMactual;
        private float FMactual;
        private String[] emisorasGuardadas;
        private String numBoton;
        private boolean opcion;
        
        public Controlador(){
        this.encendido = true;
        this.tipoSenal = true;
        this.AMactual = 0;
        this.FMactual = 0;
        this.emisorasGuardadas[12] = "";
        this.numBoton = "";
        this.opcion = true;
    }
        
    
}
