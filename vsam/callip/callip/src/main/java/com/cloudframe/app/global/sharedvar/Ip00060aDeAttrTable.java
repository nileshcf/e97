package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00060aDeAttrTable is used to handle fields declared in it
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

            @Component("global_ip00060aDeAttrTable")

@Data
public class Ip00060aDeAttrTable extends Ip00060aDeAttrTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip00060aDeAttrRow> ip00060aDeAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00060aDeAttrTable
	**/
    public Ip00060aDeAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00060A_DE_ATTR_ROW_SIZE;arrayIndex++) {
						getIp00060aDeAttrRow().add(new Ip00060aDeAttrRow(this, beginIp00060aDeAttrRow + 
						arrayIndex * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00060aDeAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip00060aDeAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00060A_DE_ATTR_ROW_SIZE;index++) {
              Ip00060aDeAttrRow  newElement = new Ip00060aDeAttrRow(this,beginIp00060aDeAttrRow + index * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength());
              newElement.initialize();
              getIp00060aDeAttrRow().add(newElement);
          }
     } else {
        if (ip00060aDeAttrRow.size() < IP_00060A_DE_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip00060aDeAttrRow.size();index <  IP_00060A_DE_ATTR_ROW_SIZE;index++) {
              Ip00060aDeAttrRow  newElement = new Ip00060aDeAttrRow(this,beginIp00060aDeAttrRow + index * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength());
              getIp00060aDeAttrRow().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00060A_DE_ATTR_ROW_SIZE;index++) {
     		Ip00060aDeAttrRow ip00060aDeAttrRowVar = ip00060aDeAttrRow.get(index);
 			if (ip00060aDeAttrRowVar == null) {
                ip00060aDeAttrRowVar = new Ip00060aDeAttrRow(this,beginIp00060aDeAttrRow + index * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength());
                  getIp00060aDeAttrRow().set(index, ip00060aDeAttrRowVar);
			} 
			ip00060aDeAttrRowVar.initialize();
		}
     }
   }


}
  
