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
 * Created by Titanium on 12/03/16.
 */
public class customListAdapter extends ArrayAdapter<Car>{

    private Car[] carros;
    private Context context;

    public customListAdapter(Context context, int resource, Car[] objects) {
        super(context, R.layout.item_custom_list , objects);
        carros = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.item_custom_list,null);

        ImageView imagenCarro = (ImageView) convertView.findViewById(R.id.imagen);  //check id
        imagenCarro.setImageResource(carros[position].getImagen());

        TextView nombreCarro = (TextView) convertView.findViewById(R.id.textNombre);
        nombreCarro = carros[position].getNombre();

        TextView descriptionCarro = (TextView) convertView.findViewById(R.id); //Check id
        descriptionCarro = carros[position].getDescripcion();

        TextView ratingCarro = (TextView) convertView.findViewById(R.id.textRating);
        ratingCarro.setText(String.valueOf(carros[position].getRating()));

        return convertView;

    }

    @Override
    public int getCount() {
        return carros.length;
    }
}
