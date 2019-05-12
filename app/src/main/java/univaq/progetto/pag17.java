package univaq.progetto;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pag17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag17);

        ImageView stemma=findViewById(R.id.stemmap17);
        TextView titolo=findViewById(R.id.titolop17);
        ImageView foto=findViewById(R.id.fotop17);

        TextView testo=findViewById(R.id.testop17);

        View v1=findViewById(R.id.viewp171);
        View v2=findViewById(R.id.viewp172);

        final FloatingActionButton second17= findViewById(R.id.backbtnpag17);
        second17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SecondaPagIn.class);
                startActivity(intent);
            }
        });

    }
}
