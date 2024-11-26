
  
       /**
 * Classe FactureManager - Gère les calculs liés aux factures.
 *
 * Cette classe applique des réductions basées sur le type de produit
 * et retourne le total après application des réductions spécifiques.
 */    
        public class FactureManager{

       // Déclaration des variables d'instance      
                   private String typeProduit;
                   private int quantite;
                   private double prixUnitaire;
       
                        // Taux de réduction associés aux différents types de produits      
                         private double valeurA=0.05;
                         private double valeurE=0.1;
                         private double valeurL=0.15;
          

                   private double total=quantite*prixUnitaire;

               /**
     * Calcule le total d'une facture en appliquant les réductions en fonction du type de produit.
     * 
     * @param typeProduit Le type de produit ("Alimentaire", "Electronique", "Luxe").
     * @return Le montant total après réduction appliquée.
     */
     
           public double calculerFacture(String typeProduit) {
                 
                  switch ("typeProduit"){
                      case "Alimentaire":
                        return this.reductionA();
                           break;

                        case "Electronique":
                        return this.reductionE();
                           break;
                        
                           case "Luxe":
                        return this.reductionL();
                           break;
               }
             
  }


     private double reductionA(){
               this.total-=total*valeurA;
                  return tnis.total;
        }
        
           private double reductionE(){
               this.total-=total*valeurE;
                return tnis.total;

        }        
       
     private double reductionL(){
               this.total-=total*valeurL;
                    return tnis.total;

        }
  }    

