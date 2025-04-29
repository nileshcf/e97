package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip570004TableEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip570004TableEntries extends Ip570004TableEntriesSerialized { 
   
			@Getter @Setter private List<Ip570004TableEntry> ip570004TableEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip570004TableEntries
	**/
    public Ip570004TableEntries() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip570004TableEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip570004TableEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip570004TableEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip570004TableEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_570004_TABLE_ENTRY_SIZE;index++) {
              Ip570004TableEntry  newElement = new Ip570004TableEntry(this,beginIp570004TableEntry + index * Ip570004TableEntry.getIp570004TableEntryFieldLength());
              newElement.initialize();
              getIp570004TableEntry().add(newElement);
          }
     } else {
        if (ip570004TableEntry.size() < IP_570004_TABLE_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip570004TableEntry.size();index <  IP_570004_TABLE_ENTRY_SIZE;index++) {
              Ip570004TableEntry  newElement = new Ip570004TableEntry(this,beginIp570004TableEntry + index * Ip570004TableEntry.getIp570004TableEntryFieldLength());
              getIp570004TableEntry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_570004_TABLE_ENTRY_SIZE;index++) {
     		Ip570004TableEntry ip570004TableEntryVar = ip570004TableEntry.get(index);
 			if (ip570004TableEntryVar == null) {
                ip570004TableEntryVar = new Ip570004TableEntry(this,beginIp570004TableEntry + index * Ip570004TableEntry.getIp570004TableEntryFieldLength());
                  getIp570004TableEntry().set(index, ip570004TableEntryVar);
			} 
			ip570004TableEntryVar.initialize();
		}
     }
   }


}
  
