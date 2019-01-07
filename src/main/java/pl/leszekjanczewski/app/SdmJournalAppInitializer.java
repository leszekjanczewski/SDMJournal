package pl.leszekjanczewski.app;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class SdmJournalAppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(SdmJournalAppConfig.class);
        annotationConfigWebApplicationContext.setServletContext(servletContext);
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("dispatcher", new DispatcherServlet(annotationConfigWebApplicationContext));
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");
    }

}

