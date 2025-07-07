package com.example.memo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.memo.entity.Memo;
import com.example.memo.mapper.MemoMapper;

@Service
public class MemoService {
    private final MemoMapper memoMapper;

    public MemoService(MemoMapper memoMapper) {
        this.memoMapper = memoMapper;
    }

    public List<Memo> findAll() {
        return memoMapper.findAll();
    }

    public Memo findById(int id) {
        return memoMapper.findById(id);
    }

    public void insert(Memo memo) {
        memoMapper.insert(memo);
    }

    public void update(Memo memo) {
        memoMapper.update(memo);
    }

    public void delete(int id) {
        memoMapper.delete(id);
    }
}
