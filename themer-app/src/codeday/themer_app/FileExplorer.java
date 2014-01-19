package codeday.themer_app;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;



public class FileExplorer extends Activity {
	List<String> commands = new ArrayList<String>();
	
	public static void doCmds(List<String> cmds) throws Exception {

		 Process process = Runtime.getRuntime().exec("su");
		 DataOutputStream os = new DataOutputStream(process.getOutputStream());

		 for (String tmpCmd : cmds) {
			 os.writeBytes(tmpCmd+"\n");
		 }

		 os.writeBytes("exit\n");
		 os.flush();
		 os.close();

		 process.waitFor();
	 }    


	public void onClick(View view) throws Exception{
		doCmds(commands);
	}
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_file_explorer);
		commands.add("echo \'hello\' >> /sdcard/output3.txt");
		try {
			doCmds(commands);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Button b = (Button) findViewById(R.id.my_button);
		b.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Button b = (Button) v;
				try {
					doCmds(commands);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//execCommand(command);
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.file_explorer, menu);
		return true;
	}

}
