package urisesu.com.programa02.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.*;
import java.util.List;

import urisesu.com.programa02.R;
import urisesu.com.programa02.adapters.MovieAdapter;
import urisesu.com.programa02.listeners.DownloadListener;
import urisesu.com.programa02.models.Movie;
import urisesu.com.programa02.network.NetworkConnection;

/**
 * Created by Titanium on 09/04/16.
 */
public class MovieFragment extends Fragment implements DownloadListener{

    private ListView lista;
    private MovieAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie,container,false);
        NetworkConnection connection = new NetworkConnection(this);
        connection.execute();
        lista = (ListView) view.findViewById(R.id.listaMovies);
        return view;
    }

    @Override
    public void OnSuccessfullyParser(List<Movie> moviews) {
        adapter = new MovieAdapter(getContext(),moviews);
        lista.setAdapter(adapter);
    }
}
