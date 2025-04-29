package com.cloudframe.app.mcindex.dto;

/**
*  The class IndexTbl1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.mcindex.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IndexTbl1800 extends IndexTbl1800Serialized { 
   

								private int zeroIdx5800;
	
	/**
	* Constructor for IndexTbl1800
	**/
    public IndexTbl1800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IndexTbl1800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IndexTbl1800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of zeroIdx5800
	 *	@return zeroIdx5800
	 */
	public int getZeroIdx5800() throws CFException {
        if (isZeroIdx5800Modified()) { 
           zeroIdx5800 = refreshZeroIdx5800();
        }
   		return zeroIdx5800;
	}
	
	/**
	 * 	Update ZeroIdx5800 with the passed value
	 *  Corresponding COBOL Variable is 800-ZERO-IDX5
	 *	@param number
	 */
	public void setZeroIdx5800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    zeroIdx5800 = checkZeroIdx5800MaxLimit(number); 
		serializeZeroIdx5800(zeroIdx5800);
	}


	public void setZeroIdx5800(long number) {
	    number = checkZeroIdx5800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setZeroIdx5800((int)number);
	}
	

	
	
	

		public static int getIndexTbl1800FieldLength() {
			return INDEX_TBL_1800_LENGTH;
		}

}
  
