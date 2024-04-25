package Repository;

import Model.Memo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
        return null;
    }
}
