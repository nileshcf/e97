package com.cloudframe.app.ip989010.dto;

/**
*  The class ParmData1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ParmData1000 extends ParmData1000Serialized { 
   

						private char[] displayMsgTblsSw1000 = Field.fillLowValue(1);

						private char[] writeXmlSw1000 = Field.fillLowValue(1);

						private char[] writePsipmSw1000 = Field.fillLowValue(1);

						private char[] writeIpmSw1000 = Field.fillLowValue(1);

	
	/**
	* Constructor for ParmData1000
	**/
    public ParmData1000() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ParmData1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ParmData1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of displayMsgTblsSw1000
	 *	@return displayMsgTblsSw1000
	 */
   public char[] getDisplayMsgTblsSw1000() throws CFException{
     if (isDisplayMsgTblsSw1000Modified()) { 
        displayMsgTblsSw1000 = refreshDisplayMsgTblsSw1000();
     }
   		return displayMsgTblsSw1000;
   }

  
	/**
	*  set variable displayMsgTblsSw1000
	*  Corresponding COBOL Variable is 1000-DISPLAY-MSG-TBLS-SW
	*  @param value
	**/
   public void setDisplayMsgTblsSw1000(char[] value) {
      displayMsgTblsSw1000 = checkDisplayMsgTblsSw1000Constraints(value);
      serializeDisplayMsgTblsSw1000(displayMsgTblsSw1000);
   } 

     /**
	 * 	Update DisplayMsgTblsSw1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayMsgTblsSw1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDisplayMsgTblsSw1000,displayMsgTblsSw1000.length);
   	
   }
   
   public void setDisplayMsgTblsSw1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayMsgTblsSw1000,displayMsgTblsSw1000.length);
   	
   }
   
     /**
	 * 	Update DisplayMsgTblsSw1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayMsgTblsSw1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayMsgTblsSw1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DisplayMsgTblsSw1000 with another Field
	 *	@param value
	 */
   public void setDisplayMsgTblsSw1000(Field source) {
       replace(source,0,source.length(),beginDisplayMsgTblsSw1000,DISPLAY_MSG_TBLS_SW_1000_LEN);
   	
   }  
   
     /**
	 * 	Update DisplayMsgTblsSw1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayMsgTblsSw1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDisplayMsgTblsSw1000,DISPLAY_MSG_TBLS_SW_1000_LEN);
   	
   }
   
     /**
	 * 	Update DisplayMsgTblsSw1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayMsgTblsSw1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayMsgTblsSw1000+targetIndex,targetLen);
    
   }
	char[] displayMsgTbls100088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDisplayMsgTbls1000()
	 *	@return  Returns true if isDisplayMsgTbls1000() is "Y"
	 */
   public boolean isDisplayMsgTbls1000() throws CFException {
      return (  compareChars( getDisplayMsgTblsSw1000() , displayMsgTbls100088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDisplayMsgTbls1000True() {  			
    	setDisplayMsgTblsSw1000( displayMsgTbls100088Value);
   	}
	char[] parm1Valid100088Value1 = "Y".toCharArray();
char[] parm1Valid100088Value2 = "N".toCharArray();

	/**
	 *	Test condition "Y" "N" for isParm1Valid1000()
	 *	@return  Returns true if isParm1Valid1000() is "Y" "N"
	 */
   public boolean isParm1Valid1000() throws CFException {
      return (  compareChars( getDisplayMsgTblsSw1000() , parm1Valid100088Value1)  == 0  ||  compareChars( getDisplayMsgTblsSw1000() , parm1Valid100088Value2)  == 0  );
   }


	/**
	*  set values "Y" "N"
	*/
   	public void setParm1Valid1000True() {  			
    	setDisplayMsgTblsSw1000( parm1Valid100088Value1);
   	}
	/**
	 *	Returns the value of writeXmlSw1000
	 *	@return writeXmlSw1000
	 */
   public char[] getWriteXmlSw1000() throws CFException{
     if (isWriteXmlSw1000Modified()) { 
        writeXmlSw1000 = refreshWriteXmlSw1000();
     }
   		return writeXmlSw1000;
   }

  
	/**
	*  set variable writeXmlSw1000
	*  Corresponding COBOL Variable is 1000-WRITE-XML-SW
	*  @param value
	**/
   public void setWriteXmlSw1000(char[] value) {
      writeXmlSw1000 = checkWriteXmlSw1000Constraints(value);
      serializeWriteXmlSw1000(writeXmlSw1000);
   } 

     /**
	 * 	Update WriteXmlSw1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWriteXmlSw1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWriteXmlSw1000,writeXmlSw1000.length);
   	
   }
   
   public void setWriteXmlSw1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWriteXmlSw1000,writeXmlSw1000.length);
   	
   }
   
     /**
	 * 	Update WriteXmlSw1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWriteXmlSw1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWriteXmlSw1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WriteXmlSw1000 with another Field
	 *	@param value
	 */
   public void setWriteXmlSw1000(Field source) {
       replace(source,0,source.length(),beginWriteXmlSw1000,WRITE_XML_SW_1000_LEN);
   	
   }  
   
     /**
	 * 	Update WriteXmlSw1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWriteXmlSw1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWriteXmlSw1000,WRITE_XML_SW_1000_LEN);
   	
   }
   
     /**
	 * 	Update WriteXmlSw1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWriteXmlSw1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWriteXmlSw1000+targetIndex,targetLen);
    
   }
	char[] writeXmlMsgs100088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isWriteXmlMsgs1000()
	 *	@return  Returns true if isWriteXmlMsgs1000() is "Y"
	 */
   public boolean isWriteXmlMsgs1000() throws CFException {
      return (  compareChars( getWriteXmlSw1000() , writeXmlMsgs100088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setWriteXmlMsgs1000True() {  			
    	setWriteXmlSw1000( writeXmlMsgs100088Value);
   	}
	char[] parm2Valid100088Value1 = "Y".toCharArray();
char[] parm2Valid100088Value2 = "N".toCharArray();

	/**
	 *	Test condition "Y" "N" for isParm2Valid1000()
	 *	@return  Returns true if isParm2Valid1000() is "Y" "N"
	 */
   public boolean isParm2Valid1000() throws CFException {
      return (  compareChars( getWriteXmlSw1000() , parm2Valid100088Value1)  == 0  ||  compareChars( getWriteXmlSw1000() , parm2Valid100088Value2)  == 0  );
   }


	/**
	*  set values "Y" "N"
	*/
   	public void setParm2Valid1000True() {  			
    	setWriteXmlSw1000( parm2Valid100088Value1);
   	}
	/**
	 *	Returns the value of writePsipmSw1000
	 *	@return writePsipmSw1000
	 */
   public char[] getWritePsipmSw1000() throws CFException{
     if (isWritePsipmSw1000Modified()) { 
        writePsipmSw1000 = refreshWritePsipmSw1000();
     }
   		return writePsipmSw1000;
   }

  
	/**
	*  set variable writePsipmSw1000
	*  Corresponding COBOL Variable is 1000-WRITE-PSIPM-SW
	*  @param value
	**/
   public void setWritePsipmSw1000(char[] value) {
      writePsipmSw1000 = checkWritePsipmSw1000Constraints(value);
      serializeWritePsipmSw1000(writePsipmSw1000);
   } 

     /**
	 * 	Update WritePsipmSw1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWritePsipmSw1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWritePsipmSw1000,writePsipmSw1000.length);
   	
   }
   
   public void setWritePsipmSw1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWritePsipmSw1000,writePsipmSw1000.length);
   	
   }
   
     /**
	 * 	Update WritePsipmSw1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWritePsipmSw1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWritePsipmSw1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WritePsipmSw1000 with another Field
	 *	@param value
	 */
   public void setWritePsipmSw1000(Field source) {
       replace(source,0,source.length(),beginWritePsipmSw1000,WRITE_PSIPM_SW_1000_LEN);
   	
   }  
   
     /**
	 * 	Update WritePsipmSw1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWritePsipmSw1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWritePsipmSw1000,WRITE_PSIPM_SW_1000_LEN);
   	
   }
   
     /**
	 * 	Update WritePsipmSw1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWritePsipmSw1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWritePsipmSw1000+targetIndex,targetLen);
    
   }
	char[] writePsipmMsgs100088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isWritePsipmMsgs1000()
	 *	@return  Returns true if isWritePsipmMsgs1000() is "Y"
	 */
   public boolean isWritePsipmMsgs1000() throws CFException {
      return (  compareChars( getWritePsipmSw1000() , writePsipmMsgs100088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setWritePsipmMsgs1000True() {  			
    	setWritePsipmSw1000( writePsipmMsgs100088Value);
   	}
	char[] parm3Valid100088Value1 = "Y".toCharArray();
char[] parm3Valid100088Value2 = "N".toCharArray();

	/**
	 *	Test condition "Y" "N" for isParm3Valid1000()
	 *	@return  Returns true if isParm3Valid1000() is "Y" "N"
	 */
   public boolean isParm3Valid1000() throws CFException {
      return (  compareChars( getWritePsipmSw1000() , parm3Valid100088Value1)  == 0  ||  compareChars( getWritePsipmSw1000() , parm3Valid100088Value2)  == 0  );
   }


	/**
	*  set values "Y" "N"
	*/
   	public void setParm3Valid1000True() {  			
    	setWritePsipmSw1000( parm3Valid100088Value1);
   	}
	/**
	 *	Returns the value of writeIpmSw1000
	 *	@return writeIpmSw1000
	 */
   public char[] getWriteIpmSw1000() throws CFException{
     if (isWriteIpmSw1000Modified()) { 
        writeIpmSw1000 = refreshWriteIpmSw1000();
     }
   		return writeIpmSw1000;
   }

  
	/**
	*  set variable writeIpmSw1000
	*  Corresponding COBOL Variable is 1000-WRITE-IPM-SW
	*  @param value
	**/
   public void setWriteIpmSw1000(char[] value) {
      writeIpmSw1000 = checkWriteIpmSw1000Constraints(value);
      serializeWriteIpmSw1000(writeIpmSw1000);
   } 

     /**
	 * 	Update WriteIpmSw1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWriteIpmSw1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWriteIpmSw1000,writeIpmSw1000.length);
   	
   }
   
   public void setWriteIpmSw1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWriteIpmSw1000,writeIpmSw1000.length);
   	
   }
   
     /**
	 * 	Update WriteIpmSw1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWriteIpmSw1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWriteIpmSw1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WriteIpmSw1000 with another Field
	 *	@param value
	 */
   public void setWriteIpmSw1000(Field source) {
       replace(source,0,source.length(),beginWriteIpmSw1000,WRITE_IPM_SW_1000_LEN);
   	
   }  
   
     /**
	 * 	Update WriteIpmSw1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWriteIpmSw1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWriteIpmSw1000,WRITE_IPM_SW_1000_LEN);
   	
   }
   
     /**
	 * 	Update WriteIpmSw1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWriteIpmSw1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWriteIpmSw1000+targetIndex,targetLen);
    
   }
	char[] writeIpmMsgs100088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isWriteIpmMsgs1000()
	 *	@return  Returns true if isWriteIpmMsgs1000() is "Y"
	 */
   public boolean isWriteIpmMsgs1000() throws CFException {
      return (  compareChars( getWriteIpmSw1000() , writeIpmMsgs100088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setWriteIpmMsgs1000True() {  			
    	setWriteIpmSw1000( writeIpmMsgs100088Value);
   	}
	char[] parm4Valid100088Value1 = "Y".toCharArray();
char[] parm4Valid100088Value2 = "N".toCharArray();

	/**
	 *	Test condition "Y" "N" for isParm4Valid1000()
	 *	@return  Returns true if isParm4Valid1000() is "Y" "N"
	 */
   public boolean isParm4Valid1000() throws CFException {
      return (  compareChars( getWriteIpmSw1000() , parm4Valid100088Value1)  == 0  ||  compareChars( getWriteIpmSw1000() , parm4Valid100088Value2)  == 0  );
   }


	/**
	*  set values "Y" "N"
	*/
   	public void setParm4Valid1000True() {  			
    	setWriteIpmSw1000( parm4Valid100088Value1);
   	}

	
	
	

		public static int getParmData1000FieldLength() {
			return PARM_DATA_1000_LENGTH;
		}

}
  
