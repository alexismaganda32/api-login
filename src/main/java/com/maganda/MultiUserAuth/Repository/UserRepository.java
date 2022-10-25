package com.maganda.MultiUserAuth.Repository;

import com.maganda.MultiUserAuth.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
