package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
      //  TextView tv = new TextView(this);
       // tv.setText("Hello, Android");
        setContentView(R.layout.main);
        
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	final EditText edittext = (EditText) findViewById(R.id.edittext);
            	edittext.setText("Welcome to the Android world, "+(edittext.getText().toString())+" !");

            }
        });
        
      //Cancel Button
        final Button cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		
        		// Perform action on click
        		EditText et = (EditText) findViewById(R.id.edittext);
        		//et.append(" Sree= " + et.getText().toString());
        	
        		et.setText("");
        	}
        
        });
    
    }
    
}