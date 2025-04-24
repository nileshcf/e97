package com.cloudframe.app.move0.dto;

/**
*  The class AcceptDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AcceptDate extends AcceptDateSerialized { 
   

						private char[] yyyy01 = new char[4];

						private char[] mm01 = new char[2];

						private char[] dd01 = new char[2];
	
	/**
	* Constructor for AcceptDate
	**/
    public AcceptDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setYyyy01(("2018").toCharArray());
								setMm01(("11").toCharArray());
								setDd01(("28").toCharArray());
    }


 

	/**
	 *	Returns the value of yyyy01
	 *	@return yyyy01
	 */
   public char[] getYyyy01() throws CFException{
     if (isYyyy01Modified()) { 
        yyyy01 = refreshYyyy01();
     }
   		return yyyy01;
   }

  
	/**
	*  set variable yyyy01
	*  Corresponding COBOL Variable is WS-YYYY
	*  @param value
	**/
   public void setYyyy01(char[] value) {
      yyyy01 = checkYyyy01Constraints(value);
      serializeYyyy01(yyyy01);
   } 

     /**
	 * 	Update Yyyy01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setYyyy01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginYyyy01,yyyy01.length);
   	
   }
   
   public void setYyyy01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginYyyy01,yyyy01.length);
   	
   }
   
     /**
	 * 	Update Yyyy01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setYyyy01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginYyyy01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Yyyy01 with another Field
	 *	@param value
	 */
   public void setYyyy01(Field source) {
       replace(source,0,source.length(),beginYyyy01,YYYY_01_LEN);
   	
   }  
   
     /**
	 * 	Update Yyyy01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setYyyy01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginYyyy01,YYYY_01_LEN);
   	
   }
   
     /**
	 * 	Update Yyyy01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setYyyy01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginYyyy01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mm01
	 *	@return mm01
	 */
   public char[] getMm01() throws CFException{
     if (isMm01Modified()) { 
        mm01 = refreshMm01();
     }
   		return mm01;
   }

  
	/**
	*  set variable mm01
	*  Corresponding COBOL Variable is WS-MM
	*  @param value
	**/
   public void setMm01(char[] value) {
      mm01 = checkMm01Constraints(value);
      serializeMm01(mm01);
   } 

     /**
	 * 	Update Mm01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMm01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMm01,mm01.length);
   	
   }
   
   public void setMm01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMm01,mm01.length);
   	
   }
   
     /**
	 * 	Update Mm01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMm01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMm01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Mm01 with another Field
	 *	@param value
	 */
   public void setMm01(Field source) {
       replace(source,0,source.length(),beginMm01,MM_01_LEN);
   	
   }  
   
     /**
	 * 	Update Mm01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMm01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMm01,MM_01_LEN);
   	
   }
   
     /**
	 * 	Update Mm01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMm01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMm01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dd01
	 *	@return dd01
	 */
   public char[] getDd01() throws CFException{
     if (isDd01Modified()) { 
        dd01 = refreshDd01();
     }
   		return dd01;
   }

  
	/**
	*  set variable dd01
	*  Corresponding COBOL Variable is WS-DD
	*  @param value
	**/
   public void setDd01(char[] value) {
      dd01 = checkDd01Constraints(value);
      serializeDd01(dd01);
   } 

     /**
	 * 	Update Dd01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDd01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDd01,dd01.length);
   	
   }
   
   public void setDd01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDd01,dd01.length);
   	
   }
   
     /**
	 * 	Update Dd01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDd01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDd01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dd01 with another Field
	 *	@param value
	 */
   public void setDd01(Field source) {
       replace(source,0,source.length(),beginDd01,DD_01_LEN);
   	
   }  
   
     /**
	 * 	Update Dd01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDd01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDd01,DD_01_LEN);
   	
   }
   
     /**
	 * 	Update Dd01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDd01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDd01+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAcceptDateFieldLength() {
			return ACCEPT_DATE_LENGTH;
		}

}
  
