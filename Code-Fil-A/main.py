import datetime
stock = {1:0,
2:0,
3:0,
4:0,
5:0,
6:0}
q = open("inventory.txt")
for i in range(6):
  stock[i+1] = int(q.readline().strip()) 
q.close()  
def inventory_update():      
  g = open("inventory.txt", "r+")
  g.seek(0)  
  g.truncate()
  g.close()
  h = open("inventory.txt","w+")
  for i in range(6):
    h.write((str(stock[i+1]))+"\n")
  h.close()
name=input('''What is your name?
''''\n')
print("\n")
def restock_program():
    restock = input("Do you want to restock any more items? (y/n)? ")
    if restock == "y":
        itemrest = int(input("Which item do you want to restock? (1-6)? "))
        stock[itemrest] = 100
        inventory_update()
        restock_program()
    if restock == "n":
      print("Ok... Exiting Program...")    
      exit()  
    else:
      print("Please print either y or n. You will be given the oppurtunity to reenter all values.")
    restock_program() 

if name == "ADMIN":
  print("Entered Admin Mode.")
  pswrd = input("WHAT IS THE PASSWORD? : ")
  if pswrd == "password1234":
    print("Welcome Employee of Code-Fil-A!")
    restock_program()
  else:
    print("Sorry this section is restricted to customers. (If you are a admin and misentered... please restart the program!) ")
    exit()
  
f = open("inventory.txt")
totalprice1 = 0
prices={'1':10,
'2':2,
'3':6,
'4':3,
'5':2,
'6':3}
quantity = 0
totalprice = 0
print('Hi, %s, Welcome to my Code-Fil-A. The first restaurant with employee/customer compatible software. Here is the menu:'%(name),'\n')
print("1 Roasted Python - $10")
print("2 Cup of Java - $2")
print("3 C# Browns - $6")
print("4 Rust Burger - $3")
print("5 Powershell of the Oyster- $2")
print("6 Ruby Ice-Cream - $3"'\n')
while True:
    user_input =input("Please Choose Menu Item Number : ")
    try:
      item = int(user_input)
      if(item == 1):
        print('You have selected, %s,:'%(item), 'Roasted Python''\n')
      elif(item == 2):
        print('You have selected, %s,:'%(item), "Cup of Java"'\n')
      elif(item == 3):
        print('You have selected, %s,:'%(item), "C# Browns"'\n')
      elif(item == 4):
        print('You have selected, %s,:'%(item), "Rust Burger"'\n')
      elif(item == 5):
       print('You have selected, %s,:'%(item), "Powershell of the Oyster"'\n')
      elif(item == 6):
        print('You have selected, %s,:'%(item), "Ruby Ice-Cream"'\n')
      elif(item > 6):
        print("Please enter number within 1 to 6"'\n')
        continue
      elif(item < 1):
        print("Please enter number wihin 1 to 6"'\n')
        continue
    except ValueError:
      try:
        item = float(user_input)
        print("You have entered the wrong number."'\n')
        continue
      except ValueError:
          print(" Please enter correct number."'\n')
          continue        
    quantity =input("How many would you like? : ")
    if(not(quantity.isdigit())):
       print("You have entered the wrong type. Please select menu item again.")
       continue
    elif(int(quantity) > stock.get(item)):
        print("Please enter a lesser quantity!"'\n')
        continue
    totalprice1 = int(totalprice1) + int(((prices[user_input])*(quantity)))
    totalprice = totalprice + (int(prices[user_input])*int(quantity))
    print("Total price of all items is ... $", totalprice,'\n')
    user_input1 =input(" Do you wish to keep on shopping? Yes or No: ").lower()
    try:
      qty = stock.get(item) - int(quantity)
      if(user_input1 == 'yes' or user_input1 == 'y'):
        stock[item] = qty
        continue
      elif(user_input1 == 'no' or user_input1 == 'n'):
       print( "The total cost of all items is, $", totalprice,'\n')
       stock[item] = qty
       break
    except ValueError:
      print("Please type Yes or No.")
      continue
f.close()
inventory_update()
now = datetime.datetime.now()
j = open("records.txt","a")
j.write(name.strip() + "/" + str(now) + "/" + str(stock[1]) + "," + str(stock[2]) + "," + str(stock[3]) + "," + str(stock[4]) + "," + str(stock[5]) + "," + str(stock[6]) + "\n")
j.close()