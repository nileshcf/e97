package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0007o4DeSubAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip0007o4DeSubAttrTable")

@Data
public class Ip0007o4DeSubAttrTable extends Ip0007o4DeSubAttrTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip0007o4DeSubAttrRow> ip0007o4DeSubAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip0007o4DeSubAttrTable
	**/
    public Ip0007o4DeSubAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_0007O_4_DE_SUB_ATTR_ROW_SIZE;arrayIndex++) {
						getIp0007o4DeSubAttrRow().add(new Ip0007o4DeSubAttrRow(this, beginIp0007o4DeSubAttrRow + 
						arrayIndex * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip0007o4DeSubAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip0007o4DeSubAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_0007O_4_DE_SUB_ATTR_ROW_SIZE;index++) {
              Ip0007o4DeSubAttrRow  newElement = new Ip0007o4DeSubAttrRow(this,beginIp0007o4DeSubAttrRow + index * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength());
              newElement.initialize();
              getIp0007o4DeSubAttrRow().add(newElement);
          }
     } else {
        if (ip0007o4DeSubAttrRow.size() < IP_0007O_4_DE_SUB_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip0007o4DeSubAttrRow.size();index <  IP_0007O_4_DE_SUB_ATTR_ROW_SIZE;index++) {
              Ip0007o4DeSubAttrRow  newElement = new Ip0007o4DeSubAttrRow(this,beginIp0007o4DeSubAttrRow + index * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength());
              getIp0007o4DeSubAttrRow().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_0007O_4_DE_SUB_ATTR_ROW_SIZE;index++) {
     		Ip0007o4DeSubAttrRow ip0007o4DeSubAttrRowVar = ip0007o4DeSubAttrRow.get(index);
 			if (ip0007o4DeSubAttrRowVar == null) {
                ip0007o4DeSubAttrRowVar = new Ip0007o4DeSubAttrRow(this,beginIp0007o4DeSubAttrRow + index * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength());
                  getIp0007o4DeSubAttrRow().set(index, ip0007o4DeSubAttrRowVar);
			} 
			ip0007o4DeSubAttrRowVar.initialize();
		}
     }
   }


}
  
