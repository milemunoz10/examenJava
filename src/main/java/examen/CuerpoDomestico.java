package examen;

public class CuerpoDomestico extends Cuerpo{

    String descripcionDomestico;


    public CuerpoDomestico(String tipoCuerpo, String descripcionDomestico) {
        super(tipoCuerpo);
        this.descripcionDomestico = descripcionDomestico;
    }

    @Override
    public String toString() {
        return "Cuerpo Domestico[" +
                "Descripcion ='" + descripcionDomestico + '\'' +
                ", Tipo de Cuerpo ='" + tipoCuerpo + '\'' +
                ']';
    }

    public static void barrer(){
        System.out.println("Actividad: Barrer");
    }

    public static void cocinar(){
        System.out.println("Acitividad: Cocinar");
    }
}
