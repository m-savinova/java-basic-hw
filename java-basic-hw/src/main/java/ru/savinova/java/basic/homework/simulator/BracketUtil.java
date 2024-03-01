package ru.savinova.java.basic.homework.simulator;

public class BracketUtil {
    public static boolean isCorrectBrackets(String input,
                                            char bracketOpenSymbol,
                                            char bracketCloseSymbol) {

        return true;
    }

    private BracketUtil() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}}", '{', '}'));
    }
}