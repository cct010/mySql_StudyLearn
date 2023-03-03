/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2023-03-03
 * Time: 10:14
 */
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc {
    public static void main1(String[] args) throws SQLException {
        //以下是删除数据表里的内容
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java20230303?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("1234");

        Connection connection = dataSource.getConnection();

        System.out.println("请输入学号：");
        int id = scanner.nextInt();
        System.out.println("请输入姓名：");
        String name = scanner.next();

        String sql = " insert into stu values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        //insert,updata,delete使用executeUpdate()
        //select使用executQuery()

        statement.setInt(1,id);
        statement.setString(2,name);

        System.out.println("statement:"+statement);
        int ret = statement.executeUpdate();
        System.out.println(ret);
        statement.close();
        connection.close();
    }
    public static void main(String[] args) throws SQLException {
        //以下是删除数据表里的内容
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java20230303?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("1234");

        Connection connection = dataSource.getConnection();

        System.out.println("请输入学号：");
        int id = scanner.nextInt();
        System.out.println("请输入姓名：");
        String name = scanner.next();

        String sql = " insert into stu values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        //insert,updata,delete使用executeUpdate()
        //select使用executQuery()

        statement.setInt(1,id);
        statement.setString(2,name);

        System.out.println("statement:"+statement);
        int ret = statement.executeUpdate();
        System.out.println(ret);
        statement.close();
        connection.close();
    }
}
