import java.sql.*;
public class DemoJDBC {
    /*
     * 1- import package
     * 2- Load and register driver like a SIM
     * 3- Make a connection
     * 4- Create query
     * 5- Execute query
     * 6- Close Connection */
    public static void main(String[] args) throws Exception{
        int sid=101;
        String sname="Ansh";
        int marks=100;
        String squery="select * from student";
        String squery1="insert into student values(2,'Arshdeep',100)";
        String squery2="update student set marks=90 where sid=2";
        String squery3="insert into student values(3,'Ansh',100)";
        String squery4="Delete from student where sid=3";
        String squery5="insert into student values(?,?,?)";

        Class.forName("org.postgresql.Driver"); //loading Driver
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Anshik$&1");
        System.out.println("connected");

        Statement st= con.createStatement();
        PreparedStatement pst=con.prepareStatement(squery5);
        pst.setInt(1,sid);
        pst.setString(2,sname);
        pst.setInt(3,marks);
        //pst.execute();

//        rs.next(); -->it gives boolean response it puts pointer to the next row n check if data is there
//        String name=rs.getString("sname");
//        System.out.println(name);

        //Boolean status=st.execute(squery1);
        //st.execute(squery2);
        //System.out.println(status);
        //st.execute(squery3);
        //st.execute(squery4);
        ResultSet rs=st.executeQuery(squery);
        while(rs.next())
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt("marks"));
        }
        con.close();
    }
    }

