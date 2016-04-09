package urisesu.com.programa02.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import urisesu.com.programa02.ContainerEjemplos;
import urisesu.com.programa02.R;
import urisesu.com.programa02.Splah;

/**
 * Created by Titanium on 12/03/16.
 */
public class List extends Fragment{

    private String[] opciones = new String[] {
            "opcion1", "opcion2", "opcion3", "opcion4", "opcion5"
    };
    private ListView lista;
    private ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        opciones = getResources().getStringArray(R.array.opciones);
        //

        lista = (ListView) view.findViewById(R.id.listEjemplos);
        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,opciones);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), ContainerEjemplos.class);
                intent.putExtra("numeroEjemplo", position);
                startActivity(intent);


                if (position == 0) {
                Intent inten = new Intent(getActivity(), Splah.class);
                startActivity(inten);
                } else {
                Intent inten = new Intent(getActivity(), ContainerEjemplos.class);
                inten.putExtra("numeroEjemplo", position);
                startActivity(inten);
                }
            }

        });


        return view;
    }
}
