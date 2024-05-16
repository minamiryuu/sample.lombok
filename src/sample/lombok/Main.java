package sample.lombok;

import lombok.Data;

@Data
public class Main {

    public static void main(String... args) {
        Main m = new Main();

        m.setString("Hello Lombok!!");
        m.setNumber(999);

        System.out.println(m);
    }

    private String string;
    private int number;
}
