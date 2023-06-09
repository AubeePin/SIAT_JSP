package org.comstudy.myweb.board;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.myweb.Command;
import org.comstudy.myweb.Controller;
import org.comstudy.myweb.board.service.DetailCommand;
import org.comstudy.myweb.board.service.ListCommand;
import org.comstudy.myweb.board.service.WriteCommand;

public class BoardController implements Controller {
	HashMap<String, Command> cmdMap = new HashMap<String, Command>();
	public BoardController() {
		cmdMap.put("/list.do", new ListCommand());
		cmdMap.put("/write.do", new WriteCommand());
		cmdMap.put("/detail.do", new DetailCommand());
	}
	@Override
	public void doProcess(HttpServletRequest req) {
		Command cmd = cmdMap.get(req.getAttribute("filePath"));
		cmd.execute(req);
	}
}
