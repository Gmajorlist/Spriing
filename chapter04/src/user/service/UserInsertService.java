package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserInsertService implements UserService{
	@Setter
	private UserDTO userDTO = null;
	@Setter
	private UserDAO userDAO = null;
	
	@Override
	public void execute() {
		//데이터
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		
		//데이터
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		
		System.out.println("비밀번호 입력 : ");
		String pwd = sc.next();
		
		//UserDTO userDTO = new UserDTO(); bean설정으로 바꾸시오
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		//DB
		//UserDAO userDAO = new UserDAOImpl(); bean으로 바꿔
		userDAO.write(userDTO);
		
		System.out.println(name + "님의 데이터가 저장되었습니다.");
	}

}
