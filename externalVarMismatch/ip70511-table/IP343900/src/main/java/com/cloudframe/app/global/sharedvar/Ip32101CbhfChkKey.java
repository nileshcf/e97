package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101CbhfChkKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip32101CbhfChkKey extends Ip32101CbhfChkKeySerialized { 
   

						private char[] ip32101CbhfGftDasetNam = Field.fillLowValue(44);

								private long ip32101CbhfFileSeqNum;

						private char[] ip32101CbhfIndCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip32101CbhfChkKey
	**/
    public Ip32101CbhfChkKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip32101CbhfChkKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101CbhfChkKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip32101CbhfGftDasetNam
	 *	@return ip32101CbhfGftDasetNam
	 */
   public char[] getIp32101CbhfGftDasetNam() throws CFException{
     if (isIp32101CbhfGftDasetNamModified()) { 
        ip32101CbhfGftDasetNam = refreshIp32101CbhfGftDasetNam();
     }
   		return ip32101CbhfGftDasetNam;
   }

  
	/**
	*  set variable ip32101CbhfGftDasetNam
	*  Corresponding COBOL Variable is IP32101-CBHF-GFT-DASET-NAM
	*  @param value
	**/
   public void setIp32101CbhfGftDasetNam(char[] value) {
      ip32101CbhfGftDasetNam = checkIp32101CbhfGftDasetNamConstraints(value);
      serializeIp32101CbhfGftDasetNam(ip32101CbhfGftDasetNam);
   } 

     /**
	 * 	Update Ip32101CbhfGftDasetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101CbhfGftDasetNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101CbhfGftDasetNam,ip32101CbhfGftDasetNam.length);
   	
   }
   
   public void setIp32101CbhfGftDasetNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfGftDasetNam,ip32101CbhfGftDasetNam.length);
   	
   }
   
     /**
	 * 	Update Ip32101CbhfGftDasetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfGftDasetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfGftDasetNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101CbhfGftDasetNam with another Field
	 *	@param value
	 */
   public void setIp32101CbhfGftDasetNam(Field source) {
       replace(source,0,source.length(),beginIp32101CbhfGftDasetNam,IP_32101_CBHF_GFT_DASET_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101CbhfGftDasetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101CbhfGftDasetNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101CbhfGftDasetNam,IP_32101_CBHF_GFT_DASET_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101CbhfGftDasetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfGftDasetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfGftDasetNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip32101CbhfFileSeqNum
	 *	@return ip32101CbhfFileSeqNum
	 */
	public long getIp32101CbhfFileSeqNum() throws CFException {
       if (isIp32101CbhfFileSeqNumModified()) { 
           ip32101CbhfFileSeqNum = refreshIp32101CbhfFileSeqNum();
        }
   		return ip32101CbhfFileSeqNum;
	}
	

	
	   
	/**
	 * 	Update Ip32101CbhfFileSeqNum with the passed value
	 *  Corresponding COBOL Variable is IP32101-CBHF-FILE-SEQ-NUM
	 *	@param number
	 */
	public void setIp32101CbhfFileSeqNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101CbhfFileSeqNum = checkIp32101CbhfFileSeqNumMaxLimit(number); 
		serializeIp32101CbhfFileSeqNum(ip32101CbhfFileSeqNum);
	}
	

	/**
	 * 	Update Ip32101CbhfFileSeqNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101CbhfFileSeqNum(char[] value) throws CFException {
		 ip32101CbhfFileSeqNum = serializeIp32101CbhfFileSeqNum(value);
	}
	/**
	 * 	Update Ip32101CbhfFileSeqNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101CbhfFileSeqNumString(char[] value) throws CFException {
		 setIp32101CbhfFileSeqNum(value);
	}
	/**
	 *	Returns the value of ip32101CbhfIndCd
	 *	@return ip32101CbhfIndCd
	 */
   public char[] getIp32101CbhfIndCd() throws CFException{
     if (isIp32101CbhfIndCdModified()) { 
        ip32101CbhfIndCd = refreshIp32101CbhfIndCd();
     }
   		return ip32101CbhfIndCd;
   }

  
	/**
	*  set variable ip32101CbhfIndCd
	*  Corresponding COBOL Variable is IP32101-CBHF-IND-CD
	*  @param value
	**/
   public void setIp32101CbhfIndCd(char[] value) {
      ip32101CbhfIndCd = checkIp32101CbhfIndCdConstraints(value);
      serializeIp32101CbhfIndCd(ip32101CbhfIndCd);
   } 

     /**
	 * 	Update Ip32101CbhfIndCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101CbhfIndCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101CbhfIndCd,ip32101CbhfIndCd.length);
   	
   }
   
   public void setIp32101CbhfIndCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfIndCd,ip32101CbhfIndCd.length);
   	
   }
   
     /**
	 * 	Update Ip32101CbhfIndCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfIndCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfIndCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101CbhfIndCd with another Field
	 *	@param value
	 */
   public void setIp32101CbhfIndCd(Field source) {
       replace(source,0,source.length(),beginIp32101CbhfIndCd,IP_32101_CBHF_IND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101CbhfIndCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101CbhfIndCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101CbhfIndCd,IP_32101_CBHF_IND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101CbhfIndCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfIndCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfIndCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip32101CbhfChkKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp32101CbhfGftDasetNam(CONSTANTS.SPACE_44);
                     setIp32101CbhfFileSeqNum(0);
         setIp32101CbhfIndCd(CONSTANTS.SPACE);
   }

		public static int getIp32101CbhfChkKeyFieldLength() {
			return IP_32101_CBHF_CHK_KEY_LENGTH;
		}

}
  
