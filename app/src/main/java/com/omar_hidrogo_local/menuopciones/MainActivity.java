package com.omar_hidrogo_local.menuopciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //para anclar el boton de menu y despliege el contenido
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    //Para controlar que es lo que sucedera al precionar about y settings
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.mAbout:
                Intent i = new Intent(this, Activity_about.class);
                startActivity(i);
                break;
            case R.id.mSettings:
                Intent o = new Intent(this, Activity_Settings.class);
                startActivity(o);
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
