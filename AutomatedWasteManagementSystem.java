public class AutomatedWasteManagementSystem {
    public static void main(String[] args) {
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);


        WasteContainer organicContainer = new WasteContainer("Organic", 100);
        WasteContainer recyclableContainer = new WasteContainer("Recyclable", 200);
        WasteContainer hazardousContainer = new WasteContainer("Hazardous", 50);
        WasteContainer unknownContainer = new WasteContainer("Unknown", 150);
        organicCollector.collectWaste(organicContainer);
        organicCollector.collectWaste(recyclableContainer);
        organicCollector.collectWaste(hazardousContainer);
        organicCollector.collectWaste(unknownContainer);
    }
}