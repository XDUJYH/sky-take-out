package com.sky.controller.admin;


import com.sky.result.Result;
import com.sky.service.SetmealService;
import com.sky.vo.SetmealVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin/setmeal")
@Api(tags = "套餐相关")
@Slf4j
public class SetmealController {

    @Autowired
    SetmealService setmealService;


    @PutMapping
    @ApiOperation("修改套餐")
    public Result update(@RequestBody SetmealVO setmealVO){
        log.info("修改套餐");
        return null;
    }
}
