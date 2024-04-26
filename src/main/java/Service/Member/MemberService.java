package Service.Member;

import Model.Member.Member;

import java.util.Optional;

public interface MemberService {
    Member join(Member member);
    void validateDuplicateMember(Member member);
    Optional<Member> findMember(Long id);
}
