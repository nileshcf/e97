package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip60001EventLogWorkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip60001EventLogWorkArea")

@Data
public class Ip60001EventLogWorkArea extends Ip60001EventLogWorkAreaSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip60001EventLogControl = Field.fillLowValue(1);

								@Getter @Setter private long ip60001Subscript;
			@Getter @Setter private List<Ip60001EventEntry> ip60001EventEntry = new ArrayList<>();
    	

						@Getter @Setter private char[] ip60001HoldPgmName = Field.fillLowValue(8);

						@Getter @Setter private char[] ip60001EventErrorCode = Field.fillLowValue(4);

						@Getter @Setter private char[] ip60001EventErrorMsg = Field.fillLowValue(50);
	
	/**
	* Constructor for Ip60001EventLogWorkArea
	**/
    public Ip60001EventLogWorkArea() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_60001_EVENT_ENTRY_SIZE;arrayIndex++) {
						getIp60001EventEntry().add(new Ip60001EventEntry(this, beginIp60001EventEntry + 
						arrayIndex * Ip60001EventEntry.getIp60001EventEntryFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip60001EventLogWorkArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp60001EventLogControl(CONSTANTS.SPACE);
                     setIp60001Subscript(0);
     if (ip60001EventEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_60001_EVENT_ENTRY_SIZE;index++) {
              Ip60001EventEntry  newElement = new Ip60001EventEntry(this,beginIp60001EventEntry + index * Ip60001EventEntry.getIp60001EventEntryFieldLength());
              newElement.initialize();
              getIp60001EventEntry().add(newElement);
          }
     } else {
        if (ip60001EventEntry.size() < IP_60001_EVENT_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip60001EventEntry.size();index <  IP_60001_EVENT_ENTRY_SIZE;index++) {
              Ip60001EventEntry  newElement = new Ip60001EventEntry(this,beginIp60001EventEntry + index * Ip60001EventEntry.getIp60001EventEntryFieldLength());
              getIp60001EventEntry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_60001_EVENT_ENTRY_SIZE;index++) {
     		Ip60001EventEntry ip60001EventEntryVar = ip60001EventEntry.get(index);
 			if (ip60001EventEntryVar == null) {
                ip60001EventEntryVar = new Ip60001EventEntry(this,beginIp60001EventEntry + index * Ip60001EventEntry.getIp60001EventEntryFieldLength());
                  getIp60001EventEntry().set(index, ip60001EventEntryVar);
			} 
			ip60001EventEntryVar.initialize();
		}
     }
         setIp60001HoldPgmName(CONSTANTS.SPACE_8);
         setIp60001EventErrorCode(CONSTANTS.SPACE_4);
         setIp60001EventErrorMsg(CONSTANTS.SPACE_50);
   }


}
  
