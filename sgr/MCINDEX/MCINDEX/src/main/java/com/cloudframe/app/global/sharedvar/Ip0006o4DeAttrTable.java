package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0006o4DeAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip0006o4DeAttrTable")

public class Ip0006o4DeAttrTable extends Ip0006o4DeAttrTableSerialized  implements InitializingBean {
   
			private List<Ip0006o4DeAttrRow> ip0006o4DeAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip0006o4DeAttrTable
	**/
    public Ip0006o4DeAttrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_0006O_4_DE_ATTR_ROW_SIZE;arrayIndex++) {
						ip0006o4DeAttrRow.add(new Ip0006o4DeAttrRow(this, beginIp0006o4DeAttrRow + 
						arrayIndex * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the  value of ip0006o4DeAttrRow
	 *  Corresponding COBOL Variable is IP0006O4-DE-ATTR-ROW
	 *	@return ip0006o4DeAttrRow
	 */
   public List<Ip0006o4DeAttrRow> getIp0006o4DeAttrRow() {
       return ip0006o4DeAttrRow;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip0006o4DeAttrRow
	 */
	public Ip0006o4DeAttrRow getIp0006o4DeAttrRow(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp0006o4DeAttrRow(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_0006O_4_DE_ATTR_ROW_SIZE) {
             	index = IP_0006O_4_DE_ATTR_ROW_SIZE -1; // can't exceed max array size
             	logger.trace("ip0006o4DeAttrRow - Array index exceeded max Size {}, resetting it to max allowed",IP_0006O_4_DE_ATTR_ROW_SIZE); 
	    }
		if (index >= ip0006o4DeAttrRow.size()) {
       		for (int fillIndex =  ip0006o4DeAttrRow.size() -1; fillIndex < index;fillIndex++) {
		       ip0006o4DeAttrRow.add(null);
		    }
			ip0006o4DeAttrRow.set(index,
			   	   	new Ip0006o4DeAttrRow(this,beginIp0006o4DeAttrRow + index * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength()) 
				                        ); 	
		} 
   	   Ip0006o4DeAttrRow value = ip0006o4DeAttrRow.get(index);
   	   if (value == null) {
   	      ip0006o4DeAttrRow.set(index,
			   	   	new Ip0006o4DeAttrRow(this,beginIp0006o4DeAttrRow + index * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength()) 
				                        ); 
		  value = ip0006o4DeAttrRow.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip0006o4DeAttrRow at index with the passed value
	 *  Corresponding COBOL Variable is IP0006O4-DE-ATTR-ROW
	 *  @param index
	 *	@param value
	 */
  public void setIp0006o4DeAttrRow(int index,char[] value) {
   	getIp0006o4DeAttrRow(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip0006o4DeAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip0006o4DeAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_0006O_4_DE_ATTR_ROW_SIZE;index++) {
              Ip0006o4DeAttrRow  newElement = new Ip0006o4DeAttrRow(this,beginIp0006o4DeAttrRow + index * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength());
              newElement.initialize();
               ip0006o4DeAttrRow.add(newElement);
          }
     } else {
        if (ip0006o4DeAttrRow.size() < IP_0006O_4_DE_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip0006o4DeAttrRow.size();index <  IP_0006O_4_DE_ATTR_ROW_SIZE;index++) {
              Ip0006o4DeAttrRow  newElement = new Ip0006o4DeAttrRow(this,beginIp0006o4DeAttrRow + index * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength());
               ip0006o4DeAttrRow.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_0006O_4_DE_ATTR_ROW_SIZE;index++) {
     		Ip0006o4DeAttrRow ip0006o4DeAttrRowVar = ip0006o4DeAttrRow.get(index);
 			if (ip0006o4DeAttrRowVar == null) {
                ip0006o4DeAttrRowVar = new Ip0006o4DeAttrRow(this,beginIp0006o4DeAttrRow + index * Ip0006o4DeAttrRow.getIp0006o4DeAttrRowFieldLength());
                  ip0006o4DeAttrRow.set(index, ip0006o4DeAttrRowVar);
			} 
			ip0006o4DeAttrRowVar.initialize();
		}
     }
   }

		public static int getIp0006o4DeAttrTableFieldLength() {
			return IP_0006O_4_DE_ATTR_TABLE_LENGTH;
		}

}
  
