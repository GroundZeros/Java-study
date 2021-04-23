package com.kuang.dao;


import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import com.mysql.jdbc.authentication.MysqlClearPasswordPlugin;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }


        sqlSession.close();
    }
}
