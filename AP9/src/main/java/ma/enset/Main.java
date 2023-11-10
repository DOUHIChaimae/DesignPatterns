package ma.enset;


import ma.enset.model.AccountStatus;
import ma.enset.model.AccountType;
import ma.enset.model.BankAccount;
import ma.enset.model.BankDirector;
import ma.enset.repository.AccountRepositoryImpl;
import ma.enset.utils.JsonSerializer;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BankAccount account = BankDirector.accountBuilder()
                .accountId(1L)
                .balance(1000)
                .currency("USD")
                .type(AccountType.CURRENT_ACCOUNT)
                .status(AccountStatus.SUSPENDED)
                .build();

        JsonSerializer<BankAccount> bankAccountJsonSerializer = new JsonSerializer<>();
        AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();
        accountRepository.populateData();


        List<BankAccount> bankAccounts = accountRepository.findAll();
        System.out.println("Printing all accounts");
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);


        System.out.println("Searching for account by id 1");
        accountRepository.findById(1L)
                .map(bankAccountJsonSerializer::toJson)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Account not found"));


        System.out.println("Searching for all current accounts");
        List<BankAccount> searchAccounts = accountRepository.searchAccounts(bankAccount -> bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT) && bankAccount.getStatus().equals(AccountStatus.ACTIVATED));

        searchAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);


    }
}
