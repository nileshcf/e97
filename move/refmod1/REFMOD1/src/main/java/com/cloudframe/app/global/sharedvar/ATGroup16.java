package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGroup16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGroup16")

public class ATGroup16 extends ATGroup16Serialized  implements InitializingBean {
   
					private AT16 aT16 = new AT16();

						private char[] aTR16 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGroup16
	**/
    public ATGroup16() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aT16.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aT16
	 *	@return aT16
	 */   
	 public AT16 getAT16() {
   	return aT16;
   }
   /**
	* 	Update AT16 with the passed value
	*   Corresponding COBOL Variable is WS-16A-T
	*	@param value
	*/
   public void setAT16(char[] value) {
      aT16.setString(value); 
   }   
    
     /**
	 * 	Update AT16 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT16(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT16.begin,aT16.length());
   }
   
     /**
	 * 	Update AT16 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT16.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT16 with another Field
	 *	@param value
	 */
   public void setAT16(Field source) {
   	replace(source,0,source.length(),aT16.begin,aT16.length());
   }  
   
     /**
	 * 	Update AT16 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT16(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT16.begin,aT16.length());
   }
   
     /**
	 * 	Update AT16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT16.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTR16
	 *	@return aTR16
	 */
   public char[] getATR16() throws CFException{
     if (isATR16Modified()) { 
        aTR16 = refreshATR16();
     }
   		return aTR16;
   }

  
	/**
	*  set variable aTR16
	*  Corresponding COBOL Variable is WS-16A-T-R
	*  @param value
	**/
   public void setATR16(char[] value) {
      aTR16 = checkATR16Constraints(value);
      serializeATR16(aTR16);
   } 

     /**
	 * 	Update ATR16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATR16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATR16,aTR16.length);
   	
   }
   
   public void setATR16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATR16,aTR16.length);
   	
   }
   
     /**
	 * 	Update ATR16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATR16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATR16 with another Field
	 *	@param value
	 */
   public void setATR16(Field source) {
       replace(source,0,source.length(),beginATR16,A_TR_16_LEN);
   	
   }  
   
     /**
	 * 	Update ATR16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATR16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATR16,A_TR_16_LEN);
   	
   }
   
     /**
	 * 	Update ATR16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATR16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR16+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGroup16FieldLength() {
			return A_TGROUP_16_LENGTH;
		}

}
  
