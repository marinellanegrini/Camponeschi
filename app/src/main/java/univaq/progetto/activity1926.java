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

public class activity1926 extends AppCompatActivity {
    Object1 obj=new Object1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1926);

        Intent intent=getIntent();
        final long id=intent.getLongExtra("id",0);
        final long ids[] =new long[1];
        ids[0]=id;

        List<Object1> list=RDatabase.getInstance(getApplicationContext()).getObjectDao().loadAllByIds(ids);
        obj=list.get(0);


        ImageView stemma=findViewById(R.id.stemma1926);

        TextView titolo=findViewById(R.id.titolo1926);
        titolo.setText(obj.getTitle());

        TextView data=findViewById(R.id.data1926);
        data.setText(""+obj.getDate());

        ImageView foto1=findViewById(R.id.foto19261);
       foto1.setImageResource(obj.getImages().get(0).getImg());

        ImageView foto2=findViewById(R.id.foto19262);
        foto2.setImageResource(obj.getImages().get(1).getImg());

        ImageView foto3=findViewById(R.id.foto19263);
        foto3.setImageResource(obj.getImages().get(2).getImg());

        TextView desfoto1=findViewById(R.id.desfoto19261);
        desfoto1.setText(obj.getImages().get(0).getDid());

        TextView desfoto2=findViewById(R.id.desfoto19262);
        desfoto2.setText(obj.getImages().get(1).getDid());

        TextView desfoto3=findViewById(R.id.desfoto19263);
        desfoto3.setText(obj.getImages().get(2).getDid());

        ImageView geom=findViewById(R.id.geom1926);

        TextView desdata=findViewById(R.id.desdata1926);
        desdata.setText(obj.getDescription());

        TextView testo=findViewById(R.id.testo1926);
        testo.setText(obj.getText());

        View v1=findViewById(R.id.view19261);
        View v2=findViewById(R.id.view19262);
        View v3=findViewById(R.id.view19263);



        final FloatingActionButton button7= findViewById(R.id.backbtn1926);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
