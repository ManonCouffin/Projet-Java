/*  Créateur : Manon COUFFIN
    Date de derniere mise à jour : 09/03
 */
package boundary;

import controleur.ControlConnexion;
import modele.Profil;

public class BoundaryConnexion {
    //attributs
    private ControlConnexion controlConnexion;
    private final static int nbEssais = 3;

    //constructeur
    public BoundaryConnexion(ControlConnexion controlConnexion) {
        this.controlConnexion = controlConnexion;
    }

    //methode
    public void connexionAdmin(){
        System.out.println("Rentrez votre mot de passe : ");
        String mdp = Clavier.entrerClavierString();
        int i = nbEssais;

        boolean mdpOK =controlConnexion.verifierMDP(mdp);

        while((!mdpOK) || (i<=0)){
            mdpOK = controlConnexion.verifierMDP(mdp);
            System.out.println("Ce n'est pas le bon mot de passe, veuillez réessayer (nombre d'essais restant :" + i + ")");
            mdp = Clavier.entrerClavierString();
            i--;
        }
        if(i<0){
            System.out.println("Echec de connection ! Vous vous êtes trompés un trop grand nombre de fois...");
        }
    }

    public static void main(String[] args) {
        BoundaryConnexion boundaryConnexion = new BoundaryConnexion(new ControlConnexion(Profil.getInstance()));
        boundaryConnexion.connexionAdmin();
    }
}
