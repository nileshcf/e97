package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGroup6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGroup6")

public class ATGroup6 extends ATGroup6Serialized  implements InitializingBean {
   
					private AT6 aT6 = new AT6();

						private char[] aTR6 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGroup6
	**/
    public ATGroup6() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aT6.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aT6
	 *	@return aT6
	 */   
	 public AT6 getAT6() {
   	return aT6;
   }
   /**
	* 	Update AT6 with the passed value
	*   Corresponding COBOL Variable is WS-6A-T
	*	@param value
	*/
   public void setAT6(char[] value) {
      aT6.setString(value); 
   }   
    
     /**
	 * 	Update AT6 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT6(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT6.begin,aT6.length());
   }
   
     /**
	 * 	Update AT6 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT6.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT6 with another Field
	 *	@param value
	 */
   public void setAT6(Field source) {
   	replace(source,0,source.length(),aT6.begin,aT6.length());
   }  
   
     /**
	 * 	Update AT6 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT6(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT6.begin,aT6.length());
   }
   
     /**
	 * 	Update AT6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT6.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTR6
	 *	@return aTR6
	 */
   public char[] getATR6() throws CFException{
     if (isATR6Modified()) { 
        aTR6 = refreshATR6();
     }
   		return aTR6;
   }

  
	/**
	*  set variable aTR6
	*  Corresponding COBOL Variable is WS-6A-T-R
	*  @param value
	**/
   public void setATR6(char[] value) {
      aTR6 = checkATR6Constraints(value);
      serializeATR6(aTR6);
   } 

     /**
	 * 	Update ATR6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATR6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATR6,aTR6.length);
   	
   }
   
   public void setATR6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATR6,aTR6.length);
   	
   }
   
     /**
	 * 	Update ATR6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATR6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATR6 with another Field
	 *	@param value
	 */
   public void setATR6(Field source) {
       replace(source,0,source.length(),beginATR6,A_TR_6_LEN);
   	
   }  
   
     /**
	 * 	Update ATR6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATR6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATR6,A_TR_6_LEN);
   	
   }
   
     /**
	 * 	Update ATR6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATR6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR6+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGroup6FieldLength() {
			return A_TGROUP_6_LENGTH;
		}

}
  
