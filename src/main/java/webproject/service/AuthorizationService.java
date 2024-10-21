package webproject.service;

import webproject.exception.UnauthorizedException;

import java.util.HashMap;
import java.util.Map;

import static webproject.repository.main.mainUrl.MAIN_URL;
import static webproject.repository.main.mainUrl.UNAUTHORIZED_EXCEPTION;

public class AuthorizationService implements Service<String> {
    private static AuthorizationService authorizationService;
    private Map<String, String> dataAuthorization = new HashMap<>();
    private String login;
    private String password;

    private AuthorizationService() {
    }

    public static AuthorizationService getAuthorizationService() {
        if (authorizationService == null) {
            return authorizationService = new AuthorizationService();
        }
        return authorizationService;
    }

    @Override
    public String launch(String... params) {
        this.login = params[0];
        this.password = params[1];

        if (dataAuthorization.containsKey(login)) {
            if (dataAuthorization.get(login).equals(password)) {
                return MAIN_URL.getUrl();
            } else {
                return UNAUTHORIZED_EXCEPTION.getUrl();
            }
        }
        dataAuthorization.put(login, password);
        return MAIN_URL.getUrl();
    }
}
