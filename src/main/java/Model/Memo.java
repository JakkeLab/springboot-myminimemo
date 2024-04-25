package Model;

import java.sql.Timestamp;

public interface Memo {
    Long getMemoId();
    void setMemoId(Long id);
    MemoType getMemoType();
    void setMemoType(MemoType memoType);
    String getTitle();
    void setTitle(String title);

    String getContent();
    void setContent(String content);

    Timestamp getTimeStamp();
    void setTimeStamp(Timestamp timestamp);
}
