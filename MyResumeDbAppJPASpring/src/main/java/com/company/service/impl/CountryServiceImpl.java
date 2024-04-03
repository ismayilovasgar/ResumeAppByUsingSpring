package com.company.service.impl;

import com.company.dao.impl.CountryRepositoryCustom;
import com.company.entity.Country;
import com.company.service.inter.CountryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author asgar
 */
@Service
@Transactional
public class CountryServiceImpl implements CountryServiceInter {

    @Autowired
    @Qualifier("countryRepositoryCustomImpl")
    private CountryRepositoryCustom countryDao;


    @Override
    public List<Country> getAllCountry() {
        return countryDao.getAllCountry();
    }

    @Override
    public boolean removeCountry(int id) {
        return countryDao.removeCountry(id);
    }

    @Override
    public boolean updateCountry(Country c) {
        return countryDao.updateCountry(c);
    }
}