package com.example.demoSQL.service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demoSQL.domain.UserDo;

/**
 * 用户服务数据接口类
 *
 */
@Repository
public interface UserDao extends JpaRepository<UserDo, Long> {
	//UserDo findByAccount(String string);
	@Select("select * from user where username=#{username} limit 1")
        User getOneUser(String username);
    @Insert("insert into user (username,usename1,usersurname,userpseudonym,useraddress,userphone,userinfo,password,) values(#{username},#{username1},#{usersurname},#{userpseudonym},#{useraddress},#{userphone},#{userinfo},#{password})")
    boolean setOneUser(User user);

}


