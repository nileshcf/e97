package com.cloudframe.app.sf910020.dto;

/**
*  The class Idx800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf910020.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Idx800Redefined extends Idx800RedefinedSerialized { 
   

						private char[] idxX800 = Field.fillLowValue(1);
	
	/**
	* Constructor for Idx800Redefined
	**/
    public Idx800Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Idx800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Idx800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of idxX800
	 *	@return idxX800
	 */
   public char[] getIdxX800() throws CFException{
     if (isIdxX800Modified()) { 
        idxX800 = refreshIdxX800();
     }
   		return idxX800;
   }

  
	/**
	*  set variable idxX800
	*  Corresponding COBOL Variable is 800-IDX-X
	*  @param value
	**/
   public void setIdxX800(char[] value) {
      idxX800 = checkIdxX800Constraints(value);
      serializeIdxX800(idxX800);
   } 

     /**
	 * 	Update IdxX800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIdxX800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIdxX800,idxX800.length);
   	
   }
   
   public void setIdxX800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIdxX800,idxX800.length);
   	
   }
   
     /**
	 * 	Update IdxX800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIdxX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIdxX800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IdxX800 with another Field
	 *	@param value
	 */
   public void setIdxX800(Field source) {
       replace(source,0,source.length(),beginIdxX800,IDX_X_800_LEN);
   	
   }  
   
     /**
	 * 	Update IdxX800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIdxX800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIdxX800,IDX_X_800_LEN);
   	
   }
   
     /**
	 * 	Update IdxX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIdxX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIdxX800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIdx800RedefinedFieldLength() {
			return IDX_800_REDEFINED_LENGTH;
		}

}
  
