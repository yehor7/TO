import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StrategyTest {
    @Test
    public void ShouldPassStrategy(){
        Context context = new Context();
        QuickSort q;
        context.QuickS();
        //assertArrayEquals(context.getCurrentSort(), QuickSort.ge);
        assertTrue(context.getCurrentSort().getClass().isAssignableFrom(QuickSort.class));

    }
}
