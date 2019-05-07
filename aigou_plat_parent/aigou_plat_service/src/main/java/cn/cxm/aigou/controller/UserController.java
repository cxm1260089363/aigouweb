package cn.cxm.aigou.controller;

import cn.cxm.aigou.domain.User;
import cn.cxm.aigou.utils.AjaxResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult login(User user){
//        登录逻辑
        if (user!=null && "admin".equals(user.getName())&&"123456".equals(user.getPwd())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }

    }
}
