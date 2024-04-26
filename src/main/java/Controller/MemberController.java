package Controller;

import Service.Member.MemberService;

public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    /**
     * GET : 회원가입 폼 전달
     * @return 회원가입 endpoint
     */
    public String createForm(){

    }

    /**
     * POST : 회원가입 결과 전달
     * @param form
     * @return
     */
    public String create(MemberForm form){

    }

    public String list()
}
