package com.company.dao.inter;

import com.company.dao.impl.CountryRepositoryCustom;
import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<User, Integer>, CountryRepositoryCustom {
}
