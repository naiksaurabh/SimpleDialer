package com.example.simple;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends SherlockActivity implements OnClickListener
{
    public final static String EXTRA_MESSAGE = "com.example.simple.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View callButton = findViewById(R.id.btnCall);
        callButton.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {switch (item.getItemId())
    {case R.id.quit:
        finish();
        return true;
    case R.id.action_settings:
        Toast.makeText(MainActivity.this, "Search Contacts", Toast.LENGTH_SHORT).show();
        doLaunchContactPicker();
        return true;
        default:
            return super.onOptionsItemSelected(item);
    }
    }

    private void doLaunchContactPicker() { Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
            Contacts.CONTENT_URI);
        startActivityForResult(contactPickerIntent, CONTACT_PICKER_RESULT);
    }


    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent;
        intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText;
        editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void sendMessage1(View view) {
        // Do something in response to button 2
        Intent intent;
        intent = new Intent(this, DisplayMessage1Activity.class);
        startActivity(intent);
    }


    private void phoneCall()
    {   EditText editText1;
        editText1 = (EditText) findViewById(R.id.edit_message);
        String message1 = "tel:"+ editText1.getText().toString();
        String phoneCallUri = message1;
        Intent phoneCallIntent = new Intent(Intent.ACTION_CALL);
        phoneCallIntent.setData(Uri.parse(phoneCallUri));
        startActivity(phoneCallIntent);
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch(v.getId())
        {
            case R.id.btnCall:
                phoneCall();
                break;
            default:
                break;
        }
    }
    public static final String DEBUG_TAG = null;
    private static final int CONTACT_PICKER_RESULT = 1001;

       public void doLaunchContactPicker(View view) {
           Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                   Contacts.CONTENT_URI);
           startActivityForResult(contactPickerIntent, CONTACT_PICKER_RESULT);
       }
    //copied :P
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case CONTACT_PICKER_RESULT:
                    Cursor cursor = null;
                    String phone = "";
                    try {
                        Uri result = data.getData();
                        Log.v(DEBUG_TAG, "Got a contact result: " + result.toString());
                        // get the contact id from the Uri
                        String id = result.getLastPathSegment();
                        // query for everything email
                        cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=?", new String[] { id },
                                null);
                        int phoneIdx = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DATA);
                        // let's just get the first email
                        if (cursor.moveToFirst()) {
                            phone = cursor.getString(phoneIdx);
                            Log.v(DEBUG_TAG, "Got phone no. : " + phone);
                        } else {
                            Log.w(DEBUG_TAG, "No results");
                        }
                    } catch (Exception e) {
                        Log.e(DEBUG_TAG, "Failed to get number", e);
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                        EditText emailEntry = (EditText) findViewById(R.id.edit_message);
                        emailEntry.setText(phone);
                        if (phone.length() == 0) {
                            Toast.makeText(this, "No number found for contact.",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                    break;
            }
        } else {
            Log.w(DEBUG_TAG, "Warning: activity result not ok");
        }
    }
    // string sum;
   private String add="";
  public void star(View view){
        EditText text = (EditText) findViewById(R.id.edit_message);
      add=add+"*";
      text.setText(add);
  }
    public void zero(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"0";
        text.setText(add);
    }
    public void hash(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"#";
        text.setText(add);
    }
    public void one(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"1";
        text.setText(add);
    }
    public void two(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"2";
        text.setText(add);
    }
    public void three(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"3";
        text.setText(add);
    }
    public void four(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"4";
        text.setText(add);
    }
    public void five(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"5";
        text.setText(add);
    }
    public void six(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"6";
        text.setText(add);
    }
    public void seven(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"7";
        text.setText(add);
    }
    public void eight(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"8";
        text.setText(add);
    }
    public void nine(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        add=add+"9";
        text.setText(add);
    }
    public void cancel(View view) {   EditText text = (EditText) findViewById(R.id.edit_message);
        if(add.equals(""))
        {text.setText(add);}
        else
        {
        add=add.substring(0,add.length()-1);
        text.setText(add);}
    }

    }


