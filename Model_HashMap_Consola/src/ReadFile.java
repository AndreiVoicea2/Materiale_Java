import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReadFile implements Runnable {
    static public Map<String, Restaurant> ReadFromFile() {
        Map<String, Restaurant> restaurantMap = new HashMap<>();

        try {
            String path = System.getProperty("user.dir") + "/restaurants.csv";
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                try {
                    String lineParts[] = line.split(", ");
                    if (lineParts.length == 8) {
                        Restaurant res = new Restaurant(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2], lineParts[3], Integer.parseInt(lineParts[4]), Integer.parseInt(lineParts[5]), Float.parseFloat(lineParts[6]), Float.parseFloat(lineParts[7]));
                        restaurantMap.put(res.GetNAME(), res);
                    } else {
                        Restaurant res = new Restaurant(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2], lineParts[3], Integer.parseInt(lineParts[5]), Integer.parseInt(lineParts[6]), Float.parseFloat(lineParts[7]), Float.parseFloat(lineParts[8]));
                        restaurantMap.put(res.GetNAME(), res);
                    }

                } catch (NumberFormatException e) {
                    e.printStackTrace(); // Arată detalii despre excepție în consolă
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return restaurantMap;
    }

    @Override
    public void run() {
        Map<String, Restaurant> restaurantMap = ReadFromFile();

        // Extrage valorile (Restaurantele) din HashMap și adaugă-le într-o listă
        List<Restaurant> sortedRestaurants = restaurantMap.values().stream()
                .sorted((r1, r2) -> Integer.compare(r1.GetOPEN_YEAR(), r2.GetOPEN_YEAR()))
                .collect(Collectors.toList());

        // Afișează restaurantele sortate după anul de deschidere
        for (Restaurant r : sortedRestaurants) {
            System.out.println(r);
        }
    }
}