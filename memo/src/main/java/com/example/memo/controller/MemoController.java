package com.example.memo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.memo.entity.Memo;
import com.example.memo.service.MemoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/memos")
public class MemoController {
    private final MemoService memoService;

    // メモ一覧取得
    @GetMapping
    public List<Memo> findAll() {
        return memoService.findAll();
    }

    // メモ詳細取得
    @GetMapping("/{id}")
    public Memo findById(@PathVariable int id) {
        return memoService.findById(id);
    }

    // メモ登録
    @PostMapping
    public void insert(@RequestBody Memo memo) {
        memoService.insert(memo);
    }

    // メモ更新
    @PostMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Memo memo) {
        memo.setId(id);
        memoService.update(memo);
    }

    // メモ削除
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        memoService.delete(id);
    }
}
