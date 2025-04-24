package com.cloudframe.app.global.sharedvar;

/**
*  The class McIpmMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class McIpmMsg extends McIpmMsgSerialized { 
   

						private char[] mcIpmMsgTxt = Field.fillLowValue(16);
	
	/**
	* Constructor for McIpmMsg
	**/
    public McIpmMsg() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of mcIpmMsgTxt
	 *	@return mcIpmMsgTxt
	 */
   public char[] getMcIpmMsgTxt() throws CFException{
     if (isMcIpmMsgTxtModified()) { 
        mcIpmMsgTxt = refreshMcIpmMsgTxt();
     }
   		return mcIpmMsgTxt;
   }

  
	/**
	*  set variable mcIpmMsgTxt
	*  Corresponding COBOL Variable is MC-IPM-MSG-TXT
	*  @param value
	**/
   public void setMcIpmMsgTxt(char[] value) {
      mcIpmMsgTxt = checkMcIpmMsgTxtConstraints(value);
      serializeMcIpmMsgTxt(mcIpmMsgTxt);
   } 

     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcIpmMsgTxt,mcIpmMsgTxt.length);
   	
   }
   
   public void setMcIpmMsgTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcIpmMsgTxt,mcIpmMsgTxt.length);
   	
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcIpmMsgTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McIpmMsgTxt with another Field
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source) {
       replace(source,0,source.length(),beginMcIpmMsgTxt,MC_IPM_MSG_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcIpmMsgTxt,MC_IPM_MSG_TXT_LEN);
   	
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcIpmMsgTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes McIpmMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMcIpmMsgTxt(CONSTANTS.SPACE_16);
   }

		public static int getMcIpmMsgFieldLength() {
			return MC_IPM_MSG_LENGTH;
		}

}
  
