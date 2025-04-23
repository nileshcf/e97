package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys003InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys003InRec extends Sys003InRecSerialized {
   

						private char[] sys003Field = Field.fillLowValue(10);

						private char[] sys003FieldLen = Field.fillLowValue(3);

						private char[] sys003FieldVal = Field.fillLowValue(65);
	
	/**
	* Constructor for Sys003InRec
	**/
    public Sys003InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys003Field
	 *	@return sys003Field
	 */
   public char[] getSys003Field() throws CFException{
     if (isSys003FieldModified()) { 
        sys003Field = refreshSys003Field();
     }
   		return sys003Field;
   }

  
	/**
	*  set variable sys003Field
	*  Corresponding COBOL Variable is SYS003-FIELD
	*  @param value
	**/
   public void setSys003Field(char[] value) {
      sys003Field = checkSys003FieldConstraints(value);
      serializeSys003Field(sys003Field);
   } 

     /**
	 * 	Update Sys003Field 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys003Field(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys003Field,sys003Field.length);
   	
   }
   
   public void setSys003Field(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys003Field,sys003Field.length);
   	
   }
   
     /**
	 * 	Update Sys003Field 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys003Field(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys003Field+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys003Field with another Field
	 *	@param value
	 */
   public void setSys003Field(Field source) {
       replace(source,0,source.length(),beginSys003Field,SYS_003_FIELD_LEN);
   	
   }  
   
     /**
	 * 	Update Sys003Field 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys003Field(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys003Field,SYS_003_FIELD_LEN);
   	
   }
   
     /**
	 * 	Update Sys003Field 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys003Field(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys003Field+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys003FieldLen
	 *	@return sys003FieldLen
	 */
   public char[] getSys003FieldLen() throws CFException{
     if (isSys003FieldLenModified()) { 
        sys003FieldLen = refreshSys003FieldLen();
     }
   		return sys003FieldLen;
   }

  
	/**
	*  set variable sys003FieldLen
	*  Corresponding COBOL Variable is SYS003-FIELD-LEN
	*  @param value
	**/
   public void setSys003FieldLen(char[] value) {
      sys003FieldLen = checkSys003FieldLenConstraints(value);
      serializeSys003FieldLen(sys003FieldLen);
   } 

     /**
	 * 	Update Sys003FieldLen 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys003FieldLen(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys003FieldLen,sys003FieldLen.length);
   	
   }
   
   public void setSys003FieldLen(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys003FieldLen,sys003FieldLen.length);
   	
   }
   
     /**
	 * 	Update Sys003FieldLen 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys003FieldLen(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys003FieldLen+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys003FieldLen with another Field
	 *	@param value
	 */
   public void setSys003FieldLen(Field source) {
       replace(source,0,source.length(),beginSys003FieldLen,SYS_003_FIELD_LEN_LEN);
   	
   }  
   
     /**
	 * 	Update Sys003FieldLen 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys003FieldLen(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys003FieldLen,SYS_003_FIELD_LEN_LEN);
   	
   }
   
     /**
	 * 	Update Sys003FieldLen 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys003FieldLen(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys003FieldLen+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys003FieldVal
	 *	@return sys003FieldVal
	 */
   public char[] getSys003FieldVal() throws CFException{
     if (isSys003FieldValModified()) { 
        sys003FieldVal = refreshSys003FieldVal();
     }
   		return sys003FieldVal;
   }

  
	/**
	*  set variable sys003FieldVal
	*  Corresponding COBOL Variable is SYS003-FIELD-VAL
	*  @param value
	**/
   public void setSys003FieldVal(char[] value) {
      sys003FieldVal = checkSys003FieldValConstraints(value);
      serializeSys003FieldVal(sys003FieldVal);
   } 

     /**
	 * 	Update Sys003FieldVal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys003FieldVal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys003FieldVal,sys003FieldVal.length);
   	
   }
   
   public void setSys003FieldVal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys003FieldVal,sys003FieldVal.length);
   	
   }
   
     /**
	 * 	Update Sys003FieldVal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys003FieldVal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys003FieldVal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys003FieldVal with another Field
	 *	@param value
	 */
   public void setSys003FieldVal(Field source) {
       replace(source,0,source.length(),beginSys003FieldVal,SYS_003_FIELD_VAL_LEN);
   	
   }  
   
     /**
	 * 	Update Sys003FieldVal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys003FieldVal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys003FieldVal,SYS_003_FIELD_VAL_LEN);
   	
   }
   
     /**
	 * 	Update Sys003FieldVal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys003FieldVal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys003FieldVal+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys003InRecFieldLength() {
			return SYS_003_IN_REC_LENGTH;
		}

}
  
