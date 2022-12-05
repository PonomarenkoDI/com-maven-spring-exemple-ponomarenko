package by.maven.spring.exemle.ponomarenko;


import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTest {

@Autowired
@Qualifier ("propertiesReader")
FileProperties fileProperties;

@BeforeAll
    public void readFile (){
    fileProperties.readPropertiesFile();

    }

}

