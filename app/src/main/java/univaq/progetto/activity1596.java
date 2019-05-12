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

public class activity1596 extends AppCompatActivity {
    Object1 obj=new Object1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1596);

        Intent intent=getIntent();
        final long id=intent.getLongExtra("id",0);
        final long ids[] =new long[1];
        ids[0]=id;

        List<Object1> list=RDatabase.getInstance(getApplicationContext()).getObjectDao().loadAllByIds(ids);
        obj=list.get(0);




        ImageView stemma=findViewById(R.id.stemma1596);

        TextView titolo=findViewById(R.id.titolo1596);
        titolo.setText(obj.getTitle());

        ImageView foto1=findViewById(R.id.foto15961);
       foto1.setImageResource(obj.getImages().get(0).getImg());

        ImageView foto2=findViewById(R.id.foto15962);
        foto2.setImageResource(obj.getImages().get(1).getImg());

        TextView data=findViewById(R.id.data1596);
        data.setText(""+obj.getDate());

        TextView desfoto1=findViewById(R.id.desfoto15961);
        desfoto1.setText(obj.getImages().get(0).getDid());

        TextView desfoto2=findViewById(R.id.desfoto15962);
        desfoto2.setText(obj.getImages().get(1).getDid());

        TextView desdata=findViewById(R.id.desdata1596);
        desdata.setText(obj.getDescription());

        TextView testo=findViewById(R.id.testo1596);
        testo.setText(obj.getText());

        ImageView geom=findViewById(R.id.geom1596);


        View v1=findViewById(R.id.view15961);
        View v2=findViewById(R.id.view15962);
        View v3=findViewById(R.id.view15963);


        final FloatingActionButton button3= findViewById(R.id.backbtn1596);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
