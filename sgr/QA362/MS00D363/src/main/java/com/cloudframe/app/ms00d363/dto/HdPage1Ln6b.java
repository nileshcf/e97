package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln6b is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln6b extends HdPage1Ln6bSerialized {
   

						private char[] hd16bCc = new char[1];




						private char[] hd16bIsis = new char[4];


	
	/**
	* Constructor for HdPage1Ln6b
	**/
    public HdPage1Ln6b() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd16bCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("ISIS AGREEMENT NBR :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd16bIsis(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 27
             ,40
             );
       replaceValue( // serialize and save the value
             pad(66," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 67
             ,66
             );
    }


 

	/**
	 *	Returns the value of hd16bCc
	 *	@return hd16bCc
	 */
   public char[] getHd16bCc() throws CFException{
     if (isHd16bCcModified()) { 
        hd16bCc = refreshHd16bCc();
     }
   		return hd16bCc;
   }

  
	/**
	*  set variable hd16bCc
	*  Corresponding COBOL Variable is HD1-6B-CC
	*  @param value
	**/
   public void setHd16bCc(char[] value) {
      hd16bCc = checkHd16bCcConstraints(value);
      serializeHd16bCc(hd16bCc);
   } 

     /**
	 * 	Update Hd16bCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd16bCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd16bCc,hd16bCc.length);
   	
   }
   
   public void setHd16bCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd16bCc,hd16bCc.length);
   	
   }
   
     /**
	 * 	Update Hd16bCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd16bCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16bCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd16bCc with another Field
	 *	@param value
	 */
   public void setHd16bCc(Field source) {
       replace(source,0,source.length(),beginHd16bCc,HD_16B_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd16bCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd16bCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd16bCc,HD_16B_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd16bCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd16bCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16bCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd16bIsis
	 *	@return hd16bIsis
	 */
   public char[] getHd16bIsis() throws CFException{
     if (isHd16bIsisModified()) { 
        hd16bIsis = refreshHd16bIsis();
     }
   		return hd16bIsis;
   }

  
	/**
	*  set variable hd16bIsis
	*  Corresponding COBOL Variable is HD1-6B-ISIS
	*  @param value
	**/
   public void setHd16bIsis(char[] value) {
      hd16bIsis = checkHd16bIsisConstraints(value);
      serializeHd16bIsis(hd16bIsis);
   } 

     /**
	 * 	Update Hd16bIsis 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd16bIsis(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd16bIsis,hd16bIsis.length);
   	
   }
   
   public void setHd16bIsis(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd16bIsis,hd16bIsis.length);
   	
   }
   
     /**
	 * 	Update Hd16bIsis 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd16bIsis(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16bIsis+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd16bIsis with another Field
	 *	@param value
	 */
   public void setHd16bIsis(Field source) {
       replace(source,0,source.length(),beginHd16bIsis,HD_16B_ISIS_LEN);
   	
   }  
   
     /**
	 * 	Update Hd16bIsis 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd16bIsis(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd16bIsis,HD_16B_ISIS_LEN);
   	
   }
   
     /**
	 * 	Update Hd16bIsis 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd16bIsis(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16bIsis+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln6bFieldLength() {
			return HD_PAGE_1_LN_6B_LENGTH;
		}

}
  
