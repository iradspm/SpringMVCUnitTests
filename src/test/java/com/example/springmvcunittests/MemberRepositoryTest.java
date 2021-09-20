package com.example.springmvcunittests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.*;

//testing data jpa crud operations
@DataJpaTest
//autoconfigure database
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//rollback database-reverting back to the original database. Here we need to update th database, rollback=false
@Rollback(value = false)
public class MemberRepositoryTest {

    //CRUD
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    EntityManager entityManager;
    @Test
    public void createMemberTest()
    {
        try
        {
            Members m=new Members();
            m.setMember_email("peter@gmail.com");
            m.setMember_name("peter");
            Members mem=memberRepository.save(m);
            Members exist=entityManager.find(Members.class,mem.getMember_id());
            assertThat(exist.getMember_email()).isEqualTo(m.getMember_email());
        }catch (Exception e)
        {
            e.printStackTrace();
        }



    }

}
