class my_class:
    y ,z = 10, 20
    def add(self, a, b):
        self.y = a
        self.z = b     
        print(self.y + self.z)


obj = my_class()
obj1 = my_class()

obj.add(23,10)
obj1.add(25,10)