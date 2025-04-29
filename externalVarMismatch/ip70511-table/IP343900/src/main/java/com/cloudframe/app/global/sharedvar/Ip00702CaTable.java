package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00702CaTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip00702CaTable")

@Data
public class Ip00702CaTable extends Ip00702CaTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip00702CaEntry> ip00702CaEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00702CaTable
	**/
    public Ip00702CaTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00702_CA_ENTRY_SIZE;arrayIndex++) {
						getIp00702CaEntry().add(new Ip00702CaEntry(this, beginIp00702CaEntry + 
						arrayIndex * Ip00702CaEntry.getIp00702CaEntryFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00702CaTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip00702CaEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00702_CA_ENTRY_SIZE;index++) {
              Ip00702CaEntry  newElement = new Ip00702CaEntry(this,beginIp00702CaEntry + index * Ip00702CaEntry.getIp00702CaEntryFieldLength());
              newElement.initialize();
              getIp00702CaEntry().add(newElement);
          }
     } else {
        if (ip00702CaEntry.size() < IP_00702_CA_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip00702CaEntry.size();index <  IP_00702_CA_ENTRY_SIZE;index++) {
              Ip00702CaEntry  newElement = new Ip00702CaEntry(this,beginIp00702CaEntry + index * Ip00702CaEntry.getIp00702CaEntryFieldLength());
              getIp00702CaEntry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00702_CA_ENTRY_SIZE;index++) {
     		Ip00702CaEntry ip00702CaEntryVar = ip00702CaEntry.get(index);
 			if (ip00702CaEntryVar == null) {
                ip00702CaEntryVar = new Ip00702CaEntry(this,beginIp00702CaEntry + index * Ip00702CaEntry.getIp00702CaEntryFieldLength());
                  getIp00702CaEntry().set(index, ip00702CaEntryVar);
			} 
			ip00702CaEntryVar.initialize();
		}
     }
   }


}
  
