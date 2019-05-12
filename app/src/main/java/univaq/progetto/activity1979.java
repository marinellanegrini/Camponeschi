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

public class activity1979 extends AppCompatActivity {
    Object1 obj=new Object1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1979);

        Intent intent=getIntent();
        final long id=intent.getLongExtra("id",0);
        final long ids[] =new long[1];
        ids[0]=id;

        List<Object1> list=RDatabase.getInstance(getApplicationContext()).getObjectDao().loadAllByIds(ids);
        obj=list.get(0);


        ImageView stemma=findViewById(R.id.stemma1979);

        TextView titolo=findViewById(R.id.titolo1979);
        titolo.setText(obj.getTitle());

        ImageView foto=findViewById(R.id.foto1979);
        foto.setImageResource(obj.getImages().get(0).getImg());

        TextView data=findViewById(R.id.data1979);
        data.setText(""+obj.getDate());

        ImageView geom=findViewById(R.id.geom1979);

        TextView desdata=findViewById(R.id.desdata1979);
        desdata.setText(obj.getDescription());

        TextView desfoto=findViewById(R.id.desfoto1979);
        desfoto.setText(obj.getImages().get(0).getDid());

        TextView testo=findViewById(R.id.testo1979);
        testo.setText(obj.getText());

        View v1=findViewById(R.id.view19791);
        View v2=findViewById(R.id.view19792);
        View v3=findViewById(R.id.view19793);


        final FloatingActionButton button8= findViewById(R.id.backbtn1979);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
