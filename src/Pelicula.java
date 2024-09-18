public class Pelicula {
    private String nombre;
    private String director;
    
    enum tipoGenero {ACCION, COMEDIA, DRAMA, SUSPENSE}
    private tipoGenero genero;

    private int duracion;
    private int año;
    private double calificacion;

    public Pelicula(String nombre, String director, tipoGenero genero, int duracion, int año,
            double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public tipoGenero getGenero() {
        return genero;
    }

    public void setGenero(tipoGenero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void imprimir(){
        System.out.println("Nombre de la película = " + nombre);
        System.out.println("Director = " + director);
        System.out.println("Género = " + genero);
        System.out.println("Duración =" + duracion);
        System.out.println("Año = " + año);
        System.out.println("Calificación =" + calificacion + "\n");
    }
    
    public boolean esPeliculaEpica(){
        if (duracion>=180){
            return true;
        } else {
            return false;
        }
    }

    // Se deja privado porque no se usa fuera de esta clase
    private String calcularValoracion(){
      if (calificacion >=0 && calificacion <=2){
        return "Muy mala";
      } else if (calificacion >2 && calificacion <=5){
        return "Mala";
      } else if (calificacion >5 && calificacion <=7){
        return "Regular";
      } else if (calificacion >7 && calificacion <=8){
        return "Buena";
      } else if (calificacion >8 && calificacion <=10){
        return "Excelente";
      } else {
        return "No tiene valoración";
      }
    } 

    public boolean esSimilar(Pelicula otraPelicula){
        if (genero == otraPelicula.genero && calcularValoracion() == otraPelicula.calcularValoracion()){
            return true;
        } else {
            return false;
        }
    }
}
