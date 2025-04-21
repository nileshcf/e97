package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip655o4CurrentTagTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip655o4CurrentTagTable")

public class Ip655o4CurrentTagTable extends Ip655o4CurrentTagTableSerialized  implements InitializingBean {
   
			private List<Ip655o4TagArea> ip655o4TagArea = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip655o4CurrentTagTable
	**/
    public Ip655o4CurrentTagTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_655O_4_TAG_AREA_SIZE;arrayIndex++) {
						ip655o4TagArea.add(new Ip655o4TagArea(this, beginIp655o4TagArea + 
						arrayIndex * Ip655o4TagArea.getIp655o4TagAreaFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the  value of ip655o4TagArea
	 *  Corresponding COBOL Variable is IP655O4-TAG-AREA
	 *	@return ip655o4TagArea
	 */
   public List<Ip655o4TagArea> getIp655o4TagArea() {
       return ip655o4TagArea;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip655o4TagArea
	 */
	public Ip655o4TagArea getIp655o4TagArea(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp655o4TagArea(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_655O_4_TAG_AREA_SIZE) {
             	index = IP_655O_4_TAG_AREA_SIZE -1; // can't exceed max array size
             	logger.trace("ip655o4TagArea - Array index exceeded max Size {}, resetting it to max allowed",IP_655O_4_TAG_AREA_SIZE); 
	    }
		if (index >= ip655o4TagArea.size()) {
       		for (int fillIndex =  ip655o4TagArea.size() -1; fillIndex < index;fillIndex++) {
		       ip655o4TagArea.add(null);
		    }
			ip655o4TagArea.set(index,
			   	   	new Ip655o4TagArea(this,beginIp655o4TagArea + index * Ip655o4TagArea.getIp655o4TagAreaFieldLength()) 
				                        ); 	
		} 
   	   Ip655o4TagArea value = ip655o4TagArea.get(index);
   	   if (value == null) {
   	      ip655o4TagArea.set(index,
			   	   	new Ip655o4TagArea(this,beginIp655o4TagArea + index * Ip655o4TagArea.getIp655o4TagAreaFieldLength()) 
				                        ); 
		  value = ip655o4TagArea.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip655o4TagArea at index with the passed value
	 *  Corresponding COBOL Variable is IP655O4-TAG-AREA
	 *  @param index
	 *	@param value
	 */
  public void setIp655o4TagArea(int index,char[] value) {
   	getIp655o4TagArea(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip655o4CurrentTagTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip655o4TagArea.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_655O_4_TAG_AREA_SIZE;index++) {
              Ip655o4TagArea  newElement = new Ip655o4TagArea(this,beginIp655o4TagArea + index * Ip655o4TagArea.getIp655o4TagAreaFieldLength());
              newElement.initialize();
               ip655o4TagArea.add(newElement);
          }
     } else {
        if (ip655o4TagArea.size() < IP_655O_4_TAG_AREA_SIZE) {
          // prefill it first
          for (int index = ip655o4TagArea.size();index <  IP_655O_4_TAG_AREA_SIZE;index++) {
              Ip655o4TagArea  newElement = new Ip655o4TagArea(this,beginIp655o4TagArea + index * Ip655o4TagArea.getIp655o4TagAreaFieldLength());
               ip655o4TagArea.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_655O_4_TAG_AREA_SIZE;index++) {
     		Ip655o4TagArea ip655o4TagAreaVar = ip655o4TagArea.get(index);
 			if (ip655o4TagAreaVar == null) {
                ip655o4TagAreaVar = new Ip655o4TagArea(this,beginIp655o4TagArea + index * Ip655o4TagArea.getIp655o4TagAreaFieldLength());
                  ip655o4TagArea.set(index, ip655o4TagAreaVar);
			} 
			ip655o4TagAreaVar.initialize();
		}
     }
   }

		public static int getIp655o4CurrentTagTableFieldLength() {
			return IP_655O_4_CURRENT_TAG_TABLE_LENGTH;
		}

}
  
