package pl.com.losher.csveditor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class Launcher {

    public void launch() {
        String[] contextPaths = new String[]{"pl/com/losher/csveditor/applicationContext*"};
        new ClassPathXmlApplicationContext(contextPaths);
    }

}
