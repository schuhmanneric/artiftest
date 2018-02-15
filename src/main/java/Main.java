import org.apache.commons.lang3.StringUtils;

import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            prop.load(Main.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        String configString = prop.getProperty("devops.config");


        configString = StringUtils.upperCase(configString);
        System.out.println((configString));

    }

}
