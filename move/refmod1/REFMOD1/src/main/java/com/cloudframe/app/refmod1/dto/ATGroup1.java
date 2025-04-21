package com.cloudframe.app.refmod1.dto;

/**
*  The class ATGroup1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGroup1 extends ATGroup1Serialized {
   
					private AT1 aT1 = new AT1();

						private char[] aTR1 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGroup1
	**/
    public ATGroup1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT1.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT1
	 *	@return aT1
	 */   
	 public AT1 getAT1() {
   	return aT1;
   }
   /**
	* 	Update AT1 with the passed value
	*   Corresponding COBOL Variable is WS-1A-T
	*	@param value
	*/
   public void setAT1(char[] value) {
      aT1.setString(value); 
   }   
    
     /**
	 * 	Update AT1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT1.begin,aT1.length());
   }
   
     /**
	 * 	Update AT1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT1 with another Field
	 *	@param value
	 */
   public void setAT1(Field source) {
   	replace(source,0,source.length(),aT1.begin,aT1.length());
   }  
   
     /**
	 * 	Update AT1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT1.begin,aT1.length());
   }
   
     /**
	 * 	Update AT1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTR1
	 *	@return aTR1
	 */
   public char[] getATR1() throws CFException{
     if (isATR1Modified()) { 
        aTR1 = refreshATR1();
     }
   		return aTR1;
   }

  
	/**
	*  set variable aTR1
	*  Corresponding COBOL Variable is WS-1A-T-R
	*  @param value
	**/
   public void setATR1(char[] value) {
      aTR1 = checkATR1Constraints(value);
      serializeATR1(aTR1);
   } 

     /**
	 * 	Update ATR1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATR1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATR1,aTR1.length);
   	
   }
   
   public void setATR1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATR1,aTR1.length);
   	
   }
   
     /**
	 * 	Update ATR1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATR1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATR1 with another Field
	 *	@param value
	 */
   public void setATR1(Field source) {
       replace(source,0,source.length(),beginATR1,A_TR_1_LEN);
   	
   }  
   
     /**
	 * 	Update ATR1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATR1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATR1,A_TR_1_LEN);
   	
   }
   
     /**
	 * 	Update ATR1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATR1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGroup1FieldLength() {
			return A_TGROUP_1_LENGTH;
		}

}
  
