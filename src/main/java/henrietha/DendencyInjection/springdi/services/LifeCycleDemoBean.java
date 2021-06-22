package henrietha.DendencyInjection.springdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleDemoBean implements InitializingBean , DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Lfe cycle terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Life cycle properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context set");
    }

    @PostConstruct
    public void postContruct (){ System.out.println("Post construct annotation called"); }

    @PreDestroy
    public  void preDestroy() { System.out.println("The Predestroy annotated method has been called"); }
    public  void preInit() { System.out.println("Before init, called by Bean post processor"); }
    public  void afterInit() { System.out.println("After init, called by Bean post processor"); }
}
