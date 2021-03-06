package com.example.controller;

import com.example.dao.PositionInfoDao;
import com.example.model.PositionModel;
import com.example.model.PresentModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/positions")
public class PositionInfoController {

    private PositionInfoDao positionInfoDao;

    @Autowired
    public PositionInfoController(PositionInfoDao positionInfoDao) {
        this.positionInfoDao = positionInfoDao;
    }

    @GetMapping("")
    public List<PositionModel> getAll() {
        return positionInfoDao.getAll();
    }

    @GetMapping("/{id}")
    public PositionModel getByPositionId(@PathVariable int id) {
        return positionInfoDao.getByPositionId(id);
    }

    @Operation(summary = "Create positions information.")
    @PostMapping(value = "")
    public void create(@RequestBody PositionModel positionModel) {
        positionInfoDao.insert(positionModel);
    }

    @PutMapping(value = "")
    public void update(@RequestBody PositionModel positionModel) {
        positionInfoDao.update(positionModel);
    }

    @DeleteMapping("/{id}")
    public PositionModel positionModel(@PathVariable int id) {
        return positionInfoDao.deletePositionById(id);
    }
}
