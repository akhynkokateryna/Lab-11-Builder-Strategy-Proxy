import org.junit.Assert;
import org.junit.Test;
import task2.*;

public class MailsTests {
    @Test
    public void test() {
        Client client = new Client("Katia", 18, Gender.FEMALE);
        GreetingMail greetingMail = new GreetingMail();
        MailInfo mailInfo = new MailInfo(client, greetingMail);
        Assert.assertEquals(mailInfo.generate(), "Katia, Happy Birthday! Hope your dreams come true");
    }
}
