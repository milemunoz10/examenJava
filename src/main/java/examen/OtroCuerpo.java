package examen;

public class OtroCuerpo extends Cuerpo{

    String OtroCuerpo;

    public OtroCuerpo(String tipoCuerpo, String otroCuerpo) {
        super(tipoCuerpo);
        OtroCuerpo = otroCuerpo;
    }

    @Override
    public String toString() {
        return "Otro Cuerpo [" +
                "Descripcion ='" + OtroCuerpo + '\'' +
                ", Tipo de cuerpo ='" + tipoCuerpo + '\'' +
                ']';
    }
}
