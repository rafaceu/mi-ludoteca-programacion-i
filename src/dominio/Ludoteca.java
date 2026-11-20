package dominio;

import java.util.ArrayList;

public class Ludoteca {
    private ArrayList<Videojuego> videojuegos;

   public Ludoteca() {
       this.videojuegos = new ArrayList<>();
    }

    public void agregar(Videojuego juego) {
        videojuegos.add(juego);
    }
    public void listar() {
        if (videojuegos.isEmpty()) {
            System.out.println("La ludoteca está vacía.");
        } else {
            for (Videojuego v : videojuegos) {
                System.out.println(v.toString());
            }
        }
    }

    public String toString() {
        String resultado = "";
        for (Videojuego v : videojuegos) {
            resultado = resultado + v.toString() + "\n";
        }
        return resultado;
    }

    public Videojuego buscarPorTitulo(String tituloBuscado) {
        for (Videojuego v : videojuegos) {
            if (v.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                return v;
            }
        }
        return null;
    }
}

public double calcularPuntuacionMedia() {
        if (videojuegos.isEmpty()) {
            return 0.0;
        }
        
        int suma = 0;
        for (Videojuego v : videojuegos) {
            suma += v.getPuntuacion();
        }
        return (double) suma / videojuegos.size();
    }
    public Videojuego obtenerMejorValorado() {
        if (videojuegos.isEmpty()) {
            return null;
        }

        Videojuego mejor = videojuegos.get(0);
        for (Videojuego v : videojuegos) {
            if (v.getPuntuacion() > mejor.getPuntuacion()) {
                mejor = v;
            }
        }
        return mejor;
    }

