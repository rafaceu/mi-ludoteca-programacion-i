package dominio;

public class VideojuegoOnline extends Videojuego {
    private int numeroJugadoresOnline;

    public VideojuegoOnline(String titulo, String plataforma, int puntuacion, int horasJugadas, int numeroJugadoresOnline) {
        super(titulo, plataforma, puntuacion, horasJugadas);
        this.numeroJugadoresOnline = numeroJugadoresOnline;
    }

    public int getNumeroJugadoresOnline() {
        return numeroJugadoresOnline;
    }

    public void setNumeroJugadoresOnline(int numeroJugadoresOnline) {
        this.numeroJugadoresOnline = numeroJugadoresOnline;
    }

    public String toString() {
        return super.toString() + " | Jugadores Online: " + numeroJugadoresOnline;
    }
}