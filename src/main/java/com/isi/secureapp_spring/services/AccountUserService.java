package com.isi.secureapp_spring.services;

import com.isi.secureapp_spring.dao.AccountUserRepository;
import com.isi.secureapp_spring.dto.AccountUserDto;
import com.isi.secureapp_spring.entities.AccountUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountUserService {

   AccountUserDto save(AccountUserDto accountUser);
   
   List<AccountUserDto> findAll();

   Optional<AccountUserDto> findOne(Long id);

   void delete(Long id);
}
