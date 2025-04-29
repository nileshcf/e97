package com.cloudframe.app.ar640010.dto;

/**
*  The class RequestParms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RequestParms1000 extends RequestParms1000Serialized {
   

						private char[] functionRequest1000 = new char[1];

						private char[] bulkId1000 = new char[4];

						private char[] endptId1000 = new char[7];

						private char[] deleteInd1000 = new char[1];

						private char[] cyclNum1000 = new char[3];
				private CyclNum1000Redefined cyclNum1000Redefined = new CyclNum1000Redefined();

						private char[] listBroadcastDd1000 = new char[8];
				private ApplicationDsn1000 applicationDsn1000 = new ApplicationDsn1000();
				private GftDsn1000 gftDsn1000 = new GftDsn1000();
				private GftRetrieveDsn1000 gftRetrieveDsn1000 = new GftRetrieveDsn1000();

						private char[] broadcastResult1000 = new char[8];
				private ProcDate1000 procDate1000 = new ProcDate1000();

								private int recCount1000;

								private int byteCount1000;
				private ApplicationPdsDsn1000 applicationPdsDsn1000 = new ApplicationPdsDsn1000();

								private int recCountLarge1000;

								private long byteCountLarge1000;

						private char[] tknname1000 = new char[128];
	
	/**
	* Constructor for RequestParms1000
	**/
    public RequestParms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			cyclNum1000Redefined.setParent(this,getStartOffset() + 13);
	       			applicationDsn1000.setParent(this,getStartOffset() + 24);
	       			gftDsn1000.setParent(this,getStartOffset() + 68);
	       			gftRetrieveDsn1000.setParent(this,getStartOffset() + 68);
	       			procDate1000.setParent(this,getStartOffset() + 120);
	       			applicationPdsDsn1000.setParent(this,getStartOffset() + 138);
	   	/*  end of offset */
								setFunctionRequest1000(fillSpace(1));
								setBulkId1000(fillSpace(4));
								setEndptId1000(fillSpace(7));
								setDeleteInd1000(fillSpace(1));
								setCyclNum1000(fillSpace(3));
								setListBroadcastDd1000(fillSpace(8));
								setBroadcastResult1000(fillSpace(8));
								procDate1000.setString(fillSpace(10));
								setRecCount1000(0);
								setByteCount1000(0);
								setRecCountLarge1000(0);
								setByteCountLarge1000(0L);
								setTknname1000(pad(128," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of functionRequest1000
	 *	@return functionRequest1000
	 */
   public char[] getFunctionRequest1000() throws CFException{
     if (isFunctionRequest1000Modified()) { 
        functionRequest1000 = refreshFunctionRequest1000();
     }
   		return functionRequest1000;
   }

  
	/**
	*  set variable functionRequest1000
	*  Corresponding COBOL Variable is 1000-FUNCTION-REQUEST
	*  @param value
	**/
   public void setFunctionRequest1000(char[] value) {
      functionRequest1000 = checkFunctionRequest1000Constraints(value);
      serializeFunctionRequest1000(functionRequest1000);
   } 

     /**
	 * 	Update FunctionRequest1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionRequest1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionRequest1000,functionRequest1000.length);
   	
   }
   
   public void setFunctionRequest1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionRequest1000,functionRequest1000.length);
   	
   }
   
     /**
	 * 	Update FunctionRequest1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionRequest1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionRequest1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionRequest1000 with another Field
	 *	@param value
	 */
   public void setFunctionRequest1000(Field source) {
       replace(source,0,source.length(),beginFunctionRequest1000,FUNCTION_REQUEST_1000_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionRequest1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionRequest1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionRequest1000,FUNCTION_REQUEST_1000_LEN);
   	
   }
   
     /**
	 * 	Update FunctionRequest1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionRequest1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionRequest1000+targetIndex,targetLen);
    
   }
	char[] addApplFile88100088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isAddApplFile881000()
	 *	@return  Returns true if isAddApplFile881000() is "A"
	 */
   public boolean isAddApplFile881000() throws CFException {
      return (  compareChars( getFunctionRequest1000() , addApplFile88100088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setAddApplFile881000True() {  			
    	setFunctionRequest1000( addApplFile88100088Value);
   	}
	char[] bulkBroadcast88100088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isBulkBroadcast881000()
	 *	@return  Returns true if isBulkBroadcast881000() is "B"
	 */
   public boolean isBulkBroadcast881000() throws CFException {
      return (  compareChars( getFunctionRequest1000() , bulkBroadcast88100088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setBulkBroadcast881000True() {  			
    	setFunctionRequest1000( bulkBroadcast88100088Value);
   	}
	char[] countFiles88100088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isCountFiles881000()
	 *	@return  Returns true if isCountFiles881000() is "C"
	 */
   public boolean isCountFiles881000() throws CFException {
      return (  compareChars( getFunctionRequest1000() , countFiles88100088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCountFiles881000True() {  			
    	setFunctionRequest1000( countFiles88100088Value);
   	}
	char[] fiforetrFile88100088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isFiforetrFile881000()
	 *	@return  Returns true if isFiforetrFile881000() is "F"
	 */
   public boolean isFiforetrFile881000() throws CFException {
      return (  compareChars( getFunctionRequest1000() , fiforetrFile88100088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setFiforetrFile881000True() {  			
    	setFunctionRequest1000( fiforetrFile88100088Value);
   	}
	char[] installExit88100088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isInstallExit881000()
	 *	@return  Returns true if isInstallExit881000() is "I"
	 */
   public boolean isInstallExit881000() throws CFException {
      return (  compareChars( getFunctionRequest1000() , installExit88100088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setInstallExit881000True() {  			
    	setFunctionRequest1000( installExit88100088Value);
   	}
	char[] listBroadcast88100088Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isListBroadcast881000()
	 *	@return  Returns true if isListBroadcast881000() is "L"
	 */
   public boolean isListBroadcast881000() throws CFException {
      return (  compareChars( getFunctionRequest1000() , listBroadcast88100088Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setListBroadcast881000True() {  			
    	setFunctionRequest1000( listBroadcast88100088Value);
   	}
	char[] retrieveFile88100088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isRetrieveFile881000()
	 *	@return  Returns true if isRetrieveFile881000() is "R"
	 */
   public boolean isRetrieveFile881000() throws CFException {
      return (  compareChars( getFunctionRequest1000() , retrieveFile88100088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setRetrieveFile881000True() {  			
    	setFunctionRequest1000( retrieveFile88100088Value);
   	}
	char[] sendFile88100088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSendFile881000()
	 *	@return  Returns true if isSendFile881000() is "S"
	 */
   public boolean isSendFile881000() throws CFException {
      return (  compareChars( getFunctionRequest1000() , sendFile88100088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSendFile881000True() {  			
    	setFunctionRequest1000( sendFile88100088Value);
   	}
	char[] resetFile88100088Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isResetFile881000()
	 *	@return  Returns true if isResetFile881000() is "X"
	 */
   public boolean isResetFile881000() throws CFException {
      return (  compareChars( getFunctionRequest1000() , resetFile88100088Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setResetFile881000True() {  			
    	setFunctionRequest1000( resetFile88100088Value);
   	}
	/**
	 *	Returns the value of bulkId1000
	 *	@return bulkId1000
	 */
   public char[] getBulkId1000() throws CFException{
     if (isBulkId1000Modified()) { 
        bulkId1000 = refreshBulkId1000();
     }
   		return bulkId1000;
   }

  
	/**
	*  set variable bulkId1000
	*  Corresponding COBOL Variable is 1000-BULK-ID
	*  @param value
	**/
   public void setBulkId1000(char[] value) {
      bulkId1000 = checkBulkId1000Constraints(value);
      serializeBulkId1000(bulkId1000);
   } 

     /**
	 * 	Update BulkId1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBulkId1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBulkId1000,bulkId1000.length);
   	
   }
   
   public void setBulkId1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBulkId1000,bulkId1000.length);
   	
   }
   
     /**
	 * 	Update BulkId1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBulkId1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkId1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BulkId1000 with another Field
	 *	@param value
	 */
   public void setBulkId1000(Field source) {
       replace(source,0,source.length(),beginBulkId1000,BULK_ID_1000_LEN);
   	
   }  
   
     /**
	 * 	Update BulkId1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBulkId1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBulkId1000,BULK_ID_1000_LEN);
   	
   }
   
     /**
	 * 	Update BulkId1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBulkId1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkId1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of endptId1000
	 *	@return endptId1000
	 */
   public char[] getEndptId1000() throws CFException{
     if (isEndptId1000Modified()) { 
        endptId1000 = refreshEndptId1000();
     }
   		return endptId1000;
   }

  
	/**
	*  set variable endptId1000
	*  Corresponding COBOL Variable is 1000-ENDPT-ID
	*  @param value
	**/
   public void setEndptId1000(char[] value) {
      endptId1000 = checkEndptId1000Constraints(value);
      serializeEndptId1000(endptId1000);
   } 

     /**
	 * 	Update EndptId1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEndptId1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEndptId1000,endptId1000.length);
   	
   }
   
   public void setEndptId1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEndptId1000,endptId1000.length);
   	
   }
   
     /**
	 * 	Update EndptId1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndptId1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndptId1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EndptId1000 with another Field
	 *	@param value
	 */
   public void setEndptId1000(Field source) {
       replace(source,0,source.length(),beginEndptId1000,ENDPT_ID_1000_LEN);
   	
   }  
   
     /**
	 * 	Update EndptId1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEndptId1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEndptId1000,ENDPT_ID_1000_LEN);
   	
   }
   
     /**
	 * 	Update EndptId1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndptId1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndptId1000+targetIndex,targetLen);
    
   }
	char[] endptIdNull88100088Value = "       ".toCharArray();
	/**
	 *	Test condition " " for isEndptIdNull881000()
	 *	@return  Returns true if isEndptIdNull881000() is " "
	 */
   public boolean isEndptIdNull881000() throws CFException {
      return (  compareChars( getEndptId1000() , endptIdNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setEndptIdNull881000True() {  			
    	setEndptId1000( endptIdNull88100088Value);
   	}
	/**
	 *	Returns the value of deleteInd1000
	 *	@return deleteInd1000
	 */
   public char[] getDeleteInd1000() throws CFException{
     if (isDeleteInd1000Modified()) { 
        deleteInd1000 = refreshDeleteInd1000();
     }
   		return deleteInd1000;
   }

  
	/**
	*  set variable deleteInd1000
	*  Corresponding COBOL Variable is 1000-DELETE-IND
	*  @param value
	**/
   public void setDeleteInd1000(char[] value) {
      deleteInd1000 = checkDeleteInd1000Constraints(value);
      serializeDeleteInd1000(deleteInd1000);
   } 

     /**
	 * 	Update DeleteInd1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDeleteInd1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDeleteInd1000,deleteInd1000.length);
   	
   }
   
   public void setDeleteInd1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDeleteInd1000,deleteInd1000.length);
   	
   }
   
     /**
	 * 	Update DeleteInd1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDeleteInd1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDeleteInd1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DeleteInd1000 with another Field
	 *	@param value
	 */
   public void setDeleteInd1000(Field source) {
       replace(source,0,source.length(),beginDeleteInd1000,DELETE_IND_1000_LEN);
   	
   }  
   
     /**
	 * 	Update DeleteInd1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDeleteInd1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDeleteInd1000,DELETE_IND_1000_LEN);
   	
   }
   
     /**
	 * 	Update DeleteInd1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDeleteInd1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDeleteInd1000+targetIndex,targetLen);
    
   }
	char[] deleteDsnNo88100088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDeleteDsnNo881000()
	 *	@return  Returns true if isDeleteDsnNo881000() is "N"
	 */
   public boolean isDeleteDsnNo881000() throws CFException {
      return (  compareChars( getDeleteInd1000() , deleteDsnNo88100088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDeleteDsnNo881000True() {  			
    	setDeleteInd1000( deleteDsnNo88100088Value);
   	}
	char[] deleteDsnYes88100088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDeleteDsnYes881000()
	 *	@return  Returns true if isDeleteDsnYes881000() is "Y"
	 */
   public boolean isDeleteDsnYes881000() throws CFException {
      return (  compareChars( getDeleteInd1000() , deleteDsnYes88100088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDeleteDsnYes881000True() {  			
    	setDeleteInd1000( deleteDsnYes88100088Value);
   	}
	char[] deleteIndNull88100088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isDeleteIndNull881000()
	 *	@return  Returns true if isDeleteIndNull881000() is " "
	 */
   public boolean isDeleteIndNull881000() throws CFException {
      return (  compareChars( getDeleteInd1000() , deleteIndNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setDeleteIndNull881000True() {  			
    	setDeleteInd1000( deleteIndNull88100088Value);
   	}
	/**
	 *	Returns the value of cyclNum1000
	 *	@return cyclNum1000
	 */
   public char[] getCyclNum1000() throws CFException{
     if (isCyclNum1000Modified()) { 
        cyclNum1000 = refreshCyclNum1000();
     }
   		return cyclNum1000;
   }

  
	/**
	*  set variable cyclNum1000
	*  Corresponding COBOL Variable is 1000-CYCL-NUM
	*  @param value
	**/
   public void setCyclNum1000(char[] value) {
      cyclNum1000 = checkCyclNum1000Constraints(value);
      serializeCyclNum1000(cyclNum1000);
   } 

     /**
	 * 	Update CyclNum1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCyclNum1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCyclNum1000,cyclNum1000.length);
   	
   }
   
   public void setCyclNum1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCyclNum1000,cyclNum1000.length);
   	
   }
   
     /**
	 * 	Update CyclNum1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCyclNum1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCyclNum1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CyclNum1000 with another Field
	 *	@param value
	 */
   public void setCyclNum1000(Field source) {
       replace(source,0,source.length(),beginCyclNum1000,CYCL_NUM_1000_LEN);
   	
   }  
   
     /**
	 * 	Update CyclNum1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCyclNum1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCyclNum1000,CYCL_NUM_1000_LEN);
   	
   }
   
     /**
	 * 	Update CyclNum1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCyclNum1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCyclNum1000+targetIndex,targetLen);
    
   }
	char[] cyclNumNull88100088Value = "   ".toCharArray();
	/**
	 *	Test condition " " for isCyclNumNull881000()
	 *	@return  Returns true if isCyclNumNull881000() is " "
	 */
   public boolean isCyclNumNull881000() throws CFException {
      return (  compareChars( getCyclNum1000() , cyclNumNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setCyclNumNull881000True() {  			
    	setCyclNum1000( cyclNumNull88100088Value);
   	}
	char[] cyclNumAll88100088Value = "ALL".toCharArray();
	/**
	 *	Test condition "ALL" for isCyclNumAll881000()
	 *	@return  Returns true if isCyclNumAll881000() is "ALL"
	 */
   public boolean isCyclNumAll881000() throws CFException {
      return (  compareChars( getCyclNum1000() , cyclNumAll88100088Value)  == 0  );
   }


	/**
	*  set values "ALL"
	*/
   	public void setCyclNumAll881000True() {  			
    	setCyclNum1000( cyclNumAll88100088Value);
   	}
	/**
	 *	Returns the value of cyclNum1000Redefined
	 *	@return cyclNum1000Redefined
	 */   
	 public CyclNum1000Redefined getCyclNum1000Redefined() {
   	return cyclNum1000Redefined;
   }
   /**
	* 	Update CyclNum1000Redefined with the passed value
	*   Corresponding COBOL Variable is 1000-CYCL-NUM-REDEFINED
	*	@param value
	*/
   public void setCyclNum1000Redefined(char[] value) {
      cyclNum1000Redefined.setString(value); 
   }   
    
     /**
	 * 	Update CyclNum1000Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCyclNum1000Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cyclNum1000Redefined.begin,cyclNum1000Redefined.length());
   }
   
     /**
	 * 	Update CyclNum1000Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCyclNum1000Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cyclNum1000Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CyclNum1000Redefined with another Field
	 *	@param value
	 */
   public void setCyclNum1000Redefined(Field source) {
   	replace(source,0,source.length(),cyclNum1000Redefined.begin,cyclNum1000Redefined.length());
   }  
   
     /**
	 * 	Update CyclNum1000Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCyclNum1000Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cyclNum1000Redefined.begin,cyclNum1000Redefined.length());
   }
   
     /**
	 * 	Update CyclNum1000Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCyclNum1000Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cyclNum1000Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of listBroadcastDd1000
	 *	@return listBroadcastDd1000
	 */
   public char[] getListBroadcastDd1000() throws CFException{
     if (isListBroadcastDd1000Modified()) { 
        listBroadcastDd1000 = refreshListBroadcastDd1000();
     }
   		return listBroadcastDd1000;
   }

  
	/**
	*  set variable listBroadcastDd1000
	*  Corresponding COBOL Variable is 1000-LIST-BROADCAST-DD
	*  @param value
	**/
   public void setListBroadcastDd1000(char[] value) {
      listBroadcastDd1000 = checkListBroadcastDd1000Constraints(value);
      serializeListBroadcastDd1000(listBroadcastDd1000);
   } 

     /**
	 * 	Update ListBroadcastDd1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setListBroadcastDd1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginListBroadcastDd1000,listBroadcastDd1000.length);
   	
   }
   
   public void setListBroadcastDd1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginListBroadcastDd1000,listBroadcastDd1000.length);
   	
   }
   
     /**
	 * 	Update ListBroadcastDd1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setListBroadcastDd1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginListBroadcastDd1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ListBroadcastDd1000 with another Field
	 *	@param value
	 */
   public void setListBroadcastDd1000(Field source) {
       replace(source,0,source.length(),beginListBroadcastDd1000,LIST_BROADCAST_DD_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ListBroadcastDd1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setListBroadcastDd1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginListBroadcastDd1000,LIST_BROADCAST_DD_1000_LEN);
   	
   }
   
     /**
	 * 	Update ListBroadcastDd1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setListBroadcastDd1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginListBroadcastDd1000+targetIndex,targetLen);
    
   }
	char[] listBroadcastNull88100088Value = "        ".toCharArray();
	/**
	 *	Test condition " " for isListBroadcastNull881000()
	 *	@return  Returns true if isListBroadcastNull881000() is " "
	 */
   public boolean isListBroadcastNull881000() throws CFException {
      return (  compareChars( getListBroadcastDd1000() , listBroadcastNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setListBroadcastNull881000True() {  			
    	setListBroadcastDd1000( listBroadcastNull88100088Value);
   	}
	/**
	 *	Returns the value of applicationDsn1000
	 *	@return applicationDsn1000
	 */   
	 public ApplicationDsn1000 getApplicationDsn1000() {
   	return applicationDsn1000;
   }
   /**
	* 	Update ApplicationDsn1000 with the passed value
	*   Corresponding COBOL Variable is 1000-APPLICATION-DSN
	*	@param value
	*/
   public void setApplicationDsn1000(char[] value) {
      applicationDsn1000.setString(value); 
   }   
    
     /**
	 * 	Update ApplicationDsn1000 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setApplicationDsn1000(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,applicationDsn1000.begin,applicationDsn1000.length());
   }
   
     /**
	 * 	Update ApplicationDsn1000 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplicationDsn1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,applicationDsn1000.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ApplicationDsn1000 with another Field
	 *	@param value
	 */
   public void setApplicationDsn1000(Field source) {
   	replace(source,0,source.length(),applicationDsn1000.begin,applicationDsn1000.length());
   }  
   
     /**
	 * 	Update ApplicationDsn1000 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setApplicationDsn1000(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,applicationDsn1000.begin,applicationDsn1000.length());
   }
   
     /**
	 * 	Update ApplicationDsn1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplicationDsn1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,applicationDsn1000.begin+targetIndex,targetLen);
   }
	char[] applicationDsnNull88100088Value = "                                            ".toCharArray();
	/**
	 *	Test condition " " for isApplicationDsnNull881000()
	 *	@return  Returns true if isApplicationDsnNull881000() is " "
	 */
   public boolean isApplicationDsnNull881000() throws CFException {
      return (  compareChars( getApplicationDsn1000().toCharArray() , applicationDsnNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setApplicationDsnNull881000True() {  			
    	setString(applicationDsnNull88100088Value);
   	}
	/**
	 *	Returns the value of gftDsn1000
	 *	@return gftDsn1000
	 */   
	 public GftDsn1000 getGftDsn1000() {
   	return gftDsn1000;
   }
   /**
	* 	Update GftDsn1000 with the passed value
	*   Corresponding COBOL Variable is 1000-GFT-DSN
	*	@param value
	*/
   public void setGftDsn1000(char[] value) {
      gftDsn1000.setString(value); 
   }   
    
     /**
	 * 	Update GftDsn1000 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGftDsn1000(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftDsn1000.begin,gftDsn1000.length());
   }
   
     /**
	 * 	Update GftDsn1000 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftDsn1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftDsn1000.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update GftDsn1000 with another Field
	 *	@param value
	 */
   public void setGftDsn1000(Field source) {
   	replace(source,0,source.length(),gftDsn1000.begin,gftDsn1000.length());
   }  
   
     /**
	 * 	Update GftDsn1000 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGftDsn1000(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftDsn1000.begin,gftDsn1000.length());
   }
   
     /**
	 * 	Update GftDsn1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftDsn1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftDsn1000.begin+targetIndex,targetLen);
   }
	char[] gftDsnNull88100088Value = "                                            ".toCharArray();
	/**
	 *	Test condition " " for isGftDsnNull881000()
	 *	@return  Returns true if isGftDsnNull881000() is " "
	 */
   public boolean isGftDsnNull881000() throws CFException {
      return (  compareChars( getGftDsn1000().toCharArray() , gftDsnNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setGftDsnNull881000True() {  			
    	setString(gftDsnNull88100088Value);
   	}
	/**
	 *	Returns the value of gftRetrieveDsn1000
	 *	@return gftRetrieveDsn1000
	 */   
	 public GftRetrieveDsn1000 getGftRetrieveDsn1000() {
   	return gftRetrieveDsn1000;
   }
   /**
	* 	Update GftRetrieveDsn1000 with the passed value
	*   Corresponding COBOL Variable is 1000-GFT-RETRIEVE-DSN
	*	@param value
	*/
   public void setGftRetrieveDsn1000(char[] value) {
      gftRetrieveDsn1000.setString(value); 
   }   
    
     /**
	 * 	Update GftRetrieveDsn1000 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGftRetrieveDsn1000(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftRetrieveDsn1000.begin,gftRetrieveDsn1000.length());
   }
   
     /**
	 * 	Update GftRetrieveDsn1000 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftRetrieveDsn1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftRetrieveDsn1000.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update GftRetrieveDsn1000 with another Field
	 *	@param value
	 */
   public void setGftRetrieveDsn1000(Field source) {
   	replace(source,0,source.length(),gftRetrieveDsn1000.begin,gftRetrieveDsn1000.length());
   }  
   
     /**
	 * 	Update GftRetrieveDsn1000 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGftRetrieveDsn1000(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftRetrieveDsn1000.begin,gftRetrieveDsn1000.length());
   }
   
     /**
	 * 	Update GftRetrieveDsn1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftRetrieveDsn1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftRetrieveDsn1000.begin+targetIndex,targetLen);
   }
	char[] gftRetrieveDsnNull88100088Value = "                                            ".toCharArray();
	/**
	 *	Test condition " " for isGftRetrieveDsnNull881000()
	 *	@return  Returns true if isGftRetrieveDsnNull881000() is " "
	 */
   public boolean isGftRetrieveDsnNull881000() throws CFException {
      return (  compareChars( getGftRetrieveDsn1000().toCharArray() , gftRetrieveDsnNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setGftRetrieveDsnNull881000True() {  			
    	setString(gftRetrieveDsnNull88100088Value);
   	}
	/**
	 *	Returns the value of broadcastResult1000
	 *	@return broadcastResult1000
	 */
   public char[] getBroadcastResult1000() throws CFException{
     if (isBroadcastResult1000Modified()) { 
        broadcastResult1000 = refreshBroadcastResult1000();
     }
   		return broadcastResult1000;
   }

  
	/**
	*  set variable broadcastResult1000
	*  Corresponding COBOL Variable is 1000-BROADCAST-RESULT
	*  @param value
	**/
   public void setBroadcastResult1000(char[] value) {
      broadcastResult1000 = checkBroadcastResult1000Constraints(value);
      serializeBroadcastResult1000(broadcastResult1000);
   } 

     /**
	 * 	Update BroadcastResult1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBroadcastResult1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBroadcastResult1000,broadcastResult1000.length);
   	
   }
   
   public void setBroadcastResult1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastResult1000,broadcastResult1000.length);
   	
   }
   
     /**
	 * 	Update BroadcastResult1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastResult1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastResult1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BroadcastResult1000 with another Field
	 *	@param value
	 */
   public void setBroadcastResult1000(Field source) {
       replace(source,0,source.length(),beginBroadcastResult1000,BROADCAST_RESULT_1000_LEN);
   	
   }  
   
     /**
	 * 	Update BroadcastResult1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBroadcastResult1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBroadcastResult1000,BROADCAST_RESULT_1000_LEN);
   	
   }
   
     /**
	 * 	Update BroadcastResult1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastResult1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastResult1000+targetIndex,targetLen);
    
   }
	char[] broadcastResultNull88100088Value = "        ".toCharArray();
	/**
	 *	Test condition " " for isBroadcastResultNull881000()
	 *	@return  Returns true if isBroadcastResultNull881000() is " "
	 */
   public boolean isBroadcastResultNull881000() throws CFException {
      return (  compareChars( getBroadcastResult1000() , broadcastResultNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setBroadcastResultNull881000True() {  			
    	setBroadcastResult1000( broadcastResultNull88100088Value);
   	}
	char[] broadcastDisplay88100088Value = "DISPLAY ".toCharArray();
	/**
	 *	Test condition "DISPLAY " for isBroadcastDisplay881000()
	 *	@return  Returns true if isBroadcastDisplay881000() is "DISPLAY "
	 */
   public boolean isBroadcastDisplay881000() throws CFException {
      return (  compareChars( getBroadcastResult1000() , broadcastDisplay88100088Value)  == 0  );
   }


	/**
	*  set values "DISPLAY "
	*/
   	public void setBroadcastDisplay881000True() {  			
    	setBroadcastResult1000( broadcastDisplay88100088Value);
   	}
	char[] broadcastReport88100088Value = "SYSLST  ".toCharArray();
	/**
	 *	Test condition "SYSLST  " for isBroadcastReport881000()
	 *	@return  Returns true if isBroadcastReport881000() is "SYSLST  "
	 */
   public boolean isBroadcastReport881000() throws CFException {
      return (  compareChars( getBroadcastResult1000() , broadcastReport88100088Value)  == 0  );
   }


	/**
	*  set values "SYSLST  "
	*/
   	public void setBroadcastReport881000True() {  			
    	setBroadcastResult1000( broadcastReport88100088Value);
   	}
	
	/**
	 *	Test condition "SYS100  " THRU "SYS299  " for isBroadcastRecord881000()
	 *	@return  Returns true if isBroadcastRecord881000() is "SYS100  " THRU "SYS299  "
	 */
   public boolean isBroadcastRecord881000() throws CFException {
      return (  isGreaterOrEqual(getBroadcastResult1000(), "SYS100  " ) &&  isLessOrEqual(getBroadcastResult1000(),"SYS299  " )  );
   }


	/**
	*  set values "SYS100  " THRU "SYS299  "
	*/
   	public void setBroadcastRecord881000True() {  			
    	setBroadcastResult1000( "SYS100  ".toCharArray());
   	}
	/**
	 *	Returns the value of procDate1000
	 *	@return procDate1000
	 */   
	 public ProcDate1000 getProcDate1000() {
   	return procDate1000;
   }
   /**
	* 	Update ProcDate1000 with the passed value
	*   Corresponding COBOL Variable is 1000-PROC-DATE
	*	@param value
	*/
   public void setProcDate1000(char[] value) {
      procDate1000.setString(value); 
   }   
    
     /**
	 * 	Update ProcDate1000 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setProcDate1000(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,procDate1000.begin,procDate1000.length());
   }
   
     /**
	 * 	Update ProcDate1000 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDate1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,procDate1000.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ProcDate1000 with another Field
	 *	@param value
	 */
   public void setProcDate1000(Field source) {
   	replace(source,0,source.length(),procDate1000.begin,procDate1000.length());
   }  
   
     /**
	 * 	Update ProcDate1000 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setProcDate1000(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,procDate1000.begin,procDate1000.length());
   }
   
     /**
	 * 	Update ProcDate1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDate1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,procDate1000.begin+targetIndex,targetLen);
   }
	char[] procDateNull88100088Value = "          ".toCharArray();
	/**
	 *	Test condition " " for isProcDateNull881000()
	 *	@return  Returns true if isProcDateNull881000() is " "
	 */
   public boolean isProcDateNull881000() throws CFException {
      return (  compareChars( getProcDate1000().toCharArray() , procDateNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setProcDateNull881000True() {  			
    	setString(procDateNull88100088Value);
   	}
	/**
	 *	Returns the value of recCount1000
	 *	@return recCount1000
	 */
	public int getRecCount1000() throws CFException {
        if (isRecCount1000Modified()) { 
           recCount1000 = refreshRecCount1000();
        }
   		return recCount1000;
	}
	
	/**
	 * 	Update RecCount1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-REC-COUNT
	 *	@param number
	 */
	public void setRecCount1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    recCount1000 = checkRecCount1000MaxLimit(number); 
		serializeRecCount1000(recCount1000);
	}


	public void setRecCount1000(long number) {
	    number = checkRecCount1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecCount1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isReccntNull881000()
	 *	@return  Returns true if isReccntNull881000() is 0
	 */
   public boolean isReccntNull881000() throws CFException {
      return (  getRecCount1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setReccntNull881000True() {  			
    	setRecCount1000( 0);
   	}
	/**
	 *	Returns the value of byteCount1000
	 *	@return byteCount1000
	 */
	public int getByteCount1000() throws CFException {
        if (isByteCount1000Modified()) { 
           byteCount1000 = refreshByteCount1000();
        }
   		return byteCount1000;
	}
	
	/**
	 * 	Update ByteCount1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-BYTE-COUNT
	 *	@param number
	 */
	public void setByteCount1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    byteCount1000 = checkByteCount1000MaxLimit(number); 
		serializeByteCount1000(byteCount1000);
	}


	public void setByteCount1000(long number) {
	    number = checkByteCount1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setByteCount1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isBytcntNull881000()
	 *	@return  Returns true if isBytcntNull881000() is 0
	 */
   public boolean isBytcntNull881000() throws CFException {
      return (  getByteCount1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setBytcntNull881000True() {  			
    	setByteCount1000( 0);
   	}
	/**
	 *	Returns the value of applicationPdsDsn1000
	 *	@return applicationPdsDsn1000
	 */   
	 public ApplicationPdsDsn1000 getApplicationPdsDsn1000() {
   	return applicationPdsDsn1000;
   }
   /**
	* 	Update ApplicationPdsDsn1000 with the passed value
	*   Corresponding COBOL Variable is 1000-APPLICATION-PDS-DSN
	*	@param value
	*/
   public void setApplicationPdsDsn1000(char[] value) {
      applicationPdsDsn1000.setString(value); 
   }   
    
     /**
	 * 	Update ApplicationPdsDsn1000 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setApplicationPdsDsn1000(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,applicationPdsDsn1000.begin,applicationPdsDsn1000.length());
   }
   
     /**
	 * 	Update ApplicationPdsDsn1000 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplicationPdsDsn1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,applicationPdsDsn1000.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ApplicationPdsDsn1000 with another Field
	 *	@param value
	 */
   public void setApplicationPdsDsn1000(Field source) {
   	replace(source,0,source.length(),applicationPdsDsn1000.begin,applicationPdsDsn1000.length());
   }  
   
     /**
	 * 	Update ApplicationPdsDsn1000 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setApplicationPdsDsn1000(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,applicationPdsDsn1000.begin,applicationPdsDsn1000.length());
   }
   
     /**
	 * 	Update ApplicationPdsDsn1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplicationPdsDsn1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,applicationPdsDsn1000.begin+targetIndex,targetLen);
   }
	char[] applPdsDsnNull88100088Value = "                                                      ".toCharArray();
	/**
	 *	Test condition " " for isApplPdsDsnNull881000()
	 *	@return  Returns true if isApplPdsDsnNull881000() is " "
	 */
   public boolean isApplPdsDsnNull881000() throws CFException {
      return (  compareChars( getApplicationPdsDsn1000().toCharArray() , applPdsDsnNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setApplPdsDsnNull881000True() {  			
    	setString(applPdsDsnNull88100088Value);
   	}
	/**
	 *	Returns the value of recCountLarge1000
	 *	@return recCountLarge1000
	 */
	public int getRecCountLarge1000() throws CFException {
        if (isRecCountLarge1000Modified()) { 
           recCountLarge1000 = refreshRecCountLarge1000();
        }
   		return recCountLarge1000;
	}
	
	/**
	 * 	Update RecCountLarge1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-REC-COUNT-LARGE
	 *	@param number
	 */
	public void setRecCountLarge1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    recCountLarge1000 = checkRecCountLarge1000MaxLimit(number); 
		serializeRecCountLarge1000(recCountLarge1000);
	}


	public void setRecCountLarge1000(long number) {
	    number = checkRecCountLarge1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecCountLarge1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isReccntLargeNull881000()
	 *	@return  Returns true if isReccntLargeNull881000() is 0
	 */
   public boolean isReccntLargeNull881000() throws CFException {
      return (  getRecCountLarge1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setReccntLargeNull881000True() {  			
    	setRecCountLarge1000( 0);
   	}
	/**
	 *	Returns the value of byteCountLarge1000
	 *	@return byteCountLarge1000
	 */
	public long getByteCountLarge1000() throws CFException {
        if (isByteCountLarge1000Modified()) { 
           byteCountLarge1000 = refreshByteCountLarge1000();
        }
   		return byteCountLarge1000;
	}
	
	/**
	 * 	Update ByteCountLarge1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-BYTE-COUNT-LARGE
	 *	@param number
	 */
	public void setByteCountLarge1000(long number) {
	     // Truncate if the number is beyond +/- Max range
	    byteCountLarge1000 = checkByteCountLarge1000MaxLimit(number); 
		serializeByteCountLarge1000(byteCountLarge1000);
	}


	
	/**
	 *	Test condition 0 for isBytcntLargeNull881000()
	 *	@return  Returns true if isBytcntLargeNull881000() is 0
	 */
   public boolean isBytcntLargeNull881000() throws CFException {
      return (  getByteCountLarge1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setBytcntLargeNull881000True() {  			
    	setByteCountLarge1000( 0);
   	}
	/**
	 *	Returns the value of tknname1000
	 *	@return tknname1000
	 */
   public char[] getTknname1000() throws CFException{
     if (isTknname1000Modified()) { 
        tknname1000 = refreshTknname1000();
     }
   		return tknname1000;
   }

  
	/**
	*  set variable tknname1000
	*  Corresponding COBOL Variable is 1000-TKNNAME
	*  @param value
	**/
   public void setTknname1000(char[] value) {
      tknname1000 = checkTknname1000Constraints(value);
      serializeTknname1000(tknname1000);
   } 

     /**
	 * 	Update Tknname1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTknname1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTknname1000,tknname1000.length);
   	
   }
   
   public void setTknname1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTknname1000,tknname1000.length);
   	
   }
   
     /**
	 * 	Update Tknname1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTknname1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTknname1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tknname1000 with another Field
	 *	@param value
	 */
   public void setTknname1000(Field source) {
       replace(source,0,source.length(),beginTknname1000,TKNNAME_1000_LEN);
   	
   }  
   
     /**
	 * 	Update Tknname1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTknname1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTknname1000,TKNNAME_1000_LEN);
   	
   }
   
     /**
	 * 	Update Tknname1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTknname1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTknname1000+targetIndex,targetLen);
    
   }
	char[] tknnameNull88100088Value = "                                                                                                                                ".toCharArray();
	/**
	 *	Test condition " " for isTknnameNull881000()
	 *	@return  Returns true if isTknnameNull881000() is " "
	 */
   public boolean isTknnameNull881000() throws CFException {
      return (  compareChars( getTknname1000() , tknnameNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setTknnameNull881000True() {  			
    	setTknname1000( tknnameNull88100088Value);
   	}

	
	
	

		public static int getRequestParms1000FieldLength() {
			return REQUEST_PARMS_1000_LENGTH;
		}

}
  
