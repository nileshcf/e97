package com.cloudframe.app.refmod1.dto;

/**
*  The class ATGroup4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGroup4 extends ATGroup4Serialized {
   
					private AT4 aT4 = new AT4();

						private char[] aTR4 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGroup4
	**/
    public ATGroup4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT4.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT4
	 *	@return aT4
	 */   
	 public AT4 getAT4() {
   	return aT4;
   }
   /**
	* 	Update AT4 with the passed value
	*   Corresponding COBOL Variable is WS-4A-T
	*	@param value
	*/
   public void setAT4(char[] value) {
      aT4.setString(value); 
   }   
    
     /**
	 * 	Update AT4 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT4(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT4.begin,aT4.length());
   }
   
     /**
	 * 	Update AT4 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT4.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT4 with another Field
	 *	@param value
	 */
   public void setAT4(Field source) {
   	replace(source,0,source.length(),aT4.begin,aT4.length());
   }  
   
     /**
	 * 	Update AT4 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT4(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT4.begin,aT4.length());
   }
   
     /**
	 * 	Update AT4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT4.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTR4
	 *	@return aTR4
	 */
   public char[] getATR4() throws CFException{
     if (isATR4Modified()) { 
        aTR4 = refreshATR4();
     }
   		return aTR4;
   }

  
	/**
	*  set variable aTR4
	*  Corresponding COBOL Variable is WS-4A-T-R
	*  @param value
	**/
   public void setATR4(char[] value) {
      aTR4 = checkATR4Constraints(value);
      serializeATR4(aTR4);
   } 

     /**
	 * 	Update ATR4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATR4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATR4,aTR4.length);
   	
   }
   
   public void setATR4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATR4,aTR4.length);
   	
   }
   
     /**
	 * 	Update ATR4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATR4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATR4 with another Field
	 *	@param value
	 */
   public void setATR4(Field source) {
       replace(source,0,source.length(),beginATR4,A_TR_4_LEN);
   	
   }  
   
     /**
	 * 	Update ATR4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATR4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATR4,A_TR_4_LEN);
   	
   }
   
     /**
	 * 	Update ATR4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATR4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGroup4FieldLength() {
			return A_TGROUP_4_LENGTH;
		}

}
  
