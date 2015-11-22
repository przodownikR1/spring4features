package pl.java.scalatech.test.propertyEditor.config;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {
    @Bean
    PropertyEditorRegistrar myDateRegister() {
        return registry -> registry.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
    }

    @Bean
    CustomEditorConfigurer myConfigurer(PropertyEditorRegistrar propertyEditorRegistrar) {
        CustomEditorConfigurer cec =  new CustomEditorConfigurer();
        PropertyEditorRegistrar [] props = new PropertyEditorRegistrar[] {propertyEditorRegistrar};
        cec.setPropertyEditorRegistrars(props);
        return cec;


    }
}
