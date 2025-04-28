package com.cloudframe.app.ms00d363.dto;

/**
*  The class FillerTblWs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class FillerTblWs extends FillerTblWsSerialized {
   
			private List<TransTable1> transTable1 = new ArrayList<>();
    	
	
	/**
	* Constructor for FillerTblWs
	**/
    public FillerTblWs() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TRANS_TABLE_1_SIZE;arrayIndex++) {
						transTable1.add(new TransTable1(this, beginTransTable1 + 
						arrayIndex * TransTable1.getTransTable1FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of transTable1
	 *  Corresponding COBOL Variable is WS-TRANS-TABLE1
	 *	@return transTable1
	 */
   public List<TransTable1> getTransTable1() {
       return transTable1;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return transTable1
	 */
	public TransTable1 getTransTable1(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTransTable1(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TRANS_TABLE_1_SIZE) {
             	index = TRANS_TABLE_1_SIZE -1; // can't exceed max array size
             	logger.trace("transTable1 - Array index exceeded max Size {}, resetting it to max allowed",TRANS_TABLE_1_SIZE); 
	    }
		if (index >= transTable1.size()) {
       		for (int fillIndex =  transTable1.size() -1; fillIndex < index;fillIndex++) {
		       transTable1.add(null);
		    }
			transTable1.set(index,
			   	   	new TransTable1(this,beginTransTable1 + index * TransTable1.getTransTable1FieldLength()) 
				                        ); 	
		} 
   	   TransTable1 value = transTable1.get(index);
   	   if (value == null) {
   	      transTable1.set(index,
			   	   	new TransTable1(this,beginTransTable1 + index * TransTable1.getTransTable1FieldLength()) 
				                        ); 
		  value = transTable1.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TransTable1 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TRANS-TABLE1
	 *  @param index
	 *	@param value
	 */
  public void setTransTable1(int index,char[] value) {
   	getTransTable1(index).setString(value);
   }
   
	

	
	
	

		public static int getFillerTblWsFieldLength() {
			return FILLER_TBL_WS_LENGTH;
		}

}
  
