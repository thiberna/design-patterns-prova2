public class SeaTransport implements TransportStrategy {
    @Override
    public void deliver(String packageDescription) {
        System.out.println("Delivering " + packageDescription + " via sea transport.");
    }
}
