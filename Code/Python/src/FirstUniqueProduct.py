def first_unique_product(products):
    counts = {}

    for item in products:
        if item in counts:
            counts[item] += 1
        else:
            counts[item] = 1

    for item in products:
        if counts[item] == 1:
            return item

    return None


if __name__ == "__main__":
    print(first_unique_product(["Apple", "Computer", "Apple", "Bag"]))  # should print "Computer"
