import org.junit.Test;

import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayMixerTest {

    private final Integer[] array = {1,2,3,4,5,6,7};
    private final String[] arrayS = {"1","2","ghdn","ll4","5","xxx","\\"};


    @Test
    public void arrayShouldMixInteger(){

        Integer[] ARRAY = array.clone();

        assertThat(array).isEqualTo(ARRAY);
        System.out.println(Arrays.toString(ARRAY));

        ArrayMixer.mixer(array);

        assertThat(array).isNotEqualTo(ARRAY);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void arrayShouldMixString(){

        String[] ARRAY = arrayS.clone();

        assertThat(arrayS).isEqualTo(ARRAY);
        System.out.println(Arrays.toString(ARRAY));

        ArrayMixer.mixer(arrayS);

        assertThat(arrayS).isNotEqualTo(ARRAY);
        System.out.println(Arrays.toString(arrayS));
    }
}
