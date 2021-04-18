package com.zgq.bookman.controller;


import com.zgq.bookman.entity.Type;
import com.zgq.bookman.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zgq
 * @since 2021-04-02
 */
@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private ITypeService iTypeService;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Type> findAll(){
        return iTypeService.list();
    }
}

