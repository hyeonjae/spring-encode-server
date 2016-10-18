package com.example.controller;

import com.example.model.Response;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

@RestController
@RequestMapping("/api/urlencode")
public class UrlEncodeController {
    @ResponseBody
    @RequestMapping(value = "encode", method = RequestMethod.POST, produces = "application/json")
    public Response encode(@RequestBody Map<String, Object> requestBody) {
        String text = (String) requestBody.getOrDefault("text", "");
        try {
            return new Response(URLEncoder.encode(text, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            return new Response();
        }
    }

    @ResponseBody
    @RequestMapping(value = "decode", method = RequestMethod.POST, produces = "application/json")
    public Response decode(@RequestBody Map<String, Object> requestBody) {
        String text = (String) requestBody.getOrDefault("text", "");
        try {
            return new Response(URLDecoder.decode(text, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            return new Response();
        }
    }
}
