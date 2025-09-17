class Students():
    def __init__(self):
        self.stu_name= input("Enter student name: ")
        self.roll_no= int(input("Enter roll number: "))
        self.m1= int(input("Enter English marks: "))
        self.m2= int(input("Enter Science marks: "))
        self.m3= int(input("Enter Math marks: "))


    def calculate_total(self):
        return self.m1+self.m2+self.m3

    def display_info(self):
        print("\n---Student Details---\n")
        print(f"Student: {self.stu_name}")
        print(f"Roll Number: {self.roll_no}")
        print(f"English: {self.m1}")
        print(f"Science: {self.m2}")
        print(f"Math: {self.m3}")
        print(f"Total Marks: {self.calculate_total()}")

s = Students()
s.display_info()


 


class BankAccount():
    def __init__(self, name, initial_balance=0):
        self.name = name
        self.balance = initial_balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"Deposited Amount: {amount}")
        else:
            print("Deposit amount must be positive")

    def withdraw(self, amount):
        if amount > self.balance:
            print("Insufficient balance!")
        else:
            self.balance -= amount
            print(f"Withdrew Amount: {amount}")

    def check_balance(self):
        print(f"Account holder: {self.name}")
        print(f"Current balance: {self.balance}")


account = BankAccount("Varun", 1000)
account.check_balance()
account.deposit(500)
account.withdraw(300)
account.check_balance()






class Car:
    def __init__(self):
        self.model = input("Enter car model name: ")
        self.year = int(input("Enter year of manufacturing: "))
        self.price = float(input("Enter price(in Rs): "))
        self.fuel_efficiency = float(input("Enter fuel efficiency (km/l): "))


    def display_info(self):
        print("\n---Car Details---\n")
        print(f"Car Model name: {self.model}")
        print(f"Manufacture Year: {self.year}")
        print(f"Price(in Rs): {self.price}")
        print(f"Fuel Efficiency: {self.fuel_efficiency}")

c = Car()
c.display_info()



        
























