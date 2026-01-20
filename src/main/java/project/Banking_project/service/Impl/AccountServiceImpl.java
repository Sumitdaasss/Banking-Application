package project.Banking_project.service.Impl;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.stereotype.Service;
import project.Banking_project.DTO.AccountDto;
import project.Banking_project.entity.Account;
import project.Banking_project.exception.AccountException;
import project.Banking_project.mapper.AccountMapper;
import project.Banking_project.repository.AccountRepository;
import project.Banking_project.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
       Account account = accountRepository.findById(id).orElseThrow(()-> new AccountException("Account not found"));
       return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        Account account = accountRepository.findById(id).orElseThrow(()-> new AccountException("Account not found"));
        double total = account.getBalance() + amount;
        account.setBalance(total);
        Account saveAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(saveAccount);
    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        Account account = accountRepository.findById(id).orElseThrow(()-> new AccountException("Account not found"));

        if(account.getBalance() < amount){
            throw new RuntimeException("Insufficient balance");
        }
        double total = account.getBalance() - amount;
        account.setBalance(total);
        Account saveAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(saveAccount);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<AccountDto> accountDtos = accountRepository.findAll()
                .stream()
                .map(AccountMapper::mapToAccountDto).toList();
        return accountDtos;
    }

    @Override
    public void deleteAccount(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(()-> new AccountException("Account not found"));
        accountRepository.deleteById(id);
    }

}
