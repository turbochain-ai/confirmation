package com.confirmation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//这个Controller先放着，只是展示了一个首页，后期优化项目的时候可能会用到,让项目结构更清晰
@Api(value="显示首页",tags="显示首页")
@Controller
@RequestMapping("/main")
public class MainController {
	@ApiOperation(value="显示首页",notes="显示首页")
	@RequestMapping(value="/showIndex",method=RequestMethod.GET)
	public String showIndex() {
		return"index";
	}

}
