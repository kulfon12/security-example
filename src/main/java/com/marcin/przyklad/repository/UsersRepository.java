package com.marcin.przyklad.repository;

import com.marcin.przyklad.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Marcin on 2017-08-17.
 */
public interface UsersRepository extends JpaRepository<Users , Integer> {
}
