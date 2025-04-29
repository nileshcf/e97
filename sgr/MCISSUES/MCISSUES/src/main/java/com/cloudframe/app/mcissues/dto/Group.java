package com.cloudframe.app.mcissues.dto;

/**
*  The class Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class Group extends GroupSerialized {
   
			private List<Group500> group500 = new ArrayList<>();
    	
	
	/**
	* Constructor for Group
	**/
    public Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < GROUP_500_SIZE;arrayIndex++) {
						group500.add(new Group500(this, beginGroup500 + 
						arrayIndex * Group500.getGroup500FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of group500
	 *  Corresponding COBOL Variable is 500-GROUP
	 *	@return group500
	 */
   public List<Group500> getGroup500() {
       return group500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return group500
	 */
	public Group500 getGroup500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getGroup500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= GROUP_500_SIZE) {
             	index = GROUP_500_SIZE -1; // can't exceed max array size
             	logger.trace("group500 - Array index exceeded max Size {}, resetting it to max allowed",GROUP_500_SIZE); 
	    }
		if (index >= group500.size()) {
       		for (int fillIndex =  group500.size() -1; fillIndex < index;fillIndex++) {
		       group500.add(null);
		    }
			group500.set(index,
			   	   	new Group500(this,beginGroup500 + index * Group500.getGroup500FieldLength()) 
				                        ); 	
		} 
   	   Group500 value = group500.get(index);
   	   if (value == null) {
   	      group500.set(index,
			   	   	new Group500(this,beginGroup500 + index * Group500.getGroup500FieldLength()) 
				                        ); 
		  value = group500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Group500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-GROUP
	 *  @param index
	 *	@param value
	 */
  public void setGroup500(int index,char[] value) {
   	getGroup500(index).setString(value);
   }
   
	

	
	
	

		public static int getGroupFieldLength() {
			return GROUP_LENGTH;
		}

}
  
