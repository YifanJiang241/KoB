package com.kob.botrunningsystem.service.impl;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.kob.botrunningsystem.service.impl.utils.BotPool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class BotRunningServiceImplTest {

    @Mock
    private BotPool mockBotPool;

    private BotRunningServiceImpl botRunningService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        botRunningService = new BotRunningServiceImpl();
        BotRunningServiceImpl.botPool = mockBotPool; // 用模拟的BotPool替换实际的BotPool
    }

    @Test
    void testAddBot() {
        Integer userId = 1;
        String botCode = "code";
        String input = "input";

        // 调用 addBot 方法
        String result = botRunningService.addBot(userId, botCode, input);

        // 验证是否向BotPool正确添加了Bot
        verify(mockBotPool).addBot(userId, botCode, input);
        // 验证返回值是否正确
        assertEquals("add bot success", result);
    }
}
