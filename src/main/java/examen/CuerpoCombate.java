package examen;

public class CuerpoCombate extends Cuerpo{

    String descripcionCombate;
    String tipoCombate;

    public CuerpoCombate(String tipoCuerpo, String descripcionCombate, String tipoCombate) {
        super(tipoCuerpo);
        this.descripcionCombate = descripcionCombate;
        this.tipoCombate = tipoCombate;
    }

    @Override
    public String toString() {
        return "Cuerpo de Combate [" +
                "Descripcion ='" + descripcionCombate + '\'' +
                ", Tipo Combate ='" + tipoCombate + '\'' +
                ", Tipo de Cuerpo ='" + tipoCuerpo + '\'' +
                ']';
    }
}
