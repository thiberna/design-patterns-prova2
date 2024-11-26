public class TransportManager {
    private TransportStrategy strategy;

    public void setStrategy(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void deliverPackage(String packageDescription) {
        if (strategy == null) {
            throw new IllegalStateException("No transport strategy defined.");
        }
        strategy.deliver(packageDescription);
    }
}
