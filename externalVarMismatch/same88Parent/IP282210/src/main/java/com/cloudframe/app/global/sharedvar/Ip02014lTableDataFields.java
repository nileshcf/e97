package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014lTableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02014lTableDataFields extends Ip02014lTableDataFieldsSerialized { 
   

						private char[] ip02014lGeoScopeCode = Field.fillLowValue(1);

						private char[] ip02014lHostInd = Field.fillLowValue(1);
				private Ip02014lImpBulkId ip02014lImpBulkId = new Ip02014lImpBulkId();

								private int ip02014lNumCurrCd;

						private char[] ip02014lOfsoilDataTypCd = Field.fillLowValue(3);

						private char[] ip02014lMrchntSplitCd = Field.fillLowValue(1);

						private char[] ip02014lCurrSplitCd = Field.fillLowValue(1);

						private char[] ip02014lAcquirerSplitCd = Field.fillLowValue(1);

						private char[] ip02014lDomCollOnlyCd = Field.fillLowValue(1);

						private char[] ip02014lOnsoilDataShrSw = Field.fillLowValue(1);

								private int ip02014lClrCycleNum;

						private char[] ip02014lDtaWrhsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lBllngOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lSetlOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lClrOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lAmsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lMcomOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lMdsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lStndInOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lAuthOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lPushOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lIncontrolOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lEsrvcOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lGftOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lBnknetOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lMdesOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lZappOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lCemOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014lRptHdrName = Field.fillLowValue(80);

						private char[] ip02014lClrPrcssCd = Field.fillLowValue(4);

						private char[] ip02014lOnUsPrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip02014lOperSysId = Field.fillLowValue(20);

						private char[] ip02014lDbId = Field.fillLowValue(20);

						private char[] ip02014lFiller = Field.fillLowValue(750);
	
	/**
	* Constructor for Ip02014lTableDataFields
	**/
    public Ip02014lTableDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014lTableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014lTableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip02014lImpBulkId.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of ip02014lGeoScopeCode
	 *	@return ip02014lGeoScopeCode
	 */
   public char[] getIp02014lGeoScopeCode() throws CFException{
     if (isIp02014lGeoScopeCodeModified()) { 
        ip02014lGeoScopeCode = refreshIp02014lGeoScopeCode();
     }
   		return ip02014lGeoScopeCode;
   }

  
	/**
	*  set variable ip02014lGeoScopeCode
	*  Corresponding COBOL Variable is IP02014L-GEO-SCOPE-CODE
	*  @param value
	**/
   public void setIp02014lGeoScopeCode(char[] value) {
      ip02014lGeoScopeCode = checkIp02014lGeoScopeCodeConstraints(value);
      serializeIp02014lGeoScopeCode(ip02014lGeoScopeCode);
   } 

     /**
	 * 	Update Ip02014lGeoScopeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lGeoScopeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lGeoScopeCode,ip02014lGeoScopeCode.length);
   	
   }
   
   public void setIp02014lGeoScopeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lGeoScopeCode,ip02014lGeoScopeCode.length);
   	
   }
   
     /**
	 * 	Update Ip02014lGeoScopeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lGeoScopeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lGeoScopeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lGeoScopeCode with another Field
	 *	@param value
	 */
   public void setIp02014lGeoScopeCode(Field source) {
       replace(source,0,source.length(),beginIp02014lGeoScopeCode,IP_02014L_GEO_SCOPE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lGeoScopeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lGeoScopeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lGeoScopeCode,IP_02014L_GEO_SCOPE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lGeoScopeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lGeoScopeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lGeoScopeCode+targetIndex,targetLen);
    
   }
	char[] ip02014lPaGlobal8888Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isIp02014lPaGlobal88()
	 *	@return  Returns true if isIp02014lPaGlobal88() is "G"
	 */
   public boolean isIp02014lPaGlobal88() throws CFException {
      return (  compareChars( getIp02014lGeoScopeCode() , ip02014lPaGlobal8888Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setIp02014lPaGlobal88True() {  			
    	setIp02014lGeoScopeCode( ip02014lPaGlobal8888Value);
   	}
	char[] ip02014lPaLocal8888Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isIp02014lPaLocal88()
	 *	@return  Returns true if isIp02014lPaLocal88() is "L"
	 */
   public boolean isIp02014lPaLocal88() throws CFException {
      return (  compareChars( getIp02014lGeoScopeCode() , ip02014lPaLocal8888Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setIp02014lPaLocal88True() {  			
    	setIp02014lGeoScopeCode( ip02014lPaLocal8888Value);
   	}
	char[] ip02014lPaRegional8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp02014lPaRegional88()
	 *	@return  Returns true if isIp02014lPaRegional88() is "R"
	 */
   public boolean isIp02014lPaRegional88() throws CFException {
      return (  compareChars( getIp02014lGeoScopeCode() , ip02014lPaRegional8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp02014lPaRegional88True() {  			
    	setIp02014lGeoScopeCode( ip02014lPaRegional8888Value);
   	}
	/**
	 *	Returns the value of ip02014lHostInd
	 *	@return ip02014lHostInd
	 */
   public char[] getIp02014lHostInd() throws CFException{
     if (isIp02014lHostIndModified()) { 
        ip02014lHostInd = refreshIp02014lHostInd();
     }
   		return ip02014lHostInd;
   }

  
	/**
	*  set variable ip02014lHostInd
	*  Corresponding COBOL Variable is IP02014L-HOST-IND
	*  @param value
	**/
   public void setIp02014lHostInd(char[] value) {
      ip02014lHostInd = checkIp02014lHostIndConstraints(value);
      serializeIp02014lHostInd(ip02014lHostInd);
   } 

     /**
	 * 	Update Ip02014lHostInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lHostInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lHostInd,ip02014lHostInd.length);
   	
   }
   
   public void setIp02014lHostInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lHostInd,ip02014lHostInd.length);
   	
   }
   
     /**
	 * 	Update Ip02014lHostInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lHostInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lHostInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lHostInd with another Field
	 *	@param value
	 */
   public void setIp02014lHostInd(Field source) {
       replace(source,0,source.length(),beginIp02014lHostInd,IP_02014L_HOST_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lHostInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lHostInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lHostInd,IP_02014L_HOST_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lHostInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lHostInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lHostInd+targetIndex,targetLen);
    
   }
	char[] ip02014lPaIsHost8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014lPaIsHost88()
	 *	@return  Returns true if isIp02014lPaIsHost88() is "Y"
	 */
   public boolean isIp02014lPaIsHost88() throws CFException {
      return (  compareChars( getIp02014lHostInd() , ip02014lPaIsHost8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014lPaIsHost88True() {  			
    	setIp02014lHostInd( ip02014lPaIsHost8888Value);
   	}
	char[] ip02014lNotTheHost8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014lNotTheHost88()
	 *	@return  Returns true if isIp02014lNotTheHost88() is "N"
	 */
   public boolean isIp02014lNotTheHost88() throws CFException {
      return (  compareChars( getIp02014lHostInd() , ip02014lNotTheHost8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014lNotTheHost88True() {  			
    	setIp02014lHostInd( ip02014lNotTheHost8888Value);
   	}
	/**
	 *	Returns the value of ip02014lImpBulkId
	 *	@return ip02014lImpBulkId
	 */   
	 public Ip02014lImpBulkId getIp02014lImpBulkId() {
   	return ip02014lImpBulkId;
   }
   /**
	* 	Update Ip02014lImpBulkId with the passed value
	*   Corresponding COBOL Variable is IP02014L-IMP-BULK-ID
	*	@param value
	*/
   public void setIp02014lImpBulkId(char[] value) {
      ip02014lImpBulkId.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014lImpBulkId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014lImpBulkId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lImpBulkId.begin,ip02014lImpBulkId.length());
   }
   
     /**
	 * 	Update Ip02014lImpBulkId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lImpBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lImpBulkId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014lImpBulkId with another Field
	 *	@param value
	 */
   public void setIp02014lImpBulkId(Field source) {
   	replace(source,0,source.length(),ip02014lImpBulkId.begin,ip02014lImpBulkId.length());
   }  
   
     /**
	 * 	Update Ip02014lImpBulkId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014lImpBulkId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lImpBulkId.begin,ip02014lImpBulkId.length());
   }
   
     /**
	 * 	Update Ip02014lImpBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lImpBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lImpBulkId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip02014lNumCurrCd
	 *	@return ip02014lNumCurrCd
	 */
	public int getIp02014lNumCurrCd() throws CFException {
       if (isIp02014lNumCurrCdModified()) { 
           ip02014lNumCurrCd = refreshIp02014lNumCurrCd();
        }
   		return ip02014lNumCurrCd;
	}
	

	
	   
	/**
	 * 	Update Ip02014lNumCurrCd with the passed value
	 *  Corresponding COBOL Variable is IP02014L-NUM-CURR-CD
	 *	@param number
	 */
	public void setIp02014lNumCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip02014lNumCurrCd = checkIp02014lNumCurrCdMaxLimit(number); 
		serializeIp02014lNumCurrCd(ip02014lNumCurrCd);
	}
	

	public void setIp02014lNumCurrCd(long number) {
	    number = checkIp02014lNumCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02014lNumCurrCd((int)number);
	}
	
	/**
	 * 	Update Ip02014lNumCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014lNumCurrCd(char[] value) throws CFException {
		 ip02014lNumCurrCd = serializeIp02014lNumCurrCd(value);
	}
	/**
	 * 	Update Ip02014lNumCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014lNumCurrCdString(char[] value) throws CFException {
		 setIp02014lNumCurrCd(value);
	}
	/**
	 *	Returns the value of ip02014lOfsoilDataTypCd
	 *	@return ip02014lOfsoilDataTypCd
	 */
   public char[] getIp02014lOfsoilDataTypCd() throws CFException{
     if (isIp02014lOfsoilDataTypCdModified()) { 
        ip02014lOfsoilDataTypCd = refreshIp02014lOfsoilDataTypCd();
     }
   		return ip02014lOfsoilDataTypCd;
   }

  
	/**
	*  set variable ip02014lOfsoilDataTypCd
	*  Corresponding COBOL Variable is IP02014L-OFSOIL-DATA-TYP-CD
	*  @param value
	**/
   public void setIp02014lOfsoilDataTypCd(char[] value) {
      ip02014lOfsoilDataTypCd = checkIp02014lOfsoilDataTypCdConstraints(value);
      serializeIp02014lOfsoilDataTypCd(ip02014lOfsoilDataTypCd);
   } 

     /**
	 * 	Update Ip02014lOfsoilDataTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lOfsoilDataTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lOfsoilDataTypCd,ip02014lOfsoilDataTypCd.length);
   	
   }
   
   public void setIp02014lOfsoilDataTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOfsoilDataTypCd,ip02014lOfsoilDataTypCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014lOfsoilDataTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lOfsoilDataTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOfsoilDataTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lOfsoilDataTypCd with another Field
	 *	@param value
	 */
   public void setIp02014lOfsoilDataTypCd(Field source) {
       replace(source,0,source.length(),beginIp02014lOfsoilDataTypCd,IP_02014L_OFSOIL_DATA_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lOfsoilDataTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lOfsoilDataTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lOfsoilDataTypCd,IP_02014L_OFSOIL_DATA_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lOfsoilDataTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lOfsoilDataTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOfsoilDataTypCd+targetIndex,targetLen);
    
   }
	char[] ip02014lPaTransLevel8888Value = "TXL".toCharArray();
	/**
	 *	Test condition "TXL" for isIp02014lPaTransLevel88()
	 *	@return  Returns true if isIp02014lPaTransLevel88() is "TXL"
	 */
   public boolean isIp02014lPaTransLevel88() throws CFException {
      return (  compareChars( getIp02014lOfsoilDataTypCd() , ip02014lPaTransLevel8888Value)  == 0  );
   }


	/**
	*  set values "TXL"
	*/
   	public void setIp02014lPaTransLevel88True() {  			
    	setIp02014lOfsoilDataTypCd( ip02014lPaTransLevel8888Value);
   	}
	char[] ip02014lPaTransLevelObs8888Value = "TXO".toCharArray();
	/**
	 *	Test condition "TXO" for isIp02014lPaTransLevelObs88()
	 *	@return  Returns true if isIp02014lPaTransLevelObs88() is "TXO"
	 */
   public boolean isIp02014lPaTransLevelObs88() throws CFException {
      return (  compareChars( getIp02014lOfsoilDataTypCd() , ip02014lPaTransLevelObs8888Value)  == 0  );
   }


	/**
	*  set values "TXO"
	*/
   	public void setIp02014lPaTransLevelObs88True() {  			
    	setIp02014lOfsoilDataTypCd( ip02014lPaTransLevelObs8888Value);
   	}
	char[] ip02014lPaSummaryLevel8888Value = "SUM".toCharArray();
	/**
	 *	Test condition "SUM" for isIp02014lPaSummaryLevel88()
	 *	@return  Returns true if isIp02014lPaSummaryLevel88() is "SUM"
	 */
   public boolean isIp02014lPaSummaryLevel88() throws CFException {
      return (  compareChars( getIp02014lOfsoilDataTypCd() , ip02014lPaSummaryLevel8888Value)  == 0  );
   }


	/**
	*  set values "SUM"
	*/
   	public void setIp02014lPaSummaryLevel88True() {  			
    	setIp02014lOfsoilDataTypCd( ip02014lPaSummaryLevel8888Value);
   	}
	/**
	 *	Returns the value of ip02014lMrchntSplitCd
	 *	@return ip02014lMrchntSplitCd
	 */
   public char[] getIp02014lMrchntSplitCd() throws CFException{
     if (isIp02014lMrchntSplitCdModified()) { 
        ip02014lMrchntSplitCd = refreshIp02014lMrchntSplitCd();
     }
   		return ip02014lMrchntSplitCd;
   }

  
	/**
	*  set variable ip02014lMrchntSplitCd
	*  Corresponding COBOL Variable is IP02014L-MRCHNT-SPLIT-CD
	*  @param value
	**/
   public void setIp02014lMrchntSplitCd(char[] value) {
      ip02014lMrchntSplitCd = checkIp02014lMrchntSplitCdConstraints(value);
      serializeIp02014lMrchntSplitCd(ip02014lMrchntSplitCd);
   } 

     /**
	 * 	Update Ip02014lMrchntSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lMrchntSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lMrchntSplitCd,ip02014lMrchntSplitCd.length);
   	
   }
   
   public void setIp02014lMrchntSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMrchntSplitCd,ip02014lMrchntSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014lMrchntSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lMrchntSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMrchntSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lMrchntSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014lMrchntSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02014lMrchntSplitCd,IP_02014L_MRCHNT_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lMrchntSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lMrchntSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lMrchntSplitCd,IP_02014L_MRCHNT_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lMrchntSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lMrchntSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMrchntSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02014lIncMrchtSpltY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014lIncMrchtSpltY88()
	 *	@return  Returns true if isIp02014lIncMrchtSpltY88() is "Y"
	 */
   public boolean isIp02014lIncMrchtSpltY88() throws CFException {
      return (  compareChars( getIp02014lMrchntSplitCd() , ip02014lIncMrchtSpltY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014lIncMrchtSpltY88True() {  			
    	setIp02014lMrchntSplitCd( ip02014lIncMrchtSpltY8888Value);
   	}
	char[] ip02014lIncMrchtSpltN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014lIncMrchtSpltN88()
	 *	@return  Returns true if isIp02014lIncMrchtSpltN88() is "N"
	 */
   public boolean isIp02014lIncMrchtSpltN88() throws CFException {
      return (  compareChars( getIp02014lMrchntSplitCd() , ip02014lIncMrchtSpltN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014lIncMrchtSpltN88True() {  			
    	setIp02014lMrchntSplitCd( ip02014lIncMrchtSpltN8888Value);
   	}
	char[] ip02014lIncMrchntSpltC8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02014lIncMrchntSpltC88()
	 *	@return  Returns true if isIp02014lIncMrchntSpltC88() is "C"
	 */
   public boolean isIp02014lIncMrchntSpltC88() throws CFException {
      return (  compareChars( getIp02014lMrchntSplitCd() , ip02014lIncMrchntSpltC8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02014lIncMrchntSpltC88True() {  			
    	setIp02014lMrchntSplitCd( ip02014lIncMrchntSpltC8888Value);
   	}
	/**
	 *	Returns the value of ip02014lCurrSplitCd
	 *	@return ip02014lCurrSplitCd
	 */
   public char[] getIp02014lCurrSplitCd() throws CFException{
     if (isIp02014lCurrSplitCdModified()) { 
        ip02014lCurrSplitCd = refreshIp02014lCurrSplitCd();
     }
   		return ip02014lCurrSplitCd;
   }

  
	/**
	*  set variable ip02014lCurrSplitCd
	*  Corresponding COBOL Variable is IP02014L-CURR-SPLIT-CD
	*  @param value
	**/
   public void setIp02014lCurrSplitCd(char[] value) {
      ip02014lCurrSplitCd = checkIp02014lCurrSplitCdConstraints(value);
      serializeIp02014lCurrSplitCd(ip02014lCurrSplitCd);
   } 

     /**
	 * 	Update Ip02014lCurrSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lCurrSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lCurrSplitCd,ip02014lCurrSplitCd.length);
   	
   }
   
   public void setIp02014lCurrSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lCurrSplitCd,ip02014lCurrSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014lCurrSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lCurrSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lCurrSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lCurrSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014lCurrSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02014lCurrSplitCd,IP_02014L_CURR_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lCurrSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lCurrSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lCurrSplitCd,IP_02014L_CURR_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lCurrSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lCurrSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lCurrSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02014lCurrSplitYes8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014lCurrSplitYes88()
	 *	@return  Returns true if isIp02014lCurrSplitYes88() is "Y"
	 */
   public boolean isIp02014lCurrSplitYes88() throws CFException {
      return (  compareChars( getIp02014lCurrSplitCd() , ip02014lCurrSplitYes8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014lCurrSplitYes88True() {  			
    	setIp02014lCurrSplitCd( ip02014lCurrSplitYes8888Value);
   	}
	char[] ip02014lCurrSpitNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014lCurrSpitNo88()
	 *	@return  Returns true if isIp02014lCurrSpitNo88() is "N"
	 */
   public boolean isIp02014lCurrSpitNo88() throws CFException {
      return (  compareChars( getIp02014lCurrSplitCd() , ip02014lCurrSpitNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014lCurrSpitNo88True() {  			
    	setIp02014lCurrSplitCd( ip02014lCurrSpitNo8888Value);
   	}
	char[] ip02014lCurrSplitCond8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02014lCurrSplitCond88()
	 *	@return  Returns true if isIp02014lCurrSplitCond88() is "C"
	 */
   public boolean isIp02014lCurrSplitCond88() throws CFException {
      return (  compareChars( getIp02014lCurrSplitCd() , ip02014lCurrSplitCond8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02014lCurrSplitCond88True() {  			
    	setIp02014lCurrSplitCd( ip02014lCurrSplitCond8888Value);
   	}
	/**
	 *	Returns the value of ip02014lAcquirerSplitCd
	 *	@return ip02014lAcquirerSplitCd
	 */
   public char[] getIp02014lAcquirerSplitCd() throws CFException{
     if (isIp02014lAcquirerSplitCdModified()) { 
        ip02014lAcquirerSplitCd = refreshIp02014lAcquirerSplitCd();
     }
   		return ip02014lAcquirerSplitCd;
   }

  
	/**
	*  set variable ip02014lAcquirerSplitCd
	*  Corresponding COBOL Variable is IP02014L-ACQUIRER-SPLIT-CD
	*  @param value
	**/
   public void setIp02014lAcquirerSplitCd(char[] value) {
      ip02014lAcquirerSplitCd = checkIp02014lAcquirerSplitCdConstraints(value);
      serializeIp02014lAcquirerSplitCd(ip02014lAcquirerSplitCd);
   } 

     /**
	 * 	Update Ip02014lAcquirerSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lAcquirerSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lAcquirerSplitCd,ip02014lAcquirerSplitCd.length);
   	
   }
   
   public void setIp02014lAcquirerSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lAcquirerSplitCd,ip02014lAcquirerSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014lAcquirerSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lAcquirerSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lAcquirerSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lAcquirerSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014lAcquirerSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02014lAcquirerSplitCd,IP_02014L_ACQUIRER_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lAcquirerSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lAcquirerSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lAcquirerSplitCd,IP_02014L_ACQUIRER_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lAcquirerSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lAcquirerSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lAcquirerSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02014lAcquirerSplitYes8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014lAcquirerSplitYes88()
	 *	@return  Returns true if isIp02014lAcquirerSplitYes88() is "Y"
	 */
   public boolean isIp02014lAcquirerSplitYes88() throws CFException {
      return (  compareChars( getIp02014lAcquirerSplitCd() , ip02014lAcquirerSplitYes8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014lAcquirerSplitYes88True() {  			
    	setIp02014lAcquirerSplitCd( ip02014lAcquirerSplitYes8888Value);
   	}
	char[] ip02014lAcquirerSplitNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014lAcquirerSplitNo88()
	 *	@return  Returns true if isIp02014lAcquirerSplitNo88() is "N"
	 */
   public boolean isIp02014lAcquirerSplitNo88() throws CFException {
      return (  compareChars( getIp02014lAcquirerSplitCd() , ip02014lAcquirerSplitNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014lAcquirerSplitNo88True() {  			
    	setIp02014lAcquirerSplitCd( ip02014lAcquirerSplitNo8888Value);
   	}
	char[] ip02014lAcquirerSplitCon8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02014lAcquirerSplitCon88()
	 *	@return  Returns true if isIp02014lAcquirerSplitCon88() is "C"
	 */
   public boolean isIp02014lAcquirerSplitCon88() throws CFException {
      return (  compareChars( getIp02014lAcquirerSplitCd() , ip02014lAcquirerSplitCon8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02014lAcquirerSplitCon88True() {  			
    	setIp02014lAcquirerSplitCd( ip02014lAcquirerSplitCon8888Value);
   	}
	/**
	 *	Returns the value of ip02014lDomCollOnlyCd
	 *	@return ip02014lDomCollOnlyCd
	 */
   public char[] getIp02014lDomCollOnlyCd() throws CFException{
     if (isIp02014lDomCollOnlyCdModified()) { 
        ip02014lDomCollOnlyCd = refreshIp02014lDomCollOnlyCd();
     }
   		return ip02014lDomCollOnlyCd;
   }

  
	/**
	*  set variable ip02014lDomCollOnlyCd
	*  Corresponding COBOL Variable is IP02014L-DOM-COLL-ONLY-CD
	*  @param value
	**/
   public void setIp02014lDomCollOnlyCd(char[] value) {
      ip02014lDomCollOnlyCd = checkIp02014lDomCollOnlyCdConstraints(value);
      serializeIp02014lDomCollOnlyCd(ip02014lDomCollOnlyCd);
   } 

     /**
	 * 	Update Ip02014lDomCollOnlyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lDomCollOnlyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lDomCollOnlyCd,ip02014lDomCollOnlyCd.length);
   	
   }
   
   public void setIp02014lDomCollOnlyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lDomCollOnlyCd,ip02014lDomCollOnlyCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014lDomCollOnlyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lDomCollOnlyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lDomCollOnlyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lDomCollOnlyCd with another Field
	 *	@param value
	 */
   public void setIp02014lDomCollOnlyCd(Field source) {
       replace(source,0,source.length(),beginIp02014lDomCollOnlyCd,IP_02014L_DOM_COLL_ONLY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lDomCollOnlyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lDomCollOnlyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lDomCollOnlyCd,IP_02014L_DOM_COLL_ONLY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lDomCollOnlyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lDomCollOnlyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lDomCollOnlyCd+targetIndex,targetLen);
    
   }
	char[] ip02014lDomCollOnlySplt8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp02014lDomCollOnlySplt88()
	 *	@return  Returns true if isIp02014lDomCollOnlySplt88() is "S"
	 */
   public boolean isIp02014lDomCollOnlySplt88() throws CFException {
      return (  compareChars( getIp02014lDomCollOnlyCd() , ip02014lDomCollOnlySplt8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp02014lDomCollOnlySplt88True() {  			
    	setIp02014lDomCollOnlyCd( ip02014lDomCollOnlySplt8888Value);
   	}
	char[] ip02014lDomCollOnlyHost8888Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isIp02014lDomCollOnlyHost88()
	 *	@return  Returns true if isIp02014lDomCollOnlyHost88() is "H"
	 */
   public boolean isIp02014lDomCollOnlyHost88() throws CFException {
      return (  compareChars( getIp02014lDomCollOnlyCd() , ip02014lDomCollOnlyHost8888Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setIp02014lDomCollOnlyHost88True() {  			
    	setIp02014lDomCollOnlyCd( ip02014lDomCollOnlyHost8888Value);
   	}
	/**
	 *	Returns the value of ip02014lOnsoilDataShrSw
	 *	@return ip02014lOnsoilDataShrSw
	 */
   public char[] getIp02014lOnsoilDataShrSw() throws CFException{
     if (isIp02014lOnsoilDataShrSwModified()) { 
        ip02014lOnsoilDataShrSw = refreshIp02014lOnsoilDataShrSw();
     }
   		return ip02014lOnsoilDataShrSw;
   }

  
	/**
	*  set variable ip02014lOnsoilDataShrSw
	*  Corresponding COBOL Variable is IP02014L-ONSOIL-DATA-SHR-SW
	*  @param value
	**/
   public void setIp02014lOnsoilDataShrSw(char[] value) {
      ip02014lOnsoilDataShrSw = checkIp02014lOnsoilDataShrSwConstraints(value);
      serializeIp02014lOnsoilDataShrSw(ip02014lOnsoilDataShrSw);
   } 

     /**
	 * 	Update Ip02014lOnsoilDataShrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lOnsoilDataShrSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lOnsoilDataShrSw,ip02014lOnsoilDataShrSw.length);
   	
   }
   
   public void setIp02014lOnsoilDataShrSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOnsoilDataShrSw,ip02014lOnsoilDataShrSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lOnsoilDataShrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lOnsoilDataShrSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOnsoilDataShrSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lOnsoilDataShrSw with another Field
	 *	@param value
	 */
   public void setIp02014lOnsoilDataShrSw(Field source) {
       replace(source,0,source.length(),beginIp02014lOnsoilDataShrSw,IP_02014L_ONSOIL_DATA_SHR_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lOnsoilDataShrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lOnsoilDataShrSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lOnsoilDataShrSw,IP_02014L_ONSOIL_DATA_SHR_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lOnsoilDataShrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lOnsoilDataShrSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOnsoilDataShrSw+targetIndex,targetLen);
    
   }
	char[] ip02014lDataShrAllowed8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014lDataShrAllowed88()
	 *	@return  Returns true if isIp02014lDataShrAllowed88() is "Y"
	 */
   public boolean isIp02014lDataShrAllowed88() throws CFException {
      return (  compareChars( getIp02014lOnsoilDataShrSw() , ip02014lDataShrAllowed8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014lDataShrAllowed88True() {  			
    	setIp02014lOnsoilDataShrSw( ip02014lDataShrAllowed8888Value);
   	}
	char[] ip02014lDataShrNotAllow8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014lDataShrNotAllow88()
	 *	@return  Returns true if isIp02014lDataShrNotAllow88() is "N"
	 */
   public boolean isIp02014lDataShrNotAllow88() throws CFException {
      return (  compareChars( getIp02014lOnsoilDataShrSw() , ip02014lDataShrNotAllow8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014lDataShrNotAllow88True() {  			
    	setIp02014lOnsoilDataShrSw( ip02014lDataShrNotAllow8888Value);
   	}
	/**
	 *	Returns the value of ip02014lClrCycleNum
	 *	@return ip02014lClrCycleNum
	 */
	public int getIp02014lClrCycleNum() throws CFException {
       if (isIp02014lClrCycleNumModified()) { 
           ip02014lClrCycleNum = refreshIp02014lClrCycleNum();
        }
   		return ip02014lClrCycleNum;
	}
	

	
	   
	/**
	 * 	Update Ip02014lClrCycleNum with the passed value
	 *  Corresponding COBOL Variable is IP02014L-CLR-CYCLE-NUM
	 *	@param number
	 */
	public void setIp02014lClrCycleNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip02014lClrCycleNum = checkIp02014lClrCycleNumMaxLimit(number); 
		serializeIp02014lClrCycleNum(ip02014lClrCycleNum);
	}
	

	public void setIp02014lClrCycleNum(long number) {
	    number = checkIp02014lClrCycleNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02014lClrCycleNum((int)number);
	}
	
	/**
	 * 	Update Ip02014lClrCycleNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014lClrCycleNum(char[] value) throws CFException {
		 ip02014lClrCycleNum = serializeIp02014lClrCycleNum(value);
	}
	/**
	 * 	Update Ip02014lClrCycleNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014lClrCycleNumString(char[] value) throws CFException {
		 setIp02014lClrCycleNum(value);
	}
	/**
	 *	Returns the value of ip02014lDtaWrhsOnsoilSw
	 *	@return ip02014lDtaWrhsOnsoilSw
	 */
   public char[] getIp02014lDtaWrhsOnsoilSw() throws CFException{
     if (isIp02014lDtaWrhsOnsoilSwModified()) { 
        ip02014lDtaWrhsOnsoilSw = refreshIp02014lDtaWrhsOnsoilSw();
     }
   		return ip02014lDtaWrhsOnsoilSw;
   }

  
	/**
	*  set variable ip02014lDtaWrhsOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-DTA-WRHS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lDtaWrhsOnsoilSw(char[] value) {
      ip02014lDtaWrhsOnsoilSw = checkIp02014lDtaWrhsOnsoilSwConstraints(value);
      serializeIp02014lDtaWrhsOnsoilSw(ip02014lDtaWrhsOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lDtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lDtaWrhsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lDtaWrhsOnsoilSw,ip02014lDtaWrhsOnsoilSw.length);
   	
   }
   
   public void setIp02014lDtaWrhsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lDtaWrhsOnsoilSw,ip02014lDtaWrhsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lDtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lDtaWrhsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lDtaWrhsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lDtaWrhsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lDtaWrhsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lDtaWrhsOnsoilSw,IP_02014L_DTA_WRHS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lDtaWrhsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lDtaWrhsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lDtaWrhsOnsoilSw,IP_02014L_DTA_WRHS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lDtaWrhsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lDtaWrhsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lDtaWrhsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lBllngOnsoilSw
	 *	@return ip02014lBllngOnsoilSw
	 */
   public char[] getIp02014lBllngOnsoilSw() throws CFException{
     if (isIp02014lBllngOnsoilSwModified()) { 
        ip02014lBllngOnsoilSw = refreshIp02014lBllngOnsoilSw();
     }
   		return ip02014lBllngOnsoilSw;
   }

  
	/**
	*  set variable ip02014lBllngOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-BLLNG-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lBllngOnsoilSw(char[] value) {
      ip02014lBllngOnsoilSw = checkIp02014lBllngOnsoilSwConstraints(value);
      serializeIp02014lBllngOnsoilSw(ip02014lBllngOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lBllngOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lBllngOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lBllngOnsoilSw,ip02014lBllngOnsoilSw.length);
   	
   }
   
   public void setIp02014lBllngOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBllngOnsoilSw,ip02014lBllngOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lBllngOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lBllngOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBllngOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lBllngOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lBllngOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lBllngOnsoilSw,IP_02014L_BLLNG_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lBllngOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lBllngOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lBllngOnsoilSw,IP_02014L_BLLNG_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lBllngOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lBllngOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBllngOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lSetlOnsoilSw
	 *	@return ip02014lSetlOnsoilSw
	 */
   public char[] getIp02014lSetlOnsoilSw() throws CFException{
     if (isIp02014lSetlOnsoilSwModified()) { 
        ip02014lSetlOnsoilSw = refreshIp02014lSetlOnsoilSw();
     }
   		return ip02014lSetlOnsoilSw;
   }

  
	/**
	*  set variable ip02014lSetlOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-SETL-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lSetlOnsoilSw(char[] value) {
      ip02014lSetlOnsoilSw = checkIp02014lSetlOnsoilSwConstraints(value);
      serializeIp02014lSetlOnsoilSw(ip02014lSetlOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lSetlOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lSetlOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lSetlOnsoilSw,ip02014lSetlOnsoilSw.length);
   	
   }
   
   public void setIp02014lSetlOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lSetlOnsoilSw,ip02014lSetlOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lSetlOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lSetlOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lSetlOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lSetlOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lSetlOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lSetlOnsoilSw,IP_02014L_SETL_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lSetlOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lSetlOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lSetlOnsoilSw,IP_02014L_SETL_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lSetlOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lSetlOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lSetlOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lClrOnsoilSw
	 *	@return ip02014lClrOnsoilSw
	 */
   public char[] getIp02014lClrOnsoilSw() throws CFException{
     if (isIp02014lClrOnsoilSwModified()) { 
        ip02014lClrOnsoilSw = refreshIp02014lClrOnsoilSw();
     }
   		return ip02014lClrOnsoilSw;
   }

  
	/**
	*  set variable ip02014lClrOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-CLR-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lClrOnsoilSw(char[] value) {
      ip02014lClrOnsoilSw = checkIp02014lClrOnsoilSwConstraints(value);
      serializeIp02014lClrOnsoilSw(ip02014lClrOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lClrOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lClrOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lClrOnsoilSw,ip02014lClrOnsoilSw.length);
   	
   }
   
   public void setIp02014lClrOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lClrOnsoilSw,ip02014lClrOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lClrOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lClrOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lClrOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lClrOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lClrOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lClrOnsoilSw,IP_02014L_CLR_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lClrOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lClrOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lClrOnsoilSw,IP_02014L_CLR_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lClrOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lClrOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lClrOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lAmsOnsoilSw
	 *	@return ip02014lAmsOnsoilSw
	 */
   public char[] getIp02014lAmsOnsoilSw() throws CFException{
     if (isIp02014lAmsOnsoilSwModified()) { 
        ip02014lAmsOnsoilSw = refreshIp02014lAmsOnsoilSw();
     }
   		return ip02014lAmsOnsoilSw;
   }

  
	/**
	*  set variable ip02014lAmsOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-AMS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lAmsOnsoilSw(char[] value) {
      ip02014lAmsOnsoilSw = checkIp02014lAmsOnsoilSwConstraints(value);
      serializeIp02014lAmsOnsoilSw(ip02014lAmsOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lAmsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lAmsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lAmsOnsoilSw,ip02014lAmsOnsoilSw.length);
   	
   }
   
   public void setIp02014lAmsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lAmsOnsoilSw,ip02014lAmsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lAmsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lAmsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lAmsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lAmsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lAmsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lAmsOnsoilSw,IP_02014L_AMS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lAmsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lAmsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lAmsOnsoilSw,IP_02014L_AMS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lAmsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lAmsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lAmsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lMcomOnsoilSw
	 *	@return ip02014lMcomOnsoilSw
	 */
   public char[] getIp02014lMcomOnsoilSw() throws CFException{
     if (isIp02014lMcomOnsoilSwModified()) { 
        ip02014lMcomOnsoilSw = refreshIp02014lMcomOnsoilSw();
     }
   		return ip02014lMcomOnsoilSw;
   }

  
	/**
	*  set variable ip02014lMcomOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-MCOM-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lMcomOnsoilSw(char[] value) {
      ip02014lMcomOnsoilSw = checkIp02014lMcomOnsoilSwConstraints(value);
      serializeIp02014lMcomOnsoilSw(ip02014lMcomOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lMcomOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lMcomOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lMcomOnsoilSw,ip02014lMcomOnsoilSw.length);
   	
   }
   
   public void setIp02014lMcomOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMcomOnsoilSw,ip02014lMcomOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lMcomOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lMcomOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMcomOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lMcomOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lMcomOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lMcomOnsoilSw,IP_02014L_MCOM_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lMcomOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lMcomOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lMcomOnsoilSw,IP_02014L_MCOM_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lMcomOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lMcomOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMcomOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lMdsOnsoilSw
	 *	@return ip02014lMdsOnsoilSw
	 */
   public char[] getIp02014lMdsOnsoilSw() throws CFException{
     if (isIp02014lMdsOnsoilSwModified()) { 
        ip02014lMdsOnsoilSw = refreshIp02014lMdsOnsoilSw();
     }
   		return ip02014lMdsOnsoilSw;
   }

  
	/**
	*  set variable ip02014lMdsOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-MDS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lMdsOnsoilSw(char[] value) {
      ip02014lMdsOnsoilSw = checkIp02014lMdsOnsoilSwConstraints(value);
      serializeIp02014lMdsOnsoilSw(ip02014lMdsOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lMdsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lMdsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lMdsOnsoilSw,ip02014lMdsOnsoilSw.length);
   	
   }
   
   public void setIp02014lMdsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMdsOnsoilSw,ip02014lMdsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lMdsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lMdsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMdsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lMdsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lMdsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lMdsOnsoilSw,IP_02014L_MDS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lMdsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lMdsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lMdsOnsoilSw,IP_02014L_MDS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lMdsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lMdsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMdsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lStndInOnsoilSw
	 *	@return ip02014lStndInOnsoilSw
	 */
   public char[] getIp02014lStndInOnsoilSw() throws CFException{
     if (isIp02014lStndInOnsoilSwModified()) { 
        ip02014lStndInOnsoilSw = refreshIp02014lStndInOnsoilSw();
     }
   		return ip02014lStndInOnsoilSw;
   }

  
	/**
	*  set variable ip02014lStndInOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-STND-IN-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lStndInOnsoilSw(char[] value) {
      ip02014lStndInOnsoilSw = checkIp02014lStndInOnsoilSwConstraints(value);
      serializeIp02014lStndInOnsoilSw(ip02014lStndInOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lStndInOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lStndInOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lStndInOnsoilSw,ip02014lStndInOnsoilSw.length);
   	
   }
   
   public void setIp02014lStndInOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lStndInOnsoilSw,ip02014lStndInOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lStndInOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lStndInOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lStndInOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lStndInOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lStndInOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lStndInOnsoilSw,IP_02014L_STND_IN_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lStndInOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lStndInOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lStndInOnsoilSw,IP_02014L_STND_IN_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lStndInOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lStndInOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lStndInOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lAuthOnsoilSw
	 *	@return ip02014lAuthOnsoilSw
	 */
   public char[] getIp02014lAuthOnsoilSw() throws CFException{
     if (isIp02014lAuthOnsoilSwModified()) { 
        ip02014lAuthOnsoilSw = refreshIp02014lAuthOnsoilSw();
     }
   		return ip02014lAuthOnsoilSw;
   }

  
	/**
	*  set variable ip02014lAuthOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-AUTH-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lAuthOnsoilSw(char[] value) {
      ip02014lAuthOnsoilSw = checkIp02014lAuthOnsoilSwConstraints(value);
      serializeIp02014lAuthOnsoilSw(ip02014lAuthOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lAuthOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lAuthOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lAuthOnsoilSw,ip02014lAuthOnsoilSw.length);
   	
   }
   
   public void setIp02014lAuthOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lAuthOnsoilSw,ip02014lAuthOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lAuthOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lAuthOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lAuthOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lAuthOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lAuthOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lAuthOnsoilSw,IP_02014L_AUTH_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lAuthOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lAuthOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lAuthOnsoilSw,IP_02014L_AUTH_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lAuthOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lAuthOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lAuthOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lPushOnsoilSw
	 *	@return ip02014lPushOnsoilSw
	 */
   public char[] getIp02014lPushOnsoilSw() throws CFException{
     if (isIp02014lPushOnsoilSwModified()) { 
        ip02014lPushOnsoilSw = refreshIp02014lPushOnsoilSw();
     }
   		return ip02014lPushOnsoilSw;
   }

  
	/**
	*  set variable ip02014lPushOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-PUSH-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lPushOnsoilSw(char[] value) {
      ip02014lPushOnsoilSw = checkIp02014lPushOnsoilSwConstraints(value);
      serializeIp02014lPushOnsoilSw(ip02014lPushOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lPushOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lPushOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lPushOnsoilSw,ip02014lPushOnsoilSw.length);
   	
   }
   
   public void setIp02014lPushOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lPushOnsoilSw,ip02014lPushOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lPushOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lPushOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lPushOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lPushOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lPushOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lPushOnsoilSw,IP_02014L_PUSH_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lPushOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lPushOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lPushOnsoilSw,IP_02014L_PUSH_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lPushOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lPushOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lPushOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lIncontrolOnsoilSw
	 *	@return ip02014lIncontrolOnsoilSw
	 */
   public char[] getIp02014lIncontrolOnsoilSw() throws CFException{
     if (isIp02014lIncontrolOnsoilSwModified()) { 
        ip02014lIncontrolOnsoilSw = refreshIp02014lIncontrolOnsoilSw();
     }
   		return ip02014lIncontrolOnsoilSw;
   }

  
	/**
	*  set variable ip02014lIncontrolOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-INCONTROL-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lIncontrolOnsoilSw(char[] value) {
      ip02014lIncontrolOnsoilSw = checkIp02014lIncontrolOnsoilSwConstraints(value);
      serializeIp02014lIncontrolOnsoilSw(ip02014lIncontrolOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lIncontrolOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lIncontrolOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lIncontrolOnsoilSw,ip02014lIncontrolOnsoilSw.length);
   	
   }
   
   public void setIp02014lIncontrolOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lIncontrolOnsoilSw,ip02014lIncontrolOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lIncontrolOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lIncontrolOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lIncontrolOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lIncontrolOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lIncontrolOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lIncontrolOnsoilSw,IP_02014L_INCONTROL_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lIncontrolOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lIncontrolOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lIncontrolOnsoilSw,IP_02014L_INCONTROL_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lIncontrolOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lIncontrolOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lIncontrolOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lEsrvcOnsoilSw
	 *	@return ip02014lEsrvcOnsoilSw
	 */
   public char[] getIp02014lEsrvcOnsoilSw() throws CFException{
     if (isIp02014lEsrvcOnsoilSwModified()) { 
        ip02014lEsrvcOnsoilSw = refreshIp02014lEsrvcOnsoilSw();
     }
   		return ip02014lEsrvcOnsoilSw;
   }

  
	/**
	*  set variable ip02014lEsrvcOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-ESRVC-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lEsrvcOnsoilSw(char[] value) {
      ip02014lEsrvcOnsoilSw = checkIp02014lEsrvcOnsoilSwConstraints(value);
      serializeIp02014lEsrvcOnsoilSw(ip02014lEsrvcOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lEsrvcOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lEsrvcOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lEsrvcOnsoilSw,ip02014lEsrvcOnsoilSw.length);
   	
   }
   
   public void setIp02014lEsrvcOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lEsrvcOnsoilSw,ip02014lEsrvcOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lEsrvcOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lEsrvcOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lEsrvcOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lEsrvcOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lEsrvcOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lEsrvcOnsoilSw,IP_02014L_ESRVC_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lEsrvcOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lEsrvcOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lEsrvcOnsoilSw,IP_02014L_ESRVC_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lEsrvcOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lEsrvcOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lEsrvcOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lGftOnsoilSw
	 *	@return ip02014lGftOnsoilSw
	 */
   public char[] getIp02014lGftOnsoilSw() throws CFException{
     if (isIp02014lGftOnsoilSwModified()) { 
        ip02014lGftOnsoilSw = refreshIp02014lGftOnsoilSw();
     }
   		return ip02014lGftOnsoilSw;
   }

  
	/**
	*  set variable ip02014lGftOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-GFT-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lGftOnsoilSw(char[] value) {
      ip02014lGftOnsoilSw = checkIp02014lGftOnsoilSwConstraints(value);
      serializeIp02014lGftOnsoilSw(ip02014lGftOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lGftOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lGftOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lGftOnsoilSw,ip02014lGftOnsoilSw.length);
   	
   }
   
   public void setIp02014lGftOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lGftOnsoilSw,ip02014lGftOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lGftOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lGftOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lGftOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lGftOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lGftOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lGftOnsoilSw,IP_02014L_GFT_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lGftOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lGftOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lGftOnsoilSw,IP_02014L_GFT_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lGftOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lGftOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lGftOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lBnknetOnsoilSw
	 *	@return ip02014lBnknetOnsoilSw
	 */
   public char[] getIp02014lBnknetOnsoilSw() throws CFException{
     if (isIp02014lBnknetOnsoilSwModified()) { 
        ip02014lBnknetOnsoilSw = refreshIp02014lBnknetOnsoilSw();
     }
   		return ip02014lBnknetOnsoilSw;
   }

  
	/**
	*  set variable ip02014lBnknetOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-BNKNET-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lBnknetOnsoilSw(char[] value) {
      ip02014lBnknetOnsoilSw = checkIp02014lBnknetOnsoilSwConstraints(value);
      serializeIp02014lBnknetOnsoilSw(ip02014lBnknetOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lBnknetOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lBnknetOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lBnknetOnsoilSw,ip02014lBnknetOnsoilSw.length);
   	
   }
   
   public void setIp02014lBnknetOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBnknetOnsoilSw,ip02014lBnknetOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lBnknetOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lBnknetOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBnknetOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lBnknetOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lBnknetOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lBnknetOnsoilSw,IP_02014L_BNKNET_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lBnknetOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lBnknetOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lBnknetOnsoilSw,IP_02014L_BNKNET_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lBnknetOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lBnknetOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBnknetOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lMdesOnsoilSw
	 *	@return ip02014lMdesOnsoilSw
	 */
   public char[] getIp02014lMdesOnsoilSw() throws CFException{
     if (isIp02014lMdesOnsoilSwModified()) { 
        ip02014lMdesOnsoilSw = refreshIp02014lMdesOnsoilSw();
     }
   		return ip02014lMdesOnsoilSw;
   }

  
	/**
	*  set variable ip02014lMdesOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-MDES-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lMdesOnsoilSw(char[] value) {
      ip02014lMdesOnsoilSw = checkIp02014lMdesOnsoilSwConstraints(value);
      serializeIp02014lMdesOnsoilSw(ip02014lMdesOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lMdesOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lMdesOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lMdesOnsoilSw,ip02014lMdesOnsoilSw.length);
   	
   }
   
   public void setIp02014lMdesOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMdesOnsoilSw,ip02014lMdesOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lMdesOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lMdesOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMdesOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lMdesOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lMdesOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lMdesOnsoilSw,IP_02014L_MDES_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lMdesOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lMdesOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lMdesOnsoilSw,IP_02014L_MDES_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lMdesOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lMdesOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lMdesOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lZappOnsoilSw
	 *	@return ip02014lZappOnsoilSw
	 */
   public char[] getIp02014lZappOnsoilSw() throws CFException{
     if (isIp02014lZappOnsoilSwModified()) { 
        ip02014lZappOnsoilSw = refreshIp02014lZappOnsoilSw();
     }
   		return ip02014lZappOnsoilSw;
   }

  
	/**
	*  set variable ip02014lZappOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-ZAPP-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lZappOnsoilSw(char[] value) {
      ip02014lZappOnsoilSw = checkIp02014lZappOnsoilSwConstraints(value);
      serializeIp02014lZappOnsoilSw(ip02014lZappOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lZappOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lZappOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lZappOnsoilSw,ip02014lZappOnsoilSw.length);
   	
   }
   
   public void setIp02014lZappOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lZappOnsoilSw,ip02014lZappOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lZappOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lZappOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lZappOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lZappOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lZappOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lZappOnsoilSw,IP_02014L_ZAPP_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lZappOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lZappOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lZappOnsoilSw,IP_02014L_ZAPP_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lZappOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lZappOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lZappOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lCemOnsoilSw
	 *	@return ip02014lCemOnsoilSw
	 */
   public char[] getIp02014lCemOnsoilSw() throws CFException{
     if (isIp02014lCemOnsoilSwModified()) { 
        ip02014lCemOnsoilSw = refreshIp02014lCemOnsoilSw();
     }
   		return ip02014lCemOnsoilSw;
   }

  
	/**
	*  set variable ip02014lCemOnsoilSw
	*  Corresponding COBOL Variable is IP02014L-CEM-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014lCemOnsoilSw(char[] value) {
      ip02014lCemOnsoilSw = checkIp02014lCemOnsoilSwConstraints(value);
      serializeIp02014lCemOnsoilSw(ip02014lCemOnsoilSw);
   } 

     /**
	 * 	Update Ip02014lCemOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lCemOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lCemOnsoilSw,ip02014lCemOnsoilSw.length);
   	
   }
   
   public void setIp02014lCemOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lCemOnsoilSw,ip02014lCemOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014lCemOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lCemOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lCemOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lCemOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014lCemOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014lCemOnsoilSw,IP_02014L_CEM_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lCemOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lCemOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lCemOnsoilSw,IP_02014L_CEM_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lCemOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lCemOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lCemOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lRptHdrName
	 *	@return ip02014lRptHdrName
	 */
   public char[] getIp02014lRptHdrName() throws CFException{
     if (isIp02014lRptHdrNameModified()) { 
        ip02014lRptHdrName = refreshIp02014lRptHdrName();
     }
   		return ip02014lRptHdrName;
   }

  
	/**
	*  set variable ip02014lRptHdrName
	*  Corresponding COBOL Variable is IP02014L-RPT-HDR-NAME
	*  @param value
	**/
   public void setIp02014lRptHdrName(char[] value) {
      ip02014lRptHdrName = checkIp02014lRptHdrNameConstraints(value);
      serializeIp02014lRptHdrName(ip02014lRptHdrName);
   } 

     /**
	 * 	Update Ip02014lRptHdrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lRptHdrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lRptHdrName,ip02014lRptHdrName.length);
   	
   }
   
   public void setIp02014lRptHdrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lRptHdrName,ip02014lRptHdrName.length);
   	
   }
   
     /**
	 * 	Update Ip02014lRptHdrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lRptHdrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lRptHdrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lRptHdrName with another Field
	 *	@param value
	 */
   public void setIp02014lRptHdrName(Field source) {
       replace(source,0,source.length(),beginIp02014lRptHdrName,IP_02014L_RPT_HDR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lRptHdrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lRptHdrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lRptHdrName,IP_02014L_RPT_HDR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lRptHdrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lRptHdrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lRptHdrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lClrPrcssCd
	 *	@return ip02014lClrPrcssCd
	 */
   public char[] getIp02014lClrPrcssCd() throws CFException{
     if (isIp02014lClrPrcssCdModified()) { 
        ip02014lClrPrcssCd = refreshIp02014lClrPrcssCd();
     }
   		return ip02014lClrPrcssCd;
   }

  
	/**
	*  set variable ip02014lClrPrcssCd
	*  Corresponding COBOL Variable is IP02014L-CLR-PRCSS-CD
	*  @param value
	**/
   public void setIp02014lClrPrcssCd(char[] value) {
      ip02014lClrPrcssCd = checkIp02014lClrPrcssCdConstraints(value);
      serializeIp02014lClrPrcssCd(ip02014lClrPrcssCd);
   } 

     /**
	 * 	Update Ip02014lClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lClrPrcssCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lClrPrcssCd,ip02014lClrPrcssCd.length);
   	
   }
   
   public void setIp02014lClrPrcssCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lClrPrcssCd,ip02014lClrPrcssCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014lClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lClrPrcssCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lClrPrcssCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02014lClrPrcssCd(Field source) {
       replace(source,0,source.length(),beginIp02014lClrPrcssCd,IP_02014L_CLR_PRCSS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lClrPrcssCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lClrPrcssCd,IP_02014L_CLR_PRCSS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lClrPrcssCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lClrPrcssCd+targetIndex,targetLen);
    
   }
	char[] ip02014lGlobalPrcssCd8888Value = "GCMS".toCharArray();
	/**
	 *	Test condition "GCMS" for isIp02014lGlobalPrcssCd88()
	 *	@return  Returns true if isIp02014lGlobalPrcssCd88() is "GCMS"
	 */
   public boolean isIp02014lGlobalPrcssCd88() throws CFException {
      return (  compareChars( getIp02014lClrPrcssCd() , ip02014lGlobalPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "GCMS"
	*/
   	public void setIp02014lGlobalPrcssCd88True() {  			
    	setIp02014lClrPrcssCd( ip02014lGlobalPrcssCd8888Value);
   	}
	char[] ip02014lLocalPrcssCd8888Value = "LCMS".toCharArray();
	/**
	 *	Test condition "LCMS" for isIp02014lLocalPrcssCd88()
	 *	@return  Returns true if isIp02014lLocalPrcssCd88() is "LCMS"
	 */
   public boolean isIp02014lLocalPrcssCd88() throws CFException {
      return (  compareChars( getIp02014lClrPrcssCd() , ip02014lLocalPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "LCMS"
	*/
   	public void setIp02014lLocalPrcssCd88True() {  			
    	setIp02014lClrPrcssCd( ip02014lLocalPrcssCd8888Value);
   	}
	char[] ip02014lRedactPrcssCd8888Value = "RCMS".toCharArray();
	/**
	 *	Test condition "RCMS" for isIp02014lRedactPrcssCd88()
	 *	@return  Returns true if isIp02014lRedactPrcssCd88() is "RCMS"
	 */
   public boolean isIp02014lRedactPrcssCd88() throws CFException {
      return (  compareChars( getIp02014lClrPrcssCd() , ip02014lRedactPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "RCMS"
	*/
   	public void setIp02014lRedactPrcssCd88True() {  			
    	setIp02014lClrPrcssCd( ip02014lRedactPrcssCd8888Value);
   	}
	/**
	 *	Returns the value of ip02014lOnUsPrcssAgrmtId
	 *	@return ip02014lOnUsPrcssAgrmtId
	 */
   public char[] getIp02014lOnUsPrcssAgrmtId() throws CFException{
     if (isIp02014lOnUsPrcssAgrmtIdModified()) { 
        ip02014lOnUsPrcssAgrmtId = refreshIp02014lOnUsPrcssAgrmtId();
     }
   		return ip02014lOnUsPrcssAgrmtId;
   }

  
	/**
	*  set variable ip02014lOnUsPrcssAgrmtId
	*  Corresponding COBOL Variable is IP02014L-ON-US-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02014lOnUsPrcssAgrmtId(char[] value) {
      ip02014lOnUsPrcssAgrmtId = checkIp02014lOnUsPrcssAgrmtIdConstraints(value);
      serializeIp02014lOnUsPrcssAgrmtId(ip02014lOnUsPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02014lOnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lOnUsPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lOnUsPrcssAgrmtId,ip02014lOnUsPrcssAgrmtId.length);
   	
   }
   
   public void setIp02014lOnUsPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOnUsPrcssAgrmtId,ip02014lOnUsPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02014lOnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lOnUsPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOnUsPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lOnUsPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014lOnUsPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02014lOnUsPrcssAgrmtId,IP_02014L_ON_US_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lOnUsPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lOnUsPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lOnUsPrcssAgrmtId,IP_02014L_ON_US_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lOnUsPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lOnUsPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOnUsPrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lOperSysId
	 *	@return ip02014lOperSysId
	 */
   public char[] getIp02014lOperSysId() throws CFException{
     if (isIp02014lOperSysIdModified()) { 
        ip02014lOperSysId = refreshIp02014lOperSysId();
     }
   		return ip02014lOperSysId;
   }

  
	/**
	*  set variable ip02014lOperSysId
	*  Corresponding COBOL Variable is IP02014L-OPER-SYS-ID
	*  @param value
	**/
   public void setIp02014lOperSysId(char[] value) {
      ip02014lOperSysId = checkIp02014lOperSysIdConstraints(value);
      serializeIp02014lOperSysId(ip02014lOperSysId);
   } 

     /**
	 * 	Update Ip02014lOperSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lOperSysId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lOperSysId,ip02014lOperSysId.length);
   	
   }
   
   public void setIp02014lOperSysId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOperSysId,ip02014lOperSysId.length);
   	
   }
   
     /**
	 * 	Update Ip02014lOperSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lOperSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOperSysId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lOperSysId with another Field
	 *	@param value
	 */
   public void setIp02014lOperSysId(Field source) {
       replace(source,0,source.length(),beginIp02014lOperSysId,IP_02014L_OPER_SYS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lOperSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lOperSysId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lOperSysId,IP_02014L_OPER_SYS_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lOperSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lOperSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lOperSysId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lDbId
	 *	@return ip02014lDbId
	 */
   public char[] getIp02014lDbId() throws CFException{
     if (isIp02014lDbIdModified()) { 
        ip02014lDbId = refreshIp02014lDbId();
     }
   		return ip02014lDbId;
   }

  
	/**
	*  set variable ip02014lDbId
	*  Corresponding COBOL Variable is IP02014L-DB-ID
	*  @param value
	**/
   public void setIp02014lDbId(char[] value) {
      ip02014lDbId = checkIp02014lDbIdConstraints(value);
      serializeIp02014lDbId(ip02014lDbId);
   } 

     /**
	 * 	Update Ip02014lDbId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lDbId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lDbId,ip02014lDbId.length);
   	
   }
   
   public void setIp02014lDbId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lDbId,ip02014lDbId.length);
   	
   }
   
     /**
	 * 	Update Ip02014lDbId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lDbId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lDbId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lDbId with another Field
	 *	@param value
	 */
   public void setIp02014lDbId(Field source) {
       replace(source,0,source.length(),beginIp02014lDbId,IP_02014L_DB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lDbId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lDbId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lDbId,IP_02014L_DB_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lDbId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lDbId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lDbId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lFiller
	 *	@return ip02014lFiller
	 */
   public char[] getIp02014lFiller() throws CFException{
     if (isIp02014lFillerModified()) { 
        ip02014lFiller = refreshIp02014lFiller();
     }
   		return ip02014lFiller;
   }

  
	/**
	*  set variable ip02014lFiller
	*  Corresponding COBOL Variable is IP02014L-FILLER
	*  @param value
	**/
   public void setIp02014lFiller(char[] value) {
      ip02014lFiller = checkIp02014lFillerConstraints(value);
      serializeIp02014lFiller(ip02014lFiller);
   } 

     /**
	 * 	Update Ip02014lFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lFiller,ip02014lFiller.length);
   	
   }
   
   public void setIp02014lFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lFiller,ip02014lFiller.length);
   	
   }
   
     /**
	 * 	Update Ip02014lFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lFiller with another Field
	 *	@param value
	 */
   public void setIp02014lFiller(Field source) {
       replace(source,0,source.length(),beginIp02014lFiller,IP_02014L_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lFiller,IP_02014L_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lFiller+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014lTableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014lGeoScopeCode(CONSTANTS.SPACE);
         setIp02014lHostInd(CONSTANTS.SPACE);
          ip02014lImpBulkId.initialize();
     
                     setIp02014lNumCurrCd(0);
         setIp02014lOfsoilDataTypCd(CONSTANTS.SPACE_3);
         setIp02014lMrchntSplitCd(CONSTANTS.SPACE);
         setIp02014lCurrSplitCd(CONSTANTS.SPACE);
         setIp02014lAcquirerSplitCd(CONSTANTS.SPACE);
         setIp02014lDomCollOnlyCd(CONSTANTS.SPACE);
         setIp02014lOnsoilDataShrSw(CONSTANTS.SPACE);
                     setIp02014lClrCycleNum(0);
         setIp02014lDtaWrhsOnsoilSw(CONSTANTS.SPACE);
         setIp02014lBllngOnsoilSw(CONSTANTS.SPACE);
         setIp02014lSetlOnsoilSw(CONSTANTS.SPACE);
         setIp02014lClrOnsoilSw(CONSTANTS.SPACE);
         setIp02014lAmsOnsoilSw(CONSTANTS.SPACE);
         setIp02014lMcomOnsoilSw(CONSTANTS.SPACE);
         setIp02014lMdsOnsoilSw(CONSTANTS.SPACE);
         setIp02014lStndInOnsoilSw(CONSTANTS.SPACE);
         setIp02014lAuthOnsoilSw(CONSTANTS.SPACE);
         setIp02014lPushOnsoilSw(CONSTANTS.SPACE);
         setIp02014lIncontrolOnsoilSw(CONSTANTS.SPACE);
         setIp02014lEsrvcOnsoilSw(CONSTANTS.SPACE);
         setIp02014lGftOnsoilSw(CONSTANTS.SPACE);
         setIp02014lBnknetOnsoilSw(CONSTANTS.SPACE);
         setIp02014lMdesOnsoilSw(CONSTANTS.SPACE);
         setIp02014lZappOnsoilSw(CONSTANTS.SPACE);
         setIp02014lCemOnsoilSw(CONSTANTS.SPACE);
         setIp02014lRptHdrName(CONSTANTS.SPACE_80);
         setIp02014lClrPrcssCd(CONSTANTS.SPACE_4);
         setIp02014lOnUsPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02014lOperSysId(CONSTANTS.SPACE_20);
         setIp02014lDbId(CONSTANTS.SPACE_20);
         setIp02014lFiller(CONSTANTS.SPACE_750);
   }

		public static int getIp02014lTableDataFieldsFieldLength() {
			return IP_02014L_TABLE_DATA_FIELDS_LENGTH;
		}

}
  
