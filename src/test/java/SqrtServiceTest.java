import org.junit.Assert;
import org.junit.Test;
import spring.app1.test.weather.services.sqrtService;

public class SqrtServiceTest {


    @Test
    public void shouldCalcExact() {

        sqrtService service = new sqrtService();
        int expectd = 5;
        int actual = service.calcSqrt(25);


    }

    @Test
    public void shouldCalcInexact() {
        sqrtService service = new sqrtService();
        int expectd = 6;
        int actual = service.calcSqrt(27);



    }



        }
