# ATM
## TIY Assignment 1.3

### Description
#### From sekao

Create a program that mimics an ATM. From the REPL, it should be possible to start it up using `ATM.run()`.

### Requirements
#### From sekao

* Prompt me for my name
  * If I enter nothing, throw an exception
* Prompt me for what I would like to do
  * 1. Check my balance, 2. Withdraw Funds or 3. Cancel
  * Check Balance
    * Print to the console `"Your balance is $100"`
  * Cancel
    * Print to the console `"Thank you and please come again."`
  * Withdraw Funds
    * Prompt for how much money to withdraw
      * If the amount is greater than 100, throw an exception
      * If all is well, tell them to please take their money

 ### Notes

 * Adding and removing bank accounts
 * HashMap = String name, Double balance

1. Create a HashMap called accounts:
    * **HashMap<String, Double> accounts = new HashMap();**
        *Import HashMap class, and creates a new instance of HashMap called accounts
2. Check HashMap for username:
    * If not in hashmap, offer to create account
    * Else, find account in HashMap
3. Withdraw Funds
    * **HashMap.put(k,v)**
        * Expects a key and a value
        * If the key already exists in the hashmap, updates the value
        * If key does not exist in the hashmap, adds the Key/Value pair to the hashmap
    * **ArrayList.set(int, element)**
        * ArrayList's version of put
        * Expects an index position for the first argument
        * Expects the element you are inserting into ArrayList as the second argument
4. Delete account
    * **HashMap.remove(key)**
        * Expects the key to be removed as the argument


### Roadmap

1. Deposit Functionality
    1. Enter Deposit Amount
    2. Add Deposit to Balance