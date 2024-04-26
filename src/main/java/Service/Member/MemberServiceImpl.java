package Service.Member;

import Model.Member.Member;
import Repository.Member.MemberRepository;

import java.util.Optional;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Override
    public Member join(Member member) {
        //회원 가입
        try {
            validateDuplicateMember(member);
            memberRepository.saveMember(member);
            return member;
        } finally {

        }
    }
    @Override
    public void validateDuplicateMember(Member member) {
        //회원 중복 체크
        memberRepository.findMemberById(member.getMemberId())
                .ifPresent(m -> {
                    throw new IllegalStateException("Member already exists");
                });
    }

    @Override
    public Optional<Member> findMember(Long id) {
        //회원 찾기
        return memberRepository.findMemberById(id);
    }
}
