package src.finalMaterial.week14_25April_thurs;

public class Account {
    private int _balance;
    private boolean _elite;

    //what do we need for the private fields?
    public int getBalance() {
        return _balance;
    }

    public boolean isElite() {
        return _elite;
    }

    //write global invariants
    //@public invariant getBalance() >= 0;
    //@public invariant isElite() == (getBalance() >= 1000000);

    //write globalAsserts method

    public Account() {
        _balance = 0;
        _elite = false;
    }

    //write withdrawal and deposit methods + specifications

    /*@
        requires amount >= 0;
        ensures getBalance() == \old(getBalance()) + amount;
    */
    public void deposit(int amount) {
        //global invariants should hold

        //enforce precondition
        if (amount < 0) {
            throw new IllegalArgumentException("amount must be nonnegative");
        }

        _balance += amount;

        if (_balance >= 1000000) {
            _elite = true;
        }

        //assert postcondition
        //assert global invariants hold
    }

    /*@
        requires amount <= getBalance();
        requires amount > 0;
        ensures getBalance() == \old(getBalance()) - amount;
     */
    public void withdraw(int amount) {
        _balance -= amount;

        if (_balance < 1000000) {
            _elite = false;
        }
    }

}