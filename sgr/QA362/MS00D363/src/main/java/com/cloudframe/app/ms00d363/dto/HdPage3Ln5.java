package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage3Ln5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage3Ln5 extends HdPage3Ln5Serialized {
   

						private char[] hd35Cc = new char[1];

						private char[] hd3VatMsg = new char[17];

	
	/**
	* Constructor for HdPage3Ln5
	**/
    public HdPage3Ln5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd35Cc(fillSpace(1));
								setHd3VatMsg(("DAILY VAT RECAP  ").toCharArray());
       replaceValue( // serialize and save the value
             pad(115," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 18
             ,115
             );
    }


 

	/**
	 *	Returns the value of hd35Cc
	 *	@return hd35Cc
	 */
   public char[] getHd35Cc() throws CFException{
     if (isHd35CcModified()) { 
        hd35Cc = refreshHd35Cc();
     }
   		return hd35Cc;
   }

  
	/**
	*  set variable hd35Cc
	*  Corresponding COBOL Variable is HD3-5-CC
	*  @param value
	**/
   public void setHd35Cc(char[] value) {
      hd35Cc = checkHd35CcConstraints(value);
      serializeHd35Cc(hd35Cc);
   } 

     /**
	 * 	Update Hd35Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd35Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd35Cc,hd35Cc.length);
   	
   }
   
   public void setHd35Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd35Cc,hd35Cc.length);
   	
   }
   
     /**
	 * 	Update Hd35Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd35Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd35Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd35Cc with another Field
	 *	@param value
	 */
   public void setHd35Cc(Field source) {
       replace(source,0,source.length(),beginHd35Cc,HD_35_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd35Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd35Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd35Cc,HD_35_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd35Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd35Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd35Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd3VatMsg
	 *	@return hd3VatMsg
	 */
   public char[] getHd3VatMsg() throws CFException{
     if (isHd3VatMsgModified()) { 
        hd3VatMsg = refreshHd3VatMsg();
     }
   		return hd3VatMsg;
   }

  
	/**
	*  set variable hd3VatMsg
	*  Corresponding COBOL Variable is HD3-VAT-MSG
	*  @param value
	**/
   public void setHd3VatMsg(char[] value) {
      hd3VatMsg = checkHd3VatMsgConstraints(value);
      serializeHd3VatMsg(hd3VatMsg);
   } 

     /**
	 * 	Update Hd3VatMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd3VatMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd3VatMsg,hd3VatMsg.length);
   	
   }
   
   public void setHd3VatMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd3VatMsg,hd3VatMsg.length);
   	
   }
   
     /**
	 * 	Update Hd3VatMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd3VatMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd3VatMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd3VatMsg with another Field
	 *	@param value
	 */
   public void setHd3VatMsg(Field source) {
       replace(source,0,source.length(),beginHd3VatMsg,HD_3_VAT_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update Hd3VatMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd3VatMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd3VatMsg,HD_3_VAT_MSG_LEN);
   	
   }
   
     /**
	 * 	Update Hd3VatMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd3VatMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd3VatMsg+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage3Ln5FieldLength() {
			return HD_PAGE_3_LN_5_LENGTH;
		}

}
  
