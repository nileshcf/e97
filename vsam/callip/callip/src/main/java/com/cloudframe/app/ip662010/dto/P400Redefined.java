package com.cloudframe.app.ip662010.dto;

/**
*  The class P400Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class P400Redefined extends P400RedefinedSerialized { 
   

						private char[] pX400 = Field.fillLowValue(1);
	
	/**
	* Constructor for P400Redefined
	**/
    public P400Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for P400Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public P400Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of pX400
	 *	@return pX400
	 */
   public char[] getPX400() throws CFException{
     if (isPX400Modified()) { 
        pX400 = refreshPX400();
     }
   		return pX400;
   }

  
	/**
	*  set variable pX400
	*  Corresponding COBOL Variable is 400-P-X
	*  @param value
	**/
   public void setPX400(char[] value) {
      pX400 = checkPX400Constraints(value);
      serializePX400(pX400);
   } 

     /**
	 * 	Update PX400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPX400(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPX400,pX400.length);
   	
   }
   
   public void setPX400(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPX400,pX400.length);
   	
   }
   
     /**
	 * 	Update PX400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPX400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPX400+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PX400 with another Field
	 *	@param value
	 */
   public void setPX400(Field source) {
       replace(source,0,source.length(),beginPX400,P_X_400_LEN);
   	
   }  
   
     /**
	 * 	Update PX400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPX400(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPX400,P_X_400_LEN);
   	
   }
   
     /**
	 * 	Update PX400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPX400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPX400+targetIndex,targetLen);
    
   }

	
	
	

		public static int getP400RedefinedFieldLength() {
			return P_400_REDEFINED_LENGTH;
		}

}
  
