package com.example.springbootjpa.util;

import antlr.ASdebug.ASDebugStream;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.UUID;

@Slf4j
public class UUIDTest {
    @Test
    public void test_UUID(){
        UUID uuid=UUID.randomUUID();
        log.debug("{}",uuid);
    }

}
