package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0006o4DeAttrTable is used to handle fields declared in it
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

            @Component("global_ip0006o4DeAttrTable")

@Data
public class Ip0006o4DeAttrTable extends Ip0006o4DeAttrTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip0006o4DeAttrRow> ip0006o4DeAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip0006o4DeAttrTable
	**/
    public Ip0006o4DeAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_0006O_4_DE_ATTR_ROW_SIZE;arrayIndex++) {
						getIp0006o4DeAttrRow().add(new Ip0006o4DeAttrRow(this, beginIp0006o4DeAttrRow + 
						arrayIndex * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip0006o4DeAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip0006o4DeAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_0006O_4_DE_ATTR_ROW_SIZE;index++) {
              Ip0006o4DeAttrRow  newElement = new Ip0006o4DeAttrRow(this,beginIp0006o4DeAttrRow + index * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength());
              newElement.initialize();
              getIp0006o4DeAttrRow().add(newElement);
          }
     } else {
        if (ip0006o4DeAttrRow.size() < IP_0006O_4_DE_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip0006o4DeAttrRow.size();index <  IP_0006O_4_DE_ATTR_ROW_SIZE;index++) {
              Ip0006o4DeAttrRow  newElement = new Ip0006o4DeAttrRow(this,beginIp0006o4DeAttrRow + index * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength());
              getIp0006o4DeAttrRow().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_0006O_4_DE_ATTR_ROW_SIZE;index++) {
     		Ip0006o4DeAttrRow ip0006o4DeAttrRowVar = ip0006o4DeAttrRow.get(index);
 			if (ip0006o4DeAttrRowVar == null) {
                ip0006o4DeAttrRowVar = new Ip0006o4DeAttrRow(this,beginIp0006o4DeAttrRow + index * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength());
                  getIp0006o4DeAttrRow().set(index, ip0006o4DeAttrRowVar);
			} 
			ip0006o4DeAttrRowVar.initialize();
		}
     }
   }


}
  
