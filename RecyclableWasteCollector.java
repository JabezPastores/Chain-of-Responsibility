class RecyclableWasteCollector extends AbstractWasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getWasteType().equals("Recyclable");
    }

    @Override
    protected void handle(WasteContainer container) {
        System.out.println("Recyclable waste collected from container with capacity: " + container.getCapacity());
    }
}