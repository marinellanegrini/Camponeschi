package univaq.progetto;

import univaq.progetto.R;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import univaq.progetto.database.Image;
import univaq.progetto.database.Object1;
import univaq.progetto.database.RDatabase;
import univaq.progetto.utility.Settings;


public class MainActivity extends AppCompatActivity {

    private Integer[] array_bottone={
            R.drawable.slide121,
            R.drawable.slide122,
            R.drawable.imm13,
            R.drawable.imm151,
            R.drawable.imm152,
            R.drawable.imm153,
            R.drawable.immp161,
            R.drawable.immp164,
            R.drawable.immp162,
            R.drawable.immp163,
            R.drawable.immp17,
            R.drawable.immp182,
            R.drawable.immp181,
            R.drawable.immp141,
            R.drawable.immp142,
            R.drawable.immp143,
            R.drawable.immp144,
            R.drawable.immp145,
            R.drawable.immp146,
            R.drawable.immp147,
            R.drawable.immp148,
    };

    private ArrayList<Object1> oggetti=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();

        ImageView image=findViewById(R.id.imageView);
        TextView Title=findViewById(R.id.textView);

        final ImageView immagine= findViewById(R.id.imageView10);
        final Random random=new Random();


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                int randomNum = random.nextInt(array_bottone.length);

                final Bitmap image2 = BitmapFactory.decodeResource(getResources(), array_bottone[randomNum]);

                immagine.setImageBitmap(getCroppedBitmap(image2));

                handler.postDelayed(this, 2000);

            }
        }, 2000);

        immagine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SecondaPagIn.class);
                startActivity(intent);
            }
        });

        //a questo punto posso prendere i dati dal DB
        loadDataFromDB();

        Intent intentback=getIntent();

    }

    private void loadDataFromDB()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<Object1> data = RDatabase.getInstance(getApplicationContext())
                       .getObjectDao().getAllObjects();

                oggetti.addAll(data);


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        final Object1 obj0 = oggetti.get(0);
                        TextView data0 = findViewById(R.id.textView2);
                        data0.setText(String.valueOf(obj0.getDate()));
                        TextView descrizione0 = findViewById(R.id.textView9);
                        descrizione0.setText(obj0.getDescriptionmain());

                        final Object1 obj1 = oggetti.get(1);
                        TextView data1 = findViewById(R.id.textView3);
                        data1.setText(String.valueOf(obj1.getDate()));
                        TextView descrizione1 = findViewById(R.id.textView10);
                        descrizione1.setText(obj1.getDescriptionmain());

                        final Object1 obj2 = oggetti.get(2);
                        TextView data2 = findViewById(R.id.textView4);
                        data2.setText(String.valueOf(obj2.getDate()));
                        TextView descrizione2 = findViewById(R.id.textView11);
                        descrizione2.setText(obj2.getDescriptionmain());

                        final Object1 obj3 = oggetti.get(3);
                        TextView data3 = findViewById(R.id.textView5);
                        data3.setText(String.valueOf(obj3.getDate()));
                        TextView descrizione3 = findViewById(R.id.textView12);
                        descrizione3.setText(obj3.getDescriptionmain());

                        final Object1 obj4 = oggetti.get(4);
                        TextView data4 = findViewById(R.id.textView6);
                        data4.setText(String.valueOf(obj4.getDate()));
                        TextView descrizione4 = findViewById(R.id.textView13);
                        descrizione4.setText(obj4.getDescriptionmain());

                        final Object1 obj5 = oggetti.get(5);
                        TextView data5 = findViewById(R.id.textView7);
                        data5.setText(String.valueOf(obj5.getDate()));
                        TextView descrizione5 = findViewById(R.id.textView14);
                        descrizione5.setText(obj5.getDescriptionmain());

                        final Object1 obj6 = oggetti.get(6);
                        TextView data6 = findViewById(R.id.textView8);
                        data6.setText(String.valueOf(obj6.getDate()));
                        TextView descrizione6 = findViewById(R.id.textView15);
                        descrizione6.setText(obj6.getDescriptionmain());

                        final Object1 obj7 = oggetti.get(7);
                        TextView data7 = findViewById(R.id.textView16);
                        data7.setText(String.valueOf(obj7.getDate()));
                        TextView descrizione7 = findViewById(R.id.textView17);
                        descrizione7.setText(obj7.getDescriptionmain());


                        final View primadata = findViewById(R.id.view10);
                        primadata.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent= new Intent(getApplicationContext(), activity1483.class);
                                intent.putExtra("id",obj0.getId());
                                startActivity(intent);
                            }
                        });

                        final View secondadata= findViewById(R.id.view11);
                        secondadata.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent= new Intent(getApplicationContext(), activity1494.class);
                                intent.putExtra("id",obj1.getId());
                                startActivity(intent);
                            }
                        });

                        final View terzadata= findViewById(R.id.view12);
                        terzadata.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent= new Intent(getApplicationContext(), activity1596.class);
                                intent.putExtra("id",obj2.getId());
                                startActivity(intent);
                            }
                        });

                        final View quartadata= findViewById(R.id.view13);
                        quartadata.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent= new Intent(getApplicationContext(), activity1769.class);
                                intent.putExtra("id",obj3.getId());
                                startActivity(intent);
                            }
                        });

                        final View quintadata= findViewById(R.id.view14);
                        quintadata.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent= new Intent(getApplicationContext(), activity1783.class);
                                intent.putExtra("id",obj4.getId());
                                startActivity(intent);
                            }
                        });

                        final View sestadata= findViewById(R.id.view15);
                        sestadata.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent= new Intent(getApplicationContext(), activity1827.class);
                                intent.putExtra("id",obj5.getId());
                                startActivity(intent);
                            }
                        });

                        final View settimadata= findViewById(R.id.view16);
                        settimadata.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent= new Intent(getApplicationContext(), activity1926.class);
                                intent.putExtra("id",obj6.getId());
                                startActivity(intent);
                            }
                        });

                        final View ottavadata= findViewById(R.id.view18);
                        ottavadata.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent= new Intent(getApplicationContext(), activity1979.class);
                                intent.putExtra("id",obj7.getId());
                                startActivity(intent);
                            }
                        });

                    }
                });


            }
        }).start();
    }

    public Bitmap getCroppedBitmap (Bitmap bitmap) {

        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(output);

        final Paint paint = new Paint();


        paint.setAntiAlias(true);

        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0, 0, paint);
        return output;
    }






}
