package com.mentoring.mentor.member.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long? = null

    // spring cloud
}