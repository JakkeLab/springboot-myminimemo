package Repository.Member;

import Model.Member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member saveMember(Member member);

    Optional<Member> findMemberById(Long id);

    List<Member> findAllMembers();

}
