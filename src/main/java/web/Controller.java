package web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import yaminDAO.StudDAO;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private StudDAO studDAO;
	
	public void init() {
		studDAO = new StudDAO();
		
	}
    public Controller() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action =request.getServletPath();
		switch (action) {
		
		case "/new":
			showNewForm(request, response);
			break;
			
		case "/insert":
			try {
				insertStudent(request, response);
			}catch(SQLException e1){
				e1.printStackTrace();
			}
			break;
		
		case "delete":
				deleteStudent(request, response);
				break;
			
		case "/update":
			updateStudent(request, response);
			break;
		case "/edit":
			showEditForm(request, response);
			break;
			
		default:
			try {
				listStudent(response, request);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	private void updateStudent(HttpServletRequest request, HttpServletResponse response) {
		int sid = Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt("age");
		String skill = request.getParameter("skill");
		Student stud = new Student(sid, name, email, age, skill);
		try {
			studDAO.updateStudent(stud);
			response.sendRedirect("list");
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("new-Student.jsp");
			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
	}
	
	private void listStudent(HttpServletResponse response, HttpServletRequest request) throws SQLException, ServletException, IOException {
		List<Student> studList = studDAO.listAllStudent();
		request.setAttribute("studList",  studList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("student-list.jsp");
		dispatcher.forward(request, response);
		
	}
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
		int sid = Integer.parseInt(request.getParameter("sid"));
		Student stud = new Student();
		try {
			stud = studDAO.getOneStudent(sid);
			RequestDispatcher dispatcher = request.getRequestDispatcher("student-form.jsp");
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
	
	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) {
		int sid = Integer.parseInt(request.getParameter("sid"));
		Student stud = new Student();
		stud.setSid(sid);
		try {
			studDAO.deleteStudent(stud);
			response.sendRedirect("list");
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	private void insertStudent(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException {
		String name =request.getParameter("name");
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		String skill = request.getParameter("skill");
		
		System.out.println("-------------------");
		System.out.println(name+""+email+""+age);
		
		Student stud = new Student(0, name, email, Integer.parseInt(age), skill);
		studDAO.addStudent(stud);
		response.sendRedirect("list");
		
		
	}
	
	
	}