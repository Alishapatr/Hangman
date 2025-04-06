# Python program to check upper or lower case character


ch = input("Enter character: ")


if len(ch) == 1:
    if 'A' <= ch <= 'Z':
        print("Uppercase letter!")
        print("Thank you for using my program")
    elif 'a' <= ch <= 'z':
        print("Lowercase letter!")
        print("Thank you for using my program")
    else:
        print("Invalid input...")
        print("Please enter a correct character... Thank you!")
