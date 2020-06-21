package cn.besbing.Service.Impl;

import cn.besbing.Dao.CProjTaskParaBMapper;
import cn.besbing.Entities.CProjTaskParaB;
import cn.besbing.Service.ICProjTaskParaBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICProjTaskParaBServiceImpl implements ICProjTaskParaBService {

    @Autowired(required = false)
    CProjTaskParaBMapper cProjTaskParaBMapper;


    public CProjTaskParaB getLimsExampleCProjTaskParaB(){
        return cProjTaskParaBMapper.selectByPrimaryKey(Long.valueOf(267340));
    }

}
