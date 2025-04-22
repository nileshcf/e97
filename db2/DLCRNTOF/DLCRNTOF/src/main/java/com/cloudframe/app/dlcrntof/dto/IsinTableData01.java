package com.cloudframe.app.dlcrntof.dto;

/**
*  The class IsinTableData01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.dlcrntof.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IsinTableData01 extends IsinTableData01Serialized { 
   

						private char[] isinDeleted = Field.fillLowValue(12);
	
	/**
	* Constructor for IsinTableData01
	**/
    public IsinTableData01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IsinTableData01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IsinTableData01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of isinDeleted
	 *	@return isinDeleted
	 */
   public char[] getIsinDeleted() throws CFException{
     if (isIsinDeletedModified()) { 
        isinDeleted = refreshIsinDeleted();
     }
   		return isinDeleted;
   }

  
	/**
	*  set variable isinDeleted
	*  Corresponding COBOL Variable is ISIN-DELETED
	*  @param value
	**/
   public void setIsinDeleted(char[] value) {
      isinDeleted = checkIsinDeletedConstraints(value);
      serializeIsinDeleted(isinDeleted);
   } 

     /**
	 * 	Update IsinDeleted 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsinDeleted(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsinDeleted,isinDeleted.length);
   	
   }
   
   public void setIsinDeleted(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsinDeleted,isinDeleted.length);
   	
   }
   
     /**
	 * 	Update IsinDeleted 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsinDeleted(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsinDeleted+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IsinDeleted with another Field
	 *	@param value
	 */
   public void setIsinDeleted(Field source) {
       replace(source,0,source.length(),beginIsinDeleted,ISIN_DELETED_LEN);
   	
   }  
   
     /**
	 * 	Update IsinDeleted 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsinDeleted(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsinDeleted,ISIN_DELETED_LEN);
   	
   }
   
     /**
	 * 	Update IsinDeleted 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsinDeleted(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsinDeleted+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIsinTableData01FieldLength() {
			return ISIN_TABLE_DATA_01_LENGTH;
		}

}
  
