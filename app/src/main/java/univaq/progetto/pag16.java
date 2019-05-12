package univaq.progetto;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pag16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag16);

        ImageView stemma=findViewById(R.id.stemmap16);
        TextView titolo=findViewById(R.id.titolop16);
        ImageView foto1=findViewById(R.id.fotop161);
        ImageView foto2=findViewById(R.id.fotop162);
        ImageView foto3=findViewById(R.id.fotop163);
        ImageView foto4=findViewById(R.id.fotop164);

        ImageView geom=findViewById(R.id.geomp16);

        TextView testo=findViewById(R.id.testop16);

        View v1=findViewById(R.id.viewp161);
        View v2=findViewById(R.id.viewp162);

        final FloatingActionButton second16= findViewById(R.id.backbtnpag16);
        second16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SecondaPagIn.class);
                startActivity(intent);
            }
        });

    }
}
