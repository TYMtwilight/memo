package com.example.memo.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Memo {
    /** メモID */
    private int id;
    /** タイトル */
    private String title;
    /** 詳細内容 */
    private String detail;
    /** 登録日時 */
    private LocalDateTime createdAt;
    /** 更新日時 */
    private LocalDateTime updatedAt;
}