package hello.core.member;

public interface MemberRepository {
    void save(Member member);
    Member FindById(Long memberId);
}
