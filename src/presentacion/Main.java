package presentacion;

import dominio.Ludoteca;
import dominio.Videojuego;

public class Main {
    public static void main(String[] args) {
        Ludoteca miLudoteca = new Ludoteca();

        Videojuego j1 = new Videojuego("Zelda", "Nintendo Switch", 95, 50);
        Videojuego j2 = new Videojuego("Minecraft", "PC", 90, 120);
        Videojuego j3 = new Videojuego("Hollow Knight", "PC", 92, 40);

        miLudoteca.agregar(j1);
        miLudoteca.agregar(j2);
        miLudoteca.agregar(j3);

        System.out.println("--- LISTA DE JUEGOS ---");
        System.out.println(miLudoteca);

        System.out.println("--- BUSCANDO JUEGO EXISTENTE ---");
        Videojuego encontrado = miLudoteca.buscarPorTitulo("Minecraft");
        if (encontrado == null) {
            System.out.println("No se ha encontrado.");
        } else {
            System.out.println("Encontrado: " + encontrado);
        }

        System.out.println("--- BUSCANDO JUEGO INEXISTENTE ---");
        Videojuego noEncontrado = miLudoteca.buscarPorTitulo("Cyberpunk");
        if (noEncontrado == null) {
            System.out.println("El juego no está en la ludoteca.");
        } else {
            System.out.println("Encontrado: " + noEncontrado);
        }
    }
}
