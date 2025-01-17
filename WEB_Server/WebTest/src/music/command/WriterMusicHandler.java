package music.command;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class WriterMusicHandler
 */
@WebServlet("/registmusic.do")
public class WriterMusicHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher  dispatcher=null;   
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WriterMusicHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
				
		// String music_file = request.getSession().getServletContext().getRealPath("music_file");
		// String music_picture = request.getSession().getServletContext().getRealPath("music_picture");
		 
		 String uploadPath = "C:/Users/EaBEll/Desktop/javaupload";


		//업로드 파일 최대 크기 지정
		 int size = 500*1024*1024;   
		 
		 String name="";

		 String subject="";

		 String filename="";

		 

		 String name2="";

		 String subject2="";

		 String filename2="";

		 

		 String name3="";

		 String subject3="";

		 String filename3="";

		 String music_name="";
		 String album="";
		 String music_file="";
		 String music_pictuer="";
		 
		 
		 

		 try{

		  // 파일 업로드. 폼에서 가져온 인자값을 얻기 위해request 객체 전달, 업로드 경로, 파일 최대 크기, 한글처리, 파일 중복처리

		  MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());

		 

		 

		  // 이전 페이지의 form에서 입력한 각각의 값을 가져온다.
		  music_name= multi.getParameter("music_name");
		  album=multi.getParameter("album");

		  
		  
		  
		  

//		  name = multi.getParameter("name");
//
//		  subject = multi.getParameter("subject");
//
//		 
//
//		  name2 = multi.getParameter("name2");
//
//		  subject2 = multi.getParameter("subject2");
//
//		 
//
//		  name3 = multi.getParameter("name3");
//
//		  subject3 = multi.getParameter("subject3");

		 

		 

		// 업로드한 파일들을 Enumeration 타입으로 반환

		// Enumeration형은 데이터를 뽑아올때 유용한 인터페이스임.  Enumeration객체는 java.util 팩키지에 정의 되어있으므로

//		     java.util.Enumeration을 import 시켜야 함.

		  Enumeration files = multi.getFileNames();

		  

		 

		// 업로드한 파일들의 이름을 얻어옴
		  
		  
		  music_file=multi.getFilesystemName("music_file");
		  music_pictuer=multi.getFilesystemName("music_pictuer");

		  String file =(String)files.nextElement();
		  music_file=multi.getFilesystemName(file);
		  
		  String file2 =(String)files.nextElement();
		  music_pictuer=multi.getFilesystemName(file2);
		

		
		 	
//		  
//		  String file = (String)files.nextElement();
//
//		  filename = multi.getFilesystemName(file);
//
//		 
//
//		  String file2 = (String)files.nextElement();
//
//		  filename2 = multi.getFilesystemName(file2);
//
//		 
//
//		  String file3 = (String)files.nextElement();
//
//		  filename3 = multi.getFilesystemName(file2);

//		  request.setAttribute("music_file", music_file);
//		  request.setAttribute("music_pictuer", music_pictuer);
		  
		
		 }catch(Exception e){

		  // 예외처리

			 
		  e.printStackTrace();

		 }

		  dispatcher=request.getRequestDispatcher("webTest/View/list/newMusicSuccess.jsp");
		 dispatcher.forward(request, response);
		}
	}
