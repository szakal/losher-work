package pl.com.losher.csveditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Launcher {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public void launch() {

        log.info("Starting Spring Application Context.");

        //konfiguracja kontekstu springa. Aplikacja uruchamia sie (pokazuje) poprzez wywolanie metody init - w springu.
        String[] contextPaths = new String[]{"pl/com/losher/csveditor/applicationContext*"};
        new ClassPathXmlApplicationContext(contextPaths);

        log.info("Application has started.");
    }

}
