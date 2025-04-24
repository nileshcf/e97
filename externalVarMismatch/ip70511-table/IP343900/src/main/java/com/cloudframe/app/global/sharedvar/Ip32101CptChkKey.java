package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101CptChkKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip32101CptChkKey extends Ip32101CptChkKeySerialized { 
   

						private char[] ip32101CptGftDasetNam = Field.fillLowValue(44);

								private long ip32101CptFileSeqNum;

						private char[] ip32101CptIndCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip32101CptChkKey
	**/
    public Ip32101CptChkKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip32101CptChkKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101CptChkKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip32101CptGftDasetNam
	 *	@return ip32101CptGftDasetNam
	 */
   public char[] getIp32101CptGftDasetNam() throws CFException{
     if (isIp32101CptGftDasetNamModified()) { 
        ip32101CptGftDasetNam = refreshIp32101CptGftDasetNam();
     }
   		return ip32101CptGftDasetNam;
   }

  
	/**
	*  set variable ip32101CptGftDasetNam
	*  Corresponding COBOL Variable is IP32101-CPT-GFT-DASET-NAM
	*  @param value
	**/
   public void setIp32101CptGftDasetNam(char[] value) {
      ip32101CptGftDasetNam = checkIp32101CptGftDasetNamConstraints(value);
      serializeIp32101CptGftDasetNam(ip32101CptGftDasetNam);
   } 

     /**
	 * 	Update Ip32101CptGftDasetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101CptGftDasetNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101CptGftDasetNam,ip32101CptGftDasetNam.length);
   	
   }
   
   public void setIp32101CptGftDasetNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CptGftDasetNam,ip32101CptGftDasetNam.length);
   	
   }
   
     /**
	 * 	Update Ip32101CptGftDasetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CptGftDasetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CptGftDasetNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101CptGftDasetNam with another Field
	 *	@param value
	 */
   public void setIp32101CptGftDasetNam(Field source) {
       replace(source,0,source.length(),beginIp32101CptGftDasetNam,IP_32101_CPT_GFT_DASET_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101CptGftDasetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101CptGftDasetNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101CptGftDasetNam,IP_32101_CPT_GFT_DASET_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101CptGftDasetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CptGftDasetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CptGftDasetNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip32101CptFileSeqNum
	 *	@return ip32101CptFileSeqNum
	 */
	public long getIp32101CptFileSeqNum() throws CFException {
       if (isIp32101CptFileSeqNumModified()) { 
           ip32101CptFileSeqNum = refreshIp32101CptFileSeqNum();
        }
   		return ip32101CptFileSeqNum;
	}
	

	
	   
	/**
	 * 	Update Ip32101CptFileSeqNum with the passed value
	 *  Corresponding COBOL Variable is IP32101-CPT-FILE-SEQ-NUM
	 *	@param number
	 */
	public void setIp32101CptFileSeqNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101CptFileSeqNum = checkIp32101CptFileSeqNumMaxLimit(number); 
		serializeIp32101CptFileSeqNum(ip32101CptFileSeqNum);
	}
	

	/**
	 * 	Update Ip32101CptFileSeqNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101CptFileSeqNum(char[] value) throws CFException {
		 ip32101CptFileSeqNum = serializeIp32101CptFileSeqNum(value);
	}
	/**
	 * 	Update Ip32101CptFileSeqNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101CptFileSeqNumString(char[] value) throws CFException {
		 setIp32101CptFileSeqNum(value);
	}
	/**
	 *	Returns the value of ip32101CptIndCd
	 *	@return ip32101CptIndCd
	 */
   public char[] getIp32101CptIndCd() throws CFException{
     if (isIp32101CptIndCdModified()) { 
        ip32101CptIndCd = refreshIp32101CptIndCd();
     }
   		return ip32101CptIndCd;
   }

  
	/**
	*  set variable ip32101CptIndCd
	*  Corresponding COBOL Variable is IP32101-CPT-IND-CD
	*  @param value
	**/
   public void setIp32101CptIndCd(char[] value) {
      ip32101CptIndCd = checkIp32101CptIndCdConstraints(value);
      serializeIp32101CptIndCd(ip32101CptIndCd);
   } 

     /**
	 * 	Update Ip32101CptIndCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101CptIndCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101CptIndCd,ip32101CptIndCd.length);
   	
   }
   
   public void setIp32101CptIndCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CptIndCd,ip32101CptIndCd.length);
   	
   }
   
     /**
	 * 	Update Ip32101CptIndCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CptIndCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CptIndCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101CptIndCd with another Field
	 *	@param value
	 */
   public void setIp32101CptIndCd(Field source) {
       replace(source,0,source.length(),beginIp32101CptIndCd,IP_32101_CPT_IND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101CptIndCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101CptIndCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101CptIndCd,IP_32101_CPT_IND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101CptIndCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CptIndCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CptIndCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip32101CptChkKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp32101CptGftDasetNam(CONSTANTS.SPACE_44);
                     setIp32101CptFileSeqNum(0);
         setIp32101CptIndCd(CONSTANTS.SPACE);
   }

		public static int getIp32101CptChkKeyFieldLength() {
			return IP_32101_CPT_CHK_KEY_LENGTH;
		}

}
  
