class CategoryTree:

    def __init__(self):
        self.tree = dict()

    def add_category(self, category, parent):
        if parent is None:
            self.tree[category] = parent
            return
        elif category in self.tree.keys():
            raise KeyError('adding a category that has already been added')
        elif parent not in self.tree.keys():
            raise KeyError('parent not existed')
        else:
            self.tree[category] = parent

    def get_children(self, parent):
        ans = []
        for key, value in self.tree.items():
            if value == parent:
                ans.append(key)
        return ans


if __name__ == "__main__":
    c = CategoryTree()
    c.add_category('A', None)
    c.add_category('B', 'A')
    c.add_category('C', 'A')
    print(','.join(c.get_children('A') or []))
