package edu.mfldclin.mcrf.vakilabad;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Ehsun Behravesh <post@ehsunbehravesh.com>
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).run(args);
        MainFrame appFrame = context.getBean(MainFrame.class);
        appFrame.setVisible(true);

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            log.debug("bean: " + beanName);
        }
    }

    public static Object createBean(Class clas, String name, ApplicationContext context) throws InstantiationException, IllegalAccessException {
        log.debug("Creating an object of the bean " + clas + " named: " + name);
        Object bean = clas.newInstance();
        
        AutowireCapableBeanFactory factory = context.getAutowireCapableBeanFactory();
        factory.autowireBean(bean);
        factory.initializeBean(bean, name);

        return bean;
    }
}
