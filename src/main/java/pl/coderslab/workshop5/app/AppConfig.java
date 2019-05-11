package pl.coderslab.workshop5.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("pl.coderslab.workshop5")
@EnableWebMvc
public class AppConfig {
}
