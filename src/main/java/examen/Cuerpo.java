package examen;

public abstract class Cuerpo {

    String tipoCuerpo;

    public Cuerpo(String tipoCuerpo) {
        this.tipoCuerpo = tipoCuerpo;
    }

    @Override
    public String toString() {
        return "Cuerpo [" +
                "Datos de Cuerpo = '" + tipoCuerpo + '\'' +
                ']';
    }
}
