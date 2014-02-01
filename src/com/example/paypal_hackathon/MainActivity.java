package com.example.paypal_hackathon;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     //   LinearLayout linearLayout1 = (LinearLayout) findViewById(R.id.linearLayout1);
        
      //  ImageView image = new ImageView(MainActivity.this);
      //  image.setBackgroundResource(R.drawable.bulb);
       // linearLayout1.addView(image);
        
      //  startService(new Intent(Main_Activity.this,blutooth_service.class));
        
        

      /* LinearLayout linearLayout1 = (LinearLayout) findViewById(R.id.LinearLayout01);
        
        //ImageView imgView =(ImageView)findViewById(R.id.ImageView01);
        
       // ImageView image = new ImageView(MainActivity.this);
        
        
       imgView.setBackgroundResource(R.drawable.ic_launcher);
       
       Drawable drawable=
        
       /* URL url = null;
		try {
			url = new URL("http://i.imgur.com/3l2fxKw.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Bitmap bmp = null;
		try {
			bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       // imgView.setImageBitmap(bmp);
        
        //ImageView imgView =(ImageView)findViewById(R.id.ImageView01);
        //Drawable drawable = LoadImageFromWebOperations("http://www.androidpeople.com/wp-content/uploads/2010/03/android.png");
        //imgView.setImageDrawable(drawable);
        
      // Drawable drawable=
       
       linearLayout1.addView(imgView);
        */
        
        
        
        

    }
    /*
    private Drawable LoadImageFromWebOperations(String url)
    {
    try
    {
    InputStream is = (InputStream) new URL(url).getContent();
    Drawable d = Drawable.createFromStream(is, "src name");
    return d;
    }catch (Exception e) {
    System.out.println("Exc="+e);
    return null;
    }
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
