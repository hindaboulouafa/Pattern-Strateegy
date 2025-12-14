package net.hind;
public class Context {

    private Strategy strategy = new DefaultStrategyImplementation();

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void effectuerOperation(){
        strategy.operationStrategy();
    };
}