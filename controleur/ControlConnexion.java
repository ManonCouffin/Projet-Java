/*  Créateur : Manon COUFFIN
    Date de derniere mise à jour : 11/03
 */
package controleur;

import modele.Profil;

public class ControlConnexion {
    //attributs
    private Profil profil;

    //constructeur
    public ControlConnexion(Profil profil) {
        this.profil = profil;
    }

    //methode
    public boolean verifierMDP(String mdp){
        if(profil.verifierMDP(mdp)){
            profil.connexion();
        }
        System.out.println(profil.verifierConnexion());
        return profil.verifierConnexion();
    }
}
