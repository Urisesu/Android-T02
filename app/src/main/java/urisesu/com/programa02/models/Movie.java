package urisesu.com.programa02.models;

/**
 * Created by Titanium on 09/04/16.
 */
public class Movie {
    private String title, description;
    private String poster, thumbnail;
    private double popularity, rate;

    public Movie(){
        super();
    }

    public Movie(String title, String description, String poster, String thumbnail, double popularity, double rate) {
        this.title = title;
        this.description = description;
        this.poster = poster;
        this.thumbnail = thumbnail;
        this.popularity = popularity;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
