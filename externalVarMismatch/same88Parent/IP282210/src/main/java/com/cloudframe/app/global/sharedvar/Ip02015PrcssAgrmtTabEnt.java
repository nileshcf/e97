package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015PrcssAgrmtTabEnt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip02015PrcssAgrmtTabEnt extends Ip02015PrcssAgrmtTabEntSerialized { 
   
			@Getter @Setter private List<Ip02015PrcssAgrmtEntry> ip02015PrcssAgrmtEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip02015PrcssAgrmtTabEnt
	**/
    public Ip02015PrcssAgrmtTabEnt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02015PrcssAgrmtTabEnt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015PrcssAgrmtTabEnt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02015PrcssAgrmtTabEnt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip02015PrcssAgrmtEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_02015_PRCSS_AGRMT_ENTRY_SIZE;index++) {
              Ip02015PrcssAgrmtEntry  newElement = new Ip02015PrcssAgrmtEntry(this,beginIp02015PrcssAgrmtEntry + index * Ip02015PrcssAgrmtEntry.getIp02015PrcssAgrmtEntryFieldLength());
              newElement.initialize();
              getIp02015PrcssAgrmtEntry().add(newElement);
          }
     } else {
        if (ip02015PrcssAgrmtEntry.size() < IP_02015_PRCSS_AGRMT_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip02015PrcssAgrmtEntry.size();index <  IP_02015_PRCSS_AGRMT_ENTRY_SIZE;index++) {
              Ip02015PrcssAgrmtEntry  newElement = new Ip02015PrcssAgrmtEntry(this,beginIp02015PrcssAgrmtEntry + index * Ip02015PrcssAgrmtEntry.getIp02015PrcssAgrmtEntryFieldLength());
              getIp02015PrcssAgrmtEntry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02015_PRCSS_AGRMT_ENTRY_SIZE;index++) {
     		Ip02015PrcssAgrmtEntry ip02015PrcssAgrmtEntryVar = ip02015PrcssAgrmtEntry.get(index);
 			if (ip02015PrcssAgrmtEntryVar == null) {
                ip02015PrcssAgrmtEntryVar = new Ip02015PrcssAgrmtEntry(this,beginIp02015PrcssAgrmtEntry + index * Ip02015PrcssAgrmtEntry.getIp02015PrcssAgrmtEntryFieldLength());
                  getIp02015PrcssAgrmtEntry().set(index, ip02015PrcssAgrmtEntryVar);
			} 
			ip02015PrcssAgrmtEntryVar.initialize();
		}
     }
   }


}
  
