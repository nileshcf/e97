package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321EditListRec is used to handle fields declared in it
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

            @Component("global_ip00321EditListRec")

@Data
public class Ip00321EditListRec extends Ip00321EditListRecSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip00321EditListEntry> ip00321EditListEntry = new ArrayList<>();
    	

								@Getter @Setter private long ip00321EditNbr;
				@Getter @Setter private Ip00321CurrEditInfo ip00321CurrEditInfo = new Ip00321CurrEditInfo();
	
	/**
	* Constructor for Ip00321EditListRec
	**/
    public Ip00321EditListRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00321_EDIT_LIST_ENTRY_SIZE;arrayIndex++) {
						getIp00321EditListEntry().add(new Ip00321EditListEntry(this, beginIp00321EditListEntry + 
						arrayIndex * Ip00321EditListEntry.getIp00321EditListEntryFieldLength()));
				}
					getIp00321CurrEditInfo().setParent(this,getStartOffset() + 176004);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00321EditListRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip00321EditListEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00321_EDIT_LIST_ENTRY_SIZE;index++) {
              Ip00321EditListEntry  newElement = new Ip00321EditListEntry(this,beginIp00321EditListEntry + index * Ip00321EditListEntry.getIp00321EditListEntryFieldLength());
              newElement.initialize();
              getIp00321EditListEntry().add(newElement);
          }
     } else {
        if (ip00321EditListEntry.size() < IP_00321_EDIT_LIST_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip00321EditListEntry.size();index <  IP_00321_EDIT_LIST_ENTRY_SIZE;index++) {
              Ip00321EditListEntry  newElement = new Ip00321EditListEntry(this,beginIp00321EditListEntry + index * Ip00321EditListEntry.getIp00321EditListEntryFieldLength());
              getIp00321EditListEntry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00321_EDIT_LIST_ENTRY_SIZE;index++) {
     		Ip00321EditListEntry ip00321EditListEntryVar = ip00321EditListEntry.get(index);
 			if (ip00321EditListEntryVar == null) {
                ip00321EditListEntryVar = new Ip00321EditListEntry(this,beginIp00321EditListEntry + index * Ip00321EditListEntry.getIp00321EditListEntryFieldLength());
                  getIp00321EditListEntry().set(index, ip00321EditListEntryVar);
			} 
			ip00321EditListEntryVar.initialize();
		}
     }
                     setIp00321EditNbr(0);
          getIp00321CurrEditInfo().initialize();
     
   }


}
  
