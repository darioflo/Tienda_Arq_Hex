package mx.com.santander.hexagonalmodularmaven.post.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.PostDTO;
import mx.com.santander.hexagonalmodularmaven.post.query.PostAllHandler;

@RestController
@RequestMapping("/post")
@AllArgsConstructor
public class PostQueryController {

     private final PostAllHandler postAllHandler;

    @GetMapping
    public ResponseEntity<List<PostDTO>> obtenerTodosLosPosts() {
        List<PostDTO> posts = postAllHandler.handler();
        return ResponseEntity.ok(posts);
    }
    
}
