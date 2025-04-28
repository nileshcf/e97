package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00724CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00724CentralSiteFields extends Ip00724CentralSiteFieldsSerialized { 
   

								private long ip00724JpnCustId;

						private char[] ip00724GamingPartcptnSw = Field.fillLowValue(1);

						private char[] ip00724AckDtlPrsnmnt = Field.fillLowValue(1);

						private char[] ip00724AckDtlChgbk = Field.fillLowValue(1);

						private char[] ip00724AckDtlFeeColl = Field.fillLowValue(1);

						private char[] ip00724NotDtlPrsnmnt = Field.fillLowValue(1);

						private char[] ip00724NotDtlChgbk = Field.fillLowValue(1);

						private char[] ip00724NotDtlFeeColl = Field.fillLowValue(1);

						private char[] ip00724McSendPart = Field.fillLowValue(1);

						private char[] ip00724RegEcomOptoutSw = Field.fillLowValue(1);

						private char[] ip00724De54OptionInd = Field.fillLowValue(1);

						private char[] ip00724AcqAlmOptinFlag = Field.fillLowValue(1);

						private char[] ip00724VatExclusionFlag = Field.fillLowValue(1);

						private char[] ip00724DupOptOutInd = Field.fillLowValue(1);

						private char[] ip00724IcaMcsystemFlag = Field.fillLowValue(1);

						private char[] ip00724Filler2 = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00724CentralSiteFields
	**/
    public Ip00724CentralSiteFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00724CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00724CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00724JpnCustId
	 *	@return ip00724JpnCustId
	 */
	public long getIp00724JpnCustId() throws CFException {
       if (isIp00724JpnCustIdModified()) { 
           ip00724JpnCustId = refreshIp00724JpnCustId();
        }
   		return ip00724JpnCustId;
	}
	

	
	   
	/**
	 * 	Update Ip00724JpnCustId with the passed value
	 *  Corresponding COBOL Variable is IP00724-JPN-CUST-ID
	 *	@param number
	 */
	public void setIp00724JpnCustId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00724JpnCustId = checkIp00724JpnCustIdMaxLimit(number); 
		serializeIp00724JpnCustId(ip00724JpnCustId);
	}
	

	/**
	 * 	Update Ip00724JpnCustId with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00724JpnCustId(char[] value) throws CFException {
		 ip00724JpnCustId = serializeIp00724JpnCustId(value);
	}
	/**
	 * 	Update Ip00724JpnCustId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00724JpnCustIdString(char[] value) throws CFException {
		 setIp00724JpnCustId(value);
	}
	/**
	 *	Returns the value of ip00724GamingPartcptnSw
	 *	@return ip00724GamingPartcptnSw
	 */
   public char[] getIp00724GamingPartcptnSw() throws CFException{
     if (isIp00724GamingPartcptnSwModified()) { 
        ip00724GamingPartcptnSw = refreshIp00724GamingPartcptnSw();
     }
   		return ip00724GamingPartcptnSw;
   }

  
	/**
	*  set variable ip00724GamingPartcptnSw
	*  Corresponding COBOL Variable is IP00724-GAMING-PARTCPTN-SW
	*  @param value
	**/
   public void setIp00724GamingPartcptnSw(char[] value) {
      ip00724GamingPartcptnSw = checkIp00724GamingPartcptnSwConstraints(value);
      serializeIp00724GamingPartcptnSw(ip00724GamingPartcptnSw);
   } 

     /**
	 * 	Update Ip00724GamingPartcptnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724GamingPartcptnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724GamingPartcptnSw,ip00724GamingPartcptnSw.length);
   	
   }
   
   public void setIp00724GamingPartcptnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724GamingPartcptnSw,ip00724GamingPartcptnSw.length);
   	
   }
   
     /**
	 * 	Update Ip00724GamingPartcptnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724GamingPartcptnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724GamingPartcptnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724GamingPartcptnSw with another Field
	 *	@param value
	 */
   public void setIp00724GamingPartcptnSw(Field source) {
       replace(source,0,source.length(),beginIp00724GamingPartcptnSw,IP_00724_GAMING_PARTCPTN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724GamingPartcptnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724GamingPartcptnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724GamingPartcptnSw,IP_00724_GAMING_PARTCPTN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724GamingPartcptnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724GamingPartcptnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724GamingPartcptnSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724AckDtlPrsnmnt
	 *	@return ip00724AckDtlPrsnmnt
	 */
   public char[] getIp00724AckDtlPrsnmnt() throws CFException{
     if (isIp00724AckDtlPrsnmntModified()) { 
        ip00724AckDtlPrsnmnt = refreshIp00724AckDtlPrsnmnt();
     }
   		return ip00724AckDtlPrsnmnt;
   }

  
	/**
	*  set variable ip00724AckDtlPrsnmnt
	*  Corresponding COBOL Variable is IP00724-ACK-DTL-PRSNMNT
	*  @param value
	**/
   public void setIp00724AckDtlPrsnmnt(char[] value) {
      ip00724AckDtlPrsnmnt = checkIp00724AckDtlPrsnmntConstraints(value);
      serializeIp00724AckDtlPrsnmnt(ip00724AckDtlPrsnmnt);
   } 

     /**
	 * 	Update Ip00724AckDtlPrsnmnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724AckDtlPrsnmnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724AckDtlPrsnmnt,ip00724AckDtlPrsnmnt.length);
   	
   }
   
   public void setIp00724AckDtlPrsnmnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AckDtlPrsnmnt,ip00724AckDtlPrsnmnt.length);
   	
   }
   
     /**
	 * 	Update Ip00724AckDtlPrsnmnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AckDtlPrsnmnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AckDtlPrsnmnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724AckDtlPrsnmnt with another Field
	 *	@param value
	 */
   public void setIp00724AckDtlPrsnmnt(Field source) {
       replace(source,0,source.length(),beginIp00724AckDtlPrsnmnt,IP_00724_ACK_DTL_PRSNMNT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724AckDtlPrsnmnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724AckDtlPrsnmnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724AckDtlPrsnmnt,IP_00724_ACK_DTL_PRSNMNT_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724AckDtlPrsnmnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AckDtlPrsnmnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AckDtlPrsnmnt+targetIndex,targetLen);
    
   }
	char[] ip00724AckDtlPrsnmntY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724AckDtlPrsnmntY88()
	 *	@return  Returns true if isIp00724AckDtlPrsnmntY88() is "Y"
	 */
   public boolean isIp00724AckDtlPrsnmntY88() throws CFException {
      return (  compareChars( getIp00724AckDtlPrsnmnt() , ip00724AckDtlPrsnmntY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724AckDtlPrsnmntY88True() {  			
    	setIp00724AckDtlPrsnmnt( ip00724AckDtlPrsnmntY8888Value);
   	}
	/**
	 *	Returns the value of ip00724AckDtlChgbk
	 *	@return ip00724AckDtlChgbk
	 */
   public char[] getIp00724AckDtlChgbk() throws CFException{
     if (isIp00724AckDtlChgbkModified()) { 
        ip00724AckDtlChgbk = refreshIp00724AckDtlChgbk();
     }
   		return ip00724AckDtlChgbk;
   }

  
	/**
	*  set variable ip00724AckDtlChgbk
	*  Corresponding COBOL Variable is IP00724-ACK-DTL-CHGBK
	*  @param value
	**/
   public void setIp00724AckDtlChgbk(char[] value) {
      ip00724AckDtlChgbk = checkIp00724AckDtlChgbkConstraints(value);
      serializeIp00724AckDtlChgbk(ip00724AckDtlChgbk);
   } 

     /**
	 * 	Update Ip00724AckDtlChgbk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724AckDtlChgbk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724AckDtlChgbk,ip00724AckDtlChgbk.length);
   	
   }
   
   public void setIp00724AckDtlChgbk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AckDtlChgbk,ip00724AckDtlChgbk.length);
   	
   }
   
     /**
	 * 	Update Ip00724AckDtlChgbk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AckDtlChgbk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AckDtlChgbk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724AckDtlChgbk with another Field
	 *	@param value
	 */
   public void setIp00724AckDtlChgbk(Field source) {
       replace(source,0,source.length(),beginIp00724AckDtlChgbk,IP_00724_ACK_DTL_CHGBK_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724AckDtlChgbk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724AckDtlChgbk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724AckDtlChgbk,IP_00724_ACK_DTL_CHGBK_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724AckDtlChgbk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AckDtlChgbk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AckDtlChgbk+targetIndex,targetLen);
    
   }
	char[] ip00724AckDtlChgbkY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724AckDtlChgbkY88()
	 *	@return  Returns true if isIp00724AckDtlChgbkY88() is "Y"
	 */
   public boolean isIp00724AckDtlChgbkY88() throws CFException {
      return (  compareChars( getIp00724AckDtlChgbk() , ip00724AckDtlChgbkY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724AckDtlChgbkY88True() {  			
    	setIp00724AckDtlChgbk( ip00724AckDtlChgbkY8888Value);
   	}
	/**
	 *	Returns the value of ip00724AckDtlFeeColl
	 *	@return ip00724AckDtlFeeColl
	 */
   public char[] getIp00724AckDtlFeeColl() throws CFException{
     if (isIp00724AckDtlFeeCollModified()) { 
        ip00724AckDtlFeeColl = refreshIp00724AckDtlFeeColl();
     }
   		return ip00724AckDtlFeeColl;
   }

  
	/**
	*  set variable ip00724AckDtlFeeColl
	*  Corresponding COBOL Variable is IP00724-ACK-DTL-FEE-COLL
	*  @param value
	**/
   public void setIp00724AckDtlFeeColl(char[] value) {
      ip00724AckDtlFeeColl = checkIp00724AckDtlFeeCollConstraints(value);
      serializeIp00724AckDtlFeeColl(ip00724AckDtlFeeColl);
   } 

     /**
	 * 	Update Ip00724AckDtlFeeColl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724AckDtlFeeColl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724AckDtlFeeColl,ip00724AckDtlFeeColl.length);
   	
   }
   
   public void setIp00724AckDtlFeeColl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AckDtlFeeColl,ip00724AckDtlFeeColl.length);
   	
   }
   
     /**
	 * 	Update Ip00724AckDtlFeeColl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AckDtlFeeColl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AckDtlFeeColl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724AckDtlFeeColl with another Field
	 *	@param value
	 */
   public void setIp00724AckDtlFeeColl(Field source) {
       replace(source,0,source.length(),beginIp00724AckDtlFeeColl,IP_00724_ACK_DTL_FEE_COLL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724AckDtlFeeColl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724AckDtlFeeColl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724AckDtlFeeColl,IP_00724_ACK_DTL_FEE_COLL_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724AckDtlFeeColl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AckDtlFeeColl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AckDtlFeeColl+targetIndex,targetLen);
    
   }
	char[] ip00724AckDtlFeeY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724AckDtlFeeY88()
	 *	@return  Returns true if isIp00724AckDtlFeeY88() is "Y"
	 */
   public boolean isIp00724AckDtlFeeY88() throws CFException {
      return (  compareChars( getIp00724AckDtlFeeColl() , ip00724AckDtlFeeY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724AckDtlFeeY88True() {  			
    	setIp00724AckDtlFeeColl( ip00724AckDtlFeeY8888Value);
   	}
	/**
	 *	Returns the value of ip00724NotDtlPrsnmnt
	 *	@return ip00724NotDtlPrsnmnt
	 */
   public char[] getIp00724NotDtlPrsnmnt() throws CFException{
     if (isIp00724NotDtlPrsnmntModified()) { 
        ip00724NotDtlPrsnmnt = refreshIp00724NotDtlPrsnmnt();
     }
   		return ip00724NotDtlPrsnmnt;
   }

  
	/**
	*  set variable ip00724NotDtlPrsnmnt
	*  Corresponding COBOL Variable is IP00724-NOT-DTL-PRSNMNT
	*  @param value
	**/
   public void setIp00724NotDtlPrsnmnt(char[] value) {
      ip00724NotDtlPrsnmnt = checkIp00724NotDtlPrsnmntConstraints(value);
      serializeIp00724NotDtlPrsnmnt(ip00724NotDtlPrsnmnt);
   } 

     /**
	 * 	Update Ip00724NotDtlPrsnmnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724NotDtlPrsnmnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724NotDtlPrsnmnt,ip00724NotDtlPrsnmnt.length);
   	
   }
   
   public void setIp00724NotDtlPrsnmnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NotDtlPrsnmnt,ip00724NotDtlPrsnmnt.length);
   	
   }
   
     /**
	 * 	Update Ip00724NotDtlPrsnmnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724NotDtlPrsnmnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NotDtlPrsnmnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724NotDtlPrsnmnt with another Field
	 *	@param value
	 */
   public void setIp00724NotDtlPrsnmnt(Field source) {
       replace(source,0,source.length(),beginIp00724NotDtlPrsnmnt,IP_00724_NOT_DTL_PRSNMNT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724NotDtlPrsnmnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724NotDtlPrsnmnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724NotDtlPrsnmnt,IP_00724_NOT_DTL_PRSNMNT_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724NotDtlPrsnmnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724NotDtlPrsnmnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NotDtlPrsnmnt+targetIndex,targetLen);
    
   }
	char[] ip00724NotDtlPrsnmntY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724NotDtlPrsnmntY88()
	 *	@return  Returns true if isIp00724NotDtlPrsnmntY88() is "Y"
	 */
   public boolean isIp00724NotDtlPrsnmntY88() throws CFException {
      return (  compareChars( getIp00724NotDtlPrsnmnt() , ip00724NotDtlPrsnmntY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724NotDtlPrsnmntY88True() {  			
    	setIp00724NotDtlPrsnmnt( ip00724NotDtlPrsnmntY8888Value);
   	}
	/**
	 *	Returns the value of ip00724NotDtlChgbk
	 *	@return ip00724NotDtlChgbk
	 */
   public char[] getIp00724NotDtlChgbk() throws CFException{
     if (isIp00724NotDtlChgbkModified()) { 
        ip00724NotDtlChgbk = refreshIp00724NotDtlChgbk();
     }
   		return ip00724NotDtlChgbk;
   }

  
	/**
	*  set variable ip00724NotDtlChgbk
	*  Corresponding COBOL Variable is IP00724-NOT-DTL-CHGBK
	*  @param value
	**/
   public void setIp00724NotDtlChgbk(char[] value) {
      ip00724NotDtlChgbk = checkIp00724NotDtlChgbkConstraints(value);
      serializeIp00724NotDtlChgbk(ip00724NotDtlChgbk);
   } 

     /**
	 * 	Update Ip00724NotDtlChgbk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724NotDtlChgbk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724NotDtlChgbk,ip00724NotDtlChgbk.length);
   	
   }
   
   public void setIp00724NotDtlChgbk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NotDtlChgbk,ip00724NotDtlChgbk.length);
   	
   }
   
     /**
	 * 	Update Ip00724NotDtlChgbk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724NotDtlChgbk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NotDtlChgbk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724NotDtlChgbk with another Field
	 *	@param value
	 */
   public void setIp00724NotDtlChgbk(Field source) {
       replace(source,0,source.length(),beginIp00724NotDtlChgbk,IP_00724_NOT_DTL_CHGBK_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724NotDtlChgbk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724NotDtlChgbk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724NotDtlChgbk,IP_00724_NOT_DTL_CHGBK_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724NotDtlChgbk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724NotDtlChgbk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NotDtlChgbk+targetIndex,targetLen);
    
   }
	char[] ip00724NotDtlChgbkY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724NotDtlChgbkY88()
	 *	@return  Returns true if isIp00724NotDtlChgbkY88() is "Y"
	 */
   public boolean isIp00724NotDtlChgbkY88() throws CFException {
      return (  compareChars( getIp00724NotDtlChgbk() , ip00724NotDtlChgbkY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724NotDtlChgbkY88True() {  			
    	setIp00724NotDtlChgbk( ip00724NotDtlChgbkY8888Value);
   	}
	/**
	 *	Returns the value of ip00724NotDtlFeeColl
	 *	@return ip00724NotDtlFeeColl
	 */
   public char[] getIp00724NotDtlFeeColl() throws CFException{
     if (isIp00724NotDtlFeeCollModified()) { 
        ip00724NotDtlFeeColl = refreshIp00724NotDtlFeeColl();
     }
   		return ip00724NotDtlFeeColl;
   }

  
	/**
	*  set variable ip00724NotDtlFeeColl
	*  Corresponding COBOL Variable is IP00724-NOT-DTL-FEE-COLL
	*  @param value
	**/
   public void setIp00724NotDtlFeeColl(char[] value) {
      ip00724NotDtlFeeColl = checkIp00724NotDtlFeeCollConstraints(value);
      serializeIp00724NotDtlFeeColl(ip00724NotDtlFeeColl);
   } 

     /**
	 * 	Update Ip00724NotDtlFeeColl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724NotDtlFeeColl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724NotDtlFeeColl,ip00724NotDtlFeeColl.length);
   	
   }
   
   public void setIp00724NotDtlFeeColl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NotDtlFeeColl,ip00724NotDtlFeeColl.length);
   	
   }
   
     /**
	 * 	Update Ip00724NotDtlFeeColl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724NotDtlFeeColl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NotDtlFeeColl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724NotDtlFeeColl with another Field
	 *	@param value
	 */
   public void setIp00724NotDtlFeeColl(Field source) {
       replace(source,0,source.length(),beginIp00724NotDtlFeeColl,IP_00724_NOT_DTL_FEE_COLL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724NotDtlFeeColl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724NotDtlFeeColl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724NotDtlFeeColl,IP_00724_NOT_DTL_FEE_COLL_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724NotDtlFeeColl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724NotDtlFeeColl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NotDtlFeeColl+targetIndex,targetLen);
    
   }
	char[] ip00724NotDtlFeeY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724NotDtlFeeY88()
	 *	@return  Returns true if isIp00724NotDtlFeeY88() is "Y"
	 */
   public boolean isIp00724NotDtlFeeY88() throws CFException {
      return (  compareChars( getIp00724NotDtlFeeColl() , ip00724NotDtlFeeY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724NotDtlFeeY88True() {  			
    	setIp00724NotDtlFeeColl( ip00724NotDtlFeeY8888Value);
   	}
	/**
	 *	Returns the value of ip00724McSendPart
	 *	@return ip00724McSendPart
	 */
   public char[] getIp00724McSendPart() throws CFException{
     if (isIp00724McSendPartModified()) { 
        ip00724McSendPart = refreshIp00724McSendPart();
     }
   		return ip00724McSendPart;
   }

  
	/**
	*  set variable ip00724McSendPart
	*  Corresponding COBOL Variable is IP00724-MC-SEND-PART
	*  @param value
	**/
   public void setIp00724McSendPart(char[] value) {
      ip00724McSendPart = checkIp00724McSendPartConstraints(value);
      serializeIp00724McSendPart(ip00724McSendPart);
   } 

     /**
	 * 	Update Ip00724McSendPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724McSendPart(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724McSendPart,ip00724McSendPart.length);
   	
   }
   
   public void setIp00724McSendPart(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724McSendPart,ip00724McSendPart.length);
   	
   }
   
     /**
	 * 	Update Ip00724McSendPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724McSendPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724McSendPart+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724McSendPart with another Field
	 *	@param value
	 */
   public void setIp00724McSendPart(Field source) {
       replace(source,0,source.length(),beginIp00724McSendPart,IP_00724_MC_SEND_PART_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724McSendPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724McSendPart(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724McSendPart,IP_00724_MC_SEND_PART_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724McSendPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724McSendPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724McSendPart+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724RegEcomOptoutSw
	 *	@return ip00724RegEcomOptoutSw
	 */
   public char[] getIp00724RegEcomOptoutSw() throws CFException{
     if (isIp00724RegEcomOptoutSwModified()) { 
        ip00724RegEcomOptoutSw = refreshIp00724RegEcomOptoutSw();
     }
   		return ip00724RegEcomOptoutSw;
   }

  
	/**
	*  set variable ip00724RegEcomOptoutSw
	*  Corresponding COBOL Variable is IP00724-REG-ECOM-OPTOUT-SW
	*  @param value
	**/
   public void setIp00724RegEcomOptoutSw(char[] value) {
      ip00724RegEcomOptoutSw = checkIp00724RegEcomOptoutSwConstraints(value);
      serializeIp00724RegEcomOptoutSw(ip00724RegEcomOptoutSw);
   } 

     /**
	 * 	Update Ip00724RegEcomOptoutSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724RegEcomOptoutSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724RegEcomOptoutSw,ip00724RegEcomOptoutSw.length);
   	
   }
   
   public void setIp00724RegEcomOptoutSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724RegEcomOptoutSw,ip00724RegEcomOptoutSw.length);
   	
   }
   
     /**
	 * 	Update Ip00724RegEcomOptoutSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724RegEcomOptoutSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724RegEcomOptoutSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724RegEcomOptoutSw with another Field
	 *	@param value
	 */
   public void setIp00724RegEcomOptoutSw(Field source) {
       replace(source,0,source.length(),beginIp00724RegEcomOptoutSw,IP_00724_REG_ECOM_OPTOUT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724RegEcomOptoutSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724RegEcomOptoutSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724RegEcomOptoutSw,IP_00724_REG_ECOM_OPTOUT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724RegEcomOptoutSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724RegEcomOptoutSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724RegEcomOptoutSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724De54OptionInd
	 *	@return ip00724De54OptionInd
	 */
   public char[] getIp00724De54OptionInd() throws CFException{
     if (isIp00724De54OptionIndModified()) { 
        ip00724De54OptionInd = refreshIp00724De54OptionInd();
     }
   		return ip00724De54OptionInd;
   }

  
	/**
	*  set variable ip00724De54OptionInd
	*  Corresponding COBOL Variable is IP00724-DE54-OPTION-IND
	*  @param value
	**/
   public void setIp00724De54OptionInd(char[] value) {
      ip00724De54OptionInd = checkIp00724De54OptionIndConstraints(value);
      serializeIp00724De54OptionInd(ip00724De54OptionInd);
   } 

     /**
	 * 	Update Ip00724De54OptionInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724De54OptionInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724De54OptionInd,ip00724De54OptionInd.length);
   	
   }
   
   public void setIp00724De54OptionInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724De54OptionInd,ip00724De54OptionInd.length);
   	
   }
   
     /**
	 * 	Update Ip00724De54OptionInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724De54OptionInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724De54OptionInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724De54OptionInd with another Field
	 *	@param value
	 */
   public void setIp00724De54OptionInd(Field source) {
       replace(source,0,source.length(),beginIp00724De54OptionInd,IP_00724_DE_54_OPTION_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724De54OptionInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724De54OptionInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724De54OptionInd,IP_00724_DE_54_OPTION_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724De54OptionInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724De54OptionInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724De54OptionInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724AcqAlmOptinFlag
	 *	@return ip00724AcqAlmOptinFlag
	 */
   public char[] getIp00724AcqAlmOptinFlag() throws CFException{
     if (isIp00724AcqAlmOptinFlagModified()) { 
        ip00724AcqAlmOptinFlag = refreshIp00724AcqAlmOptinFlag();
     }
   		return ip00724AcqAlmOptinFlag;
   }

  
	/**
	*  set variable ip00724AcqAlmOptinFlag
	*  Corresponding COBOL Variable is IP00724-ACQ-ALM-OPTIN-FLAG
	*  @param value
	**/
   public void setIp00724AcqAlmOptinFlag(char[] value) {
      ip00724AcqAlmOptinFlag = checkIp00724AcqAlmOptinFlagConstraints(value);
      serializeIp00724AcqAlmOptinFlag(ip00724AcqAlmOptinFlag);
   } 

     /**
	 * 	Update Ip00724AcqAlmOptinFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724AcqAlmOptinFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724AcqAlmOptinFlag,ip00724AcqAlmOptinFlag.length);
   	
   }
   
   public void setIp00724AcqAlmOptinFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AcqAlmOptinFlag,ip00724AcqAlmOptinFlag.length);
   	
   }
   
     /**
	 * 	Update Ip00724AcqAlmOptinFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AcqAlmOptinFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AcqAlmOptinFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724AcqAlmOptinFlag with another Field
	 *	@param value
	 */
   public void setIp00724AcqAlmOptinFlag(Field source) {
       replace(source,0,source.length(),beginIp00724AcqAlmOptinFlag,IP_00724_ACQ_ALM_OPTIN_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724AcqAlmOptinFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724AcqAlmOptinFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724AcqAlmOptinFlag,IP_00724_ACQ_ALM_OPTIN_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724AcqAlmOptinFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AcqAlmOptinFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AcqAlmOptinFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724VatExclusionFlag
	 *	@return ip00724VatExclusionFlag
	 */
   public char[] getIp00724VatExclusionFlag() throws CFException{
     if (isIp00724VatExclusionFlagModified()) { 
        ip00724VatExclusionFlag = refreshIp00724VatExclusionFlag();
     }
   		return ip00724VatExclusionFlag;
   }

  
	/**
	*  set variable ip00724VatExclusionFlag
	*  Corresponding COBOL Variable is IP00724-VAT-EXCLUSION-FLAG
	*  @param value
	**/
   public void setIp00724VatExclusionFlag(char[] value) {
      ip00724VatExclusionFlag = checkIp00724VatExclusionFlagConstraints(value);
      serializeIp00724VatExclusionFlag(ip00724VatExclusionFlag);
   } 

     /**
	 * 	Update Ip00724VatExclusionFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724VatExclusionFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724VatExclusionFlag,ip00724VatExclusionFlag.length);
   	
   }
   
   public void setIp00724VatExclusionFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724VatExclusionFlag,ip00724VatExclusionFlag.length);
   	
   }
   
     /**
	 * 	Update Ip00724VatExclusionFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724VatExclusionFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724VatExclusionFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724VatExclusionFlag with another Field
	 *	@param value
	 */
   public void setIp00724VatExclusionFlag(Field source) {
       replace(source,0,source.length(),beginIp00724VatExclusionFlag,IP_00724_VAT_EXCLUSION_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724VatExclusionFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724VatExclusionFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724VatExclusionFlag,IP_00724_VAT_EXCLUSION_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724VatExclusionFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724VatExclusionFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724VatExclusionFlag+targetIndex,targetLen);
    
   }
	char[] ip00724ExclVatY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724ExclVatY88()
	 *	@return  Returns true if isIp00724ExclVatY88() is "Y"
	 */
   public boolean isIp00724ExclVatY88() throws CFException {
      return (  compareChars( getIp00724VatExclusionFlag() , ip00724ExclVatY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724ExclVatY88True() {  			
    	setIp00724VatExclusionFlag( ip00724ExclVatY8888Value);
   	}
	/**
	 *	Returns the value of ip00724DupOptOutInd
	 *	@return ip00724DupOptOutInd
	 */
   public char[] getIp00724DupOptOutInd() throws CFException{
     if (isIp00724DupOptOutIndModified()) { 
        ip00724DupOptOutInd = refreshIp00724DupOptOutInd();
     }
   		return ip00724DupOptOutInd;
   }

  
	/**
	*  set variable ip00724DupOptOutInd
	*  Corresponding COBOL Variable is IP00724-DUP-OPT-OUT-IND
	*  @param value
	**/
   public void setIp00724DupOptOutInd(char[] value) {
      ip00724DupOptOutInd = checkIp00724DupOptOutIndConstraints(value);
      serializeIp00724DupOptOutInd(ip00724DupOptOutInd);
   } 

     /**
	 * 	Update Ip00724DupOptOutInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724DupOptOutInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724DupOptOutInd,ip00724DupOptOutInd.length);
   	
   }
   
   public void setIp00724DupOptOutInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724DupOptOutInd,ip00724DupOptOutInd.length);
   	
   }
   
     /**
	 * 	Update Ip00724DupOptOutInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724DupOptOutInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724DupOptOutInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724DupOptOutInd with another Field
	 *	@param value
	 */
   public void setIp00724DupOptOutInd(Field source) {
       replace(source,0,source.length(),beginIp00724DupOptOutInd,IP_00724_DUP_OPT_OUT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724DupOptOutInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724DupOptOutInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724DupOptOutInd,IP_00724_DUP_OPT_OUT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724DupOptOutInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724DupOptOutInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724DupOptOutInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724IcaMcsystemFlag
	 *	@return ip00724IcaMcsystemFlag
	 */
   public char[] getIp00724IcaMcsystemFlag() throws CFException{
     if (isIp00724IcaMcsystemFlagModified()) { 
        ip00724IcaMcsystemFlag = refreshIp00724IcaMcsystemFlag();
     }
   		return ip00724IcaMcsystemFlag;
   }

  
	/**
	*  set variable ip00724IcaMcsystemFlag
	*  Corresponding COBOL Variable is IP00724-ICA-MCSYSTEM-FLAG
	*  @param value
	**/
   public void setIp00724IcaMcsystemFlag(char[] value) {
      ip00724IcaMcsystemFlag = checkIp00724IcaMcsystemFlagConstraints(value);
      serializeIp00724IcaMcsystemFlag(ip00724IcaMcsystemFlag);
   } 

     /**
	 * 	Update Ip00724IcaMcsystemFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724IcaMcsystemFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724IcaMcsystemFlag,ip00724IcaMcsystemFlag.length);
   	
   }
   
   public void setIp00724IcaMcsystemFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IcaMcsystemFlag,ip00724IcaMcsystemFlag.length);
   	
   }
   
     /**
	 * 	Update Ip00724IcaMcsystemFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IcaMcsystemFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IcaMcsystemFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724IcaMcsystemFlag with another Field
	 *	@param value
	 */
   public void setIp00724IcaMcsystemFlag(Field source) {
       replace(source,0,source.length(),beginIp00724IcaMcsystemFlag,IP_00724_ICA_MCSYSTEM_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724IcaMcsystemFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724IcaMcsystemFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724IcaMcsystemFlag,IP_00724_ICA_MCSYSTEM_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724IcaMcsystemFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IcaMcsystemFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IcaMcsystemFlag+targetIndex,targetLen);
    
   }
	char[] ip00724MdsIca8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp00724MdsIca88()
	 *	@return  Returns true if isIp00724MdsIca88() is "M"
	 */
   public boolean isIp00724MdsIca88() throws CFException {
      return (  compareChars( getIp00724IcaMcsystemFlag() , ip00724MdsIca8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp00724MdsIca88True() {  			
    	setIp00724IcaMcsystemFlag( ip00724MdsIca8888Value);
   	}
	/**
	 *	Returns the value of ip00724Filler2
	 *	@return ip00724Filler2
	 */
   public char[] getIp00724Filler2() throws CFException{
     if (isIp00724Filler2Modified()) { 
        ip00724Filler2 = refreshIp00724Filler2();
     }
   		return ip00724Filler2;
   }

  
	/**
	*  set variable ip00724Filler2
	*  Corresponding COBOL Variable is IP00724-FILLER2
	*  @param value
	**/
   public void setIp00724Filler2(char[] value) {
      ip00724Filler2 = checkIp00724Filler2Constraints(value);
      serializeIp00724Filler2(ip00724Filler2);
   } 

     /**
	 * 	Update Ip00724Filler2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724Filler2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724Filler2,ip00724Filler2.length);
   	
   }
   
   public void setIp00724Filler2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler2,ip00724Filler2.length);
   	
   }
   
     /**
	 * 	Update Ip00724Filler2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Filler2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724Filler2 with another Field
	 *	@param value
	 */
   public void setIp00724Filler2(Field source) {
       replace(source,0,source.length(),beginIp00724Filler2,IP_00724_FILLER_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724Filler2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724Filler2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724Filler2,IP_00724_FILLER_2_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724Filler2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Filler2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00724CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00724JpnCustId(0);
         setIp00724GamingPartcptnSw(CONSTANTS.SPACE);
         setIp00724AckDtlPrsnmnt(CONSTANTS.SPACE);
         setIp00724AckDtlChgbk(CONSTANTS.SPACE);
         setIp00724AckDtlFeeColl(CONSTANTS.SPACE);
         setIp00724NotDtlPrsnmnt(CONSTANTS.SPACE);
         setIp00724NotDtlChgbk(CONSTANTS.SPACE);
         setIp00724NotDtlFeeColl(CONSTANTS.SPACE);
         setIp00724McSendPart(CONSTANTS.SPACE);
         setIp00724RegEcomOptoutSw(CONSTANTS.SPACE);
         setIp00724De54OptionInd(CONSTANTS.SPACE);
         setIp00724AcqAlmOptinFlag(CONSTANTS.SPACE);
         setIp00724VatExclusionFlag(CONSTANTS.SPACE);
         setIp00724DupOptOutInd(CONSTANTS.SPACE);
         setIp00724IcaMcsystemFlag(CONSTANTS.SPACE);
         setIp00724Filler2(CONSTANTS.SPACE);
   }

		public static int getIp00724CentralSiteFieldsFieldLength() {
			return IP_00724_CENTRAL_SITE_FIELDS_LENGTH;
		}

}
  
