// Action.java

package action.com.tistory.gangzzang;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
} // Action
