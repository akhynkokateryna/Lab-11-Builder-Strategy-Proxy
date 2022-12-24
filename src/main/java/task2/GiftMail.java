package task2;

public class GiftMail implements MailCode{
    private static final String TEMPLATE = "Black Friday! %Name receive your discount";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%Name", client.getName());
    }
}
