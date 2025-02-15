package com.kh.app3.domain.member.svc;

import com.kh.app3.domain.member.Member;

import java.util.List;

public interface MemberSVC {
  //가입
  Member join(Member member);

  //수정
  void modify(Member member);

  //조회 by email
  Member findByEmail(String email);

  //조회 by member_id
  Member findByMemberId(Long memberId);

  //전체조회
  List<Member> findAll();

  //탈퇴
  void out(String email);

  //회원유무체크
  boolean existMember(String email);

  //로그인 인증
  Member login(String email, String passwd);

  //비밀번호 일치여부 체크
  boolean isMember(String email, String passwd);

  //아이디 찾기
  String findEmailByNickname(String nickname);
}
