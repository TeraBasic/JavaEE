package com.example.demoSQL.service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demoSQL.domain.UserDo;

/**
 * 用户服务数据接口类
 *
 */
@Repository
public interface UserDao extends JpaRepository<UserDo, String> {

	static int delete(String parameter) {
		
		// TODO Auto-generated method stub
		return 0;
	}

	static Object getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}


