package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70711TipamrsKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip70711TipamrsKey extends Ip70711TipamrsKeySerialized { 
   

						private char[] ip70711GftDasetNam = Field.fillLowValue(44);

								private int ip70711FileSeqNum;

						private char[] ip70711ServCd = Field.fillLowValue(4);

								private int ip70711TxnNum;
	
	/**
	* Constructor for Ip70711TipamrsKey
	**/
    public Ip70711TipamrsKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip70711TipamrsKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70711TipamrsKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip70711GftDasetNam
	 *	@return ip70711GftDasetNam
	 */
   public char[] getIp70711GftDasetNam() throws CFException{
     if (isIp70711GftDasetNamModified()) { 
        ip70711GftDasetNam = refreshIp70711GftDasetNam();
     }
   		return ip70711GftDasetNam;
   }

  
	/**
	*  set variable ip70711GftDasetNam
	*  Corresponding COBOL Variable is IP70711-GFT-DASET-NAM
	*  @param value
	**/
   public void setIp70711GftDasetNam(char[] value) {
      ip70711GftDasetNam = checkIp70711GftDasetNamConstraints(value);
      serializeIp70711GftDasetNam(ip70711GftDasetNam);
   } 

     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711GftDasetNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70711GftDasetNam,ip70711GftDasetNam.length);
   	
   }
   
   public void setIp70711GftDasetNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711GftDasetNam,ip70711GftDasetNam.length);
   	
   }
   
     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711GftDasetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711GftDasetNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70711GftDasetNam with another Field
	 *	@param value
	 */
   public void setIp70711GftDasetNam(Field source) {
       replace(source,0,source.length(),beginIp70711GftDasetNam,IP_70711_GFT_DASET_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711GftDasetNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70711GftDasetNam,IP_70711_GFT_DASET_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711GftDasetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711GftDasetNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70711FileSeqNum
	 *	@return ip70711FileSeqNum
	 */
	public int getIp70711FileSeqNum() throws CFException {
        if (isIp70711FileSeqNumModified()) { 
           ip70711FileSeqNum = refreshIp70711FileSeqNum();
        }
   		return ip70711FileSeqNum;
	}
	
	/**
	 * 	Update Ip70711FileSeqNum with the passed value
	 *  Corresponding COBOL Variable is IP70711-FILE-SEQ-NUM
	 *	@param number
	 */
	public void setIp70711FileSeqNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70711FileSeqNum = checkIp70711FileSeqNumMaxLimit(number); 
		serializeIp70711FileSeqNum(ip70711FileSeqNum);
	}


	public void setIp70711FileSeqNum(long number) {
	    number = checkIp70711FileSeqNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70711FileSeqNum((int)number);
	}
	
	/**
	 *	Returns the value of ip70711ServCd
	 *	@return ip70711ServCd
	 */
   public char[] getIp70711ServCd() throws CFException{
     if (isIp70711ServCdModified()) { 
        ip70711ServCd = refreshIp70711ServCd();
     }
   		return ip70711ServCd;
   }

  
	/**
	*  set variable ip70711ServCd
	*  Corresponding COBOL Variable is IP70711-SERV-CD
	*  @param value
	**/
   public void setIp70711ServCd(char[] value) {
      ip70711ServCd = checkIp70711ServCdConstraints(value);
      serializeIp70711ServCd(ip70711ServCd);
   } 

     /**
	 * 	Update Ip70711ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711ServCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70711ServCd,ip70711ServCd.length);
   	
   }
   
   public void setIp70711ServCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711ServCd,ip70711ServCd.length);
   	
   }
   
     /**
	 * 	Update Ip70711ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711ServCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70711ServCd with another Field
	 *	@param value
	 */
   public void setIp70711ServCd(Field source) {
       replace(source,0,source.length(),beginIp70711ServCd,IP_70711_SERV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70711ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711ServCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70711ServCd,IP_70711_SERV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70711ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711ServCd+targetIndex,targetLen);
    
   }
	public int getIp70711TxnNum() throws CFException {
        if (isIp70711TxnNumModified()) { 
           ip70711TxnNum = refreshIp70711TxnNum();
        }
   		return ip70711TxnNum;
	}
	
	/**
	 * 	Update Ip70711TxnNum with the passed value
	 *  Corresponding COBOL Variable is IP70711-TXN-NUM
	 *	@param number
	 */
	public void setIp70711TxnNum(int number) {
			ip70711TxnNum = checkIp70711TxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp70711TxnNum(ip70711TxnNum);
	}


	public void setIp70711TxnNum(long number) {
	    number = checkIp70711TxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70711TxnNum((int)number);
	}
	

	
	
	
	/**
	 * 	initializes Ip70711TipamrsKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70711GftDasetNam(CONSTANTS.SPACE_44);
                     setIp70711FileSeqNum(0);
         setIp70711ServCd(CONSTANTS.SPACE_4);
                     setIp70711TxnNum(0);
   }

		public static int getIp70711TipamrsKeyFieldLength() {
			return IP_70711_TIPAMRS_KEY_LENGTH;
		}

}
  
