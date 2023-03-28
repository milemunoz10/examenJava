package examen;

public class Cabeza {

    static String nombreCabeza;

    public Cabeza(String nombreCabeza) {
        this.nombreCabeza = nombreCabeza;
    }

    @Override
    public String toString() {
        return "Robot:\nCabeza [" +
                "nombre de la Cabeza = '" + nombreCabeza + '\'' +
                ']';
    }


}
