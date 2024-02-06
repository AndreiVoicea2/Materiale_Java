import java.io.*;
import java.util.Arrays;

public class FileReadingHandler implements Runnable {
    static Restaurant[] res = new Restaurant[15];

    static public Restaurant[] ReadFromCSV()
    {
        int index = 0;
        String path = System.getProperty("user.dir") + "/src/restaurants.csv";

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            reader.readLine();

            while((line = reader.readLine()) != null)
            {
                try
                {
                    String[] lineParts = line.split(", ");
                    if(lineParts.length == 8) {
                        Restaurant restaurant = new Restaurant(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2], lineParts[3], Integer.parseInt(lineParts[4]), Integer.parseInt(lineParts[5]), Float.parseFloat(lineParts[6]), Float.parseFloat(lineParts[7]));
                        res[index] = restaurant;
                        index++;
                    }
                    else
                    {

                        Restaurant restaurant = new Restaurant(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2], lineParts[3], Integer.parseInt(lineParts[5]), Integer.parseInt(lineParts[6]), Float.parseFloat(lineParts[7]), Float.parseFloat(lineParts[8]));
                        res[index] = restaurant;
                        index++;
                    }



                }catch(NumberFormatException e)
                {

                    e.getCause();

                }

            }

        }catch(IOException e)
        {

            throw new RuntimeException();

        }

        return res;
    }

    @Override
    public void run()
    {
        Restaurant[] restaurants = FileReadingHandler.ReadFromCSV();
        String path = System.getProperty("user.dir") + "/src/output.txt";


        try {

            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Arrays.sort(restaurants);

            for(int i = 0; i< restaurants.length; i++)
            {

                bufferedWriter.write(restaurants[i].toString());
                bufferedWriter.newLine();

            }

            bufferedWriter.close();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }


    }

}
