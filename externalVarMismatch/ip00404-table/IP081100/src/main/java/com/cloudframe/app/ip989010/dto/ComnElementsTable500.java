package com.cloudframe.app.ip989010.dto;

/**
*  The class ComnElementsTable500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class ComnElementsTable500 extends ComnElementsTable500Serialized {
   
			private List<ComnTblEntry500> comnTblEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for ComnElementsTable500
	**/
    public ComnElementsTable500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < COMN_TBL_ENTRY_500_SIZE;arrayIndex++) {
						comnTblEntry500.add(new ComnTblEntry500(this, beginComnTblEntry500 + 
						arrayIndex * ComnTblEntry500.getComnTblEntry500FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of comnTblEntry500
	 *  Corresponding COBOL Variable is 500-COMN-TBL-ENTRY
	 *	@return comnTblEntry500
	 */
   public List<ComnTblEntry500> getComnTblEntry500() {
       return comnTblEntry500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return comnTblEntry500
	 */
	public ComnTblEntry500 getComnTblEntry500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getComnTblEntry500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= COMN_TBL_ENTRY_500_SIZE) {
             	index = COMN_TBL_ENTRY_500_SIZE -1; // can't exceed max array size
             	logger.trace("comnTblEntry500 - Array index exceeded max Size {}, resetting it to max allowed",COMN_TBL_ENTRY_500_SIZE); 
	    }
		if (index >= comnTblEntry500.size()) {
       		for (int fillIndex =  comnTblEntry500.size() -1; fillIndex < index;fillIndex++) {
		       comnTblEntry500.add(null);
		    }
			comnTblEntry500.set(index,
			   	   	new ComnTblEntry500(this,beginComnTblEntry500 + index * ComnTblEntry500.getComnTblEntry500FieldLength()) 
				                        ); 	
		} 
   	   ComnTblEntry500 value = comnTblEntry500.get(index);
   	   if (value == null) {
   	      comnTblEntry500.set(index,
			   	   	new ComnTblEntry500(this,beginComnTblEntry500 + index * ComnTblEntry500.getComnTblEntry500FieldLength()) 
				                        ); 
		  value = comnTblEntry500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update ComnTblEntry500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-COMN-TBL-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setComnTblEntry500(int index,char[] value) {
   	getComnTblEntry500(index).setString(value);
   }
   
	

	
	
	

		public static int getComnElementsTable500FieldLength() {
			return COMN_ELEMENTS_TABLE_500_LENGTH;
		}

}
  
