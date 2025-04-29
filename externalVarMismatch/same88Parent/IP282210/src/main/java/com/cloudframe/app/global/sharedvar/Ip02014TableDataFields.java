package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014TableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


public class Ip02014TableDataFields extends Ip02014TableDataFieldsSerialized { 
   

						private char[] ip02014GeoScopeCode = Field.fillLowValue(1);

						private char[] ip02014HostInd = Field.fillLowValue(1);
				private Ip02014ImpBulkId ip02014ImpBulkId = new Ip02014ImpBulkId();

								private int ip02014NumCurrCd;

						private char[] ip02014OfsoilDataTypCd = Field.fillLowValue(3);

						private char[] ip02014MrchntSplitCd = Field.fillLowValue(1);

						private char[] ip02014MrchntSplitSw = Field.fillLowValue(1);

						private char[] ip02014CurrSplitCd = Field.fillLowValue(1);

						private char[] ip02014CurrSplitSw = Field.fillLowValue(1);

						private char[] ip02014AcquirerSplitCd = Field.fillLowValue(1);

						private char[] ip02014AcquirerSplitSw = Field.fillLowValue(1);

						private char[] ip02014DomCollOnlyCd = Field.fillLowValue(1);

						private char[] ip02014OnsoilDataShrSw = Field.fillLowValue(1);

								private int ip02014ClrCycleNum;

						private char[] ip02014DtaWrhsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014BllngOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014SetlOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014ClrOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014AmsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014McomOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014MdsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014StndInOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014AuthOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014PushOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014IncontrolOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014EsrvcOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014GftOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014BnknetOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014MdesOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014ZappOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014CemOnsoilSw = Field.fillLowValue(1);

						private char[] ip02014RptHdrName = Field.fillLowValue(80);

						private char[] ip02014ClrPrcssCd = Field.fillLowValue(4);

						private char[] ip02014OnUsPrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip02014OperSysId = Field.fillLowValue(20);

						private char[] ip02014DbId = Field.fillLowValue(20);
			private List<Ip02014Db2Table> ip02014Db2Table = new ArrayList<>();
    	

						private char[] ip02014Filler = Field.fillLowValue(750);
	
