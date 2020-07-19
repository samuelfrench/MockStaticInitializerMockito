import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@SuppressStaticInitializationFor({"ClassWithStaticInit"})
@PrepareForTest({ClassWithStaticInit.class})
public class SuppressStaticInitTest {

    @InjectMocks
    ClassWithStaticInit unit = new ClassWithStaticInit();

    @Test
    public void testSuppressingStaticInitializer(){
        assertEquals(unit.getField(), null);
    }
}
