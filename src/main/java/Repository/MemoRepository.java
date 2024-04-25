package Repository;

import Model.Dto.MemoDto;
import Model.Memo;

import java.util.List;
import java.util.Optional;

public interface MemoRepository {

    /**
     * 메모를 저장합니다.
     * @param memo 저장할 메모
     */
    void save(Memo memo);

    /**
     * 메모를 찾습니다
     * @param id 메모의 고유 ID
     * @return 찾은 메모반환
     */
    Memo findMemoById(Long id);

    Long remove(Memo memo);
}