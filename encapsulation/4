class Movie {
    private String name;
    private double rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 0 and 10.");
        }
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
}


public class MovieApp {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setName("Inception");
        movie.setRating(8.8);

        System.out.println("Movie Name: " + movie.getName());
        System.out.println("Rating: " + movie.getRating());
    }
}
