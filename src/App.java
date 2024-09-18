public class App {
    public static void main(String[] args) throws Exception {
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough", Pelicula.tipoGenero.DRAMA, 191, 1982, 8.3);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh", Pelicula.tipoGenero.ACCION, 115, 2011, 7.0);

        pelicula1.imprimir();
        pelicula2.imprimir();

        System.out.println("La película " + pelicula1.getNombre() + " es épica: " + pelicula1.esPeliculaEpica());
        System.out.println("La película " + pelicula2.getNombre() + " es épica: " + pelicula2.esPeliculaEpica());
        System.out.println("La película " + pelicula1.getNombre() + " y la película " + pelicula2.getNombre() + " son similares: " + pelicula1.esSimilar(pelicula2));
    }
}
