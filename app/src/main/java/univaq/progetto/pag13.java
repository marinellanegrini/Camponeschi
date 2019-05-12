package univaq.progetto;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pag13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag13);

        ImageView stemma=findViewById(R.id.imageView26);

        TextView titolo=findViewById(R.id.textView41);

        ImageView foto=findViewById(R.id.imageView27);

        TextView testo=findViewById(R.id.textView42);

        ImageView geom=findViewById(R.id.imageView28);

        View v1=findViewById(R.id.view22);

        Intent intent=getIntent();

        final FloatingActionButton second13= findViewById(R.id.backbtnpag13);
        second13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SecondaPagIn.class);
                startActivity(intent);
            }
        });
    }
}
