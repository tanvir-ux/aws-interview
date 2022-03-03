import java.util.*;

class UniqueEmails {
    public static int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");            
            String[] local = parts[0].split("\\+");            
            normalized.add(local[0].replace(".","") + "@" + parts[1]);                        
        }
        return normalized.size();
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));// output 2
    }
}