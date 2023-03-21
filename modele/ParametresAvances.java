/*  Créateur : Manon COUFFIN
    Date de derniere mise à jour : 09/03
 */
package modele;

public class ParametresAvances {
    //attribut

    //singleton
    private ParametresAvances(){

    }

    //holder
    private static class ParametresAvancesHolder{
        private final static ParametresAvances instance = new ParametresAvances();
    }

    public static ParametresAvances getInstance(){
        return ParametresAvances.ParametresAvancesHolder.instance;
    }

    //methode
    public void configuration(int numLigne, int nouvelleValeur){

    }
}
