package Controller;

import Model.Memo.Dto.MemoDto;

public class MemoController {
    /**
     * GET : 메모 Dto 가져오기
     * @param memoId 메모의 id
     * @return 메모의 Dto
     */
    public MemoDto getMemo(Long memoId) {

    }

    /**
     * PATCH : 메모 수정
     * @param memoId 저장할 메모의 id
     * @param dto 수정된 내용을 담은 DTO
     * @return 수정된 메모의 id
     */
    public long saveMemo(Long memoId, MemoDto dto){

    }

    /**
     * POST : 메모 생성
     * @return 생성한 메모의 id
     */
    public long createMemo() {

    }

    /**
     * DELETE : 메모삭제
     * @return 삭제된 메모의 id
     */
    public Long deleteMemo(){

    }
}
