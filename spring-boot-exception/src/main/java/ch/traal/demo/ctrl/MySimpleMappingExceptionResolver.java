package ch.traal.demo.ctrl;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

//@Configuration
public class MySimpleMappingExceptionResolver {

  /* methods */
  @Bean
  public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
    SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
    
    Properties mapping = new Properties();
    mapping.put("java.lang.ArithmeticException", "mathError");
    mapping.put("java.lang.NullPointerException", "nullPointerError");
    
    resolver.setExceptionMappings(mapping);
    
    return resolver;
  }
}
