package com.net.common.shiro.realm;

import org.springframework.stereotype.Component;

import com.net.common.constants.AuthcTypeEnum;

/**
 * Github OAuth2 Realm
 */
@Component
public class OAuth2GithubRealm extends OAuth2Realm {

    @Override
    public AuthcTypeEnum getAuthcTypeEnum() {
        return AuthcTypeEnum.GITHUB;
    }
}