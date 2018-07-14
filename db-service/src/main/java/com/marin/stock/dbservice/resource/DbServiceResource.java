package com.marin.stock.dbservice.resource;

import com.marin.stock.dbservice.model.Quotes;
import com.marin.stock.dbservice.repository.QuotesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {

    private QuotesRepository quotesRepository;

    @GetMapping("/{username}")
    public List<String> getQuotes(@PathVariable("username") final String username) {

        return quotesRepository.findByUserName(username).stream().map(quote -> {
            return quote.getQuote();
        }).collect(Collectors.toList());

    }

    @PostMapping("/add")
    public List<String> add(@RequestBody final Quotes quotes) {
        return  null;
    }

}
