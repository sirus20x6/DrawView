package edu.niu.cs.shelhamer.aaron.drawview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	private MyView theView;
	LinearLayout myCanvas;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		theView = new MyView(this);
		setContentView(theView);
		//setContentView(R.layout.activity_main);
/*		myCanvas = (LinearLayout)findViewById(R.id.Second);
		theView = new myview(this,null);
		myCanvas.addView(child);*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
