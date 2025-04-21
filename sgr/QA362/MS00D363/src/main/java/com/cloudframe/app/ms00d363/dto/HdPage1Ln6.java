package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln6 extends HdPage1Ln6Serialized {
   

						private char[] hd16Cc = new char[1];




						private char[] hd16Currency = new char[3];


						private char[] hd16CurrDesc = new char[30];

	
	/**
	* Constructor for HdPage1Ln6
	**/
    public HdPage1Ln6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd16Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("CURRENCY           :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd16Currency(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 26
             ,3
             );
								setHd16CurrDesc(fillSpace(30));
       replaceValue( // serialize and save the value
             pad(74," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 59
             ,74
             );
    }


 

	/**
	 *	Returns the value of hd16Cc
	 *	@return hd16Cc
	 */
   public char[] getHd16Cc() throws CFException{
     if (isHd16CcModified()) { 
        hd16Cc = refreshHd16Cc();
     }
   		return hd16Cc;
   }

  
	/**
	*  set variable hd16Cc
	*  Corresponding COBOL Variable is HD1-6-CC
	*  @param value
	**/
   public void setHd16Cc(char[] value) {
      hd16Cc = checkHd16CcConstraints(value);
      serializeHd16Cc(hd16Cc);
   } 

     /**
	 * 	Update Hd16Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd16Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd16Cc,hd16Cc.length);
   	
   }
   
   public void setHd16Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd16Cc,hd16Cc.length);
   	
   }
   
     /**
	 * 	Update Hd16Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd16Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd16Cc with another Field
	 *	@param value
	 */
   public void setHd16Cc(Field source) {
       replace(source,0,source.length(),beginHd16Cc,HD_16_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd16Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd16Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd16Cc,HD_16_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd16Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd16Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd16Currency
	 *	@return hd16Currency
	 */
   public char[] getHd16Currency() throws CFException{
     if (isHd16CurrencyModified()) { 
        hd16Currency = refreshHd16Currency();
     }
   		return hd16Currency;
   }

  
	/**
	*  set variable hd16Currency
	*  Corresponding COBOL Variable is HD1-6-CURRENCY
	*  @param value
	**/
   public void setHd16Currency(char[] value) {
      hd16Currency = checkHd16CurrencyConstraints(value);
      serializeHd16Currency(hd16Currency);
   } 

     /**
	 * 	Update Hd16Currency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd16Currency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd16Currency,hd16Currency.length);
   	
   }
   
   public void setHd16Currency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd16Currency,hd16Currency.length);
   	
   }
   
     /**
	 * 	Update Hd16Currency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd16Currency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16Currency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd16Currency with another Field
	 *	@param value
	 */
   public void setHd16Currency(Field source) {
       replace(source,0,source.length(),beginHd16Currency,HD_16_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update Hd16Currency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd16Currency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd16Currency,HD_16_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update Hd16Currency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd16Currency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16Currency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd16CurrDesc
	 *	@return hd16CurrDesc
	 */
   public char[] getHd16CurrDesc() throws CFException{
     if (isHd16CurrDescModified()) { 
        hd16CurrDesc = refreshHd16CurrDesc();
     }
   		return hd16CurrDesc;
   }

  
	/**
	*  set variable hd16CurrDesc
	*  Corresponding COBOL Variable is HD1-6-CURR-DESC
	*  @param value
	**/
   public void setHd16CurrDesc(char[] value) {
      hd16CurrDesc = checkHd16CurrDescConstraints(value);
      serializeHd16CurrDesc(hd16CurrDesc);
   } 

     /**
	 * 	Update Hd16CurrDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd16CurrDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd16CurrDesc,hd16CurrDesc.length);
   	
   }
   
   public void setHd16CurrDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd16CurrDesc,hd16CurrDesc.length);
   	
   }
   
     /**
	 * 	Update Hd16CurrDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd16CurrDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16CurrDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd16CurrDesc with another Field
	 *	@param value
	 */
   public void setHd16CurrDesc(Field source) {
       replace(source,0,source.length(),beginHd16CurrDesc,HD_16_CURR_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd16CurrDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd16CurrDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd16CurrDesc,HD_16_CURR_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Hd16CurrDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd16CurrDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16CurrDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln6FieldLength() {
			return HD_PAGE_1_LN_6_LENGTH;
		}

}
  
