# new
list1 = []
list2 = [1, 3, 4, 2]
list3 = [i for i in range(10)]
list4 = list('abc')
list5 = list((1, 3, 4, 2))
print(f'new: \n  list1: {list1}\n  list2:{list2}\n  list3:{list3}\n  list4:{list4} \n  list5:{list5}\n')

# create base on an existed list
operation = lambda x : x
list2Bas = map(operation, list2)
list4Bas = [x for x in list4]
print(f'create based on an existed:\n  list2Bas: {list2Bas}\n  list4Bas: {list4Bas}')

# add
list1.append(3)
list2.insert(3, 100)
list3.extend([100])
print(f'add:\n  list1:{list1}\n  list2:{list2}\n  list3:{list3}')

list3.extend([200, 300, 400, 500])
print(f'concatenate:\n  list3:{list3}\n  list3 + list4: {list3 + list4}')

# get
firstElement = list3.pop()
print(f'get:\n  get the second element from list4: {list4[1]}\n' + 
f'  get the index by value:{list3.index(200)}\n  pop list3 is {firstElement} and list3 remains: {list3}')

# update
list3[0] = 34
print(f'update:\n  list3:{list3}')

# delete
delete = list3.remove(7) # throws ValueError if not present
print(f'delete: \n  list3:{list3}, delete is {delete}\n')
del list3[-1]
print(f'list3:{list3}\n')
del list3[10:]
print(f'list3:{list3}\n')

# check
print(f'check:\n  len of list3 is {len(list3)}\n  if 234 is in list3: {234 in list3}')

# sub
print(f'slice:\n  list3 slice: {list3[1:4]}')

# special
list3.sort(reverse=False)
print(f'special:\n  sort: list3: {list3}\n')
list3.reverse()
print(f'  reverse: list3:{list3}\n')



