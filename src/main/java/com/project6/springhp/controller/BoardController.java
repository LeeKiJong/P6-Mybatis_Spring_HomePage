package com.project6.springhp.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project6.springhp.board.service.BoardService;
import com.project6.springhp.dto.BDto;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@Inject
	private BoardService boardService;

	

	@RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
	public String getBoardList(Model model) throws Exception {
		//model.addAttribute("boardList", boardService.getBoardList());
		return "BoardPage/index";

	}
	
	@RequestMapping(value = "/boardFrom")
	public String boardForm() {
		return "BoardPage/boardForm";
	}
	
	@RequestMapping(value = "/saveBoard", method = RequestMethod.POST)
	public String saveBoard(@ModelAttribute("BoardVO") BDto Bdto

			, RedirectAttributes rttr) throws Exception {
		//RedirectAttributes를 쓰는 이유: '뒤로 가기' 버튼으로 인한 게시물 도배의 대응책. 이 인자를 사용하면 뒤로가기를 눌러도 글쓰기 폼으로 돌아 가게 된다.
		boardService.insertBoard(Bdto);

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



	
}	