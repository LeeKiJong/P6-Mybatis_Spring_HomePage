package com.project6.springhp.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project6.common.Pagination;
import com.project6.common.Search;
import com.project6.springhp.board.service.BoardService;
import com.project6.springhp.dto.BDto;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@Inject
	private BoardService boardService;

	

	@RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
	public String getBoardList(Model model
			, @RequestParam(required = false, defaultValue = "1") int page

			, @RequestParam(required = false, defaultValue = "1") int range
			, @RequestParam(required = false, defaultValue = "title") String searchType

			, @RequestParam(required = false) String keyword

			) throws Exception {
		
		Search search = new Search();

		search.setSearchType(searchType);

		search.setKeyword(keyword);


	
		//전체 게시글 개수
		int listCnt = boardService.getBoardListCnt(search);
		//Pagination 객체생성


		search.pageInfo(page, range, listCnt);

					
		model.addAttribute("pagination", search);
			
		model.addAttribute("boardList", boardService.getBoardList(search));
		return "BoardPage/index";

	}
	
	@RequestMapping(value = "/boardForm")
	public String boardForm(Model model) {
		model.addAttribute("Bdto", new BDto());
		return "BoardPage/boardForm";
	}
	
	@RequestMapping(value = "/saveBoard", method = RequestMethod.POST)
	public String saveBoard(@ModelAttribute("Bdto") BDto Bdto
			, @RequestParam("mode") String mode
			, RedirectAttributes rttr) throws Exception {
		if (mode.equals("edit")) {
			boardService.updateBoard(Bdto);
		} else {
			boardService.insertBoard(Bdto);
		}
		return "redirect:/board/getBoardList";
	}
	
	@RequestMapping(value = "/getBoardContent", method = RequestMethod.GET)
	public String getBoardContent(Model model, @RequestParam("bid") int bid) throws Exception {
		model.addAttribute("boardContent", boardService.getBoardContent(bid));
		return "BoardPage/boardContent";
	}
	
	@RequestMapping(value = "/editForm", method = RequestMethod.GET)
	public String editForm(@RequestParam("bid") int bid
			, @RequestParam("mode") String mode, Model model) throws Exception {

		model.addAttribute("boardContent", boardService.getBoardContent(bid));

		model.addAttribute("mode", mode);

		model.addAttribute("Bdto", new BDto());

		return "BoardPage/boardForm";

	}
	
	@RequestMapping(value = "/deleteBoard", method = RequestMethod.GET)
	public String deleteBoard(RedirectAttributes rttr, @RequestParam("bid") int bid) throws Exception {
		boardService.deleteBoard(bid);
		return "redirect:/board/getBoardList";

	}
	


	
}	