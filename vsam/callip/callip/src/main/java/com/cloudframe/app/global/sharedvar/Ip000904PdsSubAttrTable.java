package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000904PdsSubAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip000904PdsSubAttrTable")

public class Ip000904PdsSubAttrTable extends Ip000904PdsSubAttrTableSerialized  implements InitializingBean {
   
			private List<Ip000904PdsSubAttrRow> ip000904PdsSubAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip000904PdsSubAttrTable
	**/
    public Ip000904PdsSubAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_000904_PDS_SUB_ATTR_ROW_SIZE;arrayIndex++) {
						ip000904PdsSubAttrRow.add(new Ip000904PdsSubAttrRow(this, beginIp000904PdsSubAttrRow + 
						arrayIndex * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the  value of ip000904PdsSubAttrRow
	 *  Corresponding COBOL Variable is IP000904-PDS-SUB-ATTR-ROW
	 *	@return ip000904PdsSubAttrRow
	 */
   public List<Ip000904PdsSubAttrRow> getIp000904PdsSubAttrRow() {
       return ip000904PdsSubAttrRow;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip000904PdsSubAttrRow
	 */
	public Ip000904PdsSubAttrRow getIp000904PdsSubAttrRow(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp000904PdsSubAttrRow(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_000904_PDS_SUB_ATTR_ROW_SIZE) {
             	index = IP_000904_PDS_SUB_ATTR_ROW_SIZE -1; // can't exceed max array size
             	logger.trace("ip000904PdsSubAttrRow - Array index exceeded max Size {}, resetting it to max allowed",IP_000904_PDS_SUB_ATTR_ROW_SIZE); 
	    }
		if (index >= ip000904PdsSubAttrRow.size()) {
       		for (int fillIndex =  ip000904PdsSubAttrRow.size() -1; fillIndex < index;fillIndex++) {
		       ip000904PdsSubAttrRow.add(null);
		    }
			ip000904PdsSubAttrRow.set(index,
			   	   	new Ip000904PdsSubAttrRow(this,beginIp000904PdsSubAttrRow + index * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength()) 
				                        ); 	
		} 
   	   Ip000904PdsSubAttrRow value = ip000904PdsSubAttrRow.get(index);
   	   if (value == null) {
   	      ip000904PdsSubAttrRow.set(index,
			   	   	new Ip000904PdsSubAttrRow(this,beginIp000904PdsSubAttrRow + index * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength()) 
				                        ); 
		  value = ip000904PdsSubAttrRow.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip000904PdsSubAttrRow at index with the passed value
	 *  Corresponding COBOL Variable is IP000904-PDS-SUB-ATTR-ROW
	 *  @param index
	 *	@param value
	 */
  public void setIp000904PdsSubAttrRow(int index,char[] value) {
   	getIp000904PdsSubAttrRow(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip000904PdsSubAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip000904PdsSubAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_000904_PDS_SUB_ATTR_ROW_SIZE;index++) {
              Ip000904PdsSubAttrRow  newElement = new Ip000904PdsSubAttrRow(this,beginIp000904PdsSubAttrRow + index * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength());
              newElement.initialize();
               ip000904PdsSubAttrRow.add(newElement);
          }
     } else {
        if (ip000904PdsSubAttrRow.size() < IP_000904_PDS_SUB_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip000904PdsSubAttrRow.size();index <  IP_000904_PDS_SUB_ATTR_ROW_SIZE;index++) {
              Ip000904PdsSubAttrRow  newElement = new Ip000904PdsSubAttrRow(this,beginIp000904PdsSubAttrRow + index * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength());
               ip000904PdsSubAttrRow.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_000904_PDS_SUB_ATTR_ROW_SIZE;index++) {
     		Ip000904PdsSubAttrRow ip000904PdsSubAttrRowVar = ip000904PdsSubAttrRow.get(index);
 			if (ip000904PdsSubAttrRowVar == null) {
                ip000904PdsSubAttrRowVar = new Ip000904PdsSubAttrRow(this,beginIp000904PdsSubAttrRow + index * Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength());
                  ip000904PdsSubAttrRow.set(index, ip000904PdsSubAttrRowVar);
			} 
			ip000904PdsSubAttrRowVar.initialize();
		}
     }
   }

		public static int getIp000904PdsSubAttrTableFieldLength() {
			return IP_000904_PDS_SUB_ATTR_TABLE_LENGTH;
		}

}
  
