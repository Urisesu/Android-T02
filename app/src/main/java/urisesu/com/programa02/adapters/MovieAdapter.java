package urisesu.com.programa02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import urisesu.com.programa02.R;
import urisesu.com.programa02.models.Movie;

/**
 * Created by Titanium on 09/04/16.
 */
public class MovieAdapter extends ArrayAdapter<List<Movie>>{

    private List<Movie> lista;
    private Context context;

    public MovieAdapter(Context context, List<Movie> objects) {
        super(context, R.layout.item_list);
        this.context = context;
        lista = objects;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
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
}
