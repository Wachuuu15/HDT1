public class Controlador implements Radio{
    
        private boolean encendido = false; // Determina el estado de la radio, true (encendido) y false (apagado). 
        private boolean tipoSenal; //(true: AM, false: FM);
        private boolean am; //hice cambios
        private boolean fm; //hice cambios
        private String[] emisorasGuardadas;
        private String numBoton;
        private boolean opcion;
        
        public Controlador(){
        this.encendido = true;
        this.tipoSenal = true;
        /**this.am = 0;
        this.fm = 0;*/
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

        public boolean isTipoSenal() {
            return tipoSenal;
        }

        public void setTipoSenal(boolean tipoSenal) {
            this.tipoSenal = tipoSenal;
        }

        public boolean getam() {
            return this.am;
        }

        public void setam(boolean am) {
            this.am = am;
        }

        public boolean getFm() {
            return this.fm;
        }

        public void setFm(boolean fm) {
            this.fm = fm;
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


        public boolean FM_AM(){
            if (fm == false || am == true) {
              fm = true;
              am = false;
            } else if (am == false || fm == true){
              am = true;
              fm = false;
            }
            return am;
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
                emisorasGuardadas[numBoton] = String.valueOf(am);
            }
            else{
                emisorasGuardadas[numBoton] = String.valueOf(fm);
            }

            return "A guardado la emisora en el boton " + numBoton + "correctamente";
        }

        @Override
        public String seleccionarEmisoraGuardada(int numBoton) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public String cambiarSenal(boolean opcion) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean getTipoSenal() {
            // TODO Auto-generated method stub
            return false;
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
