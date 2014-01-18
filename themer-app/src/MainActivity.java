package codeday.themer_app_test;
import java.util.*;
import java.io.*;
import android.app.Activity;
public class MainActivity extends Activity {
	/*
}
	private String[] mFileList;
	private File mPath = new File(Enviroment.getExternalStorageDirectory() + "//yourdir//");
	private String mChosenFile;
	private static final String FTYPE = ".txt";    
	private static final int DIALOG_LOAD_FILE = 1000;

	private void loadFileList() {
	    try {
	        mPath.mkdirs();
	    }
	    catch(SecurityException e) {
	        Log.e(TAG, "unable to write on the sd card " + e.toString());
	    }
	    if(mPath.exists()) {
	        FilenameFilter filter = new FilenameFilter() {
	            public boolean accept(File dir, String filename) {
	                File sel = new File(dir, filename);
	                return filename.contains(FTYPE) || sel.isDirectory();
	            }
	        };
	        mFileList = mPath.list(filter);
	    }
	    else {
	        mFileList= new String[0];
	    }
	}

	protected Dialog onCreateDialog(int id) {
	    Dialog dialog = null;
	    AlertDialog.Builder builder = new Builder(this);

	    switch(id) {
	        case DIALOG_LOAD_FILE:
	            builder.setTitle("Choose your file");
	            if(mFileList == null) {
	                Log.e(TAG, "Showing file picker before loading the file list");
	                dialog = builder.create();
	                return dialog;
	            }
	            builder.setItems(mFileList, new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int which) {
	                    mChosenFile = mFileList[which];
	                    //you can do stuff with the file here too
	                }
	            });
	            break;
	    }
	    dialog = builder.show();
	    return dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 */   
}
