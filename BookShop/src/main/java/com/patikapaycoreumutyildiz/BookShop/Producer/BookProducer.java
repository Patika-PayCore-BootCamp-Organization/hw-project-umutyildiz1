package com.patikapaycoreumutyildiz.BookShop.Producer;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.BookService;
import com.patikapaycoreumutyildiz.BookShop.Configuration.RabbitMQConfig;
import com.patikapaycoreumutyildiz.BookShop.Entities.Book;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/messaging/publish/")
public class BookProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private BookService bookService;

    @PostMapping("average")
    public String publishBookPrices(){
        List<Integer> allBookPrices = bookService.getAllBooks().stream().map(book -> book.getPrice()).collect(Collectors.toList());
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, allBookPrices);
        return "Success";
    }

}
