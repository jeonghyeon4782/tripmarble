package com.dj.trip.domain.member.mapper;

import com.dj.trip.domain.member.Member;
import com.dj.trip.domain.oauth.OauthMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    // 회원가입
    void insertMember(Member member);

    // 아이디로 유저 조회
    Member selectMemberByMemberId(String memberId);

    // OauthServiceType과 email로 유저 조회
    Optional<Member> selectMemberByOauthServiceTypeAndEmail(OauthMember oauthMember);
}
