package com.surya.authservice.util;

import com.surya.authservice.model.UserInfoDto;

public class ValidationUtil {
    public static void validateUserAttributes(UserInfoDto userInfoDto) {
        if (userInfoDto.getUsername() == null || userInfoDto.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (userInfoDto.getPassword() == null || userInfoDto.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }

        String password = userInfoDto.getPassword();
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must contain at least one uppercase letter");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("Password must contain at least one lowercase letter");
        }
        if (!password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must contain at least one digit");
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            throw new IllegalArgumentException("Password must contain at least one special character (!@#$%^&*())");
        }
    }
}
