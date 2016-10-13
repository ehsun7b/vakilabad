package edu.mfldclin.mcrf.vakilabad;

import edu.mfldclin.mcrf.vakilabad.gui.MainFrame;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Ehsun Behravesh <post@ehsunbehravesh.com>
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LogManager.getLogger(Application.class.getName());
    
    public static void main(String[] args) {
        //ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).run(args);
        MainFrame appFrame = context.getBean(MainFrame.class);
        appFrame.setVisible(true);

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            log.debug("bean: " + beanName);
        }
    }

}
