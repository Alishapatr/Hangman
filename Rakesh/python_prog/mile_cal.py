
def main():
    print("Kilometer to miles converter")
    
   
    km = float(input("Enter Kilometer: "))
    
    
    mile_conversion = 0.621371
    
    
    miles = km * mile_conversion
    print(f"The miles is: {miles:.2f}")  # Displaying output formatted to two decimal places

if __name__ == "__main__":
    main()