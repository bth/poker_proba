package fr.entrecode.poker_proba;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;


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
    	
    	LinearLayout listeCarte1 = (LinearLayout) findViewById(R.id.carte1);
    	ajouterImageAListe("ca", listeCarte1);
    	ajouterImageAListe("ck", listeCarte1);
    	ajouterImageAListe("cq", listeCarte1);
    }    
    
    private void ajouterImageAListe(String nomImage, ViewGroup liste) {
    	ImageView image = new ImageView(getApplicationContext());
    	int id = getResources().getIdentifier(nomImage, "drawable", getPackageName());
    	image.setImageResource(id);
    	image.setAdjustViewBounds(true);
    	liste.addView(image);
    }

}
