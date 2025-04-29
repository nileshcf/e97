package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsMap is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip65504PdsMap extends Ip65504PdsMapSerialized { 
   
			@Getter @Setter private List<Ip65504PdsMapEntry> ip65504PdsMapEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip65504PdsMap
	**/
    public Ip65504PdsMap() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip65504PdsMap. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsMap(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip65504PdsMap
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip65504PdsMapEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_65504_PDS_MAP_ENTRY_SIZE;index++) {
              Ip65504PdsMapEntry  newElement = new Ip65504PdsMapEntry(this,beginIp65504PdsMapEntry + index * Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength());
              newElement.initialize();
              getIp65504PdsMapEntry().add(newElement);
          }
     } else {
        if (ip65504PdsMapEntry.size() < IP_65504_PDS_MAP_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip65504PdsMapEntry.size();index <  IP_65504_PDS_MAP_ENTRY_SIZE;index++) {
              Ip65504PdsMapEntry  newElement = new Ip65504PdsMapEntry(this,beginIp65504PdsMapEntry + index * Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength());
              getIp65504PdsMapEntry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_65504_PDS_MAP_ENTRY_SIZE;index++) {
     		Ip65504PdsMapEntry ip65504PdsMapEntryVar = ip65504PdsMapEntry.get(index);
 			if (ip65504PdsMapEntryVar == null) {
                ip65504PdsMapEntryVar = new Ip65504PdsMapEntry(this,beginIp65504PdsMapEntry + index * Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength());
                  getIp65504PdsMapEntry().set(index, ip65504PdsMapEntryVar);
			} 
			ip65504PdsMapEntryVar.initialize();
		}
     }
   }


}
  
