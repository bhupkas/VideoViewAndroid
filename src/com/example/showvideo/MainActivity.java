package com.example.showvideo;  
      
import android.net.Uri;  
import android.os.Bundle;  
import android.os.Environment;
import android.app.Activity;  
import android.view.Menu;  
import android.widget.MediaController;  
import android.widget.VideoView;  
      
    public class MainActivity extends Activity {  
      
        @Override  
        protected void onCreate(Bundle savedInstanceState) {  
            super.onCreate(savedInstanceState);  
            setContentView(R.layout.activity_main);  
              
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