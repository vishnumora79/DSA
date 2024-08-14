def remove_duplicates(string):
    if len(string) <= 1:
        return string
    
    if string[0] == string[1]:
        return remove_duplicates(string[2:])
    else:
        return string[0] + remove_duplicates(string[2:])
print(remove_duplicates("azxxzy"))


