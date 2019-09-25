package bowling;

import java.util.ArrayList;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
           
	Integer nbTour;
        Integer nbBoule = 0;
        // Score Actuel / (etat, 2 strike, 1 spare, 0 normal) / nbQuille / scoreTour
        ArrayList<tour> GameStatus = new ArrayList<tour>();
        
	public SinglePlayerGame() {
            nbTour = 0;
            GameStatus.add(new tour());
            
	}

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
            Integer q = nombreDeQuillesAbattues;
            if (q == 10 || GameStatus.get(nbTour).info[2] + q == 10 || nbBoule == 1){
                if (q == 10){
                    GameStatus.get(nbTour).strike();
                }
                else if (GameStatus.get(nbTour).info[2] + q == 10){
                    GameStatus.get(nbTour).spare();
                }
                else{
                    GameStatus.get(nbTour).normal(q,nbBoule);
                }
                nextTurn();
            }
            else{
                GameStatus.get(nbTour).normal(q,nbBoule);
                nbBoule += 1;
            }
            
	}
        
        public void nextTurn(){
            nbTour += 1;
            nbBoule = 0;
        }

	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
            return GameStatus.get(9).score();
	}
}
