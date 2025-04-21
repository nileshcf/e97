package com.cloudframe.app.mcissues.dto;

/**
*  The class A is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class A extends ASerialized {
   

						private char[] aVar1 = Field.fillLowValue(5);

						private char[] aVar2 = Field.fillLowValue(10);

						private char[] aVar4 = Field.fillLowValue(25);
	
	/**
	* Constructor for A
	**/
    public A() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aVar1
	 *	@return aVar1
	 */
   public char[] getAVar1() throws CFException{
     if (isAVar1Modified()) { 
        aVar1 = refreshAVar1();
     }
   		return aVar1;
   }

  
	/**
	*  set variable aVar1
	*  Corresponding COBOL Variable is WS-A-VAR1
	*  @param value
	**/
   public void setAVar1(char[] value) {
      aVar1 = checkAVar1Constraints(value);
      serializeAVar1(aVar1);
   } 

     /**
	 * 	Update AVar1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAVar1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAVar1,aVar1.length);
   	
   }
   
   public void setAVar1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAVar1,aVar1.length);
   	
   }
   
     /**
	 * 	Update AVar1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAVar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAVar1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AVar1 with another Field
	 *	@param value
	 */
   public void setAVar1(Field source) {
       replace(source,0,source.length(),beginAVar1,A_VAR_1_LEN);
   	
   }  
   
     /**
	 * 	Update AVar1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAVar1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAVar1,A_VAR_1_LEN);
   	
   }
   
     /**
	 * 	Update AVar1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAVar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAVar1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aVar2
	 *	@return aVar2
	 */
   public char[] getAVar2() throws CFException{
     if (isAVar2Modified()) { 
        aVar2 = refreshAVar2();
     }
   		return aVar2;
   }

  
	/**
	*  set variable aVar2
	*  Corresponding COBOL Variable is WS-A-VAR2
	*  @param value
	**/
   public void setAVar2(char[] value) {
      aVar2 = checkAVar2Constraints(value);
      serializeAVar2(aVar2);
   } 

     /**
	 * 	Update AVar2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAVar2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAVar2,aVar2.length);
   	
   }
   
   public void setAVar2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAVar2,aVar2.length);
   	
   }
   
     /**
	 * 	Update AVar2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAVar2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAVar2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AVar2 with another Field
	 *	@param value
	 */
   public void setAVar2(Field source) {
       replace(source,0,source.length(),beginAVar2,A_VAR_2_LEN);
   	
   }  
   
     /**
	 * 	Update AVar2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAVar2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAVar2,A_VAR_2_LEN);
   	
   }
   
     /**
	 * 	Update AVar2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAVar2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAVar2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aVar4
	 *	@return aVar4
	 */
   public char[] getAVar4() throws CFException{
     if (isAVar4Modified()) { 
        aVar4 = refreshAVar4();
     }
   		return aVar4;
   }

  
	/**
	*  set variable aVar4
	*  Corresponding COBOL Variable is WS-A-VAR4
	*  @param value
	**/
   public void setAVar4(char[] value) {
      aVar4 = checkAVar4Constraints(value);
      serializeAVar4(aVar4);
   } 

     /**
	 * 	Update AVar4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAVar4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAVar4,aVar4.length);
   	
   }
   
   public void setAVar4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAVar4,aVar4.length);
   	
   }
   
     /**
	 * 	Update AVar4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAVar4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAVar4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AVar4 with another Field
	 *	@param value
	 */
   public void setAVar4(Field source) {
       replace(source,0,source.length(),beginAVar4,A_VAR_4_LEN);
   	
   }  
   
     /**
	 * 	Update AVar4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAVar4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAVar4,A_VAR_4_LEN);
   	
   }
   
     /**
	 * 	Update AVar4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAVar4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAVar4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAFieldLength() {
			return A_LENGTH;
		}

}
  
