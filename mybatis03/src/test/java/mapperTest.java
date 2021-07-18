import com.hu.mapper.UserMapper;
import com.hu.pojo.User;
import com.hu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class mapperTest {
    @Test
   public void testGetUsers(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        System.out.println(users);
        session.close();
    }
    @Test
    public void testAddUser(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.addUser(new User("a008","和","hdsdss"));
        session.close();
    }
    @Test
    public void testDeleteUser(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteUser("a008");
        session.close();
    }
    @Test
    public void testUpdateName(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.updateName("六11","a006");
        session.close();
    }
}
