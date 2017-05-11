package com.mogo.core.action;

import com.mogo.core.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liang_zhang on 2017/5/11.
 */
@Controller
@RequestMapping("/")
public class IndexAct {

    @RequestMapping("/")
    public ModelAndView userlist(User queryBean) {
        return null;


    }
}
