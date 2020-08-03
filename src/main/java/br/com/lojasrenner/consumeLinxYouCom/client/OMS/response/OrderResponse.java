package br.com.lojasrenner.consumeLinxYouCom.client.OMS.response;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class OrderResponse implements Serializable{

	 @Getter
	    List<String> orders;

	    public OrderResponse() {
	        orders = new LinkedList<>();
	    }

	    @JsonSetter("data")
	    private void loadContent(Map<String, Object> data) {
	        @SuppressWarnings("unchecked")
	        List<Map<String, Object>> content = (List<Map<String, Object>>) data.get("content");
	        orders.add(content.toString());	        
	    }
		
}
