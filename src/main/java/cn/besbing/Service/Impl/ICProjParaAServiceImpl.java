package cn.besbing.Service.Impl;

import cn.besbing.Dao.CProjParaAMapper;
import cn.besbing.Entities.CProjParaA;
import cn.besbing.Service.ICProjParaAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICProjParaAServiceImpl implements ICProjParaAService {

    @Autowired(required = false)
    CProjParaAMapper cProjParaAMapper;

    public CProjParaA getLimsExampleCProjParaA(){
        return cProjParaAMapper.selectByPrimaryKey(Long.valueOf(93585));
    }

}
