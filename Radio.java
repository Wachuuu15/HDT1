public interface Radio{

    public void encenderApagar();
    
    public boolean comprobarEncendido();

    public String guardarEmisoraActual(numBoton);
  
    public String seleccionarEmisoraGuardada(numBoton);
  
    public String cambiarSenal(opcion);
  
    public boolean getTipoSenal();
  
    public void subirEmisora();

    public void bajarEmisora();
  
    public float getEmisoraActual();
    
}
