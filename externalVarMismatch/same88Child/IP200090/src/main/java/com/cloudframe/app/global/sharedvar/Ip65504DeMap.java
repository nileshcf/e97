package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeMap is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip65504DeMap extends Ip65504DeMapSerialized { 
   
			@Getter @Setter private List<Ip65504DeMapEntry> ip65504DeMapEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip65504DeMap
	**/
    public Ip65504DeMap() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip65504DeMap. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeMap(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip65504DeMap
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip65504DeMapEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_65504_DE_MAP_ENTRY_SIZE;index++) {
              Ip65504DeMapEntry  newElement = new Ip65504DeMapEntry(this,beginIp65504DeMapEntry + index * Ip65504DeMapEntry.getIp65504DeMapEntryFieldLength());
              newElement.initialize();
              getIp65504DeMapEntry().add(newElement);
          }
     } else {
        if (ip65504DeMapEntry.size() < IP_65504_DE_MAP_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip65504DeMapEntry.size();index <  IP_65504_DE_MAP_ENTRY_SIZE;index++) {
              Ip65504DeMapEntry  newElement = new Ip65504DeMapEntry(this,beginIp65504DeMapEntry + index * Ip65504DeMapEntry.getIp65504DeMapEntryFieldLength());
              getIp65504DeMapEntry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_65504_DE_MAP_ENTRY_SIZE;index++) {
     		Ip65504DeMapEntry ip65504DeMapEntryVar = ip65504DeMapEntry.get(index);
 			if (ip65504DeMapEntryVar == null) {
                ip65504DeMapEntryVar = new Ip65504DeMapEntry(this,beginIp65504DeMapEntry + index * Ip65504DeMapEntry.getIp65504DeMapEntryFieldLength());
                  getIp65504DeMapEntry().set(index, ip65504DeMapEntryVar);
			} 
			ip65504DeMapEntryVar.initialize();
		}
     }
   }


}
  
