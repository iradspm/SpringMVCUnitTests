package com.example.springmvcunittests;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Members,Integer> {
    @Query("SELECT m FROM Members m WHERE m.member_id=?1")
    <Optional> Members findByEmail(String email);
}
