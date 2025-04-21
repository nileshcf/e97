package com.cloudframe.app.refmod1.dto;

/**
*  The class ATGroup2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGroup2 extends ATGroup2Serialized {
   
					private AT2 aT2 = new AT2();

						private char[] aTR2 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGroup2
	**/
    public ATGroup2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT2.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT2
	 *	@return aT2
	 */   
	 public AT2 getAT2() {
   	return aT2;
   }
   /**
	* 	Update AT2 with the passed value
	*   Corresponding COBOL Variable is WS-2A-T
	*	@param value
	*/
   public void setAT2(char[] value) {
      aT2.setString(value); 
   }   
    
     /**
	 * 	Update AT2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT2.begin,aT2.length());
   }
   
     /**
	 * 	Update AT2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT2 with another Field
	 *	@param value
	 */
   public void setAT2(Field source) {
   	replace(source,0,source.length(),aT2.begin,aT2.length());
   }  
   
     /**
	 * 	Update AT2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT2.begin,aT2.length());
   }
   
     /**
	 * 	Update AT2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT2.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTR2
	 *	@return aTR2
	 */
   public char[] getATR2() throws CFException{
     if (isATR2Modified()) { 
        aTR2 = refreshATR2();
     }
   		return aTR2;
   }

  
	/**
	*  set variable aTR2
	*  Corresponding COBOL Variable is WS-2A-T-R
	*  @param value
	**/
   public void setATR2(char[] value) {
      aTR2 = checkATR2Constraints(value);
      serializeATR2(aTR2);
   } 

     /**
	 * 	Update ATR2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATR2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATR2,aTR2.length);
   	
   }
   
   public void setATR2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATR2,aTR2.length);
   	
   }
   
     /**
	 * 	Update ATR2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATR2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATR2 with another Field
	 *	@param value
	 */
   public void setATR2(Field source) {
       replace(source,0,source.length(),beginATR2,A_TR_2_LEN);
   	
   }  
   
     /**
	 * 	Update ATR2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATR2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATR2,A_TR_2_LEN);
   	
   }
   
     /**
	 * 	Update ATR2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATR2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATR2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGroup2FieldLength() {
			return A_TGROUP_2_LENGTH;
		}

}
  
