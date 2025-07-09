-- テーブルが存在したら削除する
DROP TABLE IF EXISTS memos;

-- テーブルの作成
CREATE TABLE memos (
    -- id: 主キー
    id SERIAL PRIMARY KEY,
    -- title: タイトル
    title VARCHAR(255) NOT NULL,
    -- detail: 詳細
    detail TEXT,
    -- created_at: 作成日時
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    -- updated_at: 更新日時
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);