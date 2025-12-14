package net.hind;

public class DefaultStrategyImplementation implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("============== START ==============");
        System.out.println("          Default Strategy ");
        System.out.println("============== THE END ==============");
    }
}