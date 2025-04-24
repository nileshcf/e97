package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000704DeSubAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


@GlobalDto
public class Ip000704DeSubAttrTable extends Ip000704DeSubAttrTableSerialized { 
   
			private List<Ip000704DeSubAttrRow> ip000704DeSubAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip000704DeSubAttrTable
	**/
    public Ip000704DeSubAttrTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_000704_DE_SUB_ATTR_ROW_SIZE;arrayIndex++) {
						ip000704DeSubAttrRow.add(new Ip000704DeSubAttrRow(this, beginIp000704DeSubAttrRow + 
						arrayIndex * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of ip000704DeSubAttrRow
	 *  Corresponding COBOL Variable is IP000704-DE-SUB-ATTR-ROW
	 *	@return ip000704DeSubAttrRow
	 */
   public List<Ip000704DeSubAttrRow> getIp000704DeSubAttrRow() {
       return ip000704DeSubAttrRow;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip000704DeSubAttrRow
	 */
	public Ip000704DeSubAttrRow getIp000704DeSubAttrRow(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp000704DeSubAttrRow(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_000704_DE_SUB_ATTR_ROW_SIZE) {
             	index = IP_000704_DE_SUB_ATTR_ROW_SIZE -1; // can't exceed max array size
             	logger.trace("ip000704DeSubAttrRow - Array index exceeded max Size {}, resetting it to max allowed",IP_000704_DE_SUB_ATTR_ROW_SIZE); 
	    }
		if (index >= ip000704DeSubAttrRow.size()) {
       		for (int fillIndex =  ip000704DeSubAttrRow.size() -1; fillIndex < index;fillIndex++) {
		       ip000704DeSubAttrRow.add(null);
		    }
			ip000704DeSubAttrRow.set(index,
			   	   	new Ip000704DeSubAttrRow(this,beginIp000704DeSubAttrRow + index * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength()) 
				                        ); 	
		} 
   	   Ip000704DeSubAttrRow value = ip000704DeSubAttrRow.get(index);
   	   if (value == null) {
   	      ip000704DeSubAttrRow.set(index,
			   	   	new Ip000704DeSubAttrRow(this,beginIp000704DeSubAttrRow + index * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength()) 
				                        ); 
		  value = ip000704DeSubAttrRow.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip000704DeSubAttrRow at index with the passed value
	 *  Corresponding COBOL Variable is IP000704-DE-SUB-ATTR-ROW
	 *  @param index
	 *	@param value
	 */
  public void setIp000704DeSubAttrRow(int index,char[] value) {
   	getIp000704DeSubAttrRow(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip000704DeSubAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip000704DeSubAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_000704_DE_SUB_ATTR_ROW_SIZE;index++) {
              Ip000704DeSubAttrRow  newElement = new Ip000704DeSubAttrRow(this,beginIp000704DeSubAttrRow + index * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength());
              newElement.initialize();
               ip000704DeSubAttrRow.add(newElement);
          }
     } else {
        if (ip000704DeSubAttrRow.size() < IP_000704_DE_SUB_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip000704DeSubAttrRow.size();index <  IP_000704_DE_SUB_ATTR_ROW_SIZE;index++) {
              Ip000704DeSubAttrRow  newElement = new Ip000704DeSubAttrRow(this,beginIp000704DeSubAttrRow + index * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength());
               ip000704DeSubAttrRow.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_000704_DE_SUB_ATTR_ROW_SIZE;index++) {
     		Ip000704DeSubAttrRow ip000704DeSubAttrRowVar = ip000704DeSubAttrRow.get(index);
 			if (ip000704DeSubAttrRowVar == null) {
                ip000704DeSubAttrRowVar = new Ip000704DeSubAttrRow(this,beginIp000704DeSubAttrRow + index * Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength());
                  ip000704DeSubAttrRow.set(index, ip000704DeSubAttrRowVar);
			} 
			ip000704DeSubAttrRowVar.initialize();
		}
     }
   }

		public static int getIp000704DeSubAttrTableFieldLength() {
			return IP_000704_DE_SUB_ATTR_TABLE_LENGTH;
		}

}
  
