package com.example.sampleboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {
	@GetMapping
	public String hello() {

		return "hello";//文字列のhelloではなくhello.htmlを呼んでいる
	}

}
