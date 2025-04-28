package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln3a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln3a extends HdPage1Ln3aSerialized {
   

						private char[] hd13aCc = new char[1];





	
	/**
	* Constructor for HdPage1Ln3a
	**/
    public HdPage1Ln3a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd13aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(53)
             , getStartOffset() + 1
             ,53
             );
       replaceValue( // serialize and save the value
             ("SAM ADVISEMENT RECONCILIATION ").toCharArray()
             , getStartOffset() + 54
             ,30
             );
       replaceValue( // serialize and save the value
             fillSpace(37)
             , getStartOffset() + 84
             ,37
             );
       replaceValue( // serialize and save the value
             ("PAGE:").toCharArray()
             , getStartOffset() + 121
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 131
             ,1
             );
    }


 

	/**
	 *	Returns the value of hd13aCc
	 *	@return hd13aCc
	 */
   public char[] getHd13aCc() throws CFException{
     if (isHd13aCcModified()) { 
        hd13aCc = refreshHd13aCc();
     }
   		return hd13aCc;
   }

  
	/**
	*  set variable hd13aCc
	*  Corresponding COBOL Variable is HD1-3A-CC
	*  @param value
	**/
   public void setHd13aCc(char[] value) {
      hd13aCc = checkHd13aCcConstraints(value);
      serializeHd13aCc(hd13aCc);
   } 

     /**
	 * 	Update Hd13aCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd13aCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd13aCc,hd13aCc.length);
   	
   }
   
   public void setHd13aCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd13aCc,hd13aCc.length);
   	
   }
   
     /**
	 * 	Update Hd13aCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd13aCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13aCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd13aCc with another Field
	 *	@param value
	 */
   public void setHd13aCc(Field source) {
       replace(source,0,source.length(),beginHd13aCc,HD_13A_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd13aCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd13aCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd13aCc,HD_13A_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd13aCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd13aCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13aCc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln3aFieldLength() {
			return HD_PAGE_1_LN_3A_LENGTH;
		}

}
  
