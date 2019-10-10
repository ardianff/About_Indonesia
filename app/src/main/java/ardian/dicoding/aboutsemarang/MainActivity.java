package ardian.dicoding.aboutsemarang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){
        ArrayList<Model>models= new ArrayList<>();
        Model m = new Model();
        m.setTitle("Pulau Komodo");
        m.setDescription("Sesuai dengan namanya, Pulau Komodo merupakan pulau yang juga menjadi habitat hewan langkah di negeri ini.");
        m.setImg(R.drawable.komodo);
        models.add(m);

        m = new Model();
        m.setTitle("Candi Borobudur");
        m.setDescription("Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia.");
        m.setImg(R.drawable.borobudur);
        models.add(m);

        m = new Model();
        m.setTitle("Klenteng Sam Poo Kong");
        m.setDescription("Kelenteng Sam Po Kong merupakan bekas tempat persinggahan dan pendaratan pertama seorang Laksamana Tiongkok yang bernama Zheng He / Cheng Ho.");
        m.setImg(R.drawable.sampokong);
        models.add(m);

        m = new Model();
        m.setTitle("Danau Toba");
        m.setDescription("Danau Toba adalah danau alami berukuran besar di Indonesia yang berada di kaldera Gunung Berapi Super.");
        m.setImg(R.drawable.danau);
        models.add(m);

        m = new Model();
        m.setTitle("Monumen Nasional");
        m.setDescription("Monumen Nasional atau Monas adalah monumen peringatan setinggi 132 meter (433 kaki) yang didirikan untuk mengenang perlawanan dan perjuangan rakyat Indonesia,");
        m.setImg(R.drawable.monas);
        models.add(m);

        m = new Model();
        m.setTitle("Malioboro");
        m.setDescription("Jalan Malioboro adalah nama salah satu kawasan jalan dari tiga jalan di Kota Yogyakarta yang membentang dari Tugu Yogyakarta hingga ke perempatan Kantor Pos Yogyakarta.");
        m.setImg(R.drawable.malioboro);
        models.add(m);

        m = new Model();
        m.setTitle("Pantai Pangandaran");
        m.setDescription("Pantai Pangandaran merupakan salah satu pantai di Jawa Barat yang terkenal karena keindahan dari pemandangan yang diberikan, tidak sedikit wisatawan yang datang ke pantai ini selama musim liburan.");
        m.setImg(R.drawable.pantai);
        models.add(m);

        m = new Model();
        m.setTitle("Pantai Kuta");
        m.setDescription("Pantai Kuta adalah sebuah tempat pariwisata yang terletak kecamatan Kuta, sebelah selatan Kota Denpasar, Bali, Indonesia.");
        m.setImg(R.drawable.kuta);
        models.add(m);

        m = new Model();
        m.setTitle("Lawang Sewu");
        m.setDescription("Lawang Sewu adalah gedung gedung bersejarah di Indonesia yang berlokasi di Kota Semarang, Jawa Tengah.");
        m.setImg(R.drawable.lawang);
        models.add(m);

        m = new Model();
        m.setTitle("Raja Ampat");
        m.setDescription("Secara umum, Raja Ampat adalah kepulauan yang terdiri dari banyak sekali pulau karang dan tersebar luas di seluruh wilayahnya.");
        m.setImg(R.drawable.raja);
        models.add(m);

        m = new Model();
        m.setTitle("About Me");
        m.setDescription("Nama : Ardian Ferdy Firmansyah");
        m.setImg(R.drawable.me);
        models.add(m);
        return models;
    }
//    public void quit (View view){
//        moveTaskToBack(true);
//        android.os.Process.killProcess(android.os.Process.myPid());
//        System.exit(1);
//    }
}
