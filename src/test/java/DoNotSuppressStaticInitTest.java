import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ClassWithStaticInit.class})
public class DoNotSuppressStaticInitTest {

    @InjectMocks
    ClassWithStaticInit unit = new ClassWithStaticInit();

    @Test
    public void testSuppressingStaticInitializer(){
        assertEquals(unit.getField(), "abc");
    }
}
