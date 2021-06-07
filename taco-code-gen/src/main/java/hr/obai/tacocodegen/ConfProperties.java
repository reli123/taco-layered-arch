package hr.obai.tacocodegen;

import lombok.Getter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Getter
public class ConfProperties {
    private Properties configProperties;

    private String basePackage;

    public ConfProperties() {
        init();
        basePackage = configProperties.getProperty("taco.base-package");
    }

    private void init() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties");
        configProperties = new Properties();
        try {
            configProperties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        configProperties.getProperty("taco.base-package");
    }
}
