package example.ahmed.recyclerview_example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ahmed on 27/03/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {


    ArrayList<ImageData> list = new ArrayList<>();


    RecyclerAdapter(ArrayList<ImageData> list){

        this.list = list;
    }


    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_layout, parent, false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.MyViewHolder holder, int position) {


        ImageData data = list.get(position);

        holder.bindData(data);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder{


        TextView t1,t2;
        CheckBox checkBox;
        ImageView imageView;


        public MyViewHolder(View v) {
            super(v);


            t1 = (TextView) v.findViewById(R.id.textView);
            t2 = (TextView) v.findViewById(R.id.textView2);

            checkBox = (CheckBox) v.findViewById(R.id.checkBox);
            imageView = (ImageView) v.findViewById(R.id.imageView);
        }


        public void bindData( ImageData obj){


            t1.setText(obj.title);
            t2.setText(obj.description);
        }
    }

}
