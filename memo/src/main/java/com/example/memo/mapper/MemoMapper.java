package com.example.memo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.memo.entity.Memo;

@Mapper
public interface MemoMapper {
    // メモ一覧取得
    public List<Memo> findAll();

    // メモ詳細取得
    public Memo findById(int id);

    // メモ登録
    public void insert(Memo memo);

    // メモ更新
    public void update(Memo memo);

    // メモ削除
    public void delete(int id);
}