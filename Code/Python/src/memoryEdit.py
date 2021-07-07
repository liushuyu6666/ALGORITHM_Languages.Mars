class MemoryEditor:
    def __init__(self, memory) -> None:
        self.memory = memory
        self.idPool = 1
        self.memoryLen = len(memory)
        self.momeryCounter = {}
    def alloc(self, x):
        len = 0
        index = None
        for i in range(self.memoryLen): 
            if self.memory[i] == 0:
                if index == None:
                    index = i
                len += 1
                if len == x:
                    for j in range(index, index+x):
                        self.memory[j] = 1
                    self.momeryCounter[self.idPool] = [index, x]
                    self.idPool += 1
                    return index
            else:
                index = None
                len = 0
        return -1

    def erase(self, id):
        if id in self.momeryCounter:
            for i in range(self.momeryCounter[id][0], self.momeryCounter[id][0] + self.momeryCounter[id][1]):
                self.memory[i] = 0
            prev = self.momeryCounter[id][1]
            self.momeryCounter.pop(id, None) # remove momery
            return prev
        else:
            return -1



def main():
    test = MemoryEditor([0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0])
    print(test.alloc(2))
    print(test.memory)
    print(test.momeryCounter)

    print(test.alloc(1))
    print(test.memory)
    print(test.momeryCounter)

    print(test.alloc(1))
    print(test.memory)
    print(test.momeryCounter)

    print(test.erase(2))
    print(test.memory)
    print(test.momeryCounter)

    print(test.erase(4))
    print(test.memory)
    print(test.momeryCounter)

    print(test.alloc(4))
    print(test.memory)
    print(test.momeryCounter)
if __name__ == "__main__":
    main()

