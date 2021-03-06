package urisesu.com.programa02.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.zip.Inflater;

import urisesu.com.programa02.R;
import urisesu.com.programa02.models.Car;
import urisesu.com.programa02.adapters.customListAdapter;

/**
 * Created by Titanium on 12/03/16.
 */
public class CustomList extends Fragment{

    private ListView lista;
    private Car[] carros = new Car[]{
        new Car(R.drawable.carro1,"Carro1","Descripcion 1",1),
        new Car(R.drawable.carro2,"Carro2","Descripcion 2",2),
        new Car(R.drawable.carro3,"Carro3","Descripcion 3",3)
    };

    private customListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lista_personalizada,container,false);

        lista = (ListView) view.findViewById(R.id.lista_personalizada);
        adapter = new customListAdapter(getContext(),carros);

        lista.setAdapter(adapter);

        return view;
    }
}
