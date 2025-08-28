import br.com.mariojp.solid.dip.EmailNotifier;
import br.com.mariojp.solid.dip.User;

public class Main {
    public static void main(String[] args) {
        System.setProperty("DRY_RUN", "true"); // evita SMTP real
        var notifier = EmailNotifier.create(); // usa factory method
        notifier.welcome(new User("Ana", "ana@example.com"));
        System.out.println("Email enviado!");
    }
}
