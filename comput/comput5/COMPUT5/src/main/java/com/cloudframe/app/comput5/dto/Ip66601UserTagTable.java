package com.cloudframe.app.comput5.dto;

/**
*  The class Ip66601UserTagTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Ip66601UserTagTable extends Ip66601UserTagTableSerialized { 
   
			private List<Ip66601UserTag> ip66601UserTag = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip66601UserTagTable
	**/
    public Ip66601UserTagTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip66601UserTagTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTagTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of ip66601UserTag
	 *  Corresponding COBOL Variable is IP66601-USER-TAG
	 *	@return ip66601UserTag
	 */
   public List<Ip66601UserTag> getIp66601UserTag() {
       return ip66601UserTag;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip66601UserTag
	 */
	public Ip66601UserTag getIp66601UserTag(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp66601UserTag(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_66601_USER_TAG_SIZE) {
             	index = IP_66601_USER_TAG_SIZE -1; // can't exceed max array size
             	logger.trace("ip66601UserTag - Array index exceeded max Size {}, resetting it to max allowed",IP_66601_USER_TAG_SIZE); 
	    }
		if (index >= ip66601UserTag.size()) {
       		for (int fillIndex =  ip66601UserTag.size() -1; fillIndex < index;fillIndex++) {
		       ip66601UserTag.add(null);
		    }
			ip66601UserTag.set(index,
			   	   	new Ip66601UserTag(this,beginIp66601UserTag + index * Ip66601UserTag.getIp66601UserTagFieldLength()) 
				                        ); 	
		} 
   	   Ip66601UserTag value = ip66601UserTag.get(index);
   	   if (value == null) {
   	      ip66601UserTag.set(index,
			   	   	new Ip66601UserTag(this,beginIp66601UserTag + index * Ip66601UserTag.getIp66601UserTagFieldLength()) 
				                        ); 
		  value = ip66601UserTag.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip66601UserTag at index with the passed value
	 *  Corresponding COBOL Variable is IP66601-USER-TAG
	 *  @param index
	 *	@param value
	 */
  public void setIp66601UserTag(int index,char[] value) {
   	getIp66601UserTag(index).setString(value);
   }
   
	

	
	
	

		public static int getIp66601UserTagTableFieldLength() {
			return IP_66601_USER_TAG_TABLE_LENGTH;
		}

}
  
