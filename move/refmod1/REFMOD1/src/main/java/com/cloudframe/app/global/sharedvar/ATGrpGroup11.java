package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class ATGrpGroup11 extends ATGrpGroup11Serialized { 
   
					private ATGrp11 aTGrp11 = new ATGrp11();

						private char[] aTGrpR11 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup11
	**/
    public ATGrpGroup11() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aTGrp11.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aTGrp11
	 *	@return aTGrp11
	 */   
	 public ATGrp11 getATGrp11() {
   	return aTGrp11;
   }
   /**
	* 	Update ATGrp11 with the passed value
	*   Corresponding COBOL Variable is WS-11A-T-GRP
	*	@param value
	*/
   public void setATGrp11(char[] value) {
      aTGrp11.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp11 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp11(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp11.begin,aTGrp11.length());
   }
   
     /**
	 * 	Update ATGrp11 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp11.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp11 with another Field
	 *	@param value
	 */
   public void setATGrp11(Field source) {
   	replace(source,0,source.length(),aTGrp11.begin,aTGrp11.length());
   }  
   
     /**
	 * 	Update ATGrp11 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp11(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp11.begin,aTGrp11.length());
   }
   
     /**
	 * 	Update ATGrp11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp11.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR11
	 *	@return aTGrpR11
	 */
   public char[] getATGrpR11() throws CFException{
     if (isATGrpR11Modified()) { 
        aTGrpR11 = refreshATGrpR11();
     }
   		return aTGrpR11;
   }

  
	/**
	*  set variable aTGrpR11
	*  Corresponding COBOL Variable is WS-11A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR11(char[] value) {
      aTGrpR11 = checkATGrpR11Constraints(value);
      serializeATGrpR11(aTGrpR11);
   } 

     /**
	 * 	Update ATGrpR11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR11,aTGrpR11.length);
   	
   }
   
   public void setATGrpR11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR11,aTGrpR11.length);
   	
   }
   
     /**
	 * 	Update ATGrpR11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR11 with another Field
	 *	@param value
	 */
   public void setATGrpR11(Field source) {
       replace(source,0,source.length(),beginATGrpR11,A_TGRP_R_11_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR11,A_TGRP_R_11_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR11+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup11FieldLength() {
			return A_TGRP_GROUP_11_LENGTH;
		}

}
  
