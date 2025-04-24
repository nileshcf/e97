package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FileErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip40004FileErrorInfo extends Ip40004FileErrorInfoSerialized { 
   

						private char[] ip40004ErrorMsgSevCdFil = Field.fillLowValue(2);

								private int ip40004ErrorNumberFil;

								private int ip40004ErrorMsgNumberFil;

						private char[] ip40004IpmFieldTypeFil = Field.fillLowValue(1);

								private long ip40004IpmFieldNumberFil;

								private long ip40004IpmSubfldNumberFil;
	
	/**
	* Constructor for Ip40004FileErrorInfo
	**/
    public Ip40004FileErrorInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip40004FileErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip40004ErrorMsgSevCdFil
	 *	@return ip40004ErrorMsgSevCdFil
	 */
   public char[] getIp40004ErrorMsgSevCdFil() throws CFException{
     if (isIp40004ErrorMsgSevCdFilModified()) { 
        ip40004ErrorMsgSevCdFil = refreshIp40004ErrorMsgSevCdFil();
     }
   		return ip40004ErrorMsgSevCdFil;
   }

  
	/**
	*  set variable ip40004ErrorMsgSevCdFil
	*  Corresponding COBOL Variable is IP40004-ERROR-MSG-SEV-CD-FIL
	*  @param value
	**/
   public void setIp40004ErrorMsgSevCdFil(char[] value) {
      ip40004ErrorMsgSevCdFil = checkIp40004ErrorMsgSevCdFilConstraints(value);
      serializeIp40004ErrorMsgSevCdFil(ip40004ErrorMsgSevCdFil);
   } 

     /**
	 * 	Update Ip40004ErrorMsgSevCdFil 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004ErrorMsgSevCdFil(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004ErrorMsgSevCdFil,ip40004ErrorMsgSevCdFil.length);
   	
   }
   
   public void setIp40004ErrorMsgSevCdFil(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ErrorMsgSevCdFil,ip40004ErrorMsgSevCdFil.length);
   	
   }
   
     /**
	 * 	Update Ip40004ErrorMsgSevCdFil 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004ErrorMsgSevCdFil(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ErrorMsgSevCdFil+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004ErrorMsgSevCdFil with another Field
	 *	@param value
	 */
   public void setIp40004ErrorMsgSevCdFil(Field source) {
       replace(source,0,source.length(),beginIp40004ErrorMsgSevCdFil,IP_40004_ERROR_MSG_SEV_CD_FIL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004ErrorMsgSevCdFil 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004ErrorMsgSevCdFil(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004ErrorMsgSevCdFil,IP_40004_ERROR_MSG_SEV_CD_FIL_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004ErrorMsgSevCdFil 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004ErrorMsgSevCdFil(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ErrorMsgSevCdFil+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004ErrorNumberFil
	 *	@return ip40004ErrorNumberFil
	 */
	public int getIp40004ErrorNumberFil() throws CFException {
       if (isIp40004ErrorNumberFilModified()) { 
           ip40004ErrorNumberFil = refreshIp40004ErrorNumberFil();
        }
   		return ip40004ErrorNumberFil;
	}
	

	
	   
	/**
	 * 	Update Ip40004ErrorNumberFil with the passed value
	 *  Corresponding COBOL Variable is IP40004-ERROR-NUMBER-FIL
	 *	@param number
	 */
	public void setIp40004ErrorNumberFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004ErrorNumberFil = checkIp40004ErrorNumberFilMaxLimit(number); 
		serializeIp40004ErrorNumberFil(ip40004ErrorNumberFil);
	}
	

	public void setIp40004ErrorNumberFil(long number) {
	    number = checkIp40004ErrorNumberFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp40004ErrorNumberFil((int)number);
	}
	
	/**
	 * 	Update Ip40004ErrorNumberFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004ErrorNumberFil(char[] value) throws CFException {
		 ip40004ErrorNumberFil = serializeIp40004ErrorNumberFil(value);
	}
	/**
	 * 	Update Ip40004ErrorNumberFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004ErrorNumberFilString(char[] value) throws CFException {
		 setIp40004ErrorNumberFil(value);
	}
	/**
	 *	Returns the value of ip40004ErrorMsgNumberFil
	 *	@return ip40004ErrorMsgNumberFil
	 */
	public int getIp40004ErrorMsgNumberFil() throws CFException {
       if (isIp40004ErrorMsgNumberFilModified()) { 
           ip40004ErrorMsgNumberFil = refreshIp40004ErrorMsgNumberFil();
        }
   		return ip40004ErrorMsgNumberFil;
	}
	

	
	   
	/**
	 * 	Update Ip40004ErrorMsgNumberFil with the passed value
	 *  Corresponding COBOL Variable is IP40004-ERROR-MSG-NUMBER-FIL
	 *	@param number
	 */
	public void setIp40004ErrorMsgNumberFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004ErrorMsgNumberFil = checkIp40004ErrorMsgNumberFilMaxLimit(number); 
		serializeIp40004ErrorMsgNumberFil(ip40004ErrorMsgNumberFil);
	}
	

	public void setIp40004ErrorMsgNumberFil(long number) {
	    number = checkIp40004ErrorMsgNumberFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp40004ErrorMsgNumberFil((int)number);
	}
	
	/**
	 * 	Update Ip40004ErrorMsgNumberFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004ErrorMsgNumberFil(char[] value) throws CFException {
		 ip40004ErrorMsgNumberFil = serializeIp40004ErrorMsgNumberFil(value);
	}
	/**
	 * 	Update Ip40004ErrorMsgNumberFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004ErrorMsgNumberFilString(char[] value) throws CFException {
		 setIp40004ErrorMsgNumberFil(value);
	}
	/**
	 *	Returns the value of ip40004IpmFieldTypeFil
	 *	@return ip40004IpmFieldTypeFil
	 */
   public char[] getIp40004IpmFieldTypeFil() throws CFException{
     if (isIp40004IpmFieldTypeFilModified()) { 
        ip40004IpmFieldTypeFil = refreshIp40004IpmFieldTypeFil();
     }
   		return ip40004IpmFieldTypeFil;
   }

  
	/**
	*  set variable ip40004IpmFieldTypeFil
	*  Corresponding COBOL Variable is IP40004-IPM-FIELD-TYPE-FIL
	*  @param value
	**/
   public void setIp40004IpmFieldTypeFil(char[] value) {
      ip40004IpmFieldTypeFil = checkIp40004IpmFieldTypeFilConstraints(value);
      serializeIp40004IpmFieldTypeFil(ip40004IpmFieldTypeFil);
   } 

     /**
	 * 	Update Ip40004IpmFieldTypeFil 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004IpmFieldTypeFil(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004IpmFieldTypeFil,ip40004IpmFieldTypeFil.length);
   	
   }
   
   public void setIp40004IpmFieldTypeFil(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004IpmFieldTypeFil,ip40004IpmFieldTypeFil.length);
   	
   }
   
     /**
	 * 	Update Ip40004IpmFieldTypeFil 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004IpmFieldTypeFil(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004IpmFieldTypeFil+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004IpmFieldTypeFil with another Field
	 *	@param value
	 */
   public void setIp40004IpmFieldTypeFil(Field source) {
       replace(source,0,source.length(),beginIp40004IpmFieldTypeFil,IP_40004_IPM_FIELD_TYPE_FIL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004IpmFieldTypeFil 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004IpmFieldTypeFil(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004IpmFieldTypeFil,IP_40004_IPM_FIELD_TYPE_FIL_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004IpmFieldTypeFil 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004IpmFieldTypeFil(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004IpmFieldTypeFil+targetIndex,targetLen);
    
   }
	char[] ip40004MMtiFil8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp40004MMtiFil88()
	 *	@return  Returns true if isIp40004MMtiFil88() is "1"
	 */
   public boolean isIp40004MMtiFil88() throws CFException {
      return (  compareChars( getIp40004IpmFieldTypeFil() , ip40004MMtiFil8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp40004MMtiFil88True() {  			
    	setIp40004IpmFieldTypeFil( ip40004MMtiFil8888Value);
   	}
	char[] ip40004DDataElementFil8888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp40004DDataElementFil88()
	 *	@return  Returns true if isIp40004DDataElementFil88() is "2"
	 */
   public boolean isIp40004DDataElementFil88() throws CFException {
      return (  compareChars( getIp40004IpmFieldTypeFil() , ip40004DDataElementFil8888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp40004DDataElementFil88True() {  			
    	setIp40004IpmFieldTypeFil( ip40004DDataElementFil8888Value);
   	}
	char[] ip40004PPdsFil8888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp40004PPdsFil88()
	 *	@return  Returns true if isIp40004PPdsFil88() is "3"
	 */
   public boolean isIp40004PPdsFil88() throws CFException {
      return (  compareChars( getIp40004IpmFieldTypeFil() , ip40004PPdsFil8888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp40004PPdsFil88True() {  			
    	setIp40004IpmFieldTypeFil( ip40004PPdsFil8888Value);
   	}
	/**
	 *	Returns the value of ip40004IpmFieldNumberFil
	 *	@return ip40004IpmFieldNumberFil
	 */
	public long getIp40004IpmFieldNumberFil() throws CFException {
        if (isIp40004IpmFieldNumberFilModified()) { 
           ip40004IpmFieldNumberFil = refreshIp40004IpmFieldNumberFil();
        }
   		return ip40004IpmFieldNumberFil;
	}
	
	/**
	 * 	Update Ip40004IpmFieldNumberFil with the passed value
	 *  Corresponding COBOL Variable is IP40004-IPM-FIELD-NUMBER-FIL
	 *	@param number
	 */
	public void setIp40004IpmFieldNumberFil(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip40004IpmFieldNumberFil = checkIp40004IpmFieldNumberFilMaxLimit(number); 
		serializeIp40004IpmFieldNumberFil(ip40004IpmFieldNumberFil);
	}


	/**
	 *	Returns the value of ip40004IpmSubfldNumberFil
	 *	@return ip40004IpmSubfldNumberFil
	 */
	public long getIp40004IpmSubfldNumberFil() throws CFException {
        if (isIp40004IpmSubfldNumberFilModified()) { 
           ip40004IpmSubfldNumberFil = refreshIp40004IpmSubfldNumberFil();
        }
   		return ip40004IpmSubfldNumberFil;
	}
	
	/**
	 * 	Update Ip40004IpmSubfldNumberFil with the passed value
	 *  Corresponding COBOL Variable is IP40004-IPM-SUBFLD-NUMBER-FIL
	 *	@param number
	 */
	public void setIp40004IpmSubfldNumberFil(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip40004IpmSubfldNumberFil = checkIp40004IpmSubfldNumberFilMaxLimit(number); 
		serializeIp40004IpmSubfldNumberFil(ip40004IpmSubfldNumberFil);
	}



	
	
	
	/**
	 * 	initializes Ip40004FileErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004ErrorMsgSevCdFil(CONSTANTS.SPACE_2);
                     setIp40004ErrorNumberFil(0);
                     setIp40004ErrorMsgNumberFil(0);
         setIp40004IpmFieldTypeFil(CONSTANTS.SPACE);
                     setIp40004IpmFieldNumberFil(0);
                     setIp40004IpmSubfldNumberFil(0);
   }

		public static int getIp40004FileErrorInfoFieldLength() {
			return IP_40004_FILE_ERROR_INFO_LENGTH;
		}

}
  
