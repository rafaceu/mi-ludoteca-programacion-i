package dominio;

public class VideojuegoOnline extends Videojuego {
    private int numeroJugadoresOnline;

    public VideojuegoOnline(String titulo, String plataforma, int puntuacion, int horasJugadas, int numeroJugadoresOnline) {
        setTitulo(titulo);
        setPlataforma(plataforma);
        setPuntuacion(puntuacion);
        setHorasJugadas(horasJugadas);
        this.numeroJugadoresOnline = numeroJugadoresOnline;
    }

    public int getNumeroJugadoresOnline() {
        return numeroJugadoresOnline;
    }

    public void setNumeroJugadoresOnline(int numeroJugadoresOnline) {
        this.numeroJugadoresOnline = numeroJugadoresOnline;
    }
    public String toString() {
        return toString() + " | Jugadores Online: " + numeroJugadoresOnline;
    }
}