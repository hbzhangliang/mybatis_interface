package com.mogo.core.mapper;

/**
 * Created by admin on 2016/7/6.
 */
import com.mogo.core.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM t_core_user WHERE id = #{pid}")
    User getUserList(@Param("pid") String id);

    @Select("SELECT * FROM t_core_user")
    List<User> getAllUserList();


    @Insert("insert into t_core_user values(#{id}, #{account},#{real_name},#{pwd},#{mail},#{flag})")
    int add(User user);

    @Update("update t_core_user set account=#{account},real_name=#{real_name},pwd=#{pwd},mail=#{mail},flag=#{flag} where id =#{id}")
    int update(User user);

    @Delete("delete from t_core_user where id=#{id}")
    int deleteById(String id);

}
