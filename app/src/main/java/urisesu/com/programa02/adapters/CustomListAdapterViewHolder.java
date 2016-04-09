package urisesu.com.programa02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import urisesu.com.programa02.R;
import urisesu.com.programa02.models.Car;

/**
 * Created by Titanium on 09/04/16.
 */
public class CustomListAdapterViewHolder extends ArrayAdapter<Car>{

    private Car[] carros;
    private Context context;

    public CustomListAdapterViewHolder(Context context, Car[] objects) {
        super(context, R.layout.item_custom_list , objects);

        this.carros = objects;
        this.context = context;
    }

    @Override
    public int getCount() {
        return carros.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imagenCarro = null;
        TextView nombreCarro = null;
        TextView descriptionCarro = null;
        TextView rating = null;
        ViewHolder holder;

        if(convertView == null ){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_custom_list,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.imagenCarro.setImageResource(carros[position].getImagen());
        holder.nombreCarro.setText(carros[position].getNombre());
        holder.descriptionCarro.setText(carros[position].getDescripcion());
        holder.rating.setText(String.valueOf(carros[position].getRating()));

        return convertView;

    }

    static class ViewHolder{
        final private ImageView imagenCarro;
        final private TextView nombreCarro, descriptionCarro, rating;

        public ViewHolder(View v){
            imagenCarro = (ImageView) v.findViewById(R.id.imagen);
            nombreCarro = (TextView) v.findViewById(R.id.textNombre);
            descriptionCarro = (TextView) v.findViewById(R.id.textDescription);
            rating = (TextView) v.findViewById(R.id.textRating);
        }
    }

}
