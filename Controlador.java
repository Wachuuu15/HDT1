public class Controlador implements Radio{
    
        private boolean encendido; // Determina el estado de la radio, true (encendido) y false (apagado). 
        private boolean tipoSenal; //(true: AM, false: FM);
        private float AMactual;
        private float FMactual;
        private String[] emisorasGuardadas = new String[12];
        private String numBoton;
        private boolean opcion;
        
        public Controlador(){
        this.encendido = true;
        this.tipoSenal = true;
        this.AMactual = 530;
        this.FMactual = 87.9f;
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
            double em = 0;
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
            if(opcion == true){
                tipoSenal = true;

            } else if(opcion == false){

                tipoSenal = false;

            }
            return "A cambido exitosamente la señal";
        }

        @Override
        public boolean getTipoSenal() {
            return this.tipoSenal;
        }

        @Override
        public void subirEmisora() {
            /**
             * tiposenal boolean true am y false si es fm
             * si es am emisora actual +10 true
             * false + 0.2 
             */

            if(tipoSenal == true){

                float A = getAMactual() + 10;
                setAMactual(A);
                if (getAMactual() == 1610);{
                    setAMactual(530);
                }

                //else if(){
               //     AMactual = AMactual + 10;
                //}

            } else if(tipoSenal == false){
                float F = getFMactual() + 0.2f;
                setFMactual(F);
                if (getFMactual() == 107.9){
                    setFMactual(87.9f);
                }
            }
            
        }
        

        @Override
        public void bajarEmisora() {
            /**
             * restar 10 
             * restar 0.2
             */
            if(tipoSenal == true){

                float A = getAMactual() - 10;
                setAMactual(A);
                if (getAMactual() == 530);{
                    setAMactual(1610);
                }

                //else if(){
               //     AMactual = AMactual + 10;
                //}

            } else if(tipoSenal == false){
                float F = getFMactual() - 0.2f;
                setFMactual(F);
                if (getFMactual() == 87.9){
                    setFMactual(87.9f);
                }
            }
            
            
        }

        @Override
        public float getEmisoraActual() {
            /**
             * si es fm o am 
             */
            float ma = 0;
            if(tipoSenal == true){
                ma = getAMactual();
            } else {
                ma = getFMactual();
            }
            
             
            return ma;
            
        }
    
}
