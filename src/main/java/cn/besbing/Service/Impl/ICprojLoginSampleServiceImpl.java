package cn.besbing.Service.Impl;

import cn.besbing.Dao.CProjLoginSampleMapper;
import cn.besbing.Entities.CProjLoginSample;
import cn.besbing.Service.ICprojLoginSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICprojLoginSampleServiceImpl implements ICprojLoginSampleService {

    @Autowired(required = false)
    CProjLoginSampleMapper cProjLoginSampleMapper;


    public CProjLoginSample getLimsExampleCProjLoginSample(){
        return cProjLoginSampleMapper.selectByPrimaryKey(Short.valueOf("6752"));
    }

}
