package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000804PdsAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip000804PdsAttrTable extends Ip000804PdsAttrTableSerialized { 
   
			private List<Ip000804PdsAttrRow> ip000804PdsAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip000804PdsAttrTable
	**/
    public Ip000804PdsAttrTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip000804PdsAttrTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000804PdsAttrTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of ip000804PdsAttrRow
	 *  Corresponding COBOL Variable is IP000804-PDS-ATTR-ROW
	 *	@return ip000804PdsAttrRow
	 */
   public List<Ip000804PdsAttrRow> getIp000804PdsAttrRow() {
       return ip000804PdsAttrRow;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip000804PdsAttrRow
	 */
	public Ip000804PdsAttrRow getIp000804PdsAttrRow(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp000804PdsAttrRow(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_000804_PDS_ATTR_ROW_SIZE) {
             	index = IP_000804_PDS_ATTR_ROW_SIZE -1; // can't exceed max array size
             	logger.trace("ip000804PdsAttrRow - Array index exceeded max Size {}, resetting it to max allowed",IP_000804_PDS_ATTR_ROW_SIZE); 
	    }
		if (index >= ip000804PdsAttrRow.size()) {
       		for (int fillIndex =  ip000804PdsAttrRow.size() -1; fillIndex < index;fillIndex++) {
		       ip000804PdsAttrRow.add(null);
		    }
			ip000804PdsAttrRow.set(index,
			   	   	new Ip000804PdsAttrRow(this,beginIp000804PdsAttrRow + index * Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength()) 
				                        ); 	
		} 
   	   Ip000804PdsAttrRow value = ip000804PdsAttrRow.get(index);
   	   if (value == null) {
   	      ip000804PdsAttrRow.set(index,
			   	   	new Ip000804PdsAttrRow(this,beginIp000804PdsAttrRow + index * Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength()) 
				                        ); 
		  value = ip000804PdsAttrRow.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip000804PdsAttrRow at index with the passed value
	 *  Corresponding COBOL Variable is IP000804-PDS-ATTR-ROW
	 *  @param index
	 *	@param value
	 */
  public void setIp000804PdsAttrRow(int index,char[] value) {
   	getIp000804PdsAttrRow(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip000804PdsAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip000804PdsAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_000804_PDS_ATTR_ROW_SIZE;index++) {
              Ip000804PdsAttrRow  newElement = new Ip000804PdsAttrRow(this,beginIp000804PdsAttrRow + index * Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength());
              newElement.initialize();
               ip000804PdsAttrRow.add(newElement);
          }
     } else {
        if (ip000804PdsAttrRow.size() < IP_000804_PDS_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip000804PdsAttrRow.size();index <  IP_000804_PDS_ATTR_ROW_SIZE;index++) {
              Ip000804PdsAttrRow  newElement = new Ip000804PdsAttrRow(this,beginIp000804PdsAttrRow + index * Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength());
               ip000804PdsAttrRow.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_000804_PDS_ATTR_ROW_SIZE;index++) {
     		Ip000804PdsAttrRow ip000804PdsAttrRowVar = ip000804PdsAttrRow.get(index);
 			if (ip000804PdsAttrRowVar == null) {
                ip000804PdsAttrRowVar = new Ip000804PdsAttrRow(this,beginIp000804PdsAttrRow + index * Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength());
                  ip000804PdsAttrRow.set(index, ip000804PdsAttrRowVar);
			} 
			ip000804PdsAttrRowVar.initialize();
		}
     }
   }

		public static int getIp000804PdsAttrTableFieldLength() {
			return IP_000804_PDS_ATTR_TABLE_LENGTH;
		}

}
  
