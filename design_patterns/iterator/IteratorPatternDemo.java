public class IteratorPatternDemo {
    public static void main(String[] args) {
        CollectionofNames companyRepos = new CollectionofNames();

        for(Iterator itr = companyRepos.getIterator(); itr.hasNext();) {
            String name = (String) itr.next();
            System.out.print("Name: " + name + " \n");
        }
    }

}