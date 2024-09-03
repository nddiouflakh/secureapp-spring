package com.isi.secureapp_spring.controllers;

import com.isi.secureapp_spring.dto.AccountUserDto;
import com.isi.secureapp_spring.services.AccountUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/AccountUser")
public class AccountUserController {
    private final AccountUserService accountUserService;
    public AccountUserController(AccountUserService accountUserService) {
        this.accountUserService = accountUserService;
    }
    @GetMapping
    public List<AccountUserDto> GetAllAccountUsers() {
        return accountUserService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AccountUserDto> GetAccountUserById(@PathVariable Long id) {
        return accountUserService.findOne(id);
    }

    @PostMapping
    public AccountUserDto CreateAccountUser(@RequestBody AccountUserDto accountUserDto) {
        return accountUserService.save(accountUserDto);
    }

    @DeleteMapping("/{id}")
    public String DeleteAccountUser(@PathVariable Long id) {
        accountUserService.delete(id);
        return "Successfully deleted";
    }
}
