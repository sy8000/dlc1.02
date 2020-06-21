package cn.besbing.Service.Impl;


import cn.besbing.CommonUtils.Utils.NcToLimsBasicInfo;
import cn.besbing.Entities.Project;
import cn.besbing.Entities.QcCommissionH;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class ConvertNcToLimsServiceImpl {
    /**
     * NC数据转换为Lims每张表数据工具服务类
     */
    @Autowired
    CustomerSqlServiceImpl customerSqlService;


    Logger logger = LoggerFactory.getLogger(ConvertNcToLimsServiceImpl.class);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public Project ConvertProject(QcCommissionH qcCommissionH,Project project){
        project.setName(qcCommissionH.getBillno());
        project.setTemplate(customerSqlService.selectOne("select name from nc_proj_type where pk_proj_type = "+ qcCommissionH.getPkCommissiontype() +"'"));
        project.setTitle(qcCommissionH.getBillname());
        project.setDescription(qcCommissionH.getProgressneed());
        project.setDateCreated(new Date(sdf.format(qcCommissionH.getDmakedate())));
        project.setDateUpdated(new Date(sdf.format(qcCommissionH.getLastmaketime())));
        project.setCustomer(customerSqlService.selectOne("select o.name from org_orgs o where o.pk_org = '" + qcCommissionH.getPkOwner() + "'"));
        project.setCustomerContact(qcCommissionH.getContract());
        project.setOwner(customerSqlService.selectOne("select s.user_code from sm_user s where s.cuserid = '"+ qcCommissionH.getCreator() +"'"));
        project.setCreatedBy(customerSqlService.selectOne("select s.user_code from sm_user s where s.cuserid = '"+ qcCommissionH.getCreator() +"'"));

        return project;
    }







}
