package br.com.lojasrenner.consumeLinxYouCom.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import br.com.lojasrenner.consumeLinxYouCom.request.OrderRequest;

@Validated
public interface OrderService {

	List<String> ordersByIntervalData(OrderRequest orderRequest);
	
}
