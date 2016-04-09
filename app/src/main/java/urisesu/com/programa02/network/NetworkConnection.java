package urisesu.com.programa02.network;

import android.net.Uri;
import android.nfc.Tag;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import urisesu.com.programa02.JSONUtils.JsonParser;
import urisesu.com.programa02.listeners.DownloadListener;
import urisesu.com.programa02.models.Movie;

/**
 * Created by Titanium on 09/04/16.
 */
public class NetworkConnection extends AsyncTask<Void,Void,Boolean>{

    public static final String TAG = NetworkConnection.class.getSimpleName();

    String JSONStr;
    private DownloadListener listener;

    public NetworkConnection(DownloadListener downloadListener){
        this.listener = downloadListener;
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        HttpURLConnection urlConnection;
        BufferedReader reader = null;

        try {
            String urlBase = "http://api.themoviedb.org/3/movie/popular";
            Uri buider = Uri.parse(urlBase)
                    .buildUpon()
                    .appendQueryParameter("api_key", "4878e7d7f855565c2161c9a5267e1654")
                    .appendQueryParameter("page", "1")
                    .build();

            Log.d(TAG,"Request: " + buider.toString());
            URL url = new URL(buider.toString());
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            //Lectura de Input Stream en un String
            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            if(buffer == null){
                Log.e(TAG,"Error: no input stream");
                return false;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));

            //Lectura de buffer
            String line;
            while((line = reader.readLine()) != null){
                buffer.append(line + '\n');
            }

            //Chequeo de datos del servidor
            if(buffer.length() == 0){
                Log.e(TAG,"El buffer está vacío");
                return false;
            }

            //String responseJSON = buffer.toString();
            JSONStr = buffer.toString();
            Log.d(TAG, "Response server: " + JSONStr);

            return true;

        }catch (IOException e){
            e.printStackTrace();
        }


        return false;
    }

    @Override
    protected void onPostExecute(Boolean results) {
        if(results){
            List<Movie> movies = JsonParser.getMovies(JSONStr);
            listener.OnSuccessfullyParser(movies);
            Log.d(TAG, "Parse Data Succefull");
        }
    }
}
