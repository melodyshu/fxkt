package com.fx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class Oracle {


    @Autowired
    private SelectCity selectCity;

    @RequestMapping("/demo/init.do")
    public String init(){
        System.out.println("page init...");
        return "index";
    }

    @RequestMapping("/demo/init2.do")
    public ModelAndView init2(){
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("name","zhangsan");
        List<City> cityList=selectCity.queryAll();
        mv.addObject("cityList",cityList);
        return mv;
    }

}
