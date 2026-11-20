package dominio;

public class VideojuegoDeportivo extends Videojuego {
    private String deporte;

    public VideojuegoDeportivo(String titulo, String plataforma, int puntuacion, int horasJugadas, String deporte) {
        setTitulo(titulo);
        setPlataforma(plataforma);
        setPuntuacion(puntuacion);
        setHorasJugadas(horasJugadas);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    @Override 
    public String toString() {
        return toString() + " | Deporte: " + deporte;
    }
}