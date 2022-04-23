package Utils;





import Bean.User;
import net.sf.json.JSONObject;


import java.util.Properties;

public class JdbcConfig {

    Properties properties;

    JdbcConfig jdbcConfig;



    private JdbcConfig(){
        User user = new User();
        properties=new Properties();
        JSONObject jsonObject = JSONObject.fromObject(user);
        String json = jsonObject.toString();
        System.out.println(json);
    }

    public JdbcConfig getJdbcConfig() {
        if (jdbcConfig==null){
            jdbcConfig=new JdbcConfig();
        }
        return jdbcConfig;
    }

    public static void main(String[] args) {
        JdbcConfig jdbcConfig = new JdbcConfig();
    }
}
