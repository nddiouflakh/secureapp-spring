package com.isi.secureapp_spring.mapper;

import com.isi.secureapp_spring.dto.AccountUserDto;
import com.isi.secureapp_spring.dao.AccountUserRepository;
import com.isi.secureapp_spring.entities.AccountUserEntity;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountUserMapper {
    AccountUserDto toDto(AccountUserEntity accountUserEntity);
    AccountUserEntity toEntity(AccountUserDto accountUserDto);
    List<AccountUserDto> toDtoList(List<AccountUserEntity> accountUserEntities);
    List<AccountUserEntity> toEntityList(List<AccountUserDto> accountUserDtoList);
}
