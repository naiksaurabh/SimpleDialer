package com.example.simple;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
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
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);

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
