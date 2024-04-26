package Repository.Memo;

import Model.Memo.Memo;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemoRepository implements MemoRepository{

    private static Map<Long, Memo> store = new HashMap<>();
    @Override
    public void save(Memo memo) {
        store.put(memo.getMemoId(), memo);
    }

    @Override
    public Memo findMemoById(Long id) {
        try{
            return store.get(id);
        } catch (Exception e){
            throw new RuntimeException("Find memo Exception : " + e.getMessage());
        }

    }

    @Override
    public Long remove(Memo memo) {
        try{
            Long memoId = memo.getMemoId();
            store.remove(memoId);
            return memoId;
        } catch (Exception e) {
            throw new RuntimeException("Memo Remove Error : " + e.getMessage());
        }
    }
}
