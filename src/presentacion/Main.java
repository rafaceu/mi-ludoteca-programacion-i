package presentacion;

import dominio.Ludoteca;
import dominio.VideojuegoRol;

public class Main {
    public static void main(String[] args) {
        Ludoteca miLudoteca = new Ludoteca();

        miLudoteca.agregar(new VideojuegoRol("GTA VI ", "PS5", 10, 15, 50));
        miLudoteca.agregar(new VideojuegoRol("Fortnite", "PC", 8, 600, 30));

        System.out.println("===LISTA DE VIDEOJUEGOS===");
        miLudoteca.listar();

        System.out.println("\nPuntuación media: " + miLudoteca.calcularPuntuacionMedia());

        System.out.println("\n===VIDEOJUEGO MEJOR VALORADO===");
        System.out.println(miLudoteca.obtenerMejorValorado().toString());

        System.out.println("\n===BUSCAR VIDEOJUEGO===");
        System.out.println(miLudoteca.buscarPorTitulo("The Witcher 3").toString());
    }
}