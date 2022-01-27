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

        public boolean isTipoSenal() {
            return tipoSenal;
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
            // TODO Auto-generated method stub
            
        }

        @Override
        public boolean comprobarEncendido() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public String guardarEmisoraActual() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public String seleccionarEmisoraGuardada() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public String cambiarSenal() {
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
