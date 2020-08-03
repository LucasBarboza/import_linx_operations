package br.com.lojasrenner.consumeLinxYouCom.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class OrderRequest {
	
	String initialDate;

    String finalDate;
    
    String client;
    
    Integer page;
    
    Integer pageSize;
    
}
