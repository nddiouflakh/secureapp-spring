package com.isi.secureapp_spring.impl;

import com.isi.secureapp_spring.dao.AccountUserRepository;
import com.isi.secureapp_spring.dto.AccountUserDto;
import com.isi.secureapp_spring.mapper.AccountUserMapper;
import com.isi.secureapp_spring.services.AccountUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountUserServiceImpl implements AccountUserService {
    private final AccountUserRepository accountUserRepository;
    private final AccountUserMapper accountUserMapper;

    public AccountUserServiceImpl(AccountUserRepository accountUserRepository, AccountUserMapper accountUserMapper) {
        this.accountUserRepository = accountUserRepository;
        this.accountUserMapper = accountUserMapper;
    }

    @Override
    public AccountUserDto save(AccountUserDto accountUserDto) {
        var result = accountUserRepository.save(accountUserMapper.toEntity(accountUserDto));
        return accountUserMapper.toDto(result);
    }

    @Override
    public List<AccountUserDto> findAll() {
        var accountUser = accountUserRepository.findAll();
        return accountUserMapper.toDtoList(accountUser);
    }

    @Override
    public Optional<AccountUserDto> findOne(Long id) {
        return accountUserRepository.findById(id).map(accountUserMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        accountUserRepository.deleteById(id);
    }


}