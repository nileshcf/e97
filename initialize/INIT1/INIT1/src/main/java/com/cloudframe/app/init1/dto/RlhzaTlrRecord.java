package com.cloudframe.app.init1.dto;

/**
*  The class RlhzaTlrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlhzaTlrRecord extends RlhzaTlrRecordSerialized { 
   

						private char[] rlhzaFiller03 = Field.fillLowValue(1689);
	
	/**
	* Constructor for RlhzaTlrRecord
	**/
    public RlhzaTlrRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlhzaTlrRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaTlrRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlhzaFiller03
	 *	@return rlhzaFiller03
	 */
   public char[] getRlhzaFiller03() throws CFException{
     if (isRlhzaFiller03Modified()) { 
        rlhzaFiller03 = refreshRlhzaFiller03();
     }
   		return rlhzaFiller03;
   }

  
	/**
	*  set variable rlhzaFiller03
	*  Corresponding COBOL Variable is RLHZA-FILLER
	*  @param value
	**/
   public void setRlhzaFiller03(char[] value) {
      rlhzaFiller03 = checkRlhzaFiller03Constraints(value);
      serializeRlhzaFiller03(rlhzaFiller03);
   } 

     /**
	 * 	Update RlhzaFiller03 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlhzaFiller03(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlhzaFiller03,rlhzaFiller03.length);
   	
   }
   
   public void setRlhzaFiller03(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlhzaFiller03,rlhzaFiller03.length);
   	
   }
   
     /**
	 * 	Update RlhzaFiller03 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaFiller03(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlhzaFiller03+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlhzaFiller03 with another Field
	 *	@param value
	 */
   public void setRlhzaFiller03(Field source) {
       replace(source,0,source.length(),beginRlhzaFiller03,RLHZA_FILLER_03_LEN);
   	
   }  
   
     /**
	 * 	Update RlhzaFiller03 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlhzaFiller03(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlhzaFiller03,RLHZA_FILLER_03_LEN);
   	
   }
   
     /**
	 * 	Update RlhzaFiller03 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaFiller03(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlhzaFiller03+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlhzaTlrRecordFieldLength() {
			return RLHZA_TLR_RECORD_LENGTH;
		}

}
  
