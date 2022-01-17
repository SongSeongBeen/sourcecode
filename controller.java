
//임포트 해줄것

@Controller
public class Hello{

	@RequestMapping( "/hello")
	public String hello(){
		System.out.println("/hellospring/hello");
		return "/WEB-INF/views/index.jsp";
	}
}
	