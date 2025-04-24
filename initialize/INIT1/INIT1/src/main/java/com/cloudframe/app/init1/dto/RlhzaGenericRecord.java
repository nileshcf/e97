package com.cloudframe.app.init1.dto;

/**
*  The class RlhzaGenericRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlhzaGenericRecord extends RlhzaGenericRecordSerialized { 
   

						private char[] rlhzaFiller = Field.fillLowValue(1698);
	
	/**
	* Constructor for RlhzaGenericRecord
	**/
    public RlhzaGenericRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlhzaGenericRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaGenericRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlhzaFiller
	 *	@return rlhzaFiller
	 */
   public char[] getRlhzaFiller() throws CFException{
     if (isRlhzaFillerModified()) { 
        rlhzaFiller = refreshRlhzaFiller();
     }
   		return rlhzaFiller;
   }

  
	/**
	*  set variable rlhzaFiller
	*  Corresponding COBOL Variable is RLHZA-FILLER
	*  @param value
	**/
   public void setRlhzaFiller(char[] value) {
      rlhzaFiller = checkRlhzaFillerConstraints(value);
      serializeRlhzaFiller(rlhzaFiller);
   } 

     /**
	 * 	Update RlhzaFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlhzaFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlhzaFiller,rlhzaFiller.length);
   	
   }
   
   public void setRlhzaFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlhzaFiller,rlhzaFiller.length);
   	
   }
   
     /**
	 * 	Update RlhzaFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlhzaFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlhzaFiller with another Field
	 *	@param value
	 */
   public void setRlhzaFiller(Field source) {
       replace(source,0,source.length(),beginRlhzaFiller,RLHZA_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update RlhzaFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlhzaFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlhzaFiller,RLHZA_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update RlhzaFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlhzaFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlhzaGenericRecordFieldLength() {
			return RLHZA_GENERIC_RECORD_LENGTH;
		}

}
  
