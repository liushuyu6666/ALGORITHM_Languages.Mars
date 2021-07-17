class MovingTotal:
    def __init__(self):
        self.container = list()
        self.totals = set()

    def append(self, numbers):
        start = len(self.container)
        self.container += numbers
        if len(self.container) < 3:
            return
        else:
            for i in range(max(0, start - 2), len(self.container) - 2):
                self.totals.add(self.container[i] + self.container[i + 1] + self.container[i + 2])

    def contains(self, total):
        if total in self.totals:
            return True
        else:
            return False


if __name__ == "__main__":
    movingtotal = MovingTotal()

    movingtotal.append([1, 2, 3, 4])
    print(movingtotal.contains(6))
    print(movingtotal.contains(9))
    print(movingtotal.contains(12))
    print(movingtotal.contains(7))

    movingtotal.append([5])
    print(movingtotal.contains(6))
    print(movingtotal.contains(9))
    print(movingtotal.contains(12))
    print(movingtotal.contains(7))
