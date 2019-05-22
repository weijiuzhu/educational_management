package cn.com.crtvu.user.service;

/**
 * Created by weijiuzhu on 2019/3/19.
 */

import cn.com.crtvu.user.dao.UserDao;
import cn.com.crtvu.user.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserDao userDao;

    /**
     * 查询user表中的所有数据
     */
    public List<UserEntity> queryUserAll(){
        try {
            List<UserEntity> userEntities = userDao.queryUserAll();
            return userEntities;
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            return new ArrayList<UserEntity>();
        }
    }

    public List<UserEntity> queryUserByHost(String host){
        try {
            List<UserEntity> userEntities = userDao.queryUserByHost(host);
            return userEntities;
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            return new ArrayList<UserEntity>();
        }
    }
}
