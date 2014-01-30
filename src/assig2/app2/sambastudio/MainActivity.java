package assig2.app2.sambastudio;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	private MediaPlayer tamborim;
	private MediaPlayer agogo;
	private MediaPlayer cuica;
	private MediaPlayer repique;
	private MediaPlayer caixa;
	private MediaPlayer chocalho;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() { 
		Log.e("Jabber", "onResume"); 
	  	//tamborim = MediaPlayer.create(this, R.raw.tamborim); 
	  	//tamborim.start(); 
	  	//tamborim.setLooping(true);
	  	
	 	super.onResume(); 
	} 
	@Override 
	protected void onPause() { 
	 	Log.e("Jabber", "onPause"); 
	 	try {
	 		tamborim.stop(); 
		 	tamborim.release(); 
		 			 				
		} catch (Exception e) {
			// TODO: handle exception
		}
	 	
	 	try {
	 		agogo.stop(); 
		 	agogo.release(); 
		 			 				
		} catch (Exception e) {
			// TODO: handle exception
		}	 	
	 	try {
	 		caixa.stop(); 
		 	caixa.release(); 
		 			 				
		} catch (Exception e) {
			// TODO: handle exception
		}	 	
	 	try {
	 		chocalho.stop(); 
		 	chocalho.release(); 
		 			 				
		} catch (Exception e) {
			// TODO: handle exception
		}	 	
	 	try {
	 		cuica.stop(); 
		 	cuica.release(); 
		 			 				
		} catch (Exception e) {
			// TODO: handle exception
		}	 	
	 	try {
	 		repique.stop(); 
		 	repique.release(); 
		 			 				
		} catch (Exception e) {
			// TODO: handle exception
		}
	 	
	 	super.onPause(); 
	}
	
	
	public void clkTamborim(View view)
	{
		 boolean on = ((ToggleButton) view).isChecked();
		    
		 
		    if (on) {
				 Log.d("tamborim", "on");
				tamborim = MediaPlayer.create(this, R.raw.virade); 
		    	tamborim.start(); 
			  	tamborim.setLooping(true);
		    } else {
		        // Disable vibrate
				 Log.d("tamborim", "off");
		    	tamborim.stop();
		    	tamborim.release(); 
		    }
		
	}
	
	public void clkAgogo(View view)
	{
		 boolean on = ((ToggleButton) view).isChecked();
		    
		 
		    if (on) {
				 Log.d("agogo", "on");
				 agogo = MediaPlayer.create(this, R.raw.agogo); 
				 agogo.start(); 
				 agogo.setLooping(true);
		    } else {
		        // Disable vibrate
				 Log.d("agogo", "off");
				 agogo.stop();
				 agogo.release(); 
		    }
		
	}

	public void clkCuica(View view)
	{
		 boolean on = ((ToggleButton) view).isChecked();
		    
		 
		    if (on) {
				 Log.d("cuica", "on");
				 cuica = MediaPlayer.create(this, R.raw.cuica); 
				 cuica.start(); 
				 cuica.setLooping(true);
		    } else {
		        // Disable vibrate
				 Log.d("cuica", "off");
				 cuica.stop();
				 cuica.release(); 
		    }
		
	}

	public void clkCaixa(View view)
	{
		 boolean on = ((ToggleButton) view).isChecked();
		    
		 
		    if (on) {
				 Log.d("caixa", "on");
				 caixa = MediaPlayer.create(this, R.raw.caixa); 
				 caixa.start(); 
				 caixa.setLooping(true);
		    } else {
		        // Disable vibrate
				 Log.d("caixa", "off");
				 caixa.stop();
				 caixa.release(); 
		    }
		
	}

	public void clkChocalho(View view)
	{
		 boolean on = ((ToggleButton) view).isChecked();
		    
		 
		    if (on) {
				 Log.d("chocalho", "on");
				 chocalho = MediaPlayer.create(this, R.raw.chocalho); 
				 chocalho.start(); 
				 chocalho.setLooping(true);
		    } else {
		        // Disable vibrate
				 Log.d("chocalho", "off");
				 chocalho.stop();
				 chocalho.release(); 
		    }
		
	}

	public void clkRepique(View view)
	{
		 boolean on = ((ToggleButton) view).isChecked();
		    
		 
		    if (on) {
				 Log.d("repique", "on");
				 repique = MediaPlayer.create(this, R.raw.repique); 
				 repique.start(); 
				 repique.setLooping(true);
		    } else {
		        // Disable vibrate
				 Log.d("repique", "off");
				 repique.stop();
				 repique.release(); 
		    }
		
	}
	
	public void clkStop(View view)
	{
		ToggleButton but = (ToggleButton) findViewById(R.id.tAgogo);
		if (but.isChecked())
		{
			but.toggle();
		}
		
		but = (ToggleButton) findViewById(R.id.tAgogo);
		if (but.isChecked())
		{
			but.toggle();
		}
		
		but = (ToggleButton) findViewById(R.id.tCaixa);
		if (but.isChecked())
		{
			but.toggle();
		}
		but = (ToggleButton) findViewById(R.id.tChocalho);
		if (but.isChecked())
		{
			but.toggle();
		}
		but = (ToggleButton) findViewById(R.id.tCuica);
		if (but.isChecked())
		{
			but.toggle();
		}
		but = (ToggleButton) findViewById(R.id.tRepique);
		if (but.isChecked())
		{
			but.toggle();
		}
		but = (ToggleButton) findViewById(R.id.tTamborim);
		if (but.isChecked())
		{
			but.toggle();
		}
		
		onPause();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
