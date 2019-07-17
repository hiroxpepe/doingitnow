
package net.studiomeowtoon.hoge.lib;

import java.util.function.Supplier;

public class Hoge implements Supplier<String> {
    @Override
    public String get() {
        return "Hi, I'm a Hoge :D";
    }
}
