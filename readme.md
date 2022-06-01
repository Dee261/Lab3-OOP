# Exercises 
## Exercise 1
Create a class with a method that decides whether a given year is a leap year or not. A year is a leap if the following conditions are satisfied:
- It has 366 days (instead of 365)
- It occurs after every 4 years e.g. 2008, 2012 were leap years
- After 100 years a special rule applies i.e. 1900 is not a leap year but 2000 is a leap year. In these  cases, you need to check whether the year is divisible by 400 or not.

## Exercise2
### Part 1
Create the following three classes:
- Class A: Class should have no object variables nor should you specify a constructor for it. It only has the method public void a(), which prints a string "A".
- Class B: Class should have no object variables nor should you specify a constructor for it. It only has the method public void b(), which prints a string "B".
- Class C: Class should have no object variables nor should you specify a constructor for it. It only has the method public void c(), which prints a string "C".
````java
A a = new A();
B b = new B();
C c = new C();

a.a();
b.b();
c.c();
````
Sample Output
> A\
> B\
> C

### Part 2
Modify the classes so that class B inherits class A, and class C inherits class B. In other words, class A will be a superclass for class B, and class B will be a superclass for class C.
````java
C c = new C();

c.a();
c.b();
c.c();
````
Sample Output
> A\
> B\
> C

## Exercise 3
Look at the Account class Account.java (in this repository) and write a main method in a different class to briefly experiment with some instances of the Account class.

- Using the Account class as a base class, write two derived classes called SavingsAccount and CurrentAccount. A SavingsAccount object, in addition to the attributes of an Account object, should have an interest variable and a method which adds interest to the account. A CurrentAccount object, in addition to the attributes of an Account object, should have an overdraft limit variable. Ensure that you have overridden methods of the Account class as necessary in both derived classes.
- Now create a Bank class, an object of which contains an array of Account objects. Accounts in the array could be instances of the Account class, the SavingsAccount class, or the CurrentAccount class. Create some test accounts (some of each type).
- Write an update method in the bank class. It iterates through each account, updating it in the following ways: Savings accounts get interest added (via the method you already wrote); CurrentAccounts get a letter sent if they are in overdraft.
- The Bank class requires methods for opening and closing accounts, and for paying a dividend into each account.

Hints:

- Note that the balance of an account may only be modified through the deposit(double) and withdraw(double) methods.
- The Account class should not need to be modified at all.
- Be sure to test what you have done after each step.

# Assignment
In this assignment, you will create four classes, a base class, two child classes and a user class. The base class will be a BasketballPlayer class. The two child classes will be CollegeBasketballPlayer and ProBasketballPlayer. 

The BasketballPlayer class will have instance data of name, position, team (Strings), height, weight, agility, speed, ballHandling (ints) and all should be declared as protected instead of private. We will have 3 constructors, a 0 parameter constructor (all instance data are initialized to “unknown” or 0), a 3-parameter constructor which receives the 3 Strings and assigns the 3 String instance data to them and 0 to all int instance data, and one which receives a parameter for each instance data and assigns them all appropriately. 

Also create accessors for all instance data and a toString which will return at least the name, position, team and the value for a method you will write called getValue. The getValue method will test various instance data and return an int using nested if-else logic based on the table below. All methods should be public.

