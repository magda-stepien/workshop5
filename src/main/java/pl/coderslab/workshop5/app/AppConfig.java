package pl.coderslab.workshop5.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("pl.coderslab.workshop5")
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "DELETE"); // jak bez kolejnej linii oznacza ze zaakceptuje
        // request z dowolnego źródła
            //    .allowedOrigins("http://localhost");   // spod tego origina będzie aplikacja pobierała dane
    }
}
