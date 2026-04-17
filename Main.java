import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        Toolkit tk = Toolkit.getDefaultToolkit();
        URL url = new URL("");
        Image image = tk.getImage(url);
    }
}
