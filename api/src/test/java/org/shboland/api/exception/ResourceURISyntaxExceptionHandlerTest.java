package org.shboland.api.exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ResourceURISyntaxExceptionHandlerTest {

    @Mock
    private WebRequest webRequest;

    private ResourceURISyntaxExceptionHandler exceptionHandler = new ResourceURISyntaxExceptionHandler();

    @Test
    public void testException() {

        ResponseEntity<Object> objectResponseEntity = exceptionHandler.handleConflict(new Exception(), webRequest);

        assertEquals("Wrong code", HttpStatus.CONFLICT.value(), objectResponseEntity.getStatusCode().value());

    }
}
