given = ['fvhy','tyu','settuioy']
result = []
n = len(given)

for i in range(n):
    count = 0
    for ss in given[i]:
        if ss in 'aeiou':
            count += 1
    if count % 2 == 0:
        result.append('Alex')
    else:
        result.append('Chris')

print(result)            