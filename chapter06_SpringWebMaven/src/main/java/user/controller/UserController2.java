package user.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
 // 그냥 잘라서 써봄 너무길어서
@Controller
@RequestMapping(value="user")
public class UserController2 {
	//파일업로드
	@GetMapping(value="uploadForm")
	public String uploadForm() {
		return "user/uploadForm";
	}
	@PostMapping(value="upload")
	@ResponseBody
	public String upload(@RequestParam MultipartFile img, HttpSession session) {
		//가상
		String filePath_lier ="D:/Spring/workspace/Spriing/chapter06_SpringWebMaven/src/main/webapp/WEB-INF/storage";
		
		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
		System.out.println("실제 폴더 = " + filePath);
		String fileName = img.getOriginalFilename();
		
		File file = new File(filePath, fileName); // 파일생성
		File file_lier = new File(filePath_lier, fileName);
		
		try {
			FileCopyUtils.copy(img.getInputStream(), new FileOutputStream(file_lier));//파일복사
			
			img.transferTo(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return "<img src='../storage/" + fileName + "'width='300' height='300'/>";
	}
}
