package com.aidar.service;

import com.aidar.model.User;

public interface SecurityService {

    User getPrincipal();

    User getPersistedPrincipal();

}
