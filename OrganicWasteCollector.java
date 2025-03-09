class OrganicWasteCollector extends AbstractWasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getWasteType().equals("Organic");
    }

    @Override
    protected void handle(WasteContainer container) {
        System.out.println("Organic waste collected from container with capacity: " + container.getCapacity());
    }
}