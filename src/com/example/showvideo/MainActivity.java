package com.example.showvideo;  
      

import android.net.Uri;  
import android.os.Bundle;  
import android.os.Environment;
import android.app.Activity;  
import android.content.Context;
import android.content.Intent;
import android.view.Menu;  
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;  
import android.widget.VideoView;  
      
    public class MainActivity extends Activity {  
      
    	private Button btnDisplay;
        @Override  
        protected void onCreate(Bundle savedInstanceState) {  
            super.onCreate(savedInstanceState);  
            setContentView(R.layout.activity_main);  
            addListenerOnButton();
        }  
        public void addListenerOnButton() {
      	  
            final Context context = this;  
            btnDisplay = (Button) findViewById(R.id.btnDisplay);
        	btnDisplay.setOnClickListener(new OnClickListener() {
         
        		@Override
        		public void onClick(View v) {
        			    Intent intent = new Intent(context, videoclass.class);
                        startActivity(intent);   
        		}
         
        	});
         
          }
    }  