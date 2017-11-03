package app.android.mmauri.seccion_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declaramos el Button de forma global
    private Button btn;
    private final String GREETER = "Hello from the other side!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Forzar mostrar el icono de aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        // Cargar icono (cargado previamente):
        getSupportActionBar().setIcon(R.mipmap.ic_myicon);



        // Vinculamos el boton del XML con el declarado en la clase Java (aqui)
        btn = (Button) findViewById(R.id.buttonMain);

        // Configuramos el comportamiento de cuando se clica el boton
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acceder al segundo activity y mandarle un string
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("greeter", GREETER);
                startActivity(intent);
            }
        });
    }
}
