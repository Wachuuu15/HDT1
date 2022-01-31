public class Controlador implements Radio{
    
        private boolean encendido = false; // Determina el estado de la radio, true (encendido) y false (apagado). 
        private boolean tipoSenal; //(true: AM, false: FM);
        private boolean am; //hice cambios
        private boolean fm; //hice cambios
        private String[] emisorasGuardadas = new String[12];
        private String numBoton;
        private boolean opcion;
        private boolean estado; 
        private int estacionActualAM; 
        private int estacionActualFM;
        
        public Controlador(){
        this.encendido = true;
        this.tipoSenal = true;
        estado = false;
        estacionActualAM = 530;
        estacionActualFM = 87.9;
        /**this.am = 0;
        this.fm = 0;*/
        //this.emisorasGuardadas[12] = "";
        this.numBoton = "";
        this.opcion = true;
    }

        public boolean getStatus(){
            return opcion;
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

        public int getSavedFreqAM(int slot) {
        
            if(radiosFavAM.get(slot - 1)  != null) {
    
                estacionActualAM = radiosFavAM.get(slot - 1);
                return radiosFavAM.get(slot - 1);
            }else {
                return -1;
            }    
          }    

          public void saveInFM(int slot, double freq) {
            if(radiosFavAM.size() == 0){
                for(int i=0; i<11; i++){
                radiosFavFM.add(null);
              }
            }
            radiosFavFM.set(slot - 1, freq);
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


        public int getActualMode() {
            return transmision;
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
            if(tipoSenal == true){

                System.out.println("Emisora recien guardada" + emisorasGuardadas[numBoton]);

            } else {
             
                System.out.println("Emisora recien guardada" + emisorasGuardadas[numBoton]);
            }
            return null;
        }

        @Override
        public String cambiarSenal(boolean opcion) {
            if(tipoSenal == true){

                opcion = false;

            } else if(tipoSenal == false){

                opcion = true;

            }
            return null;
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
