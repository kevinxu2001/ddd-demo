package com.kevin.demo.infrastructure.repository;

import com.kevin.demo.domain.credit.Credit;
import com.kevin.demo.domain.credit.CreditRepository;
import com.kevin.demo.infrastructure.mapper.CreditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CreditRepositoryImpl implements CreditRepository {

    @Autowired
    private CreditMapper creditMapper;

    @Override
    public void deleteByPrimaryKey(Integer id) {

    }

    @Override
    public void insert(Credit credit) {
        creditMapper.insert(credit);
    }

    @Override
    public int insertSelective(Credit credit) {
        return 0;
    }

    @Override
    public Credit selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public void updateByPrimaryKeySelective(Credit credit) {

    }

    @Override
    public void updateByPrimaryKey(Credit credit) {

    }

    @Override
    public List selectAll() {

        return creditMapper.selectAll();

    }
}
