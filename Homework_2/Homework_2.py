x, y, z = False, True, True

print((x and y) and z) # (False and True) and True - -> False and True - -> False
print(x and (y and z)) # false and (True and true) -> False and Trues -> False
print((x or y) and z) # (false or True) and True->True and true -> True
print((x and y) or z) #(false and true) or True->false or true-> True
print(x or (y and z)) # False or (true and true) ->False or True->True
print(x and (y or z)) # False and(true or true)->False and True->False
print((x or y) or z) # (false or true) or True ->True or True-> true
print(x or (y or z)) # False or(True or True)-> False or true-> TRue
