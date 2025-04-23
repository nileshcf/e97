package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101RctChkKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip32101RctChkKey extends Ip32101RctChkKeySerialized { 
   

						private char[] ip32101RctGftDasetNam = Field.fillLowValue(44);

								private long ip32101RctSeqNum;
	
	/**
	* Constructor for Ip32101RctChkKey
	**/
    public Ip32101RctChkKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip32101RctChkKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101RctChkKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip32101RctGftDasetNam
	 *	@return ip32101RctGftDasetNam
	 */
   public char[] getIp32101RctGftDasetNam() throws CFException{
     if (isIp32101RctGftDasetNamModified()) { 
        ip32101RctGftDasetNam = refreshIp32101RctGftDasetNam();
     }
   		return ip32101RctGftDasetNam;
   }

  
	/**
	*  set variable ip32101RctGftDasetNam
	*  Corresponding COBOL Variable is IP32101-RCT-GFT-DASET-NAM
	*  @param value
	**/
   public void setIp32101RctGftDasetNam(char[] value) {
      ip32101RctGftDasetNam = checkIp32101RctGftDasetNamConstraints(value);
      serializeIp32101RctGftDasetNam(ip32101RctGftDasetNam);
   } 

     /**
	 * 	Update Ip32101RctGftDasetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101RctGftDasetNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101RctGftDasetNam,ip32101RctGftDasetNam.length);
   	
   }
   
   public void setIp32101RctGftDasetNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101RctGftDasetNam,ip32101RctGftDasetNam.length);
   	
   }
   
     /**
	 * 	Update Ip32101RctGftDasetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101RctGftDasetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101RctGftDasetNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101RctGftDasetNam with another Field
	 *	@param value
	 */
   public void setIp32101RctGftDasetNam(Field source) {
       replace(source,0,source.length(),beginIp32101RctGftDasetNam,IP_32101_RCT_GFT_DASET_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101RctGftDasetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101RctGftDasetNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101RctGftDasetNam,IP_32101_RCT_GFT_DASET_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101RctGftDasetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101RctGftDasetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101RctGftDasetNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip32101RctSeqNum
	 *	@return ip32101RctSeqNum
	 */
	public long getIp32101RctSeqNum() throws CFException {
       if (isIp32101RctSeqNumModified()) { 
           ip32101RctSeqNum = refreshIp32101RctSeqNum();
        }
   		return ip32101RctSeqNum;
	}
	

	
	   
	/**
	 * 	Update Ip32101RctSeqNum with the passed value
	 *  Corresponding COBOL Variable is IP32101-RCT-SEQ-NUM
	 *	@param number
	 */
	public void setIp32101RctSeqNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101RctSeqNum = checkIp32101RctSeqNumMaxLimit(number); 
		serializeIp32101RctSeqNum(ip32101RctSeqNum);
	}
	

	/**
	 * 	Update Ip32101RctSeqNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101RctSeqNum(char[] value) throws CFException {
		 ip32101RctSeqNum = serializeIp32101RctSeqNum(value);
	}
	/**
	 * 	Update Ip32101RctSeqNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101RctSeqNumString(char[] value) throws CFException {
		 setIp32101RctSeqNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip32101RctChkKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp32101RctGftDasetNam(CONSTANTS.SPACE_44);
                     setIp32101RctSeqNum(0);
   }

		public static int getIp32101RctChkKeyFieldLength() {
			return IP_32101_RCT_CHK_KEY_LENGTH;
		}

}
  
