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

/**
 * Created by Titanium on 12/03/16.
 */
public class CustomList extends Fragment{

    private ListView lista;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

        //View view = inflater.inflate(R.layout.fragment_lista_personalizada,container,false);

        //View view = inflater.inflate(R.layout.fragment_lista_personalizada,container,false);
        //lista = (ListView)view.findViewById(R.id.lista_personalizada);

        //return view;
    }
}