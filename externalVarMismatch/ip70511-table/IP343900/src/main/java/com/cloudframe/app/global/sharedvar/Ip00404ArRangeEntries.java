package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404ArRangeEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip00404ArRangeEntries extends Ip00404ArRangeEntriesSerialized { 
   
			@Getter @Setter private List<Ip00404Entry> ip00404Entry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00404ArRangeEntries
	**/
    public Ip00404ArRangeEntries() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404ArRangeEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404ArRangeEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00404ArRangeEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip00404Entry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00404_ENTRY_SIZE;index++) {
              Ip00404Entry  newElement = new Ip00404Entry(this,beginIp00404Entry + index * Ip00404Entry.getIp00404EntryFieldLength());
              newElement.initialize();
              getIp00404Entry().add(newElement);
          }
     } else {
        if (ip00404Entry.size() < IP_00404_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip00404Entry.size();index <  IP_00404_ENTRY_SIZE;index++) {
              Ip00404Entry  newElement = new Ip00404Entry(this,beginIp00404Entry + index * Ip00404Entry.getIp00404EntryFieldLength());
              getIp00404Entry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00404_ENTRY_SIZE;index++) {
     		Ip00404Entry ip00404EntryVar = ip00404Entry.get(index);
 			if (ip00404EntryVar == null) {
                ip00404EntryVar = new Ip00404Entry(this,beginIp00404Entry + index * Ip00404Entry.getIp00404EntryFieldLength());
                  getIp00404Entry().set(index, ip00404EntryVar);
			} 
			ip00404EntryVar.initialize();
		}
     }
   }


}
  
