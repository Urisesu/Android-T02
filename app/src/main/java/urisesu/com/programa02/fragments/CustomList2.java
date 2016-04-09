package urisesu.com.programa02.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import urisesu.com.programa02.R;
import urisesu.com.programa02.adapters.CustomListAdapterViewHolder;
import urisesu.com.programa02.models.Car;

/**
 * Created by Titanium on 09/04/16.
 */
public class CustomList2 extends Fragment{

    private ListView lista;
    private Car[] carros = new Car[]{
            new Car(R.drawable.carro1,"Carro1","Descripcion 1",1),
            new Car(R.drawable.carro2,"Carro2","Descripcion 2",2),
            new Car(R.drawable.carro3,"Carro3","Descripcion 3",3)
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lista_personalizada,container,false);

        lista = (ListView) view.findViewById(R.id.lista_personalizada);
        CustomListAdapterViewHolder adapterViewHolder = new CustomListAdapterViewHolder(
                getContext(),carros
        );
        lista.setAdapter(adapterViewHolder);

        return view;
    }
}
