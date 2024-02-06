

public class Main {


    public static void main(String[] args) {

        Thread csvThread = new Thread(new FileReadingHandler());
        csvThread.start();

        try {
            csvThread.join();
        }catch (InterruptedException e)
        {

            throw new RuntimeException(e);

        }
    }
}