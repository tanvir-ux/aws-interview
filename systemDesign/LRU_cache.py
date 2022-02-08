# class LRUCache:

#   def __init__(self, capacity):
#     self.capacity = capacity
#     self.cache = set()
#     self.cache_vals = LinkedList()

#   def set(self, value):
#     node = self.get(value)
#     if node == None:
#       if(self.cache_vals.size >= self.capacity):
#         self.cache_vals.insert_at_tail(value)
#         self.cache.add(value)
#         self.cache.remove(self.cache_vals.get_head().data)
#         self.cache_vals.remove_head()
#       else:
#         self.cache_vals.insert_at_tail(value)
#         self.cache.add(value)
    
#     else:
#       self.cache_vals.remove(value)
#       self.cache_vals.insert_at_tail(value)
  
#   def get(self, value):
#     if value not in self.cache:
#       return None
#     else:
#       i = self.cache_vals.get_head()
#       while i is not None:
#         if i.data == value:
#           return i
#         i = i.next

#   def printcache(self):
#     node = self.cache_vals.get_head()
#     while node != None :
#       print(str(node.data) + ", ")
#       node = node.next
      
# cache1 = LRUCache(4)
# cache1.set(10)
# cache1.printcache()

# cache1.set(15)
# cache1.printcache()

# cache1.set(20)
# cache1.printcache()

# cache1.set(25)
# cache1.printcache()

# cache1.set(30)
# cache1.printcache()

# cache1.set(20)
# cache1.printcache()

class LRUCache:

    def __init__(self, capacity):
        self.capacity = capacity
        self.cache = set()
        self.cache_vals = linkedList()

    def set(self, value):
        node = self.get(value)
        if node == None:
            if(self.cache_vals.size >= self.capacity):
                self.cache_vals.insert_at_tail(value)
                self.cache.add(value)
                self.cache.remove(self.cache_vals.get_head().data)
                self.cache_vals.remove_head()
            else:
                self.cache_vals.insert_at_tail(value)
                self.cache.add(value)

        else:
            self.cache_vals.remove(value)
            self.cache_vals.insert_at_tail(value)

    def get(self, value):
        if value not in self.cache:
            return None
        else:
            i = self.cache_vals.get_head()
            while i is not None:
                if i.data == value:
                    return i 
                i = i.next 

    def printcache(self):
        node = self.cache_vals.get_head()
        while node != None:
            print(str(node.data) + ", ")
            node = node.next

cache1 = LRUCache(4)
cache1.set(10)
cache1.printcache()           