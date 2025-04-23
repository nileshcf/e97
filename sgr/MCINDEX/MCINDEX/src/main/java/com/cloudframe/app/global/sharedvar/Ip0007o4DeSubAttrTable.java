package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0007o4DeSubAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip0007o4DeSubAttrTable")

public class Ip0007o4DeSubAttrTable extends Ip0007o4DeSubAttrTableSerialized  implements InitializingBean {
   
			private List<Ip0007o4DeSubAttrRow> ip0007o4DeSubAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip0007o4DeSubAttrTable
	**/
    public Ip0007o4DeSubAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_0007O_4_DE_SUB_ATTR_ROW_SIZE;arrayIndex++) {
						ip0007o4DeSubAttrRow.add(new Ip0007o4DeSubAttrRow(this, beginIp0007o4DeSubAttrRow + 
						arrayIndex * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the  value of ip0007o4DeSubAttrRow
	 *  Corresponding COBOL Variable is IP0007O4-DE-SUB-ATTR-ROW
	 *	@return ip0007o4DeSubAttrRow
	 */
   public List<Ip0007o4DeSubAttrRow> getIp0007o4DeSubAttrRow() {
       return ip0007o4DeSubAttrRow;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip0007o4DeSubAttrRow
	 */
	public Ip0007o4DeSubAttrRow getIp0007o4DeSubAttrRow(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp0007o4DeSubAttrRow(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_0007O_4_DE_SUB_ATTR_ROW_SIZE) {
             	index = IP_0007O_4_DE_SUB_ATTR_ROW_SIZE -1; // can't exceed max array size
             	logger.trace("ip0007o4DeSubAttrRow - Array index exceeded max Size {}, resetting it to max allowed",IP_0007O_4_DE_SUB_ATTR_ROW_SIZE); 
	    }
		if (index >= ip0007o4DeSubAttrRow.size()) {
       		for (int fillIndex =  ip0007o4DeSubAttrRow.size() -1; fillIndex < index;fillIndex++) {
		       ip0007o4DeSubAttrRow.add(null);
		    }
			ip0007o4DeSubAttrRow.set(index,
			   	   	new Ip0007o4DeSubAttrRow(this,beginIp0007o4DeSubAttrRow + index * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength()) 
				                        ); 	
		} 
   	   Ip0007o4DeSubAttrRow value = ip0007o4DeSubAttrRow.get(index);
   	   if (value == null) {
   	      ip0007o4DeSubAttrRow.set(index,
			   	   	new Ip0007o4DeSubAttrRow(this,beginIp0007o4DeSubAttrRow + index * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength()) 
				                        ); 
		  value = ip0007o4DeSubAttrRow.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip0007o4DeSubAttrRow at index with the passed value
	 *  Corresponding COBOL Variable is IP0007O4-DE-SUB-ATTR-ROW
	 *  @param index
	 *	@param value
	 */
  public void setIp0007o4DeSubAttrRow(int index,char[] value) {
   	getIp0007o4DeSubAttrRow(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip0007o4DeSubAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip0007o4DeSubAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_0007O_4_DE_SUB_ATTR_ROW_SIZE;index++) {
              Ip0007o4DeSubAttrRow  newElement = new Ip0007o4DeSubAttrRow(this,beginIp0007o4DeSubAttrRow + index * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength());
              newElement.initialize();
               ip0007o4DeSubAttrRow.add(newElement);
          }
     } else {
        if (ip0007o4DeSubAttrRow.size() < IP_0007O_4_DE_SUB_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip0007o4DeSubAttrRow.size();index <  IP_0007O_4_DE_SUB_ATTR_ROW_SIZE;index++) {
              Ip0007o4DeSubAttrRow  newElement = new Ip0007o4DeSubAttrRow(this,beginIp0007o4DeSubAttrRow + index * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength());
               ip0007o4DeSubAttrRow.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_0007O_4_DE_SUB_ATTR_ROW_SIZE;index++) {
     		Ip0007o4DeSubAttrRow ip0007o4DeSubAttrRowVar = ip0007o4DeSubAttrRow.get(index);
 			if (ip0007o4DeSubAttrRowVar == null) {
                ip0007o4DeSubAttrRowVar = new Ip0007o4DeSubAttrRow(this,beginIp0007o4DeSubAttrRow + index * Ip0007o4DeSubAttrRow.getIp0007o4DeSubAttrRowFieldLength());
                  ip0007o4DeSubAttrRow.set(index, ip0007o4DeSubAttrRowVar);
			} 
			ip0007o4DeSubAttrRowVar.initialize();
		}
     }
   }

		public static int getIp0007o4DeSubAttrTableFieldLength() {
			return IP_0007O_4_DE_SUB_ATTR_TABLE_LENGTH;
		}

}
  
