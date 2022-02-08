# class vertex:
#   def __init__(self, id, visited):
#     self.id = id
#     self.visited = visited

# class edge:
#   def __init__(self, weight, visited, src, dest):
#     self.weight = weight
#     self.visited = visited
#     self.src = src
#     self.dest = dest

# class graph:
#   g = []    #vertices
#   e = []    #edges

#   def __init__(self, g, e):
#     self.g = g
#     self.e = e

#   # This method returns the vertex with a given id if it
#   # already exists in the graph, returns NULL otherwise
#   def vertex_exists(self, id):
#     for i in range(len(self.g)):
#       if self.g[i].id == id:
#         return self.g[i]
#     return None

#   # This method generates the graph with v vertices
#   # and e edges
#   def generate_graph(self, vertices, edges):
#     # create vertices
#     for i in range(vertices):
#       v = vertex(i + 1, False)
#       self.g.append(v)

#     # create edges
#     for i in range(len(edges)):
#       src = self.vertex_exists(edges[i][1])
#       dest = self.vertex_exists(edges[i][2])
#       e = edge(edges[i][0], False, src, dest)
#       self.e.append(e)


#   def find_min_spanning_tree(self):
#     weight = -1
#     # TODO: Write - Your - Code
#     return weight

#   def print_graph(self):
#     for i in range(len(self.g)):
#       print(str(self.g[i].id) + " " + str(self.g[i].visited) + "\n")

#     for i in range(len(self.e)):
#       print(str(self.e[i].src.id) + "->" + str(self.e[i].dest.id) + "[" + str(self.e[i].weight) + ", " + str(self.e[i].visited) + "]  ")

#     print("\n")
    
#   def get_graph(self):
#     res = ""
#     for i in range(len(self.e)):
#       if(i == len(self.e)-1):
#         res += "[" + str(self.e[i].src.id) + "->" + str(self.e[i].dest.id) + "]"
#       else:
#         res += "[" + str(self.e[i].src.id) + "->" + str(self.e[i].dest.id) + "],"    
#     return res
  

#   def print_mst(self,w):
#     print("MST")
#     for i in range(len(self.e)):
#       if self.e[i].visited == True:
#         print(str(self.e[i].src.id) + "->"
#             + str(self.e[i].dest.id))

#     print("weight: " + str(w))
#     print("\n")

# def find_min_spanning_tree(self):
#         vertex_count = 0
#         weight = 0

#         # Add first vertex to the MST
#         current = self.g[0]
#         current.visited = True
#         vertex_count += 1

#         # Construct the remaining MST using the
#         # smallest weight edge
#         while vertex_count < len(self.g):
#             smallest = None
#             for i in range(len(self.e)):
#                 if self.e[i].visited == False and self.e[i].dest.visited == False:
#                     smallest = self.e[i]
#                     break

#             for i in range(len(self.e)):
#                 if self.e[i].visited == False:
#                     if self.e[i].src.visited == True and self.e[i].dest.visited == False:
#                         if smallest == None or self.e[i].weight < smallest.weight:
#                             smallest = self.e[i]

#             smallest.visited = True
#             smallest.dest.visited = True
#             weight += smallest.weight
#             vertex_count += 1

#         return weight





class vertex:
    def __init__(self, id, visited):
        self.id = id
        self.visited = visited

class edge:
    def __init__(self, weight, visited, src, dest):
        self.weight = weight
        self.visited = visited
        self.src = src
        self.dest = dest

class graph:
    g = []
    e = []

    def __init__(self, g, e):
        self.g = g
        self.e = e

    def vertex_exists(self, id):
        for i in range(len(self.g)):
            if self.g[i].id == id:
                return self.g[i]
        return None

    def generate_graph(self, vertices, edges):
        for i in range(vertices):
            v = vertex(i + 1, False)
            self.g.append(v)

        for i in range(len(edges)):
            src = self.vertex_exists(edges[i][1])
            dest = self.vertex_exists(edges[i][2])
            e = edge(edges[i][0], False, src, dest)
            self.e.append(e)

    def find_min_spanning_tree(self):
        vertex_count = 0
        weight = 0

        current = self.g[0]
        current.visited = True
        vertex_count += 1

        while vertex_count < len(self.g):
            smalles = None
            for i in range(len(self.e)):
                if self.e[i].visited == False and self.e[i].dest.visited == False:
                    smallest = self.e[i]
                    break

            for i in range(len(self.e)):
                if self.e[i].visited == False:
                    if self.e[i].src.visited == True and self.e[i].dest.visited == False:
                        if smallest == None or self.e[i].weight < smallest.weight:
                            smallest = self.e[i]

            smallest.visited = True
            smallest.dest.visited = True
            weight += smallest.weight
            vertex_count += 1

        return weight

    def print_graph(self):
        for i in range(len(self.g)):
            print(str(self.g[i].id) + " " + str(self.g[i].visited) + "\n")

        for i in range(len(self.e)):
            print(str(self.e[i].src.id) + "->" + str(self.e[i].dest.id) + "[" + str(self.e[i].weight) + ", " + str(self.e[i].visited) + "] ")

    def get_graph(self):
      res = ""
      for i in range(len(self.e)):
        if(i == len(self.e)-1):
          res += "[" + str(self.e[i].src.id) + "->" + str(self.e[i].dest.id) + "]"
        else:
          res += "[" + str(self.e[i].src.id) + "->" + str(self.e[i].dest.id) + "],"    
      return res

    def print_mst(self, w):
        print("MST")
        for i in range(len(self.e)):
            if self.e[i].visited == True:
              print(str(self.e[i].src.id) + "->" + str(self.e[i].dest.id))

        print("weight: " + str(w)) 
        print("\n")     