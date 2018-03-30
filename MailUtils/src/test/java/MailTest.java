import org.junit.Test;

import com.robin.utils.mail.MailUtils;

/**  
 * ClassName:MailTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月30日 下午7:20:49 <br/>       
 */
public class MailTest {
    @Test
    public void test01()
    {
        MailUtils.sendMail("972389839@qq.com", "测试", "测试邮件");
    }
}
  
