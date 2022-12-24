package task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.List;

public class MailBox {
    private final MailSender mailSender = new MailSender();
    private List<MailInfo> infos;

    public void addMailInfo(MailInfo newMailInfo) {
        infos.add(newMailInfo);
    }

    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (MailInfo mailInfo:infos) {
            mailSender.sendmail(mailInfo);
        }
    }
}
