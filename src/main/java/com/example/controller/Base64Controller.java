package com.example.controller;

import com.example.model.Response;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

@RestController
@RequestMapping("/api/base64")
public class Base64Controller {
    @ResponseBody
    @RequestMapping(value = "encode", method = RequestMethod.POST, produces = "application/json")
    public Response encode(@RequestBody Map<String, Object> requestBody) {
        String text = (String) requestBody.getOrDefault("text", "");
        try {
            return new Response(Base64.getEncoder().encode(text.getBytes(StandardCharsets.UTF_8)));
        } catch (IllegalArgumentException e) {
            return new Response();
        }
    }

    @ResponseBody
    @RequestMapping(value = "decode", method = RequestMethod.POST, produces = "application/json")
    public Response decode(@RequestBody Map<String, Object> requestBody) {
        String text = (String) requestBody.getOrDefault("text", "");
        try {
            return new Response(Base64.getDecoder().decode(text.getBytes(StandardCharsets.UTF_8)));
        } catch (IllegalArgumentException e) {
            return new Response();
        }
    }
}
