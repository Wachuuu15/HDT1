public interface Radio{

    public void encenderApagar();
    
    public boolean comprobarEncendido();

    public String guardarEmisoraActual(int numBoton);
  
    public String seleccionarEmisoraGuardada(int numBoton);
  
    public String cambiarSenal(boolean opcion);
  
    public boolean getTipoSenal();
  
    public void subirEmisora();

    public void bajarEmisora();
  
    public float getEmisoraActual();
    
}
