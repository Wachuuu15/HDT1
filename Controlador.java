public class Controlador implements Radio{
    
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

        public boolean isEncendido() {
            return encendido;
        }

        public void setEncendido(boolean encendido) {
            this.encendido = encendido;
        }

        public void setTipoSenal(boolean tipoSenal) {
            this.tipoSenal = tipoSenal;
        }

        public float getAMactual() {
            return AMactual;
        }

        public void setAMactual(float aMactual) {
            AMactual = aMactual;
        }

        public float getFMactual() {
            return FMactual;
        }

        public void setFMactual(float fMactual) {
            FMactual = fMactual;
        }

        public String[] getEmisorasGuardadas() {
            return emisorasGuardadas;
        }

        public void setEmisorasGuardadas(String[] emisorasGuardadas) {
            this.emisorasGuardadas = emisorasGuardadas;
        }

        public String getNumBoton() {
            return numBoton;
        }

        public void setNumBoton(String numBoton) {
            this.numBoton = numBoton;
        }

        public boolean isOpcion() {
            return opcion;
        }

        public void setOpcion(boolean opcion) {
            this.opcion = opcion;
        }


        @Override
        public void encenderApagar() {
            if(encendido == true){
                setEncendido(false);
            }
            else{
                setEncendido(true);
            }
            
        }

        @Override//pa que sirve esta onda no enetendí si ya sabes que esta encendido)?
        public boolean comprobarEncendido() {
            boolean estado = false;
            if(encendido == true){
                estado = false;
            }
            else{
                estado = true;
            }

            return estado;
        }

        @Override
        public String guardarEmisoraActual(int numBoton) {

            if(tipoSenal == true){
                emisorasGuardadas[numBoton] = String.valueOf(AMactual);
            }
            else{
                emisorasGuardadas[numBoton] = String.valueOf(FMactual);
            }

            return "A guardado la emisora en el boton " + numBoton + "correctamente";
        }

        @Override
        public String seleccionarEmisoraGuardada(int numBoton) {
            float em = 0;
            if(tipoSenal == true){
                AMactual = Float.valueOf(emisorasGuardadas[numBoton]);
                em = AMactual;
            } else {
                FMactual = Float.valueOf(emisorasGuardadas[numBoton]);
                em = FMactual;
            }
            return "Usted a puesto la emisora " + em;
        }

        @Override
        public String cambiarSenal(boolean opcion) {
            if(tipoSenal == true){

                opcion = false;

            } else if(tipoSenal == false){

                opcion = true;

            }
            return "A cambido exitosamente la señal";
        }

        @Override
        public boolean getTipoSenal() {
            return this.tipoSenal;
        }

        @Override
        public void subirEmisora() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void bajarEmisora() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public float getEmisoraActual() {
            // TODO Auto-generated method stub
            return 0;
        }
    
}
