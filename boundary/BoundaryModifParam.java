/*  Créateur : Manon COUFFIN
    Date de derniere mise à jour : 09/03
 */
package boundary;

import controleur.ControleModifParam;
import modele.ParametreRecherche;

public class BoundaryModifParam {
    //attributs
    private ControleModifParam controleModifParam;

    //constructeur
    public BoundaryModifParam(ControleModifParam controleModifParam) {
        this.controleModifParam = controleModifParam;
    }

    //methode
    public void modifierParametre(){
        System.out.println("Choisissez les parametres à modifier : ");
        System.out.println("1. Parametres Avancés\n" +
                        "2. Parametres de recherche\n");
        int choixParametre = Clavier.entrerClavierInt();

        if(choixParametre == 1){
            //Parametre avancés
            int numLigne = 0;

            System.out.println("Quel parametre voulez vous modifier ?");
            System.out.println("1. IndexationAudioN 1024\n" +
                    "2. IndexationAudioM 100\n" +
                    "3. nbrbit (IMAGE) 3\n" +
                    "4. nbrOccurence (TEXTE) 1");

            while(numLigne<1 || numLigne >4){
                System.out.println("Entrer votre choix");
                numLigne = Clavier.entrerClavierInt();
                if(numLigne <1 || numLigne >4){
                    System.out.println("Vous devez entrer un chiffre entre 1 et 4");
                }
            }

            System.out.println("La valeur actuelle est : ");
            switch(numLigne){
                case 1 : System.out.println("1024");
                    break;
                case 2 :  System.out.println("100");
                    break;
                case 3 : System.out.println("3");
                    break;
                case 4 : System.out.println("1");
                    break;
                default : System.out.println("Erreur !");
                    break;
            }
            System.out.println("Quelle est la nouvelle valeur que vous voulez entrer ?");
            int nouvelleValeur = Clavier.entrerClavierInt();

            //appel du controleur
            controleModifParam.modifParametresAvances(numLigne, nouvelleValeur);
        }
        else{
            //Parametre recherche
            int choix = 0;

            System.out.println("Choisissez le mode de recherche : ");
            System.out.println("1. Ouvert\n" +
                    "2. Ouvert & MultiMoteur\n" +
                    "3. Fermé\n" +
                    "4. Fermé & MultiMoteur");
            while(choix<1 || choix >4){
                System.out.println("Entrer votre choix");
                choix = Clavier.entrerClavierInt();
                if(choix<1 || choix >4){
                    System.out.println("Vous devez entrer un chiffre entre 1 et 4");
                }
            }

            //appel du controleur
            controleModifParam.modifParametresRecherche(choix);
        }

        System.out.println("Paramètres modifiés");

    }

    public static void main(String[] args) {

        BoundaryModifParam boundaryModifParam = new BoundaryModifParam(new ControleModifParam(null,null));

        boundaryModifParam.modifierParametre();
    }

}
