package cn.com.wjz.wei.user.dao;

import cn.com.wjz.wei.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by weijiuzhu on 2019/3/19.
 */
@Mapper
public interface UserDao {

    /**
     * 查询user表的数据
     * @return
     */
    List<UserEntity> queryUserAll();

    /**
     * 根据host查询user
     * @param user
     * @return
     */
    List<UserEntity> queryUserByHost(String user);
}
