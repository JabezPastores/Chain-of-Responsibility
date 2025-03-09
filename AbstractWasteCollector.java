abstract class AbstractWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (canHandle(container)) {
            handle(container);
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No collector available for " + container.getWasteType() + " waste.");
        }
    }

    protected abstract boolean canHandle(WasteContainer container);
    protected abstract void handle(WasteContainer container);
}
