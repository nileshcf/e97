package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys201RecordPart3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Sys201RecordPart3 extends Sys201RecordPart3Serialized { 
   
			private List<Sys201CalcFeeInfo> sys201CalcFeeInfo = new ArrayList<>();
    	
	
	/**
	* Constructor for Sys201RecordPart3
	**/
    public Sys201RecordPart3() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys201RecordPart3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys201RecordPart3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of sys201CalcFeeInfo
	 *  Corresponding COBOL Variable is SYS201-CALC-FEE-INFO
	 *	@return sys201CalcFeeInfo
	 */
   public List<Sys201CalcFeeInfo> getSys201CalcFeeInfo() {
       return sys201CalcFeeInfo;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return sys201CalcFeeInfo
	 */
	public Sys201CalcFeeInfo getSys201CalcFeeInfo(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSys201CalcFeeInfo(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SYS_201_CALC_FEE_INFO_SIZE) {
             	index = SYS_201_CALC_FEE_INFO_SIZE -1; // can't exceed max array size
             	logger.trace("sys201CalcFeeInfo - Array index exceeded max Size {}, resetting it to max allowed",SYS_201_CALC_FEE_INFO_SIZE); 
	    }
		if (index >= sys201CalcFeeInfo.size()) {
       		for (int fillIndex =  sys201CalcFeeInfo.size() -1; fillIndex < index;fillIndex++) {
		       sys201CalcFeeInfo.add(null);
		    }
			sys201CalcFeeInfo.set(index,
			   	   	new Sys201CalcFeeInfo(this,beginSys201CalcFeeInfo + index * Sys201CalcFeeInfo.getSys201CalcFeeInfoFieldLength()) 
				                        ); 	
		} 
   	   Sys201CalcFeeInfo value = sys201CalcFeeInfo.get(index);
   	   if (value == null) {
   	      sys201CalcFeeInfo.set(index,
			   	   	new Sys201CalcFeeInfo(this,beginSys201CalcFeeInfo + index * Sys201CalcFeeInfo.getSys201CalcFeeInfoFieldLength()) 
				                        ); 
		  value = sys201CalcFeeInfo.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Sys201CalcFeeInfo at index with the passed value
	 *  Corresponding COBOL Variable is SYS201-CALC-FEE-INFO
	 *  @param index
	 *	@param value
	 */
  public void setSys201CalcFeeInfo(int index,char[] value) {
   	getSys201CalcFeeInfo(index).setString(value);
   }
   
	

	
	
	

		public static int getSys201RecordPart3FieldLength() {
			return SYS_201_RECORD_PART_3_LENGTH;
		}

}
  
