package dominio;

public class VideojuegoDeportivo extends Videojuego {
    private String deporte;

    public VideojuegoDeportivo(String titulo, String plataforma, int puntuacion, int horasJugadas, String deporte) {
        super(titulo, plataforma, puntuacion, horasJugadas);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String toString() {
        return super.toString() + " | Deporte: " + deporte;
    }
}