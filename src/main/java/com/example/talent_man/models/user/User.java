package com.example.talent_man.models.user;

import com.example.talent_man.models.Assessment;
import com.example.talent_man.models.UserQuestionAnswer;
import com.example.talent_man.utils.Constants;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "users")
public abstract class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", columnDefinition = "INTEGER")
    private int userId;
    @Column(name = "role_id", columnDefinition = "INTEGER")
    private int roleId;
    @Column(name = "user_type", columnDefinition = "VARCHAR(255)")
    private String userType;
    @Column(name = "user_full_name", columnDefinition = "VARCHAR(255)")
    private String userFullName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    Set<Assessment> assessments;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    Set<UserQuestionAnswer> userQuestionAnswers;


    public User(String name, int roleId){
        this.roleId = roleId;
        this.userFullName = name;
        if (roleId == 1){
            this.userType = Constants.MANAGER;
        }else{
            this.userType = Constants.EMPLOYEE;
        }
    }
}
