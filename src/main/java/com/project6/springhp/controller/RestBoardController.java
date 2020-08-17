package com.project6.springhp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.project6.springhp.board.service.BoardService;
import com.project6.springhp.dto.RDto;

@RestController
@RequestMapping(value = "/restBoard")
public class RestBoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject

	private BoardService boardService;

	@RequestMapping(value = "/getReplyList", method = RequestMethod.POST)

	public List<RDto> getReplyList(@RequestParam("bid") int bid) throws Exception {

		return boardService.getReplyList(bid);

	}

	@RequestMapping(value = "/saveReply", method = RequestMethod.POST)

	public Map<String, Object> saveReply(@RequestBody RDto Rdto) throws Exception {

		Map<String, Object> result = new HashMap<String, Object>();

		try {

			boardService.saveReply(Rdto);

			result.put("status", "OK");

		} catch (Exception e) {

			e.printStackTrace();

			result.put("status", "False");

		}

		return result;

	}

}