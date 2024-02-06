import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{

    private int ID;
    private String NAME;

    private String CUISINE;

    private String LOCATION;

    private int OPEN_YEAR;

    private int NO_SEATS;

    private float AVERAGE_MEAL_PRICE;

    private float RATING;

    public int GetID() {

        return this.ID;

    }

    public String GetNAME() {

        return this.NAME;

    }

    public String GetCUISINE() {

        return this.CUISINE;

    }

    public String GetLOCATION() {

        return this.LOCATION;

    }

    public int GetOPEN_YEAR() {

        return this.OPEN_YEAR;

    }

    public int GetNO_SEATS() {

        return this.NO_SEATS;

    }

    public float GetAVERAGE_MEAL_PRICE() {

        return this.AVERAGE_MEAL_PRICE;

    }

    public float GetRATING() {

        return this.RATING;

    }

    public void SetID(int ID) {

        this.ID = ID;

    }

    public void SetNAME(String NAME) {

        this.NAME = NAME;

    }

    public void SetCUISINE(String CUISINE) {

        this.CUISINE = CUISINE;

    }

    public void SetLOCATION(String LOCATION) {

        this.LOCATION = LOCATION;

    }

    public void SetOPEN_YEAR(int OPEN_YEAR) {

        this.OPEN_YEAR = OPEN_YEAR;

    }

    public void SetNo_SEATS(int NO_SEATS) {

        this.NO_SEATS = NO_SEATS;

    }

    public void SetAVERAGE_MEAL_PRICE(float AVERAGE_MEAL_PRICE) {

        this.AVERAGE_MEAL_PRICE = AVERAGE_MEAL_PRICE;

    }

    public void SetRATING(float RATING) {

        this.RATING = RATING;

    }

    public Restaurant() {
        this.ID = 0;
        this.NAME = "Default_Name";
        this.CUISINE = "Default_Cuisine";
        this.LOCATION = "Default_Location";
        this.OPEN_YEAR = 0;
        this.NO_SEATS = 0;
        this.AVERAGE_MEAL_PRICE = 0;
        this.RATING = 0;

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

        return "ID: " + ID + " Name: " + NAME + " Cuisine: " + CUISINE + " Location: " + LOCATION + " Open year: " + OPEN_YEAR + " Number of seats: " + NO_SEATS + " Average meal price: " + AVERAGE_MEAL_PRICE + " Rating: " + RATING;

    }

    @Override
    public int compareTo(Restaurant obj)
    {
        if(this.OPEN_YEAR < obj.GetOPEN_YEAR())
            return -1;
        else if(this.OPEN_YEAR == obj.GetOPEN_YEAR())
            return 0;

        return 1;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return ID == that.ID && OPEN_YEAR == that.OPEN_YEAR && NO_SEATS == that.NO_SEATS && Float.compare(AVERAGE_MEAL_PRICE, that.AVERAGE_MEAL_PRICE) == 0 && Float.compare(RATING, that.RATING) == 0 && Objects.equals(NAME, that.NAME) && Objects.equals(CUISINE, that.CUISINE) && Objects.equals(LOCATION, that.LOCATION);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, NAME, CUISINE, LOCATION, OPEN_YEAR, NO_SEATS, AVERAGE_MEAL_PRICE, RATING);
    }
}
