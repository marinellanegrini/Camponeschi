package univaq.progetto;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pag18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag18);

        ImageView stemma=findViewById(R.id.stemmap18);
        TextView titolo=findViewById(R.id.titolop18);
        ImageView foto1=findViewById(R.id.fotop181);
        ImageView foto2=findViewById(R.id.fotop182);

        ImageView geom=findViewById(R.id.geomp18);

        TextView testo=findViewById(R.id.testop18);

        View v1=findViewById(R.id.viewp181);
        View v2=findViewById(R.id.viewp182);

        final FloatingActionButton second18= findViewById(R.id.backbtnpag18);
        second18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SecondaPagIn.class);
                startActivity(intent);
            }
        });

    }
}
