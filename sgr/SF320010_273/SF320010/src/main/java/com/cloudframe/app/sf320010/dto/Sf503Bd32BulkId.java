package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503Bd32BulkId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503Bd32BulkId extends Sf503Bd32BulkIdSerialized { 
   

						private char[] sf503Bd32Type = Field.fillLowValue(1);
	
	/**
	* Constructor for Sf503Bd32BulkId
	**/
    public Sf503Bd32BulkId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503Bd32BulkId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503Bd32BulkId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503Bd32Type
	 *	@return sf503Bd32Type
	 */
   public char[] getSf503Bd32Type() throws CFException{
     if (isSf503Bd32TypeModified()) { 
        sf503Bd32Type = refreshSf503Bd32Type();
     }
   		return sf503Bd32Type;
   }

  
	/**
	*  set variable sf503Bd32Type
	*  Corresponding COBOL Variable is SF503-BD32-TYPE
	*  @param value
	**/
   public void setSf503Bd32Type(char[] value) {
      sf503Bd32Type = checkSf503Bd32TypeConstraints(value);
      serializeSf503Bd32Type(sf503Bd32Type);
   } 

     /**
	 * 	Update Sf503Bd32Type 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503Bd32Type(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503Bd32Type,sf503Bd32Type.length);
   	
   }
   
   public void setSf503Bd32Type(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503Bd32Type,sf503Bd32Type.length);
   	
   }
   
     /**
	 * 	Update Sf503Bd32Type 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503Bd32Type(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503Bd32Type+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503Bd32Type with another Field
	 *	@param value
	 */
   public void setSf503Bd32Type(Field source) {
       replace(source,0,source.length(),beginSf503Bd32Type,SF_503_BD_32_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503Bd32Type 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503Bd32Type(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503Bd32Type,SF_503_BD_32_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503Bd32Type 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503Bd32Type(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503Bd32Type+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503Bd32BulkIdFieldLength() {
			return SF_503_BD_32_BULK_ID_LENGTH;
		}

}
  
