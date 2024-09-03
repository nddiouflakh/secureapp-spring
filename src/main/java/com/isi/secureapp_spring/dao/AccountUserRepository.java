package com.isi.secureapp_spring.dao;

import com.isi.secureapp_spring.entities.AccountUserEntity;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface AccountUserRepository extends JpaRepository<AccountUserEntity,Long> {
}
