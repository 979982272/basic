package com.htree.datacenter.rest;

import com.htree.datacenter.core.emp.entity.EidpEmp;
import com.htree.datacenter.core.emp.service.EidpEmpSelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author weihua
 * @description
 * @date 2020/1/10 0010
 **/
@RestController
public class IndexController {

    @Autowired
    private EidpEmpSelfService eidpEmpSelfService;

    @RequestMapping
    public List<EidpEmp> index() {
        return eidpEmpSelfService.list();
    }
}
