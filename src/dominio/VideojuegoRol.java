package dominio;

public class VideojuegoRol extends Videojuego {
    private int numeroMisiones;

    public VideojuegoRol(String titulo, String plataforma, int puntuacion, int horasJugadas, int numeroMisiones) {
        super(titulo, plataforma, puntuacion, horasJugadas);
        this.numeroMisiones = numeroMisiones;
    }

    public int getNumeroMisiones() {
        return numeroMisiones;
    }

    public void setNumeroMisiones(int numeroMisiones) {
        this.numeroMisiones = numeroMisiones;
    }
    
    public String toString() {
        return super.toString() + " | Misiones: " + numeroMisiones;
    }
}
