package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000604DeAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip000604DeAttrTable")

@Data
public class Ip000604DeAttrTable extends Ip000604DeAttrTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip000604DeAttrRow> ip000604DeAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip000604DeAttrTable
	**/
    public Ip000604DeAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_000604_DE_ATTR_ROW_SIZE;arrayIndex++) {
						getIp000604DeAttrRow().add(new Ip000604DeAttrRow(this, beginIp000604DeAttrRow + 
						arrayIndex * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip000604DeAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip000604DeAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_000604_DE_ATTR_ROW_SIZE;index++) {
              Ip000604DeAttrRow  newElement = new Ip000604DeAttrRow(this,beginIp000604DeAttrRow + index * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength());
              newElement.initialize();
              getIp000604DeAttrRow().add(newElement);
          }
     } else {
        if (ip000604DeAttrRow.size() < IP_000604_DE_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip000604DeAttrRow.size();index <  IP_000604_DE_ATTR_ROW_SIZE;index++) {
              Ip000604DeAttrRow  newElement = new Ip000604DeAttrRow(this,beginIp000604DeAttrRow + index * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength());
              getIp000604DeAttrRow().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_000604_DE_ATTR_ROW_SIZE;index++) {
     		Ip000604DeAttrRow ip000604DeAttrRowVar = ip000604DeAttrRow.get(index);
 			if (ip000604DeAttrRowVar == null) {
                ip000604DeAttrRowVar = new Ip000604DeAttrRow(this,beginIp000604DeAttrRow + index * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength());
                  getIp000604DeAttrRow().set(index, ip000604DeAttrRowVar);
			} 
			ip000604DeAttrRowVar.initialize();
		}
     }
   }


}
  
