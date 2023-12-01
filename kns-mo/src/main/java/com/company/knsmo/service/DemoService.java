package com.company.knsmo.service;

import org.springframework.stereotype.Service;
import com.company.modulecommon.enums.CodeEnum;

@Service
public class DemoService {

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        return "save";
    }

    public String find() {
        return "find";
    }
}
