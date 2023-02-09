import java.util.Random;

public class ArrayMixer {

    private static final Random random = new Random();

    public static <T> void mixer(T[] array) {

        for(int iteration = 0; iteration < array.length/2; iteration++){

            int i = random.nextInt(array.length);
            int j = random.nextInt(array.length);

            T temp = array[i];

            array[i] = array[j];
            array[j] = temp;
        }
    }
}
