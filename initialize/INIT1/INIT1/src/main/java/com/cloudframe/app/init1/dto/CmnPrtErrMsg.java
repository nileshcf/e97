package com.cloudframe.app.init1.dto;

/**
*  The class CmnPrtErrMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnPrtErrMsg extends CmnPrtErrMsgSerialized { 
   

						private char[] cmnPrtErrHdrText = new char[26];
	
	/**
	* Constructor for CmnPrtErrMsg
	**/
    public CmnPrtErrMsg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPrtErrMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPrtErrMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCmnPrtErrHdrText(fillSpace(26));
    } 

	/**
	 *	Returns the value of cmnPrtErrHdrText
	 *	@return cmnPrtErrHdrText
	 */
   public char[] getCmnPrtErrHdrText() throws CFException{
     if (isCmnPrtErrHdrTextModified()) { 
        cmnPrtErrHdrText = refreshCmnPrtErrHdrText();
     }
   		return cmnPrtErrHdrText;
   }

  
	/**
	*  set variable cmnPrtErrHdrText
	*  Corresponding COBOL Variable is CMN-PRT-ERR-HDR-TEXT
	*  @param value
	**/
   public void setCmnPrtErrHdrText(char[] value) {
      cmnPrtErrHdrText = checkCmnPrtErrHdrTextConstraints(value);
      serializeCmnPrtErrHdrText(cmnPrtErrHdrText);
   } 

     /**
	 * 	Update CmnPrtErrHdrText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnPrtErrHdrText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnPrtErrHdrText,cmnPrtErrHdrText.length);
   	
   }
   
   public void setCmnPrtErrHdrText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnPrtErrHdrText,cmnPrtErrHdrText.length);
   	
   }
   
     /**
	 * 	Update CmnPrtErrHdrText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPrtErrHdrText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnPrtErrHdrText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnPrtErrHdrText with another Field
	 *	@param value
	 */
   public void setCmnPrtErrHdrText(Field source) {
       replace(source,0,source.length(),beginCmnPrtErrHdrText,CMN_PRT_ERR_HDR_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update CmnPrtErrHdrText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnPrtErrHdrText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnPrtErrHdrText,CMN_PRT_ERR_HDR_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update CmnPrtErrHdrText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPrtErrHdrText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnPrtErrHdrText+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnPrtErrMsgFieldLength() {
			return CMN_PRT_ERR_MSG_LENGTH;
		}

}
  
