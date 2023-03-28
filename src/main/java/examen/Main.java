package examen;


public class Main {

    public static void main(String[] args) {

        //Ejemplo 1 = Robot con cuerpo doméstico
        Cabeza cabeza = new Cabeza("Cabeza de Robot 1");
        Cuerpo cuerpoDomestico = new CuerpoDomestico("Domestico","Barredor");

        //Ejemplo 2 = Robot con cuerpo de combate acuático
        Cabeza cabeza2 = new Cabeza("Cabeza de Robot 2");
        Cuerpo cuerpo2 = new CuerpoCombate("Combate", "Combatir","Acuatico");

        Cabeza cabeza3 = new Cabeza("Cabeza de Robot 3");
        Cuerpo cuerpo3 = new CuerpoCombate("Combate", "Combatir","Aereo");

        Cabeza cabeza4 = new Cabeza("Cabeza de Robot 3");
        Cuerpo cuerpo34= new OtroCuerpo("Otro Cuerpo", "Animal");


        System.out.println(cabeza2);
        System.out.println(cuerpo2);


    }


}
