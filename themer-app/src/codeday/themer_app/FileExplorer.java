package codeday.themer_app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FileExplorer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_file_explorer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.file_explorer, menu);
		return true;
	}

}
