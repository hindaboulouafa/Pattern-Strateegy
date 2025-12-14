package net.hind;

public class StrategyImplementation1 implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("============== START ==============");
        System.out.println("           First Strategy ");
        System.out.println("==============THE END ==============");
    }
}