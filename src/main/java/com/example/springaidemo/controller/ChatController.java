package com.example.springaidemo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
@Tag(name = "Chat", description = "Azure OpenAI 채팅 API")
public class ChatController {

    private final ChatModel chatModel;

    @GetMapping
    @Operation(summary = "채팅 메시지 전송", description = "Azure OpenAI에 메시지를 보내고 응답을 받습니다")
    public String chat(
            @Parameter(description = "전송할 메시지", example = "안녕하세요!")
            @RequestParam(value = "message", defaultValue = "안녕하세요!") String message) {
        return chatModel.call(message);
    }
}

