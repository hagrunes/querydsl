package study.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    // 회원명, 팀명, 나이(ageGoe, ageLoe) 크거나 같거나, 작거나 같거나

    private String username;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;

}
