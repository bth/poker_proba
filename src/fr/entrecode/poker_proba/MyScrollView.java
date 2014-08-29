package fr.entrecode.poker_proba;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MyScrollView  extends ScrollView {
	
	private Runnable tacheSurveilleArret;
	private int delaisSurveillance = 100;
	private int anciennePosition = 0;
	private OnScrollStoppedListener onScrollStoppedListener;
	
	public interface OnScrollStoppedListener {
		void onScrollStopped();
	}
	

	public MyScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		tacheSurveilleArret = new Runnable() {
			
			@Override
			public void run() {
				
				int nouvellePosition = getScrollY();
				if (nouvellePosition == anciennePosition) {
					onScrollStoppedListener.onScrollStopped();
				}
				else {
					anciennePosition = nouvellePosition;
					postDelayed(tacheSurveilleArret, delaisSurveillance);
				}
			}
		};
	}
	
	public void setOnScrollStoppedListener(MyScrollView.OnScrollStoppedListener listener){
	    onScrollStoppedListener = listener;
	}

	public void startScrollerTask(){

	    anciennePosition = getScrollY();
	    MyScrollView.this.postDelayed(tacheSurveilleArret, delaisSurveillance);
	}
	
	private int getTailleElements() {
		return ((ImageView)((LinearLayout)getChildAt(0)).getChildAt(0)).getHeight();
	}
	
	public void repositionnerImage() {
		int position = getScrollY();
		int tailleElements = getTailleElements();
		smoothScrollTo(getScrollX(), ((position+tailleElements/2) / tailleElements)*tailleElements - (getHeight()-tailleElements)/2);
	}

}
