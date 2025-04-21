package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wTableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02014wTableDataFields extends Ip02014wTableDataFieldsSerialized { 
   

						private char[] ip02014wGeoScopeCode = Field.fillLowValue(1);

						private char[] ip02014wHostInd = Field.fillLowValue(1);
				private Ip02014wImpBulkId ip02014wImpBulkId = new Ip02014wImpBulkId();

								private int ip02014wNumCurrCd;

						private char[] ip02014wOfsoilDataTypCd = Field.fillLowValue(3);

						private char[] ip02014wMrchntSplitCd = Field.fillLowValue(1);

						private char[] ip02014wCurrSplitCd = Field.fillLowValue(1);

						private char[] ip02014wAcquirerSplitCd = Field.fillLowValue(1);

						private char[] ip02014wDomCollOnlyCd = Field.fillLowValue(1);

						private char[] ip02014wOnsoilDataShrSw = Field.fillLowValue(1);

								private int ip02014wClrCycleNum;

						private char[] ip02014wDtaWrhsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wBllngOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wSetlOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wClrOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wAmsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wMcomOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wMdsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wStndInOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wAuthOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wPushOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wIncontrolOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wEsrvcOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wGftOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wBnknetOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wMdesOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wZappOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wCemOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014wRptHdrName = Field.fillLowValue(80);

						private char[] ip02014wClrPrcssCd = Field.fillLowValue(4);

						private char[] ip02014wOnUsPrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip02014wOperSysId = Field.fillLowValue(20);

						private char[] ip02014wDbId = Field.fillLowValue(20);

						private char[] ip02014wFiller = Field.fillLowValue(750);
	
	/**
	* Constructor for Ip02014wTableDataFields
	**/
    public Ip02014wTableDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014wTableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wTableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip02014wImpBulkId.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of ip02014wGeoScopeCode
	 *	@return ip02014wGeoScopeCode
	 */
   public char[] getIp02014wGeoScopeCode() throws CFException{
     if (isIp02014wGeoScopeCodeModified()) { 
        ip02014wGeoScopeCode = refreshIp02014wGeoScopeCode();
     }
   		return ip02014wGeoScopeCode;
   }

  
	/**
	*  set variable ip02014wGeoScopeCode
	*  Corresponding COBOL Variable is IP02014W-GEO-SCOPE-CODE
	*  @param value
	**/
   public void setIp02014wGeoScopeCode(char[] value) {
      ip02014wGeoScopeCode = checkIp02014wGeoScopeCodeConstraints(value);
      serializeIp02014wGeoScopeCode(ip02014wGeoScopeCode);
   } 

     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wGeoScopeCode,ip02014wGeoScopeCode.length);
   	
   }
   
   public void setIp02014wGeoScopeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wGeoScopeCode,ip02014wGeoScopeCode.length);
   	
   }
   
     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wGeoScopeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wGeoScopeCode with another Field
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(Field source) {
       replace(source,0,source.length(),beginIp02014wGeoScopeCode,IP_02014W_GEO_SCOPE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wGeoScopeCode,IP_02014W_GEO_SCOPE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wGeoScopeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGeoScopeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wGeoScopeCode+targetIndex,targetLen);
    
   }
	char[] ip02014wPaGlobal8888Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isIp02014wPaGlobal88()
	 *	@return  Returns true if isIp02014wPaGlobal88() is "G"
	 */
   public boolean isIp02014wPaGlobal88() throws CFException {
      return (  compareChars( getIp02014wGeoScopeCode() , ip02014wPaGlobal8888Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setIp02014wPaGlobal88True() {  			
    	setIp02014wGeoScopeCode( ip02014wPaGlobal8888Value);
   	}
	char[] ip02014wPaLocal8888Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isIp02014wPaLocal88()
	 *	@return  Returns true if isIp02014wPaLocal88() is "L"
	 */
   public boolean isIp02014wPaLocal88() throws CFException {
      return (  compareChars( getIp02014wGeoScopeCode() , ip02014wPaLocal8888Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setIp02014wPaLocal88True() {  			
    	setIp02014wGeoScopeCode( ip02014wPaLocal8888Value);
   	}
	char[] ip02014wPaRegional8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp02014wPaRegional88()
	 *	@return  Returns true if isIp02014wPaRegional88() is "R"
	 */
   public boolean isIp02014wPaRegional88() throws CFException {
      return (  compareChars( getIp02014wGeoScopeCode() , ip02014wPaRegional8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp02014wPaRegional88True() {  			
    	setIp02014wGeoScopeCode( ip02014wPaRegional8888Value);
   	}
	/**
	 *	Returns the value of ip02014wHostInd
	 *	@return ip02014wHostInd
	 */
   public char[] getIp02014wHostInd() throws CFException{
     if (isIp02014wHostIndModified()) { 
        ip02014wHostInd = refreshIp02014wHostInd();
     }
   		return ip02014wHostInd;
   }

  
	/**
	*  set variable ip02014wHostInd
	*  Corresponding COBOL Variable is IP02014W-HOST-IND
	*  @param value
	**/
   public void setIp02014wHostInd(char[] value) {
      ip02014wHostInd = checkIp02014wHostIndConstraints(value);
      serializeIp02014wHostInd(ip02014wHostInd);
   } 

     /**
	 * 	Update Ip02014wHostInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wHostInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wHostInd,ip02014wHostInd.length);
   	
   }
   
   public void setIp02014wHostInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wHostInd,ip02014wHostInd.length);
   	
   }
   
     /**
	 * 	Update Ip02014wHostInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wHostInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wHostInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wHostInd with another Field
	 *	@param value
	 */
   public void setIp02014wHostInd(Field source) {
       replace(source,0,source.length(),beginIp02014wHostInd,IP_02014W_HOST_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wHostInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wHostInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wHostInd,IP_02014W_HOST_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wHostInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wHostInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wHostInd+targetIndex,targetLen);
    
   }
	char[] ip02014wPaIsHost8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014wPaIsHost88()
	 *	@return  Returns true if isIp02014wPaIsHost88() is "Y"
	 */
   public boolean isIp02014wPaIsHost88() throws CFException {
      return (  compareChars( getIp02014wHostInd() , ip02014wPaIsHost8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014wPaIsHost88True() {  			
    	setIp02014wHostInd( ip02014wPaIsHost8888Value);
   	}
	char[] ip02014wNotTheHost8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014wNotTheHost88()
	 *	@return  Returns true if isIp02014wNotTheHost88() is "N"
	 */
   public boolean isIp02014wNotTheHost88() throws CFException {
      return (  compareChars( getIp02014wHostInd() , ip02014wNotTheHost8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014wNotTheHost88True() {  			
    	setIp02014wHostInd( ip02014wNotTheHost8888Value);
   	}
	/**
	 *	Returns the value of ip02014wImpBulkId
	 *	@return ip02014wImpBulkId
	 */   
	 public Ip02014wImpBulkId getIp02014wImpBulkId() {
   	return ip02014wImpBulkId;
   }
   /**
	* 	Update Ip02014wImpBulkId with the passed value
	*   Corresponding COBOL Variable is IP02014W-IMP-BULK-ID
	*	@param value
	*/
   public void setIp02014wImpBulkId(char[] value) {
      ip02014wImpBulkId.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014wImpBulkId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wImpBulkId.begin,ip02014wImpBulkId.length());
   }
   
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wImpBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wImpBulkId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014wImpBulkId with another Field
	 *	@param value
	 */
   public void setIp02014wImpBulkId(Field source) {
   	replace(source,0,source.length(),ip02014wImpBulkId.begin,ip02014wImpBulkId.length());
   }  
   
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014wImpBulkId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wImpBulkId.begin,ip02014wImpBulkId.length());
   }
   
     /**
	 * 	Update Ip02014wImpBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wImpBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wImpBulkId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip02014wNumCurrCd
	 *	@return ip02014wNumCurrCd
	 */
	public int getIp02014wNumCurrCd() throws CFException {
       if (isIp02014wNumCurrCdModified()) { 
           ip02014wNumCurrCd = refreshIp02014wNumCurrCd();
        }
   		return ip02014wNumCurrCd;
	}
	

	
	   
	/**
	 * 	Update Ip02014wNumCurrCd with the passed value
	 *  Corresponding COBOL Variable is IP02014W-NUM-CURR-CD
	 *	@param number
	 */
	public void setIp02014wNumCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip02014wNumCurrCd = checkIp02014wNumCurrCdMaxLimit(number); 
		serializeIp02014wNumCurrCd(ip02014wNumCurrCd);
	}
	

	public void setIp02014wNumCurrCd(long number) {
	    number = checkIp02014wNumCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02014wNumCurrCd((int)number);
	}
	
	/**
	 * 	Update Ip02014wNumCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014wNumCurrCd(char[] value) throws CFException {
		 ip02014wNumCurrCd = serializeIp02014wNumCurrCd(value);
	}
	/**
	 * 	Update Ip02014wNumCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014wNumCurrCdString(char[] value) throws CFException {
		 setIp02014wNumCurrCd(value);
	}
	/**
	 *	Returns the value of ip02014wOfsoilDataTypCd
	 *	@return ip02014wOfsoilDataTypCd
	 */
   public char[] getIp02014wOfsoilDataTypCd() throws CFException{
     if (isIp02014wOfsoilDataTypCdModified()) { 
        ip02014wOfsoilDataTypCd = refreshIp02014wOfsoilDataTypCd();
     }
   		return ip02014wOfsoilDataTypCd;
   }

  
	/**
	*  set variable ip02014wOfsoilDataTypCd
	*  Corresponding COBOL Variable is IP02014W-OFSOIL-DATA-TYP-CD
	*  @param value
	**/
   public void setIp02014wOfsoilDataTypCd(char[] value) {
      ip02014wOfsoilDataTypCd = checkIp02014wOfsoilDataTypCdConstraints(value);
      serializeIp02014wOfsoilDataTypCd(ip02014wOfsoilDataTypCd);
   } 

     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wOfsoilDataTypCd,ip02014wOfsoilDataTypCd.length);
   	
   }
   
   public void setIp02014wOfsoilDataTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOfsoilDataTypCd,ip02014wOfsoilDataTypCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOfsoilDataTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wOfsoilDataTypCd with another Field
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(Field source) {
       replace(source,0,source.length(),beginIp02014wOfsoilDataTypCd,IP_02014W_OFSOIL_DATA_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wOfsoilDataTypCd,IP_02014W_OFSOIL_DATA_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wOfsoilDataTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOfsoilDataTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOfsoilDataTypCd+targetIndex,targetLen);
    
   }
	char[] ip02014wPaTransLevel8888Value = "TXL".toCharArray();
	/**
	 *	Test condition "TXL" for isIp02014wPaTransLevel88()
	 *	@return  Returns true if isIp02014wPaTransLevel88() is "TXL"
	 */
   public boolean isIp02014wPaTransLevel88() throws CFException {
      return (  compareChars( getIp02014wOfsoilDataTypCd() , ip02014wPaTransLevel8888Value)  == 0  );
   }


	/**
	*  set values "TXL"
	*/
   	public void setIp02014wPaTransLevel88True() {  			
    	setIp02014wOfsoilDataTypCd( ip02014wPaTransLevel8888Value);
   	}
	char[] ip02014wPaTransLevelObs8888Value = "TXO".toCharArray();
	/**
	 *	Test condition "TXO" for isIp02014wPaTransLevelObs88()
	 *	@return  Returns true if isIp02014wPaTransLevelObs88() is "TXO"
	 */
   public boolean isIp02014wPaTransLevelObs88() throws CFException {
      return (  compareChars( getIp02014wOfsoilDataTypCd() , ip02014wPaTransLevelObs8888Value)  == 0  );
   }


	/**
	*  set values "TXO"
	*/
   	public void setIp02014wPaTransLevelObs88True() {  			
    	setIp02014wOfsoilDataTypCd( ip02014wPaTransLevelObs8888Value);
   	}
	char[] ip02014wPaSummaryLevel8888Value = "SUM".toCharArray();
	/**
	 *	Test condition "SUM" for isIp02014wPaSummaryLevel88()
	 *	@return  Returns true if isIp02014wPaSummaryLevel88() is "SUM"
	 */
   public boolean isIp02014wPaSummaryLevel88() throws CFException {
      return (  compareChars( getIp02014wOfsoilDataTypCd() , ip02014wPaSummaryLevel8888Value)  == 0  );
   }


	/**
	*  set values "SUM"
	*/
   	public void setIp02014wPaSummaryLevel88True() {  			
    	setIp02014wOfsoilDataTypCd( ip02014wPaSummaryLevel8888Value);
   	}
	/**
	 *	Returns the value of ip02014wMrchntSplitCd
	 *	@return ip02014wMrchntSplitCd
	 */
   public char[] getIp02014wMrchntSplitCd() throws CFException{
     if (isIp02014wMrchntSplitCdModified()) { 
        ip02014wMrchntSplitCd = refreshIp02014wMrchntSplitCd();
     }
   		return ip02014wMrchntSplitCd;
   }

  
	/**
	*  set variable ip02014wMrchntSplitCd
	*  Corresponding COBOL Variable is IP02014W-MRCHNT-SPLIT-CD
	*  @param value
	**/
   public void setIp02014wMrchntSplitCd(char[] value) {
      ip02014wMrchntSplitCd = checkIp02014wMrchntSplitCdConstraints(value);
      serializeIp02014wMrchntSplitCd(ip02014wMrchntSplitCd);
   } 

     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wMrchntSplitCd,ip02014wMrchntSplitCd.length);
   	
   }
   
   public void setIp02014wMrchntSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMrchntSplitCd,ip02014wMrchntSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMrchntSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wMrchntSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02014wMrchntSplitCd,IP_02014W_MRCHNT_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wMrchntSplitCd,IP_02014W_MRCHNT_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wMrchntSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMrchntSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMrchntSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02014wIncMrchtSpltY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014wIncMrchtSpltY88()
	 *	@return  Returns true if isIp02014wIncMrchtSpltY88() is "Y"
	 */
   public boolean isIp02014wIncMrchtSpltY88() throws CFException {
      return (  compareChars( getIp02014wMrchntSplitCd() , ip02014wIncMrchtSpltY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014wIncMrchtSpltY88True() {  			
    	setIp02014wMrchntSplitCd( ip02014wIncMrchtSpltY8888Value);
   	}
	char[] ip02014wIncMrchtSpltN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014wIncMrchtSpltN88()
	 *	@return  Returns true if isIp02014wIncMrchtSpltN88() is "N"
	 */
   public boolean isIp02014wIncMrchtSpltN88() throws CFException {
      return (  compareChars( getIp02014wMrchntSplitCd() , ip02014wIncMrchtSpltN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014wIncMrchtSpltN88True() {  			
    	setIp02014wMrchntSplitCd( ip02014wIncMrchtSpltN8888Value);
   	}
	char[] ip02014wIncMrchntSpltC8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02014wIncMrchntSpltC88()
	 *	@return  Returns true if isIp02014wIncMrchntSpltC88() is "C"
	 */
   public boolean isIp02014wIncMrchntSpltC88() throws CFException {
      return (  compareChars( getIp02014wMrchntSplitCd() , ip02014wIncMrchntSpltC8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02014wIncMrchntSpltC88True() {  			
    	setIp02014wMrchntSplitCd( ip02014wIncMrchntSpltC8888Value);
   	}
	/**
	 *	Returns the value of ip02014wCurrSplitCd
	 *	@return ip02014wCurrSplitCd
	 */
   public char[] getIp02014wCurrSplitCd() throws CFException{
     if (isIp02014wCurrSplitCdModified()) { 
        ip02014wCurrSplitCd = refreshIp02014wCurrSplitCd();
     }
   		return ip02014wCurrSplitCd;
   }

  
	/**
	*  set variable ip02014wCurrSplitCd
	*  Corresponding COBOL Variable is IP02014W-CURR-SPLIT-CD
	*  @param value
	**/
   public void setIp02014wCurrSplitCd(char[] value) {
      ip02014wCurrSplitCd = checkIp02014wCurrSplitCdConstraints(value);
      serializeIp02014wCurrSplitCd(ip02014wCurrSplitCd);
   } 

     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wCurrSplitCd,ip02014wCurrSplitCd.length);
   	
   }
   
   public void setIp02014wCurrSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wCurrSplitCd,ip02014wCurrSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wCurrSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wCurrSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02014wCurrSplitCd,IP_02014W_CURR_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wCurrSplitCd,IP_02014W_CURR_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wCurrSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCurrSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wCurrSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02014wCurrSplitYes8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014wCurrSplitYes88()
	 *	@return  Returns true if isIp02014wCurrSplitYes88() is "Y"
	 */
   public boolean isIp02014wCurrSplitYes88() throws CFException {
      return (  compareChars( getIp02014wCurrSplitCd() , ip02014wCurrSplitYes8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014wCurrSplitYes88True() {  			
    	setIp02014wCurrSplitCd( ip02014wCurrSplitYes8888Value);
   	}
	char[] ip02014wCurrSpitNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014wCurrSpitNo88()
	 *	@return  Returns true if isIp02014wCurrSpitNo88() is "N"
	 */
   public boolean isIp02014wCurrSpitNo88() throws CFException {
      return (  compareChars( getIp02014wCurrSplitCd() , ip02014wCurrSpitNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014wCurrSpitNo88True() {  			
    	setIp02014wCurrSplitCd( ip02014wCurrSpitNo8888Value);
   	}
	char[] ip02014wCurrSplitCond8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02014wCurrSplitCond88()
	 *	@return  Returns true if isIp02014wCurrSplitCond88() is "C"
	 */
   public boolean isIp02014wCurrSplitCond88() throws CFException {
      return (  compareChars( getIp02014wCurrSplitCd() , ip02014wCurrSplitCond8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02014wCurrSplitCond88True() {  			
    	setIp02014wCurrSplitCd( ip02014wCurrSplitCond8888Value);
   	}
	/**
	 *	Returns the value of ip02014wAcquirerSplitCd
	 *	@return ip02014wAcquirerSplitCd
	 */
   public char[] getIp02014wAcquirerSplitCd() throws CFException{
     if (isIp02014wAcquirerSplitCdModified()) { 
        ip02014wAcquirerSplitCd = refreshIp02014wAcquirerSplitCd();
     }
   		return ip02014wAcquirerSplitCd;
   }

  
	/**
	*  set variable ip02014wAcquirerSplitCd
	*  Corresponding COBOL Variable is IP02014W-ACQUIRER-SPLIT-CD
	*  @param value
	**/
   public void setIp02014wAcquirerSplitCd(char[] value) {
      ip02014wAcquirerSplitCd = checkIp02014wAcquirerSplitCdConstraints(value);
      serializeIp02014wAcquirerSplitCd(ip02014wAcquirerSplitCd);
   } 

     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wAcquirerSplitCd,ip02014wAcquirerSplitCd.length);
   	
   }
   
   public void setIp02014wAcquirerSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wAcquirerSplitCd,ip02014wAcquirerSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wAcquirerSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wAcquirerSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02014wAcquirerSplitCd,IP_02014W_ACQUIRER_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wAcquirerSplitCd,IP_02014W_ACQUIRER_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wAcquirerSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAcquirerSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wAcquirerSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02014wAcquirerSplitYes8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014wAcquirerSplitYes88()
	 *	@return  Returns true if isIp02014wAcquirerSplitYes88() is "Y"
	 */
   public boolean isIp02014wAcquirerSplitYes88() throws CFException {
      return (  compareChars( getIp02014wAcquirerSplitCd() , ip02014wAcquirerSplitYes8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014wAcquirerSplitYes88True() {  			
    	setIp02014wAcquirerSplitCd( ip02014wAcquirerSplitYes8888Value);
   	}
	char[] ip02014wAcquirerSplitNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014wAcquirerSplitNo88()
	 *	@return  Returns true if isIp02014wAcquirerSplitNo88() is "N"
	 */
   public boolean isIp02014wAcquirerSplitNo88() throws CFException {
      return (  compareChars( getIp02014wAcquirerSplitCd() , ip02014wAcquirerSplitNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014wAcquirerSplitNo88True() {  			
    	setIp02014wAcquirerSplitCd( ip02014wAcquirerSplitNo8888Value);
   	}
	char[] ip02014wAcquirerSplitCon8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02014wAcquirerSplitCon88()
	 *	@return  Returns true if isIp02014wAcquirerSplitCon88() is "C"
	 */
   public boolean isIp02014wAcquirerSplitCon88() throws CFException {
      return (  compareChars( getIp02014wAcquirerSplitCd() , ip02014wAcquirerSplitCon8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02014wAcquirerSplitCon88True() {  			
    	setIp02014wAcquirerSplitCd( ip02014wAcquirerSplitCon8888Value);
   	}
	/**
	 *	Returns the value of ip02014wDomCollOnlyCd
	 *	@return ip02014wDomCollOnlyCd
	 */
   public char[] getIp02014wDomCollOnlyCd() throws CFException{
     if (isIp02014wDomCollOnlyCdModified()) { 
        ip02014wDomCollOnlyCd = refreshIp02014wDomCollOnlyCd();
     }
   		return ip02014wDomCollOnlyCd;
   }

  
	/**
	*  set variable ip02014wDomCollOnlyCd
	*  Corresponding COBOL Variable is IP02014W-DOM-COLL-ONLY-CD
	*  @param value
	**/
   public void setIp02014wDomCollOnlyCd(char[] value) {
      ip02014wDomCollOnlyCd = checkIp02014wDomCollOnlyCdConstraints(value);
      serializeIp02014wDomCollOnlyCd(ip02014wDomCollOnlyCd);
   } 

     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wDomCollOnlyCd,ip02014wDomCollOnlyCd.length);
   	
   }
   
   public void setIp02014wDomCollOnlyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wDomCollOnlyCd,ip02014wDomCollOnlyCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wDomCollOnlyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wDomCollOnlyCd with another Field
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(Field source) {
       replace(source,0,source.length(),beginIp02014wDomCollOnlyCd,IP_02014W_DOM_COLL_ONLY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wDomCollOnlyCd,IP_02014W_DOM_COLL_ONLY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wDomCollOnlyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDomCollOnlyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wDomCollOnlyCd+targetIndex,targetLen);
    
   }
	char[] ip02014wDomCollOnlySplt8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp02014wDomCollOnlySplt88()
	 *	@return  Returns true if isIp02014wDomCollOnlySplt88() is "S"
	 */
   public boolean isIp02014wDomCollOnlySplt88() throws CFException {
      return (  compareChars( getIp02014wDomCollOnlyCd() , ip02014wDomCollOnlySplt8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp02014wDomCollOnlySplt88True() {  			
    	setIp02014wDomCollOnlyCd( ip02014wDomCollOnlySplt8888Value);
   	}
	char[] ip02014wDomCollOnlyHost8888Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isIp02014wDomCollOnlyHost88()
	 *	@return  Returns true if isIp02014wDomCollOnlyHost88() is "H"
	 */
   public boolean isIp02014wDomCollOnlyHost88() throws CFException {
      return (  compareChars( getIp02014wDomCollOnlyCd() , ip02014wDomCollOnlyHost8888Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setIp02014wDomCollOnlyHost88True() {  			
    	setIp02014wDomCollOnlyCd( ip02014wDomCollOnlyHost8888Value);
   	}
	/**
	 *	Returns the value of ip02014wOnsoilDataShrSw
	 *	@return ip02014wOnsoilDataShrSw
	 */
   public char[] getIp02014wOnsoilDataShrSw() throws CFException{
     if (isIp02014wOnsoilDataShrSwModified()) { 
        ip02014wOnsoilDataShrSw = refreshIp02014wOnsoilDataShrSw();
     }
   		return ip02014wOnsoilDataShrSw;
   }

  
	/**
	*  set variable ip02014wOnsoilDataShrSw
	*  Corresponding COBOL Variable is IP02014W-ONSOIL-DATA-SHR-SW
	*  @param value
	**/
   public void setIp02014wOnsoilDataShrSw(char[] value) {
      ip02014wOnsoilDataShrSw = checkIp02014wOnsoilDataShrSwConstraints(value);
      serializeIp02014wOnsoilDataShrSw(ip02014wOnsoilDataShrSw);
   } 

     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wOnsoilDataShrSw,ip02014wOnsoilDataShrSw.length);
   	
   }
   
   public void setIp02014wOnsoilDataShrSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOnsoilDataShrSw,ip02014wOnsoilDataShrSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOnsoilDataShrSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wOnsoilDataShrSw with another Field
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(Field source) {
       replace(source,0,source.length(),beginIp02014wOnsoilDataShrSw,IP_02014W_ONSOIL_DATA_SHR_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wOnsoilDataShrSw,IP_02014W_ONSOIL_DATA_SHR_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wOnsoilDataShrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnsoilDataShrSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOnsoilDataShrSw+targetIndex,targetLen);
    
   }
	char[] ip02014wDataShrAllowed8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014wDataShrAllowed88()
	 *	@return  Returns true if isIp02014wDataShrAllowed88() is "Y"
	 */
   public boolean isIp02014wDataShrAllowed88() throws CFException {
      return (  compareChars( getIp02014wOnsoilDataShrSw() , ip02014wDataShrAllowed8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014wDataShrAllowed88True() {  			
    	setIp02014wOnsoilDataShrSw( ip02014wDataShrAllowed8888Value);
   	}
	char[] ip02014wDataShrNotAllow8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014wDataShrNotAllow88()
	 *	@return  Returns true if isIp02014wDataShrNotAllow88() is "N"
	 */
   public boolean isIp02014wDataShrNotAllow88() throws CFException {
      return (  compareChars( getIp02014wOnsoilDataShrSw() , ip02014wDataShrNotAllow8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014wDataShrNotAllow88True() {  			
    	setIp02014wOnsoilDataShrSw( ip02014wDataShrNotAllow8888Value);
   	}
	/**
	 *	Returns the value of ip02014wClrCycleNum
	 *	@return ip02014wClrCycleNum
	 */
	public int getIp02014wClrCycleNum() throws CFException {
       if (isIp02014wClrCycleNumModified()) { 
           ip02014wClrCycleNum = refreshIp02014wClrCycleNum();
        }
   		return ip02014wClrCycleNum;
	}
	

	
	   
	/**
	 * 	Update Ip02014wClrCycleNum with the passed value
	 *  Corresponding COBOL Variable is IP02014W-CLR-CYCLE-NUM
	 *	@param number
	 */
	public void setIp02014wClrCycleNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip02014wClrCycleNum = checkIp02014wClrCycleNumMaxLimit(number); 
		serializeIp02014wClrCycleNum(ip02014wClrCycleNum);
	}
	

	public void setIp02014wClrCycleNum(long number) {
	    number = checkIp02014wClrCycleNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02014wClrCycleNum((int)number);
	}
	
	/**
	 * 	Update Ip02014wClrCycleNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014wClrCycleNum(char[] value) throws CFException {
		 ip02014wClrCycleNum = serializeIp02014wClrCycleNum(value);
	}
	/**
	 * 	Update Ip02014wClrCycleNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014wClrCycleNumString(char[] value) throws CFException {
		 setIp02014wClrCycleNum(value);
	}
	/**
	 *	Returns the value of ip02014wDtaWrhsOnsoilSw
	 *	@return ip02014wDtaWrhsOnsoilSw
	 */
   public char[] getIp02014wDtaWrhsOnsoilSw() throws CFException{
     if (isIp02014wDtaWrhsOnsoilSwModified()) { 
        ip02014wDtaWrhsOnsoilSw = refreshIp02014wDtaWrhsOnsoilSw();
     }
   		return ip02014wDtaWrhsOnsoilSw;
   }

  
	/**
	*  set variable ip02014wDtaWrhsOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-DTA-WRHS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wDtaWrhsOnsoilSw(char[] value) {
      ip02014wDtaWrhsOnsoilSw = checkIp02014wDtaWrhsOnsoilSwConstraints(value);
      serializeIp02014wDtaWrhsOnsoilSw(ip02014wDtaWrhsOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wDtaWrhsOnsoilSw,ip02014wDtaWrhsOnsoilSw.length);
   	
   }
   
   public void setIp02014wDtaWrhsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wDtaWrhsOnsoilSw,ip02014wDtaWrhsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wDtaWrhsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wDtaWrhsOnsoilSw,IP_02014W_DTA_WRHS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wDtaWrhsOnsoilSw,IP_02014W_DTA_WRHS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wDtaWrhsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDtaWrhsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wDtaWrhsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wBllngOnsoilSw
	 *	@return ip02014wBllngOnsoilSw
	 */
   public char[] getIp02014wBllngOnsoilSw() throws CFException{
     if (isIp02014wBllngOnsoilSwModified()) { 
        ip02014wBllngOnsoilSw = refreshIp02014wBllngOnsoilSw();
     }
   		return ip02014wBllngOnsoilSw;
   }

  
	/**
	*  set variable ip02014wBllngOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-BLLNG-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wBllngOnsoilSw(char[] value) {
      ip02014wBllngOnsoilSw = checkIp02014wBllngOnsoilSwConstraints(value);
      serializeIp02014wBllngOnsoilSw(ip02014wBllngOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wBllngOnsoilSw,ip02014wBllngOnsoilSw.length);
   	
   }
   
   public void setIp02014wBllngOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBllngOnsoilSw,ip02014wBllngOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBllngOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wBllngOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wBllngOnsoilSw,IP_02014W_BLLNG_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wBllngOnsoilSw,IP_02014W_BLLNG_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wBllngOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBllngOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBllngOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wSetlOnsoilSw
	 *	@return ip02014wSetlOnsoilSw
	 */
   public char[] getIp02014wSetlOnsoilSw() throws CFException{
     if (isIp02014wSetlOnsoilSwModified()) { 
        ip02014wSetlOnsoilSw = refreshIp02014wSetlOnsoilSw();
     }
   		return ip02014wSetlOnsoilSw;
   }

  
	/**
	*  set variable ip02014wSetlOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-SETL-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wSetlOnsoilSw(char[] value) {
      ip02014wSetlOnsoilSw = checkIp02014wSetlOnsoilSwConstraints(value);
      serializeIp02014wSetlOnsoilSw(ip02014wSetlOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wSetlOnsoilSw,ip02014wSetlOnsoilSw.length);
   	
   }
   
   public void setIp02014wSetlOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wSetlOnsoilSw,ip02014wSetlOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wSetlOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wSetlOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wSetlOnsoilSw,IP_02014W_SETL_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wSetlOnsoilSw,IP_02014W_SETL_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wSetlOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wSetlOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wSetlOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wClrOnsoilSw
	 *	@return ip02014wClrOnsoilSw
	 */
   public char[] getIp02014wClrOnsoilSw() throws CFException{
     if (isIp02014wClrOnsoilSwModified()) { 
        ip02014wClrOnsoilSw = refreshIp02014wClrOnsoilSw();
     }
   		return ip02014wClrOnsoilSw;
   }

  
	/**
	*  set variable ip02014wClrOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-CLR-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wClrOnsoilSw(char[] value) {
      ip02014wClrOnsoilSw = checkIp02014wClrOnsoilSwConstraints(value);
      serializeIp02014wClrOnsoilSw(ip02014wClrOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wClrOnsoilSw,ip02014wClrOnsoilSw.length);
   	
   }
   
   public void setIp02014wClrOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wClrOnsoilSw,ip02014wClrOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wClrOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wClrOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wClrOnsoilSw,IP_02014W_CLR_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wClrOnsoilSw,IP_02014W_CLR_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wClrOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wClrOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wAmsOnsoilSw
	 *	@return ip02014wAmsOnsoilSw
	 */
   public char[] getIp02014wAmsOnsoilSw() throws CFException{
     if (isIp02014wAmsOnsoilSwModified()) { 
        ip02014wAmsOnsoilSw = refreshIp02014wAmsOnsoilSw();
     }
   		return ip02014wAmsOnsoilSw;
   }

  
	/**
	*  set variable ip02014wAmsOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-AMS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wAmsOnsoilSw(char[] value) {
      ip02014wAmsOnsoilSw = checkIp02014wAmsOnsoilSwConstraints(value);
      serializeIp02014wAmsOnsoilSw(ip02014wAmsOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wAmsOnsoilSw,ip02014wAmsOnsoilSw.length);
   	
   }
   
   public void setIp02014wAmsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wAmsOnsoilSw,ip02014wAmsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wAmsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wAmsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wAmsOnsoilSw,IP_02014W_AMS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wAmsOnsoilSw,IP_02014W_AMS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wAmsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAmsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wAmsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wMcomOnsoilSw
	 *	@return ip02014wMcomOnsoilSw
	 */
   public char[] getIp02014wMcomOnsoilSw() throws CFException{
     if (isIp02014wMcomOnsoilSwModified()) { 
        ip02014wMcomOnsoilSw = refreshIp02014wMcomOnsoilSw();
     }
   		return ip02014wMcomOnsoilSw;
   }

  
	/**
	*  set variable ip02014wMcomOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-MCOM-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wMcomOnsoilSw(char[] value) {
      ip02014wMcomOnsoilSw = checkIp02014wMcomOnsoilSwConstraints(value);
      serializeIp02014wMcomOnsoilSw(ip02014wMcomOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wMcomOnsoilSw,ip02014wMcomOnsoilSw.length);
   	
   }
   
   public void setIp02014wMcomOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMcomOnsoilSw,ip02014wMcomOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMcomOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wMcomOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wMcomOnsoilSw,IP_02014W_MCOM_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wMcomOnsoilSw,IP_02014W_MCOM_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wMcomOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMcomOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMcomOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wMdsOnsoilSw
	 *	@return ip02014wMdsOnsoilSw
	 */
   public char[] getIp02014wMdsOnsoilSw() throws CFException{
     if (isIp02014wMdsOnsoilSwModified()) { 
        ip02014wMdsOnsoilSw = refreshIp02014wMdsOnsoilSw();
     }
   		return ip02014wMdsOnsoilSw;
   }

  
	/**
	*  set variable ip02014wMdsOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-MDS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wMdsOnsoilSw(char[] value) {
      ip02014wMdsOnsoilSw = checkIp02014wMdsOnsoilSwConstraints(value);
      serializeIp02014wMdsOnsoilSw(ip02014wMdsOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wMdsOnsoilSw,ip02014wMdsOnsoilSw.length);
   	
   }
   
   public void setIp02014wMdsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMdsOnsoilSw,ip02014wMdsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMdsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wMdsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wMdsOnsoilSw,IP_02014W_MDS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wMdsOnsoilSw,IP_02014W_MDS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wMdsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMdsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wStndInOnsoilSw
	 *	@return ip02014wStndInOnsoilSw
	 */
   public char[] getIp02014wStndInOnsoilSw() throws CFException{
     if (isIp02014wStndInOnsoilSwModified()) { 
        ip02014wStndInOnsoilSw = refreshIp02014wStndInOnsoilSw();
     }
   		return ip02014wStndInOnsoilSw;
   }

  
	/**
	*  set variable ip02014wStndInOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-STND-IN-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wStndInOnsoilSw(char[] value) {
      ip02014wStndInOnsoilSw = checkIp02014wStndInOnsoilSwConstraints(value);
      serializeIp02014wStndInOnsoilSw(ip02014wStndInOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wStndInOnsoilSw,ip02014wStndInOnsoilSw.length);
   	
   }
   
   public void setIp02014wStndInOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wStndInOnsoilSw,ip02014wStndInOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wStndInOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wStndInOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wStndInOnsoilSw,IP_02014W_STND_IN_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wStndInOnsoilSw,IP_02014W_STND_IN_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wStndInOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wStndInOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wStndInOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wAuthOnsoilSw
	 *	@return ip02014wAuthOnsoilSw
	 */
   public char[] getIp02014wAuthOnsoilSw() throws CFException{
     if (isIp02014wAuthOnsoilSwModified()) { 
        ip02014wAuthOnsoilSw = refreshIp02014wAuthOnsoilSw();
     }
   		return ip02014wAuthOnsoilSw;
   }

  
	/**
	*  set variable ip02014wAuthOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-AUTH-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wAuthOnsoilSw(char[] value) {
      ip02014wAuthOnsoilSw = checkIp02014wAuthOnsoilSwConstraints(value);
      serializeIp02014wAuthOnsoilSw(ip02014wAuthOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wAuthOnsoilSw,ip02014wAuthOnsoilSw.length);
   	
   }
   
   public void setIp02014wAuthOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wAuthOnsoilSw,ip02014wAuthOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wAuthOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wAuthOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wAuthOnsoilSw,IP_02014W_AUTH_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wAuthOnsoilSw,IP_02014W_AUTH_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wAuthOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wAuthOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wAuthOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wPushOnsoilSw
	 *	@return ip02014wPushOnsoilSw
	 */
   public char[] getIp02014wPushOnsoilSw() throws CFException{
     if (isIp02014wPushOnsoilSwModified()) { 
        ip02014wPushOnsoilSw = refreshIp02014wPushOnsoilSw();
     }
   		return ip02014wPushOnsoilSw;
   }

  
	/**
	*  set variable ip02014wPushOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-PUSH-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wPushOnsoilSw(char[] value) {
      ip02014wPushOnsoilSw = checkIp02014wPushOnsoilSwConstraints(value);
      serializeIp02014wPushOnsoilSw(ip02014wPushOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wPushOnsoilSw,ip02014wPushOnsoilSw.length);
   	
   }
   
   public void setIp02014wPushOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wPushOnsoilSw,ip02014wPushOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wPushOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wPushOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wPushOnsoilSw,IP_02014W_PUSH_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wPushOnsoilSw,IP_02014W_PUSH_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wPushOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPushOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wPushOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wIncontrolOnsoilSw
	 *	@return ip02014wIncontrolOnsoilSw
	 */
   public char[] getIp02014wIncontrolOnsoilSw() throws CFException{
     if (isIp02014wIncontrolOnsoilSwModified()) { 
        ip02014wIncontrolOnsoilSw = refreshIp02014wIncontrolOnsoilSw();
     }
   		return ip02014wIncontrolOnsoilSw;
   }

  
	/**
	*  set variable ip02014wIncontrolOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-INCONTROL-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wIncontrolOnsoilSw(char[] value) {
      ip02014wIncontrolOnsoilSw = checkIp02014wIncontrolOnsoilSwConstraints(value);
      serializeIp02014wIncontrolOnsoilSw(ip02014wIncontrolOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wIncontrolOnsoilSw,ip02014wIncontrolOnsoilSw.length);
   	
   }
   
   public void setIp02014wIncontrolOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wIncontrolOnsoilSw,ip02014wIncontrolOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wIncontrolOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wIncontrolOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wIncontrolOnsoilSw,IP_02014W_INCONTROL_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wIncontrolOnsoilSw,IP_02014W_INCONTROL_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wIncontrolOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wIncontrolOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wIncontrolOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wEsrvcOnsoilSw
	 *	@return ip02014wEsrvcOnsoilSw
	 */
   public char[] getIp02014wEsrvcOnsoilSw() throws CFException{
     if (isIp02014wEsrvcOnsoilSwModified()) { 
        ip02014wEsrvcOnsoilSw = refreshIp02014wEsrvcOnsoilSw();
     }
   		return ip02014wEsrvcOnsoilSw;
   }

  
	/**
	*  set variable ip02014wEsrvcOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-ESRVC-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wEsrvcOnsoilSw(char[] value) {
      ip02014wEsrvcOnsoilSw = checkIp02014wEsrvcOnsoilSwConstraints(value);
      serializeIp02014wEsrvcOnsoilSw(ip02014wEsrvcOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wEsrvcOnsoilSw,ip02014wEsrvcOnsoilSw.length);
   	
   }
   
   public void setIp02014wEsrvcOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wEsrvcOnsoilSw,ip02014wEsrvcOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wEsrvcOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wEsrvcOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wEsrvcOnsoilSw,IP_02014W_ESRVC_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wEsrvcOnsoilSw,IP_02014W_ESRVC_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wEsrvcOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wEsrvcOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wEsrvcOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wGftOnsoilSw
	 *	@return ip02014wGftOnsoilSw
	 */
   public char[] getIp02014wGftOnsoilSw() throws CFException{
     if (isIp02014wGftOnsoilSwModified()) { 
        ip02014wGftOnsoilSw = refreshIp02014wGftOnsoilSw();
     }
   		return ip02014wGftOnsoilSw;
   }

  
	/**
	*  set variable ip02014wGftOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-GFT-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wGftOnsoilSw(char[] value) {
      ip02014wGftOnsoilSw = checkIp02014wGftOnsoilSwConstraints(value);
      serializeIp02014wGftOnsoilSw(ip02014wGftOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wGftOnsoilSw,ip02014wGftOnsoilSw.length);
   	
   }
   
   public void setIp02014wGftOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wGftOnsoilSw,ip02014wGftOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wGftOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wGftOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wGftOnsoilSw,IP_02014W_GFT_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wGftOnsoilSw,IP_02014W_GFT_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wGftOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wGftOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wGftOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wBnknetOnsoilSw
	 *	@return ip02014wBnknetOnsoilSw
	 */
   public char[] getIp02014wBnknetOnsoilSw() throws CFException{
     if (isIp02014wBnknetOnsoilSwModified()) { 
        ip02014wBnknetOnsoilSw = refreshIp02014wBnknetOnsoilSw();
     }
   		return ip02014wBnknetOnsoilSw;
   }

  
	/**
	*  set variable ip02014wBnknetOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-BNKNET-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wBnknetOnsoilSw(char[] value) {
      ip02014wBnknetOnsoilSw = checkIp02014wBnknetOnsoilSwConstraints(value);
      serializeIp02014wBnknetOnsoilSw(ip02014wBnknetOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wBnknetOnsoilSw,ip02014wBnknetOnsoilSw.length);
   	
   }
   
   public void setIp02014wBnknetOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBnknetOnsoilSw,ip02014wBnknetOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBnknetOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wBnknetOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wBnknetOnsoilSw,IP_02014W_BNKNET_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wBnknetOnsoilSw,IP_02014W_BNKNET_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wBnknetOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBnknetOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBnknetOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wMdesOnsoilSw
	 *	@return ip02014wMdesOnsoilSw
	 */
   public char[] getIp02014wMdesOnsoilSw() throws CFException{
     if (isIp02014wMdesOnsoilSwModified()) { 
        ip02014wMdesOnsoilSw = refreshIp02014wMdesOnsoilSw();
     }
   		return ip02014wMdesOnsoilSw;
   }

  
	/**
	*  set variable ip02014wMdesOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-MDES-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wMdesOnsoilSw(char[] value) {
      ip02014wMdesOnsoilSw = checkIp02014wMdesOnsoilSwConstraints(value);
      serializeIp02014wMdesOnsoilSw(ip02014wMdesOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wMdesOnsoilSw,ip02014wMdesOnsoilSw.length);
   	
   }
   
   public void setIp02014wMdesOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMdesOnsoilSw,ip02014wMdesOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMdesOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wMdesOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wMdesOnsoilSw,IP_02014W_MDES_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wMdesOnsoilSw,IP_02014W_MDES_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wMdesOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wMdesOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wMdesOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wZappOnsoilSw
	 *	@return ip02014wZappOnsoilSw
	 */
   public char[] getIp02014wZappOnsoilSw() throws CFException{
     if (isIp02014wZappOnsoilSwModified()) { 
        ip02014wZappOnsoilSw = refreshIp02014wZappOnsoilSw();
     }
   		return ip02014wZappOnsoilSw;
   }

  
	/**
	*  set variable ip02014wZappOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-ZAPP-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wZappOnsoilSw(char[] value) {
      ip02014wZappOnsoilSw = checkIp02014wZappOnsoilSwConstraints(value);
      serializeIp02014wZappOnsoilSw(ip02014wZappOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wZappOnsoilSw,ip02014wZappOnsoilSw.length);
   	
   }
   
   public void setIp02014wZappOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wZappOnsoilSw,ip02014wZappOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wZappOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wZappOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wZappOnsoilSw,IP_02014W_ZAPP_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wZappOnsoilSw,IP_02014W_ZAPP_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wZappOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wZappOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wZappOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wCemOnsoilSw
	 *	@return ip02014wCemOnsoilSw
	 */
   public char[] getIp02014wCemOnsoilSw() throws CFException{
     if (isIp02014wCemOnsoilSwModified()) { 
        ip02014wCemOnsoilSw = refreshIp02014wCemOnsoilSw();
     }
   		return ip02014wCemOnsoilSw;
   }

  
	/**
	*  set variable ip02014wCemOnsoilSw
	*  Corresponding COBOL Variable is IP02014W-CEM-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014wCemOnsoilSw(char[] value) {
      ip02014wCemOnsoilSw = checkIp02014wCemOnsoilSwConstraints(value);
      serializeIp02014wCemOnsoilSw(ip02014wCemOnsoilSw);
   } 

     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wCemOnsoilSw,ip02014wCemOnsoilSw.length);
   	
   }
   
   public void setIp02014wCemOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wCemOnsoilSw,ip02014wCemOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wCemOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wCemOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014wCemOnsoilSw,IP_02014W_CEM_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wCemOnsoilSw,IP_02014W_CEM_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wCemOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wCemOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wCemOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wRptHdrName
	 *	@return ip02014wRptHdrName
	 */
   public char[] getIp02014wRptHdrName() throws CFException{
     if (isIp02014wRptHdrNameModified()) { 
        ip02014wRptHdrName = refreshIp02014wRptHdrName();
     }
   		return ip02014wRptHdrName;
   }

  
	/**
	*  set variable ip02014wRptHdrName
	*  Corresponding COBOL Variable is IP02014W-RPT-HDR-NAME
	*  @param value
	**/
   public void setIp02014wRptHdrName(char[] value) {
      ip02014wRptHdrName = checkIp02014wRptHdrNameConstraints(value);
      serializeIp02014wRptHdrName(ip02014wRptHdrName);
   } 

     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wRptHdrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wRptHdrName,ip02014wRptHdrName.length);
   	
   }
   
   public void setIp02014wRptHdrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wRptHdrName,ip02014wRptHdrName.length);
   	
   }
   
     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wRptHdrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wRptHdrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wRptHdrName with another Field
	 *	@param value
	 */
   public void setIp02014wRptHdrName(Field source) {
       replace(source,0,source.length(),beginIp02014wRptHdrName,IP_02014W_RPT_HDR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wRptHdrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wRptHdrName,IP_02014W_RPT_HDR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wRptHdrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wRptHdrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wRptHdrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wClrPrcssCd
	 *	@return ip02014wClrPrcssCd
	 */
   public char[] getIp02014wClrPrcssCd() throws CFException{
     if (isIp02014wClrPrcssCdModified()) { 
        ip02014wClrPrcssCd = refreshIp02014wClrPrcssCd();
     }
   		return ip02014wClrPrcssCd;
   }

  
	/**
	*  set variable ip02014wClrPrcssCd
	*  Corresponding COBOL Variable is IP02014W-CLR-PRCSS-CD
	*  @param value
	**/
   public void setIp02014wClrPrcssCd(char[] value) {
      ip02014wClrPrcssCd = checkIp02014wClrPrcssCdConstraints(value);
      serializeIp02014wClrPrcssCd(ip02014wClrPrcssCd);
   } 

     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wClrPrcssCd,ip02014wClrPrcssCd.length);
   	
   }
   
   public void setIp02014wClrPrcssCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wClrPrcssCd,ip02014wClrPrcssCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wClrPrcssCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(Field source) {
       replace(source,0,source.length(),beginIp02014wClrPrcssCd,IP_02014W_CLR_PRCSS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wClrPrcssCd,IP_02014W_CLR_PRCSS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wClrPrcssCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wClrPrcssCd+targetIndex,targetLen);
    
   }
	char[] ip02014wGlobalPrcssCd8888Value = "GCMS".toCharArray();
	/**
	 *	Test condition "GCMS" for isIp02014wGlobalPrcssCd88()
	 *	@return  Returns true if isIp02014wGlobalPrcssCd88() is "GCMS"
	 */
   public boolean isIp02014wGlobalPrcssCd88() throws CFException {
      return (  compareChars( getIp02014wClrPrcssCd() , ip02014wGlobalPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "GCMS"
	*/
   	public void setIp02014wGlobalPrcssCd88True() {  			
    	setIp02014wClrPrcssCd( ip02014wGlobalPrcssCd8888Value);
   	}
	char[] ip02014wLocalPrcssCd8888Value = "LCMS".toCharArray();
	/**
	 *	Test condition "LCMS" for isIp02014wLocalPrcssCd88()
	 *	@return  Returns true if isIp02014wLocalPrcssCd88() is "LCMS"
	 */
   public boolean isIp02014wLocalPrcssCd88() throws CFException {
      return (  compareChars( getIp02014wClrPrcssCd() , ip02014wLocalPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "LCMS"
	*/
   	public void setIp02014wLocalPrcssCd88True() {  			
    	setIp02014wClrPrcssCd( ip02014wLocalPrcssCd8888Value);
   	}
	char[] ip02014wRedactPrcssCd8888Value = "RCMS".toCharArray();
	/**
	 *	Test condition "RCMS" for isIp02014wRedactPrcssCd88()
	 *	@return  Returns true if isIp02014wRedactPrcssCd88() is "RCMS"
	 */
   public boolean isIp02014wRedactPrcssCd88() throws CFException {
      return (  compareChars( getIp02014wClrPrcssCd() , ip02014wRedactPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "RCMS"
	*/
   	public void setIp02014wRedactPrcssCd88True() {  			
    	setIp02014wClrPrcssCd( ip02014wRedactPrcssCd8888Value);
   	}
	/**
	 *	Returns the value of ip02014wOnUsPrcssAgrmtId
	 *	@return ip02014wOnUsPrcssAgrmtId
	 */
   public char[] getIp02014wOnUsPrcssAgrmtId() throws CFException{
     if (isIp02014wOnUsPrcssAgrmtIdModified()) { 
        ip02014wOnUsPrcssAgrmtId = refreshIp02014wOnUsPrcssAgrmtId();
     }
   		return ip02014wOnUsPrcssAgrmtId;
   }

  
	/**
	*  set variable ip02014wOnUsPrcssAgrmtId
	*  Corresponding COBOL Variable is IP02014W-ON-US-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02014wOnUsPrcssAgrmtId(char[] value) {
      ip02014wOnUsPrcssAgrmtId = checkIp02014wOnUsPrcssAgrmtIdConstraints(value);
      serializeIp02014wOnUsPrcssAgrmtId(ip02014wOnUsPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wOnUsPrcssAgrmtId,ip02014wOnUsPrcssAgrmtId.length);
   	
   }
   
   public void setIp02014wOnUsPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOnUsPrcssAgrmtId,ip02014wOnUsPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOnUsPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02014wOnUsPrcssAgrmtId,IP_02014W_ON_US_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wOnUsPrcssAgrmtId,IP_02014W_ON_US_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wOnUsPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOnUsPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOnUsPrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wOperSysId
	 *	@return ip02014wOperSysId
	 */
   public char[] getIp02014wOperSysId() throws CFException{
     if (isIp02014wOperSysIdModified()) { 
        ip02014wOperSysId = refreshIp02014wOperSysId();
     }
   		return ip02014wOperSysId;
   }

  
	/**
	*  set variable ip02014wOperSysId
	*  Corresponding COBOL Variable is IP02014W-OPER-SYS-ID
	*  @param value
	**/
   public void setIp02014wOperSysId(char[] value) {
      ip02014wOperSysId = checkIp02014wOperSysIdConstraints(value);
      serializeIp02014wOperSysId(ip02014wOperSysId);
   } 

     /**
	 * 	Update Ip02014wOperSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wOperSysId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wOperSysId,ip02014wOperSysId.length);
   	
   }
   
   public void setIp02014wOperSysId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOperSysId,ip02014wOperSysId.length);
   	
   }
   
     /**
	 * 	Update Ip02014wOperSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOperSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOperSysId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wOperSysId with another Field
	 *	@param value
	 */
   public void setIp02014wOperSysId(Field source) {
       replace(source,0,source.length(),beginIp02014wOperSysId,IP_02014W_OPER_SYS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wOperSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wOperSysId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wOperSysId,IP_02014W_OPER_SYS_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wOperSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wOperSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wOperSysId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wDbId
	 *	@return ip02014wDbId
	 */
   public char[] getIp02014wDbId() throws CFException{
     if (isIp02014wDbIdModified()) { 
        ip02014wDbId = refreshIp02014wDbId();
     }
   		return ip02014wDbId;
   }

  
	/**
	*  set variable ip02014wDbId
	*  Corresponding COBOL Variable is IP02014W-DB-ID
	*  @param value
	**/
   public void setIp02014wDbId(char[] value) {
      ip02014wDbId = checkIp02014wDbIdConstraints(value);
      serializeIp02014wDbId(ip02014wDbId);
   } 

     /**
	 * 	Update Ip02014wDbId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wDbId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wDbId,ip02014wDbId.length);
   	
   }
   
   public void setIp02014wDbId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wDbId,ip02014wDbId.length);
   	
   }
   
     /**
	 * 	Update Ip02014wDbId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDbId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wDbId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wDbId with another Field
	 *	@param value
	 */
   public void setIp02014wDbId(Field source) {
       replace(source,0,source.length(),beginIp02014wDbId,IP_02014W_DB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wDbId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wDbId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wDbId,IP_02014W_DB_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wDbId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wDbId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wDbId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wFiller
	 *	@return ip02014wFiller
	 */
   public char[] getIp02014wFiller() throws CFException{
     if (isIp02014wFillerModified()) { 
        ip02014wFiller = refreshIp02014wFiller();
     }
   		return ip02014wFiller;
   }

  
	/**
	*  set variable ip02014wFiller
	*  Corresponding COBOL Variable is IP02014W-FILLER
	*  @param value
	**/
   public void setIp02014wFiller(char[] value) {
      ip02014wFiller = checkIp02014wFillerConstraints(value);
      serializeIp02014wFiller(ip02014wFiller);
   } 

     /**
	 * 	Update Ip02014wFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wFiller,ip02014wFiller.length);
   	
   }
   
   public void setIp02014wFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wFiller,ip02014wFiller.length);
   	
   }
   
     /**
	 * 	Update Ip02014wFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wFiller with another Field
	 *	@param value
	 */
   public void setIp02014wFiller(Field source) {
       replace(source,0,source.length(),beginIp02014wFiller,IP_02014W_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wFiller,IP_02014W_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wFiller+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014wTableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014wGeoScopeCode(CONSTANTS.SPACE);
         setIp02014wHostInd(CONSTANTS.SPACE);
          ip02014wImpBulkId.initialize();
     
                     setIp02014wNumCurrCd(0);
         setIp02014wOfsoilDataTypCd(CONSTANTS.SPACE_3);
         setIp02014wMrchntSplitCd(CONSTANTS.SPACE);
         setIp02014wCurrSplitCd(CONSTANTS.SPACE);
         setIp02014wAcquirerSplitCd(CONSTANTS.SPACE);
         setIp02014wDomCollOnlyCd(CONSTANTS.SPACE);
         setIp02014wOnsoilDataShrSw(CONSTANTS.SPACE);
                     setIp02014wClrCycleNum(0);
         setIp02014wDtaWrhsOnsoilSw(CONSTANTS.SPACE);
         setIp02014wBllngOnsoilSw(CONSTANTS.SPACE);
         setIp02014wSetlOnsoilSw(CONSTANTS.SPACE);
         setIp02014wClrOnsoilSw(CONSTANTS.SPACE);
         setIp02014wAmsOnsoilSw(CONSTANTS.SPACE);
         setIp02014wMcomOnsoilSw(CONSTANTS.SPACE);
         setIp02014wMdsOnsoilSw(CONSTANTS.SPACE);
         setIp02014wStndInOnsoilSw(CONSTANTS.SPACE);
         setIp02014wAuthOnsoilSw(CONSTANTS.SPACE);
         setIp02014wPushOnsoilSw(CONSTANTS.SPACE);
         setIp02014wIncontrolOnsoilSw(CONSTANTS.SPACE);
         setIp02014wEsrvcOnsoilSw(CONSTANTS.SPACE);
         setIp02014wGftOnsoilSw(CONSTANTS.SPACE);
         setIp02014wBnknetOnsoilSw(CONSTANTS.SPACE);
         setIp02014wMdesOnsoilSw(CONSTANTS.SPACE);
         setIp02014wZappOnsoilSw(CONSTANTS.SPACE);
         setIp02014wCemOnsoilSw(CONSTANTS.SPACE);
         setIp02014wRptHdrName(CONSTANTS.SPACE_80);
         setIp02014wClrPrcssCd(CONSTANTS.SPACE_4);
         setIp02014wOnUsPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02014wOperSysId(CONSTANTS.SPACE_20);
         setIp02014wDbId(CONSTANTS.SPACE_20);
         setIp02014wFiller(CONSTANTS.SPACE_750);
   }

		public static int getIp02014wTableDataFieldsFieldLength() {
			return IP_02014W_TABLE_DATA_FIELDS_LENGTH;
		}

}
  
