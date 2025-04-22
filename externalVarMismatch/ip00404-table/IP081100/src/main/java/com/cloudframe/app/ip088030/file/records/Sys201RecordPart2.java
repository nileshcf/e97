package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys201RecordPart2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201RecordPart2 extends Sys201RecordPart2Serialized { 
   

						private char[] sys201Maid = Field.fillLowValue(6);
	
	/**
	* Constructor for Sys201RecordPart2
	**/
    public Sys201RecordPart2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys201RecordPart2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys201RecordPart2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sys201Maid
	 *	@return sys201Maid
	 */
   public char[] getSys201Maid() throws CFException{
     if (isSys201MaidModified()) { 
        sys201Maid = refreshSys201Maid();
     }
   		return sys201Maid;
   }

  
	/**
	*  set variable sys201Maid
	*  Corresponding COBOL Variable is SYS201-MAID
	*  @param value
	**/
   public void setSys201Maid(char[] value) {
      sys201Maid = checkSys201MaidConstraints(value);
      serializeSys201Maid(sys201Maid);
   } 

     /**
	 * 	Update Sys201Maid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201Maid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201Maid,sys201Maid.length);
   	
   }
   
   public void setSys201Maid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201Maid,sys201Maid.length);
   	
   }
   
     /**
	 * 	Update Sys201Maid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201Maid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201Maid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201Maid with another Field
	 *	@param value
	 */
   public void setSys201Maid(Field source) {
       replace(source,0,source.length(),beginSys201Maid,SYS_201_MAID_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201Maid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201Maid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201Maid,SYS_201_MAID_LEN);
   	
   }
   
     /**
	 * 	Update Sys201Maid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201Maid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201Maid+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201RecordPart2FieldLength() {
			return SYS_201_RECORD_PART_2_LENGTH;
		}

}
  
