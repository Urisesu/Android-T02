package urisesu.com.programa02.listeners;

import java.util.List;

import urisesu.com.programa02.models.Movie;

/**
 * Created by Titanium on 09/04/16.
 */
public interface DownloadListener {
    void OnSuccessfullyParser(List<Movie> moviews);

}
