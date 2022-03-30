package com.bigdata.buur.search.controller;

import com.bigdata.buur.beer.dto.BeerDto;
import com.bigdata.buur.search.dto.SearchHistoryDto;
import com.bigdata.buur.search.service.SearchService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api-v1/search")
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @ApiOperation(value = "검색 기록 저장")
    @PostMapping()
    public ResponseEntity<String> searchHistorySave(@RequestBody SearchHistoryDto searchHistory) {
        return ResponseEntity.ok().body(searchService.saveSearchHistory(searchHistory));
    }

    @ApiOperation(value = "검색 기록 조회")
    @GetMapping()
    public ResponseEntity<List<SearchHistoryDto>> searchHistoryList() {
        return ResponseEntity.ok().body(searchService.findSearchHistoryList());
    }

    @ApiOperation(value = "검색 기록 삭제")
    @DeleteMapping("/{search_id}")
    public ResponseEntity<String> searchHistoryRemove(@PathVariable @ApiParam(value = "검색 번호") Long search_id) {
        return ResponseEntity.ok().body(searchService.removeSearchHistory(search_id));
    }
}
