package me.dio.desafio.deal.service;

import me.dio.desafio.deal.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
