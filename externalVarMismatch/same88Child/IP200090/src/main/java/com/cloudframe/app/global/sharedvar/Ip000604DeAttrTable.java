package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000604DeAttrTable is used to handle fields declared in it
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

            @Component("global_ip000604DeAttrTable")

public class Ip000604DeAttrTable extends Ip000604DeAttrTableSerialized  implements InitializingBean {
   
			private List<Ip000604DeAttrRow> ip000604DeAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip000604DeAttrTable
	**/
    public Ip000604DeAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_000604_DE_ATTR_ROW_SIZE;arrayIndex++) {
						ip000604DeAttrRow.add(new Ip000604DeAttrRow(this, beginIp000604DeAttrRow + 
						arrayIndex * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the  value of ip000604DeAttrRow
	 *  Corresponding COBOL Variable is IP000604-DE-ATTR-ROW
	 *	@return ip000604DeAttrRow
	 */
   public List<Ip000604DeAttrRow> getIp000604DeAttrRow() {
       return ip000604DeAttrRow;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip000604DeAttrRow
	 */
	public Ip000604DeAttrRow getIp000604DeAttrRow(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp000604DeAttrRow(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_000604_DE_ATTR_ROW_SIZE) {
             	index = IP_000604_DE_ATTR_ROW_SIZE -1; // can't exceed max array size
             	logger.trace("ip000604DeAttrRow - Array index exceeded max Size {}, resetting it to max allowed",IP_000604_DE_ATTR_ROW_SIZE); 
	    }
		if (index >= ip000604DeAttrRow.size()) {
       		for (int fillIndex =  ip000604DeAttrRow.size() -1; fillIndex < index;fillIndex++) {
		       ip000604DeAttrRow.add(null);
		    }
			ip000604DeAttrRow.set(index,
			   	   	new Ip000604DeAttrRow(this,beginIp000604DeAttrRow + index * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength()) 
				                        ); 	
		} 
   	   Ip000604DeAttrRow value = ip000604DeAttrRow.get(index);
   	   if (value == null) {
   	      ip000604DeAttrRow.set(index,
			   	   	new Ip000604DeAttrRow(this,beginIp000604DeAttrRow + index * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength()) 
				                        ); 
		  value = ip000604DeAttrRow.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip000604DeAttrRow at index with the passed value
	 *  Corresponding COBOL Variable is IP000604-DE-ATTR-ROW
	 *  @param index
	 *	@param value
	 */
  public void setIp000604DeAttrRow(int index,char[] value) {
   	getIp000604DeAttrRow(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip000604DeAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip000604DeAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_000604_DE_ATTR_ROW_SIZE;index++) {
              Ip000604DeAttrRow  newElement = new Ip000604DeAttrRow(this,beginIp000604DeAttrRow + index * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength());
              newElement.initialize();
               ip000604DeAttrRow.add(newElement);
          }
     } else {
        if (ip000604DeAttrRow.size() < IP_000604_DE_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip000604DeAttrRow.size();index <  IP_000604_DE_ATTR_ROW_SIZE;index++) {
              Ip000604DeAttrRow  newElement = new Ip000604DeAttrRow(this,beginIp000604DeAttrRow + index * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength());
               ip000604DeAttrRow.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_000604_DE_ATTR_ROW_SIZE;index++) {
     		Ip000604DeAttrRow ip000604DeAttrRowVar = ip000604DeAttrRow.get(index);
 			if (ip000604DeAttrRowVar == null) {
                ip000604DeAttrRowVar = new Ip000604DeAttrRow(this,beginIp000604DeAttrRow + index * Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength());
                  ip000604DeAttrRow.set(index, ip000604DeAttrRowVar);
			} 
			ip000604DeAttrRowVar.initialize();
		}
     }
   }

		public static int getIp000604DeAttrTableFieldLength() {
			return IP_000604_DE_ATTR_TABLE_LENGTH;
		}

}
  
