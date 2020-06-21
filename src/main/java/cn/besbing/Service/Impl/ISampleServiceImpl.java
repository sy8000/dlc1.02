package cn.besbing.Service.Impl;

import cn.besbing.Dao.SampleMapper;
import cn.besbing.Entities.Sample;
import cn.besbing.Service.ISampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ISampleServiceImpl implements ISampleService {

    @Autowired(required = false)
    SampleMapper sampleMapper;


    public Sample getLimsExampleSample(){
        return sampleMapper.selectByPrimaryKey(Long.valueOf(59574));
    }



}
