package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip75081MqSwitches is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip75081MqSwitches")

public class Ip75081MqSwitches extends Ip75081MqSwitchesSerialized  implements InitializingBean {
   

						private char[] ip75081MqOptions = Field.fillLowValue(1);

						private char[] ip75081IsFromPgm = Field.fillLowValue(1);

						private char[] ip75081IsForTable = Field.fillLowValue(1);

						private char[] ip75081PayloadPmtSentSw = Field.fillLowValue(1);

						private char[] ip75081IdnPyldPmaSentSw = Field.fillLowValue(1);

						private char[] ip75081IdnPyldPmiSentSw = Field.fillLowValue(1);

						private char[] ip75081RusPyldPmaSentSw = Field.fillLowValue(1);

						private char[] ip75081RusPyldPmiSentSw = Field.fillLowValue(1);

						private char[] ip75081PayloadPimSentSw = Field.fillLowValue(1);

						private char[] ip75081PayloadPmt1stTime = Field.fillLowValue(1);

						private char[] ip75081PyldPmaIdn1stTime = Field.fillLowValue(1);

						private char[] ip75081PyldPmiIdn1stTime = Field.fillLowValue(1);

						private char[] ip75081PyldPmaRus1stTime = Field.fillLowValue(1);

						private char[] ip75081PyldPmiRus1stTime = Field.fillLowValue(1);

						private char[] ip75081PayloadPim1stTime = Field.fillLowValue(1);

						private char[] ip75081AccntNum = Field.fillLowValue(19);

						private char[] ip75081IsItEndOfProcess = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip75081MqSwitches
	**/
    public Ip75081MqSwitches() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip75081MqOptions
	 *	@return ip75081MqOptions
	 */
   public char[] getIp75081MqOptions() throws CFException{
     if (isIp75081MqOptionsModified()) { 
        ip75081MqOptions = refreshIp75081MqOptions();
     }
   		return ip75081MqOptions;
   }

  
	/**
	*  set variable ip75081MqOptions
	*  Corresponding COBOL Variable is IP75081-MQ-OPTIONS
	*  @param value
	**/
   public void setIp75081MqOptions(char[] value) {
      ip75081MqOptions = checkIp75081MqOptionsConstraints(value);
      serializeIp75081MqOptions(ip75081MqOptions);
   } 

