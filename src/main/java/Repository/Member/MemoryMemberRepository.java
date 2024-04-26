package Repository.Member;

import Model.Member.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{
    public static Map<Long, Member> store = new HashMap<>();
    public static long sequence = 0L;
    @Override
    public Member saveMember(Member member) {
        member.setMemberId(sequence++);
        store.put(member.getMemberId(), member);
        return member;
    }

    @Override
    public Optional<Member> findMemberById(Long id) {
        return store.values().stream()
                .filter(member -> member.getName().equals(id))
                .findAny();
    }

    @Override
    public List<Member> findAllMembers() {
        return new ArrayList<>(store.values());
    }
}
