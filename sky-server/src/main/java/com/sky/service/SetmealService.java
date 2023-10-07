package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;
import org.springframework.stereotype.Service;


public interface SetmealService {

    void insert(SetmealDTO setmealDTO);

    SetmealVO getSetmealWithDishes(Long id);

    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);
}
