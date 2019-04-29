package com.fengrui.sessionredisdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-04-29 17:10
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
@RestController
@RefreshScope
@Slf4j
public class SessionController {
    @RequestMapping(value = "/getsession" )
    public String  getSession(HttpServletRequest request){
        HttpSession session=request.getSession();
        log.info("sessionId:"+session.getId());
        String name = (String) session.getAttribute("name");
        if(StringUtils.isNotBlank(name)){
            log.info("已经存在name:"+name);
        }else {
            session.setAttribute("name", "wangzifeng");
        }
        return  session.getId();
    }
}
