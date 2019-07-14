package cn.com.crtvu.user.router;

import cn.com.crtvu.user.entity.UserEntity;
import cn.com.crtvu.user.service.UserService;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by weijiuzhu on 2019/3/19.
 */
@RestController
@RequestMapping(value = "/user")
public class UserRouter {

    @Resource
    public UserService userService;

    /**
     * 查询user数据库
     * @return
     */
    @RequestMapping(value = "/queryUserAll", method = RequestMethod.GET)
    public List<UserEntity> queryUserAll(){
        List<UserEntity> userEntities = userService.queryUserAll();
        return userEntities;
    }

    @RequestMapping(value = "/queryUserByHost", method = RequestMethod.GET)
    public List<UserEntity> queryUserByHost(@RequestHeader(name = "host", required = true) String host){
        List<UserEntity> userEntities = userService.queryUserByHost(host);
        return userEntities;
    }
}
