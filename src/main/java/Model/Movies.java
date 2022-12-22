package Model;

public class Movies {

    Integer id;
    String name;
    double rating;
    Integer year;

    public Movies(Integer id, String name, double rating, Integer year) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
