package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip02014wTable")

@Data
public class Ip02014wTable extends Ip02014wTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip02014wPrcsAgrmtTable> ip02014wPrcsAgrmtTable = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip02014wTable
	**/
    public Ip02014wTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_02014W_PRCS_AGRMT_TABLE_SIZE;arrayIndex++) {
						getIp02014wPrcsAgrmtTable().add(new Ip02014wPrcsAgrmtTable(this, beginIp02014wPrcsAgrmtTable + 
						arrayIndex * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip02014wTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip02014wPrcsAgrmtTable.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_02014W_PRCS_AGRMT_TABLE_SIZE;index++) {
              Ip02014wPrcsAgrmtTable  newElement = new Ip02014wPrcsAgrmtTable(this,beginIp02014wPrcsAgrmtTable + index * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength());
              newElement.initialize();
              getIp02014wPrcsAgrmtTable().add(newElement);
          }
     } else {
        if (ip02014wPrcsAgrmtTable.size() < IP_02014W_PRCS_AGRMT_TABLE_SIZE) {
          // prefill it first
          for (int index = ip02014wPrcsAgrmtTable.size();index <  IP_02014W_PRCS_AGRMT_TABLE_SIZE;index++) {
              Ip02014wPrcsAgrmtTable  newElement = new Ip02014wPrcsAgrmtTable(this,beginIp02014wPrcsAgrmtTable + index * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength());
              getIp02014wPrcsAgrmtTable().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02014W_PRCS_AGRMT_TABLE_SIZE;index++) {
     		Ip02014wPrcsAgrmtTable ip02014wPrcsAgrmtTableVar = ip02014wPrcsAgrmtTable.get(index);
 			if (ip02014wPrcsAgrmtTableVar == null) {
                ip02014wPrcsAgrmtTableVar = new Ip02014wPrcsAgrmtTable(this,beginIp02014wPrcsAgrmtTable + index * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength());
                  getIp02014wPrcsAgrmtTable().set(index, ip02014wPrcsAgrmtTableVar);
			} 
			ip02014wPrcsAgrmtTableVar.initialize();
		}
     }
   }


}
  
