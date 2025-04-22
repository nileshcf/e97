package com.cloudframe.app.refmod1.dto;

/**
*  The class ATGroup3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGroup3 extends ATGroup3Serialized {
   
					private AT3 aT3 = new AT3();

						private char[] aTR3 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGroup3
	**/
    public ATGroup3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT3.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT3
	 *	@return aT3
	 */   
	 public AT3 getAT3() {
   	return aT3;
   }
   /**
	* 	Update AT3 with the passed value
	*   Corresponding COBOL Variable is WS-3A-T
	*	@param value
	*/
   public void setAT3(char[] value) {
      aT3.setString(value); 
   }   
    
     /**
	 * 	Update AT3 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT3(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT3.begin,aT3.length());
   }
   
     /**
	 * 	Update AT3 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT3.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT3 with another Field
	 *	@param value
	 */
   public void setAT3(Field source) {
   	replace(source,0,source.length(),aT3.begin,aT3.length());
   }  
   
     /**
	 * 	Update AT3 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT3(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT3.begin,aT3.length());
   }
   
     /**
	 * 	Update AT3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT3.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTR3
	 *	@return aTR3
	 */
   public char[] getATR3() throws CFException{
     if (isATR3Modified()) { 
        aTR3 = refreshATR3();
     }
   		return aTR3;
   }

  
	/**
	*  set variable aTR3
	*  Corresponding COBOL Variable is WS-3A-T-R
	*  @param value
	**/
   public void setATR3(char[] value) {
      aTR3 = checkATR3Constraints(value);
      serializeATR3(aTR3);
   } 

     /**
	 * 	Update ATR3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATR3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATR3,aTR3.length);
   	
   }
   
   public void setATR3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATR3,aTR3.length);
   	
   }
   
     /**
	 * 	Update ATR3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATR3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATR3 with another Field
	 *	@param value
	 */
   public void setATR3(Field source) {
       replace(source,0,source.length(),beginATR3,A_TR_3_LEN);
   	
   }  
   
     /**
	 * 	Update ATR3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATR3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATR3,A_TR_3_LEN);
   	
   }
   
     /**
	 * 	Update ATR3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATR3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR3+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGroup3FieldLength() {
			return A_TGROUP_3_LENGTH;
		}

}
  
