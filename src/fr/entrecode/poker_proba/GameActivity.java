package fr.entrecode.poker_proba;

import android.app.Activity;
import android.os.Bundle;


public class GameActivity extends Activity {
	
	private enum Hauteur {
		AS,
		ROI,
		DAME,
		VALET,
		DIX,
		NEUF,
		HUIT,
		SEPT,
		SIX,
		CINQ,
		QUATRE,
		TROIS,
		DEUX,
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();
    }
    
    private void init() {
    	
    }    

}
