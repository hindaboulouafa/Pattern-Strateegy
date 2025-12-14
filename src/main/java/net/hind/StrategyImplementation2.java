package net.hind;

public class StrategyImplementation2 implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("============== START ==============");
        System.out.println("          Second Strategy ");
        System.out.println("============== THE END ==============");
    }
}