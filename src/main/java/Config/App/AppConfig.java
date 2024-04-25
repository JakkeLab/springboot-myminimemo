package Config.App;

import Repository.MemoRepository;
import Repository.MemoryMemoRepository;
import Service.MemoService;
import Service.MemoServiceImpl;

public class AppConfig {
    public MemoService memoService(){
        return new MemoServiceImpl(memoRepository());
    }

    public MemoRepository memoRepository(){
        return new MemoryMemoRepository();
    }
}
