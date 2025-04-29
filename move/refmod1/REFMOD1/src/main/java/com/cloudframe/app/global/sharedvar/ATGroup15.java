package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGroup15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGroup15")

public class ATGroup15 extends ATGroup15Serialized  implements InitializingBean {
   
					private AT15 aT15 = new AT15();

						private char[] aTR15 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGroup15
	**/
    public ATGroup15() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aT15.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aT15
	 *	@return aT15
	 */   
	 public AT15 getAT15() {
   	return aT15;
   }
   /**
	* 	Update AT15 with the passed value
	*   Corresponding COBOL Variable is WS-15A-T
	*	@param value
	*/
   public void setAT15(char[] value) {
      aT15.setString(value); 
   }   
    
     /**
	 * 	Update AT15 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT15(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT15.begin,aT15.length());
   }
   
     /**
	 * 	Update AT15 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT15.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT15 with another Field
	 *	@param value
	 */
   public void setAT15(Field source) {
   	replace(source,0,source.length(),aT15.begin,aT15.length());
   }  
   
     /**
	 * 	Update AT15 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT15(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT15.begin,aT15.length());
   }
   
     /**
	 * 	Update AT15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT15.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTR15
	 *	@return aTR15
	 */
   public char[] getATR15() throws CFException{
     if (isATR15Modified()) { 
        aTR15 = refreshATR15();
     }
   		return aTR15;
   }

  
	/**
	*  set variable aTR15
	*  Corresponding COBOL Variable is WS-15A-T-R
	*  @param value
	**/
   public void setATR15(char[] value) {
      aTR15 = checkATR15Constraints(value);
      serializeATR15(aTR15);
   } 

     /**
	 * 	Update ATR15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATR15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATR15,aTR15.length);
   	
   }
   
   public void setATR15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATR15,aTR15.length);
   	
   }
   
     /**
	 * 	Update ATR15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATR15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATR15 with another Field
	 *	@param value
	 */
   public void setATR15(Field source) {
       replace(source,0,source.length(),beginATR15,A_TR_15_LEN);
   	
   }  
   
     /**
	 * 	Update ATR15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATR15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATR15,A_TR_15_LEN);
   	
   }
   
     /**
	 * 	Update ATR15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATR15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR15+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGroup15FieldLength() {
			return A_TGROUP_15_LENGTH;
		}

}
  
