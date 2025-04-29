package com.cloudframe.app.edjaddrs.dto;

/**
*  The class RctMinComp3Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.edjaddrs.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RctMinComp3Group extends RctMinComp3GroupSerialized { 
   

								private long rctMinComp3;
	
	/**
	* Constructor for RctMinComp3Group
	**/
    public RctMinComp3Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RctMinComp3Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RctMinComp3Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getRctMinComp3() throws CFException {
        if (isRctMinComp3Modified()) { 
           rctMinComp3 = refreshRctMinComp3();
        }
   		return rctMinComp3;
	}
	
	/**
	 * 	Update RctMinComp3 with the passed value
	 *  Corresponding COBOL Variable is RCT-MIN-COMP-3
	 *	@param number
	 */
	public void setRctMinComp3(long number) {
			rctMinComp3 = checkRctMinComp3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRctMinComp3(rctMinComp3);
	}



	
	
	

		public static int getRctMinComp3GroupFieldLength() {
			return RCT_MIN_COMP_3_GROUP_LENGTH;
		}

}
  
