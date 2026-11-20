package dominio;

public class VideojuegoRol extends Videojuego {
    private int numeroMisiones;

    public VideojuegoRol(String titulo, String plataforma, int puntuacion, int horasJugadas, int numeroMisiones) {
        
        setTitulo(titulo);
        setPlataforma(plataforma);
        setPuntuacion(puntuacion);
        setHorasJugadas(horasJugadas);
        this.numeroMisiones = numeroMisiones;
    }

    public int getNumeroMisiones() {
        return numeroMisiones;
    }

    public void setNumeroMisiones(int numeroMisiones) {
        this.numeroMisiones = numeroMisiones;
    }
   @Override 
    public String toString() {
        return toString() + " | Misiones: " + numeroMisiones;
    }
}
