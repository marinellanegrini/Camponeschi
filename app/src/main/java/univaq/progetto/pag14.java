package univaq.progetto;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import univaq.progetto.adapter.Adapter;
import univaq.progetto.adapter.AdapterRecycler;
import univaq.progetto.adapter.ItemClickListener;
import univaq.progetto.database.Image;
import univaq.progetto.R;

public class pag14 extends AppCompatActivity implements ItemClickListener {

    int [] images=new int[8];

    private AdapterRecycler adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag14);

        Intent intent=getIntent();

        TextView titolo=findViewById(R.id.titolop14);

        ImageView stemma=findViewById(R.id.stemmap14);

        TextView testo=findViewById(R.id.testop14);

        ImageView geom=findViewById(R.id.geomp14);

        final ImageView big_image=findViewById(R.id.imageView11);

        final FloatingActionButton second18= findViewById(R.id.backbtnpag14);
        second18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SecondaPagIn.class);
                startActivity(intent);
            }
        });

        images[0]=R.drawable.immp141;
        images[1]=R.drawable.immp142;
        images[2]=R.drawable.immp143;
        images[3]=R.drawable.immp144;
        images[4]=R.drawable.immp145;
        images[5]=R.drawable.immp146;
        images[6]=R.drawable.immp147;
        images[7]=R.drawable.immp148;


        adapter = new AdapterRecycler(images);

        RecyclerView list = findViewById(R.id.gallery);

        list.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        list.setAdapter(adapter);

        adapter.setClickListener(this);

    }

    @Override
    public void onClick(View view, int position)
    {
        ImageView imageView = findViewById(R.id.imageView11);
        imageView.setImageResource(images[position]);
    }

}
