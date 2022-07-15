class EarlyS {
    private static EarlyS obj = new EarlyS();
    private EarlyS() {

    }
    public static EarlyS getEarlyInstance() {
        return obj;
    }
    public void doSomething() {
        // 
        return null;
    }
}