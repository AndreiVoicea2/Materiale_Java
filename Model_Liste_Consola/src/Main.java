import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileReader;

public class Main{

static List<Restaurant> RestaurantList = new ArrayList();



    public static void main(String[] args) {

        Thread csvThread = new Thread(new ReadFile());
        csvThread.start();
        try {
            csvThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}