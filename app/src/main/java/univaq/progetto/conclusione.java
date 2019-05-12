package univaq.progetto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class conclusione extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conclusione);

        ImageView stemma=findViewById(R.id.stemmacon);

        TextView testo1=findViewById(R.id.testocon1);
        TextView testo2=findViewById(R.id.testocon2);
        TextView testo3=findViewById(R.id.testocon3);

        ImageView foto=findViewById(R.id.fotocon);

        Intent intent=getIntent();
    }
}
