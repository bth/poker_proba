package fr.entrecode.poker_proba;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import fr.entrecode.poker_proba.MyScrollView.OnScrollStoppedListener;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.sax.TextElementListener;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class GameActivity extends Activity {
	
	MyScrollView scrollCarte1;
	MyScrollView scrollCarte2;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();
    }
    
    private void init() {
    	
    	final LinearLayout listeCarte1 = (LinearLayout) findViewById(R.id.carte1);
    	final LinearLayout listeCarte2 = (LinearLayout) findViewById(R.id.carte2);
    	remplirListe(listeCarte1, Carte.Couleur.PIQUE);
    	remplirListe(listeCarte2, Carte.Couleur.COEUR);
    	
    	afficherPourcentage(10);
    	
    	// Construction de sélecteur de carte de gauche
    	scrollCarte1 = (MyScrollView) findViewById(R.id.scrollcarte1);
    	scrollCarte1.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					scrollCarte1.startScrollerTask();
				}
				return false;
			}
		});
    	scrollCarte1.setOnScrollStoppedListener(new OnScrollStoppedListener() {
			
			@Override
			public void onScrollStopped() {
				scrollCarte1.repositionnerImage();
				mettreAJourProbabilite();
			}
		});
    
	// Construction de sélecteur de carte de droite
	scrollCarte2 = (MyScrollView) findViewById(R.id.scrollcarte2);
	scrollCarte2.setOnTouchListener(new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			if (event.getAction() == MotionEvent.ACTION_UP) {
				scrollCarte2.startScrollerTask();
			}
			return false;
		}
	});
	scrollCarte2.setOnScrollStoppedListener(new OnScrollStoppedListener() {
		
		@Override
		public void onScrollStopped() {
			scrollCarte2.repositionnerImage();
			mettreAJourProbabilite();
		}
	});
	
	// Initialisation de la case à cocher de connexion entre les cartes
	CheckBox caseACocherConnexion = (CheckBox) findViewById(R.id.connexion);
	caseACocherConnexion.setOnCheckedChangeListener(new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			if (isChecked) {
				remplirListe(listeCarte2, Carte.Couleur.PIQUE);
			}
			else {
				remplirListe(listeCarte2, Carte.Couleur.COEUR);
			}
			mettreAJourProbabilite();
		}
			
	});
}
    
    private void mettreAJourProbabilite() {
    	Carte carte1 = scrollCarte1.getCarteAffichee();
    	Carte carte2 = scrollCarte2.getCarteAffichee();
    	Main main = new Main(carte1, carte2);
    	afficherPourcentage(main.getProbabilite());
    }

    private void remplirListe(ViewGroup liste, Carte.Couleur couleur) {
    	List<String> listePrefixesFigures = Arrays.asList("a", "k", "q", "j", "10", "9", "8", "7", "6", "5", "4", "3", "2");
    	String prefixeCouleur = "";
    	// On vide la liste
    	liste.removeAllViews();
    	prefixeCouleur = Carte.stringFromCouleur(couleur);    	
    	for (Iterator<String> iterateurPrefixeFigure = listePrefixesFigures.iterator(); iterateurPrefixeFigure.hasNext();) {
    		ajouterImageAListe(prefixeCouleur + iterateurPrefixeFigure.next(), liste);				
		}
    }
        
    private void ajouterImageAListe(String nomImage, ViewGroup liste) {
    	ImageView image = new ImageView(getApplicationContext());
    	int id = getResources().getIdentifier(nomImage, "drawable", getPackageName());
    	image.setImageResource(id);
    	image.setContentDescription(nomImage);
    	image.setAdjustViewBounds(true);
    	liste.addView(image);
    }
    
    private void afficherPourcentage(float pourcentage) {
    	TextView pourcentageTexte = (TextView) findViewById(R.id.pourcentage);
    	pourcentageTexte.setText(String.valueOf(pourcentage) + "%");
    	int[] composantes = couleurDuPourcentage(pourcentage);
    	pourcentageTexte.setTextColor(Color.rgb(composantes[0], composantes[1], 0));
    }
    
    private int[] couleurDuPourcentage(float pourcentage) {    	
    	int composanteRouge = 0xFF;
    	int composanteVerte = 0xFF;
    	int valeurMax = 100;
    	composanteVerte = Math.round(pourcentage * (0xFF / valeurMax));
    	composanteRouge = 0xFF - Math.round(pourcentage * (0xFF / valeurMax));
    	int[] composantes = {composanteRouge, composanteVerte};
    	return composantes;
    }

}
