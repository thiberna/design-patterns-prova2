public class LandTransport implements TransportStrategy {
    @Override
    public void deliver(String packageDescription) {
        System.out.println("Delivering " + packageDescription + " via land transport.");
    }
}