	/**
	* Constructor for Ip02014TableDataFields
	**/
    public Ip02014TableDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014TableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014TableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip02014ImpBulkId.setParent(this,getStartOffset() + 2);
				for (int arrayIndex = 0; arrayIndex < IP_02014_DB_2_TABLE_SIZE;arrayIndex++) {
						ip02014Db2Table.add(new Ip02014Db2Table(this, beginIp02014Db2Table + 
						arrayIndex * Ip02014Db2Table.getIp02014Db2TableFieldLength()));
				}
    } 

	/**
	 *	Returns the value of ip02014GeoScopeCode
	 *	@return ip02014GeoScopeCode
	 */
   public char[] getIp02014GeoScopeCode() throws CFException{
     if (isIp02014GeoScopeCodeModified()) { 
        ip02014GeoScopeCode = refreshIp02014GeoScopeCode();
     }
   		return ip02014GeoScopeCode;
   }

  
	/**
	*  set variable ip02014GeoScopeCode
	*  Corresponding COBOL Variable is IP02014-GEO-SCOPE-CODE
	*  @param value
	**/
   public void setIp02014GeoScopeCode(char[] value) {
      ip02014GeoScopeCode = checkIp02014GeoScopeCodeConstraints(value);
      serializeIp02014GeoScopeCode(ip02014GeoScopeCode);
   } 

     /**
	 * 	Update Ip02014GeoScopeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014GeoScopeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014GeoScopeCode,ip02014GeoScopeCode.length);
   	
   }
   
   public void setIp02014GeoScopeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014GeoScopeCode,ip02014GeoScopeCode.length);
   	
   }
   
     /**
	 * 	Update Ip02014GeoScopeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014GeoScopeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014GeoScopeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014GeoScopeCode with another Field
	 *	@param value
	 */
   public void setIp02014GeoScopeCode(Field source) {
       replace(source,0,source.length(),beginIp02014GeoScopeCode,IP_02014_GEO_SCOPE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014GeoScopeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014GeoScopeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014GeoScopeCode,IP_02014_GEO_SCOPE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014GeoScopeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014GeoScopeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014GeoScopeCode+targetIndex,targetLen);
    
   }
	char[] ip02014PaGlobal8888Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isIp02014PaGlobal88()
	 *	@return  Returns true if isIp02014PaGlobal88() is "G"
	 */
   public boolean isIp02014PaGlobal88() throws CFException {
      return (  compareChars( getIp02014GeoScopeCode() , ip02014PaGlobal8888Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setIp02014PaGlobal88True() {  			
    	setIp02014GeoScopeCode( ip02014PaGlobal8888Value);
   	}
	char[] ip02014PaLocal8888Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isIp02014PaLocal88()
	 *	@return  Returns true if isIp02014PaLocal88() is "L"
	 */
   public boolean isIp02014PaLocal88() throws CFException {
      return (  compareChars( getIp02014GeoScopeCode() , ip02014PaLocal8888Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setIp02014PaLocal88True() {  			
    	setIp02014GeoScopeCode( ip02014PaLocal8888Value);
   	}
	char[] ip02014PaRegional8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp02014PaRegional88()
	 *	@return  Returns true if isIp02014PaRegional88() is "R"
	 */
   public boolean isIp02014PaRegional88() throws CFException {
      return (  compareChars( getIp02014GeoScopeCode() , ip02014PaRegional8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp02014PaRegional88True() {  			
    	setIp02014GeoScopeCode( ip02014PaRegional8888Value);
   	}
	/**
	 *	Returns the value of ip02014HostInd
	 *	@return ip02014HostInd
	 */
   public char[] getIp02014HostInd() throws CFException{
     if (isIp02014HostIndModified()) { 
        ip02014HostInd = refreshIp02014HostInd();
     }
   		return ip02014HostInd;
   }

  
	/**
	*  set variable ip02014HostInd
	*  Corresponding COBOL Variable is IP02014-HOST-IND
	*  @param value
	**/
   public void setIp02014HostInd(char[] value) {
      ip02014HostInd = checkIp02014HostIndConstraints(value);
      serializeIp02014HostInd(ip02014HostInd);
   } 

     /**
	 * 	Update Ip02014HostInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014HostInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014HostInd,ip02014HostInd.length);
   	
   }
   
   public void setIp02014HostInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014HostInd,ip02014HostInd.length);
   	
   }
   
     /**
	 * 	Update Ip02014HostInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014HostInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014HostInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014HostInd with another Field
	 *	@param value
	 */
   public void setIp02014HostInd(Field source) {
       replace(source,0,source.length(),beginIp02014HostInd,IP_02014_HOST_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014HostInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014HostInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014HostInd,IP_02014_HOST_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014HostInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014HostInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014HostInd+targetIndex,targetLen);
    
   }
	char[] ip02014PaIsHost8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014PaIsHost88()
	 *	@return  Returns true if isIp02014PaIsHost88() is "Y"
	 */
   public boolean isIp02014PaIsHost88() throws CFException {
      return (  compareChars( getIp02014HostInd() , ip02014PaIsHost8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014PaIsHost88True() {  			
    	setIp02014HostInd( ip02014PaIsHost8888Value);
   	}
	char[] ip02014NotTheHost8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014NotTheHost88()
	 *	@return  Returns true if isIp02014NotTheHost88() is "N"
	 */
   public boolean isIp02014NotTheHost88() throws CFException {
      return (  compareChars( getIp02014HostInd() , ip02014NotTheHost8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014NotTheHost88True() {  			
    	setIp02014HostInd( ip02014NotTheHost8888Value);
   	}
	/**
	 *	Returns the value of ip02014ImpBulkId
	 *	@return ip02014ImpBulkId
	 */   
	 public Ip02014ImpBulkId getIp02014ImpBulkId() {
   	return ip02014ImpBulkId;
   }
   /**
	* 	Update Ip02014ImpBulkId with the passed value
	*   Corresponding COBOL Variable is IP02014-IMP-BULK-ID
	*	@param value
	*/
   public void setIp02014ImpBulkId(char[] value) {
      ip02014ImpBulkId.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014ImpBulkId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014ImpBulkId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014ImpBulkId.begin,ip02014ImpBulkId.length());
   }
   
     /**
	 * 	Update Ip02014ImpBulkId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ImpBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014ImpBulkId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014ImpBulkId with another Field
	 *	@param value
	 */
   public void setIp02014ImpBulkId(Field source) {
   	replace(source,0,source.length(),ip02014ImpBulkId.begin,ip02014ImpBulkId.length());
   }  
   
     /**
	 * 	Update Ip02014ImpBulkId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014ImpBulkId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014ImpBulkId.begin,ip02014ImpBulkId.length());
   }
   
     /**
	 * 	Update Ip02014ImpBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ImpBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014ImpBulkId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip02014NumCurrCd
	 *	@return ip02014NumCurrCd
	 */
	public int getIp02014NumCurrCd() throws CFException {
       if (isIp02014NumCurrCdModified()) { 
           ip02014NumCurrCd = refreshIp02014NumCurrCd();
        }
   		return ip02014NumCurrCd;
	}
	

	
	   
	/**
	 * 	Update Ip02014NumCurrCd with the passed value
	 *  Corresponding COBOL Variable is IP02014-NUM-CURR-CD
	 *	@param number
	 */
	public void setIp02014NumCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip02014NumCurrCd = checkIp02014NumCurrCdMaxLimit(number); 
		serializeIp02014NumCurrCd(ip02014NumCurrCd);
	}
	

	public void setIp02014NumCurrCd(long number) {
	    number = checkIp02014NumCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02014NumCurrCd((int)number);
	}
	
	/**
	 * 	Update Ip02014NumCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014NumCurrCd(char[] value) throws CFException {
		 ip02014NumCurrCd = serializeIp02014NumCurrCd(value);
	}
	/**
	 * 	Update Ip02014NumCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014NumCurrCdString(char[] value) throws CFException {
		 setIp02014NumCurrCd(value);
	}
	/**
	 *	Returns the value of ip02014OfsoilDataTypCd
	 *	@return ip02014OfsoilDataTypCd
	 */
   public char[] getIp02014OfsoilDataTypCd() throws CFException{
     if (isIp02014OfsoilDataTypCdModified()) { 
        ip02014OfsoilDataTypCd = refreshIp02014OfsoilDataTypCd();
     }
   		return ip02014OfsoilDataTypCd;
   }

  
	/**
	*  set variable ip02014OfsoilDataTypCd
	*  Corresponding COBOL Variable is IP02014-OFSOIL-DATA-TYP-CD
	*  @param value
	**/
   public void setIp02014OfsoilDataTypCd(char[] value) {
      ip02014OfsoilDataTypCd = checkIp02014OfsoilDataTypCdConstraints(value);
      serializeIp02014OfsoilDataTypCd(ip02014OfsoilDataTypCd);
   } 

     /**
	 * 	Update Ip02014OfsoilDataTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014OfsoilDataTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014OfsoilDataTypCd,ip02014OfsoilDataTypCd.length);
   	
   }
   
   public void setIp02014OfsoilDataTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OfsoilDataTypCd,ip02014OfsoilDataTypCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014OfsoilDataTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014OfsoilDataTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OfsoilDataTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014OfsoilDataTypCd with another Field
	 *	@param value
	 */
   public void setIp02014OfsoilDataTypCd(Field source) {
       replace(source,0,source.length(),beginIp02014OfsoilDataTypCd,IP_02014_OFSOIL_DATA_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014OfsoilDataTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014OfsoilDataTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014OfsoilDataTypCd,IP_02014_OFSOIL_DATA_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014OfsoilDataTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014OfsoilDataTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OfsoilDataTypCd+targetIndex,targetLen);
    
   }
	char[] ip02014PaTransLevel8888Value = "TXL".toCharArray();
	/**
	 *	Test condition "TXL" for isIp02014PaTransLevel88()
	 *	@return  Returns true if isIp02014PaTransLevel88() is "TXL"
	 */
   public boolean isIp02014PaTransLevel88() throws CFException {
      return (  compareChars( getIp02014OfsoilDataTypCd() , ip02014PaTransLevel8888Value)  == 0  );
   }


	/**
	*  set values "TXL"
	*/
   	public void setIp02014PaTransLevel88True() {  			
    	setIp02014OfsoilDataTypCd( ip02014PaTransLevel8888Value);
   	}
	char[] ip02014PaTransLevelObs8888Value = "TXO".toCharArray();
	/**
	 *	Test condition "TXO" for isIp02014PaTransLevelObs88()
	 *	@return  Returns true if isIp02014PaTransLevelObs88() is "TXO"
	 */
   public boolean isIp02014PaTransLevelObs88() throws CFException {
      return (  compareChars( getIp02014OfsoilDataTypCd() , ip02014PaTransLevelObs8888Value)  == 0  );
   }


	/**
	*  set values "TXO"
	*/
   	public void setIp02014PaTransLevelObs88True() {  			
    	setIp02014OfsoilDataTypCd( ip02014PaTransLevelObs8888Value);
   	}
	char[] ip02014PaSummaryLevel8888Value = "SUM".toCharArray();
	/**
	 *	Test condition "SUM" for isIp02014PaSummaryLevel88()
	 *	@return  Returns true if isIp02014PaSummaryLevel88() is "SUM"
	 */
   public boolean isIp02014PaSummaryLevel88() throws CFException {
      return (  compareChars( getIp02014OfsoilDataTypCd() , ip02014PaSummaryLevel8888Value)  == 0  );
   }


	/**
	*  set values "SUM"
	*/
   	public void setIp02014PaSummaryLevel88True() {  			
    	setIp02014OfsoilDataTypCd( ip02014PaSummaryLevel8888Value);
   	}
	/**
	 *	Returns the value of ip02014MrchntSplitCd
	 *	@return ip02014MrchntSplitCd
	 */
   public char[] getIp02014MrchntSplitCd() throws CFException{
     if (isIp02014MrchntSplitCdModified()) { 
        ip02014MrchntSplitCd = refreshIp02014MrchntSplitCd();
     }
   		return ip02014MrchntSplitCd;
   }

  
	/**
	*  set variable ip02014MrchntSplitCd
	*  Corresponding COBOL Variable is IP02014-MRCHNT-SPLIT-CD
	*  @param value
	**/
   public void setIp02014MrchntSplitCd(char[] value) {
      ip02014MrchntSplitCd = checkIp02014MrchntSplitCdConstraints(value);
      serializeIp02014MrchntSplitCd(ip02014MrchntSplitCd);
   } 

     /**
	 * 	Update Ip02014MrchntSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014MrchntSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014MrchntSplitCd,ip02014MrchntSplitCd.length);
   	
   }
   
   public void setIp02014MrchntSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MrchntSplitCd,ip02014MrchntSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014MrchntSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014MrchntSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MrchntSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014MrchntSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014MrchntSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02014MrchntSplitCd,IP_02014_MRCHNT_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014MrchntSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014MrchntSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014MrchntSplitCd,IP_02014_MRCHNT_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014MrchntSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014MrchntSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MrchntSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02014IncMrchtSpltY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014IncMrchtSpltY88()
	 *	@return  Returns true if isIp02014IncMrchtSpltY88() is "Y"
	 */
   public boolean isIp02014IncMrchtSpltY88() throws CFException {
      return (  compareChars( getIp02014MrchntSplitCd() , ip02014IncMrchtSpltY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014IncMrchtSpltY88True() {  			
    	setIp02014MrchntSplitCd( ip02014IncMrchtSpltY8888Value);
   	}
	char[] ip02014IncMrchtSpltN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014IncMrchtSpltN88()
	 *	@return  Returns true if isIp02014IncMrchtSpltN88() is "N"
	 */
   public boolean isIp02014IncMrchtSpltN88() throws CFException {
      return (  compareChars( getIp02014MrchntSplitCd() , ip02014IncMrchtSpltN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014IncMrchtSpltN88True() {  			
    	setIp02014MrchntSplitCd( ip02014IncMrchtSpltN8888Value);
   	}
	char[] ip02014IncMrchntSpltC8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02014IncMrchntSpltC88()
	 *	@return  Returns true if isIp02014IncMrchntSpltC88() is "C"
	 */
   public boolean isIp02014IncMrchntSpltC88() throws CFException {
      return (  compareChars( getIp02014MrchntSplitCd() , ip02014IncMrchntSpltC8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02014IncMrchntSpltC88True() {  			
    	setIp02014MrchntSplitCd( ip02014IncMrchntSpltC8888Value);
   	}
	/**
	 *	Returns the value of ip02014MrchntSplitSw
	 *	@return ip02014MrchntSplitSw
	 */
   public char[] getIp02014MrchntSplitSw() throws CFException{
     if (isIp02014MrchntSplitSwModified()) { 
        ip02014MrchntSplitSw = refreshIp02014MrchntSplitSw();
     }
   		return ip02014MrchntSplitSw;
   }

  
	/**
	*  set variable ip02014MrchntSplitSw
	*  Corresponding COBOL Variable is IP02014-MRCHNT-SPLIT-SW
	*  @param value
	**/
   public void setIp02014MrchntSplitSw(char[] value) {
      ip02014MrchntSplitSw = checkIp02014MrchntSplitSwConstraints(value);
      serializeIp02014MrchntSplitSw(ip02014MrchntSplitSw);
   } 

     /**
	 * 	Update Ip02014MrchntSplitSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014MrchntSplitSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014MrchntSplitSw,ip02014MrchntSplitSw.length);
   	
   }
   
   public void setIp02014MrchntSplitSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MrchntSplitSw,ip02014MrchntSplitSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014MrchntSplitSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014MrchntSplitSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MrchntSplitSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014MrchntSplitSw with another Field
	 *	@param value
	 */
   public void setIp02014MrchntSplitSw(Field source) {
       replace(source,0,source.length(),beginIp02014MrchntSplitSw,IP_02014_MRCHNT_SPLIT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014MrchntSplitSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014MrchntSplitSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014MrchntSplitSw,IP_02014_MRCHNT_SPLIT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014MrchntSplitSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014MrchntSplitSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MrchntSplitSw+targetIndex,targetLen);
    
   }
	char[] ip02014IncMrchtSpltY88288Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014IncMrchtSpltY882()
	 *	@return  Returns true if isIp02014IncMrchtSpltY882() is "Y"
	 */
   public boolean isIp02014IncMrchtSpltY882() throws CFException {
      return (  compareChars( getIp02014MrchntSplitSw() , ip02014IncMrchtSpltY88288Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014IncMrchtSpltY882True() {  			
    	setIp02014MrchntSplitSw( ip02014IncMrchtSpltY88288Value);
   	}
	char[] ip02014IncMrchtSpltN88288Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014IncMrchtSpltN882()
	 *	@return  Returns true if isIp02014IncMrchtSpltN882() is "N"
	 */
   public boolean isIp02014IncMrchtSpltN882() throws CFException {
      return (  compareChars( getIp02014MrchntSplitSw() , ip02014IncMrchtSpltN88288Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014IncMrchtSpltN882True() {  			
    	setIp02014MrchntSplitSw( ip02014IncMrchtSpltN88288Value);
   	}
	/**
	 *	Returns the value of ip02014CurrSplitCd
	 *	@return ip02014CurrSplitCd
	 */
   public char[] getIp02014CurrSplitCd() throws CFException{
     if (isIp02014CurrSplitCdModified()) { 
        ip02014CurrSplitCd = refreshIp02014CurrSplitCd();
     }
   		return ip02014CurrSplitCd;
   }

  
	/**
	*  set variable ip02014CurrSplitCd
	*  Corresponding COBOL Variable is IP02014-CURR-SPLIT-CD
	*  @param value
	**/
   public void setIp02014CurrSplitCd(char[] value) {
      ip02014CurrSplitCd = checkIp02014CurrSplitCdConstraints(value);
      serializeIp02014CurrSplitCd(ip02014CurrSplitCd);
   } 

     /**
	 * 	Update Ip02014CurrSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014CurrSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014CurrSplitCd,ip02014CurrSplitCd.length);
   	
   }
   
   public void setIp02014CurrSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014CurrSplitCd,ip02014CurrSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014CurrSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014CurrSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014CurrSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014CurrSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014CurrSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02014CurrSplitCd,IP_02014_CURR_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014CurrSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014CurrSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014CurrSplitCd,IP_02014_CURR_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014CurrSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014CurrSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014CurrSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02014CurrSplitYes8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014CurrSplitYes88()
	 *	@return  Returns true if isIp02014CurrSplitYes88() is "Y"
	 */
   public boolean isIp02014CurrSplitYes88() throws CFException {
      return (  compareChars( getIp02014CurrSplitCd() , ip02014CurrSplitYes8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014CurrSplitYes88True() {  			
    	setIp02014CurrSplitCd( ip02014CurrSplitYes8888Value);
   	}
	char[] ip02014CurrSpitNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014CurrSpitNo88()
	 *	@return  Returns true if isIp02014CurrSpitNo88() is "N"
	 */
   public boolean isIp02014CurrSpitNo88() throws CFException {
      return (  compareChars( getIp02014CurrSplitCd() , ip02014CurrSpitNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014CurrSpitNo88True() {  			
    	setIp02014CurrSplitCd( ip02014CurrSpitNo8888Value);
   	}
	char[] ip02014CurrSplitCond8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02014CurrSplitCond88()
	 *	@return  Returns true if isIp02014CurrSplitCond88() is "C"
	 */
   public boolean isIp02014CurrSplitCond88() throws CFException {
      return (  compareChars( getIp02014CurrSplitCd() , ip02014CurrSplitCond8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02014CurrSplitCond88True() {  			
    	setIp02014CurrSplitCd( ip02014CurrSplitCond8888Value);
   	}
	/**
	 *	Returns the value of ip02014CurrSplitSw
	 *	@return ip02014CurrSplitSw
	 */
   public char[] getIp02014CurrSplitSw() throws CFException{
     if (isIp02014CurrSplitSwModified()) { 
        ip02014CurrSplitSw = refreshIp02014CurrSplitSw();
     }
   		return ip02014CurrSplitSw;
   }

  
	/**
	*  set variable ip02014CurrSplitSw
	*  Corresponding COBOL Variable is IP02014-CURR-SPLIT-SW
	*  @param value
	**/
   public void setIp02014CurrSplitSw(char[] value) {
      ip02014CurrSplitSw = checkIp02014CurrSplitSwConstraints(value);
      serializeIp02014CurrSplitSw(ip02014CurrSplitSw);
   } 

     /**
	 * 	Update Ip02014CurrSplitSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014CurrSplitSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014CurrSplitSw,ip02014CurrSplitSw.length);
   	
   }
   
   public void setIp02014CurrSplitSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014CurrSplitSw,ip02014CurrSplitSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014CurrSplitSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014CurrSplitSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014CurrSplitSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014CurrSplitSw with another Field
	 *	@param value
	 */
   public void setIp02014CurrSplitSw(Field source) {
       replace(source,0,source.length(),beginIp02014CurrSplitSw,IP_02014_CURR_SPLIT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014CurrSplitSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014CurrSplitSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014CurrSplitSw,IP_02014_CURR_SPLIT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014CurrSplitSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014CurrSplitSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014CurrSplitSw+targetIndex,targetLen);
    
   }
	char[] ip02014CurrSplitYes88288Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014CurrSplitYes882()
	 *	@return  Returns true if isIp02014CurrSplitYes882() is "Y"
	 */
   public boolean isIp02014CurrSplitYes882() throws CFException {
      return (  compareChars( getIp02014CurrSplitSw() , ip02014CurrSplitYes88288Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014CurrSplitYes882True() {  			
    	setIp02014CurrSplitSw( ip02014CurrSplitYes88288Value);
   	}
	char[] ip02014CurrSpitNo88288Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014CurrSpitNo882()
	 *	@return  Returns true if isIp02014CurrSpitNo882() is "N"
	 */
   public boolean isIp02014CurrSpitNo882() throws CFException {
      return (  compareChars( getIp02014CurrSplitSw() , ip02014CurrSpitNo88288Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014CurrSpitNo882True() {  			
    	setIp02014CurrSplitSw( ip02014CurrSpitNo88288Value);
   	}
	/**
	 *	Returns the value of ip02014AcquirerSplitCd
	 *	@return ip02014AcquirerSplitCd
	 */
   public char[] getIp02014AcquirerSplitCd() throws CFException{
     if (isIp02014AcquirerSplitCdModified()) { 
        ip02014AcquirerSplitCd = refreshIp02014AcquirerSplitCd();
     }
   		return ip02014AcquirerSplitCd;
   }

  
	/**
	*  set variable ip02014AcquirerSplitCd
	*  Corresponding COBOL Variable is IP02014-ACQUIRER-SPLIT-CD
	*  @param value
	**/
   public void setIp02014AcquirerSplitCd(char[] value) {
      ip02014AcquirerSplitCd = checkIp02014AcquirerSplitCdConstraints(value);
      serializeIp02014AcquirerSplitCd(ip02014AcquirerSplitCd);
   } 

     /**
	 * 	Update Ip02014AcquirerSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014AcquirerSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014AcquirerSplitCd,ip02014AcquirerSplitCd.length);
   	
   }
   
   public void setIp02014AcquirerSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AcquirerSplitCd,ip02014AcquirerSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014AcquirerSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AcquirerSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AcquirerSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014AcquirerSplitCd with another Field
	 *	@param value
	 */
   public void setIp02014AcquirerSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02014AcquirerSplitCd,IP_02014_ACQUIRER_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014AcquirerSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014AcquirerSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014AcquirerSplitCd,IP_02014_ACQUIRER_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014AcquirerSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AcquirerSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AcquirerSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02014AcquirerSplitYes8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014AcquirerSplitYes88()
	 *	@return  Returns true if isIp02014AcquirerSplitYes88() is "Y"
	 */
   public boolean isIp02014AcquirerSplitYes88() throws CFException {
      return (  compareChars( getIp02014AcquirerSplitCd() , ip02014AcquirerSplitYes8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014AcquirerSplitYes88True() {  			
    	setIp02014AcquirerSplitCd( ip02014AcquirerSplitYes8888Value);
   	}
	char[] ip02014AcquirerSplitNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014AcquirerSplitNo88()
	 *	@return  Returns true if isIp02014AcquirerSplitNo88() is "N"
	 */
   public boolean isIp02014AcquirerSplitNo88() throws CFException {
      return (  compareChars( getIp02014AcquirerSplitCd() , ip02014AcquirerSplitNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014AcquirerSplitNo88True() {  			
    	setIp02014AcquirerSplitCd( ip02014AcquirerSplitNo8888Value);
   	}
	char[] ip02014AcquirerSplitCon8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02014AcquirerSplitCon88()
	 *	@return  Returns true if isIp02014AcquirerSplitCon88() is "C"
	 */
   public boolean isIp02014AcquirerSplitCon88() throws CFException {
      return (  compareChars( getIp02014AcquirerSplitCd() , ip02014AcquirerSplitCon8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02014AcquirerSplitCon88True() {  			
    	setIp02014AcquirerSplitCd( ip02014AcquirerSplitCon8888Value);
   	}
	/**
	 *	Returns the value of ip02014AcquirerSplitSw
	 *	@return ip02014AcquirerSplitSw
	 */
   public char[] getIp02014AcquirerSplitSw() throws CFException{
     if (isIp02014AcquirerSplitSwModified()) { 
        ip02014AcquirerSplitSw = refreshIp02014AcquirerSplitSw();
     }
   		return ip02014AcquirerSplitSw;
   }

  
	/**
	*  set variable ip02014AcquirerSplitSw
	*  Corresponding COBOL Variable is IP02014-ACQUIRER-SPLIT-SW
	*  @param value
	**/
   public void setIp02014AcquirerSplitSw(char[] value) {
      ip02014AcquirerSplitSw = checkIp02014AcquirerSplitSwConstraints(value);
      serializeIp02014AcquirerSplitSw(ip02014AcquirerSplitSw);
   } 

     /**
	 * 	Update Ip02014AcquirerSplitSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014AcquirerSplitSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014AcquirerSplitSw,ip02014AcquirerSplitSw.length);
   	
   }
   
   public void setIp02014AcquirerSplitSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AcquirerSplitSw,ip02014AcquirerSplitSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014AcquirerSplitSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AcquirerSplitSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AcquirerSplitSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014AcquirerSplitSw with another Field
	 *	@param value
	 */
   public void setIp02014AcquirerSplitSw(Field source) {
       replace(source,0,source.length(),beginIp02014AcquirerSplitSw,IP_02014_ACQUIRER_SPLIT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014AcquirerSplitSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014AcquirerSplitSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014AcquirerSplitSw,IP_02014_ACQUIRER_SPLIT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014AcquirerSplitSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AcquirerSplitSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AcquirerSplitSw+targetIndex,targetLen);
    
   }
	char[] ip02014AcquirerSplitYes88288Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014AcquirerSplitYes882()
	 *	@return  Returns true if isIp02014AcquirerSplitYes882() is "Y"
	 */
   public boolean isIp02014AcquirerSplitYes882() throws CFException {
      return (  compareChars( getIp02014AcquirerSplitSw() , ip02014AcquirerSplitYes88288Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014AcquirerSplitYes882True() {  			
    	setIp02014AcquirerSplitSw( ip02014AcquirerSplitYes88288Value);
   	}
	char[] ip02014AcquirerSplitNo88288Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014AcquirerSplitNo882()
	 *	@return  Returns true if isIp02014AcquirerSplitNo882() is "N"
	 */
   public boolean isIp02014AcquirerSplitNo882() throws CFException {
      return (  compareChars( getIp02014AcquirerSplitSw() , ip02014AcquirerSplitNo88288Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014AcquirerSplitNo882True() {  			
    	setIp02014AcquirerSplitSw( ip02014AcquirerSplitNo88288Value);
   	}
	/**
	 *	Returns the value of ip02014DomCollOnlyCd
	 *	@return ip02014DomCollOnlyCd
	 */
   public char[] getIp02014DomCollOnlyCd() throws CFException{
     if (isIp02014DomCollOnlyCdModified()) { 
        ip02014DomCollOnlyCd = refreshIp02014DomCollOnlyCd();
     }
   		return ip02014DomCollOnlyCd;
   }

  
	/**
	*  set variable ip02014DomCollOnlyCd
	*  Corresponding COBOL Variable is IP02014-DOM-COLL-ONLY-CD
	*  @param value
	**/
   public void setIp02014DomCollOnlyCd(char[] value) {
      ip02014DomCollOnlyCd = checkIp02014DomCollOnlyCdConstraints(value);
      serializeIp02014DomCollOnlyCd(ip02014DomCollOnlyCd);
   } 

     /**
	 * 	Update Ip02014DomCollOnlyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014DomCollOnlyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014DomCollOnlyCd,ip02014DomCollOnlyCd.length);
   	
   }
   
   public void setIp02014DomCollOnlyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014DomCollOnlyCd,ip02014DomCollOnlyCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014DomCollOnlyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014DomCollOnlyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014DomCollOnlyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014DomCollOnlyCd with another Field
	 *	@param value
	 */
   public void setIp02014DomCollOnlyCd(Field source) {
       replace(source,0,source.length(),beginIp02014DomCollOnlyCd,IP_02014_DOM_COLL_ONLY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014DomCollOnlyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014DomCollOnlyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014DomCollOnlyCd,IP_02014_DOM_COLL_ONLY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014DomCollOnlyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014DomCollOnlyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014DomCollOnlyCd+targetIndex,targetLen);
    
   }
	char[] ip02014DomCollOnlySplt8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp02014DomCollOnlySplt88()
	 *	@return  Returns true if isIp02014DomCollOnlySplt88() is "S"
	 */
   public boolean isIp02014DomCollOnlySplt88() throws CFException {
      return (  compareChars( getIp02014DomCollOnlyCd() , ip02014DomCollOnlySplt8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp02014DomCollOnlySplt88True() {  			
    	setIp02014DomCollOnlyCd( ip02014DomCollOnlySplt8888Value);
   	}
	char[] ip02014DomCollOnlyHost8888Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isIp02014DomCollOnlyHost88()
	 *	@return  Returns true if isIp02014DomCollOnlyHost88() is "H"
	 */
   public boolean isIp02014DomCollOnlyHost88() throws CFException {
      return (  compareChars( getIp02014DomCollOnlyCd() , ip02014DomCollOnlyHost8888Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setIp02014DomCollOnlyHost88True() {  			
    	setIp02014DomCollOnlyCd( ip02014DomCollOnlyHost8888Value);
   	}
	/**
	 *	Returns the value of ip02014OnsoilDataShrSw
	 *	@return ip02014OnsoilDataShrSw
	 */
   public char[] getIp02014OnsoilDataShrSw() throws CFException{
     if (isIp02014OnsoilDataShrSwModified()) { 
        ip02014OnsoilDataShrSw = refreshIp02014OnsoilDataShrSw();
     }
   		return ip02014OnsoilDataShrSw;
   }

  
	/**
	*  set variable ip02014OnsoilDataShrSw
	*  Corresponding COBOL Variable is IP02014-ONSOIL-DATA-SHR-SW
	*  @param value
	**/
   public void setIp02014OnsoilDataShrSw(char[] value) {
      ip02014OnsoilDataShrSw = checkIp02014OnsoilDataShrSwConstraints(value);
      serializeIp02014OnsoilDataShrSw(ip02014OnsoilDataShrSw);
   } 

     /**
	 * 	Update Ip02014OnsoilDataShrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014OnsoilDataShrSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014OnsoilDataShrSw,ip02014OnsoilDataShrSw.length);
   	
   }
   
   public void setIp02014OnsoilDataShrSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OnsoilDataShrSw,ip02014OnsoilDataShrSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014OnsoilDataShrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014OnsoilDataShrSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OnsoilDataShrSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014OnsoilDataShrSw with another Field
	 *	@param value
	 */
   public void setIp02014OnsoilDataShrSw(Field source) {
       replace(source,0,source.length(),beginIp02014OnsoilDataShrSw,IP_02014_ONSOIL_DATA_SHR_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014OnsoilDataShrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014OnsoilDataShrSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014OnsoilDataShrSw,IP_02014_ONSOIL_DATA_SHR_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014OnsoilDataShrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014OnsoilDataShrSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OnsoilDataShrSw+targetIndex,targetLen);
    
   }
	char[] ip02014DataShrAllowed8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02014DataShrAllowed88()
	 *	@return  Returns true if isIp02014DataShrAllowed88() is "Y"
	 */
   public boolean isIp02014DataShrAllowed88() throws CFException {
      return (  compareChars( getIp02014OnsoilDataShrSw() , ip02014DataShrAllowed8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02014DataShrAllowed88True() {  			
    	setIp02014OnsoilDataShrSw( ip02014DataShrAllowed8888Value);
   	}
	char[] ip02014DataShrNotAllow8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02014DataShrNotAllow88()
	 *	@return  Returns true if isIp02014DataShrNotAllow88() is "N"
	 */
   public boolean isIp02014DataShrNotAllow88() throws CFException {
      return (  compareChars( getIp02014OnsoilDataShrSw() , ip02014DataShrNotAllow8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02014DataShrNotAllow88True() {  			
    	setIp02014OnsoilDataShrSw( ip02014DataShrNotAllow8888Value);
   	}
	/**
	 *	Returns the value of ip02014ClrCycleNum
	 *	@return ip02014ClrCycleNum
	 */
	public int getIp02014ClrCycleNum() throws CFException {
       if (isIp02014ClrCycleNumModified()) { 
           ip02014ClrCycleNum = refreshIp02014ClrCycleNum();
        }
   		return ip02014ClrCycleNum;
	}
	

	
	   
	/**
	 * 	Update Ip02014ClrCycleNum with the passed value
	 *  Corresponding COBOL Variable is IP02014-CLR-CYCLE-NUM
	 *	@param number
	 */
	public void setIp02014ClrCycleNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip02014ClrCycleNum = checkIp02014ClrCycleNumMaxLimit(number); 
		serializeIp02014ClrCycleNum(ip02014ClrCycleNum);
	}
	

	public void setIp02014ClrCycleNum(long number) {
	    number = checkIp02014ClrCycleNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02014ClrCycleNum((int)number);
	}
	
	/**
	 * 	Update Ip02014ClrCycleNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02014ClrCycleNum(char[] value) throws CFException {
		 ip02014ClrCycleNum = serializeIp02014ClrCycleNum(value);
	}
	/**
	 * 	Update Ip02014ClrCycleNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02014ClrCycleNumString(char[] value) throws CFException {
		 setIp02014ClrCycleNum(value);
	}
	/**
	 *	Returns the value of ip02014DtaWrhsOnsoilSw
	 *	@return ip02014DtaWrhsOnsoilSw
	 */
   public char[] getIp02014DtaWrhsOnsoilSw() throws CFException{
     if (isIp02014DtaWrhsOnsoilSwModified()) { 
        ip02014DtaWrhsOnsoilSw = refreshIp02014DtaWrhsOnsoilSw();
     }
   		return ip02014DtaWrhsOnsoilSw;
   }

  
	/**
	*  set variable ip02014DtaWrhsOnsoilSw
	*  Corresponding COBOL Variable is IP02014-DTA-WRHS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014DtaWrhsOnsoilSw(char[] value) {
      ip02014DtaWrhsOnsoilSw = checkIp02014DtaWrhsOnsoilSwConstraints(value);
      serializeIp02014DtaWrhsOnsoilSw(ip02014DtaWrhsOnsoilSw);
   } 

     /**
	 * 	Update Ip02014DtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014DtaWrhsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014DtaWrhsOnsoilSw,ip02014DtaWrhsOnsoilSw.length);
   	
   }
   
   public void setIp02014DtaWrhsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014DtaWrhsOnsoilSw,ip02014DtaWrhsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014DtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014DtaWrhsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014DtaWrhsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014DtaWrhsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014DtaWrhsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014DtaWrhsOnsoilSw,IP_02014_DTA_WRHS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014DtaWrhsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014DtaWrhsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014DtaWrhsOnsoilSw,IP_02014_DTA_WRHS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014DtaWrhsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014DtaWrhsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014DtaWrhsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014BllngOnsoilSw
	 *	@return ip02014BllngOnsoilSw
	 */
   public char[] getIp02014BllngOnsoilSw() throws CFException{
     if (isIp02014BllngOnsoilSwModified()) { 
        ip02014BllngOnsoilSw = refreshIp02014BllngOnsoilSw();
     }
   		return ip02014BllngOnsoilSw;
   }

  
	/**
	*  set variable ip02014BllngOnsoilSw
	*  Corresponding COBOL Variable is IP02014-BLLNG-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014BllngOnsoilSw(char[] value) {
      ip02014BllngOnsoilSw = checkIp02014BllngOnsoilSwConstraints(value);
      serializeIp02014BllngOnsoilSw(ip02014BllngOnsoilSw);
   } 

     /**
	 * 	Update Ip02014BllngOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014BllngOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014BllngOnsoilSw,ip02014BllngOnsoilSw.length);
   	
   }
   
   public void setIp02014BllngOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BllngOnsoilSw,ip02014BllngOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014BllngOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BllngOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BllngOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014BllngOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014BllngOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014BllngOnsoilSw,IP_02014_BLLNG_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014BllngOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014BllngOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014BllngOnsoilSw,IP_02014_BLLNG_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014BllngOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BllngOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BllngOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014SetlOnsoilSw
	 *	@return ip02014SetlOnsoilSw
	 */
   public char[] getIp02014SetlOnsoilSw() throws CFException{
     if (isIp02014SetlOnsoilSwModified()) { 
        ip02014SetlOnsoilSw = refreshIp02014SetlOnsoilSw();
     }
   		return ip02014SetlOnsoilSw;
   }

  
	/**
	*  set variable ip02014SetlOnsoilSw
	*  Corresponding COBOL Variable is IP02014-SETL-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014SetlOnsoilSw(char[] value) {
      ip02014SetlOnsoilSw = checkIp02014SetlOnsoilSwConstraints(value);
      serializeIp02014SetlOnsoilSw(ip02014SetlOnsoilSw);
   } 

     /**
	 * 	Update Ip02014SetlOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014SetlOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014SetlOnsoilSw,ip02014SetlOnsoilSw.length);
   	
   }
   
   public void setIp02014SetlOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014SetlOnsoilSw,ip02014SetlOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014SetlOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014SetlOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014SetlOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014SetlOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014SetlOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014SetlOnsoilSw,IP_02014_SETL_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014SetlOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014SetlOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014SetlOnsoilSw,IP_02014_SETL_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014SetlOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014SetlOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014SetlOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014ClrOnsoilSw
	 *	@return ip02014ClrOnsoilSw
	 */
   public char[] getIp02014ClrOnsoilSw() throws CFException{
     if (isIp02014ClrOnsoilSwModified()) { 
        ip02014ClrOnsoilSw = refreshIp02014ClrOnsoilSw();
     }
   		return ip02014ClrOnsoilSw;
   }

  
	/**
	*  set variable ip02014ClrOnsoilSw
	*  Corresponding COBOL Variable is IP02014-CLR-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014ClrOnsoilSw(char[] value) {
      ip02014ClrOnsoilSw = checkIp02014ClrOnsoilSwConstraints(value);
      serializeIp02014ClrOnsoilSw(ip02014ClrOnsoilSw);
   } 

     /**
	 * 	Update Ip02014ClrOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014ClrOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014ClrOnsoilSw,ip02014ClrOnsoilSw.length);
   	
   }
   
   public void setIp02014ClrOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ClrOnsoilSw,ip02014ClrOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014ClrOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ClrOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ClrOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014ClrOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014ClrOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014ClrOnsoilSw,IP_02014_CLR_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014ClrOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014ClrOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014ClrOnsoilSw,IP_02014_CLR_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014ClrOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ClrOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ClrOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014AmsOnsoilSw
	 *	@return ip02014AmsOnsoilSw
	 */
   public char[] getIp02014AmsOnsoilSw() throws CFException{
     if (isIp02014AmsOnsoilSwModified()) { 
        ip02014AmsOnsoilSw = refreshIp02014AmsOnsoilSw();
     }
   		return ip02014AmsOnsoilSw;
   }

  
	/**
	*  set variable ip02014AmsOnsoilSw
	*  Corresponding COBOL Variable is IP02014-AMS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014AmsOnsoilSw(char[] value) {
      ip02014AmsOnsoilSw = checkIp02014AmsOnsoilSwConstraints(value);
      serializeIp02014AmsOnsoilSw(ip02014AmsOnsoilSw);
   } 

     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014AmsOnsoilSw,ip02014AmsOnsoilSw.length);
   	
   }
   
   public void setIp02014AmsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AmsOnsoilSw,ip02014AmsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AmsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014AmsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014AmsOnsoilSw,IP_02014_AMS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014AmsOnsoilSw,IP_02014_AMS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AmsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014McomOnsoilSw
	 *	@return ip02014McomOnsoilSw
	 */
   public char[] getIp02014McomOnsoilSw() throws CFException{
     if (isIp02014McomOnsoilSwModified()) { 
        ip02014McomOnsoilSw = refreshIp02014McomOnsoilSw();
     }
   		return ip02014McomOnsoilSw;
   }

  
	/**
	*  set variable ip02014McomOnsoilSw
	*  Corresponding COBOL Variable is IP02014-MCOM-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014McomOnsoilSw(char[] value) {
      ip02014McomOnsoilSw = checkIp02014McomOnsoilSwConstraints(value);
      serializeIp02014McomOnsoilSw(ip02014McomOnsoilSw);
   } 

     /**
	 * 	Update Ip02014McomOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014McomOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014McomOnsoilSw,ip02014McomOnsoilSw.length);
   	
   }
   
   public void setIp02014McomOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014McomOnsoilSw,ip02014McomOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014McomOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014McomOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014McomOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014McomOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014McomOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014McomOnsoilSw,IP_02014_MCOM_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014McomOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014McomOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014McomOnsoilSw,IP_02014_MCOM_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014McomOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014McomOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014McomOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014MdsOnsoilSw
	 *	@return ip02014MdsOnsoilSw
	 */
   public char[] getIp02014MdsOnsoilSw() throws CFException{
     if (isIp02014MdsOnsoilSwModified()) { 
        ip02014MdsOnsoilSw = refreshIp02014MdsOnsoilSw();
     }
   		return ip02014MdsOnsoilSw;
   }

  
	/**
	*  set variable ip02014MdsOnsoilSw
	*  Corresponding COBOL Variable is IP02014-MDS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014MdsOnsoilSw(char[] value) {
      ip02014MdsOnsoilSw = checkIp02014MdsOnsoilSwConstraints(value);
      serializeIp02014MdsOnsoilSw(ip02014MdsOnsoilSw);
   } 

     /**
	 * 	Update Ip02014MdsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014MdsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014MdsOnsoilSw,ip02014MdsOnsoilSw.length);
   	
   }
   
   public void setIp02014MdsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MdsOnsoilSw,ip02014MdsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014MdsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014MdsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MdsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014MdsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014MdsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014MdsOnsoilSw,IP_02014_MDS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014MdsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014MdsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014MdsOnsoilSw,IP_02014_MDS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014MdsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014MdsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MdsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014StndInOnsoilSw
	 *	@return ip02014StndInOnsoilSw
	 */
   public char[] getIp02014StndInOnsoilSw() throws CFException{
     if (isIp02014StndInOnsoilSwModified()) { 
        ip02014StndInOnsoilSw = refreshIp02014StndInOnsoilSw();
     }
   		return ip02014StndInOnsoilSw;
   }

  
	/**
	*  set variable ip02014StndInOnsoilSw
	*  Corresponding COBOL Variable is IP02014-STND-IN-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014StndInOnsoilSw(char[] value) {
      ip02014StndInOnsoilSw = checkIp02014StndInOnsoilSwConstraints(value);
      serializeIp02014StndInOnsoilSw(ip02014StndInOnsoilSw);
   } 

     /**
	 * 	Update Ip02014StndInOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014StndInOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014StndInOnsoilSw,ip02014StndInOnsoilSw.length);
   	
   }
   
   public void setIp02014StndInOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014StndInOnsoilSw,ip02014StndInOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014StndInOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014StndInOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014StndInOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014StndInOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014StndInOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014StndInOnsoilSw,IP_02014_STND_IN_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014StndInOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014StndInOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014StndInOnsoilSw,IP_02014_STND_IN_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014StndInOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014StndInOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014StndInOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014AuthOnsoilSw
	 *	@return ip02014AuthOnsoilSw
	 */
   public char[] getIp02014AuthOnsoilSw() throws CFException{
     if (isIp02014AuthOnsoilSwModified()) { 
        ip02014AuthOnsoilSw = refreshIp02014AuthOnsoilSw();
     }
   		return ip02014AuthOnsoilSw;
   }

  
	/**
	*  set variable ip02014AuthOnsoilSw
	*  Corresponding COBOL Variable is IP02014-AUTH-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014AuthOnsoilSw(char[] value) {
      ip02014AuthOnsoilSw = checkIp02014AuthOnsoilSwConstraints(value);
      serializeIp02014AuthOnsoilSw(ip02014AuthOnsoilSw);
   } 

     /**
	 * 	Update Ip02014AuthOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014AuthOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014AuthOnsoilSw,ip02014AuthOnsoilSw.length);
   	
   }
   
   public void setIp02014AuthOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AuthOnsoilSw,ip02014AuthOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014AuthOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AuthOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AuthOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014AuthOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014AuthOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014AuthOnsoilSw,IP_02014_AUTH_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014AuthOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014AuthOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014AuthOnsoilSw,IP_02014_AUTH_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014AuthOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AuthOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014AuthOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014PushOnsoilSw
	 *	@return ip02014PushOnsoilSw
	 */
   public char[] getIp02014PushOnsoilSw() throws CFException{
     if (isIp02014PushOnsoilSwModified()) { 
        ip02014PushOnsoilSw = refreshIp02014PushOnsoilSw();
     }
   		return ip02014PushOnsoilSw;
   }

  
	/**
	*  set variable ip02014PushOnsoilSw
	*  Corresponding COBOL Variable is IP02014-PUSH-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014PushOnsoilSw(char[] value) {
      ip02014PushOnsoilSw = checkIp02014PushOnsoilSwConstraints(value);
      serializeIp02014PushOnsoilSw(ip02014PushOnsoilSw);
   } 

     /**
	 * 	Update Ip02014PushOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014PushOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014PushOnsoilSw,ip02014PushOnsoilSw.length);
   	
   }
   
   public void setIp02014PushOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PushOnsoilSw,ip02014PushOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014PushOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PushOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PushOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014PushOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014PushOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014PushOnsoilSw,IP_02014_PUSH_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014PushOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014PushOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014PushOnsoilSw,IP_02014_PUSH_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014PushOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PushOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PushOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014IncontrolOnsoilSw
	 *	@return ip02014IncontrolOnsoilSw
	 */
   public char[] getIp02014IncontrolOnsoilSw() throws CFException{
     if (isIp02014IncontrolOnsoilSwModified()) { 
        ip02014IncontrolOnsoilSw = refreshIp02014IncontrolOnsoilSw();
     }
   		return ip02014IncontrolOnsoilSw;
   }

  
	/**
	*  set variable ip02014IncontrolOnsoilSw
	*  Corresponding COBOL Variable is IP02014-INCONTROL-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014IncontrolOnsoilSw(char[] value) {
      ip02014IncontrolOnsoilSw = checkIp02014IncontrolOnsoilSwConstraints(value);
      serializeIp02014IncontrolOnsoilSw(ip02014IncontrolOnsoilSw);
   } 

     /**
	 * 	Update Ip02014IncontrolOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014IncontrolOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014IncontrolOnsoilSw,ip02014IncontrolOnsoilSw.length);
   	
   }
   
   public void setIp02014IncontrolOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014IncontrolOnsoilSw,ip02014IncontrolOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014IncontrolOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014IncontrolOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014IncontrolOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014IncontrolOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014IncontrolOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014IncontrolOnsoilSw,IP_02014_INCONTROL_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014IncontrolOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014IncontrolOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014IncontrolOnsoilSw,IP_02014_INCONTROL_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014IncontrolOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014IncontrolOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014IncontrolOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014EsrvcOnsoilSw
	 *	@return ip02014EsrvcOnsoilSw
	 */
   public char[] getIp02014EsrvcOnsoilSw() throws CFException{
     if (isIp02014EsrvcOnsoilSwModified()) { 
        ip02014EsrvcOnsoilSw = refreshIp02014EsrvcOnsoilSw();
     }
   		return ip02014EsrvcOnsoilSw;
   }

  
	/**
	*  set variable ip02014EsrvcOnsoilSw
	*  Corresponding COBOL Variable is IP02014-ESRVC-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014EsrvcOnsoilSw(char[] value) {
      ip02014EsrvcOnsoilSw = checkIp02014EsrvcOnsoilSwConstraints(value);
      serializeIp02014EsrvcOnsoilSw(ip02014EsrvcOnsoilSw);
   } 

     /**
	 * 	Update Ip02014EsrvcOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014EsrvcOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014EsrvcOnsoilSw,ip02014EsrvcOnsoilSw.length);
   	
   }
   
   public void setIp02014EsrvcOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014EsrvcOnsoilSw,ip02014EsrvcOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014EsrvcOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014EsrvcOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014EsrvcOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014EsrvcOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014EsrvcOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014EsrvcOnsoilSw,IP_02014_ESRVC_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014EsrvcOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014EsrvcOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014EsrvcOnsoilSw,IP_02014_ESRVC_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014EsrvcOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014EsrvcOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014EsrvcOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014GftOnsoilSw
	 *	@return ip02014GftOnsoilSw
	 */
   public char[] getIp02014GftOnsoilSw() throws CFException{
     if (isIp02014GftOnsoilSwModified()) { 
        ip02014GftOnsoilSw = refreshIp02014GftOnsoilSw();
     }
   		return ip02014GftOnsoilSw;
   }

  
	/**
	*  set variable ip02014GftOnsoilSw
	*  Corresponding COBOL Variable is IP02014-GFT-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014GftOnsoilSw(char[] value) {
      ip02014GftOnsoilSw = checkIp02014GftOnsoilSwConstraints(value);
      serializeIp02014GftOnsoilSw(ip02014GftOnsoilSw);
   } 

     /**
	 * 	Update Ip02014GftOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014GftOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014GftOnsoilSw,ip02014GftOnsoilSw.length);
   	
   }
   
   public void setIp02014GftOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014GftOnsoilSw,ip02014GftOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014GftOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014GftOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014GftOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014GftOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014GftOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014GftOnsoilSw,IP_02014_GFT_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014GftOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014GftOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014GftOnsoilSw,IP_02014_GFT_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014GftOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014GftOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014GftOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014BnknetOnsoilSw
	 *	@return ip02014BnknetOnsoilSw
	 */
   public char[] getIp02014BnknetOnsoilSw() throws CFException{
     if (isIp02014BnknetOnsoilSwModified()) { 
        ip02014BnknetOnsoilSw = refreshIp02014BnknetOnsoilSw();
     }
   		return ip02014BnknetOnsoilSw;
   }

  
	/**
	*  set variable ip02014BnknetOnsoilSw
	*  Corresponding COBOL Variable is IP02014-BNKNET-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014BnknetOnsoilSw(char[] value) {
      ip02014BnknetOnsoilSw = checkIp02014BnknetOnsoilSwConstraints(value);
      serializeIp02014BnknetOnsoilSw(ip02014BnknetOnsoilSw);
   } 

     /**
	 * 	Update Ip02014BnknetOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014BnknetOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014BnknetOnsoilSw,ip02014BnknetOnsoilSw.length);
   	
   }
   
   public void setIp02014BnknetOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BnknetOnsoilSw,ip02014BnknetOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014BnknetOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BnknetOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BnknetOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014BnknetOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014BnknetOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014BnknetOnsoilSw,IP_02014_BNKNET_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014BnknetOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014BnknetOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014BnknetOnsoilSw,IP_02014_BNKNET_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014BnknetOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BnknetOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BnknetOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014MdesOnsoilSw
	 *	@return ip02014MdesOnsoilSw
	 */
   public char[] getIp02014MdesOnsoilSw() throws CFException{
     if (isIp02014MdesOnsoilSwModified()) { 
        ip02014MdesOnsoilSw = refreshIp02014MdesOnsoilSw();
     }
   		return ip02014MdesOnsoilSw;
   }

  
	/**
	*  set variable ip02014MdesOnsoilSw
	*  Corresponding COBOL Variable is IP02014-MDES-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014MdesOnsoilSw(char[] value) {
      ip02014MdesOnsoilSw = checkIp02014MdesOnsoilSwConstraints(value);
      serializeIp02014MdesOnsoilSw(ip02014MdesOnsoilSw);
   } 

     /**
	 * 	Update Ip02014MdesOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014MdesOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014MdesOnsoilSw,ip02014MdesOnsoilSw.length);
   	
   }
   
   public void setIp02014MdesOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MdesOnsoilSw,ip02014MdesOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014MdesOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014MdesOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MdesOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014MdesOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014MdesOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014MdesOnsoilSw,IP_02014_MDES_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014MdesOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014MdesOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014MdesOnsoilSw,IP_02014_MDES_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014MdesOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014MdesOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014MdesOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014ZappOnsoilSw
	 *	@return ip02014ZappOnsoilSw
	 */
   public char[] getIp02014ZappOnsoilSw() throws CFException{
     if (isIp02014ZappOnsoilSwModified()) { 
        ip02014ZappOnsoilSw = refreshIp02014ZappOnsoilSw();
     }
   		return ip02014ZappOnsoilSw;
   }

  
	/**
	*  set variable ip02014ZappOnsoilSw
	*  Corresponding COBOL Variable is IP02014-ZAPP-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014ZappOnsoilSw(char[] value) {
      ip02014ZappOnsoilSw = checkIp02014ZappOnsoilSwConstraints(value);
      serializeIp02014ZappOnsoilSw(ip02014ZappOnsoilSw);
   } 

     /**
	 * 	Update Ip02014ZappOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014ZappOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014ZappOnsoilSw,ip02014ZappOnsoilSw.length);
   	
   }
   
   public void setIp02014ZappOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ZappOnsoilSw,ip02014ZappOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014ZappOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ZappOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ZappOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014ZappOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014ZappOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014ZappOnsoilSw,IP_02014_ZAPP_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014ZappOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014ZappOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014ZappOnsoilSw,IP_02014_ZAPP_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014ZappOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ZappOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ZappOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014CemOnsoilSw
	 *	@return ip02014CemOnsoilSw
	 */
   public char[] getIp02014CemOnsoilSw() throws CFException{
     if (isIp02014CemOnsoilSwModified()) { 
        ip02014CemOnsoilSw = refreshIp02014CemOnsoilSw();
     }
   		return ip02014CemOnsoilSw;
   }

  
	/**
	*  set variable ip02014CemOnsoilSw
	*  Corresponding COBOL Variable is IP02014-CEM-ONSOIL-SW
	*  @param value
	**/
   public void setIp02014CemOnsoilSw(char[] value) {
      ip02014CemOnsoilSw = checkIp02014CemOnsoilSwConstraints(value);
      serializeIp02014CemOnsoilSw(ip02014CemOnsoilSw);
   } 

     /**
	 * 	Update Ip02014CemOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014CemOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014CemOnsoilSw,ip02014CemOnsoilSw.length);
   	
   }
   
   public void setIp02014CemOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014CemOnsoilSw,ip02014CemOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02014CemOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014CemOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014CemOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014CemOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014CemOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02014CemOnsoilSw,IP_02014_CEM_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014CemOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014CemOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014CemOnsoilSw,IP_02014_CEM_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014CemOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014CemOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014CemOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014RptHdrName
	 *	@return ip02014RptHdrName
	 */
   public char[] getIp02014RptHdrName() throws CFException{
     if (isIp02014RptHdrNameModified()) { 
        ip02014RptHdrName = refreshIp02014RptHdrName();
     }
   		return ip02014RptHdrName;
   }

  
	/**
	*  set variable ip02014RptHdrName
	*  Corresponding COBOL Variable is IP02014-RPT-HDR-NAME
	*  @param value
	**/
   public void setIp02014RptHdrName(char[] value) {
      ip02014RptHdrName = checkIp02014RptHdrNameConstraints(value);
      serializeIp02014RptHdrName(ip02014RptHdrName);
   } 

     /**
	 * 	Update Ip02014RptHdrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014RptHdrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014RptHdrName,ip02014RptHdrName.length);
   	
   }
   
   public void setIp02014RptHdrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014RptHdrName,ip02014RptHdrName.length);
   	
   }
   
     /**
	 * 	Update Ip02014RptHdrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014RptHdrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014RptHdrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014RptHdrName with another Field
	 *	@param value
	 */
   public void setIp02014RptHdrName(Field source) {
       replace(source,0,source.length(),beginIp02014RptHdrName,IP_02014_RPT_HDR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014RptHdrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014RptHdrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014RptHdrName,IP_02014_RPT_HDR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014RptHdrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014RptHdrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014RptHdrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014ClrPrcssCd
	 *	@return ip02014ClrPrcssCd
	 */
   public char[] getIp02014ClrPrcssCd() throws CFException{
     if (isIp02014ClrPrcssCdModified()) { 
        ip02014ClrPrcssCd = refreshIp02014ClrPrcssCd();
     }
   		return ip02014ClrPrcssCd;
   }

  
	/**
	*  set variable ip02014ClrPrcssCd
	*  Corresponding COBOL Variable is IP02014-CLR-PRCSS-CD
	*  @param value
	**/
   public void setIp02014ClrPrcssCd(char[] value) {
      ip02014ClrPrcssCd = checkIp02014ClrPrcssCdConstraints(value);
      serializeIp02014ClrPrcssCd(ip02014ClrPrcssCd);
   } 

     /**
	 * 	Update Ip02014ClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014ClrPrcssCd,ip02014ClrPrcssCd.length);
   	
   }
   
   public void setIp02014ClrPrcssCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ClrPrcssCd,ip02014ClrPrcssCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014ClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ClrPrcssCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014ClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(Field source) {
       replace(source,0,source.length(),beginIp02014ClrPrcssCd,IP_02014_CLR_PRCSS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014ClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014ClrPrcssCd,IP_02014_CLR_PRCSS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014ClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ClrPrcssCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ClrPrcssCd+targetIndex,targetLen);
    
   }
	char[] ip02014GlobalPrcssCd8888Value = "GCMS".toCharArray();
	/**
	 *	Test condition "GCMS" for isIp02014GlobalPrcssCd88()
	 *	@return  Returns true if isIp02014GlobalPrcssCd88() is "GCMS"
	 */
   public boolean isIp02014GlobalPrcssCd88() throws CFException {
      return (  compareChars( getIp02014ClrPrcssCd() , ip02014GlobalPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "GCMS"
	*/
   	public void setIp02014GlobalPrcssCd88True() {  			
    	setIp02014ClrPrcssCd( ip02014GlobalPrcssCd8888Value);
   	}
	char[] ip02014LocalPrcssCd8888Value = "LCMS".toCharArray();
	/**
	 *	Test condition "LCMS" for isIp02014LocalPrcssCd88()
	 *	@return  Returns true if isIp02014LocalPrcssCd88() is "LCMS"
	 */
   public boolean isIp02014LocalPrcssCd88() throws CFException {
      return (  compareChars( getIp02014ClrPrcssCd() , ip02014LocalPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "LCMS"
	*/
   	public void setIp02014LocalPrcssCd88True() {  			
    	setIp02014ClrPrcssCd( ip02014LocalPrcssCd8888Value);
   	}
	char[] ip02014RedactPrcssCd8888Value = "RCMS".toCharArray();
	/**
	 *	Test condition "RCMS" for isIp02014RedactPrcssCd88()
	 *	@return  Returns true if isIp02014RedactPrcssCd88() is "RCMS"
	 */
   public boolean isIp02014RedactPrcssCd88() throws CFException {
      return (  compareChars( getIp02014ClrPrcssCd() , ip02014RedactPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "RCMS"
	*/
   	public void setIp02014RedactPrcssCd88True() {  			
    	setIp02014ClrPrcssCd( ip02014RedactPrcssCd8888Value);
   	}
	/**
	 *	Returns the value of ip02014OnUsPrcssAgrmtId
	 *	@return ip02014OnUsPrcssAgrmtId
	 */
   public char[] getIp02014OnUsPrcssAgrmtId() throws CFException{
     if (isIp02014OnUsPrcssAgrmtIdModified()) { 
        ip02014OnUsPrcssAgrmtId = refreshIp02014OnUsPrcssAgrmtId();
     }
   		return ip02014OnUsPrcssAgrmtId;
   }

  
	/**
	*  set variable ip02014OnUsPrcssAgrmtId
	*  Corresponding COBOL Variable is IP02014-ON-US-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02014OnUsPrcssAgrmtId(char[] value) {
      ip02014OnUsPrcssAgrmtId = checkIp02014OnUsPrcssAgrmtIdConstraints(value);
      serializeIp02014OnUsPrcssAgrmtId(ip02014OnUsPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02014OnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014OnUsPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014OnUsPrcssAgrmtId,ip02014OnUsPrcssAgrmtId.length);
   	
   }
   
   public void setIp02014OnUsPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OnUsPrcssAgrmtId,ip02014OnUsPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02014OnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014OnUsPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OnUsPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014OnUsPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014OnUsPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02014OnUsPrcssAgrmtId,IP_02014_ON_US_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014OnUsPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014OnUsPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014OnUsPrcssAgrmtId,IP_02014_ON_US_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014OnUsPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014OnUsPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OnUsPrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014OperSysId
	 *	@return ip02014OperSysId
	 */
   public char[] getIp02014OperSysId() throws CFException{
     if (isIp02014OperSysIdModified()) { 
        ip02014OperSysId = refreshIp02014OperSysId();
     }
   		return ip02014OperSysId;
   }

  
	/**
	*  set variable ip02014OperSysId
	*  Corresponding COBOL Variable is IP02014-OPER-SYS-ID
	*  @param value
	**/
   public void setIp02014OperSysId(char[] value) {
      ip02014OperSysId = checkIp02014OperSysIdConstraints(value);
      serializeIp02014OperSysId(ip02014OperSysId);
   } 

     /**
	 * 	Update Ip02014OperSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014OperSysId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014OperSysId,ip02014OperSysId.length);
   	
   }
   
   public void setIp02014OperSysId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OperSysId,ip02014OperSysId.length);
   	
   }
   
     /**
	 * 	Update Ip02014OperSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014OperSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OperSysId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014OperSysId with another Field
	 *	@param value
	 */
   public void setIp02014OperSysId(Field source) {
       replace(source,0,source.length(),beginIp02014OperSysId,IP_02014_OPER_SYS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014OperSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014OperSysId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014OperSysId,IP_02014_OPER_SYS_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014OperSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014OperSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014OperSysId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014DbId
	 *	@return ip02014DbId
	 */
   public char[] getIp02014DbId() throws CFException{
     if (isIp02014DbIdModified()) { 
        ip02014DbId = refreshIp02014DbId();
     }
   		return ip02014DbId;
   }

  
	/**
	*  set variable ip02014DbId
	*  Corresponding COBOL Variable is IP02014-DB-ID
	*  @param value
	**/
   public void setIp02014DbId(char[] value) {
      ip02014DbId = checkIp02014DbIdConstraints(value);
      serializeIp02014DbId(ip02014DbId);
   } 

     /**
	 * 	Update Ip02014DbId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014DbId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014DbId,ip02014DbId.length);
   	
   }
   
   public void setIp02014DbId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014DbId,ip02014DbId.length);
   	
   }
   
     /**
	 * 	Update Ip02014DbId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014DbId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014DbId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014DbId with another Field
	 *	@param value
	 */
   public void setIp02014DbId(Field source) {
       replace(source,0,source.length(),beginIp02014DbId,IP_02014_DB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014DbId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014DbId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014DbId,IP_02014_DB_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014DbId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014DbId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014DbId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of ip02014Db2Table
	 *  Corresponding COBOL Variable is IP02014-DB2-TABLE
	 *	@return ip02014Db2Table
	 */
   public List<Ip02014Db2Table> getIp02014Db2Table() {
       return ip02014Db2Table;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip02014Db2Table
	 */
	public Ip02014Db2Table getIp02014Db2Table(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp02014Db2Table(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_02014_DB_2_TABLE_SIZE) {
             	index = IP_02014_DB_2_TABLE_SIZE -1; // can't exceed max array size
             	logger.trace("ip02014Db2Table - Array index exceeded max Size {}, resetting it to max allowed",IP_02014_DB_2_TABLE_SIZE); 
	    }
		if (index >= ip02014Db2Table.size()) {
       		for (int fillIndex =  ip02014Db2Table.size() -1; fillIndex < index;fillIndex++) {
		       ip02014Db2Table.add(null);
		    }
			ip02014Db2Table.set(index,
			   	   	new Ip02014Db2Table(this,beginIp02014Db2Table + index * Ip02014Db2Table.getIp02014Db2TableFieldLength()) 
				                        ); 	
		} 
   	   Ip02014Db2Table value = ip02014Db2Table.get(index);
   	   if (value == null) {
   	      ip02014Db2Table.set(index,
			   	   	new Ip02014Db2Table(this,beginIp02014Db2Table + index * Ip02014Db2Table.getIp02014Db2TableFieldLength()) 
				                        ); 
		  value = ip02014Db2Table.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip02014Db2Table at index with the passed value
	 *  Corresponding COBOL Variable is IP02014-DB2-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setIp02014Db2Table(int index,char[] value) {
   	getIp02014Db2Table(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of ip02014Filler
	 *	@return ip02014Filler
	 */
   public char[] getIp02014Filler() throws CFException{
     if (isIp02014FillerModified()) { 
        ip02014Filler = refreshIp02014Filler();
     }
   		return ip02014Filler;
   }

  
	/**
	*  set variable ip02014Filler
	*  Corresponding COBOL Variable is IP02014-FILLER
	*  @param value
	**/
   public void setIp02014Filler(char[] value) {
      ip02014Filler = checkIp02014FillerConstraints(value);
      serializeIp02014Filler(ip02014Filler);
   } 

     /**
	 * 	Update Ip02014Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014Filler,ip02014Filler.length);
   	
   }
   
   public void setIp02014Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014Filler,ip02014Filler.length);
   	
   }
   
     /**
	 * 	Update Ip02014Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014Filler with another Field
	 *	@param value
	 */
   public void setIp02014Filler(Field source) {
       replace(source,0,source.length(),beginIp02014Filler,IP_02014_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014Filler,IP_02014_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014TableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014GeoScopeCode(CONSTANTS.SPACE);
         setIp02014HostInd(CONSTANTS.SPACE);
          ip02014ImpBulkId.initialize();
     
                     setIp02014NumCurrCd(0);
         setIp02014OfsoilDataTypCd(CONSTANTS.SPACE_3);
         setIp02014MrchntSplitCd(CONSTANTS.SPACE);
         setIp02014MrchntSplitSw(CONSTANTS.SPACE);
         setIp02014CurrSplitCd(CONSTANTS.SPACE);
         setIp02014CurrSplitSw(CONSTANTS.SPACE);
         setIp02014AcquirerSplitCd(CONSTANTS.SPACE);
         setIp02014AcquirerSplitSw(CONSTANTS.SPACE);
         setIp02014DomCollOnlyCd(CONSTANTS.SPACE);
         setIp02014OnsoilDataShrSw(CONSTANTS.SPACE);
                     setIp02014ClrCycleNum(0);
         setIp02014DtaWrhsOnsoilSw(CONSTANTS.SPACE);
         setIp02014BllngOnsoilSw(CONSTANTS.SPACE);
         setIp02014SetlOnsoilSw(CONSTANTS.SPACE);
         setIp02014ClrOnsoilSw(CONSTANTS.SPACE);
         setIp02014AmsOnsoilSw(CONSTANTS.SPACE);
         setIp02014McomOnsoilSw(CONSTANTS.SPACE);
         setIp02014MdsOnsoilSw(CONSTANTS.SPACE);
         setIp02014StndInOnsoilSw(CONSTANTS.SPACE);
         setIp02014AuthOnsoilSw(CONSTANTS.SPACE);
         setIp02014PushOnsoilSw(CONSTANTS.SPACE);
         setIp02014IncontrolOnsoilSw(CONSTANTS.SPACE);
         setIp02014EsrvcOnsoilSw(CONSTANTS.SPACE);
         setIp02014GftOnsoilSw(CONSTANTS.SPACE);
         setIp02014BnknetOnsoilSw(CONSTANTS.SPACE);
         setIp02014MdesOnsoilSw(CONSTANTS.SPACE);
         setIp02014ZappOnsoilSw(CONSTANTS.SPACE);
         setIp02014CemOnsoilSw(CONSTANTS.SPACE);
         setIp02014RptHdrName(CONSTANTS.SPACE_80);
         setIp02014ClrPrcssCd(CONSTANTS.SPACE_4);
         setIp02014OnUsPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02014OperSysId(CONSTANTS.SPACE_20);
         setIp02014DbId(CONSTANTS.SPACE_20);
     if (ip02014Db2Table.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_02014_DB_2_TABLE_SIZE;index++) {
              Ip02014Db2Table  newElement = new Ip02014Db2Table(this,beginIp02014Db2Table + index * Ip02014Db2Table.getIp02014Db2TableFieldLength());
              newElement.initialize();
               ip02014Db2Table.add(newElement);
          }
     } else {
        if (ip02014Db2Table.size() < IP_02014_DB_2_TABLE_SIZE) {
          // prefill it first
          for (int index = ip02014Db2Table.size();index <  IP_02014_DB_2_TABLE_SIZE;index++) {
              Ip02014Db2Table  newElement = new Ip02014Db2Table(this,beginIp02014Db2Table + index * Ip02014Db2Table.getIp02014Db2TableFieldLength());
               ip02014Db2Table.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02014_DB_2_TABLE_SIZE;index++) {
     		Ip02014Db2Table ip02014Db2TableVar = ip02014Db2Table.get(index);
 			if (ip02014Db2TableVar == null) {
                ip02014Db2TableVar = new Ip02014Db2Table(this,beginIp02014Db2Table + index * Ip02014Db2Table.getIp02014Db2TableFieldLength());
                  ip02014Db2Table.set(index, ip02014Db2TableVar);
			} 
			ip02014Db2TableVar.initialize();
		}
     }
         setIp02014Filler(CONSTANTS.SPACE_750);
   }

		public static int getIp02014TableDataFieldsFieldLength() {
			return IP_02014_TABLE_DATA_FIELDS_LENGTH;
		}

}
  
