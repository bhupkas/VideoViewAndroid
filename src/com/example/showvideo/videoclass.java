package com.example.showvideo;

import com.example.showvideo.R;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoclass extends Activity {
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.videolayout);
		
		show();
	}
	
	public void show()
	{

	     VideoView videoView =(VideoView)findViewById(R.id.videoView1);  
	       
	             //Creating MediaController  
	     MediaController mediaController= new MediaController(this);  
	         mediaController.setAnchorView(videoView);          
	      
	           //specify the location of media file  
	        Uri uri=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/Download/v1.mp4");          
	             
	           //Setting MediaController and URI, then starting the videoView  
	        videoView.setMediaController(mediaController);  
	        videoView.setVideoURI(uri);          
	        videoView.requestFocus();  
	        videoView.start();  
	}
	
}
