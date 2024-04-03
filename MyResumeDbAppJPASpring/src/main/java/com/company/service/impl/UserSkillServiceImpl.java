package com.company.service.impl;

import com.company.dao.impl.UserSkillRepositoryCustom;
import com.company.entity.UserSkill;
import com.company.service.inter.UserSkillServiceInter;
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
public class UserSkillServiceImpl implements UserSkillServiceInter {

    @Autowired
    @Qualifier("userSkillRepositoryCustomImpl")
    private UserSkillRepositoryCustom userSkillDao;


    @Override
    public List<UserSkill> getAllSkillByUserId(int userId) {
        return userSkillDao.getAllSkillByUserId(userId);
    }

    @Override
    public boolean insertUserSkill(UserSkill u) {
        return userSkillDao.insertUserSkill(u);
    }

    @Override
    public boolean updateUserSkill(UserSkill u) {
        return userSkillDao.updateUserSkill(u);
    }

    @Override
    public boolean removeUserSkill(int id) {
        return userSkillDao.removeUserSkill(id);
    }
}
