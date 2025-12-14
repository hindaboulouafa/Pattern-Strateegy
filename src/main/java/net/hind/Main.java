package net.hind;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static final String RED = "\033[31m";
    public static final String YELLOW = "\033[33m";
    public static final String RESET = "\033[0m";
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String,Strategy> strategyMap = new HashMap<>();
        Strategy strategy;
        while (true) {
            //System.out.println("----------------------------------------------");
            System.out.println("************" + RED + " Quelle Stratégie ? " + RESET + "**************");
            System.out.println("----------------------------------------------");

            String strategyClassName =  scanner.next();
            strategy = strategyMap.get(strategyClassName);
            if(strategy == null) {
                //System.out.println("----------------------------------------------");
                System.out.println(  YELLOW+"Création d'un nouvel objet de strategyIMP"+RESET);
                System.out.println("----------------------------------------------");

                strategy = (Strategy) Class.forName("ma.enset."+strategyClassName).getConstructor().newInstance();
                strategyMap.put(strategyClassName,strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();

        }
    }
}