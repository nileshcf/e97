package com.cloudframe.app.ar640010.dto;

/**
*  The class RecfmTable520 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class RecfmTable520 extends RecfmTable520Serialized { 
   
			private List<RecfmEntry520> recfmEntry520 = new ArrayList<>();
    	
	
	/**
	* Constructor for RecfmTable520
	**/
    public RecfmTable520() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RecfmTable520. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecfmTable520(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of recfmEntry520
	 *  Corresponding COBOL Variable is 520-RECFM-ENTRY
	 *	@return recfmEntry520
	 */
   public List<RecfmEntry520> getRecfmEntry520() {
       return recfmEntry520;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return recfmEntry520
	 */
	public RecfmEntry520 getRecfmEntry520(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getRecfmEntry520(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= RECFM_ENTRY_520_SIZE) {
             	index = RECFM_ENTRY_520_SIZE -1; // can't exceed max array size
             	logger.trace("recfmEntry520 - Array index exceeded max Size {}, resetting it to max allowed",RECFM_ENTRY_520_SIZE); 
	    }
		if (index >= recfmEntry520.size()) {
       		for (int fillIndex =  recfmEntry520.size() -1; fillIndex < index;fillIndex++) {
		       recfmEntry520.add(null);
		    }
			recfmEntry520.set(index,
			   	   	new RecfmEntry520(this,beginRecfmEntry520 + index * RecfmEntry520.getRecfmEntry520FieldLength()) 
				                        ); 	
		} 
   	   RecfmEntry520 value = recfmEntry520.get(index);
   	   if (value == null) {
   	      recfmEntry520.set(index,
			   	   	new RecfmEntry520(this,beginRecfmEntry520 + index * RecfmEntry520.getRecfmEntry520FieldLength()) 
				                        ); 
		  value = recfmEntry520.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update RecfmEntry520 at index with the passed value
	 *  Corresponding COBOL Variable is 520-RECFM-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setRecfmEntry520(int index,char[] value) {
   	getRecfmEntry520(index).setString(value);
   }
   
	

	
	
	

		public static int getRecfmTable520FieldLength() {
			return RECFM_TABLE_520_LENGTH;
		}

}
  
