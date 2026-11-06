package dominio;

import java.util.ArrayList;

public class Ludoteca {
    public ArrayList<Videojuego> videojuegos;

    public Ludoteca() {
        videojuegos = new ArrayList<>();
    }

    public void agregar(Videojuego juego) {
        videojuegos.add(juego);
    }

    public String toString() {
        String resultado = "";
        for (Videojuego j : videojuegos) {
            resultado = resultado + j.toString();
        }
        return resultado;
    }

    public Videojuego buscarPorTitulo(String tituloBuscado) {
        for (Videojuego j : videojuegos) {
            if (j.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                return j;
            }
        }
        return null;
    }
}
