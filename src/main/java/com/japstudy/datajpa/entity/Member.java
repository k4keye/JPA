package com.japstudy.datajpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//엔티티는 기본 생성자가 있어야한다
//또한 private 는 사용하면 안된다. 프록시 기술을 사용할때 문제가 생김
@ToString(of = {"id","username","age"}) //객체를 만들때 출력한다.
public class Member {
    @Id
    @GeneratedValue
    @Column(name="member_id")
    private  Long id;
    private String username;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY) //다대일관계
    @JoinColumn(name="team_id")
    private Team team;

    public Member(String username, int age, Team team) {
        this.username = username;
        this.age = age;
        if(team !=null)
        {
            changeTeam(team);
        }
    }

    public Member(String username) {
        this.username = username;
    }

    public void changeTeam(Team team)
    { //팀변경
        this.team = team;
        team.getMembers().add(this);
    }
}
