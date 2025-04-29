package com.cloudframe.app.mcissues.dto;

/**
*  The class C is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class C extends CSerialized {
   

						private char[] cVar1 = Field.fillLowValue(5);

						private char[] cVar2 = Field.fillLowValue(10);

						private char[] cVar4 = Field.fillLowValue(35);
	
	/**
	* Constructor for C
	**/
    public C() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of cVar1
	 *	@return cVar1
	 */
   public char[] getCVar1() throws CFException{
     if (isCVar1Modified()) { 
        cVar1 = refreshCVar1();
     }
   		return cVar1;
   }

  
	/**
	*  set variable cVar1
	*  Corresponding COBOL Variable is WS-C-VAR1
	*  @param value
	**/
   public void setCVar1(char[] value) {
      cVar1 = checkCVar1Constraints(value);
      serializeCVar1(cVar1);
   } 

     /**
	 * 	Update CVar1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCVar1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCVar1,cVar1.length);
   	
   }
   
   public void setCVar1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCVar1,cVar1.length);
   	
   }
   
     /**
	 * 	Update CVar1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCVar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCVar1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CVar1 with another Field
	 *	@param value
	 */
   public void setCVar1(Field source) {
       replace(source,0,source.length(),beginCVar1,C_VAR_1_LEN);
   	
   }  
   
     /**
	 * 	Update CVar1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCVar1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCVar1,C_VAR_1_LEN);
   	
   }
   
     /**
	 * 	Update CVar1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCVar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCVar1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cVar2
	 *	@return cVar2
	 */
   public char[] getCVar2() throws CFException{
     if (isCVar2Modified()) { 
        cVar2 = refreshCVar2();
     }
   		return cVar2;
   }

  
	/**
	*  set variable cVar2
	*  Corresponding COBOL Variable is WS-C-VAR2
	*  @param value
	**/
   public void setCVar2(char[] value) {
      cVar2 = checkCVar2Constraints(value);
      serializeCVar2(cVar2);
   } 

     /**
	 * 	Update CVar2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCVar2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCVar2,cVar2.length);
   	
   }
   
   public void setCVar2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCVar2,cVar2.length);
   	
   }
   
     /**
	 * 	Update CVar2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCVar2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCVar2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CVar2 with another Field
	 *	@param value
	 */
   public void setCVar2(Field source) {
       replace(source,0,source.length(),beginCVar2,C_VAR_2_LEN);
   	
   }  
   
     /**
	 * 	Update CVar2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCVar2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCVar2,C_VAR_2_LEN);
   	
   }
   
     /**
	 * 	Update CVar2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCVar2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCVar2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cVar4
	 *	@return cVar4
	 */
   public char[] getCVar4() throws CFException{
     if (isCVar4Modified()) { 
        cVar4 = refreshCVar4();
     }
   		return cVar4;
   }

  
	/**
	*  set variable cVar4
	*  Corresponding COBOL Variable is WS-C-VAR4
	*  @param value
	**/
   public void setCVar4(char[] value) {
      cVar4 = checkCVar4Constraints(value);
      serializeCVar4(cVar4);
   } 

     /**
	 * 	Update CVar4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCVar4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCVar4,cVar4.length);
   	
   }
   
   public void setCVar4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCVar4,cVar4.length);
   	
   }
   
     /**
	 * 	Update CVar4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCVar4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCVar4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CVar4 with another Field
	 *	@param value
	 */
   public void setCVar4(Field source) {
       replace(source,0,source.length(),beginCVar4,C_VAR_4_LEN);
   	
   }  
   
     /**
	 * 	Update CVar4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCVar4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCVar4,C_VAR_4_LEN);
   	
   }
   
     /**
	 * 	Update CVar4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCVar4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCVar4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCFieldLength() {
			return C_LENGTH;
		}

}
  
