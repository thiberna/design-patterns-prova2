public class Main {
    public static void main(String[] args) {
        TransportManager manager = new TransportManager();

        // entrega terrestre
        manager.setStrategy(new LandTransport());
        manager.deliverPackage("Package 1");

        // entrega aerea
        manager.setStrategy(new AirTransport());
        manager.deliverPackage("Package 2");

        // entrega maritima
        manager.setStrategy(new SeaTransport());
        manager.deliverPackage("Package 3");

        // entrega de drone
        manager.setStrategy(new DroneDelivery());
        manager.deliverPackage("Package 4");

        System.out.println("Delivery process closed");
    }
}
