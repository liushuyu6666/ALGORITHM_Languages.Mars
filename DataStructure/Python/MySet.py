set1 = set('abracadabra')
set2 = set('alacazam')
set1 - set2 # letters in set1 but not in b
set1 | set2 # letters in set1 or set2 or both
set1 & set2 # letters in both set1 and b
set1 ^ set2 # letters in set1 or set2 but not both
set3 = {x for x in 'abracadabra' if x not in 'abc'}

# add
set1.add('x')
print(f'set1: {set1}\nset2: {set2}')

# operation
difference = set1.difference(set2)
intersection = set1.intersection(set2)
union = set1.union(set2)
print(f'difference: {difference} in set1 not in set2\n')
print(f'intersect: {intersection} in set1 and in set2\n')
print(f'union: {union} unioin set1 and set2\n')

# check
print(f'len of set1 is {len(set1)}')