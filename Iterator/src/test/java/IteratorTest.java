import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


public class IteratorTest {
    @Test
    public void shouldPassIterator() {

        IntIterator iterator = new IntIterator();
        for (int i = 0; i < 10; i++) {
            int[] tab = new int[10];
            for (int j = 0; j < 10; j++) {
                tab[j] = 5+i;

            }
            iterator.addObject(tab);

            assertNotNull(iterator.getElement());
        }

    }
    }
