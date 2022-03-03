from typing import List

def numUniqueEmails(emails: List[str]) -> int:
    seen = set()
    for email in emails:
        name, domain = email.split('@')
        local = name.split('+')[0].replace('.', '')
        seen.add(local + '@' + domain)
    return len(seen)    
    

myemails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
numUniqueEmails(myemails)