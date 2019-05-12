package univaq.progetto;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import univaq.progetto.database.Object1;
import univaq.progetto.database.RDatabase;

public class activity1783 extends AppCompatActivity {
    Object1 obj=new Object1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1783);

        Intent intent=getIntent();
        final long id=intent.getLongExtra("id",0);
        final long ids[] =new long[1];
        ids[0]=id;

        List<Object1> list=RDatabase.getInstance(getApplicationContext()).getObjectDao().loadAllByIds(ids);
        obj=list.get(0);


        ImageView stemma=findViewById(R.id.stemma1783);

        TextView titolo=findViewById(R.id.titolo1783);
        titolo.setText(obj.getTitle());

        ImageView foto=findViewById(R.id.foto1783);
       foto.setImageResource(obj.getImages().get(0).getImg());

        TextView data=findViewById(R.id.data1783);
        data.setText(""+obj.getDate());

        ImageView geom=findViewById(R.id.geom1783);

        TextView desfoto=findViewById(R.id.desfoto1783);
        desfoto.setText(obj.getImages().get(0).getDid());

        TextView desdata=findViewById(R.id.desdata1783);
        desdata.setText(obj.getDescription());

        TextView testo=findViewById(R.id.testo1783);
        testo.setText(obj.getText());

        View v1=findViewById(R.id.view17831);
        View v2=findViewById(R.id.view17832);
        View v3=findViewById(R.id.view17833);


        final FloatingActionButton button5= findViewById(R.id.backbtn1783);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
