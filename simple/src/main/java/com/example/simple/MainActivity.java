package com.example.simple;

import android.content.Intent;
import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.net.Uri;

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
   public void doLaunchContactPicker(View view) {
       Intent intent5;
       intent5 = new Intent(this, MyContactsActivity.class);
       startActivity(intent5);
 /*}
 @Override
   public void onActivityResult(int reqCode, int resultCode, Intent data) {
       super.onActivityResult(reqCode, resultCode, data);

     switch (reqCode) {
          case (PICK_CONTACT) :
             if (resultCode == Activity.RESULT_OK) {
                  Uri contactData = data.getData();
                   Cursor c =  getContentResolver().query(contactData, null, null, null, null);
                if (c.moveToFirst()) {
                     String name = c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                        //TODO Whatever you want to do with the selected contact name.
                  }
               }
               break;
      }
   }
*/
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
        {;}
        else
        {
        add=add.substring(0,add.length()-1);
        text.setText(add);}
    }

    }


