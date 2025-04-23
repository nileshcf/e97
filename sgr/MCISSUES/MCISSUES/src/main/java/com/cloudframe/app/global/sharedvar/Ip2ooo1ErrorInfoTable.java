package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1ErrorInfoTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip2ooo1ErrorInfoTable extends Ip2ooo1ErrorInfoTableSerialized { 
   
			private List<Ip2ooo1TableEntries> ip2ooo1TableEntries = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip2ooo1ErrorInfoTable
	**/
    public Ip2ooo1ErrorInfoTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip2ooo1ErrorInfoTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1ErrorInfoTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of ip2ooo1TableEntries
	 *  Corresponding COBOL Variable is IP2OOO1-TABLE-ENTRIES
	 *	@return ip2ooo1TableEntries
	 */
   public List<Ip2ooo1TableEntries> getIp2ooo1TableEntries() {
       return ip2ooo1TableEntries;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip2ooo1TableEntries
	 */
	public Ip2ooo1TableEntries getIp2ooo1TableEntries(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp2ooo1TableEntries(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_2OOO_1_TABLE_ENTRIES_SIZE) {
             	index = IP_2OOO_1_TABLE_ENTRIES_SIZE -1; // can't exceed max array size
             	logger.trace("ip2ooo1TableEntries - Array index exceeded max Size {}, resetting it to max allowed",IP_2OOO_1_TABLE_ENTRIES_SIZE); 
	    }
		if (index >= ip2ooo1TableEntries.size()) {
       		for (int fillIndex =  ip2ooo1TableEntries.size() -1; fillIndex < index;fillIndex++) {
		       ip2ooo1TableEntries.add(null);
		    }
			ip2ooo1TableEntries.set(index,
			   	   	new Ip2ooo1TableEntries(this,beginIp2ooo1TableEntries + index * Ip2ooo1TableEntries.getIp2ooo1TableEntriesFieldLength()) 
				                        ); 	
		} 
   	   Ip2ooo1TableEntries value = ip2ooo1TableEntries.get(index);
   	   if (value == null) {
   	      ip2ooo1TableEntries.set(index,
			   	   	new Ip2ooo1TableEntries(this,beginIp2ooo1TableEntries + index * Ip2ooo1TableEntries.getIp2ooo1TableEntriesFieldLength()) 
				                        ); 
		  value = ip2ooo1TableEntries.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip2ooo1TableEntries at index with the passed value
	 *  Corresponding COBOL Variable is IP2OOO1-TABLE-ENTRIES
	 *  @param index
	 *	@param value
	 */
  public void setIp2ooo1TableEntries(int index,char[] value) {
   	getIp2ooo1TableEntries(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip2ooo1ErrorInfoTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip2ooo1TableEntries.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_2OOO_1_TABLE_ENTRIES_SIZE;index++) {
              Ip2ooo1TableEntries  newElement = new Ip2ooo1TableEntries(this,beginIp2ooo1TableEntries + index * Ip2ooo1TableEntries.getIp2ooo1TableEntriesFieldLength());
              newElement.initialize();
               ip2ooo1TableEntries.add(newElement);
          }
     } else {
        if (ip2ooo1TableEntries.size() < IP_2OOO_1_TABLE_ENTRIES_SIZE) {
          // prefill it first
          for (int index = ip2ooo1TableEntries.size();index <  IP_2OOO_1_TABLE_ENTRIES_SIZE;index++) {
              Ip2ooo1TableEntries  newElement = new Ip2ooo1TableEntries(this,beginIp2ooo1TableEntries + index * Ip2ooo1TableEntries.getIp2ooo1TableEntriesFieldLength());
               ip2ooo1TableEntries.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_2OOO_1_TABLE_ENTRIES_SIZE;index++) {
     		Ip2ooo1TableEntries ip2ooo1TableEntriesVar = ip2ooo1TableEntries.get(index);
 			if (ip2ooo1TableEntriesVar == null) {
                ip2ooo1TableEntriesVar = new Ip2ooo1TableEntries(this,beginIp2ooo1TableEntries + index * Ip2ooo1TableEntries.getIp2ooo1TableEntriesFieldLength());
                  ip2ooo1TableEntries.set(index, ip2ooo1TableEntriesVar);
			} 
			ip2ooo1TableEntriesVar.initialize();
		}
     }
   }

		public static int getIp2ooo1ErrorInfoTableFieldLength() {
			return IP_2OOO_1_ERROR_INFO_TABLE_LENGTH;
		}

}
  
