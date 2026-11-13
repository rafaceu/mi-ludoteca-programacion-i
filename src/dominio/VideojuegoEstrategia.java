package dominio;

public class VideojuegoEstrategia extends Videojuego {
    private int numeroFacciones;

    public VideojuegoEstrategia(String titulo, String plataforma, int puntuacion, int horasJugadas, int numeroFacciones) {
        super(titulo, plataforma, puntuacion, horasJugadas);
        this.numeroFacciones = numeroFacciones;
    }

    public int getNumeroFacciones() {
        return numeroFacciones;
    }

    public void setNumeroFacciones(int numeroFacciones) {
        this.numeroFacciones = numeroFacciones;
    }

    public String toString() {
        return super.toString() + " | Facciones: " + numeroFacciones;
    }
}
