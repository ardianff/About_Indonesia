package ardian.dicoding.aboutsemarang;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {
    myHolder.mTitle.setText(models.get(i).getTitle());
    myHolder.mDesc.setText(models.get(i).getDescription());
    myHolder.mImaeView.setImageResource(models.get(i).getImg());

    //Satu Activity
//    myHolder.setItemClickListener(new ItemClickListener() {
//        @Override
//        public void onItemClickListener(View v, int position) {
//
//            String gTitle= models.get(position).getTitle();
//            String gDesc= models.get(position).getDescription();
//            BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();
//
//            Bitmap bitmap = bitmapDrawable.getBitmap();
//
//            ByteArrayOutputStream stream = new ByteArrayOutputStream();
//
//            bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
//            byte[] bytes = stream.toByteArray();
//
//            Intent intent = new Intent(c, AnotherActivity.class);
//            intent.putExtra("iTitle", gTitle);
//            intent.putExtra("iDesc", gDesc);
//            intent.putExtra("iImage", bytes);
//            c.startActivity(intent);
//
//        }
//    });

    //Lebih dari satu
       myHolder.setItemClickListener(new ItemClickListener() {
           @Override
           public void onItemClickListener(View v, int position) {
               if(models.get(position).getTitle().equals("Pulau Komodo")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, PulauKomodoAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               } if(models.get(position).getTitle().equals("Candi Borobudur")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, CandiAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               } if(models.get(position).getTitle().equals("Klenteng Sam Poo Kong")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, SampokongAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               } if(models.get(position).getTitle().equals("Danau Toba")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, DanauAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               } if(models.get(position).getTitle().equals("Monumen Nasional")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, MonasAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               } if(models.get(position).getTitle().equals("Malioboro")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, MalioboroAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               } if(models.get(position).getTitle().equals("Pantai Pangandaran")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, PantaiAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               } if(models.get(position).getTitle().equals("Pantai Kuta")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, KutaAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               } if(models.get(position).getTitle().equals("Lawang Sewu")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, LawangAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               } if(models.get(position).getTitle().equals("Raja Ampat")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, RajaAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               }if(models.get(position).getTitle().equals("About Me")){
                   //can move another acitivty from if body
                   String gTitle= models.get(position).getTitle();
                   String gDesc= models.get(position).getDescription();
                   BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImaeView.getDrawable();

                   Bitmap bitmap = bitmapDrawable.getBitmap();

                   ByteArrayOutputStream stream = new ByteArrayOutputStream();

//                   bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                   byte[] bytes = stream.toByteArray();

                   Intent intent = new Intent(c, AboutAct.class);
                   intent.putExtra("iTitle", gTitle);
                   intent.putExtra("iDesc", gDesc);
                   intent.putExtra("iImage", bytes);
                   c.startActivity(intent);
               }
           }
       });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
