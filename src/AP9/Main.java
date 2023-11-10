package AP9;

import AP9.model.AccountStatus;
import AP9.model.AccountType;
import AP9.model.BankAccount;
import AP9.model.BankDirector;

public class Main {
    public static void main(String[] args) {

        BankAccount account = BankDirector.accountBuilder()
                .accountId(1L)
                .balance(1000)
                .currency("USD")
                .type(AccountType.CURRENT_ACCOUNT)
                .status(AccountStatus.SUSPENDED)
                .build();


        System.out.println(account.toString());

    }
}
