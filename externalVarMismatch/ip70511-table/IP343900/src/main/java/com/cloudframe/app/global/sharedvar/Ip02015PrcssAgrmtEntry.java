package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015PrcssAgrmtEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


public class Ip02015PrcssAgrmtEntry extends Ip02015PrcssAgrmtEntrySerialized { 
   

						private char[] ip02015PrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip02015GeoScopeCode = Field.fillLowValue(1);

						private char[] ip02015HostInd = Field.fillLowValue(1);
				private Ip02015ImpBulkId ip02015ImpBulkId = new Ip02015ImpBulkId();

								private int ip02015NumCurrCd;

						private char[] ip02015OfsoilDataTypCd = Field.fillLowValue(3);

						private char[] ip02015MrchntSplitSw = Field.fillLowValue(1);

						private char[] ip02015MrchntSplitCd = Field.fillLowValue(1);

						private char[] ip02015CurrSplitSw = Field.fillLowValue(1);

						private char[] ip02015CurrSplitCd = Field.fillLowValue(1);

						private char[] ip02015AcquirerSplitCd = Field.fillLowValue(1);

						private char[] ip02015DomCollOnlyCd = Field.fillLowValue(1);

						private char[] ip02015OnsoilDataShrSw = Field.fillLowValue(1);

								private int ip02015ClrCycleNum;

						private char[] ip02015DtaWrhsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015BllngOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015SetlOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015ClrOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015AmsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015McomOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015MdsOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015StndInOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015AuthOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015RptHdrName = Field.fillLowValue(80);

						private char[] ip02015ClrPrcssCd = Field.fillLowValue(4);

						private char[] ip02015OnUsPrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip02015PushOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015IncontrolOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015EsrvcOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015GftOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015BnknetOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015MdesOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015ZappOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015CemOnsoilSw = Field.fillLowValue(1);

						private char[] ip02015OperSysId = Field.fillLowValue(20);

						private char[] ip02015DbId = Field.fillLowValue(20);
			private List<Ip02015Db2Table> ip02015Db2Table = new ArrayList<>();
    	

						private char[] ip02015Filler = Field.fillLowValue(390);
	
