public class CDBuilder {
    public CDType buildSonyCD() {
        CDType cds = new CDType();
        cds.addItems(new Sony());
        return cds;
    }
    
    public CDType buildSamsungCD() {
        CDType cds = new CDType();
        cds.addItems(new Samsung());
        return cds;
    }
}