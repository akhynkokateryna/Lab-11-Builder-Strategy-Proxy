package task2;

public class GreetingMail implements MailCode{
        private static final String TEMPLATE = "%Name, Happy Birthday! Hope your dreams come true";
        @Override
        public String generate(Client client) {
            return TEMPLATE.replace("%Name", client.getName());
        }
}
