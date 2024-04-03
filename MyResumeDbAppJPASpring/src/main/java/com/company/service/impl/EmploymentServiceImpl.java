package com.company.service.impl;

import com.company.dao.impl.EmploymentHistoryRepositoryCustom;
import com.company.entity.EmploymentHistory;
import com.company.service.inter.EmploymentHistoryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author asgar
 */
@Service
@Transactional
public class EmploymentServiceImpl implements EmploymentHistoryServiceInter {

    @Autowired
    private EmploymentHistoryRepositoryCustom employmentDao;


    @Override
    public List<EmploymentHistory> getAllEmploymentHistoryByUserId(int userId) {
        return employmentDao.getAllEmploymentHistoryByUserId(userId);
    }
}
