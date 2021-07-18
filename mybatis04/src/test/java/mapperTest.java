import com.hu.mapper.StudentMapper;
import com.hu.mapper.TeacherMapper;
import com.hu.mapper.TeacherMapper01;
import com.hu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class mapperTest {
    @Test
    public void testGetStudents(){
        SqlSession session = MybatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        System.out.println(mapper.getStudents());
        session.close();
    }
    @Test
    public void testGetTeacher(){
        SqlSession session = MybatisUtil.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        System.out.println(mapper.getTeachers());
        session.close();
    }
    @Test
    public void getMyStudent(){
        SqlSession session = MybatisUtil.getSession();
        TeacherMapper01 mapper = session.getMapper(TeacherMapper01.class);
        System.out.println(mapper.getStudents(1));
        session.close();
    }
    @Test
    public void getMyStudent01(){
        SqlSession session = MybatisUtil.getSession();
        TeacherMapper01 mapper = session.getMapper(TeacherMapper01.class);
        System.out.println(mapper.getStudents01(1));
        session.close();
    }
}
