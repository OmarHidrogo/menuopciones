package com.omar_hidrogo_local.menuopciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);

        //se agrego el menu de contexto al texview
        registerForContextMenu(tvNombre);
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

    //crea un menu de contexto
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_contexto, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mEdit:
                //Intent o descargar segun lo que se realice
                Toast.makeText(this, getResources().getString(R.string.menu_edit), Toast.LENGTH_SHORT).show();

                break;
            case R.id.mDelete:
                Toast.makeText(this, getResources().getString(R.string.menu_delete), Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onContextItemSelected(item);
    }
}
