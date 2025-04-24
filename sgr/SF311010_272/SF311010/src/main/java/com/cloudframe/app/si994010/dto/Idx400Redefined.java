package com.cloudframe.app.si994010.dto;

/**
*  The class Idx400Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Idx400Redefined extends Idx400RedefinedSerialized { 
   

						private char[] idxX400 = Field.fillLowValue(1);
	
	/**
	* Constructor for Idx400Redefined
	**/
    public Idx400Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Idx400Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Idx400Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of idxX400
	 *	@return idxX400
	 */
   public char[] getIdxX400() throws CFException{
     if (isIdxX400Modified()) { 
        idxX400 = refreshIdxX400();
     }
   		return idxX400;
   }

  
	/**
	*  set variable idxX400
	*  Corresponding COBOL Variable is 400-IDX-X
	*  @param value
	**/
   public void setIdxX400(char[] value) {
      idxX400 = checkIdxX400Constraints(value);
      serializeIdxX400(idxX400);
   } 

     /**
	 * 	Update IdxX400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIdxX400(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIdxX400,idxX400.length);
   	
   }
   
   public void setIdxX400(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIdxX400,idxX400.length);
   	
   }
   
     /**
	 * 	Update IdxX400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIdxX400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIdxX400+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IdxX400 with another Field
	 *	@param value
	 */
   public void setIdxX400(Field source) {
       replace(source,0,source.length(),beginIdxX400,IDX_X_400_LEN);
   	
   }  
   
     /**
	 * 	Update IdxX400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIdxX400(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIdxX400,IDX_X_400_LEN);
   	
   }
   
     /**
	 * 	Update IdxX400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIdxX400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIdxX400+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIdx400RedefinedFieldLength() {
			return IDX_400_REDEFINED_LENGTH;
		}

}
  
