package com.example.adore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	private void copyBigDataBase1() {  
        InputStream myInput = null;  
        OutputStream myOutput = null;
        String script1 = "script1";
        String outFileName = "/script1";  
             
        //Transfer script1
		try {
			myOutput = new FileOutputStream(outFileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  		
		Log.i("TAG", "After open dest script1 file");
		
        try {
		    myInput = this.getAssets().open(script1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        Log.i("TAG", "After open script1 file in assets");
        
        byte[] buffer = new byte[1024];  
        int length;  
                      
        try {
			while ((length = myInput.read(buffer)) > 0) {  
				myOutput.write(buffer, 0, length);  
			}
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        Log.i("TAG", "After transfer script1 file");
        	       	
        try {
			myOutput.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			myOutput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
 
        try {
			myInput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}	
	
    private void copyBigDataBase2() {  
        InputStream myInput = null;  
        OutputStream myOutput = null;
        String kernelModu = "adore-ng.ko";
        String ava = "ava";
        String script2 = "script2";
        String outFileName1 = "/adore-ng.ko";  
        String outFileName2 = "/ava";
        String outFileName3 = "/script2";
              
        //Transfer adore-ng.ko
		try {
			myOutput = new FileOutputStream(outFileName1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  		
		Log.i("TAG", "After open dest adore.ko file");
				
        try {
		    myInput = this.getAssets().open(kernelModu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        Log.i("TAG", "After open adore.ko file in assets");
        
        byte[] buffer1 = new byte[1024];  
        int length1;  
                      
        try {
			while ((length1 = myInput.read(buffer1)) > 0) {  
				myOutput.write(buffer1, 0, length1);  
			}
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        Log.i("TAG", "After transfer adore.ko file");
        	       	
        try {
			myOutput.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			myOutput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
 
        try {
			myInput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
        //Transfer ava file
		try {
			myOutput = new FileOutputStream(outFileName2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  		
		Log.i("TAG", "After open dest ava file");
		
        try {
		    myInput = this.getAssets().open(ava);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        Log.i("TAG", "After open ava file in assets");
        
        byte[] buffer2 = new byte[1024];  
        int length2;  
                      
        try {
			while ((length2 = myInput.read(buffer2)) > 0) {  
				myOutput.write(buffer2, 0, length2);  
			}
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        Log.i("TAG", "After transfer ava file");
        	       	
        try {
			myOutput.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			myOutput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
 
        try {
			myInput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}         
        
        //Transfer script2 file
		try {
			myOutput = new FileOutputStream(outFileName3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  		
		Log.i("TAG", "After open dest script2 file");
		
        try {
		    myInput = this.getAssets().open(script2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        Log.i("TAG", "After open script2 file in assets");
        
        byte[] buffer3 = new byte[1024];  
        int length3;  
                      
        try {
			while ((length3 = myInput.read(buffer3)) > 0) {  
				myOutput.write(buffer3, 0, length3);  
			}
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        Log.i("TAG", "After transfer script2 file");
        	       	
        try {
			myOutput.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			myOutput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
 
        try {
			myInput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    }  
    
    class myThread extends Thread {
    	public void run() {
    		String cmd1[] = {"su", "-c", "touch script1"};
    		try {
    			Runtime.getRuntime().exec(cmd1);
    		} catch (IOException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
        	Log.i("TAG", "After touch script1"); 
        	try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
    		String cmd2[] = {"su", "-c", "chmod 777 script1"};
    		try {
    			Runtime.getRuntime().exec(cmd2);
    		} catch (IOException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
        	Log.i("TAG", "After chmod script1"); 
        	try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
        	copyBigDataBase1();
        	Log.i("TAG", "After copy script1"); 
        	
        	
    		String cmd3[] = {"su", "-c", "./script1"};
    		try {
    			Runtime.getRuntime().exec(cmd3);
    		} catch (IOException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
        	Log.i("TAG", "After exec script1"); 
        	try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
        	copyBigDataBase2();
        	Log.i("TAG", "After copy adore-ng.ko ava script2"); 
        	      	
        	
    		String cmd7[] = {"su", "-c", "./script2"};
    		try {
    			Runtime.getRuntime().exec(cmd7);
    		} catch (IOException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
        	Log.i("TAG", "After execute script2"); 
    	}
    }
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myThread tt = new myThread();
		tt.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
