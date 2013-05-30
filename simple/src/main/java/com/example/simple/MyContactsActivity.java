package com.example.simple;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import android.os.Bundle;
import android.view.View;
import android.content.ClipboardManager;
import android.content.ClipData;

/**
 * Created by Sanket on 5/23/13.
 */
public class MyContactsActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.message2);
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
    public void copyit(View view) {

        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("0", "9423013242");
        clipboard.setPrimaryClip(clip);
        //Intent intent6;
        //intent6 = new Intent(this, MyContactsActivity.class);
        //startActivity(intent6);
}
}
