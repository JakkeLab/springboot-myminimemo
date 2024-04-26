package Model.Memo;

import java.sql.Timestamp;
import java.time.Instant;

public class MemoGeneral implements Memo{

    private MemoType memoType;
    private String title;

    private String content;
    private Timestamp timeStamp;
    private Long id;

    @Override
    public Long getMemoId() {
        return id;
    }

    public void setMemoId(Long id){
        this.id = id;
    }

    //region Getter Setter
    @Override
    public MemoType getMemoType() {
        return memoType;
    }

    @Override
    public void setMemoType(MemoType memoType) {
        this.memoType = memoType;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    @Override
    public void setTimeStamp(Timestamp timestamp) {
        this.timeStamp = timestamp;
    }
    //endregion

    private MemoGeneral(Long id){
        this.id = id;
        this.timeStamp = Timestamp.from(Instant.now());
        this.title = "New Memo";
        this.content = "";
        this.memoType = MemoType.General;
    }

    public static MemoGeneral GetDefaultMemo(Long id){
        return new MemoGeneral(id);
    }
}
