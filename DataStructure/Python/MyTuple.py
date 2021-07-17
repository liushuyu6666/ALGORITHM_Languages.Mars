# create
tuple1 = ()
tuple2 = 12, 12, 13, 15, 19, 'tuple'
print(f'create tuple:\n  a new one: {tuple1}, {tuple2}')
x, y, z, _, _, _ = tuple2
print(f'  based on an existed: {x}, {y}, {z}')
tuple3 = tuple(i for i in tuple2)
print(f'  tuple3: {tuple3}')
tuple5 = tuple1, ('go', 'to', 'school')
print(f'  tuple5: {tuple5}')

# add
tuple4 = tuple1 + tuple([5])
print(f'add:\n  tuple4 is {tuple4}')

# get
index = tuple2.index(12, 0, 2)
value = tuple2[0]
print(f'get:\n  tuple2[0]: {index}\n  value:{value}')

# check
school = 'school' in tuple2
print(f'check: \n  len of tuple2 is {len(tuple2)}\n  if tuple2 contains the word school: {school}\n')

# slice
print(f'slice:\n  tuple2[0:5]:{tuple2[0:4]}')