package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00702CaTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip00702CaTable")

public class Ip00702CaTable extends Ip00702CaTableSerialized  implements InitializingBean {
   
			private List<Ip00702CaEntry> ip00702CaEntry = new ArrayList<>();
    	
	
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
						ip00702CaEntry.add(new Ip00702CaEntry(this, beginIp00702CaEntry + 
						arrayIndex * Ip00702CaEntry.getIp00702CaEntryFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the  value of ip00702CaEntry
	 *  Corresponding COBOL Variable is IP00702-CA-ENTRY
	 *	@return ip00702CaEntry
	 */
   public List<Ip00702CaEntry> getIp00702CaEntry() {
       return ip00702CaEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00702CaEntry
	 */
	public Ip00702CaEntry getIp00702CaEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00702CaEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00702_CA_ENTRY_SIZE) {
             	index = IP_00702_CA_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip00702CaEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_00702_CA_ENTRY_SIZE); 
	    }
		if (index >= ip00702CaEntry.size()) {
       		for (int fillIndex =  ip00702CaEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip00702CaEntry.add(null);
		    }
			ip00702CaEntry.set(index,
			   	   	new Ip00702CaEntry(this,beginIp00702CaEntry + index * Ip00702CaEntry.getIp00702CaEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip00702CaEntry value = ip00702CaEntry.get(index);
   	   if (value == null) {
   	      ip00702CaEntry.set(index,
			   	   	new Ip00702CaEntry(this,beginIp00702CaEntry + index * Ip00702CaEntry.getIp00702CaEntryFieldLength()) 
				                        ); 
		  value = ip00702CaEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00702CaEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP00702-CA-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp00702CaEntry(int index,char[] value) {
   	getIp00702CaEntry(index).setString(value);
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
               ip00702CaEntry.add(newElement);
          }
     } else {
        if (ip00702CaEntry.size() < IP_00702_CA_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip00702CaEntry.size();index <  IP_00702_CA_ENTRY_SIZE;index++) {
              Ip00702CaEntry  newElement = new Ip00702CaEntry(this,beginIp00702CaEntry + index * Ip00702CaEntry.getIp00702CaEntryFieldLength());
               ip00702CaEntry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00702_CA_ENTRY_SIZE;index++) {
     		Ip00702CaEntry ip00702CaEntryVar = ip00702CaEntry.get(index);
 			if (ip00702CaEntryVar == null) {
                ip00702CaEntryVar = new Ip00702CaEntry(this,beginIp00702CaEntry + index * Ip00702CaEntry.getIp00702CaEntryFieldLength());
                  ip00702CaEntry.set(index, ip00702CaEntryVar);
			} 
			ip00702CaEntryVar.initialize();
		}
     }
   }

		public static int getIp00702CaTableFieldLength() {
			return IP_00702_CA_TABLE_LENGTH;
		}

}
  
