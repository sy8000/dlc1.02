package cn.besbing.Service.Impl;

import cn.besbing.Dao.CProjTaskMapper;
import cn.besbing.Entities.CProjTask;
import cn.besbing.Service.ICprojTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ICprojTaskServiceImpl implements ICprojTaskService {

    @Autowired(required = false)
    CProjTaskMapper cProjTaskMapper;

    public CProjTask getLimsExampleTask(){
        return cProjTaskMapper.selectByPrimaryKey(Long.valueOf(15019));
    }



}
