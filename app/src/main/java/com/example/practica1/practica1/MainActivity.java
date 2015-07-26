package com.example.practica1.practica1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button btRegistrar;
    EditText nombre, apellido;
    TextView mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.textNombre);
        apellido = (EditText)findViewById(R.id.textApellido);
        mensaje = (TextView)findViewById(R.id.tvMensaje);
        btRegistrar = (Button)findViewById(R.id.btnRegistrar);

        // HACEMOS LLAMADO AL EVENTO DEL BOTON
         btRegistrar.setOnClickListener(this);

        /*btRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom1 = nombre.getText().toString();
                String ape2 = apellido.getText().toString();

                mensaje.setText("BIENVENIDO SENOR : " + nom1 + " " + ape2);
            }
        });*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    @Override
    public void onClick(View v) {
        String nom1 = nombre.getText().toString();
        String ape2 = apellido.getText().toString();

        mensaje.setText("BIENVENIDO SENOR : " + nom1 + " " + ape2);
    }

}
