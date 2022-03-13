package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 30)
    private String fullName;

    @NotEmpty
    private int age;

    @NotEmpty
    @Size(min = 6, max = 15)
    private String numberPhone;

    @Size(max = 20)
    @Column(unique = true, nullable = false)
    @Email
    private String email;

    @Size(min = 3, max = 20)
    @Column(unique = true, nullable = false)
    private String username;

    @Size(min = 3)
    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @Size(min = 3)
    @Column(nullable = false)
    @JsonIgnore
    private String confirmPassword;

    @ManyToOne
    StatusUser statusUser;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;

    private boolean enabled = true;
}