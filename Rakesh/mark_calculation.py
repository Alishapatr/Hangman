# Python program to calculate total marks and percentage
def main():
    print("Enter student marks....")

    # Taking inputs for marks
    math = float(input("Enter math marks: "))
    phy = float(input("Enter phy marks: "))
    chem = float(input("Enter chem marks: "))
    bio = float(input("Enter bio marks: "))
    it = float(input("Enter IT marks: "))

    total_marks = int(input("Enter the total marks: "))
    
    # Calculate sum of marks
    sum_marks = math + phy + chem + bio + it
    print("Total marks:", sum_marks)
    
    # Calculate percentage
    percentage = (sum_marks / total_marks) * 100
    print(f"Total percentage: {percentage:.2f}")  # Formatting to two decimal places

if __name__ == "__main__":
    main()