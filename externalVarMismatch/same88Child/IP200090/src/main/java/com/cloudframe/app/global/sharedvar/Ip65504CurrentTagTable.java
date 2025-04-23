package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504CurrentTagTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip65504CurrentTagTable")

public class Ip65504CurrentTagTable extends Ip65504CurrentTagTableSerialized  implements InitializingBean {
   
			private List<Ip65504TagArea> ip65504TagArea = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip65504CurrentTagTable
	**/
    public Ip65504CurrentTagTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_65504_TAG_AREA_SIZE;arrayIndex++) {
						ip65504TagArea.add(new Ip65504TagArea(this, beginIp65504TagArea + 
						arrayIndex * Ip65504TagArea.getIp65504TagAreaFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the  value of ip65504TagArea
	 *  Corresponding COBOL Variable is IP65504-TAG-AREA
	 *	@return ip65504TagArea
	 */
   public List<Ip65504TagArea> getIp65504TagArea() {
       return ip65504TagArea;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip65504TagArea
	 */
	public Ip65504TagArea getIp65504TagArea(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp65504TagArea(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_65504_TAG_AREA_SIZE) {
             	index = IP_65504_TAG_AREA_SIZE -1; // can't exceed max array size
             	logger.trace("ip65504TagArea - Array index exceeded max Size {}, resetting it to max allowed",IP_65504_TAG_AREA_SIZE); 
	    }
		if (index >= ip65504TagArea.size()) {
       		for (int fillIndex =  ip65504TagArea.size() -1; fillIndex < index;fillIndex++) {
		       ip65504TagArea.add(null);
		    }
			ip65504TagArea.set(index,
			   	   	new Ip65504TagArea(this,beginIp65504TagArea + index * Ip65504TagArea.getIp65504TagAreaFieldLength()) 
				                        ); 	
		} 
   	   Ip65504TagArea value = ip65504TagArea.get(index);
   	   if (value == null) {
   	      ip65504TagArea.set(index,
			   	   	new Ip65504TagArea(this,beginIp65504TagArea + index * Ip65504TagArea.getIp65504TagAreaFieldLength()) 
				                        ); 
		  value = ip65504TagArea.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip65504TagArea at index with the passed value
	 *  Corresponding COBOL Variable is IP65504-TAG-AREA
	 *  @param index
	 *	@param value
	 */
  public void setIp65504TagArea(int index,char[] value) {
   	getIp65504TagArea(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip65504CurrentTagTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip65504TagArea.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_65504_TAG_AREA_SIZE;index++) {
              Ip65504TagArea  newElement = new Ip65504TagArea(this,beginIp65504TagArea + index * Ip65504TagArea.getIp65504TagAreaFieldLength());
              newElement.initialize();
               ip65504TagArea.add(newElement);
          }
     } else {
        if (ip65504TagArea.size() < IP_65504_TAG_AREA_SIZE) {
          // prefill it first
          for (int index = ip65504TagArea.size();index <  IP_65504_TAG_AREA_SIZE;index++) {
              Ip65504TagArea  newElement = new Ip65504TagArea(this,beginIp65504TagArea + index * Ip65504TagArea.getIp65504TagAreaFieldLength());
               ip65504TagArea.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_65504_TAG_AREA_SIZE;index++) {
     		Ip65504TagArea ip65504TagAreaVar = ip65504TagArea.get(index);
 			if (ip65504TagAreaVar == null) {
                ip65504TagAreaVar = new Ip65504TagArea(this,beginIp65504TagArea + index * Ip65504TagArea.getIp65504TagAreaFieldLength());
                  ip65504TagArea.set(index, ip65504TagAreaVar);
			} 
			ip65504TagAreaVar.initialize();
		}
     }
   }

		public static int getIp65504CurrentTagTableFieldLength() {
			return IP_65504_CURRENT_TAG_TABLE_LENGTH;
		}

}
  
