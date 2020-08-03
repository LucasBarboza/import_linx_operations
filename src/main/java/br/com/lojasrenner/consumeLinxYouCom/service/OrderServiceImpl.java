package br.com.lojasrenner.consumeLinxYouCom.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.lojasrenner.consumeLinxYouCom.client.OMS.OMSClient;
import br.com.lojasrenner.consumeLinxYouCom.client.OMS.response.OrderResponse;
import br.com.lojasrenner.consumeLinxYouCom.request.OrderRequest;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class OrderServiceImpl implements OrderService{

	private final OMSClient omsClient;
	
	@Autowired
	public OrderServiceImpl(OMSClient omsClient) {
		this.omsClient =omsClient; 
	}
	
	@Override
	public List<String> ordersByIntervalData(OrderRequest orderRequest) {
		
		OrderResponse orderResponse =  omsClient.getOrders(orderRequest.getInitialDate(),orderRequest.getFinalDate(),orderRequest.getClient(),orderRequest.getPage(),orderRequest.getPageSize());
		return orderResponse.getOrders();
	}
	
}
