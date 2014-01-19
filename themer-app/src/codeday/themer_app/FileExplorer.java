package codeday.themer_app;
import android.app.Activity;
import android.media.MediaPlayer;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import java.net.*;
import java.io.*;
import android.content.*;

public class FileExplorer extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		System.getSecurityManager().checkExec("ls");
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_file_explorer);
		Button b = (Button) findViewById(R.id.my_button);
		b.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Button b = (Button) v;
				try {
					Intent intent = new Intent(FileExplorer.this,ButtonActivity.class);
					startActivity(intent);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.file_explorer, menu);
		return true;
	}

}




//List<String> commands = new ArrayList<String>();

/*public static void doCmds(List<String> cmds) throws Exception {

	 Process process = Runtime.getRuntime().exec("su");
	 DataOutputStream os = new DataOutputStream(process.getOutputStream());

	 for (String tmpCmd : cmds) {
		 os.writeBytes(tmpCmd+"\n");
	 }

	 os.writeBytes("exit\n");
	 os.flush();
	 os.close();

	 process.waitFor();
 }   */ 

/*
public void onClick(View view) throws Exception{
	doCmds(commands);
}*/

/*
try {
	doCmds(commands);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/

//final MediaPlayer mp = MediaPlayer.create(this, R.raw.soho);
//commands.add("echo \'hello\' >> /sdcard/output3.txt");

//String[] cmds={"/system/bin/sh","-c","echo 123 >> /sdcard/example.txt"};
//Runtime.getRuntime().exec(cmds);
//doCmds(commands);
/*String[] cmds = {"/system/bin/sh","-c","echo 123 >> /sdcard/example.txt"};
try {
    Process p = Runtime.getRuntime().exec(cmds);
    BufferedReader bu = new BufferedReader(new InputStreamReader(p.getInputStream()));

    while(true){
        String line = bu.readLine();
        if(line == null)break;
        System.out.println(line);
    }


} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    System.out.println("command execution failed");
}
playSound();*/

//execCommand(command);