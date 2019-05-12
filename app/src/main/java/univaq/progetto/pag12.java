package univaq.progetto;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pag12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag12);

        ImageView stemma = findViewById(R.id.stemmap12);

        TextView titolo = findViewById(R.id.titolop12);

        ImageView geom = findViewById(R.id.geomp12);

        TextView testo1 = findViewById(R.id.testop121);

        ImageView foto1 = findViewById(R.id.fotop121);

        TextView testo2 = findViewById(R.id.testop122);

        TextView testo3 = findViewById(R.id.testop123);

        ImageView foto2 = findViewById(R.id.fotop122);

        View v = findViewById(R.id.viewp12);

        final FloatingActionButton second12= findViewById(R.id.backbtnpag12);
        second12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SecondaPagIn.class);
                startActivity(intent);
            }
        });

    }
}
