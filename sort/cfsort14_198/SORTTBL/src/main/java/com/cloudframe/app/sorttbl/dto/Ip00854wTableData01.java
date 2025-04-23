package com.cloudframe.app.sorttbl.dto;

/**
*  The class Ip00854wTableData01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sorttbl.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00854wTableData01 extends Ip00854wTableData01Serialized { 
   

								private int ip00854wTxnCurrCd;

						private char[] ip00854wTxnCurrCdX = Field.fillLowValue(3);

								private int ip00854wReconCurrCd;

						private char[] ip00854wReconCurrCdX = Field.fillLowValue(3);

								private long ip00854wRuleEffDate;
	
	/**
	* Constructor for Ip00854wTableData01
	**/
    public Ip00854wTableData01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00854wTableData01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00854wTableData01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00854wTxnCurrCd
	 *	@return ip00854wTxnCurrCd
	 */
	public int getIp00854wTxnCurrCd() throws CFException {
       if (isIp00854wTxnCurrCdModified()) { 
           ip00854wTxnCurrCd = refreshIp00854wTxnCurrCd();
        }
   		return ip00854wTxnCurrCd;
	}
	

	
	   
	/**
	 * 	Update Ip00854wTxnCurrCd with the passed value
	 *  Corresponding COBOL Variable is IP00854W-TXN-CURR-CD
	 *	@param number
	 */
	public void setIp00854wTxnCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00854wTxnCurrCd = checkIp00854wTxnCurrCdMaxLimit(number); 
		serializeIp00854wTxnCurrCd(ip00854wTxnCurrCd);
	}
	

	public void setIp00854wTxnCurrCd(long number) {
	    number = checkIp00854wTxnCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00854wTxnCurrCd((int)number);
	}
	
	/**
	 * 	Update Ip00854wTxnCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00854wTxnCurrCd(char[] value) throws CFException {
		 ip00854wTxnCurrCd = serializeIp00854wTxnCurrCd(value);
	}
	/**
	 * 	Update Ip00854wTxnCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00854wTxnCurrCdString(char[] value) throws CFException {
		 setIp00854wTxnCurrCd(value);
	}
	/**
	 *	Returns the value of ip00854wTxnCurrCdX
	 *	@return ip00854wTxnCurrCdX
	 */
   public char[] getIp00854wTxnCurrCdX() throws CFException{
     if (isIp00854wTxnCurrCdXModified()) { 
        ip00854wTxnCurrCdX = refreshIp00854wTxnCurrCdX();
     }
   		return ip00854wTxnCurrCdX;
   }

  
	/**
	*  set variable ip00854wTxnCurrCdX
	*  Corresponding COBOL Variable is IP00854W-TXN-CURR-CD-X
	*  @param value
	**/
   public void setIp00854wTxnCurrCdX(char[] value) {
      ip00854wTxnCurrCdX = checkIp00854wTxnCurrCdXConstraints(value);
      serializeIp00854wTxnCurrCdX(ip00854wTxnCurrCdX);
   } 

     /**
	 * 	Update Ip00854wTxnCurrCdX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00854wTxnCurrCdX,ip00854wTxnCurrCdX.length);
   	
   }
   
   public void setIp00854wTxnCurrCdX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00854wTxnCurrCdX,ip00854wTxnCurrCdX.length);
   	
   }
   
     /**
	 * 	Update Ip00854wTxnCurrCdX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00854wTxnCurrCdX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00854wTxnCurrCdX with another Field
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(Field source) {
       replace(source,0,source.length(),beginIp00854wTxnCurrCdX,IP_00854W_TXN_CURR_CD_X_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00854wTxnCurrCdX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00854wTxnCurrCdX,IP_00854W_TXN_CURR_CD_X_LEN);
   	
   }
   
     /**
	 * 	Update Ip00854wTxnCurrCdX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00854wTxnCurrCdX+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00854wReconCurrCd
	 *	@return ip00854wReconCurrCd
	 */
	public int getIp00854wReconCurrCd() throws CFException {
       if (isIp00854wReconCurrCdModified()) { 
           ip00854wReconCurrCd = refreshIp00854wReconCurrCd();
        }
   		return ip00854wReconCurrCd;
	}
	

	
	   
	/**
	 * 	Update Ip00854wReconCurrCd with the passed value
	 *  Corresponding COBOL Variable is IP00854W-RECON-CURR-CD
	 *	@param number
	 */
	public void setIp00854wReconCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00854wReconCurrCd = checkIp00854wReconCurrCdMaxLimit(number); 
		serializeIp00854wReconCurrCd(ip00854wReconCurrCd);
	}
	

	public void setIp00854wReconCurrCd(long number) {
	    number = checkIp00854wReconCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00854wReconCurrCd((int)number);
	}
	
	/**
	 * 	Update Ip00854wReconCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00854wReconCurrCd(char[] value) throws CFException {
		 ip00854wReconCurrCd = serializeIp00854wReconCurrCd(value);
	}
	/**
	 * 	Update Ip00854wReconCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00854wReconCurrCdString(char[] value) throws CFException {
		 setIp00854wReconCurrCd(value);
	}
	/**
	 *	Returns the value of ip00854wReconCurrCdX
	 *	@return ip00854wReconCurrCdX
	 */
   public char[] getIp00854wReconCurrCdX() throws CFException{
     if (isIp00854wReconCurrCdXModified()) { 
        ip00854wReconCurrCdX = refreshIp00854wReconCurrCdX();
     }
   		return ip00854wReconCurrCdX;
   }

  
	/**
	*  set variable ip00854wReconCurrCdX
	*  Corresponding COBOL Variable is IP00854W-RECON-CURR-CD-X
	*  @param value
	**/
   public void setIp00854wReconCurrCdX(char[] value) {
      ip00854wReconCurrCdX = checkIp00854wReconCurrCdXConstraints(value);
      serializeIp00854wReconCurrCdX(ip00854wReconCurrCdX);
   } 

     /**
	 * 	Update Ip00854wReconCurrCdX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00854wReconCurrCdX,ip00854wReconCurrCdX.length);
   	
   }
   
   public void setIp00854wReconCurrCdX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00854wReconCurrCdX,ip00854wReconCurrCdX.length);
   	
   }
   
     /**
	 * 	Update Ip00854wReconCurrCdX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00854wReconCurrCdX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00854wReconCurrCdX with another Field
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(Field source) {
       replace(source,0,source.length(),beginIp00854wReconCurrCdX,IP_00854W_RECON_CURR_CD_X_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00854wReconCurrCdX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00854wReconCurrCdX,IP_00854W_RECON_CURR_CD_X_LEN);
   	
   }
   
     /**
	 * 	Update Ip00854wReconCurrCdX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00854wReconCurrCdX+targetIndex,targetLen);
    
   }
	char[] ip00854wAnyCurrCd8888Value = "***".toCharArray();
	/**
	 *	Test condition "***" for isIp00854wAnyCurrCd88()
	 *	@return  Returns true if isIp00854wAnyCurrCd88() is "***"
	 */
   public boolean isIp00854wAnyCurrCd88() throws CFException {
      return (  compareChars( getIp00854wReconCurrCdX() , ip00854wAnyCurrCd8888Value)  == 0  );
   }


	/**
	*  set values "***"
	*/
   	public void setIp00854wAnyCurrCd88True() {  			
    	setIp00854wReconCurrCdX( ip00854wAnyCurrCd8888Value);
   	}
	/**
	 *	Returns the value of ip00854wRuleEffDate
	 *	@return ip00854wRuleEffDate
	 */
	public long getIp00854wRuleEffDate() throws CFException {
       if (isIp00854wRuleEffDateModified()) { 
           ip00854wRuleEffDate = refreshIp00854wRuleEffDate();
        }
   		return ip00854wRuleEffDate;
	}
	

	
	   
	/**
	 * 	Update Ip00854wRuleEffDate with the passed value
	 *  Corresponding COBOL Variable is IP00854W-RULE-EFF-DATE
	 *	@param number
	 */
	public void setIp00854wRuleEffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00854wRuleEffDate = checkIp00854wRuleEffDateMaxLimit(number); 
		serializeIp00854wRuleEffDate(ip00854wRuleEffDate);
	}
	

	/**
	 * 	Update Ip00854wRuleEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00854wRuleEffDate(char[] value) throws CFException {
		 ip00854wRuleEffDate = serializeIp00854wRuleEffDate(value);
	}
	/**
	 * 	Update Ip00854wRuleEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00854wRuleEffDateString(char[] value) throws CFException {
		 setIp00854wRuleEffDate(value);
	}

	
	
	

		public static int getIp00854wTableData01FieldLength() {
			return IP_00854W_TABLE_DATA_01_LENGTH;
		}

}
  
