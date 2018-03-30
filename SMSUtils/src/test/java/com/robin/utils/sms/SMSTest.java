package com.robin.utils.sms;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

import com.aliyuncs.exceptions.ClientException;

/**  
 * ClassName:SMSTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月24日 上午10:51:41 <br/>       
 */
public class SMSTest {
    
    @Test
    //读取sms.properties文件
    public void test01() throws IOException
    {
        Properties prop = new Properties();
        prop.load(SMSTest.class.getResourceAsStream("/smstest.properties"));
        String test = prop.getProperty("test");
        System.out.println("test:"+test);
    }
    
    @Test
    public void test02() throws ClientException, IOException {
        SMSUtils.sendSms("13824477873", "321433");
    }

}
  
