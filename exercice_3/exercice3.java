public class StockManager {

    /**
     * Gère le stock en fonction de l'opération (ajout ou retrait)
     * 
     * @param typeOperation Le type d'opération à effectuer 
     * @param produit Le nom du produit dont le stock est modifié
     * @param quantite La quantité à ajouter ou retirer du stock
     * @param stock Le stock actuel avant l'opération
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Si l'opération est un ajout
        if (typeOperation.equals("ajout")) {
            stock += quantite;  // On augmente le stock
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        
        // Si l'opération est un retrait
        } else if (typeOperation.equals("retrait")) {
            // Vérifier si le stock est suffisant pour effectuer le retrait
            if (stock >= quantite) {
                stock -= quantite;  // On réduit le stock
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                // Si le stock est insuffisant, afficher un message d'erreur
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
        
        // Si l'opération est inconnue
        } else {
            System.out.println("Opération inconnue.");
        }
    }
}
