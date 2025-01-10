package hello.core.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
/*
    @Autowired
    public MemberServiceImpl(@Qualifier("memberRepository") MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
*/
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // Spring Container 테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
