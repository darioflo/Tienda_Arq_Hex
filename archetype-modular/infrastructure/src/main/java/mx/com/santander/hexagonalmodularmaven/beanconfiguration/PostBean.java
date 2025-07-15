package mx.com.santander.hexagonalmodularmaven.beanconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.santander.hexagonalmodularmaven.post.port.dao.PostDAO;
import mx.com.santander.hexagonalmodularmaven.post.service.PostFindAllService;

@Configuration
public class PostBean {
    
    @Bean
    public PostFindAllService postFindAllService(PostDAO postDao){
        return new PostFindAllService(postDao);
    }
    
}
