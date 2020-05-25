package com.NF.controller;

import com.NF.service.PersonService;
import com.NF.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
//@Scope(value = "prototype")
@Scope(value = "singleton")
public class PersonController {

    /**
     * 通过@AutoWired注可以完成自动注入
     *  ？ 是按照什么方式进行自动注入的
     *  默认情况是按照ByType来进行装配的
     *      如找不到直接赋值，找不到会报错
     *  如有多个类型一样的bean对象，此时会按照id进行查找，默认的id是类名首字符小写
     *      如果找到了直接注入，找不到报错
     *  如果你想通过名字进行查找，可以自己规定名称，使用注解@Qualifier
     */
    @Autowired
    @Qualifier("personService")
    private PersonService personService2;
    public void save(){
        personService2.save();
    }
}
