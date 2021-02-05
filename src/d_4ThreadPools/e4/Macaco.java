package d_4ThreadPools.e4;

import java.util.Random;

public class Macaco extends Thread {
    private int STRINGLENGTH = 1000;
    private Mesa mesa;
    private int id;

    public Macaco(Mesa mesa, int id) {
        this.mesa = mesa;
        this.id = id;
    }

    private String generateString() {
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < STRINGLENGTH; i++) {
            if (r.nextInt(5) == 0) {
                sb.append(' ');
            } else {
                sb.append(Character.toChars(r.nextInt(26) + 'a'));
            }
        }
        return sb.toString();
    }

    @Override
    public void run() {
        try {
            while (true) {
                mesa.colocarFrase(generateString());
            }
        } catch (InterruptedException e) {

        }
    }
}
