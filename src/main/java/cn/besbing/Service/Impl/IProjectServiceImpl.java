package cn.besbing.Service.Impl;

import cn.besbing.Dao.ProjectMapper;
import cn.besbing.Entities.Project;
import cn.besbing.Service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IProjectServiceImpl implements IProjectService {

    @Autowired(required = false)
    ProjectMapper projectMapper;


    public Project getLimsExampleProject(){
        return projectMapper.selectByPrimaryKey("A-200618-0091");
    }


}
