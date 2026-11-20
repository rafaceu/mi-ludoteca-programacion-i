package dominio;

public class Videojuego {
    private String titulo;
    private String plataforma;
    private int puntuacion;
    private int horasJugadas;

public Videojuego(String titulo, String plataforma, int puntuacion, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.puntuacion = puntuacion;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
public String getPlataforma() {
        return plataforma;
    }

public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
}
public int getPuntuacion() {
    return puntuacion;
    } 
public void setPuntuacion(int puntuacion) {
        
        if (puntuacion >= 0 && puntuacion <= 100) {
            this.puntuacion = puntuacion;
        } else {
            this.puntuacion = 0; 
        }
    }
public int getHorasJugadas() {
        return horasJugadas;
    }

    public void setHorasJugadas(int horasJugadas) {
        if (horasJugadas >= 0) {
            this.horasJugadas = horasJugadas;
        } else {
            this.horasJugadas = 0;
        }
    }
    public String toString() {
        return  titulo + " // Plataforma: " + plataforma + " // Puntuación: " + puntuacion + " // Horas: " + horasJugadas;
    }
}

