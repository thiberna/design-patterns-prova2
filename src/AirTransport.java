public class AirTransport implements TransportStrategy {
    @Override
    public void deliver(String packageDescription) {
        System.out.println("Delivering " + packageDescription + " via air transport.");
    }
}
