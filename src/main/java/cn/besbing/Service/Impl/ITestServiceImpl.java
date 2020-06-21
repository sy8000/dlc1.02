package cn.besbing.Service.Impl;

import cn.besbing.Dao.TestMapper;
import cn.besbing.Entities.Test;
import cn.besbing.Service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ITestServiceImpl implements ITestService {

    @Autowired(required = false)
    TestMapper testMapper;

    public Test getLimsExampleTest(){
        return testMapper.selectByPrimaryKey(Long.valueOf(179511));
    }

    public Test getCProjTaskTest(){
        return testMapper.selectByPrimaryKey(Long.valueOf(179510));
    }

    public Test getLimsExampleInitTest(){
        return testMapper.selectByPrimaryKey(Long.valueOf(178187));
    }

    public Test getLimsExampleAfterTest(){
        return testMapper.selectByPrimaryKey(Long.valueOf(178187));
    }

}
