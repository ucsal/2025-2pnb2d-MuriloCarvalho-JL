package br.com.mariojp.solid.dip;

public class NoopMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("[DRY_RUN] Email não enviado para " + to);
    }
}
