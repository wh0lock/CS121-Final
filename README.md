# CS121-Final
This is a java program that asks the user to answer a set of personality questions in order to determine what music genre best suits their taste.

## UML/Algorithm
```
User (abstract)
----------------
- userName: String
- PIN: String
----------------
+ login: boolean
+ login(userName, PIN): boolean
+ setUserName(userName): void
+ getUserName(): String
+ setPIN(PIN): void
+ getPIN(): String

Listener (extends User)
-----------------
_________________
+ main(): void
+ Listener()
+ start(): void
+ menu(): String

Menu (interface, implements User)
-----------------
_________________
+ menu(): String
+ start(): void
```
