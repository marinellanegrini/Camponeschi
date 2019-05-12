package univaq.progetto.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import univaq.progetto.R;

public class Adapter extends BaseAdapter {
    private int[] data;
    private final Context mContext;

    public Adapter(Context context, int[] data) {
        this.mContext=context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return this.data.length;
    }

    @Override
    public Object getItem(int position) {
        return this.data[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.adapter, parent, false);
            holder = new ViewHolder();

            holder.image = convertView.findViewById(R.id.image);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Object imm = getItem(position);
        holder.image.setImageResource((int) imm);


        return convertView;
    }

    class ViewHolder {
        ImageView image;
    }


    }

