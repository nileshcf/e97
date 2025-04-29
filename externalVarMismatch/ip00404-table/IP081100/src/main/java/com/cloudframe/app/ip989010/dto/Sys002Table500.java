package com.cloudframe.app.ip989010.dto;

/**
*  The class Sys002Table500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class Sys002Table500 extends Sys002Table500Serialized {
   
			private List<Sys002Data500> sys002Data500 = new ArrayList<>();
    	
	
	/**
	* Constructor for Sys002Table500
	**/
    public Sys002Table500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SYS_002_DATA_500_SIZE;arrayIndex++) {
						sys002Data500.add(new Sys002Data500(this, beginSys002Data500 + 
						arrayIndex * Sys002Data500.getSys002Data500FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of sys002Data500
	 *  Corresponding COBOL Variable is 500-SYS002-DATA
	 *	@return sys002Data500
	 */
   public List<Sys002Data500> getSys002Data500() {
       return sys002Data500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return sys002Data500
	 */
	public Sys002Data500 getSys002Data500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSys002Data500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SYS_002_DATA_500_SIZE) {
             	index = SYS_002_DATA_500_SIZE -1; // can't exceed max array size
             	logger.trace("sys002Data500 - Array index exceeded max Size {}, resetting it to max allowed",SYS_002_DATA_500_SIZE); 
	    }
		if (index >= sys002Data500.size()) {
       		for (int fillIndex =  sys002Data500.size() -1; fillIndex < index;fillIndex++) {
		       sys002Data500.add(null);
		    }
			sys002Data500.set(index,
			   	   	new Sys002Data500(this,beginSys002Data500 + index * Sys002Data500.getSys002Data500FieldLength()) 
				                        ); 	
		} 
   	   Sys002Data500 value = sys002Data500.get(index);
   	   if (value == null) {
   	      sys002Data500.set(index,
			   	   	new Sys002Data500(this,beginSys002Data500 + index * Sys002Data500.getSys002Data500FieldLength()) 
				                        ); 
		  value = sys002Data500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Sys002Data500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-SYS002-DATA
	 *  @param index
	 *	@param value
	 */
  public void setSys002Data500(int index,char[] value) {
   	getSys002Data500(index).setString(value);
   }
   
	

	
	
	

		public static int getSys002Table500FieldLength() {
			return SYS_002_TABLE_500_LENGTH;
		}

}
  
