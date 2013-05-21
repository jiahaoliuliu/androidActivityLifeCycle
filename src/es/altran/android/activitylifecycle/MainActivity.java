package es.altran.android.activitylifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = this;
		setContentView(R.layout.activity_main);
		Toast.makeText(context, "onCreate", Toast.LENGTH_LONG).show();
	}

    @Override
    protected void onStart() {
    	super.onStart();
        Toast.makeText(context, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
    	super.onResume();
    	Toast.makeText(context, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
    	super.onPause();
    	Toast.makeText(context, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
    	super.onStop();
    	Toast.makeText(context, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
    	Toast.makeText(context, "onDestroy", Toast.LENGTH_LONG).show();
    	super.onDestroy();
    }

    @Override
    protected void onRestart() {
    	Toast.makeText(context, "onRestart", Toast.LENGTH_LONG).show();
    	super.onRestart();
    }
}
