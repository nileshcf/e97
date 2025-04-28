package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln6a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln6a extends HdPage1Ln6aSerialized {
   

						private char[] hd16aCc = new char[1];




						private char[] hd16aSsc = new char[3];


	
	/**
	* Constructor for HdPage1Ln6a
	**/
    public HdPage1Ln6a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd16aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("SETTLEMENT SERVICE :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd16aSsc(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 26
             ,40
             );
       replaceValue( // serialize and save the value
             pad(67," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 66
             ,67
             );
    }


 

	/**
	 *	Returns the value of hd16aCc
	 *	@return hd16aCc
	 */
   public char[] getHd16aCc() throws CFException{
     if (isHd16aCcModified()) { 
        hd16aCc = refreshHd16aCc();
     }
   		return hd16aCc;
   }

  
	/**
	*  set variable hd16aCc
	*  Corresponding COBOL Variable is HD1-6A-CC
	*  @param value
	**/
   public void setHd16aCc(char[] value) {
      hd16aCc = checkHd16aCcConstraints(value);
      serializeHd16aCc(hd16aCc);
   } 

     /**
	 * 	Update Hd16aCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd16aCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd16aCc,hd16aCc.length);
   	
   }
   
   public void setHd16aCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd16aCc,hd16aCc.length);
   	
   }
   
     /**
	 * 	Update Hd16aCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd16aCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16aCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd16aCc with another Field
	 *	@param value
	 */
   public void setHd16aCc(Field source) {
       replace(source,0,source.length(),beginHd16aCc,HD_16A_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd16aCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd16aCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd16aCc,HD_16A_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd16aCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd16aCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16aCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd16aSsc
	 *	@return hd16aSsc
	 */
   public char[] getHd16aSsc() throws CFException{
     if (isHd16aSscModified()) { 
        hd16aSsc = refreshHd16aSsc();
     }
   		return hd16aSsc;
   }

  
	/**
	*  set variable hd16aSsc
	*  Corresponding COBOL Variable is HD1-6A-SSC
	*  @param value
	**/
   public void setHd16aSsc(char[] value) {
      hd16aSsc = checkHd16aSscConstraints(value);
      serializeHd16aSsc(hd16aSsc);
   } 

     /**
	 * 	Update Hd16aSsc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd16aSsc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd16aSsc,hd16aSsc.length);
   	
   }
   
   public void setHd16aSsc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd16aSsc,hd16aSsc.length);
   	
   }
   
     /**
	 * 	Update Hd16aSsc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd16aSsc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16aSsc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd16aSsc with another Field
	 *	@param value
	 */
   public void setHd16aSsc(Field source) {
       replace(source,0,source.length(),beginHd16aSsc,HD_16A_SSC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd16aSsc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd16aSsc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd16aSsc,HD_16A_SSC_LEN);
   	
   }
   
     /**
	 * 	Update Hd16aSsc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd16aSsc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16aSsc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln6aFieldLength() {
			return HD_PAGE_1_LN_6A_LENGTH;
		}

}
  
