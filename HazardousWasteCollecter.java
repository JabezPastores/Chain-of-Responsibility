class HazardousWasteCollector extends AbstractWasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getWasteType().equals("Hazardous");
    }

    @Override
    protected void handle(WasteContainer container) {
        System.out.println("Hazardous waste collected from container with capacity: " + container.getCapacity());
    }
}
