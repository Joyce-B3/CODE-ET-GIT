public class GestionnaireNotes {

    /**
     * Affiche les notes et la moyenne d'un étudiant
     * 
     * @param nomEtudiant Le nom de l'étudiant pour lequel afficher les notes et la moyenne
     * @param notes Le tableau des notes de l'étudiant
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Vérifier si le tableau de notes est vide pour éviter une division par zéro
        if (notes == null || notes.length == 0) {
            System.out.println("Aucune note disponible pour l'étudiant : " + nomEtudiant);
            return;
        }

        
        afficherNotes(nomEtudiant, notes);

        
        double moyenne = calculerMoyenne(notes);

        
        System.out.println("Moyenne de " + nomEtudiant + " : " + moyenne);
    }

    /**
     * Affiche les notes d'un étudiant
     * 
     * @param nomEtudiant Le nom de l'étudiant dont les notes sont affichées
     * @param notes Le tableau des notes de l'étudiant
     */
    private void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Calcule la moyenne des notes
     * 
     * @param notes Le tableau des notes à utiliser pour le calcul de la moyenne
     * @return La moyenne des notes sous forme de nombre à virgule flottante
     */
    private double calculerMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }
}
