package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70701TipamrqKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip70701TipamrqKey extends Ip70701TipamrqKeySerialized { 
   

						private char[] ip70701GftDasetNam = Field.fillLowValue(44);

								private int ip70701FileSeqNum;

						private char[] ip70701ServCd = Field.fillLowValue(4);

								private int ip70701TxnNum;
	
	/**
	* Constructor for Ip70701TipamrqKey
	**/
    public Ip70701TipamrqKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip70701TipamrqKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70701TipamrqKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip70701GftDasetNam
	 *	@return ip70701GftDasetNam
	 */
   public char[] getIp70701GftDasetNam() throws CFException{
     if (isIp70701GftDasetNamModified()) { 
        ip70701GftDasetNam = refreshIp70701GftDasetNam();
     }
   		return ip70701GftDasetNam;
   }

  
	/**
	*  set variable ip70701GftDasetNam
	*  Corresponding COBOL Variable is IP70701-GFT-DASET-NAM
	*  @param value
	**/
   public void setIp70701GftDasetNam(char[] value) {
      ip70701GftDasetNam = checkIp70701GftDasetNamConstraints(value);
      serializeIp70701GftDasetNam(ip70701GftDasetNam);
   } 

     /**
	 * 	Update Ip70701GftDasetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70701GftDasetNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70701GftDasetNam,ip70701GftDasetNam.length);
   	
   }
   
   public void setIp70701GftDasetNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701GftDasetNam,ip70701GftDasetNam.length);
   	
   }
   
     /**
	 * 	Update Ip70701GftDasetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70701GftDasetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701GftDasetNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70701GftDasetNam with another Field
	 *	@param value
	 */
   public void setIp70701GftDasetNam(Field source) {
       replace(source,0,source.length(),beginIp70701GftDasetNam,IP_70701_GFT_DASET_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70701GftDasetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70701GftDasetNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70701GftDasetNam,IP_70701_GFT_DASET_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip70701GftDasetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70701GftDasetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701GftDasetNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70701FileSeqNum
	 *	@return ip70701FileSeqNum
	 */
	public int getIp70701FileSeqNum() throws CFException {
        if (isIp70701FileSeqNumModified()) { 
           ip70701FileSeqNum = refreshIp70701FileSeqNum();
        }
   		return ip70701FileSeqNum;
	}
	
	/**
	 * 	Update Ip70701FileSeqNum with the passed value
	 *  Corresponding COBOL Variable is IP70701-FILE-SEQ-NUM
	 *	@param number
	 */
	public void setIp70701FileSeqNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70701FileSeqNum = checkIp70701FileSeqNumMaxLimit(number); 
		serializeIp70701FileSeqNum(ip70701FileSeqNum);
	}


	public void setIp70701FileSeqNum(long number) {
	    number = checkIp70701FileSeqNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70701FileSeqNum((int)number);
	}
	
	/**
	 *	Returns the value of ip70701ServCd
	 *	@return ip70701ServCd
	 */
   public char[] getIp70701ServCd() throws CFException{
     if (isIp70701ServCdModified()) { 
        ip70701ServCd = refreshIp70701ServCd();
     }
   		return ip70701ServCd;
   }

  
	/**
	*  set variable ip70701ServCd
	*  Corresponding COBOL Variable is IP70701-SERV-CD
	*  @param value
	**/
   public void setIp70701ServCd(char[] value) {
      ip70701ServCd = checkIp70701ServCdConstraints(value);
      serializeIp70701ServCd(ip70701ServCd);
   } 

     /**
	 * 	Update Ip70701ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70701ServCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70701ServCd,ip70701ServCd.length);
   	
   }
   
   public void setIp70701ServCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701ServCd,ip70701ServCd.length);
   	
   }
   
     /**
	 * 	Update Ip70701ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70701ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701ServCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70701ServCd with another Field
	 *	@param value
	 */
   public void setIp70701ServCd(Field source) {
       replace(source,0,source.length(),beginIp70701ServCd,IP_70701_SERV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70701ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70701ServCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70701ServCd,IP_70701_SERV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70701ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70701ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701ServCd+targetIndex,targetLen);
    
   }
	char[] ip70701InctrlServCd8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp70701InctrlServCd88()
	 *	@return  Returns true if isIp70701InctrlServCd88() is "0001"
	 */
   public boolean isIp70701InctrlServCd88() throws CFException {
      return (  compareChars( getIp70701ServCd() , ip70701InctrlServCd8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp70701InctrlServCd88True() {  			
    	setIp70701ServCd( ip70701InctrlServCd8888Value);
   	}
	char[] ip70701CmdMqServCd8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp70701CmdMqServCd88()
	 *	@return  Returns true if isIp70701CmdMqServCd88() is "0002"
	 */
   public boolean isIp70701CmdMqServCd88() throws CFException {
      return (  compareChars( getIp70701ServCd() , ip70701CmdMqServCd8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp70701CmdMqServCd88True() {  			
    	setIp70701ServCd( ip70701CmdMqServCd8888Value);
   	}
	char[] ip70701CmdDb2ServCd8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp70701CmdDb2ServCd88()
	 *	@return  Returns true if isIp70701CmdDb2ServCd88() is "0003"
	 */
   public boolean isIp70701CmdDb2ServCd88() throws CFException {
      return (  compareChars( getIp70701ServCd() , ip70701CmdDb2ServCd8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp70701CmdDb2ServCd88True() {  			
    	setIp70701ServCd( ip70701CmdDb2ServCd8888Value);
   	}
	char[] ip70701CemServCd8888Value = "0004".toCharArray();
	/**
	 *	Test condition "0004" for isIp70701CemServCd88()
	 *	@return  Returns true if isIp70701CemServCd88() is "0004"
	 */
   public boolean isIp70701CemServCd88() throws CFException {
      return (  compareChars( getIp70701ServCd() , ip70701CemServCd8888Value)  == 0  );
   }


	/**
	*  set values "0004"
	*/
   	public void setIp70701CemServCd88True() {  			
    	setIp70701ServCd( ip70701CemServCd8888Value);
   	}
	char[] ip70701FraServCd8888Value = "0007".toCharArray();
	/**
	 *	Test condition "0007" for isIp70701FraServCd88()
	 *	@return  Returns true if isIp70701FraServCd88() is "0007"
	 */
   public boolean isIp70701FraServCd88() throws CFException {
      return (  compareChars( getIp70701ServCd() , ip70701FraServCd8888Value)  == 0  );
   }


	/**
	*  set values "0007"
	*/
   	public void setIp70701FraServCd88True() {  			
    	setIp70701ServCd( ip70701FraServCd8888Value);
   	}
	char[] ip70701InstallServCd8888Value = "0010".toCharArray();
	/**
	 *	Test condition "0010" for isIp70701InstallServCd88()
	 *	@return  Returns true if isIp70701InstallServCd88() is "0010"
	 */
   public boolean isIp70701InstallServCd88() throws CFException {
      return (  compareChars( getIp70701ServCd() , ip70701InstallServCd8888Value)  == 0  );
   }


	/**
	*  set values "0010"
	*/
   	public void setIp70701InstallServCd88True() {  			
    	setIp70701ServCd( ip70701InstallServCd8888Value);
   	}
	char[] ip70701AlmServCd8888Value = "0025".toCharArray();
	/**
	 *	Test condition "0025" for isIp70701AlmServCd88()
	 *	@return  Returns true if isIp70701AlmServCd88() is "0025"
	 */
   public boolean isIp70701AlmServCd88() throws CFException {
      return (  compareChars( getIp70701ServCd() , ip70701AlmServCd8888Value)  == 0  );
   }


	/**
	*  set values "0025"
	*/
   	public void setIp70701AlmServCd88True() {  			
    	setIp70701ServCd( ip70701AlmServCd8888Value);
   	}
	public int getIp70701TxnNum() throws CFException {
        if (isIp70701TxnNumModified()) { 
           ip70701TxnNum = refreshIp70701TxnNum();
        }
   		return ip70701TxnNum;
	}
	
	/**
	 * 	Update Ip70701TxnNum with the passed value
	 *  Corresponding COBOL Variable is IP70701-TXN-NUM
	 *	@param number
	 */
	public void setIp70701TxnNum(int number) {
			ip70701TxnNum = checkIp70701TxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp70701TxnNum(ip70701TxnNum);
	}


	public void setIp70701TxnNum(long number) {
	    number = checkIp70701TxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70701TxnNum((int)number);
	}
	

	
	
	
	/**
	 * 	initializes Ip70701TipamrqKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70701GftDasetNam(CONSTANTS.SPACE_44);
                     setIp70701FileSeqNum(0);
         setIp70701ServCd(CONSTANTS.SPACE_4);
                     setIp70701TxnNum(0);
   }

		public static int getIp70701TipamrqKeyFieldLength() {
			return IP_70701_TIPAMRQ_KEY_LENGTH;
		}

}
  
