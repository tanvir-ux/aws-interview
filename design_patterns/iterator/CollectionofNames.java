public class CollectionofNames implements Container {
    public String name[] = {"Tanvir", "Tonmoy", "Tanim", "Fahad", "Turzo"};

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterator();
    }

    private class CollectionofNamesIterator implements Iterator{
        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length) return true;
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return name[i++];
            }
            return null;
        }
    }
}