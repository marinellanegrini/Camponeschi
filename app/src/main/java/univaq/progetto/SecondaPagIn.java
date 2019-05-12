package univaq.progetto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondaPagIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconda_pag_in);


        View v1=findViewById(R.id.view40);

        ImageView geom1=findViewById(R.id.imageView50);
        ImageView geom2=findViewById(R.id.imageView51);
        ImageView geom3=findViewById(R.id.imageView52);
        ImageView geom4=findViewById(R.id.imageView53);
        ImageView geom5=findViewById(R.id.imageView54);
        ImageView geom6=findViewById(R.id.imageView55);
        ImageView geom7=findViewById(R.id.imageView56);

        TextView testo1=findViewById(R.id.textView50);
        TextView testo2=findViewById(R.id.textView51);
        TextView testo3=findViewById(R.id.textView52);
        TextView testo4=findViewById(R.id.textView53);
        TextView testo5=findViewById(R.id.textView54);
        TextView testo6=findViewById(R.id.textView55);
        TextView testo7=findViewById(R.id.textView56);

        View v9=findViewById(R.id.view41);
        View v10=findViewById(R.id.view42);
        View v11=findViewById(R.id.view43);
        View v12=findViewById(R.id.view44);
        View v13=findViewById(R.id.view45);
        View v14=findViewById(R.id.view46);
        View v15=findViewById(R.id.view47);




        Intent intent=getIntent();



        final FloatingActionButton second= findViewById(R.id.backseconda);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        final View pag12= findViewById(R.id.view48);
        pag12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), univaq.progetto.pag12.class);
                startActivity(intent);
            }
        });

        final View pag13= findViewById(R.id.view49);
        pag13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), univaq.progetto.pag13.class);
                startActivity(intent);
            }
        });

        final View pag14= findViewById(R.id.view50);
        pag14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), pag14.class);
                startActivity(intent);
            }
        });

        final View pag15= findViewById(R.id.view51);
        pag15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), univaq.progetto.pag15.class);
                startActivity(intent);
            }
        });

        final View pag16= findViewById(R.id.view52);
        pag16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), univaq.progetto.pag16.class);
                startActivity(intent);
            }
        });

        final View pag17= findViewById(R.id.view53);
        pag17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), univaq.progetto.pag17.class);
                startActivity(intent);
            }
        });

        final View pag18= findViewById(R.id.view54);
        pag18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), univaq.progetto.pag18.class);
                startActivity(intent);
            }
        });

    }
}
