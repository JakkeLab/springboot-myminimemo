package Service;

import Model.Dto.MemoDto;
import Model.Memo;
import Model.MemoGeneral;
import Repository.MemoRepository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

public class MemoServiceImpl implements MemoService{
    private final MemoRepository memoRepository;

    public MemoServiceImpl(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }

    @Override
    public Memo createMemo() {
        return MemoGeneral.GetDefaultMemo(null);
    }

    @Override
    public void updateMemo(Long id, MemoDto memoDto) {
        try {
            Memo memo = memoRepository.findMemoById(id);
            memo.setTitle(memoDto.getTitle());
            memo.setContent(memoDto.getContent());
            memo.setTimeStamp(Timestamp.from(Instant.now()));
            memoRepository.save(memo);
        } catch (Exception e) {
            throw new RuntimeException("Update Memo Error : " + e.getMessage());
        }
    }

    @Override
    public Long deleteMemo(Long id) {
        try {
            Memo memo = memoRepository.findMemoById(id);
            memoRepository.remove(memo);
            return memo.getMemoId();
        } catch (Exception e) {
            throw new RuntimeException("Delete Memo Error : " + e.getMessage());
        }
    }

    @Override
    public MemoDto exportMemo(Long id) {
        try {
            Memo memo = memoRepository.findMemoById(id);
            // MemoDto 생성 및 반환
            return new MemoDto(memo.getMemoId(), memo.getTitle(), memo.getContent());
        } catch (Exception e) {
            throw new RuntimeException("Export Memo Error : " + e.getMessage());
        }
    }

    public MemoRepository getMemoRepository() {
        return memoRepository;
    }
}
