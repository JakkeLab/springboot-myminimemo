package Service.Memo;

import Model.Memo.Dto.MemoDto;
import Model.Memo.Memo;

public interface MemoService {

    /**
     * 메모를 하나 만듭니다.
     * @return Memo 기본 Memo
     */
    Memo createMemo();

    /**
     * 메모를 수정합니다
     * @param id 메모의 Id
     * @param memoDto 수정할 메모의 새로운 정보를 담은 DTO
     * @return Memo 수정된 메모 객체
     */
    void updateMemo(Long id, MemoDto memoDto);

    /**
     * 메모를 삭제하고 삭제할 메모의 ID를 반환합니다.
     * @return Long 삭제된 메모의 ID
     */
    Long deleteMemo(Long id);

    /**
     * 메모를 내보내고 내보낸 메모의 정보를 DTO 형태로 반환합니다.
     * @return MemoDto 내보낸 메모의 DTO
     */
    MemoDto exportMemo(Long id);
}
