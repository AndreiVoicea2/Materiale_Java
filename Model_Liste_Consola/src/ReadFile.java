import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFile implements Runnable {
   static public List<Restaurant> ReadFromFile()
    {
        List<Restaurant> RestaurantList = new ArrayList();

        try {
            String path = System.getProperty("user.dir") + "/restaurants.csv";
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            bufferedReader.readLine();

            while((line = bufferedReader.readLine()) != null)
            {
                try {
                    String lineParts[] = line.split(", ");
                    if(lineParts.length == 8) {
                        Restaurant res = new Restaurant(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2], lineParts[3], Integer.parseInt(lineParts[4]), Integer.parseInt(lineParts[5]), Float.parseFloat(lineParts[6]), Float.parseFloat(lineParts[7]));
                        RestaurantList.add(res);
                    }
                    else
                    {
                        Restaurant res = new Restaurant(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2], lineParts[3], Integer.parseInt(lineParts[5]), Integer.parseInt(lineParts[6]), Float.parseFloat(lineParts[7]), Float.parseFloat(lineParts[8]));
                        RestaurantList.add(res);

                    }

                } catch(NumberFormatException e)
                {

                    e.getCause();

                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return RestaurantList;

    }

    @Override
    public void run()
    {
        List<Restaurant> RestaurantList = ReadFromFile();
        Collections.sort(RestaurantList);
        for(Restaurant r : RestaurantList)
        {

            System.out.println(r);

        }

    }

}
