package urisesu.com.programa02.JSONUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import urisesu.com.programa02.models.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Titanium on 09/04/16.
 */
public class JsonParser {
    public static List<Movie> getMovies(String JSONStr){
        List<Movie> regreso = new ArrayList<>();

        try{
            JSONObject object = new JSONObject(JSONStr);
            JSONArray array = object.getJSONArray("results");

            for(int i = 0; i < array.length(); i++){
                JSONObject obj = array.getJSONObject(i);
                Movie movie = new Movie();
                movie.setTitle(obj.getString("original_title"));
                movie.setDescription(obj.getString("overview"));

                movie.setPoster(obj.getString("poster_path"));
                //movie.setRate(obj.getString(""));

            }
            return regreso;
        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }
}
