package org.example;

public class Replace implements ReplaceSymbolA, ReplaceSymbolB {
    public void replaceSymbolA (String name) {
        String result = name.replace('a', 'z');
        System.out.println(result);
    }
    public void replaceSymbolB (String name) {
        String result = name.replace('b', 'w');
        System.out.println(result);
    }
}
