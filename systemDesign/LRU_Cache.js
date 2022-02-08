// // We need to implement a Linked List to 
// // help with LRUCache

// class LRUCache {

//   constructor(capacity) {
//     this.capacity = capacity;
//     this.cache = {};
//     this.cache_vals = new LinkedList();
//   }
//   set(key, value) {
//     if (this.cache[key]) {
//       let node = this.cache[key];
//       node.data = value;
//       this.cache_vals.remove(node);
//       this.cache_vals.insert_at_tail(node);
//     } else {
//       this.evict_if_needed();
//       let node = new LinkedListNode(key, value);
//       this.cache_vals.insert_at_tail(node);
//       this.cache[key] = node;
//     }
//   }

//   get(key) {
//     if (this.cache[key]) {
//       let node = this.cache[key];
//       this.cache_vals.remove(node);
//       this.cache_vals.insert_at_tail(node);
//       return node.data;
//     } else {
//       return -1;
//     }
//   }

//   evict_if_needed() {
//     if (this.cache_vals.size >= this.capacity) {
//       node = this.cache_vals.remove_head();
//       this.cache.remove(node);
//     }
//   }

//   printcache() {
//     let node = this.cache_vals.head;
//     while (node) {
//       console.log(node.key + " " + node.data + ", ");
//       node = node.next;
//     }
//   }
// }

// console.log("");
// console.log("+++++++++++++++++++++++++++++++++++++++");
// console.log("LRUCache");
// console.log("---------------------------------------");
// let cache1 = new LRUCache(15);
// let key = 10;
// let val = 20;
// cache1.set(10, val);
// cache1.printcache();
// cache1.set(15, 25);
// cache1.printcache();
// cache1.set(20, 30);
// cache1.printcache();
// cache1.set(25, 35);
// cache1.printcache();
// cache1.set(10, 20);
// cache1.printcache();
// console.log("++++++ Test Done Successfully ++++++");





class LRUCache {
    constructor(capacity) {
        this.capacity = capacity;
        this.cache = {};
        this.cache_vals = new LinkedList();
    }
    set(key, value) {
        if (this.cache[key]) {
            let node = this.cache[key];
            node.data = value;
            this.cache_vals.remove(node);
            this.cache_vals.insert_at_tail(node);
        } else {
            this.evict_if_needed();
            let node = new LinkedListNode(key, value);
            this.cache_vals_insert_at_tail(node);
            this.cache[key] = node;
        }
    }
    get(key) {
        if (this.cache[key]) {
            let node = this.cache[key];
            this.cache_vals.remove(node);
            this.cache_vals.insert_at_tail(node);
            return node.data;
        } else {
            return -1;
        }        
    }
    
    evict_if_needed() {
        if (this.cache_vals.size >= this.capacity) {
            node = this.cache_vals.remove_head();
            this.cache.remove(node);
        }
    }

    printcache() {
        let node = this.cache_vals.head;
        while (node) {
            console.log(node.key + " " + node.data + " ");
            node = node.next;
        }
    }
}

let cache1 = new LRUCache(15);
let key = 10;
let val = 20;
cache1.set(10,val);
cache1.printcache();