     /**
	 * 	Update Ip75081MqOptions 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081MqOptions(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081MqOptions,ip75081MqOptions.length);
   	
   }
   
   public void setIp75081MqOptions(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081MqOptions,ip75081MqOptions.length);
   	
   }
   
     /**
	 * 	Update Ip75081MqOptions 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081MqOptions(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081MqOptions+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081MqOptions with another Field
	 *	@param value
	 */
   public void setIp75081MqOptions(Field source) {
       replace(source,0,source.length(),beginIp75081MqOptions,IP_75081_MQ_OPTIONS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081MqOptions 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081MqOptions(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081MqOptions,IP_75081_MQ_OPTIONS_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081MqOptions 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081MqOptions(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081MqOptions+targetIndex,targetLen);
    
   }
	char[] ip75081MqPut8888Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isIp75081MqPut88()
	 *	@return  Returns true if isIp75081MqPut88() is "P"
	 */
   public boolean isIp75081MqPut88() throws CFException {
      return (  compareChars( getIp75081MqOptions() , ip75081MqPut8888Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setIp75081MqPut88True() {  			
    	setIp75081MqOptions( ip75081MqPut8888Value);
   	}
	char[] ip75081MqSend8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp75081MqSend88()
	 *	@return  Returns true if isIp75081MqSend88() is "S"
	 */
   public boolean isIp75081MqSend88() throws CFException {
      return (  compareChars( getIp75081MqOptions() , ip75081MqSend8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp75081MqSend88True() {  			
    	setIp75081MqOptions( ip75081MqSend8888Value);
   	}
	/**
	 *	Returns the value of ip75081IsFromPgm
	 *	@return ip75081IsFromPgm
	 */
   public char[] getIp75081IsFromPgm() throws CFException{
     if (isIp75081IsFromPgmModified()) { 
        ip75081IsFromPgm = refreshIp75081IsFromPgm();
     }
   		return ip75081IsFromPgm;
   }

  
	/**
	*  set variable ip75081IsFromPgm
	*  Corresponding COBOL Variable is IP75081-IS-FROM-PGM
	*  @param value
	**/
   public void setIp75081IsFromPgm(char[] value) {
      ip75081IsFromPgm = checkIp75081IsFromPgmConstraints(value);
      serializeIp75081IsFromPgm(ip75081IsFromPgm);
   } 

     /**
	 * 	Update Ip75081IsFromPgm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081IsFromPgm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081IsFromPgm,ip75081IsFromPgm.length);
   	
   }
   
   public void setIp75081IsFromPgm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IsFromPgm,ip75081IsFromPgm.length);
   	
   }
   
     /**
	 * 	Update Ip75081IsFromPgm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IsFromPgm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IsFromPgm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081IsFromPgm with another Field
	 *	@param value
	 */
   public void setIp75081IsFromPgm(Field source) {
       replace(source,0,source.length(),beginIp75081IsFromPgm,IP_75081_IS_FROM_PGM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081IsFromPgm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081IsFromPgm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081IsFromPgm,IP_75081_IS_FROM_PGM_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081IsFromPgm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IsFromPgm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IsFromPgm+targetIndex,targetLen);
    
   }
	char[] ip75081IsFromPmt8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp75081IsFromPmt88()
	 *	@return  Returns true if isIp75081IsFromPmt88() is "1"
	 */
   public boolean isIp75081IsFromPmt88() throws CFException {
      return (  compareChars( getIp75081IsFromPgm() , ip75081IsFromPmt8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp75081IsFromPmt88True() {  			
    	setIp75081IsFromPgm( ip75081IsFromPmt8888Value);
   	}
	char[] ip75081IsFromPma8888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp75081IsFromPma88()
	 *	@return  Returns true if isIp75081IsFromPma88() is "2"
	 */
   public boolean isIp75081IsFromPma88() throws CFException {
      return (  compareChars( getIp75081IsFromPgm() , ip75081IsFromPma8888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp75081IsFromPma88True() {  			
    	setIp75081IsFromPgm( ip75081IsFromPma8888Value);
   	}
	char[] ip75081IsFromPim8888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp75081IsFromPim88()
	 *	@return  Returns true if isIp75081IsFromPim88() is "3"
	 */
   public boolean isIp75081IsFromPim88() throws CFException {
      return (  compareChars( getIp75081IsFromPgm() , ip75081IsFromPim8888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp75081IsFromPim88True() {  			
    	setIp75081IsFromPgm( ip75081IsFromPim8888Value);
   	}
	/**
	 *	Returns the value of ip75081IsForTable
	 *	@return ip75081IsForTable
	 */
   public char[] getIp75081IsForTable() throws CFException{
     if (isIp75081IsForTableModified()) { 
        ip75081IsForTable = refreshIp75081IsForTable();
     }
   		return ip75081IsForTable;
   }

  
	/**
	*  set variable ip75081IsForTable
	*  Corresponding COBOL Variable is IP75081-IS-FOR-TABLE
	*  @param value
	**/
   public void setIp75081IsForTable(char[] value) {
      ip75081IsForTable = checkIp75081IsForTableConstraints(value);
      serializeIp75081IsForTable(ip75081IsForTable);
   } 

     /**
	 * 	Update Ip75081IsForTable 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081IsForTable(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081IsForTable,ip75081IsForTable.length);
   	
   }
   
   public void setIp75081IsForTable(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IsForTable,ip75081IsForTable.length);
   	
   }
   
     /**
	 * 	Update Ip75081IsForTable 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IsForTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IsForTable+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081IsForTable with another Field
	 *	@param value
	 */
   public void setIp75081IsForTable(Field source) {
       replace(source,0,source.length(),beginIp75081IsForTable,IP_75081_IS_FOR_TABLE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081IsForTable 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081IsForTable(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081IsForTable,IP_75081_IS_FOR_TABLE_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081IsForTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IsForTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IsForTable+targetIndex,targetLen);
    
   }
	char[] ip75081IsForPma8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp75081IsForPma88()
	 *	@return  Returns true if isIp75081IsForPma88() is "A"
	 */
   public boolean isIp75081IsForPma88() throws CFException {
      return (  compareChars( getIp75081IsForTable() , ip75081IsForPma8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp75081IsForPma88True() {  			
    	setIp75081IsForTable( ip75081IsForPma8888Value);
   	}
	char[] ip75081IsForPmi8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp75081IsForPmi88()
	 *	@return  Returns true if isIp75081IsForPmi88() is "I"
	 */
   public boolean isIp75081IsForPmi88() throws CFException {
      return (  compareChars( getIp75081IsForTable() , ip75081IsForPmi8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp75081IsForPmi88True() {  			
    	setIp75081IsForTable( ip75081IsForPmi8888Value);
   	}
	char[] ip75081IsForPim8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp75081IsForPim88()
	 *	@return  Returns true if isIp75081IsForPim88() is "M"
	 */
   public boolean isIp75081IsForPim88() throws CFException {
      return (  compareChars( getIp75081IsForTable() , ip75081IsForPim8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp75081IsForPim88True() {  			
    	setIp75081IsForTable( ip75081IsForPim8888Value);
   	}
	/**
	 *	Returns the value of ip75081PayloadPmtSentSw
	 *	@return ip75081PayloadPmtSentSw
	 */
   public char[] getIp75081PayloadPmtSentSw() throws CFException{
     if (isIp75081PayloadPmtSentSwModified()) { 
        ip75081PayloadPmtSentSw = refreshIp75081PayloadPmtSentSw();
     }
   		return ip75081PayloadPmtSentSw;
   }

  
	/**
	*  set variable ip75081PayloadPmtSentSw
	*  Corresponding COBOL Variable is IP75081-PAYLOAD-PMT-SENT-SW
	*  @param value
	**/
   public void setIp75081PayloadPmtSentSw(char[] value) {
      ip75081PayloadPmtSentSw = checkIp75081PayloadPmtSentSwConstraints(value);
      serializeIp75081PayloadPmtSentSw(ip75081PayloadPmtSentSw);
   } 

     /**
	 * 	Update Ip75081PayloadPmtSentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081PayloadPmtSentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081PayloadPmtSentSw,ip75081PayloadPmtSentSw.length);
   	
   }
   
   public void setIp75081PayloadPmtSentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPmtSentSw,ip75081PayloadPmtSentSw.length);
   	
   }
   
     /**
	 * 	Update Ip75081PayloadPmtSentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PayloadPmtSentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPmtSentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081PayloadPmtSentSw with another Field
	 *	@param value
	 */
   public void setIp75081PayloadPmtSentSw(Field source) {
       replace(source,0,source.length(),beginIp75081PayloadPmtSentSw,IP_75081_PAYLOAD_PMT_SENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081PayloadPmtSentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081PayloadPmtSentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081PayloadPmtSentSw,IP_75081_PAYLOAD_PMT_SENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081PayloadPmtSentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PayloadPmtSentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPmtSentSw+targetIndex,targetLen);
    
   }
	char[] ip75081PayloadPmtY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081PayloadPmtY88()
	 *	@return  Returns true if isIp75081PayloadPmtY88() is "Y"
	 */
   public boolean isIp75081PayloadPmtY88() throws CFException {
      return (  compareChars( getIp75081PayloadPmtSentSw() , ip75081PayloadPmtY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081PayloadPmtY88True() {  			
    	setIp75081PayloadPmtSentSw( ip75081PayloadPmtY8888Value);
   	}
	char[] ip75081PayloadPmtN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081PayloadPmtN88()
	 *	@return  Returns true if isIp75081PayloadPmtN88() is "N"
	 */
   public boolean isIp75081PayloadPmtN88() throws CFException {
      return (  compareChars( getIp75081PayloadPmtSentSw() , ip75081PayloadPmtN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081PayloadPmtN88True() {  			
    	setIp75081PayloadPmtSentSw( ip75081PayloadPmtN8888Value);
   	}
	/**
	 *	Returns the value of ip75081IdnPyldPmaSentSw
	 *	@return ip75081IdnPyldPmaSentSw
	 */
   public char[] getIp75081IdnPyldPmaSentSw() throws CFException{
     if (isIp75081IdnPyldPmaSentSwModified()) { 
        ip75081IdnPyldPmaSentSw = refreshIp75081IdnPyldPmaSentSw();
     }
   		return ip75081IdnPyldPmaSentSw;
   }

  
	/**
	*  set variable ip75081IdnPyldPmaSentSw
	*  Corresponding COBOL Variable is IP75081-IDN-PYLD-PMA-SENT-SW
	*  @param value
	**/
   public void setIp75081IdnPyldPmaSentSw(char[] value) {
      ip75081IdnPyldPmaSentSw = checkIp75081IdnPyldPmaSentSwConstraints(value);
      serializeIp75081IdnPyldPmaSentSw(ip75081IdnPyldPmaSentSw);
   } 

     /**
	 * 	Update Ip75081IdnPyldPmaSentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081IdnPyldPmaSentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081IdnPyldPmaSentSw,ip75081IdnPyldPmaSentSw.length);
   	
   }
   
   public void setIp75081IdnPyldPmaSentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IdnPyldPmaSentSw,ip75081IdnPyldPmaSentSw.length);
   	
   }
   
     /**
	 * 	Update Ip75081IdnPyldPmaSentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IdnPyldPmaSentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IdnPyldPmaSentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081IdnPyldPmaSentSw with another Field
	 *	@param value
	 */
   public void setIp75081IdnPyldPmaSentSw(Field source) {
       replace(source,0,source.length(),beginIp75081IdnPyldPmaSentSw,IP_75081_IDN_PYLD_PMA_SENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081IdnPyldPmaSentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081IdnPyldPmaSentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081IdnPyldPmaSentSw,IP_75081_IDN_PYLD_PMA_SENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081IdnPyldPmaSentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IdnPyldPmaSentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IdnPyldPmaSentSw+targetIndex,targetLen);
    
   }
	char[] ip75081IdnPyldPmaY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081IdnPyldPmaY88()
	 *	@return  Returns true if isIp75081IdnPyldPmaY88() is "Y"
	 */
   public boolean isIp75081IdnPyldPmaY88() throws CFException {
      return (  compareChars( getIp75081IdnPyldPmaSentSw() , ip75081IdnPyldPmaY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081IdnPyldPmaY88True() {  			
    	setIp75081IdnPyldPmaSentSw( ip75081IdnPyldPmaY8888Value);
   	}
	char[] ip75081IdnPyldPmaN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081IdnPyldPmaN88()
	 *	@return  Returns true if isIp75081IdnPyldPmaN88() is "N"
	 */
   public boolean isIp75081IdnPyldPmaN88() throws CFException {
      return (  compareChars( getIp75081IdnPyldPmaSentSw() , ip75081IdnPyldPmaN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081IdnPyldPmaN88True() {  			
    	setIp75081IdnPyldPmaSentSw( ip75081IdnPyldPmaN8888Value);
   	}
	/**
	 *	Returns the value of ip75081IdnPyldPmiSentSw
	 *	@return ip75081IdnPyldPmiSentSw
	 */
   public char[] getIp75081IdnPyldPmiSentSw() throws CFException{
     if (isIp75081IdnPyldPmiSentSwModified()) { 
        ip75081IdnPyldPmiSentSw = refreshIp75081IdnPyldPmiSentSw();
     }
   		return ip75081IdnPyldPmiSentSw;
   }

  
	/**
	*  set variable ip75081IdnPyldPmiSentSw
	*  Corresponding COBOL Variable is IP75081-IDN-PYLD-PMI-SENT-SW
	*  @param value
	**/
   public void setIp75081IdnPyldPmiSentSw(char[] value) {
      ip75081IdnPyldPmiSentSw = checkIp75081IdnPyldPmiSentSwConstraints(value);
      serializeIp75081IdnPyldPmiSentSw(ip75081IdnPyldPmiSentSw);
   } 

     /**
	 * 	Update Ip75081IdnPyldPmiSentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081IdnPyldPmiSentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081IdnPyldPmiSentSw,ip75081IdnPyldPmiSentSw.length);
   	
   }
   
   public void setIp75081IdnPyldPmiSentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IdnPyldPmiSentSw,ip75081IdnPyldPmiSentSw.length);
   	
   }
   
     /**
	 * 	Update Ip75081IdnPyldPmiSentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IdnPyldPmiSentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IdnPyldPmiSentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081IdnPyldPmiSentSw with another Field
	 *	@param value
	 */
   public void setIp75081IdnPyldPmiSentSw(Field source) {
       replace(source,0,source.length(),beginIp75081IdnPyldPmiSentSw,IP_75081_IDN_PYLD_PMI_SENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081IdnPyldPmiSentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081IdnPyldPmiSentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081IdnPyldPmiSentSw,IP_75081_IDN_PYLD_PMI_SENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081IdnPyldPmiSentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IdnPyldPmiSentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IdnPyldPmiSentSw+targetIndex,targetLen);
    
   }
	char[] ip75081IdnPyldPmiY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081IdnPyldPmiY88()
	 *	@return  Returns true if isIp75081IdnPyldPmiY88() is "Y"
	 */
   public boolean isIp75081IdnPyldPmiY88() throws CFException {
      return (  compareChars( getIp75081IdnPyldPmiSentSw() , ip75081IdnPyldPmiY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081IdnPyldPmiY88True() {  			
    	setIp75081IdnPyldPmiSentSw( ip75081IdnPyldPmiY8888Value);
   	}
	char[] ip75081IdnPyldPmiN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081IdnPyldPmiN88()
	 *	@return  Returns true if isIp75081IdnPyldPmiN88() is "N"
	 */
   public boolean isIp75081IdnPyldPmiN88() throws CFException {
      return (  compareChars( getIp75081IdnPyldPmiSentSw() , ip75081IdnPyldPmiN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081IdnPyldPmiN88True() {  			
    	setIp75081IdnPyldPmiSentSw( ip75081IdnPyldPmiN8888Value);
   	}
	/**
	 *	Returns the value of ip75081RusPyldPmaSentSw
	 *	@return ip75081RusPyldPmaSentSw
	 */
   public char[] getIp75081RusPyldPmaSentSw() throws CFException{
     if (isIp75081RusPyldPmaSentSwModified()) { 
        ip75081RusPyldPmaSentSw = refreshIp75081RusPyldPmaSentSw();
     }
   		return ip75081RusPyldPmaSentSw;
   }

  
	/**
	*  set variable ip75081RusPyldPmaSentSw
	*  Corresponding COBOL Variable is IP75081-RUS-PYLD-PMA-SENT-SW
	*  @param value
	**/
   public void setIp75081RusPyldPmaSentSw(char[] value) {
      ip75081RusPyldPmaSentSw = checkIp75081RusPyldPmaSentSwConstraints(value);
      serializeIp75081RusPyldPmaSentSw(ip75081RusPyldPmaSentSw);
   } 

     /**
	 * 	Update Ip75081RusPyldPmaSentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081RusPyldPmaSentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081RusPyldPmaSentSw,ip75081RusPyldPmaSentSw.length);
   	
   }
   
   public void setIp75081RusPyldPmaSentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081RusPyldPmaSentSw,ip75081RusPyldPmaSentSw.length);
   	
   }
   
     /**
	 * 	Update Ip75081RusPyldPmaSentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081RusPyldPmaSentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081RusPyldPmaSentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081RusPyldPmaSentSw with another Field
	 *	@param value
	 */
   public void setIp75081RusPyldPmaSentSw(Field source) {
       replace(source,0,source.length(),beginIp75081RusPyldPmaSentSw,IP_75081_RUS_PYLD_PMA_SENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081RusPyldPmaSentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081RusPyldPmaSentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081RusPyldPmaSentSw,IP_75081_RUS_PYLD_PMA_SENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081RusPyldPmaSentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081RusPyldPmaSentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081RusPyldPmaSentSw+targetIndex,targetLen);
    
   }
	char[] ip75081RusPyldPmaY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081RusPyldPmaY88()
	 *	@return  Returns true if isIp75081RusPyldPmaY88() is "Y"
	 */
   public boolean isIp75081RusPyldPmaY88() throws CFException {
      return (  compareChars( getIp75081RusPyldPmaSentSw() , ip75081RusPyldPmaY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081RusPyldPmaY88True() {  			
    	setIp75081RusPyldPmaSentSw( ip75081RusPyldPmaY8888Value);
   	}
	char[] ip75081RusPyldPmaN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081RusPyldPmaN88()
	 *	@return  Returns true if isIp75081RusPyldPmaN88() is "N"
	 */
   public boolean isIp75081RusPyldPmaN88() throws CFException {
      return (  compareChars( getIp75081RusPyldPmaSentSw() , ip75081RusPyldPmaN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081RusPyldPmaN88True() {  			
    	setIp75081RusPyldPmaSentSw( ip75081RusPyldPmaN8888Value);
   	}
	/**
	 *	Returns the value of ip75081RusPyldPmiSentSw
	 *	@return ip75081RusPyldPmiSentSw
	 */
   public char[] getIp75081RusPyldPmiSentSw() throws CFException{
     if (isIp75081RusPyldPmiSentSwModified()) { 
        ip75081RusPyldPmiSentSw = refreshIp75081RusPyldPmiSentSw();
     }
   		return ip75081RusPyldPmiSentSw;
   }

  
	/**
	*  set variable ip75081RusPyldPmiSentSw
	*  Corresponding COBOL Variable is IP75081-RUS-PYLD-PMI-SENT-SW
	*  @param value
	**/
   public void setIp75081RusPyldPmiSentSw(char[] value) {
      ip75081RusPyldPmiSentSw = checkIp75081RusPyldPmiSentSwConstraints(value);
      serializeIp75081RusPyldPmiSentSw(ip75081RusPyldPmiSentSw);
   } 

     /**
	 * 	Update Ip75081RusPyldPmiSentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081RusPyldPmiSentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081RusPyldPmiSentSw,ip75081RusPyldPmiSentSw.length);
   	
   }
   
   public void setIp75081RusPyldPmiSentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081RusPyldPmiSentSw,ip75081RusPyldPmiSentSw.length);
   	
   }
   
     /**
	 * 	Update Ip75081RusPyldPmiSentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081RusPyldPmiSentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081RusPyldPmiSentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081RusPyldPmiSentSw with another Field
	 *	@param value
	 */
   public void setIp75081RusPyldPmiSentSw(Field source) {
       replace(source,0,source.length(),beginIp75081RusPyldPmiSentSw,IP_75081_RUS_PYLD_PMI_SENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081RusPyldPmiSentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081RusPyldPmiSentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081RusPyldPmiSentSw,IP_75081_RUS_PYLD_PMI_SENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081RusPyldPmiSentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081RusPyldPmiSentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081RusPyldPmiSentSw+targetIndex,targetLen);
    
   }
	char[] ip75081RusPyldPmiY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081RusPyldPmiY88()
	 *	@return  Returns true if isIp75081RusPyldPmiY88() is "Y"
	 */
   public boolean isIp75081RusPyldPmiY88() throws CFException {
      return (  compareChars( getIp75081RusPyldPmiSentSw() , ip75081RusPyldPmiY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081RusPyldPmiY88True() {  			
    	setIp75081RusPyldPmiSentSw( ip75081RusPyldPmiY8888Value);
   	}
	char[] ip75081RusPyldPmiN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081RusPyldPmiN88()
	 *	@return  Returns true if isIp75081RusPyldPmiN88() is "N"
	 */
   public boolean isIp75081RusPyldPmiN88() throws CFException {
      return (  compareChars( getIp75081RusPyldPmiSentSw() , ip75081RusPyldPmiN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081RusPyldPmiN88True() {  			
    	setIp75081RusPyldPmiSentSw( ip75081RusPyldPmiN8888Value);
   	}
	/**
	 *	Returns the value of ip75081PayloadPimSentSw
	 *	@return ip75081PayloadPimSentSw
	 */
   public char[] getIp75081PayloadPimSentSw() throws CFException{
     if (isIp75081PayloadPimSentSwModified()) { 
        ip75081PayloadPimSentSw = refreshIp75081PayloadPimSentSw();
     }
   		return ip75081PayloadPimSentSw;
   }

  
	/**
	*  set variable ip75081PayloadPimSentSw
	*  Corresponding COBOL Variable is IP75081-PAYLOAD-PIM-SENT-SW
	*  @param value
	**/
   public void setIp75081PayloadPimSentSw(char[] value) {
      ip75081PayloadPimSentSw = checkIp75081PayloadPimSentSwConstraints(value);
      serializeIp75081PayloadPimSentSw(ip75081PayloadPimSentSw);
   } 

     /**
	 * 	Update Ip75081PayloadPimSentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081PayloadPimSentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081PayloadPimSentSw,ip75081PayloadPimSentSw.length);
   	
   }
   
   public void setIp75081PayloadPimSentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPimSentSw,ip75081PayloadPimSentSw.length);
   	
   }
   
     /**
	 * 	Update Ip75081PayloadPimSentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PayloadPimSentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPimSentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081PayloadPimSentSw with another Field
	 *	@param value
	 */
   public void setIp75081PayloadPimSentSw(Field source) {
       replace(source,0,source.length(),beginIp75081PayloadPimSentSw,IP_75081_PAYLOAD_PIM_SENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081PayloadPimSentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081PayloadPimSentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081PayloadPimSentSw,IP_75081_PAYLOAD_PIM_SENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081PayloadPimSentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PayloadPimSentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPimSentSw+targetIndex,targetLen);
    
   }
	char[] ip75081PayloadPimY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081PayloadPimY88()
	 *	@return  Returns true if isIp75081PayloadPimY88() is "Y"
	 */
   public boolean isIp75081PayloadPimY88() throws CFException {
      return (  compareChars( getIp75081PayloadPimSentSw() , ip75081PayloadPimY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081PayloadPimY88True() {  			
    	setIp75081PayloadPimSentSw( ip75081PayloadPimY8888Value);
   	}
	char[] ip75081PayloadPimN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081PayloadPimN88()
	 *	@return  Returns true if isIp75081PayloadPimN88() is "N"
	 */
   public boolean isIp75081PayloadPimN88() throws CFException {
      return (  compareChars( getIp75081PayloadPimSentSw() , ip75081PayloadPimN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081PayloadPimN88True() {  			
    	setIp75081PayloadPimSentSw( ip75081PayloadPimN8888Value);
   	}
	/**
	 *	Returns the value of ip75081PayloadPmt1stTime
	 *	@return ip75081PayloadPmt1stTime
	 */
   public char[] getIp75081PayloadPmt1stTime() throws CFException{
     if (isIp75081PayloadPmt1stTimeModified()) { 
        ip75081PayloadPmt1stTime = refreshIp75081PayloadPmt1stTime();
     }
   		return ip75081PayloadPmt1stTime;
   }

  
	/**
	*  set variable ip75081PayloadPmt1stTime
	*  Corresponding COBOL Variable is IP75081-PAYLOAD-PMT-1ST-TIME
	*  @param value
	**/
   public void setIp75081PayloadPmt1stTime(char[] value) {
      ip75081PayloadPmt1stTime = checkIp75081PayloadPmt1stTimeConstraints(value);
      serializeIp75081PayloadPmt1stTime(ip75081PayloadPmt1stTime);
   } 

     /**
	 * 	Update Ip75081PayloadPmt1stTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081PayloadPmt1stTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081PayloadPmt1stTime,ip75081PayloadPmt1stTime.length);
   	
   }
   
   public void setIp75081PayloadPmt1stTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPmt1stTime,ip75081PayloadPmt1stTime.length);
   	
   }
   
     /**
	 * 	Update Ip75081PayloadPmt1stTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PayloadPmt1stTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPmt1stTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081PayloadPmt1stTime with another Field
	 *	@param value
	 */
   public void setIp75081PayloadPmt1stTime(Field source) {
       replace(source,0,source.length(),beginIp75081PayloadPmt1stTime,IP_75081_PAYLOAD_PMT_1ST_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081PayloadPmt1stTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081PayloadPmt1stTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081PayloadPmt1stTime,IP_75081_PAYLOAD_PMT_1ST_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081PayloadPmt1stTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PayloadPmt1stTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPmt1stTime+targetIndex,targetLen);
    
   }
	char[] ip75081PmtPayload1st8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081PmtPayload1st88()
	 *	@return  Returns true if isIp75081PmtPayload1st88() is "Y"
	 */
   public boolean isIp75081PmtPayload1st88() throws CFException {
      return (  compareChars( getIp75081PayloadPmt1stTime() , ip75081PmtPayload1st8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081PmtPayload1st88True() {  			
    	setIp75081PayloadPmt1stTime( ip75081PmtPayload1st8888Value);
   	}
	char[] ip75081PmtPayloadNt1st8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081PmtPayloadNt1st88()
	 *	@return  Returns true if isIp75081PmtPayloadNt1st88() is "N"
	 */
   public boolean isIp75081PmtPayloadNt1st88() throws CFException {
      return (  compareChars( getIp75081PayloadPmt1stTime() , ip75081PmtPayloadNt1st8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081PmtPayloadNt1st88True() {  			
    	setIp75081PayloadPmt1stTime( ip75081PmtPayloadNt1st8888Value);
   	}
	/**
	 *	Returns the value of ip75081PyldPmaIdn1stTime
	 *	@return ip75081PyldPmaIdn1stTime
	 */
   public char[] getIp75081PyldPmaIdn1stTime() throws CFException{
     if (isIp75081PyldPmaIdn1stTimeModified()) { 
        ip75081PyldPmaIdn1stTime = refreshIp75081PyldPmaIdn1stTime();
     }
   		return ip75081PyldPmaIdn1stTime;
   }

  
	/**
	*  set variable ip75081PyldPmaIdn1stTime
	*  Corresponding COBOL Variable is IP75081-PYLD-PMA-IDN-1ST-TIME
	*  @param value
	**/
   public void setIp75081PyldPmaIdn1stTime(char[] value) {
      ip75081PyldPmaIdn1stTime = checkIp75081PyldPmaIdn1stTimeConstraints(value);
      serializeIp75081PyldPmaIdn1stTime(ip75081PyldPmaIdn1stTime);
   } 

     /**
	 * 	Update Ip75081PyldPmaIdn1stTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081PyldPmaIdn1stTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081PyldPmaIdn1stTime,ip75081PyldPmaIdn1stTime.length);
   	
   }
   
   public void setIp75081PyldPmaIdn1stTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmaIdn1stTime,ip75081PyldPmaIdn1stTime.length);
   	
   }
   
     /**
	 * 	Update Ip75081PyldPmaIdn1stTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PyldPmaIdn1stTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmaIdn1stTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081PyldPmaIdn1stTime with another Field
	 *	@param value
	 */
   public void setIp75081PyldPmaIdn1stTime(Field source) {
       replace(source,0,source.length(),beginIp75081PyldPmaIdn1stTime,IP_75081_PYLD_PMA_IDN_1ST_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081PyldPmaIdn1stTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081PyldPmaIdn1stTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081PyldPmaIdn1stTime,IP_75081_PYLD_PMA_IDN_1ST_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081PyldPmaIdn1stTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PyldPmaIdn1stTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmaIdn1stTime+targetIndex,targetLen);
    
   }
	char[] ip75081IdnPmaPyld1st8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081IdnPmaPyld1st88()
	 *	@return  Returns true if isIp75081IdnPmaPyld1st88() is "Y"
	 */
   public boolean isIp75081IdnPmaPyld1st88() throws CFException {
      return (  compareChars( getIp75081PyldPmaIdn1stTime() , ip75081IdnPmaPyld1st8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081IdnPmaPyld1st88True() {  			
    	setIp75081PyldPmaIdn1stTime( ip75081IdnPmaPyld1st8888Value);
   	}
	char[] ip75081IdnPmaPyldNt1st8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081IdnPmaPyldNt1st88()
	 *	@return  Returns true if isIp75081IdnPmaPyldNt1st88() is "N"
	 */
   public boolean isIp75081IdnPmaPyldNt1st88() throws CFException {
      return (  compareChars( getIp75081PyldPmaIdn1stTime() , ip75081IdnPmaPyldNt1st8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081IdnPmaPyldNt1st88True() {  			
    	setIp75081PyldPmaIdn1stTime( ip75081IdnPmaPyldNt1st8888Value);
   	}
	/**
	 *	Returns the value of ip75081PyldPmiIdn1stTime
	 *	@return ip75081PyldPmiIdn1stTime
	 */
   public char[] getIp75081PyldPmiIdn1stTime() throws CFException{
     if (isIp75081PyldPmiIdn1stTimeModified()) { 
        ip75081PyldPmiIdn1stTime = refreshIp75081PyldPmiIdn1stTime();
     }
   		return ip75081PyldPmiIdn1stTime;
   }

  
	/**
	*  set variable ip75081PyldPmiIdn1stTime
	*  Corresponding COBOL Variable is IP75081-PYLD-PMI-IDN-1ST-TIME
	*  @param value
	**/
   public void setIp75081PyldPmiIdn1stTime(char[] value) {
      ip75081PyldPmiIdn1stTime = checkIp75081PyldPmiIdn1stTimeConstraints(value);
      serializeIp75081PyldPmiIdn1stTime(ip75081PyldPmiIdn1stTime);
   } 

     /**
	 * 	Update Ip75081PyldPmiIdn1stTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081PyldPmiIdn1stTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081PyldPmiIdn1stTime,ip75081PyldPmiIdn1stTime.length);
   	
   }
   
   public void setIp75081PyldPmiIdn1stTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmiIdn1stTime,ip75081PyldPmiIdn1stTime.length);
   	
   }
   
     /**
	 * 	Update Ip75081PyldPmiIdn1stTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PyldPmiIdn1stTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmiIdn1stTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081PyldPmiIdn1stTime with another Field
	 *	@param value
	 */
   public void setIp75081PyldPmiIdn1stTime(Field source) {
       replace(source,0,source.length(),beginIp75081PyldPmiIdn1stTime,IP_75081_PYLD_PMI_IDN_1ST_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081PyldPmiIdn1stTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081PyldPmiIdn1stTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081PyldPmiIdn1stTime,IP_75081_PYLD_PMI_IDN_1ST_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081PyldPmiIdn1stTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PyldPmiIdn1stTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmiIdn1stTime+targetIndex,targetLen);
    
   }
	char[] ip75081IdnPmiPyld1st8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081IdnPmiPyld1st88()
	 *	@return  Returns true if isIp75081IdnPmiPyld1st88() is "Y"
	 */
   public boolean isIp75081IdnPmiPyld1st88() throws CFException {
      return (  compareChars( getIp75081PyldPmiIdn1stTime() , ip75081IdnPmiPyld1st8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081IdnPmiPyld1st88True() {  			
    	setIp75081PyldPmiIdn1stTime( ip75081IdnPmiPyld1st8888Value);
   	}
	char[] ip75081IdnPmiPyldNt1st8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081IdnPmiPyldNt1st88()
	 *	@return  Returns true if isIp75081IdnPmiPyldNt1st88() is "N"
	 */
   public boolean isIp75081IdnPmiPyldNt1st88() throws CFException {
      return (  compareChars( getIp75081PyldPmiIdn1stTime() , ip75081IdnPmiPyldNt1st8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081IdnPmiPyldNt1st88True() {  			
    	setIp75081PyldPmiIdn1stTime( ip75081IdnPmiPyldNt1st8888Value);
   	}
	/**
	 *	Returns the value of ip75081PyldPmaRus1stTime
	 *	@return ip75081PyldPmaRus1stTime
	 */
   public char[] getIp75081PyldPmaRus1stTime() throws CFException{
     if (isIp75081PyldPmaRus1stTimeModified()) { 
        ip75081PyldPmaRus1stTime = refreshIp75081PyldPmaRus1stTime();
     }
   		return ip75081PyldPmaRus1stTime;
   }

  
	/**
	*  set variable ip75081PyldPmaRus1stTime
	*  Corresponding COBOL Variable is IP75081-PYLD-PMA-RUS-1ST-TIME
	*  @param value
	**/
   public void setIp75081PyldPmaRus1stTime(char[] value) {
      ip75081PyldPmaRus1stTime = checkIp75081PyldPmaRus1stTimeConstraints(value);
      serializeIp75081PyldPmaRus1stTime(ip75081PyldPmaRus1stTime);
   } 

     /**
	 * 	Update Ip75081PyldPmaRus1stTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081PyldPmaRus1stTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081PyldPmaRus1stTime,ip75081PyldPmaRus1stTime.length);
   	
   }
   
   public void setIp75081PyldPmaRus1stTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmaRus1stTime,ip75081PyldPmaRus1stTime.length);
   	
   }
   
     /**
	 * 	Update Ip75081PyldPmaRus1stTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PyldPmaRus1stTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmaRus1stTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081PyldPmaRus1stTime with another Field
	 *	@param value
	 */
   public void setIp75081PyldPmaRus1stTime(Field source) {
       replace(source,0,source.length(),beginIp75081PyldPmaRus1stTime,IP_75081_PYLD_PMA_RUS_1ST_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081PyldPmaRus1stTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081PyldPmaRus1stTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081PyldPmaRus1stTime,IP_75081_PYLD_PMA_RUS_1ST_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081PyldPmaRus1stTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PyldPmaRus1stTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmaRus1stTime+targetIndex,targetLen);
    
   }
	char[] ip75081RusPmaPyld1st8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081RusPmaPyld1st88()
	 *	@return  Returns true if isIp75081RusPmaPyld1st88() is "Y"
	 */
   public boolean isIp75081RusPmaPyld1st88() throws CFException {
      return (  compareChars( getIp75081PyldPmaRus1stTime() , ip75081RusPmaPyld1st8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081RusPmaPyld1st88True() {  			
    	setIp75081PyldPmaRus1stTime( ip75081RusPmaPyld1st8888Value);
   	}
	char[] ip75081RusPmaPyldNt1st8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081RusPmaPyldNt1st88()
	 *	@return  Returns true if isIp75081RusPmaPyldNt1st88() is "N"
	 */
   public boolean isIp75081RusPmaPyldNt1st88() throws CFException {
      return (  compareChars( getIp75081PyldPmaRus1stTime() , ip75081RusPmaPyldNt1st8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081RusPmaPyldNt1st88True() {  			
    	setIp75081PyldPmaRus1stTime( ip75081RusPmaPyldNt1st8888Value);
   	}
	/**
	 *	Returns the value of ip75081PyldPmiRus1stTime
	 *	@return ip75081PyldPmiRus1stTime
	 */
   public char[] getIp75081PyldPmiRus1stTime() throws CFException{
     if (isIp75081PyldPmiRus1stTimeModified()) { 
        ip75081PyldPmiRus1stTime = refreshIp75081PyldPmiRus1stTime();
     }
   		return ip75081PyldPmiRus1stTime;
   }

  
	/**
	*  set variable ip75081PyldPmiRus1stTime
	*  Corresponding COBOL Variable is IP75081-PYLD-PMI-RUS-1ST-TIME
	*  @param value
	**/
   public void setIp75081PyldPmiRus1stTime(char[] value) {
      ip75081PyldPmiRus1stTime = checkIp75081PyldPmiRus1stTimeConstraints(value);
      serializeIp75081PyldPmiRus1stTime(ip75081PyldPmiRus1stTime);
   } 

     /**
	 * 	Update Ip75081PyldPmiRus1stTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081PyldPmiRus1stTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081PyldPmiRus1stTime,ip75081PyldPmiRus1stTime.length);
   	
   }
   
   public void setIp75081PyldPmiRus1stTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmiRus1stTime,ip75081PyldPmiRus1stTime.length);
   	
   }
   
     /**
	 * 	Update Ip75081PyldPmiRus1stTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PyldPmiRus1stTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmiRus1stTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081PyldPmiRus1stTime with another Field
	 *	@param value
	 */
   public void setIp75081PyldPmiRus1stTime(Field source) {
       replace(source,0,source.length(),beginIp75081PyldPmiRus1stTime,IP_75081_PYLD_PMI_RUS_1ST_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081PyldPmiRus1stTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081PyldPmiRus1stTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081PyldPmiRus1stTime,IP_75081_PYLD_PMI_RUS_1ST_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081PyldPmiRus1stTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PyldPmiRus1stTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PyldPmiRus1stTime+targetIndex,targetLen);
    
   }
	char[] ip75081RusPmiPyld1st8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081RusPmiPyld1st88()
	 *	@return  Returns true if isIp75081RusPmiPyld1st88() is "Y"
	 */
   public boolean isIp75081RusPmiPyld1st88() throws CFException {
      return (  compareChars( getIp75081PyldPmiRus1stTime() , ip75081RusPmiPyld1st8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081RusPmiPyld1st88True() {  			
    	setIp75081PyldPmiRus1stTime( ip75081RusPmiPyld1st8888Value);
   	}
	char[] ip75081RusPmiPyldNt1st8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081RusPmiPyldNt1st88()
	 *	@return  Returns true if isIp75081RusPmiPyldNt1st88() is "N"
	 */
   public boolean isIp75081RusPmiPyldNt1st88() throws CFException {
      return (  compareChars( getIp75081PyldPmiRus1stTime() , ip75081RusPmiPyldNt1st8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081RusPmiPyldNt1st88True() {  			
    	setIp75081PyldPmiRus1stTime( ip75081RusPmiPyldNt1st8888Value);
   	}
	/**
	 *	Returns the value of ip75081PayloadPim1stTime
	 *	@return ip75081PayloadPim1stTime
	 */
   public char[] getIp75081PayloadPim1stTime() throws CFException{
     if (isIp75081PayloadPim1stTimeModified()) { 
        ip75081PayloadPim1stTime = refreshIp75081PayloadPim1stTime();
     }
   		return ip75081PayloadPim1stTime;
   }

  
	/**
	*  set variable ip75081PayloadPim1stTime
	*  Corresponding COBOL Variable is IP75081-PAYLOAD-PIM-1ST-TIME
	*  @param value
	**/
   public void setIp75081PayloadPim1stTime(char[] value) {
      ip75081PayloadPim1stTime = checkIp75081PayloadPim1stTimeConstraints(value);
      serializeIp75081PayloadPim1stTime(ip75081PayloadPim1stTime);
   } 

     /**
	 * 	Update Ip75081PayloadPim1stTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081PayloadPim1stTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081PayloadPim1stTime,ip75081PayloadPim1stTime.length);
   	
   }
   
   public void setIp75081PayloadPim1stTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPim1stTime,ip75081PayloadPim1stTime.length);
   	
   }
   
     /**
	 * 	Update Ip75081PayloadPim1stTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PayloadPim1stTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPim1stTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081PayloadPim1stTime with another Field
	 *	@param value
	 */
   public void setIp75081PayloadPim1stTime(Field source) {
       replace(source,0,source.length(),beginIp75081PayloadPim1stTime,IP_75081_PAYLOAD_PIM_1ST_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081PayloadPim1stTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081PayloadPim1stTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081PayloadPim1stTime,IP_75081_PAYLOAD_PIM_1ST_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081PayloadPim1stTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081PayloadPim1stTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081PayloadPim1stTime+targetIndex,targetLen);
    
   }
	char[] ip75081PimPayload1st8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081PimPayload1st88()
	 *	@return  Returns true if isIp75081PimPayload1st88() is "Y"
	 */
   public boolean isIp75081PimPayload1st88() throws CFException {
      return (  compareChars( getIp75081PayloadPim1stTime() , ip75081PimPayload1st8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081PimPayload1st88True() {  			
    	setIp75081PayloadPim1stTime( ip75081PimPayload1st8888Value);
   	}
	char[] ip75081PimPayloadNt1st8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081PimPayloadNt1st88()
	 *	@return  Returns true if isIp75081PimPayloadNt1st88() is "N"
	 */
   public boolean isIp75081PimPayloadNt1st88() throws CFException {
      return (  compareChars( getIp75081PayloadPim1stTime() , ip75081PimPayloadNt1st8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081PimPayloadNt1st88True() {  			
    	setIp75081PayloadPim1stTime( ip75081PimPayloadNt1st8888Value);
   	}
	/**
	 *	Returns the value of ip75081AccntNum
	 *	@return ip75081AccntNum
	 */
   public char[] getIp75081AccntNum() throws CFException{
     if (isIp75081AccntNumModified()) { 
        ip75081AccntNum = refreshIp75081AccntNum();
     }
   		return ip75081AccntNum;
   }

  
	/**
	*  set variable ip75081AccntNum
	*  Corresponding COBOL Variable is IP75081-ACCNT-NUM
	*  @param value
	**/
   public void setIp75081AccntNum(char[] value) {
      ip75081AccntNum = checkIp75081AccntNumConstraints(value);
      serializeIp75081AccntNum(ip75081AccntNum);
   } 

     /**
	 * 	Update Ip75081AccntNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081AccntNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081AccntNum,ip75081AccntNum.length);
   	
   }
   
   public void setIp75081AccntNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081AccntNum,ip75081AccntNum.length);
   	
   }
   
     /**
	 * 	Update Ip75081AccntNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081AccntNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081AccntNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081AccntNum with another Field
	 *	@param value
	 */
   public void setIp75081AccntNum(Field source) {
       replace(source,0,source.length(),beginIp75081AccntNum,IP_75081_ACCNT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081AccntNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081AccntNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081AccntNum,IP_75081_ACCNT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081AccntNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081AccntNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081AccntNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip75081IsItEndOfProcess
	 *	@return ip75081IsItEndOfProcess
	 */
   public char[] getIp75081IsItEndOfProcess() throws CFException{
     if (isIp75081IsItEndOfProcessModified()) { 
        ip75081IsItEndOfProcess = refreshIp75081IsItEndOfProcess();
     }
   		return ip75081IsItEndOfProcess;
   }

  
	/**
	*  set variable ip75081IsItEndOfProcess
	*  Corresponding COBOL Variable is IP75081-IS-IT-END-OF-PROCESS
	*  @param value
	**/
   public void setIp75081IsItEndOfProcess(char[] value) {
      ip75081IsItEndOfProcess = checkIp75081IsItEndOfProcessConstraints(value);
      serializeIp75081IsItEndOfProcess(ip75081IsItEndOfProcess);
   } 

     /**
	 * 	Update Ip75081IsItEndOfProcess 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081IsItEndOfProcess(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp75081IsItEndOfProcess,ip75081IsItEndOfProcess.length);
   	
   }
   
   public void setIp75081IsItEndOfProcess(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IsItEndOfProcess,ip75081IsItEndOfProcess.length);
   	
   }
   
     /**
	 * 	Update Ip75081IsItEndOfProcess 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IsItEndOfProcess(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IsItEndOfProcess+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip75081IsItEndOfProcess with another Field
	 *	@param value
	 */
   public void setIp75081IsItEndOfProcess(Field source) {
       replace(source,0,source.length(),beginIp75081IsItEndOfProcess,IP_75081_IS_IT_END_OF_PROCESS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip75081IsItEndOfProcess 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081IsItEndOfProcess(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp75081IsItEndOfProcess,IP_75081_IS_IT_END_OF_PROCESS_LEN);
   	
   }
   
     /**
	 * 	Update Ip75081IsItEndOfProcess 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081IsItEndOfProcess(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp75081IsItEndOfProcess+targetIndex,targetLen);
    
   }
	char[] ip75081EndOfProcess8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp75081EndOfProcess88()
	 *	@return  Returns true if isIp75081EndOfProcess88() is "Y"
	 */
   public boolean isIp75081EndOfProcess88() throws CFException {
      return (  compareChars( getIp75081IsItEndOfProcess() , ip75081EndOfProcess8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp75081EndOfProcess88True() {  			
    	setIp75081IsItEndOfProcess( ip75081EndOfProcess8888Value);
   	}
	char[] ip75081NtEndOfProcess8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp75081NtEndOfProcess88()
	 *	@return  Returns true if isIp75081NtEndOfProcess88() is "N"
	 */
   public boolean isIp75081NtEndOfProcess88() throws CFException {
      return (  compareChars( getIp75081IsItEndOfProcess() , ip75081NtEndOfProcess8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp75081NtEndOfProcess88True() {  			
    	setIp75081IsItEndOfProcess( ip75081NtEndOfProcess8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip75081MqSwitches
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp75081MqOptions(CONSTANTS.SPACE);
         setIp75081IsFromPgm(CONSTANTS.SPACE);
         setIp75081IsForTable(CONSTANTS.SPACE);
         setIp75081PayloadPmtSentSw(CONSTANTS.SPACE);
         setIp75081IdnPyldPmaSentSw(CONSTANTS.SPACE);
         setIp75081IdnPyldPmiSentSw(CONSTANTS.SPACE);
         setIp75081RusPyldPmaSentSw(CONSTANTS.SPACE);
         setIp75081RusPyldPmiSentSw(CONSTANTS.SPACE);
         setIp75081PayloadPimSentSw(CONSTANTS.SPACE);
         setIp75081PayloadPmt1stTime(CONSTANTS.SPACE);
         setIp75081PyldPmaIdn1stTime(CONSTANTS.SPACE);
         setIp75081PyldPmiIdn1stTime(CONSTANTS.SPACE);
         setIp75081PyldPmaRus1stTime(CONSTANTS.SPACE);
         setIp75081PyldPmiRus1stTime(CONSTANTS.SPACE);
         setIp75081PayloadPim1stTime(CONSTANTS.SPACE);
         setIp75081AccntNum(CONSTANTS.SPACE_19);
         setIp75081IsItEndOfProcess(CONSTANTS.SPACE);
   }

		public static int getIp75081MqSwitchesFieldLength() {
			return IP_75081_MQ_SWITCHES_LENGTH;
		}

}
  
