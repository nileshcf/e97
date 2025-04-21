package com.cloudframe.app.init1.dto;

/**
*  The class RlhzaDtlRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlhzaDtlRecord extends RlhzaDtlRecordSerialized { 
   

						private char[] rlhzaFiller01 = Field.fillLowValue(114);
	
	/**
	* Constructor for RlhzaDtlRecord
	**/
    public RlhzaDtlRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlhzaDtlRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaDtlRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlhzaFiller01
	 *	@return rlhzaFiller01
	 */
   public char[] getRlhzaFiller01() throws CFException{
     if (isRlhzaFiller01Modified()) { 
        rlhzaFiller01 = refreshRlhzaFiller01();
     }
   		return rlhzaFiller01;
   }

  
	/**
	*  set variable rlhzaFiller01
	*  Corresponding COBOL Variable is RLHZA-FILLER
	*  @param value
	**/
   public void setRlhzaFiller01(char[] value) {
      rlhzaFiller01 = checkRlhzaFiller01Constraints(value);
      serializeRlhzaFiller01(rlhzaFiller01);
   } 

     /**
	 * 	Update RlhzaFiller01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlhzaFiller01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlhzaFiller01,rlhzaFiller01.length);
   	
   }
   
   public void setRlhzaFiller01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlhzaFiller01,rlhzaFiller01.length);
   	
   }
   
     /**
	 * 	Update RlhzaFiller01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaFiller01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlhzaFiller01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlhzaFiller01 with another Field
	 *	@param value
	 */
   public void setRlhzaFiller01(Field source) {
       replace(source,0,source.length(),beginRlhzaFiller01,RLHZA_FILLER_01_LEN);
   	
   }  
   
     /**
	 * 	Update RlhzaFiller01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlhzaFiller01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlhzaFiller01,RLHZA_FILLER_01_LEN);
   	
   }
   
     /**
	 * 	Update RlhzaFiller01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaFiller01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlhzaFiller01+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlhzaDtlRecordFieldLength() {
			return RLHZA_DTL_RECORD_LENGTH;
		}

}
  
