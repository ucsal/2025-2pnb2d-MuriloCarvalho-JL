package br.com.mariojp.solid.dip;

public class EmailNotifier {
    private final MailSender sender;

    public EmailNotifier(MailSender sender) {
        this.sender = sender;
    }

    public void welcome(User user) {
        sender.send(user.email(), "Bem-vindo", "Olá " + user.name());
    }

    public static EmailNotifier create() {
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
            return new EmailNotifier(new NoopMailSender());
        } else {
            return new EmailNotifier(new SmtpMailSender());
        }
    }
}
