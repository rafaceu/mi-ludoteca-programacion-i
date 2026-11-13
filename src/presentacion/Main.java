package presentacion;

import dominio.Ludoteca;
import dominio.VideojuegoRol;
import dominio.VideojuegoDeportivo;
import dominio.VideojuegoEstrategia;
import dominio.VideojuegoOnline;

public class Main {
    public static void main(String[] args) {
        Ludoteca miLudoteca = new Ludoteca();

       
        VideojuegoRol rol = new VideojuegoRol("Zelda", "Nintendo Switch", 95, 50, 120);
        VideojuegoDeportivo deportivo = new VideojuegoDeportivo("FIFA", "PS5", 85, 90, "Fútbol");
        VideojuegoEstrategia estrategia = new VideojuegoEstrategia("Civilization", "PC", 90, 200, 6);
        VideojuegoOnline online = new VideojuegoOnline("Minecraft", "PC", 92, 150, 100);

        miLudoteca.agregar(rol);
        miLudoteca.agregar(deportivo);
        miLudoteca.agregar(estrategia);
        miLudoteca.agregar(online);

        System.out.println("===LISTA COMPLETA EN LA LUDOTECA===");
        System.out.println(miLudoteca);
    }
}
