/*  Créateur : Manon COUFFIN
    Date de derniere mise à jour : 09/03
 */
package modele;

import java.util.List;

public class Recherche {
    //attributs
    private String donnee;
    private Fichier fichier;
    private CritereRecherche critereRecherche;
    private Mode mode;
    private TypeRecherche type;

    //constructeur
    public Recherche(String donnee, Fichier fichier, CritereRecherche critereRecherche, Mode mode, TypeRecherche type) {
        this.donnee = donnee;
        this.fichier = fichier;
        this.critereRecherche = critereRecherche;
        this.mode = mode;
        this.type = type;
    }

    //methode
    public List<String> rechercheFichier(CritereRecherche critere, Fichier fichier, TypeRecherche type, Mode mode, String donnee){
        return null;
    }
}
