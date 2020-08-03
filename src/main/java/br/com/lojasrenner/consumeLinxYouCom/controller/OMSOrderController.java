package br.com.lojasrenner.consumeLinxYouCom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import br.com.lojasrenner.consumeLinxYouCom.request.OrderRequest;
import br.com.lojasrenner.consumeLinxYouCom.service.OrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class OMSOrderController{

		private final OrderService orderService;
		
		
		@Autowired
		public OMSOrderController(OrderService orderService) {
			this.orderService = orderService;
		}
		
			
		public void getOrders() {
			OrderRequest orderRequest = new OrderRequest();
			orderRequest.setClient("youcom");
			orderRequest.setInitialDate("2020-07-03T00:00:00.000Z");
			orderRequest.setFinalDate("2020-08-03T23:59:59.000Z");
			orderRequest.setPage(1);
			orderRequest.setPageSize(40);
			orderService.ordersByIntervalData(orderRequest);
			
		}
               		
		
}


