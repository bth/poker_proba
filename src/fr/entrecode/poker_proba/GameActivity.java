package fr.entrecode.poker_proba;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Gallery;


public class GameActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();
    }
    
    private void init() {
    	
    	
    	Carte carte1 = new Carte(Carte.Hauteur.AS, Carte.Couleur.PIQUE);
    	Carte carte2 = new Carte(Carte.Hauteur.ROI, Carte.Couleur.COEUR);
    	
    	Main main = new Main(carte1, carte2);
    	main.getProbabilite();
    }    

}
