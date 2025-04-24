package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln4a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln4a extends HdPage1Ln4aSerialized { 
   

						private char[] hd14aCc = new char[1];




						private char[] hd15ProcDesc = new char[25];

	
	/**
	* Constructor for HdPage1Ln4a
	**/
    public HdPage1Ln4a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd14aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("PROCESSOR          :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd15ProcDesc(fillSpace(25));
       replaceValue( // serialize and save the value
             pad(85," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 48
             ,85
             );
    }


 

	/**
	 *	Returns the value of hd14aCc
	 *	@return hd14aCc
	 */
   public char[] getHd14aCc() throws CFException{
     if (isHd14aCcModified()) { 
        hd14aCc = refreshHd14aCc();
     }
   		return hd14aCc;
   }

  
	/**
	*  set variable hd14aCc
	*  Corresponding COBOL Variable is HD1-4A-CC
	*  @param value
	**/
   public void setHd14aCc(char[] value) {
      hd14aCc = checkHd14aCcConstraints(value);
      serializeHd14aCc(hd14aCc);
   } 

     /**
	 * 	Update Hd14aCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd14aCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd14aCc,hd14aCc.length);
   	
   }
   
   public void setHd14aCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd14aCc,hd14aCc.length);
   	
   }
   
     /**
	 * 	Update Hd14aCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd14aCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14aCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd14aCc with another Field
	 *	@param value
	 */
   public void setHd14aCc(Field source) {
       replace(source,0,source.length(),beginHd14aCc,HD_14A_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd14aCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd14aCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd14aCc,HD_14A_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd14aCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd14aCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14aCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd15ProcDesc
	 *	@return hd15ProcDesc
	 */
   public char[] getHd15ProcDesc() throws CFException{
     if (isHd15ProcDescModified()) { 
        hd15ProcDesc = refreshHd15ProcDesc();
     }
   		return hd15ProcDesc;
   }

  
	/**
	*  set variable hd15ProcDesc
	*  Corresponding COBOL Variable is HD1-5-PROC-DESC
	*  @param value
	**/
   public void setHd15ProcDesc(char[] value) {
      hd15ProcDesc = checkHd15ProcDescConstraints(value);
      serializeHd15ProcDesc(hd15ProcDesc);
   } 

     /**
	 * 	Update Hd15ProcDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd15ProcDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd15ProcDesc,hd15ProcDesc.length);
   	
   }
   
   public void setHd15ProcDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd15ProcDesc,hd15ProcDesc.length);
   	
   }
   
     /**
	 * 	Update Hd15ProcDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd15ProcDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd15ProcDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd15ProcDesc with another Field
	 *	@param value
	 */
   public void setHd15ProcDesc(Field source) {
       replace(source,0,source.length(),beginHd15ProcDesc,HD_15_PROC_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd15ProcDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd15ProcDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd15ProcDesc,HD_15_PROC_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Hd15ProcDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd15ProcDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd15ProcDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln4aFieldLength() {
			return HD_PAGE_1_LN_4A_LENGTH;
		}

}
  
