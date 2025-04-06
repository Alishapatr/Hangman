# Multiplication Table in Python


n = int(input("Enter number: "))

print(f"Multiples of {n} are:")


for i in range(1, 11):
    print(f"{n} * {i} = {n * i}")