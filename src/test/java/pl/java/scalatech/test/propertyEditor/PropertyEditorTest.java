package pl.java.scalatech.test.propertyEditor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.test.propertyEditor.config.PropertyConfig;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PropertyConfig.class)
public class PropertyEditorTest {



    @Test
    public void shouldContextBootstrap() {

    }

}
