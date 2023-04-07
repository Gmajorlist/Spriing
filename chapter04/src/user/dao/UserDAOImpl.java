package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import lombok.Setter;
import user.bean.UserDTO;

/*
 * public class UserDAOImpl implements UserDAO{
 * 
 * @Setter private JdbcTemplate jdbcTemplate =null;
 * 
 * 
 * 
 * @Override public void write(UserDTO userDTO) { String sql =
 * "insert into usertable values(?,?,?)";
 * jdbcTemplate.update(sql,userDTO.getName(),userDTO.getId(),userDTO.getPwd());
 * //입력과 수정을 같이해요
 * 
 * }
 * 
 * 
 * 
 * @Override public List<UserDTO> getUserList() { String sql =
 * "select * from usertable"; return jdbcTemplate.query(sql, new
 * BeanPropertyRowMapper<UserDTO>(UserDTO.class)); }
 * 
 * 
 * 
 * 
 * }
 */
/*
 * public class UserDAOImpl extends JdbcDaoSupport implements UserDAO{
 * 
 * 
 * @Override public void write(UserDTO userDTO) { String sql =
 * "insert into usertable values(?,?,?)";
 * getJdbcTemplate().update(sql,userDTO.getName(),userDTO.getId(),userDTO.getPwd
 * ()); //입력과 수정을 같이해요
 * 
 * }
 * 
 * 
 * 
 * @Override public List<UserDTO> getUserList() { String sql =
 * "select * from usertable"; return getJdbcTemplate().query(sql, new
 * BeanPropertyRowMapper<UserDTO>(UserDTO.class)); }
 * 
 * 
 * 
 * 
 * }
 */

public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO{


 
 @Override 
 public void write(UserDTO userDTO) 	{	
	 String sql = "insert into usertable values(:name,:id,:pwd)";
	 
	 Map<String, String> map = new HashMap<String, String>();
	 map.put("name",userDTO.getName());
	 map.put("id",userDTO.getId());
	 map.put("pwd",userDTO.getPwd());
	 
	 getNamedParameterJdbcTemplate().update(sql, map);
 
 
 }
 
 
 
 @Override 
 public List<UserDTO> getUserList() { 
	 String sql = "select * from usertable"; 
	 return getJdbcTemplate().query(sql, new
 			BeanPropertyRowMapper<UserDTO>(UserDTO.class)); }
}



