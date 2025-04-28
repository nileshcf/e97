package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015PrcssAgrmtTabEnt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip02015PrcssAgrmtTabEnt extends Ip02015PrcssAgrmtTabEntSerialized { 
   
			private List<Ip02015PrcssAgrmtEntry> ip02015PrcssAgrmtEntry = new ArrayList<>();
    	
	
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
	 *	Returns the  value of ip02015PrcssAgrmtEntry
	 *  Corresponding COBOL Variable is IP02015-PRCSS-AGRMT-ENTRY
	 *	@return ip02015PrcssAgrmtEntry
	 */
   public List<Ip02015PrcssAgrmtEntry> getIp02015PrcssAgrmtEntry() {
       return ip02015PrcssAgrmtEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip02015PrcssAgrmtEntry
	 */
	public Ip02015PrcssAgrmtEntry getIp02015PrcssAgrmtEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp02015PrcssAgrmtEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_02015_PRCSS_AGRMT_ENTRY_SIZE) {
             	index = IP_02015_PRCSS_AGRMT_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip02015PrcssAgrmtEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_02015_PRCSS_AGRMT_ENTRY_SIZE); 
	    }
		if (index >= ip02015PrcssAgrmtEntry.size()) {
       		for (int fillIndex =  ip02015PrcssAgrmtEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip02015PrcssAgrmtEntry.add(null);
		    }
			ip02015PrcssAgrmtEntry.set(index,
			   	   	new Ip02015PrcssAgrmtEntry(this,beginIp02015PrcssAgrmtEntry + index * Ip02015PrcssAgrmtEntry.getIp02015PrcssAgrmtEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip02015PrcssAgrmtEntry value = ip02015PrcssAgrmtEntry.get(index);
   	   if (value == null) {
   	      ip02015PrcssAgrmtEntry.set(index,
			   	   	new Ip02015PrcssAgrmtEntry(this,beginIp02015PrcssAgrmtEntry + index * Ip02015PrcssAgrmtEntry.getIp02015PrcssAgrmtEntryFieldLength()) 
				                        ); 
		  value = ip02015PrcssAgrmtEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip02015PrcssAgrmtEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP02015-PRCSS-AGRMT-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp02015PrcssAgrmtEntry(int index,char[] value) {
   	getIp02015PrcssAgrmtEntry(index).setString(value);
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
               ip02015PrcssAgrmtEntry.add(newElement);
          }
     } else {
        if (ip02015PrcssAgrmtEntry.size() < IP_02015_PRCSS_AGRMT_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip02015PrcssAgrmtEntry.size();index <  IP_02015_PRCSS_AGRMT_ENTRY_SIZE;index++) {
              Ip02015PrcssAgrmtEntry  newElement = new Ip02015PrcssAgrmtEntry(this,beginIp02015PrcssAgrmtEntry + index * Ip02015PrcssAgrmtEntry.getIp02015PrcssAgrmtEntryFieldLength());
               ip02015PrcssAgrmtEntry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02015_PRCSS_AGRMT_ENTRY_SIZE;index++) {
     		Ip02015PrcssAgrmtEntry ip02015PrcssAgrmtEntryVar = ip02015PrcssAgrmtEntry.get(index);
 			if (ip02015PrcssAgrmtEntryVar == null) {
                ip02015PrcssAgrmtEntryVar = new Ip02015PrcssAgrmtEntry(this,beginIp02015PrcssAgrmtEntry + index * Ip02015PrcssAgrmtEntry.getIp02015PrcssAgrmtEntryFieldLength());
                  ip02015PrcssAgrmtEntry.set(index, ip02015PrcssAgrmtEntryVar);
			} 
			ip02015PrcssAgrmtEntryVar.initialize();
		}
     }
   }

		public static int getIp02015PrcssAgrmtTabEntFieldLength() {
			return IP_02015_PRCSS_AGRMT_TAB_ENT_LENGTH;
		}

}
  
