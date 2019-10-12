package com.blog.backstage.controller;

import com.blog.backstage.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

@RestController
public class BackStageViewController {
    @Autowired
    private ViewService viewService;

    @GetMapping("/view/{viewname}")
    public String getView(@PathVariable("viewname") String viewname) {

        return viewService.ViewReturnHQ(viewname);
    }
}
