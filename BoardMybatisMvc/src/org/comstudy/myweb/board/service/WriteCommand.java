package org.comstudy.myweb.board.service;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.myweb.Command;
import org.comstudy.myweb.board.BoardCommand;

public class WriteCommand implements BoardCommand {

	@Override
	public void execute(HttpServletRequest req) {
		req.setAttribute("viewName", "board/write");
	}

}
