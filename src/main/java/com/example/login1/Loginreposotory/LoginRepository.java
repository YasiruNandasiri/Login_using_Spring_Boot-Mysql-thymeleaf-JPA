package com.example.login1.Loginreposotory;

import com.example.login1.Logindomain.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByUsernameAndPassword(String username, String password);

}