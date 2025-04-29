package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000904PdsSubAttrTable is used to handle fields declared in it
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

            @Component("global_ip000904PdsSubAttrTable")

@Data
public class Ip000904PdsSubAttrTable extends Ip000904PdsSubAttrTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip000904PdsSubAttrRow> ip000904PdsSubAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip000904PdsSubAttrTable
	**/
    public Ip000904PdsSubAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_000904_PDS_SUB_ATTR_ROW_SIZE;arrayIndex++) {
						getIp000904PdsSubAttrRow().add(new Ip000904PdsSubAttrRow(this, beginIp000904PdsSubAttrRow + 
						arrayIndex * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip000904PdsSubAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip000904PdsSubAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_000904_PDS_SUB_ATTR_ROW_SIZE;index++) {
              Ip000904PdsSubAttrRow  newElement = new Ip000904PdsSubAttrRow(this,beginIp000904PdsSubAttrRow + index * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength());
              newElement.initialize();
              getIp000904PdsSubAttrRow().add(newElement);
          }
     } else {
        if (ip000904PdsSubAttrRow.size() < IP_000904_PDS_SUB_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip000904PdsSubAttrRow.size();index <  IP_000904_PDS_SUB_ATTR_ROW_SIZE;index++) {
              Ip000904PdsSubAttrRow  newElement = new Ip000904PdsSubAttrRow(this,beginIp000904PdsSubAttrRow + index * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength());
              getIp000904PdsSubAttrRow().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_000904_PDS_SUB_ATTR_ROW_SIZE;index++) {
     		Ip000904PdsSubAttrRow ip000904PdsSubAttrRowVar = ip000904PdsSubAttrRow.get(index);
 			if (ip000904PdsSubAttrRowVar == null) {
                ip000904PdsSubAttrRowVar = new Ip000904PdsSubAttrRow(this,beginIp000904PdsSubAttrRow + index * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength());
                  getIp000904PdsSubAttrRow().set(index, ip000904PdsSubAttrRowVar);
			} 
			ip000904PdsSubAttrRowVar.initialize();
		}
     }
   }


}
  
