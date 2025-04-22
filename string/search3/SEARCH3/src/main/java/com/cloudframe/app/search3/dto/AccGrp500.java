package com.cloudframe.app.search3.dto;

/**
*  The class AccGrp500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.search3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class AccGrp500 extends AccGrp500Serialized {
   
			private List<AccFinTbl500> accFinTbl500 = new ArrayList<>();
    	
	
	/**
	* Constructor for AccGrp500
	**/
    public AccGrp500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < ACC_FIN_TBL_500_SIZE;arrayIndex++) {
						accFinTbl500.add(new AccFinTbl500(this, beginAccFinTbl500 + 
						arrayIndex * AccFinTbl500.getAccFinTbl500FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of accFinTbl500
	 *  Corresponding COBOL Variable is 500-ACC-FIN-TBL
	 *	@return accFinTbl500
	 */
   public List<AccFinTbl500> getAccFinTbl500() {
       return accFinTbl500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return accFinTbl500
	 */
	public AccFinTbl500 getAccFinTbl500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getAccFinTbl500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= ACC_FIN_TBL_500_SIZE) {
             	index = ACC_FIN_TBL_500_SIZE -1; // can't exceed max array size
             	logger.trace("accFinTbl500 - Array index exceeded max Size {}, resetting it to max allowed",ACC_FIN_TBL_500_SIZE); 
	    }
		if (index >= accFinTbl500.size()) {
       		for (int fillIndex =  accFinTbl500.size() -1; fillIndex < index;fillIndex++) {
		       accFinTbl500.add(null);
		    }
			accFinTbl500.set(index,
			   	   	new AccFinTbl500(this,beginAccFinTbl500 + index * AccFinTbl500.getAccFinTbl500FieldLength()) 
				                        ); 	
		} 
   	   AccFinTbl500 value = accFinTbl500.get(index);
   	   if (value == null) {
   	      accFinTbl500.set(index,
			   	   	new AccFinTbl500(this,beginAccFinTbl500 + index * AccFinTbl500.getAccFinTbl500FieldLength()) 
				                        ); 
		  value = accFinTbl500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update AccFinTbl500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-ACC-FIN-TBL
	 *  @param index
	 *	@param value
	 */
  public void setAccFinTbl500(int index,char[] value) {
   	getAccFinTbl500(index).setString(value);
   }
   
	

	
	
	

		public static int getAccGrp500FieldLength() {
			return ACC_GRP_500_LENGTH;
		}

}
  
