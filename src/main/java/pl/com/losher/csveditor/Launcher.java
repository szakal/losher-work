package pl.com.losher.csveditor;

import org.springframework.context.support.ClassPathXmlApplicationContext;


class Launcher {

    public void launch() {
        //konfiguracja kontekstu springa. Aplikacja uruchamia sie (pokazuje) poprzez wywolanie metody init - w springu.
        String[] contextPaths = new String[]{"pl/com/losher/csveditor/applicationContext*"};
        new ClassPathXmlApplicationContext(contextPaths);
    }

}
