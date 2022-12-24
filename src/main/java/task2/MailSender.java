package task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    public void sendmail(MailInfo mailinfo) throws MailjetSocketTimeoutException, MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("b4603113bae9bfaf09b90c8718eb8b89", "fee0b433fbd9a882bb9fd2744e959ff4", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "kateryna.akhynko@ucu.edu.ua")
                                        .put("Name", "Kateryna"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", "kateryna.akhynko@ucu.edu.ua")
                                                .put("Name", "Kateryna")))
                                .put(Emailv31.Message.SUBJECT, "Greetings from Katia.")
                                .put(Emailv31.Message.TEXTPART, "New email")
                                .put(Emailv31.Message.HTMLPART, mailinfo.generate())
                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
