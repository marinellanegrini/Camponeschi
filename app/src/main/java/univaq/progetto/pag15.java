package univaq.progetto;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pag15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag15);

        ImageView stemma=findViewById(R.id.imageView29);

        TextView titolo=findViewById(R.id.textView43);

        ImageView foto1=findViewById(R.id.imageView33);
        ImageView foto2=findViewById(R.id.imageView31);
        ImageView foto3=findViewById(R.id.imageView32);

        TextView testo=findViewById(R.id.textView44);

        ImageView geom=findViewById(R.id.imageView34);

        View v1=findViewById(R.id.view23);
        Intent intent=getIntent();

        final FloatingActionButton second15= findViewById(R.id.backbtnpag15);
        second15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SecondaPagIn.class);
                startActivity(intent);
            }
        });
    }
}
