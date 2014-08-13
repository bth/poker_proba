package fr.entrecode.poker_proba;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;


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
