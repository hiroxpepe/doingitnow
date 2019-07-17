package net.studiomeowtoon.hoge;

import java.util.function.Supplier;
import net.studiomeowtoon.hoge.lib.Hoge;

public class Main {
    public static void main(String[] args) {
        Supplier<String> _h = new Hoge();
        System.out.println(_h.get());
    }
}
