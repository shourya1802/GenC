package com.genc.genc.practice_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserService {
    public String getUserName(int userId) {
        return "Real User";
    }
}

class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    public String fetchUserName(int id) {
        return service.getUserName(id);
    }
}

public class MockServiceTest {

    @Test
    void testServiceMock() {
        UserService mockService = mock(UserService.class);
        when(mockService.getUserName(1)).thenReturn("Mocked User");

        UserController controller = new UserController(mockService);
        assertEquals("Mocked User", controller.fetchUserName(1));
    }
}