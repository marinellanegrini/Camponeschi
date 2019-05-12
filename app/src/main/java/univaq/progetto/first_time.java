package univaq.progetto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

import univaq.progetto.database.Image;
import univaq.progetto.database.Object1;
import univaq.progetto.database.RDatabase;
import univaq.progetto.utility.Settings;


public class first_time extends AppCompatActivity {

    private static final String RECEIVER_CLEAR_COMPLETED = "clear_completed";
    private static final String RECEIVER_SAVE_COMPLETED = "save_completed";

    private ArrayList<Object1> objects = new ArrayList<>();

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {


            String action = intent.getAction();
            switch(action){
                case RECEIVER_CLEAR_COMPLETED:

                    createData();
                    break;
                case RECEIVER_SAVE_COMPLETED:

                    backtoMainActivity();
                    break;
            }

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time);

        IntentFilter filter = new IntentFilter();
        filter.addAction(RECEIVER_CLEAR_COMPLETED);
        filter.addAction(RECEIVER_SAVE_COMPLETED);
        LocalBroadcastManager.getInstance(this).registerReceiver(receiver, filter);

        ImageView stemma = findViewById(R.id.stemmafirsttime);

        //se è la prima volta che apro l'app, salvo su DB
        if (Settings.loadBoolean(getApplicationContext(), Settings.FIRST_TIME, true)) {

            Settings.save(getApplicationContext(), Settings.FIRST_TIME, false);

            clearDataFromDB();
        } else {

            //torno alla main activity
            backtoMainActivity();
        }
    }




    private void backtoMainActivity()
    {
        Runnable run=new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
            }
        };

        Handler handler=new Handler();
        handler.postDelayed(run,5000);
    }

    private void createData(){

        Object1 obj = new Object1();
        obj.setTitle("Le Case Camponeschi");
        obj.setDate(1483);
        obj.setDescription("I CAMPONESCHI ACQUISTANO UNA CASA CON CHIOSTRO E ORTO NELL’AREA IN CUI NASCE IL PALAZZO  ");
        obj.setText("Il Palazzo Camponeschi, che prende il nome dalla prima famiglia che ne volle la costruzione nel XV secolo, si colloca all’interno dell’area simbolicamente e politicamente più importante dell’Aquila tra Medioevo ed Età Moderna. I Camponeschi, titolari della contea di Montorio e protagonisti a metà Quattrocento della vita economica e sociale della città, grazie alla loro liquidità monetaria, comprarono le prime case nell’area in cui sorge ora il Palazzo dell’Università.");
        obj.setDescriptionmain("I CAMPONESCHI REALIZZANO I PRIMI ACQUISTI NELL’AREA IN CUI SORGE IL PALAZZO ");

        Image image = new Image("Lo stemma della famiglia Camponeschi all’interno del Palazzo", R.drawable.im1483);
        obj.getImages().add(image);
        objects.add(obj);

        Object1 obj2=new Object1();
        obj2.setTitle("Il Palazzo della Camera");
        obj2.setDate(1494);
        obj2.setDescription("LE CASE CAMPONESCHI PASSANO ALLA CAMERA AQUILANA (GOVERNO DELLA CITTÀ)");
        obj2.setText("Nel 1494, a causa di debiti contratti dalla famiglia con la Repubblica di Venezia, i Camponeschi persero il “Palazzo“. Le Case Camponeschi passarono alla Camera aquilana, che pagò la somma dovuta alla Serenissima e ne acquisì la proprietà. Pertanto i vari uffici pubblici, per tutto il Cinquecento, rimasero concentrati in questo complesso di edifici, prima che fosse ristrutturata, ad opera di Geronimo Pico Fonticulano, la sede del Capitano nella forma del Palazzo di Margherita d’Austria. Alla fine del XVI secolo, la Camera lasciò i suoi locali alla Compagnia di Gesù e si trasferì nel 1595 nel Palazzo di città.");
        Image image1=new Image("Iscrizione relativa al bimestre di carica del Magistrato (madii et iunii)\n",R.drawable.imm14941);
        Image image2=new Image("Rilievo raffigurante l’aquila, simbolo della municipalità, ad angolo tra via Camponeschi e via Burri\n",R.drawable.imm14942);
        obj2.getImages().add(image1);
        obj2.getImages().add(image2);
        obj2.setDescriptionmain("LE CASE CAMPONESCHI PASSANO ALLA CAMERA AQUILANA ");
        objects.add(obj2);


        Object1 obj3=new Object1();
        obj3.setTitle("L’ Aquilanum Collegium");
        obj3.setDate(1596);
        obj3.setDescription("I GESUITI INAUGURANO IL COLLEGIO AQUILANO");
        obj3.setText("È solo con l’arrivo della Compagnia di Gesù che si produssero nell’isolato profonde trasformazioni, dovute a esigenze spaziali, abitative e didattiche dei Padri. La realizzazione di stanze riservate ai Gesuiti, di aule per gli studenti e di appositi cortili comportò la chiusura di due strade parallele alla via Romana, ma anche il taglio della via Camponeschi, che separò il palazzo dall’edificio riservato alla Congregazione dei Nobili (Palazzetto dei Nobili), secondo il progetto dell’architetto Agazio Stoia del 1625.");
        obj3.getImages().add(new Image("Ritratto del gesuita Sertorio Caputo (1556-1608), promotore del Collegio Aquilano, di cui fu rettore\n",R.drawable.imm15961) );
        obj3.getImages().add( new Image("Il monogramma IHS della Compagnia di Gesù\n",R.drawable.imm15962));
        obj3.setDescriptionmain("I GESUITI INAUGURANO IL COLLEGIO AQUILANO ");
        objects.add(obj3);

        Object1 obj4=new Object1();
        obj4.setTitle("Il Real Collegio");
        obj4.setDate(1769);
        obj4.setDescription("IL PALAZZO, PASSATO NEL 1767 ALL‘AZIENDA GESUITICA,  DAL 1769 OSPITA LE SCUOLE REGIE");
        obj4.setText("Dopo lo scioglimento della Compagnia di Gesù, avvenuto nel 1767, “Palazzo Camponeschi” diede ospitalità alle regie scuole, il Real Collegio, patrocinato dalla Corona Borbonica in sostituzione dei modelli pedagogici gesuitici.");
        obj4.getImages().add(new Image("Archivio di Stato dell’Aquila, Fondo del Preside, Elenco delle Scuole e dei docenti del Regio Collegio nel 1774\n",R.drawable.imm19691) );
        obj4.getImages().add(new Image("Il Marchese Bernardo Tanucci, fautore del progetto di scioglimento della Compagnia di Gesù, destinatario dell’informativa\n",R.drawable.imm19692));
        obj4.setDescriptionmain("DOPO LO SCIOGLIMENTO DELLA COMPAGNIA DI GESÙ, IL PALAZZO OSPITA IL REAL COLLEGIO ");
        objects.add(obj4);

        Object1 obj5=new Object1();
        obj5.setTitle("Palazzo Di Costanzo");
        obj5.setDate(1783);
        obj5.setDescription("I DI COSTANZO, DUCHI DI PAGANICA, ACQUISTANO IL PALAZZO");
        obj5.setText("Nel 1783 Palazzo Camponeschi veniva acquistato da Ignazio Di Costanzo, duca di Paganica, che lo adibì a dimora urbana della sua famiglia: da quel momento l’edificio assumeva la connotazione di palazzo ducale. Gli interni si trasformavano in appartamenti nobiliari: nel 1801 il nuovo duca Ludovico poteva sposarsi, alla presenza del vescovo, nel privato sacello di Palazzo Di Costanzo. A ricordo della presenza dei duchi non resta che un’iscrizione, recentemente restaurata nella stanza sedicesima del piano terreno, che ricorda la nascita di Maddalena, figlia di Ludovico");
        obj5.getImages().add(new Image("Riscrizione con cui Ludovico Di Costanzo (LC) e Lucrezia Carli Benedetti (LCB) celebravano la nascita della figlia Maddalena\n",R.drawable.imm1783) );
        obj5.setDescriptionmain("L’EDIFICIO VIENE ACQUISTATO DAI DUCHI DI COSTANZO ");
        objects.add(obj5);

        Object1 obj6=new Object1();
        obj6.setTitle("Palazzo Spaventa");
        obj6.setDate(1827);
        obj6.setDescription("SUBENTRANO I MARCHESI SPAVENTA");
        obj6.setText("L’edificio fu acquistato nel 1827 dagli Spaventa, marchesi di Gaudio e Sogliano. Palazzo Spaventa reca ancora oggi i segni della presenza della famiglia: emblematico è lo stemma che domina la volta dello scalone monumentale. I marchesi si adoperarono nel fare realizzare, intorno al 1880, una nuova facciata eclettica di gusto manieristico prospiciente via Bafile. Parallelamente, le esigenze finanziarie della famiglia portarono, alla fine dell’Ottocento, alla locazione di parte del Palazzo Spaventa agli Uffici delle Poste e Telegrafo, delle Ipoteche, della Provincia  e ad altri inquilini privati. ");

        obj6.getImages().add(new Image("Lo stemma della famiglia Spaventa in corrispondenza dello scalone monumentale",R.drawable.imm18271) );
        obj6.getImages().add(new Image("La facciata di Palazzo Spaventa su via Andrea Bafile\n",R.drawable.imm18272) );
        obj6.setDescriptionmain("SUBENTRANO I MARCHESI SPAVENTA ");
        objects.add(obj6);

        Object1 obj7=new Object1();
        obj7.setTitle("Il nuovo Collegio-Convitto dei Gesuiti");
        obj7.setDate(1926);
        obj7.setDescription("I GESUITI RIENTRANO ALL’AQUILA");
        obj7.setText("Gli eredi Betti-Spaventa, nel 1926, vendettero l’edificio alla Compagnia di Gesù, che volle fare il suo ritorno all’Aquila proprio nell’antica sede dell’Aquilanum Collegium. Gli interni di “Palazzo Camponeschi”, Collegio-Convitto, subivano ancora una volta mutamenti. I vecchi uffici divennero aule scolastiche, mentre furono creati posti letto e dormitori a uso dei Padri e dei convittori; venivano resi moderni e ristrutturati tetti e pavimenti e, di fronte al numero crescente di alunni, furono realizzate nuove costruzioni lungo il lato settentrionale dell’edificio. ");

        obj7.getImages().add(new Image("Un’aula di lezione",R.drawable.imm19263) );
        obj7.getImages().add(new Image("Il Collegio nel 1938",R.drawable.imm19262) );
        obj7.getImages().add(new Image("Il dormitorio",R.drawable.imm19261) );
        obj7.setDescriptionmain("I GESUITI RIENTRANO ALL’AQUILA ");
        objects.add(obj7);

        Object1 obj8=new Object1();
        obj8.setTitle("L’Università dell’Aquila");
        obj8.setDate(1979);
        obj8.setDescription("IL PALAZZO PASSA ALL’UNIVERSITÀ DELL’AQUILA");
        obj8.setText("In seguito alla nascita dell’Università degli Studi dell’Aquila, la Facoltà di Magistero ottenne come Sede Palazzo Camponeschi, dove rimase anche dopo essersi trasformata, nel 1993, in Facoltà di Lettere e Filosofia. L’ edificio   non smise mai, così, di esercitare il suo ruolo di punto di riferimento della cultura della città. Palazzo Camponeschi ha ospitato la Facoltà di Lettere e Filosofia fino al terremoto del 2009 per poi divenire, al termine dei lavori di restauro, la prestigiosa sede dell’attuale Rettorato");
        obj8.getImages().add(new Image("Lo scalone della Facoltà di Lettere e Filosofia nel 2009",R.drawable.imm1979) );
        obj8.setDescriptionmain("IL PALAZZO PASSA ALL'UNIVERSITÀ DELL'AQUILA ");
        objects.add(obj8);


        new Thread(new Runnable() {
            @Override
            public void run() {

                for(Object1 obj : objects) {

                    RDatabase.getInstance(getApplicationContext()).getObjectDao().save(obj);
                }

                Intent intent = new Intent(RECEIVER_SAVE_COMPLETED);
                LocalBroadcastManager.getInstance(first_time.this).sendBroadcast(intent);
            }
        }).start();

    }

    private void clearDataFromDB()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                RDatabase.getInstance(getApplicationContext()).getObjectDao().deleteAll();

                Intent intent = new Intent(RECEIVER_CLEAR_COMPLETED);
                LocalBroadcastManager.getInstance(first_time.this).sendBroadcast(intent);
            }
        }).start();
    }


}
