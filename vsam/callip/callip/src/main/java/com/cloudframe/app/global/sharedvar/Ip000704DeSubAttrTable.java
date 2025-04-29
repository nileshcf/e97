package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000704DeSubAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip000704DeSubAttrTable")

@Data
public class Ip000704DeSubAttrTable extends Ip000704DeSubAttrTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip000704DeSubAttrRow> ip000704DeSubAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip000704DeSubAttrTable
	**/
    public Ip000704DeSubAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_000704_DE_SUB_ATTR_ROW_SIZE;arrayIndex++) {
						getIp000704DeSubAttrRow().add(new Ip000704DeSubAttrRow(this, beginIp000704DeSubAttrRow + 
						arrayIndex * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip000704DeSubAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip000704DeSubAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_000704_DE_SUB_ATTR_ROW_SIZE;index++) {
              Ip000704DeSubAttrRow  newElement = new Ip000704DeSubAttrRow(this,beginIp000704DeSubAttrRow + index * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength());
              newElement.initialize();
              getIp000704DeSubAttrRow().add(newElement);
          }
     } else {
        if (ip000704DeSubAttrRow.size() < IP_000704_DE_SUB_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip000704DeSubAttrRow.size();index <  IP_000704_DE_SUB_ATTR_ROW_SIZE;index++) {
              Ip000704DeSubAttrRow  newElement = new Ip000704DeSubAttrRow(this,beginIp000704DeSubAttrRow + index * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength());
              getIp000704DeSubAttrRow().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_000704_DE_SUB_ATTR_ROW_SIZE;index++) {
     		Ip000704DeSubAttrRow ip000704DeSubAttrRowVar = ip000704DeSubAttrRow.get(index);
 			if (ip000704DeSubAttrRowVar == null) {
                ip000704DeSubAttrRowVar = new Ip000704DeSubAttrRow(this,beginIp000704DeSubAttrRow + index * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength());
                  getIp000704DeSubAttrRow().set(index, ip000704DeSubAttrRowVar);
			} 
			ip000704DeSubAttrRowVar.initialize();
		}
     }
   }


}
  