| Position | Other conditions                                                | Value |
|----------|-----------------------------------------------------------------|-------|
| Center   | height >= 82, weight between 220 and 250, ball handling > 5     | 10    |
| Center   | height >= 80, weight between 210 and 260, ball handling > 5     | 8     |
| Center   | height >= 80, ball handling > 4                                 | 6     |
| Center   | height >= 78, agility > 7                                       | 5     |
| Center   | height >= 78                                                    | 4     |
| Center   | height >= 76, agility > 5                                       | 2     |
| Center   |                                                                 | 0     |
| Forward  | height >= 80 and either agility > 8 or speed > 7                | 10    |
| Forward  | height >=78, agility > 6, speed > 5                             | 8     |
| Forward  | height >= 77, agility 5                                         | 6     |
| Forward  | height >= 76, speed > 4                                         | 5     |
| Forward  | height >= 75 and either agility > 3 or speed > 3                | 3     |
| Forward  | height >= 74                                                    | 1     |
| Forward  |                                                                 | 0     |
| Guard    | height >= 78, ball handling > 7 and either agility or speed > 7 | 10    |
| Guard    | height >= 76, ball handling > 7 and either agility or speed > 6 | 8     |
| Guard    | height >= 74, ball handling > 5, agility > 5, speed > 6         | 6     |
| Guard    | ball handling > 6, agility > 6, speed > 5                       | 4     |
| Guard    | ball handling > 4, agility > 4                                  | 2     |
| Guard    |                                                                 | 0     |
NOTE: empty “other conditions” mean “any values”, these would be used in else clauses.

Compile this class before continuing as you cannot implement the child classes without this one being compiled. Fix any syntax errors.

Implement a CollegeBasketballPlayer to extend BasketballPlayer. It will have two instance data eligibilityRemaining (int) and role (String). Note: these can be protected or private as we do not plan to extend this class. Have 3 different constructors, a 0 param constructor, a 3 param constructor (name, position, team) and a constructor that receives all params. Use super(); for the 0 param constructor, super(…); for the other two constructors, passing the appropriate parameters. Assign eligibilityRemaining and role to either 4 and “bench” for the 0 and 3 parameter constructors or the proper params for the third constructor. Add accessors for these two instance data a new toString method which return super.toString() + “\t” + “…” where … is at least the role of this player (and the eligibilityRemaining if desired). Finally, add a method called draftable which returns a boolean based on the following logic:

- A player is draftable if he/she is a “starter” (role) whose value (as obtained by super.getValue()) > 4 or is a “bench” player (role) whose value >= 8.

Compile this class and fix any errors. Implement ProBasketballPlayer by extending BasketballPlayer. Add 2 new instance data: yearsInLeague (int) and role (String). Add 3 constructors similar to what you had for CollegeBasketballPlayer. For the first two constructors, yearsInLeague should be initialized to 0 and role to “bench”. Add accessors for the two new instance data and a toString which will add to BasketballPlayer’s toString both yearsInLeague and role. Finally, implement a method called newContractValue which returns an int value based on the logic in the following table.

| Value (using get Value()) | Years in League | Role    | Return value |
|---------------------------|-----------------|---------|--------------|
|                           | < 3             |         | 0            |
| \> 8                      | \>= 10          | Starter | 12,000,000   |
| \> 7                      | \>= 8           | Starter | 10,000,000   |
| \> 7                      | \>= 5           | Starter | 8,000,000    |
| \> 5                      | \>= 10          | Starter | 6,000,000    |
|                           | \>= 5           | Starter | 2,000,000    |
|                           |                 | Starter | 1,000,000    |
| \> 8                      | \>= 10          | Bench   | 7,500,000    |
| \> 7                      | \>= 8           | Bench   | 5,000,000    |
| \> 5                      | \>= 10          | Bench   | 4,500,000    |
|                           | \>= 7           | Bench   | 2,000,000    |
|                           |                 | Bench   | 500,000      |
Again, empty entries in the table mean “any value”. NOTE: because of the logic here, you may need to add else return 0; at the end of your nested if-else statement to satisfy the Java compiler.

Compile this class and fix any errors.

Finally, create a user class with an empty main method. On the website, next to the link for this assignment is a link for some Java code. Copy that into this user class to be the main method. In the code, you will see three variables, bp1, bp2 and bp3, declared as a BasketballPlayer, CollegeBasketballPlayer and ProBasketballPlayer respectively. Notice that bp1 could take on an object of BasketballPlayer, CollegeBasketballPlayer or ProBasketballPlayer but bp2 and bp3 are limited to just their declared type. The code then performs various instantiations and message passing on bp1, bp2 and bp3. You will notice some instructions have syntax errors. Before trying to compile the program, comment out the instructions that have syntax errors and add in comments next to those instructions the reason for the errors