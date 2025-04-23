package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecTable530 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class SpecTable530 extends SpecTable530Serialized {
   
			private List<SpecEntry530> specEntry530 = new ArrayList<>();
    	
	
	/**
	* Constructor for SpecTable530
	**/
    public SpecTable530() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SPEC_ENTRY_530_SIZE;arrayIndex++) {
						specEntry530.add(new SpecEntry530(this, beginSpecEntry530 + 
						arrayIndex * SpecEntry530.getSpecEntry530FieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < SPEC_ENTRY_530_SIZE;arrayIndex++) {
					specEntry530.add(new SpecEntry530(this, beginSpecEntry530 + 
						arrayIndex * SpecEntry530.getSpecEntry530FieldLength()));
			}
    }


 

	/**
	 *	Returns the  value of specEntry530
	 *  Corresponding COBOL Variable is 530-SPEC-ENTRY
	 *	@return specEntry530
	 */
   public List<SpecEntry530> getSpecEntry530() {
       return specEntry530;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return specEntry530
	 */
	public SpecEntry530 getSpecEntry530(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSpecEntry530(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SPEC_ENTRY_530_SIZE) {
             	index = SPEC_ENTRY_530_SIZE -1; // can't exceed max array size
             	logger.trace("specEntry530 - Array index exceeded max Size {}, resetting it to max allowed",SPEC_ENTRY_530_SIZE); 
	    }
		if (index >= specEntry530.size()) {
       		for (int fillIndex =  specEntry530.size() -1; fillIndex < index;fillIndex++) {
		       specEntry530.add(null);
		    }
			specEntry530.set(index,
			   	   	new SpecEntry530(this,beginSpecEntry530 + index * SpecEntry530.getSpecEntry530FieldLength()) 
				                        ); 	
		} 
   	   SpecEntry530 value = specEntry530.get(index);
   	   if (value == null) {
   	      specEntry530.set(index,
			   	   	new SpecEntry530(this,beginSpecEntry530 + index * SpecEntry530.getSpecEntry530FieldLength()) 
				                        ); 
		  value = specEntry530.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SpecEntry530 at index with the passed value
	 *  Corresponding COBOL Variable is 530-SPEC-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setSpecEntry530(int index,char[] value) {
   	getSpecEntry530(index).setString(value);
   }
   
	

	
	
	

		public static int getSpecTable530FieldLength() {
			return SPEC_TABLE_530_LENGTH;
		}

}
  
