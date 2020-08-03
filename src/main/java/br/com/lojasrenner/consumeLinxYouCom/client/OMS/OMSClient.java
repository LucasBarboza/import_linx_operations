package br.com.lojasrenner.consumeLinxYouCom.client.OMS;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.lojasrenner.consumeLinxYouCom.client.OMS.response.OrderResponse;

@FeignClient(name = "oms-ordes", url = "${app.clients.oms.url}",
path = "/dumps.omniplat.io/v1"
//configuration = ,
//fallbackFactory = )
)public interface OMSClient {

	 @GetMapping(value = "/orders", consumes = MediaType.APPLICATION_JSON_VALUE)
	    OrderResponse getOrders(@RequestParam String initialDate, @RequestParam String finalDate,
	    						@RequestParam String client,@RequestParam Integer page,@RequestParam Integer PageSize);
	 
}
