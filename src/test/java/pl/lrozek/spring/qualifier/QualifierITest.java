package pl.lrozek.spring.qualifier;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.lrozek.spring.qualifier.config.Bootstrap;
import pl.lrozek.spring.qualifier.service.Service;

@ContextConfiguration(classes = Bootstrap.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class QualifierITest {

    @Test
    public void itShouldReturnDifferentValues4DifferntProviders() throws Exception {
        // given

        // when
        Long value1 = service1.getValue();

        // then
        assertThat( value1, is( 10L ) );
    }

    @Autowired
    private Service service1;

}