	/**
	* Constructor for Ip02015PrcssAgrmtEntry
	**/
    public Ip02015PrcssAgrmtEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02015PrcssAgrmtEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015PrcssAgrmtEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip02015ImpBulkId.setParent(this,getStartOffset() + 13);
				for (int arrayIndex = 0; arrayIndex < IP_02015_DB_2_TABLE_SIZE;arrayIndex++) {
						ip02015Db2Table.add(new Ip02015Db2Table(this, beginIp02015Db2Table + 
						arrayIndex * Ip02015Db2Table.getIp02015Db2TableFieldLength()));
				}
    } 

	/**
	 *	Returns the value of ip02015PrcssAgrmtId
	 *	@return ip02015PrcssAgrmtId
	 */
   public char[] getIp02015PrcssAgrmtId() throws CFException{
     if (isIp02015PrcssAgrmtIdModified()) { 
        ip02015PrcssAgrmtId = refreshIp02015PrcssAgrmtId();
     }
   		return ip02015PrcssAgrmtId;
   }

  
	/**
	*  set variable ip02015PrcssAgrmtId
	*  Corresponding COBOL Variable is IP02015-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02015PrcssAgrmtId(char[] value) {
      ip02015PrcssAgrmtId = checkIp02015PrcssAgrmtIdConstraints(value);
      serializeIp02015PrcssAgrmtId(ip02015PrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015PrcssAgrmtId,ip02015PrcssAgrmtId.length);
   	
   }
   
   public void setIp02015PrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015PrcssAgrmtId,ip02015PrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015PrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02015PrcssAgrmtId,IP_02015_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015PrcssAgrmtId,IP_02015_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015PrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015GeoScopeCode
	 *	@return ip02015GeoScopeCode
	 */
   public char[] getIp02015GeoScopeCode() throws CFException{
     if (isIp02015GeoScopeCodeModified()) { 
        ip02015GeoScopeCode = refreshIp02015GeoScopeCode();
     }
   		return ip02015GeoScopeCode;
   }

  
	/**
	*  set variable ip02015GeoScopeCode
	*  Corresponding COBOL Variable is IP02015-GEO-SCOPE-CODE
	*  @param value
	**/
   public void setIp02015GeoScopeCode(char[] value) {
      ip02015GeoScopeCode = checkIp02015GeoScopeCodeConstraints(value);
      serializeIp02015GeoScopeCode(ip02015GeoScopeCode);
   } 

     /**
	 * 	Update Ip02015GeoScopeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015GeoScopeCode,ip02015GeoScopeCode.length);
   	
   }
   
   public void setIp02015GeoScopeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015GeoScopeCode,ip02015GeoScopeCode.length);
   	
   }
   
     /**
	 * 	Update Ip02015GeoScopeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015GeoScopeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015GeoScopeCode with another Field
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(Field source) {
       replace(source,0,source.length(),beginIp02015GeoScopeCode,IP_02015_GEO_SCOPE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015GeoScopeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015GeoScopeCode,IP_02015_GEO_SCOPE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015GeoScopeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015GeoScopeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015GeoScopeCode+targetIndex,targetLen);
    
   }
	char[] ip02015PaGlobal8888Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isIp02015PaGlobal88()
	 *	@return  Returns true if isIp02015PaGlobal88() is "G"
	 */
   public boolean isIp02015PaGlobal88() throws CFException {
      return (  compareChars( getIp02015GeoScopeCode() , ip02015PaGlobal8888Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setIp02015PaGlobal88True() {  			
    	setIp02015GeoScopeCode( ip02015PaGlobal8888Value);
   	}
	char[] ip02015PaLocal8888Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isIp02015PaLocal88()
	 *	@return  Returns true if isIp02015PaLocal88() is "L"
	 */
   public boolean isIp02015PaLocal88() throws CFException {
      return (  compareChars( getIp02015GeoScopeCode() , ip02015PaLocal8888Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setIp02015PaLocal88True() {  			
    	setIp02015GeoScopeCode( ip02015PaLocal8888Value);
   	}
	char[] ip02015PaRegional8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp02015PaRegional88()
	 *	@return  Returns true if isIp02015PaRegional88() is "R"
	 */
   public boolean isIp02015PaRegional88() throws CFException {
      return (  compareChars( getIp02015GeoScopeCode() , ip02015PaRegional8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp02015PaRegional88True() {  			
    	setIp02015GeoScopeCode( ip02015PaRegional8888Value);
   	}
	/**
	 *	Returns the value of ip02015HostInd
	 *	@return ip02015HostInd
	 */
   public char[] getIp02015HostInd() throws CFException{
     if (isIp02015HostIndModified()) { 
        ip02015HostInd = refreshIp02015HostInd();
     }
   		return ip02015HostInd;
   }

  
	/**
	*  set variable ip02015HostInd
	*  Corresponding COBOL Variable is IP02015-HOST-IND
	*  @param value
	**/
   public void setIp02015HostInd(char[] value) {
      ip02015HostInd = checkIp02015HostIndConstraints(value);
      serializeIp02015HostInd(ip02015HostInd);
   } 

     /**
	 * 	Update Ip02015HostInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015HostInd,ip02015HostInd.length);
   	
   }
   
   public void setIp02015HostInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostInd,ip02015HostInd.length);
   	
   }
   
     /**
	 * 	Update Ip02015HostInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015HostInd with another Field
	 *	@param value
	 */
   public void setIp02015HostInd(Field source) {
       replace(source,0,source.length(),beginIp02015HostInd,IP_02015_HOST_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015HostInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015HostInd,IP_02015_HOST_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015HostInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostInd+targetIndex,targetLen);
    
   }
	char[] ip02015PaIsHost8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02015PaIsHost88()
	 *	@return  Returns true if isIp02015PaIsHost88() is "Y"
	 */
   public boolean isIp02015PaIsHost88() throws CFException {
      return (  compareChars( getIp02015HostInd() , ip02015PaIsHost8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02015PaIsHost88True() {  			
    	setIp02015HostInd( ip02015PaIsHost8888Value);
   	}
	char[] ip02015NotTheHost8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02015NotTheHost88()
	 *	@return  Returns true if isIp02015NotTheHost88() is "N"
	 */
   public boolean isIp02015NotTheHost88() throws CFException {
      return (  compareChars( getIp02015HostInd() , ip02015NotTheHost8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02015NotTheHost88True() {  			
    	setIp02015HostInd( ip02015NotTheHost8888Value);
   	}
	/**
	 *	Returns the value of ip02015ImpBulkId
	 *	@return ip02015ImpBulkId
	 */   
	 public Ip02015ImpBulkId getIp02015ImpBulkId() {
   	return ip02015ImpBulkId;
   }
   /**
	* 	Update Ip02015ImpBulkId with the passed value
	*   Corresponding COBOL Variable is IP02015-IMP-BULK-ID
	*	@param value
	*/
   public void setIp02015ImpBulkId(char[] value) {
      ip02015ImpBulkId.setString(value); 
   }   
    
     /**
	 * 	Update Ip02015ImpBulkId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02015ImpBulkId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02015ImpBulkId.begin,ip02015ImpBulkId.length());
   }
   
     /**
	 * 	Update Ip02015ImpBulkId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ImpBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02015ImpBulkId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02015ImpBulkId with another Field
	 *	@param value
	 */
   public void setIp02015ImpBulkId(Field source) {
   	replace(source,0,source.length(),ip02015ImpBulkId.begin,ip02015ImpBulkId.length());
   }  
   
     /**
	 * 	Update Ip02015ImpBulkId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02015ImpBulkId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02015ImpBulkId.begin,ip02015ImpBulkId.length());
   }
   
     /**
	 * 	Update Ip02015ImpBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ImpBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02015ImpBulkId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip02015NumCurrCd
	 *	@return ip02015NumCurrCd
	 */
	public int getIp02015NumCurrCd() throws CFException {
       if (isIp02015NumCurrCdModified()) { 
           ip02015NumCurrCd = refreshIp02015NumCurrCd();
        }
   		return ip02015NumCurrCd;
	}
	

	
	   
	/**
	 * 	Update Ip02015NumCurrCd with the passed value
	 *  Corresponding COBOL Variable is IP02015-NUM-CURR-CD
	 *	@param number
	 */
	public void setIp02015NumCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip02015NumCurrCd = checkIp02015NumCurrCdMaxLimit(number); 
		serializeIp02015NumCurrCd(ip02015NumCurrCd);
	}
	

	public void setIp02015NumCurrCd(long number) {
	    number = checkIp02015NumCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02015NumCurrCd((int)number);
	}
	
	/**
	 * 	Update Ip02015NumCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02015NumCurrCd(char[] value) throws CFException {
		 ip02015NumCurrCd = serializeIp02015NumCurrCd(value);
	}
	/**
	 * 	Update Ip02015NumCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02015NumCurrCdString(char[] value) throws CFException {
		 setIp02015NumCurrCd(value);
	}
	/**
	 *	Returns the value of ip02015OfsoilDataTypCd
	 *	@return ip02015OfsoilDataTypCd
	 */
   public char[] getIp02015OfsoilDataTypCd() throws CFException{
     if (isIp02015OfsoilDataTypCdModified()) { 
        ip02015OfsoilDataTypCd = refreshIp02015OfsoilDataTypCd();
     }
   		return ip02015OfsoilDataTypCd;
   }

  
	/**
	*  set variable ip02015OfsoilDataTypCd
	*  Corresponding COBOL Variable is IP02015-OFSOIL-DATA-TYP-CD
	*  @param value
	**/
   public void setIp02015OfsoilDataTypCd(char[] value) {
      ip02015OfsoilDataTypCd = checkIp02015OfsoilDataTypCdConstraints(value);
      serializeIp02015OfsoilDataTypCd(ip02015OfsoilDataTypCd);
   } 

     /**
	 * 	Update Ip02015OfsoilDataTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015OfsoilDataTypCd,ip02015OfsoilDataTypCd.length);
   	
   }
   
   public void setIp02015OfsoilDataTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OfsoilDataTypCd,ip02015OfsoilDataTypCd.length);
   	
   }
   
     /**
	 * 	Update Ip02015OfsoilDataTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OfsoilDataTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015OfsoilDataTypCd with another Field
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(Field source) {
       replace(source,0,source.length(),beginIp02015OfsoilDataTypCd,IP_02015_OFSOIL_DATA_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015OfsoilDataTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015OfsoilDataTypCd,IP_02015_OFSOIL_DATA_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015OfsoilDataTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OfsoilDataTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OfsoilDataTypCd+targetIndex,targetLen);
    
   }
	char[] ip02015PaTransLevel8888Value = "TXL".toCharArray();
	/**
	 *	Test condition "TXL" for isIp02015PaTransLevel88()
	 *	@return  Returns true if isIp02015PaTransLevel88() is "TXL"
	 */
   public boolean isIp02015PaTransLevel88() throws CFException {
      return (  compareChars( getIp02015OfsoilDataTypCd() , ip02015PaTransLevel8888Value)  == 0  );
   }


	/**
	*  set values "TXL"
	*/
   	public void setIp02015PaTransLevel88True() {  			
    	setIp02015OfsoilDataTypCd( ip02015PaTransLevel8888Value);
   	}
	char[] ip02015PaTransLevelObs8888Value = "TXO".toCharArray();
	/**
	 *	Test condition "TXO" for isIp02015PaTransLevelObs88()
	 *	@return  Returns true if isIp02015PaTransLevelObs88() is "TXO"
	 */
   public boolean isIp02015PaTransLevelObs88() throws CFException {
      return (  compareChars( getIp02015OfsoilDataTypCd() , ip02015PaTransLevelObs8888Value)  == 0  );
   }


	/**
	*  set values "TXO"
	*/
   	public void setIp02015PaTransLevelObs88True() {  			
    	setIp02015OfsoilDataTypCd( ip02015PaTransLevelObs8888Value);
   	}
	char[] ip02015PaSummaryLevel8888Value = "SUM".toCharArray();
	/**
	 *	Test condition "SUM" for isIp02015PaSummaryLevel88()
	 *	@return  Returns true if isIp02015PaSummaryLevel88() is "SUM"
	 */
   public boolean isIp02015PaSummaryLevel88() throws CFException {
      return (  compareChars( getIp02015OfsoilDataTypCd() , ip02015PaSummaryLevel8888Value)  == 0  );
   }


	/**
	*  set values "SUM"
	*/
   	public void setIp02015PaSummaryLevel88True() {  			
    	setIp02015OfsoilDataTypCd( ip02015PaSummaryLevel8888Value);
   	}
	/**
	 *	Returns the value of ip02015MrchntSplitSw
	 *	@return ip02015MrchntSplitSw
	 */
   public char[] getIp02015MrchntSplitSw() throws CFException{
     if (isIp02015MrchntSplitSwModified()) { 
        ip02015MrchntSplitSw = refreshIp02015MrchntSplitSw();
     }
   		return ip02015MrchntSplitSw;
   }

  
	/**
	*  set variable ip02015MrchntSplitSw
	*  Corresponding COBOL Variable is IP02015-MRCHNT-SPLIT-SW
	*  @param value
	**/
   public void setIp02015MrchntSplitSw(char[] value) {
      ip02015MrchntSplitSw = checkIp02015MrchntSplitSwConstraints(value);
      serializeIp02015MrchntSplitSw(ip02015MrchntSplitSw);
   } 

     /**
	 * 	Update Ip02015MrchntSplitSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015MrchntSplitSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015MrchntSplitSw,ip02015MrchntSplitSw.length);
   	
   }
   
   public void setIp02015MrchntSplitSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MrchntSplitSw,ip02015MrchntSplitSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015MrchntSplitSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MrchntSplitSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MrchntSplitSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015MrchntSplitSw with another Field
	 *	@param value
	 */
   public void setIp02015MrchntSplitSw(Field source) {
       replace(source,0,source.length(),beginIp02015MrchntSplitSw,IP_02015_MRCHNT_SPLIT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015MrchntSplitSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015MrchntSplitSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015MrchntSplitSw,IP_02015_MRCHNT_SPLIT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015MrchntSplitSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MrchntSplitSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MrchntSplitSw+targetIndex,targetLen);
    
   }
	char[] ip02015IncMrchntSpltY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02015IncMrchntSpltY88()
	 *	@return  Returns true if isIp02015IncMrchntSpltY88() is "Y"
	 */
   public boolean isIp02015IncMrchntSpltY88() throws CFException {
      return (  compareChars( getIp02015MrchntSplitSw() , ip02015IncMrchntSpltY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02015IncMrchntSpltY88True() {  			
    	setIp02015MrchntSplitSw( ip02015IncMrchntSpltY8888Value);
   	}
	char[] ip02015IncMrchntSpltN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02015IncMrchntSpltN88()
	 *	@return  Returns true if isIp02015IncMrchntSpltN88() is "N"
	 */
   public boolean isIp02015IncMrchntSpltN88() throws CFException {
      return (  compareChars( getIp02015MrchntSplitSw() , ip02015IncMrchntSpltN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02015IncMrchntSpltN88True() {  			
    	setIp02015MrchntSplitSw( ip02015IncMrchntSpltN8888Value);
   	}
	/**
	 *	Returns the value of ip02015MrchntSplitCd
	 *	@return ip02015MrchntSplitCd
	 */
   public char[] getIp02015MrchntSplitCd() throws CFException{
     if (isIp02015MrchntSplitCdModified()) { 
        ip02015MrchntSplitCd = refreshIp02015MrchntSplitCd();
     }
   		return ip02015MrchntSplitCd;
   }

  
	/**
	*  set variable ip02015MrchntSplitCd
	*  Corresponding COBOL Variable is IP02015-MRCHNT-SPLIT-CD
	*  @param value
	**/
   public void setIp02015MrchntSplitCd(char[] value) {
      ip02015MrchntSplitCd = checkIp02015MrchntSplitCdConstraints(value);
      serializeIp02015MrchntSplitCd(ip02015MrchntSplitCd);
   } 

     /**
	 * 	Update Ip02015MrchntSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015MrchntSplitCd,ip02015MrchntSplitCd.length);
   	
   }
   
   public void setIp02015MrchntSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MrchntSplitCd,ip02015MrchntSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02015MrchntSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MrchntSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015MrchntSplitCd with another Field
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02015MrchntSplitCd,IP_02015_MRCHNT_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015MrchntSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015MrchntSplitCd,IP_02015_MRCHNT_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015MrchntSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MrchntSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MrchntSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02015IncMrchntSpltY88288Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02015IncMrchntSpltY882()
	 *	@return  Returns true if isIp02015IncMrchntSpltY882() is "Y"
	 */
   public boolean isIp02015IncMrchntSpltY882() throws CFException {
      return (  compareChars( getIp02015MrchntSplitCd() , ip02015IncMrchntSpltY88288Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02015IncMrchntSpltY882True() {  			
    	setIp02015MrchntSplitCd( ip02015IncMrchntSpltY88288Value);
   	}
	char[] ip02015IncMrchntSpltN88288Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02015IncMrchntSpltN882()
	 *	@return  Returns true if isIp02015IncMrchntSpltN882() is "N"
	 */
   public boolean isIp02015IncMrchntSpltN882() throws CFException {
      return (  compareChars( getIp02015MrchntSplitCd() , ip02015IncMrchntSpltN88288Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02015IncMrchntSpltN882True() {  			
    	setIp02015MrchntSplitCd( ip02015IncMrchntSpltN88288Value);
   	}
	char[] ip02015IncMrchntSpltC8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02015IncMrchntSpltC88()
	 *	@return  Returns true if isIp02015IncMrchntSpltC88() is "C"
	 */
   public boolean isIp02015IncMrchntSpltC88() throws CFException {
      return (  compareChars( getIp02015MrchntSplitCd() , ip02015IncMrchntSpltC8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02015IncMrchntSpltC88True() {  			
    	setIp02015MrchntSplitCd( ip02015IncMrchntSpltC8888Value);
   	}
	/**
	 *	Returns the value of ip02015CurrSplitSw
	 *	@return ip02015CurrSplitSw
	 */
   public char[] getIp02015CurrSplitSw() throws CFException{
     if (isIp02015CurrSplitSwModified()) { 
        ip02015CurrSplitSw = refreshIp02015CurrSplitSw();
     }
   		return ip02015CurrSplitSw;
   }

  
	/**
	*  set variable ip02015CurrSplitSw
	*  Corresponding COBOL Variable is IP02015-CURR-SPLIT-SW
	*  @param value
	**/
   public void setIp02015CurrSplitSw(char[] value) {
      ip02015CurrSplitSw = checkIp02015CurrSplitSwConstraints(value);
      serializeIp02015CurrSplitSw(ip02015CurrSplitSw);
   } 

     /**
	 * 	Update Ip02015CurrSplitSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015CurrSplitSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015CurrSplitSw,ip02015CurrSplitSw.length);
   	
   }
   
   public void setIp02015CurrSplitSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015CurrSplitSw,ip02015CurrSplitSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015CurrSplitSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CurrSplitSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015CurrSplitSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015CurrSplitSw with another Field
	 *	@param value
	 */
   public void setIp02015CurrSplitSw(Field source) {
       replace(source,0,source.length(),beginIp02015CurrSplitSw,IP_02015_CURR_SPLIT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015CurrSplitSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015CurrSplitSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015CurrSplitSw,IP_02015_CURR_SPLIT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015CurrSplitSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CurrSplitSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015CurrSplitSw+targetIndex,targetLen);
    
   }
	char[] ip02015CurrSplitYes8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02015CurrSplitYes88()
	 *	@return  Returns true if isIp02015CurrSplitYes88() is "Y"
	 */
   public boolean isIp02015CurrSplitYes88() throws CFException {
      return (  compareChars( getIp02015CurrSplitSw() , ip02015CurrSplitYes8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02015CurrSplitYes88True() {  			
    	setIp02015CurrSplitSw( ip02015CurrSplitYes8888Value);
   	}
	char[] ip02015CurrSpitNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02015CurrSpitNo88()
	 *	@return  Returns true if isIp02015CurrSpitNo88() is "N"
	 */
   public boolean isIp02015CurrSpitNo88() throws CFException {
      return (  compareChars( getIp02015CurrSplitSw() , ip02015CurrSpitNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02015CurrSpitNo88True() {  			
    	setIp02015CurrSplitSw( ip02015CurrSpitNo8888Value);
   	}
	/**
	 *	Returns the value of ip02015CurrSplitCd
	 *	@return ip02015CurrSplitCd
	 */
   public char[] getIp02015CurrSplitCd() throws CFException{
     if (isIp02015CurrSplitCdModified()) { 
        ip02015CurrSplitCd = refreshIp02015CurrSplitCd();
     }
   		return ip02015CurrSplitCd;
   }

  
	/**
	*  set variable ip02015CurrSplitCd
	*  Corresponding COBOL Variable is IP02015-CURR-SPLIT-CD
	*  @param value
	**/
   public void setIp02015CurrSplitCd(char[] value) {
      ip02015CurrSplitCd = checkIp02015CurrSplitCdConstraints(value);
      serializeIp02015CurrSplitCd(ip02015CurrSplitCd);
   } 

     /**
	 * 	Update Ip02015CurrSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015CurrSplitCd,ip02015CurrSplitCd.length);
   	
   }
   
   public void setIp02015CurrSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015CurrSplitCd,ip02015CurrSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02015CurrSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015CurrSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015CurrSplitCd with another Field
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02015CurrSplitCd,IP_02015_CURR_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015CurrSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015CurrSplitCd,IP_02015_CURR_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015CurrSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CurrSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015CurrSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02015CurrSplitYes88288Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02015CurrSplitYes882()
	 *	@return  Returns true if isIp02015CurrSplitYes882() is "Y"
	 */
   public boolean isIp02015CurrSplitYes882() throws CFException {
      return (  compareChars( getIp02015CurrSplitCd() , ip02015CurrSplitYes88288Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02015CurrSplitYes882True() {  			
    	setIp02015CurrSplitCd( ip02015CurrSplitYes88288Value);
   	}
	char[] ip02015CurrSpitNo88288Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02015CurrSpitNo882()
	 *	@return  Returns true if isIp02015CurrSpitNo882() is "N"
	 */
   public boolean isIp02015CurrSpitNo882() throws CFException {
      return (  compareChars( getIp02015CurrSplitCd() , ip02015CurrSpitNo88288Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02015CurrSpitNo882True() {  			
    	setIp02015CurrSplitCd( ip02015CurrSpitNo88288Value);
   	}
	char[] ip02015CurrSplitCond8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02015CurrSplitCond88()
	 *	@return  Returns true if isIp02015CurrSplitCond88() is "C"
	 */
   public boolean isIp02015CurrSplitCond88() throws CFException {
      return (  compareChars( getIp02015CurrSplitCd() , ip02015CurrSplitCond8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02015CurrSplitCond88True() {  			
    	setIp02015CurrSplitCd( ip02015CurrSplitCond8888Value);
   	}
	/**
	 *	Returns the value of ip02015AcquirerSplitCd
	 *	@return ip02015AcquirerSplitCd
	 */
   public char[] getIp02015AcquirerSplitCd() throws CFException{
     if (isIp02015AcquirerSplitCdModified()) { 
        ip02015AcquirerSplitCd = refreshIp02015AcquirerSplitCd();
     }
   		return ip02015AcquirerSplitCd;
   }

  
	/**
	*  set variable ip02015AcquirerSplitCd
	*  Corresponding COBOL Variable is IP02015-ACQUIRER-SPLIT-CD
	*  @param value
	**/
   public void setIp02015AcquirerSplitCd(char[] value) {
      ip02015AcquirerSplitCd = checkIp02015AcquirerSplitCdConstraints(value);
      serializeIp02015AcquirerSplitCd(ip02015AcquirerSplitCd);
   } 

     /**
	 * 	Update Ip02015AcquirerSplitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015AcquirerSplitCd,ip02015AcquirerSplitCd.length);
   	
   }
   
   public void setIp02015AcquirerSplitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015AcquirerSplitCd,ip02015AcquirerSplitCd.length);
   	
   }
   
     /**
	 * 	Update Ip02015AcquirerSplitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015AcquirerSplitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015AcquirerSplitCd with another Field
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(Field source) {
       replace(source,0,source.length(),beginIp02015AcquirerSplitCd,IP_02015_ACQUIRER_SPLIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015AcquirerSplitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015AcquirerSplitCd,IP_02015_ACQUIRER_SPLIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015AcquirerSplitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AcquirerSplitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015AcquirerSplitCd+targetIndex,targetLen);
    
   }
	char[] ip02015AcquirerSplitYes8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02015AcquirerSplitYes88()
	 *	@return  Returns true if isIp02015AcquirerSplitYes88() is "Y"
	 */
   public boolean isIp02015AcquirerSplitYes88() throws CFException {
      return (  compareChars( getIp02015AcquirerSplitCd() , ip02015AcquirerSplitYes8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02015AcquirerSplitYes88True() {  			
    	setIp02015AcquirerSplitCd( ip02015AcquirerSplitYes8888Value);
   	}
	char[] ip02015AcquirerSplitNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02015AcquirerSplitNo88()
	 *	@return  Returns true if isIp02015AcquirerSplitNo88() is "N"
	 */
   public boolean isIp02015AcquirerSplitNo88() throws CFException {
      return (  compareChars( getIp02015AcquirerSplitCd() , ip02015AcquirerSplitNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02015AcquirerSplitNo88True() {  			
    	setIp02015AcquirerSplitCd( ip02015AcquirerSplitNo8888Value);
   	}
	char[] ip02015AcquirerSplitCon8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp02015AcquirerSplitCon88()
	 *	@return  Returns true if isIp02015AcquirerSplitCon88() is "C"
	 */
   public boolean isIp02015AcquirerSplitCon88() throws CFException {
      return (  compareChars( getIp02015AcquirerSplitCd() , ip02015AcquirerSplitCon8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp02015AcquirerSplitCon88True() {  			
    	setIp02015AcquirerSplitCd( ip02015AcquirerSplitCon8888Value);
   	}
	/**
	 *	Returns the value of ip02015DomCollOnlyCd
	 *	@return ip02015DomCollOnlyCd
	 */
   public char[] getIp02015DomCollOnlyCd() throws CFException{
     if (isIp02015DomCollOnlyCdModified()) { 
        ip02015DomCollOnlyCd = refreshIp02015DomCollOnlyCd();
     }
   		return ip02015DomCollOnlyCd;
   }

  
	/**
	*  set variable ip02015DomCollOnlyCd
	*  Corresponding COBOL Variable is IP02015-DOM-COLL-ONLY-CD
	*  @param value
	**/
   public void setIp02015DomCollOnlyCd(char[] value) {
      ip02015DomCollOnlyCd = checkIp02015DomCollOnlyCdConstraints(value);
      serializeIp02015DomCollOnlyCd(ip02015DomCollOnlyCd);
   } 

     /**
	 * 	Update Ip02015DomCollOnlyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015DomCollOnlyCd,ip02015DomCollOnlyCd.length);
   	
   }
   
   public void setIp02015DomCollOnlyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015DomCollOnlyCd,ip02015DomCollOnlyCd.length);
   	
   }
   
     /**
	 * 	Update Ip02015DomCollOnlyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015DomCollOnlyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015DomCollOnlyCd with another Field
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(Field source) {
       replace(source,0,source.length(),beginIp02015DomCollOnlyCd,IP_02015_DOM_COLL_ONLY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015DomCollOnlyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015DomCollOnlyCd,IP_02015_DOM_COLL_ONLY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015DomCollOnlyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DomCollOnlyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015DomCollOnlyCd+targetIndex,targetLen);
    
   }
	char[] ip02015DomCollOnlySplt8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp02015DomCollOnlySplt88()
	 *	@return  Returns true if isIp02015DomCollOnlySplt88() is "S"
	 */
   public boolean isIp02015DomCollOnlySplt88() throws CFException {
      return (  compareChars( getIp02015DomCollOnlyCd() , ip02015DomCollOnlySplt8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp02015DomCollOnlySplt88True() {  			
    	setIp02015DomCollOnlyCd( ip02015DomCollOnlySplt8888Value);
   	}
	char[] ip02015DomCollOnlyHost8888Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isIp02015DomCollOnlyHost88()
	 *	@return  Returns true if isIp02015DomCollOnlyHost88() is "H"
	 */
   public boolean isIp02015DomCollOnlyHost88() throws CFException {
      return (  compareChars( getIp02015DomCollOnlyCd() , ip02015DomCollOnlyHost8888Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setIp02015DomCollOnlyHost88True() {  			
    	setIp02015DomCollOnlyCd( ip02015DomCollOnlyHost8888Value);
   	}
	/**
	 *	Returns the value of ip02015OnsoilDataShrSw
	 *	@return ip02015OnsoilDataShrSw
	 */
   public char[] getIp02015OnsoilDataShrSw() throws CFException{
     if (isIp02015OnsoilDataShrSwModified()) { 
        ip02015OnsoilDataShrSw = refreshIp02015OnsoilDataShrSw();
     }
   		return ip02015OnsoilDataShrSw;
   }

  
	/**
	*  set variable ip02015OnsoilDataShrSw
	*  Corresponding COBOL Variable is IP02015-ONSOIL-DATA-SHR-SW
	*  @param value
	**/
   public void setIp02015OnsoilDataShrSw(char[] value) {
      ip02015OnsoilDataShrSw = checkIp02015OnsoilDataShrSwConstraints(value);
      serializeIp02015OnsoilDataShrSw(ip02015OnsoilDataShrSw);
   } 

     /**
	 * 	Update Ip02015OnsoilDataShrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015OnsoilDataShrSw,ip02015OnsoilDataShrSw.length);
   	
   }
   
   public void setIp02015OnsoilDataShrSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OnsoilDataShrSw,ip02015OnsoilDataShrSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015OnsoilDataShrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OnsoilDataShrSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015OnsoilDataShrSw with another Field
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(Field source) {
       replace(source,0,source.length(),beginIp02015OnsoilDataShrSw,IP_02015_ONSOIL_DATA_SHR_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015OnsoilDataShrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015OnsoilDataShrSw,IP_02015_ONSOIL_DATA_SHR_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015OnsoilDataShrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OnsoilDataShrSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OnsoilDataShrSw+targetIndex,targetLen);
    
   }
	char[] ip02015DataShrAllowed8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp02015DataShrAllowed88()
	 *	@return  Returns true if isIp02015DataShrAllowed88() is "Y"
	 */
   public boolean isIp02015DataShrAllowed88() throws CFException {
      return (  compareChars( getIp02015OnsoilDataShrSw() , ip02015DataShrAllowed8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp02015DataShrAllowed88True() {  			
    	setIp02015OnsoilDataShrSw( ip02015DataShrAllowed8888Value);
   	}
	char[] ip02015DataShrNotAllow8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp02015DataShrNotAllow88()
	 *	@return  Returns true if isIp02015DataShrNotAllow88() is "N"
	 */
   public boolean isIp02015DataShrNotAllow88() throws CFException {
      return (  compareChars( getIp02015OnsoilDataShrSw() , ip02015DataShrNotAllow8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp02015DataShrNotAllow88True() {  			
    	setIp02015OnsoilDataShrSw( ip02015DataShrNotAllow8888Value);
   	}
	/**
	 *	Returns the value of ip02015ClrCycleNum
	 *	@return ip02015ClrCycleNum
	 */
	public int getIp02015ClrCycleNum() throws CFException {
       if (isIp02015ClrCycleNumModified()) { 
           ip02015ClrCycleNum = refreshIp02015ClrCycleNum();
        }
   		return ip02015ClrCycleNum;
	}
	

	
	   
	/**
	 * 	Update Ip02015ClrCycleNum with the passed value
	 *  Corresponding COBOL Variable is IP02015-CLR-CYCLE-NUM
	 *	@param number
	 */
	public void setIp02015ClrCycleNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip02015ClrCycleNum = checkIp02015ClrCycleNumMaxLimit(number); 
		serializeIp02015ClrCycleNum(ip02015ClrCycleNum);
	}
	

	public void setIp02015ClrCycleNum(long number) {
	    number = checkIp02015ClrCycleNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02015ClrCycleNum((int)number);
	}
	
	/**
	 * 	Update Ip02015ClrCycleNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp02015ClrCycleNum(char[] value) throws CFException {
		 ip02015ClrCycleNum = serializeIp02015ClrCycleNum(value);
	}
	/**
	 * 	Update Ip02015ClrCycleNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp02015ClrCycleNumString(char[] value) throws CFException {
		 setIp02015ClrCycleNum(value);
	}
	/**
	 *	Returns the value of ip02015DtaWrhsOnsoilSw
	 *	@return ip02015DtaWrhsOnsoilSw
	 */
   public char[] getIp02015DtaWrhsOnsoilSw() throws CFException{
     if (isIp02015DtaWrhsOnsoilSwModified()) { 
        ip02015DtaWrhsOnsoilSw = refreshIp02015DtaWrhsOnsoilSw();
     }
   		return ip02015DtaWrhsOnsoilSw;
   }

  
	/**
	*  set variable ip02015DtaWrhsOnsoilSw
	*  Corresponding COBOL Variable is IP02015-DTA-WRHS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015DtaWrhsOnsoilSw(char[] value) {
      ip02015DtaWrhsOnsoilSw = checkIp02015DtaWrhsOnsoilSwConstraints(value);
      serializeIp02015DtaWrhsOnsoilSw(ip02015DtaWrhsOnsoilSw);
   } 

     /**
	 * 	Update Ip02015DtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015DtaWrhsOnsoilSw,ip02015DtaWrhsOnsoilSw.length);
   	
   }
   
   public void setIp02015DtaWrhsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015DtaWrhsOnsoilSw,ip02015DtaWrhsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015DtaWrhsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015DtaWrhsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015DtaWrhsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015DtaWrhsOnsoilSw,IP_02015_DTA_WRHS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015DtaWrhsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015DtaWrhsOnsoilSw,IP_02015_DTA_WRHS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015DtaWrhsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DtaWrhsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015DtaWrhsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015BllngOnsoilSw
	 *	@return ip02015BllngOnsoilSw
	 */
   public char[] getIp02015BllngOnsoilSw() throws CFException{
     if (isIp02015BllngOnsoilSwModified()) { 
        ip02015BllngOnsoilSw = refreshIp02015BllngOnsoilSw();
     }
   		return ip02015BllngOnsoilSw;
   }

  
	/**
	*  set variable ip02015BllngOnsoilSw
	*  Corresponding COBOL Variable is IP02015-BLLNG-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015BllngOnsoilSw(char[] value) {
      ip02015BllngOnsoilSw = checkIp02015BllngOnsoilSwConstraints(value);
      serializeIp02015BllngOnsoilSw(ip02015BllngOnsoilSw);
   } 

     /**
	 * 	Update Ip02015BllngOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015BllngOnsoilSw,ip02015BllngOnsoilSw.length);
   	
   }
   
   public void setIp02015BllngOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BllngOnsoilSw,ip02015BllngOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015BllngOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BllngOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015BllngOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015BllngOnsoilSw,IP_02015_BLLNG_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015BllngOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015BllngOnsoilSw,IP_02015_BLLNG_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015BllngOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BllngOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BllngOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015SetlOnsoilSw
	 *	@return ip02015SetlOnsoilSw
	 */
   public char[] getIp02015SetlOnsoilSw() throws CFException{
     if (isIp02015SetlOnsoilSwModified()) { 
        ip02015SetlOnsoilSw = refreshIp02015SetlOnsoilSw();
     }
   		return ip02015SetlOnsoilSw;
   }

  
	/**
	*  set variable ip02015SetlOnsoilSw
	*  Corresponding COBOL Variable is IP02015-SETL-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015SetlOnsoilSw(char[] value) {
      ip02015SetlOnsoilSw = checkIp02015SetlOnsoilSwConstraints(value);
      serializeIp02015SetlOnsoilSw(ip02015SetlOnsoilSw);
   } 

     /**
	 * 	Update Ip02015SetlOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015SetlOnsoilSw,ip02015SetlOnsoilSw.length);
   	
   }
   
   public void setIp02015SetlOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015SetlOnsoilSw,ip02015SetlOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015SetlOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015SetlOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015SetlOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015SetlOnsoilSw,IP_02015_SETL_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015SetlOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015SetlOnsoilSw,IP_02015_SETL_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015SetlOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SetlOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015SetlOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015ClrOnsoilSw
	 *	@return ip02015ClrOnsoilSw
	 */
   public char[] getIp02015ClrOnsoilSw() throws CFException{
     if (isIp02015ClrOnsoilSwModified()) { 
        ip02015ClrOnsoilSw = refreshIp02015ClrOnsoilSw();
     }
   		return ip02015ClrOnsoilSw;
   }

  
	/**
	*  set variable ip02015ClrOnsoilSw
	*  Corresponding COBOL Variable is IP02015-CLR-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015ClrOnsoilSw(char[] value) {
      ip02015ClrOnsoilSw = checkIp02015ClrOnsoilSwConstraints(value);
      serializeIp02015ClrOnsoilSw(ip02015ClrOnsoilSw);
   } 

     /**
	 * 	Update Ip02015ClrOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015ClrOnsoilSw,ip02015ClrOnsoilSw.length);
   	
   }
   
   public void setIp02015ClrOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ClrOnsoilSw,ip02015ClrOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015ClrOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ClrOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015ClrOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015ClrOnsoilSw,IP_02015_CLR_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015ClrOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015ClrOnsoilSw,IP_02015_CLR_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015ClrOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ClrOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ClrOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015AmsOnsoilSw
	 *	@return ip02015AmsOnsoilSw
	 */
   public char[] getIp02015AmsOnsoilSw() throws CFException{
     if (isIp02015AmsOnsoilSwModified()) { 
        ip02015AmsOnsoilSw = refreshIp02015AmsOnsoilSw();
     }
   		return ip02015AmsOnsoilSw;
   }

  
	/**
	*  set variable ip02015AmsOnsoilSw
	*  Corresponding COBOL Variable is IP02015-AMS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015AmsOnsoilSw(char[] value) {
      ip02015AmsOnsoilSw = checkIp02015AmsOnsoilSwConstraints(value);
      serializeIp02015AmsOnsoilSw(ip02015AmsOnsoilSw);
   } 

     /**
	 * 	Update Ip02015AmsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015AmsOnsoilSw,ip02015AmsOnsoilSw.length);
   	
   }
   
   public void setIp02015AmsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015AmsOnsoilSw,ip02015AmsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015AmsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015AmsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015AmsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015AmsOnsoilSw,IP_02015_AMS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015AmsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015AmsOnsoilSw,IP_02015_AMS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015AmsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AmsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015AmsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015McomOnsoilSw
	 *	@return ip02015McomOnsoilSw
	 */
   public char[] getIp02015McomOnsoilSw() throws CFException{
     if (isIp02015McomOnsoilSwModified()) { 
        ip02015McomOnsoilSw = refreshIp02015McomOnsoilSw();
     }
   		return ip02015McomOnsoilSw;
   }

  
	/**
	*  set variable ip02015McomOnsoilSw
	*  Corresponding COBOL Variable is IP02015-MCOM-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015McomOnsoilSw(char[] value) {
      ip02015McomOnsoilSw = checkIp02015McomOnsoilSwConstraints(value);
      serializeIp02015McomOnsoilSw(ip02015McomOnsoilSw);
   } 

     /**
	 * 	Update Ip02015McomOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015McomOnsoilSw,ip02015McomOnsoilSw.length);
   	
   }
   
   public void setIp02015McomOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015McomOnsoilSw,ip02015McomOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015McomOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015McomOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015McomOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015McomOnsoilSw,IP_02015_MCOM_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015McomOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015McomOnsoilSw,IP_02015_MCOM_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015McomOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015McomOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015McomOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015MdsOnsoilSw
	 *	@return ip02015MdsOnsoilSw
	 */
   public char[] getIp02015MdsOnsoilSw() throws CFException{
     if (isIp02015MdsOnsoilSwModified()) { 
        ip02015MdsOnsoilSw = refreshIp02015MdsOnsoilSw();
     }
   		return ip02015MdsOnsoilSw;
   }

  
	/**
	*  set variable ip02015MdsOnsoilSw
	*  Corresponding COBOL Variable is IP02015-MDS-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015MdsOnsoilSw(char[] value) {
      ip02015MdsOnsoilSw = checkIp02015MdsOnsoilSwConstraints(value);
      serializeIp02015MdsOnsoilSw(ip02015MdsOnsoilSw);
   } 

     /**
	 * 	Update Ip02015MdsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015MdsOnsoilSw,ip02015MdsOnsoilSw.length);
   	
   }
   
   public void setIp02015MdsOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MdsOnsoilSw,ip02015MdsOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015MdsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MdsOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015MdsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015MdsOnsoilSw,IP_02015_MDS_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015MdsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015MdsOnsoilSw,IP_02015_MDS_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015MdsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MdsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MdsOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015StndInOnsoilSw
	 *	@return ip02015StndInOnsoilSw
	 */
   public char[] getIp02015StndInOnsoilSw() throws CFException{
     if (isIp02015StndInOnsoilSwModified()) { 
        ip02015StndInOnsoilSw = refreshIp02015StndInOnsoilSw();
     }
   		return ip02015StndInOnsoilSw;
   }

  
	/**
	*  set variable ip02015StndInOnsoilSw
	*  Corresponding COBOL Variable is IP02015-STND-IN-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015StndInOnsoilSw(char[] value) {
      ip02015StndInOnsoilSw = checkIp02015StndInOnsoilSwConstraints(value);
      serializeIp02015StndInOnsoilSw(ip02015StndInOnsoilSw);
   } 

     /**
	 * 	Update Ip02015StndInOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015StndInOnsoilSw,ip02015StndInOnsoilSw.length);
   	
   }
   
   public void setIp02015StndInOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015StndInOnsoilSw,ip02015StndInOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015StndInOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015StndInOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015StndInOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015StndInOnsoilSw,IP_02015_STND_IN_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015StndInOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015StndInOnsoilSw,IP_02015_STND_IN_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015StndInOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015StndInOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015StndInOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015AuthOnsoilSw
	 *	@return ip02015AuthOnsoilSw
	 */
   public char[] getIp02015AuthOnsoilSw() throws CFException{
     if (isIp02015AuthOnsoilSwModified()) { 
        ip02015AuthOnsoilSw = refreshIp02015AuthOnsoilSw();
     }
   		return ip02015AuthOnsoilSw;
   }

  
	/**
	*  set variable ip02015AuthOnsoilSw
	*  Corresponding COBOL Variable is IP02015-AUTH-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015AuthOnsoilSw(char[] value) {
      ip02015AuthOnsoilSw = checkIp02015AuthOnsoilSwConstraints(value);
      serializeIp02015AuthOnsoilSw(ip02015AuthOnsoilSw);
   } 

     /**
	 * 	Update Ip02015AuthOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015AuthOnsoilSw,ip02015AuthOnsoilSw.length);
   	
   }
   
   public void setIp02015AuthOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015AuthOnsoilSw,ip02015AuthOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015AuthOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015AuthOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015AuthOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015AuthOnsoilSw,IP_02015_AUTH_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015AuthOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015AuthOnsoilSw,IP_02015_AUTH_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015AuthOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015AuthOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015AuthOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015RptHdrName
	 *	@return ip02015RptHdrName
	 */
   public char[] getIp02015RptHdrName() throws CFException{
     if (isIp02015RptHdrNameModified()) { 
        ip02015RptHdrName = refreshIp02015RptHdrName();
     }
   		return ip02015RptHdrName;
   }

  
	/**
	*  set variable ip02015RptHdrName
	*  Corresponding COBOL Variable is IP02015-RPT-HDR-NAME
	*  @param value
	**/
   public void setIp02015RptHdrName(char[] value) {
      ip02015RptHdrName = checkIp02015RptHdrNameConstraints(value);
      serializeIp02015RptHdrName(ip02015RptHdrName);
   } 

     /**
	 * 	Update Ip02015RptHdrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015RptHdrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015RptHdrName,ip02015RptHdrName.length);
   	
   }
   
   public void setIp02015RptHdrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015RptHdrName,ip02015RptHdrName.length);
   	
   }
   
     /**
	 * 	Update Ip02015RptHdrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015RptHdrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015RptHdrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015RptHdrName with another Field
	 *	@param value
	 */
   public void setIp02015RptHdrName(Field source) {
       replace(source,0,source.length(),beginIp02015RptHdrName,IP_02015_RPT_HDR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015RptHdrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015RptHdrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015RptHdrName,IP_02015_RPT_HDR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015RptHdrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015RptHdrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015RptHdrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015ClrPrcssCd
	 *	@return ip02015ClrPrcssCd
	 */
   public char[] getIp02015ClrPrcssCd() throws CFException{
     if (isIp02015ClrPrcssCdModified()) { 
        ip02015ClrPrcssCd = refreshIp02015ClrPrcssCd();
     }
   		return ip02015ClrPrcssCd;
   }

  
	/**
	*  set variable ip02015ClrPrcssCd
	*  Corresponding COBOL Variable is IP02015-CLR-PRCSS-CD
	*  @param value
	**/
   public void setIp02015ClrPrcssCd(char[] value) {
      ip02015ClrPrcssCd = checkIp02015ClrPrcssCdConstraints(value);
      serializeIp02015ClrPrcssCd(ip02015ClrPrcssCd);
   } 

     /**
	 * 	Update Ip02015ClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015ClrPrcssCd,ip02015ClrPrcssCd.length);
   	
   }
   
   public void setIp02015ClrPrcssCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ClrPrcssCd,ip02015ClrPrcssCd.length);
   	
   }
   
     /**
	 * 	Update Ip02015ClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ClrPrcssCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015ClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(Field source) {
       replace(source,0,source.length(),beginIp02015ClrPrcssCd,IP_02015_CLR_PRCSS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015ClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015ClrPrcssCd,IP_02015_CLR_PRCSS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015ClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ClrPrcssCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ClrPrcssCd+targetIndex,targetLen);
    
   }
	char[] ip02015GlobalPrcssCd8888Value = "GCMS".toCharArray();
	/**
	 *	Test condition "GCMS" for isIp02015GlobalPrcssCd88()
	 *	@return  Returns true if isIp02015GlobalPrcssCd88() is "GCMS"
	 */
   public boolean isIp02015GlobalPrcssCd88() throws CFException {
      return (  compareChars( getIp02015ClrPrcssCd() , ip02015GlobalPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "GCMS"
	*/
   	public void setIp02015GlobalPrcssCd88True() {  			
    	setIp02015ClrPrcssCd( ip02015GlobalPrcssCd8888Value);
   	}
	char[] ip02015LocalPrcssCd8888Value = "LCMS".toCharArray();
	/**
	 *	Test condition "LCMS" for isIp02015LocalPrcssCd88()
	 *	@return  Returns true if isIp02015LocalPrcssCd88() is "LCMS"
	 */
   public boolean isIp02015LocalPrcssCd88() throws CFException {
      return (  compareChars( getIp02015ClrPrcssCd() , ip02015LocalPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "LCMS"
	*/
   	public void setIp02015LocalPrcssCd88True() {  			
    	setIp02015ClrPrcssCd( ip02015LocalPrcssCd8888Value);
   	}
	char[] ip02015RedactPrcssCd8888Value = "RCMS".toCharArray();
	/**
	 *	Test condition "RCMS" for isIp02015RedactPrcssCd88()
	 *	@return  Returns true if isIp02015RedactPrcssCd88() is "RCMS"
	 */
   public boolean isIp02015RedactPrcssCd88() throws CFException {
      return (  compareChars( getIp02015ClrPrcssCd() , ip02015RedactPrcssCd8888Value)  == 0  );
   }


	/**
	*  set values "RCMS"
	*/
   	public void setIp02015RedactPrcssCd88True() {  			
    	setIp02015ClrPrcssCd( ip02015RedactPrcssCd8888Value);
   	}
	/**
	 *	Returns the value of ip02015OnUsPrcssAgrmtId
	 *	@return ip02015OnUsPrcssAgrmtId
	 */
   public char[] getIp02015OnUsPrcssAgrmtId() throws CFException{
     if (isIp02015OnUsPrcssAgrmtIdModified()) { 
        ip02015OnUsPrcssAgrmtId = refreshIp02015OnUsPrcssAgrmtId();
     }
   		return ip02015OnUsPrcssAgrmtId;
   }

  
	/**
	*  set variable ip02015OnUsPrcssAgrmtId
	*  Corresponding COBOL Variable is IP02015-ON-US-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02015OnUsPrcssAgrmtId(char[] value) {
      ip02015OnUsPrcssAgrmtId = checkIp02015OnUsPrcssAgrmtIdConstraints(value);
      serializeIp02015OnUsPrcssAgrmtId(ip02015OnUsPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02015OnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015OnUsPrcssAgrmtId,ip02015OnUsPrcssAgrmtId.length);
   	
   }
   
   public void setIp02015OnUsPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OnUsPrcssAgrmtId,ip02015OnUsPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02015OnUsPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OnUsPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015OnUsPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02015OnUsPrcssAgrmtId,IP_02015_ON_US_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015OnUsPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015OnUsPrcssAgrmtId,IP_02015_ON_US_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015OnUsPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OnUsPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OnUsPrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015PushOnsoilSw
	 *	@return ip02015PushOnsoilSw
	 */
   public char[] getIp02015PushOnsoilSw() throws CFException{
     if (isIp02015PushOnsoilSwModified()) { 
        ip02015PushOnsoilSw = refreshIp02015PushOnsoilSw();
     }
   		return ip02015PushOnsoilSw;
   }

  
	/**
	*  set variable ip02015PushOnsoilSw
	*  Corresponding COBOL Variable is IP02015-PUSH-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015PushOnsoilSw(char[] value) {
      ip02015PushOnsoilSw = checkIp02015PushOnsoilSwConstraints(value);
      serializeIp02015PushOnsoilSw(ip02015PushOnsoilSw);
   } 

     /**
	 * 	Update Ip02015PushOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015PushOnsoilSw,ip02015PushOnsoilSw.length);
   	
   }
   
   public void setIp02015PushOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015PushOnsoilSw,ip02015PushOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015PushOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015PushOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015PushOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015PushOnsoilSw,IP_02015_PUSH_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015PushOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015PushOnsoilSw,IP_02015_PUSH_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015PushOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PushOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015PushOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015IncontrolOnsoilSw
	 *	@return ip02015IncontrolOnsoilSw
	 */
   public char[] getIp02015IncontrolOnsoilSw() throws CFException{
     if (isIp02015IncontrolOnsoilSwModified()) { 
        ip02015IncontrolOnsoilSw = refreshIp02015IncontrolOnsoilSw();
     }
   		return ip02015IncontrolOnsoilSw;
   }

  
	/**
	*  set variable ip02015IncontrolOnsoilSw
	*  Corresponding COBOL Variable is IP02015-INCONTROL-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015IncontrolOnsoilSw(char[] value) {
      ip02015IncontrolOnsoilSw = checkIp02015IncontrolOnsoilSwConstraints(value);
      serializeIp02015IncontrolOnsoilSw(ip02015IncontrolOnsoilSw);
   } 

     /**
	 * 	Update Ip02015IncontrolOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015IncontrolOnsoilSw,ip02015IncontrolOnsoilSw.length);
   	
   }
   
   public void setIp02015IncontrolOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015IncontrolOnsoilSw,ip02015IncontrolOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015IncontrolOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015IncontrolOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015IncontrolOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015IncontrolOnsoilSw,IP_02015_INCONTROL_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015IncontrolOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015IncontrolOnsoilSw,IP_02015_INCONTROL_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015IncontrolOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015IncontrolOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015IncontrolOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015EsrvcOnsoilSw
	 *	@return ip02015EsrvcOnsoilSw
	 */
   public char[] getIp02015EsrvcOnsoilSw() throws CFException{
     if (isIp02015EsrvcOnsoilSwModified()) { 
        ip02015EsrvcOnsoilSw = refreshIp02015EsrvcOnsoilSw();
     }
   		return ip02015EsrvcOnsoilSw;
   }

  
	/**
	*  set variable ip02015EsrvcOnsoilSw
	*  Corresponding COBOL Variable is IP02015-ESRVC-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015EsrvcOnsoilSw(char[] value) {
      ip02015EsrvcOnsoilSw = checkIp02015EsrvcOnsoilSwConstraints(value);
      serializeIp02015EsrvcOnsoilSw(ip02015EsrvcOnsoilSw);
   } 

     /**
	 * 	Update Ip02015EsrvcOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015EsrvcOnsoilSw,ip02015EsrvcOnsoilSw.length);
   	
   }
   
   public void setIp02015EsrvcOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015EsrvcOnsoilSw,ip02015EsrvcOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015EsrvcOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015EsrvcOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015EsrvcOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015EsrvcOnsoilSw,IP_02015_ESRVC_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015EsrvcOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015EsrvcOnsoilSw,IP_02015_ESRVC_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015EsrvcOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015EsrvcOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015EsrvcOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015GftOnsoilSw
	 *	@return ip02015GftOnsoilSw
	 */
   public char[] getIp02015GftOnsoilSw() throws CFException{
     if (isIp02015GftOnsoilSwModified()) { 
        ip02015GftOnsoilSw = refreshIp02015GftOnsoilSw();
     }
   		return ip02015GftOnsoilSw;
   }

  
	/**
	*  set variable ip02015GftOnsoilSw
	*  Corresponding COBOL Variable is IP02015-GFT-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015GftOnsoilSw(char[] value) {
      ip02015GftOnsoilSw = checkIp02015GftOnsoilSwConstraints(value);
      serializeIp02015GftOnsoilSw(ip02015GftOnsoilSw);
   } 

     /**
	 * 	Update Ip02015GftOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015GftOnsoilSw,ip02015GftOnsoilSw.length);
   	
   }
   
   public void setIp02015GftOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015GftOnsoilSw,ip02015GftOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015GftOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015GftOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015GftOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015GftOnsoilSw,IP_02015_GFT_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015GftOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015GftOnsoilSw,IP_02015_GFT_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015GftOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015GftOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015GftOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015BnknetOnsoilSw
	 *	@return ip02015BnknetOnsoilSw
	 */
   public char[] getIp02015BnknetOnsoilSw() throws CFException{
     if (isIp02015BnknetOnsoilSwModified()) { 
        ip02015BnknetOnsoilSw = refreshIp02015BnknetOnsoilSw();
     }
   		return ip02015BnknetOnsoilSw;
   }

  
	/**
	*  set variable ip02015BnknetOnsoilSw
	*  Corresponding COBOL Variable is IP02015-BNKNET-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015BnknetOnsoilSw(char[] value) {
      ip02015BnknetOnsoilSw = checkIp02015BnknetOnsoilSwConstraints(value);
      serializeIp02015BnknetOnsoilSw(ip02015BnknetOnsoilSw);
   } 

     /**
	 * 	Update Ip02015BnknetOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015BnknetOnsoilSw,ip02015BnknetOnsoilSw.length);
   	
   }
   
   public void setIp02015BnknetOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BnknetOnsoilSw,ip02015BnknetOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015BnknetOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BnknetOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015BnknetOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015BnknetOnsoilSw,IP_02015_BNKNET_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015BnknetOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015BnknetOnsoilSw,IP_02015_BNKNET_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015BnknetOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BnknetOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BnknetOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015MdesOnsoilSw
	 *	@return ip02015MdesOnsoilSw
	 */
   public char[] getIp02015MdesOnsoilSw() throws CFException{
     if (isIp02015MdesOnsoilSwModified()) { 
        ip02015MdesOnsoilSw = refreshIp02015MdesOnsoilSw();
     }
   		return ip02015MdesOnsoilSw;
   }

  
	/**
	*  set variable ip02015MdesOnsoilSw
	*  Corresponding COBOL Variable is IP02015-MDES-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015MdesOnsoilSw(char[] value) {
      ip02015MdesOnsoilSw = checkIp02015MdesOnsoilSwConstraints(value);
      serializeIp02015MdesOnsoilSw(ip02015MdesOnsoilSw);
   } 

     /**
	 * 	Update Ip02015MdesOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015MdesOnsoilSw,ip02015MdesOnsoilSw.length);
   	
   }
   
   public void setIp02015MdesOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MdesOnsoilSw,ip02015MdesOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015MdesOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MdesOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015MdesOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015MdesOnsoilSw,IP_02015_MDES_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015MdesOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015MdesOnsoilSw,IP_02015_MDES_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015MdesOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015MdesOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015MdesOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015ZappOnsoilSw
	 *	@return ip02015ZappOnsoilSw
	 */
   public char[] getIp02015ZappOnsoilSw() throws CFException{
     if (isIp02015ZappOnsoilSwModified()) { 
        ip02015ZappOnsoilSw = refreshIp02015ZappOnsoilSw();
     }
   		return ip02015ZappOnsoilSw;
   }

  
	/**
	*  set variable ip02015ZappOnsoilSw
	*  Corresponding COBOL Variable is IP02015-ZAPP-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015ZappOnsoilSw(char[] value) {
      ip02015ZappOnsoilSw = checkIp02015ZappOnsoilSwConstraints(value);
      serializeIp02015ZappOnsoilSw(ip02015ZappOnsoilSw);
   } 

     /**
	 * 	Update Ip02015ZappOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015ZappOnsoilSw,ip02015ZappOnsoilSw.length);
   	
   }
   
   public void setIp02015ZappOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ZappOnsoilSw,ip02015ZappOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015ZappOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ZappOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015ZappOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015ZappOnsoilSw,IP_02015_ZAPP_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015ZappOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015ZappOnsoilSw,IP_02015_ZAPP_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015ZappOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ZappOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ZappOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015CemOnsoilSw
	 *	@return ip02015CemOnsoilSw
	 */
   public char[] getIp02015CemOnsoilSw() throws CFException{
     if (isIp02015CemOnsoilSwModified()) { 
        ip02015CemOnsoilSw = refreshIp02015CemOnsoilSw();
     }
   		return ip02015CemOnsoilSw;
   }

  
	/**
	*  set variable ip02015CemOnsoilSw
	*  Corresponding COBOL Variable is IP02015-CEM-ONSOIL-SW
	*  @param value
	**/
   public void setIp02015CemOnsoilSw(char[] value) {
      ip02015CemOnsoilSw = checkIp02015CemOnsoilSwConstraints(value);
      serializeIp02015CemOnsoilSw(ip02015CemOnsoilSw);
   } 

     /**
	 * 	Update Ip02015CemOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015CemOnsoilSw,ip02015CemOnsoilSw.length);
   	
   }
   
   public void setIp02015CemOnsoilSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015CemOnsoilSw,ip02015CemOnsoilSw.length);
   	
   }
   
     /**
	 * 	Update Ip02015CemOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015CemOnsoilSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015CemOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(Field source) {
       replace(source,0,source.length(),beginIp02015CemOnsoilSw,IP_02015_CEM_ONSOIL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015CemOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015CemOnsoilSw,IP_02015_CEM_ONSOIL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015CemOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015CemOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015CemOnsoilSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015OperSysId
	 *	@return ip02015OperSysId
	 */
   public char[] getIp02015OperSysId() throws CFException{
     if (isIp02015OperSysIdModified()) { 
        ip02015OperSysId = refreshIp02015OperSysId();
     }
   		return ip02015OperSysId;
   }

  
	/**
	*  set variable ip02015OperSysId
	*  Corresponding COBOL Variable is IP02015-OPER-SYS-ID
	*  @param value
	**/
   public void setIp02015OperSysId(char[] value) {
      ip02015OperSysId = checkIp02015OperSysIdConstraints(value);
      serializeIp02015OperSysId(ip02015OperSysId);
   } 

     /**
	 * 	Update Ip02015OperSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015OperSysId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015OperSysId,ip02015OperSysId.length);
   	
   }
   
   public void setIp02015OperSysId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OperSysId,ip02015OperSysId.length);
   	
   }
   
     /**
	 * 	Update Ip02015OperSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OperSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OperSysId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015OperSysId with another Field
	 *	@param value
	 */
   public void setIp02015OperSysId(Field source) {
       replace(source,0,source.length(),beginIp02015OperSysId,IP_02015_OPER_SYS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015OperSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015OperSysId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015OperSysId,IP_02015_OPER_SYS_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015OperSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015OperSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015OperSysId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015DbId
	 *	@return ip02015DbId
	 */
   public char[] getIp02015DbId() throws CFException{
     if (isIp02015DbIdModified()) { 
        ip02015DbId = refreshIp02015DbId();
     }
   		return ip02015DbId;
   }

  
	/**
	*  set variable ip02015DbId
	*  Corresponding COBOL Variable is IP02015-DB-ID
	*  @param value
	**/
   public void setIp02015DbId(char[] value) {
      ip02015DbId = checkIp02015DbIdConstraints(value);
      serializeIp02015DbId(ip02015DbId);
   } 

     /**
	 * 	Update Ip02015DbId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015DbId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015DbId,ip02015DbId.length);
   	
   }
   
   public void setIp02015DbId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015DbId,ip02015DbId.length);
   	
   }
   
     /**
	 * 	Update Ip02015DbId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DbId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015DbId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015DbId with another Field
	 *	@param value
	 */
   public void setIp02015DbId(Field source) {
       replace(source,0,source.length(),beginIp02015DbId,IP_02015_DB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015DbId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015DbId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015DbId,IP_02015_DB_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015DbId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015DbId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015DbId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of ip02015Db2Table
	 *  Corresponding COBOL Variable is IP02015-DB2-TABLE
	 *	@return ip02015Db2Table
	 */
   public List<Ip02015Db2Table> getIp02015Db2Table() {
       return ip02015Db2Table;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip02015Db2Table
	 */
	public Ip02015Db2Table getIp02015Db2Table(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp02015Db2Table(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_02015_DB_2_TABLE_SIZE) {
             	index = IP_02015_DB_2_TABLE_SIZE -1; // can't exceed max array size
             	logger.trace("ip02015Db2Table - Array index exceeded max Size {}, resetting it to max allowed",IP_02015_DB_2_TABLE_SIZE); 
	    }
		if (index >= ip02015Db2Table.size()) {
       		for (int fillIndex =  ip02015Db2Table.size() -1; fillIndex < index;fillIndex++) {
		       ip02015Db2Table.add(null);
		    }
			ip02015Db2Table.set(index,
			   	   	new Ip02015Db2Table(this,beginIp02015Db2Table + index * Ip02015Db2Table.getIp02015Db2TableFieldLength()) 
				                        ); 	
		} 
   	   Ip02015Db2Table value = ip02015Db2Table.get(index);
   	   if (value == null) {
   	      ip02015Db2Table.set(index,
			   	   	new Ip02015Db2Table(this,beginIp02015Db2Table + index * Ip02015Db2Table.getIp02015Db2TableFieldLength()) 
				                        ); 
		  value = ip02015Db2Table.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip02015Db2Table at index with the passed value
	 *  Corresponding COBOL Variable is IP02015-DB2-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setIp02015Db2Table(int index,char[] value) {
   	getIp02015Db2Table(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of ip02015Filler
	 *	@return ip02015Filler
	 */
   public char[] getIp02015Filler() throws CFException{
     if (isIp02015FillerModified()) { 
        ip02015Filler = refreshIp02015Filler();
     }
   		return ip02015Filler;
   }

  
	/**
	*  set variable ip02015Filler
	*  Corresponding COBOL Variable is IP02015-FILLER
	*  @param value
	**/
   public void setIp02015Filler(char[] value) {
      ip02015Filler = checkIp02015FillerConstraints(value);
      serializeIp02015Filler(ip02015Filler);
   } 

     /**
	 * 	Update Ip02015Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015Filler,ip02015Filler.length);
   	
   }
   
   public void setIp02015Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015Filler,ip02015Filler.length);
   	
   }
   
     /**
	 * 	Update Ip02015Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015Filler with another Field
	 *	@param value
	 */
   public void setIp02015Filler(Field source) {
       replace(source,0,source.length(),beginIp02015Filler,IP_02015_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015Filler,IP_02015_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02015PrcssAgrmtEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02015PrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02015GeoScopeCode(CONSTANTS.SPACE);
         setIp02015HostInd(CONSTANTS.SPACE);
          ip02015ImpBulkId.initialize();
     
                     setIp02015NumCurrCd(0);
         setIp02015OfsoilDataTypCd(CONSTANTS.SPACE_3);
         setIp02015MrchntSplitSw(CONSTANTS.SPACE);
         setIp02015MrchntSplitCd(CONSTANTS.SPACE);
         setIp02015CurrSplitSw(CONSTANTS.SPACE);
         setIp02015CurrSplitCd(CONSTANTS.SPACE);
         setIp02015AcquirerSplitCd(CONSTANTS.SPACE);
         setIp02015DomCollOnlyCd(CONSTANTS.SPACE);
         setIp02015OnsoilDataShrSw(CONSTANTS.SPACE);
                     setIp02015ClrCycleNum(0);
         setIp02015DtaWrhsOnsoilSw(CONSTANTS.SPACE);
         setIp02015BllngOnsoilSw(CONSTANTS.SPACE);
         setIp02015SetlOnsoilSw(CONSTANTS.SPACE);
         setIp02015ClrOnsoilSw(CONSTANTS.SPACE);
         setIp02015AmsOnsoilSw(CONSTANTS.SPACE);
         setIp02015McomOnsoilSw(CONSTANTS.SPACE);
         setIp02015MdsOnsoilSw(CONSTANTS.SPACE);
         setIp02015StndInOnsoilSw(CONSTANTS.SPACE);
         setIp02015AuthOnsoilSw(CONSTANTS.SPACE);
         setIp02015RptHdrName(CONSTANTS.SPACE_80);
         setIp02015ClrPrcssCd(CONSTANTS.SPACE_4);
         setIp02015OnUsPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02015PushOnsoilSw(CONSTANTS.SPACE);
         setIp02015IncontrolOnsoilSw(CONSTANTS.SPACE);
         setIp02015EsrvcOnsoilSw(CONSTANTS.SPACE);
         setIp02015GftOnsoilSw(CONSTANTS.SPACE);
         setIp02015BnknetOnsoilSw(CONSTANTS.SPACE);
         setIp02015MdesOnsoilSw(CONSTANTS.SPACE);
         setIp02015ZappOnsoilSw(CONSTANTS.SPACE);
         setIp02015CemOnsoilSw(CONSTANTS.SPACE);
         setIp02015OperSysId(CONSTANTS.SPACE_20);
         setIp02015DbId(CONSTANTS.SPACE_20);
     if (ip02015Db2Table.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_02015_DB_2_TABLE_SIZE;index++) {
              Ip02015Db2Table  newElement = new Ip02015Db2Table(this,beginIp02015Db2Table + index * Ip02015Db2Table.getIp02015Db2TableFieldLength());
              newElement.initialize();
               ip02015Db2Table.add(newElement);
          }
     } else {
        if (ip02015Db2Table.size() < IP_02015_DB_2_TABLE_SIZE) {
          // prefill it first
          for (int index = ip02015Db2Table.size();index <  IP_02015_DB_2_TABLE_SIZE;index++) {
              Ip02015Db2Table  newElement = new Ip02015Db2Table(this,beginIp02015Db2Table + index * Ip02015Db2Table.getIp02015Db2TableFieldLength());
               ip02015Db2Table.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02015_DB_2_TABLE_SIZE;index++) {
     		Ip02015Db2Table ip02015Db2TableVar = ip02015Db2Table.get(index);
 			if (ip02015Db2TableVar == null) {
                ip02015Db2TableVar = new Ip02015Db2Table(this,beginIp02015Db2Table + index * Ip02015Db2Table.getIp02015Db2TableFieldLength());
                  ip02015Db2Table.set(index, ip02015Db2TableVar);
			} 
			ip02015Db2TableVar.initialize();
		}
     }
         setIp02015Filler(CONSTANTS.SPACE_390);
   }

		public static int getIp02015PrcssAgrmtEntryFieldLength() {
			return IP_02015_PRCSS_AGRMT_ENTRY_LENGTH;
		}

}
  
