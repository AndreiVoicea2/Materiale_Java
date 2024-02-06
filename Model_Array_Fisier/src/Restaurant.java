public class Restaurant implements Comparable<Restaurant> {

    private int ID;

    private String NAME;

    private String CUISINE;

    private String LOCATION;

    private int OPEN_YEAR;

    private int NO_SEATS;

    private float AVERAGE_MEAL_PRICE;

    private float RATING;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCUISINE() {
        return CUISINE;
    }

    public void setCUISINE(String CUISINE) {
        this.CUISINE = CUISINE;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public int getOPEN_YEAR() {
        return OPEN_YEAR;
    }

    public void setOPEN_YEAR(int OPEN_YEAR) {
        this.OPEN_YEAR = OPEN_YEAR;
    }

    public int getNO_SEATS() {
        return NO_SEATS;
    }

    public void setNO_SEATS(int NO_SEATS) {
        this.NO_SEATS = NO_SEATS;
    }

    public float getAVERAGE_MEAL_PRICE() {
        return AVERAGE_MEAL_PRICE;
    }

    public void setAVERAGE_MEAL_PRICE(float AVERAGE_MEAL_PRICE) {
        this.AVERAGE_MEAL_PRICE = AVERAGE_MEAL_PRICE;
    }

    public float getRATING() {
        return RATING;
    }

    public void setRATING(float RATING) {
        this.RATING = RATING;
    }

    public Restaurant(int ID, String NAME, String CUISINE, String LOCATION, int OPEN_YEAR, int NO_SEATS, float AVERAGE_MEAL_PRICE, float RATING) {
        this.ID = ID;
        this.NAME = NAME;
        this.CUISINE = CUISINE;
        this.LOCATION = LOCATION;
        this.OPEN_YEAR = OPEN_YEAR;
        this.NO_SEATS = NO_SEATS;
        this.AVERAGE_MEAL_PRICE = AVERAGE_MEAL_PRICE;
        this.RATING = RATING;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", CUISINE='" + CUISINE + '\'' +
                ", LOCATION='" + LOCATION + '\'' +
                ", OPEN_YEAR=" + OPEN_YEAR +
                ", NO_SEATS=" + NO_SEATS +
                ", AVERAGE_MEAL_PRICE=" + AVERAGE_MEAL_PRICE +
                ", RATING=" + RATING +
                '}';
    }

    @Override
    public int compareTo(Restaurant res)
    {

        if(this.OPEN_YEAR < res.getOPEN_YEAR())
            return -1;
        else if(this.OPEN_YEAR == res.getOPEN_YEAR())
            return 0;

        return 1;
    }
}
