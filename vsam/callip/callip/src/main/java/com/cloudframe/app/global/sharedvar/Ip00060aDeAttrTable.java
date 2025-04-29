package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00060aDeAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip00060aDeAttrTable")

public class Ip00060aDeAttrTable extends Ip00060aDeAttrTableSerialized  implements InitializingBean {
   
			private List<Ip00060aDeAttrRow> ip00060aDeAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00060aDeAttrTable
	**/
    public Ip00060aDeAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00060A_DE_ATTR_ROW_SIZE;arrayIndex++) {
						ip00060aDeAttrRow.add(new Ip00060aDeAttrRow(this, beginIp00060aDeAttrRow + 
						arrayIndex * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the  value of ip00060aDeAttrRow
	 *  Corresponding COBOL Variable is IP00060A-DE-ATTR-ROW
	 *	@return ip00060aDeAttrRow
	 */
   public List<Ip00060aDeAttrRow> getIp00060aDeAttrRow() {
       return ip00060aDeAttrRow;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00060aDeAttrRow
	 */
	public Ip00060aDeAttrRow getIp00060aDeAttrRow(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00060aDeAttrRow(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00060A_DE_ATTR_ROW_SIZE) {
             	index = IP_00060A_DE_ATTR_ROW_SIZE -1; // can't exceed max array size
             	logger.trace("ip00060aDeAttrRow - Array index exceeded max Size {}, resetting it to max allowed",IP_00060A_DE_ATTR_ROW_SIZE); 
	    }
		if (index >= ip00060aDeAttrRow.size()) {
       		for (int fillIndex =  ip00060aDeAttrRow.size() -1; fillIndex < index;fillIndex++) {
		       ip00060aDeAttrRow.add(null);
		    }
			ip00060aDeAttrRow.set(index,
			   	   	new Ip00060aDeAttrRow(this,beginIp00060aDeAttrRow + index * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength()) 
				                        ); 	
		} 
   	   Ip00060aDeAttrRow value = ip00060aDeAttrRow.get(index);
   	   if (value == null) {
   	      ip00060aDeAttrRow.set(index,
			   	   	new Ip00060aDeAttrRow(this,beginIp00060aDeAttrRow + index * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength()) 
				                        ); 
		  value = ip00060aDeAttrRow.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00060aDeAttrRow at index with the passed value
	 *  Corresponding COBOL Variable is IP00060A-DE-ATTR-ROW
	 *  @param index
	 *	@param value
	 */
  public void setIp00060aDeAttrRow(int index,char[] value) {
   	getIp00060aDeAttrRow(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip00060aDeAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip00060aDeAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00060A_DE_ATTR_ROW_SIZE;index++) {
              Ip00060aDeAttrRow  newElement = new Ip00060aDeAttrRow(this,beginIp00060aDeAttrRow + index * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength());
              newElement.initialize();
               ip00060aDeAttrRow.add(newElement);
          }
     } else {
        if (ip00060aDeAttrRow.size() < IP_00060A_DE_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip00060aDeAttrRow.size();index <  IP_00060A_DE_ATTR_ROW_SIZE;index++) {
              Ip00060aDeAttrRow  newElement = new Ip00060aDeAttrRow(this,beginIp00060aDeAttrRow + index * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength());
               ip00060aDeAttrRow.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00060A_DE_ATTR_ROW_SIZE;index++) {
     		Ip00060aDeAttrRow ip00060aDeAttrRowVar = ip00060aDeAttrRow.get(index);
 			if (ip00060aDeAttrRowVar == null) {
                ip00060aDeAttrRowVar = new Ip00060aDeAttrRow(this,beginIp00060aDeAttrRow + index * Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength());
                  ip00060aDeAttrRow.set(index, ip00060aDeAttrRowVar);
			} 
			ip00060aDeAttrRowVar.initialize();
		}
     }
   }

		public static int getIp00060aDeAttrTableFieldLength() {
			return IP_00060A_DE_ATTR_TABLE_LENGTH;
		}

}
  
