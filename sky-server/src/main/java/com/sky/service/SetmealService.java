package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;


public interface SetmealService {

    void insert(SetmealDTO setmealDTO);

    SetmealVO getSetmealWithDishes(Long id);

    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    void updateSetmeal(SetmealDTO setmealDTO);

    void startOrStop(Integer status, Long id);

    void delete(List<Long> ids);
}
