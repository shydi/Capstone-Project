package estore.lacys.com.lacysestore.checkout;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import estore.lacys.com.lacysestore.LacysEstore;
import estore.lacys.com.lacysestore.R;

public class checkout extends ActionBarActivity {
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_checkout, menu);
        return true;
    }

    public void OnClickListener(View v)
    {

        if(v.getId() == R.id.sbmButton)
        {
            EditText a = (EditText)findViewById(R.id.editText2);
            String a1 = a.getText().toString();

            EditText b = (EditText)findViewById(R.id.editText3);
            String a2 = b.getText().toString();

            EditText c = (EditText)findViewById(R.id.editText4);
            String a3 = b.getText().toString();

            EditText d = (EditText)findViewById(R.id.editText5);
            String a4 = b.getText().toString();


            EditText e = (EditText)findViewById(R.id.ccnumber);
            String a5 = b.getText().toString();

            EditText f = (EditText)findViewById(R.id.cid);
            String a6 = b.getText().toString();

            if(a1.equals(null)||a2.equals(null)||a3.equals(null)||a4.equals(null)||a5.equals(null)||
                    a6.equals(null))
            {
                Toast temp = Toast.makeText(checkout.this, "No fields may be blank. Please" +
                        " fill out all fields.", Toast.LENGTH_SHORT);
                temp.show();
            }
            else
            {

                Toast confirm = Toast.makeText(checkout.this, "Your order has been receieved", Toast.LENGTH_SHORT);
                confirm.show();

                Intent i = new Intent(checkout.this, confirmation.class);
                startActivity(i);

                //Intent i = new Intent(LogIn.this, LacysEstore.class);
                // getActionBar().setTitle(str);
                startActivity(i);
                //popup msg

            }


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
