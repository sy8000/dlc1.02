package cn.besbing.Service.Impl;

import cn.besbing.Dao.ResultMapper;
import cn.besbing.Entities.Result;
import cn.besbing.Service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ResultServiceImpl implements IResultService {

    @Autowired(required = false)
    ResultMapper resultMapper;

    public void setResultUpdate(Result result){
        resultMapper.updateByDefKey(result);
    }

    public Result getResultByDefKey(Result res){
        return resultMapper.selectByDefKey(res);
    }

    public int updateByPrimary(Result res){
        return resultMapper.updateByPrimaryKey(res);
    }

    public int insertResult(Result res){
        return resultMapper.insert(res);
    }

    public Result getResultByPrimary(Long resultNo){
        return resultMapper.selectByPrimaryKey(resultNo);
    }

    public Result getLimsExampleResult(){
        return resultMapper.selectByPrimaryKey(Long.valueOf(9221886));
    }

    //9221873

    public Result getLimsConditionExampleResult(){
        return resultMapper.selectByPrimaryKey(Long.valueOf(9221873));
    }

}
