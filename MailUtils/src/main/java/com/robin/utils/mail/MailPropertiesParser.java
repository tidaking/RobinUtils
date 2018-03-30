package com.robin.utils.mail;

import java.io.IOException;
import java.util.Properties;


/**  
 * ClassName:PropertiesParser <br/>  
 * Function:  <br/>  
 * Date:     2018年3月24日 上午11:14:36 <br/>       
 */
public class MailPropertiesParser {
    private static final String properties_file = "/mail.properties";

    public static String parser(String prop) throws IOException
    {
        Properties properties = new Properties();
        properties.load(MailPropertiesParser.class.getResourceAsStream(properties_file));
        String ret = properties.getProperty(prop);
        return ret;
    }
}
  
