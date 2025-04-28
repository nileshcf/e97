package com.cloudframe.app.init1.dto;

/**
*  The class CmnPgmArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class CmnPgmArea extends CmnPgmAreaSerialized { 
   

						private char[] cmnErrorType = Field.fillLowValue(4);

						private char[] cmnUserid = Field.fillLowValue(8);


								private int cmnErrMsgNo;


						private char[] cmnErrApplId = Field.fillLowValue(5);

						private char[] cmnErrPgmName = Field.fillLowValue(8);

						private char[] cmnErrPgmParanum = Field.fillLowValue(4);

						private char[] cmnErrPgmAction = Field.fillLowValue(12);

								private int cmnErrSqlcode;

						private char[] cmnErrField = Field.fillLowValue(18);
				private CmnErrMsgArea cmnErrMsgArea = new CmnErrMsgArea();
				private CmnErrMsgBytes cmnErrMsgBytes = new CmnErrMsgBytes();
				private CmnApplMsgArea cmnApplMsgArea = new CmnApplMsgArea();
				private CmnSqlca cmnSqlca = new CmnSqlca();


						private char[] cmnApplName = Field.fillLowValue(38);

						private char[] cmnFiller = Field.fillLowValue(242);

								private short cmnUserAbendCd;

						private char[] cmnAbendInd = Field.fillLowValue(1);
	
	/**
	* Constructor for CmnPgmArea
	**/
    public CmnPgmArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPgmArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPgmArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnErrMsgArea.setParent(this,getStartOffset() + 91);
	       			cmnErrMsgBytes.setParent(this,getStartOffset() + 91);
	       			cmnApplMsgArea.setParent(this,getStartOffset() + 91);
	       			cmnSqlca.setParent(this,getStartOffset() + 603);
    } 

	/**
	 *	Returns the value of cmnErrorType
	 *	@return cmnErrorType
	 */
   public char[] getCmnErrorType() throws CFException{
     if (isCmnErrorTypeModified()) { 
        cmnErrorType = refreshCmnErrorType();
     }
   		return cmnErrorType;
   }

  
	/**
	*  set variable cmnErrorType
	*  Corresponding COBOL Variable is CMN-ERROR-TYPE
	*  @param value
	**/
   public void setCmnErrorType(char[] value) {
      cmnErrorType = checkCmnErrorTypeConstraints(value);
      serializeCmnErrorType(cmnErrorType);
   } 

     /**
	 * 	Update CmnErrorType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnErrorType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnErrorType,cmnErrorType.length);
   	
   }
   
   public void setCmnErrorType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrorType,cmnErrorType.length);
   	
   }
   
     /**
	 * 	Update CmnErrorType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrorType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrorType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnErrorType with another Field
	 *	@param value
	 */
   public void setCmnErrorType(Field source) {
       replace(source,0,source.length(),beginCmnErrorType,CMN_ERROR_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update CmnErrorType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnErrorType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnErrorType,CMN_ERROR_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update CmnErrorType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrorType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrorType+targetIndex,targetLen);
    
   }
	char[] cmnOk88Value = "    ".toCharArray();
	/**
	 *	Test condition "    " for isCmnOk()
	 *	@return  Returns true if isCmnOk() is "    "
	 */
   public boolean isCmnOk() throws CFException {
      return (  compareChars( getCmnErrorType() , cmnOk88Value)  == 0  );
   }


	/**
	*  set values "    "
	*/
   	public void setCmnOkTrue() {  			
    	setCmnErrorType( cmnOk88Value);
   	}
	char[] cmnApplError88Value = "APPL".toCharArray();
	/**
	 *	Test condition "APPL" for isCmnApplError()
	 *	@return  Returns true if isCmnApplError() is "APPL"
	 */
   public boolean isCmnApplError() throws CFException {
      return (  compareChars( getCmnErrorType() , cmnApplError88Value)  == 0  );
   }


	/**
	*  set values "APPL"
	*/
   	public void setCmnApplErrorTrue() {  			
    	setCmnErrorType( cmnApplError88Value);
   	}
	char[] cmnDbmsError88Value = "DBMS".toCharArray();
	/**
	 *	Test condition "DBMS" for isCmnDbmsError()
	 *	@return  Returns true if isCmnDbmsError() is "DBMS"
	 */
   public boolean isCmnDbmsError() throws CFException {
      return (  compareChars( getCmnErrorType() , cmnDbmsError88Value)  == 0  );
   }


	/**
	*  set values "DBMS"
	*/
   	public void setCmnDbmsErrorTrue() {  			
    	setCmnErrorType( cmnDbmsError88Value);
   	}
	char[] cmnFaplError88Value = "FAPL".toCharArray();
	/**
	 *	Test condition "FAPL" for isCmnFaplError()
	 *	@return  Returns true if isCmnFaplError() is "FAPL"
	 */
   public boolean isCmnFaplError() throws CFException {
      return (  compareChars( getCmnErrorType() , cmnFaplError88Value)  == 0  );
   }


	/**
	*  set values "FAPL"
	*/
   	public void setCmnFaplErrorTrue() {  			
    	setCmnErrorType( cmnFaplError88Value);
   	}
	/**
	 *	Returns the value of cmnUserid
	 *	@return cmnUserid
	 */
   public char[] getCmnUserid() throws CFException{
     if (isCmnUseridModified()) { 
        cmnUserid = refreshCmnUserid();
     }
   		return cmnUserid;
   }

  
	/**
	*  set variable cmnUserid
	*  Corresponding COBOL Variable is CMN-USERID
	*  @param value
	**/
   public void setCmnUserid(char[] value) {
      cmnUserid = checkCmnUseridConstraints(value);
      serializeCmnUserid(cmnUserid);
   } 

     /**
	 * 	Update CmnUserid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnUserid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnUserid,cmnUserid.length);
   	
   }
   
   public void setCmnUserid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnUserid,cmnUserid.length);
   	
   }
   
     /**
	 * 	Update CmnUserid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnUserid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnUserid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnUserid with another Field
	 *	@param value
	 */
   public void setCmnUserid(Field source) {
       replace(source,0,source.length(),beginCmnUserid,CMN_USERID_LEN);
   	
   }  
   
     /**
	 * 	Update CmnUserid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnUserid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnUserid,CMN_USERID_LEN);
   	
   }
   
     /**
	 * 	Update CmnUserid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnUserid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnUserid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnErrMsgNo
	 *	@return cmnErrMsgNo
	 */
	public int getCmnErrMsgNo() throws CFException {
        if (isCmnErrMsgNoModified()) { 
           cmnErrMsgNo = refreshCmnErrMsgNo();
        }
   		return cmnErrMsgNo;
	}
	
	/**
	 * 	Update CmnErrMsgNo with the passed value
	 *  Corresponding COBOL Variable is CMN-ERR-MSG-NO
	 *	@param number
	 */
	public void setCmnErrMsgNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cmnErrMsgNo = checkCmnErrMsgNoMaxLimit(number); 
		serializeCmnErrMsgNo(cmnErrMsgNo);
	}


	public void setCmnErrMsgNo(long number) {
	    number = checkCmnErrMsgNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnErrMsgNo((int)number);
	}
	
	/**
	 *	Returns the value of cmnErrApplId
	 *	@return cmnErrApplId
	 */
   public char[] getCmnErrApplId() throws CFException{
     if (isCmnErrApplIdModified()) { 
        cmnErrApplId = refreshCmnErrApplId();
     }
   		return cmnErrApplId;
   }

  
	/**
	*  set variable cmnErrApplId
	*  Corresponding COBOL Variable is CMN-ERR-APPL-ID
	*  @param value
	**/
   public void setCmnErrApplId(char[] value) {
      cmnErrApplId = checkCmnErrApplIdConstraints(value);
      serializeCmnErrApplId(cmnErrApplId);
   } 

     /**
	 * 	Update CmnErrApplId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnErrApplId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnErrApplId,cmnErrApplId.length);
   	
   }
   
   public void setCmnErrApplId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrApplId,cmnErrApplId.length);
   	
   }
   
     /**
	 * 	Update CmnErrApplId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrApplId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrApplId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnErrApplId with another Field
	 *	@param value
	 */
   public void setCmnErrApplId(Field source) {
       replace(source,0,source.length(),beginCmnErrApplId,CMN_ERR_APPL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CmnErrApplId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnErrApplId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnErrApplId,CMN_ERR_APPL_ID_LEN);
   	
   }
   
     /**
	 * 	Update CmnErrApplId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrApplId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrApplId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnErrPgmName
	 *	@return cmnErrPgmName
	 */
   public char[] getCmnErrPgmName() throws CFException{
     if (isCmnErrPgmNameModified()) { 
        cmnErrPgmName = refreshCmnErrPgmName();
     }
   		return cmnErrPgmName;
   }

  
	/**
	*  set variable cmnErrPgmName
	*  Corresponding COBOL Variable is CMN-ERR-PGM-NAME
	*  @param value
	**/
   public void setCmnErrPgmName(char[] value) {
      cmnErrPgmName = checkCmnErrPgmNameConstraints(value);
      serializeCmnErrPgmName(cmnErrPgmName);
   } 

     /**
	 * 	Update CmnErrPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnErrPgmName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnErrPgmName,cmnErrPgmName.length);
   	
   }
   
   public void setCmnErrPgmName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrPgmName,cmnErrPgmName.length);
   	
   }
   
     /**
	 * 	Update CmnErrPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrPgmName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnErrPgmName with another Field
	 *	@param value
	 */
   public void setCmnErrPgmName(Field source) {
       replace(source,0,source.length(),beginCmnErrPgmName,CMN_ERR_PGM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update CmnErrPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnErrPgmName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnErrPgmName,CMN_ERR_PGM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update CmnErrPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrPgmName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnErrPgmParanum
	 *	@return cmnErrPgmParanum
	 */
   public char[] getCmnErrPgmParanum() throws CFException{
     if (isCmnErrPgmParanumModified()) { 
        cmnErrPgmParanum = refreshCmnErrPgmParanum();
     }
   		return cmnErrPgmParanum;
   }

  
	/**
	*  set variable cmnErrPgmParanum
	*  Corresponding COBOL Variable is CMN-ERR-PGM-PARANUM
	*  @param value
	**/
   public void setCmnErrPgmParanum(char[] value) {
      cmnErrPgmParanum = checkCmnErrPgmParanumConstraints(value);
      serializeCmnErrPgmParanum(cmnErrPgmParanum);
   } 

     /**
	 * 	Update CmnErrPgmParanum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnErrPgmParanum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnErrPgmParanum,cmnErrPgmParanum.length);
   	
   }
   
   public void setCmnErrPgmParanum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrPgmParanum,cmnErrPgmParanum.length);
   	
   }
   
     /**
	 * 	Update CmnErrPgmParanum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrPgmParanum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrPgmParanum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnErrPgmParanum with another Field
	 *	@param value
	 */
   public void setCmnErrPgmParanum(Field source) {
       replace(source,0,source.length(),beginCmnErrPgmParanum,CMN_ERR_PGM_PARANUM_LEN);
   	
   }  
   
     /**
	 * 	Update CmnErrPgmParanum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnErrPgmParanum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnErrPgmParanum,CMN_ERR_PGM_PARANUM_LEN);
   	
   }
   
     /**
	 * 	Update CmnErrPgmParanum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrPgmParanum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrPgmParanum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnErrPgmAction
	 *	@return cmnErrPgmAction
	 */
   public char[] getCmnErrPgmAction() throws CFException{
     if (isCmnErrPgmActionModified()) { 
        cmnErrPgmAction = refreshCmnErrPgmAction();
     }
   		return cmnErrPgmAction;
   }

  
	/**
	*  set variable cmnErrPgmAction
	*  Corresponding COBOL Variable is CMN-ERR-PGM-ACTION
	*  @param value
	**/
   public void setCmnErrPgmAction(char[] value) {
      cmnErrPgmAction = checkCmnErrPgmActionConstraints(value);
      serializeCmnErrPgmAction(cmnErrPgmAction);
   } 

     /**
	 * 	Update CmnErrPgmAction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnErrPgmAction(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnErrPgmAction,cmnErrPgmAction.length);
   	
   }
   
   public void setCmnErrPgmAction(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrPgmAction,cmnErrPgmAction.length);
   	
   }
   
     /**
	 * 	Update CmnErrPgmAction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrPgmAction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrPgmAction+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnErrPgmAction with another Field
	 *	@param value
	 */
   public void setCmnErrPgmAction(Field source) {
       replace(source,0,source.length(),beginCmnErrPgmAction,CMN_ERR_PGM_ACTION_LEN);
   	
   }  
   
     /**
	 * 	Update CmnErrPgmAction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnErrPgmAction(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnErrPgmAction,CMN_ERR_PGM_ACTION_LEN);
   	
   }
   
     /**
	 * 	Update CmnErrPgmAction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrPgmAction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrPgmAction+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnErrSqlcode
	 *	@return cmnErrSqlcode
	 */
	public int getCmnErrSqlcode() throws CFException {
        if (isCmnErrSqlcodeModified()) { 
           cmnErrSqlcode = refreshCmnErrSqlcode();
        }
   		return cmnErrSqlcode;
	}
	
	/**
	 * 	Update CmnErrSqlcode with the passed value
	 *  Corresponding COBOL Variable is CMN-ERR-SQLCODE
	 *	@param number
	 */
	public void setCmnErrSqlcode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cmnErrSqlcode = checkCmnErrSqlcodeMaxLimit(number); 
		serializeCmnErrSqlcode(cmnErrSqlcode);
	}


	public void setCmnErrSqlcode(long number) {
	    number = checkCmnErrSqlcodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnErrSqlcode((int)number);
	}
	
	/**
	 *	Returns the value of cmnErrField
	 *	@return cmnErrField
	 */
   public char[] getCmnErrField() throws CFException{
     if (isCmnErrFieldModified()) { 
        cmnErrField = refreshCmnErrField();
     }
   		return cmnErrField;
   }

  
	/**
	*  set variable cmnErrField
	*  Corresponding COBOL Variable is CMN-ERR-FIELD
	*  @param value
	**/
   public void setCmnErrField(char[] value) {
      cmnErrField = checkCmnErrFieldConstraints(value);
      serializeCmnErrField(cmnErrField);
   } 

     /**
	 * 	Update CmnErrField 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnErrField(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnErrField,cmnErrField.length);
   	
   }
   
   public void setCmnErrField(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrField,cmnErrField.length);
   	
   }
   
     /**
	 * 	Update CmnErrField 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrField(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrField+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnErrField with another Field
	 *	@param value
	 */
   public void setCmnErrField(Field source) {
       replace(source,0,source.length(),beginCmnErrField,CMN_ERR_FIELD_LEN);
   	
   }  
   
     /**
	 * 	Update CmnErrField 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnErrField(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnErrField,CMN_ERR_FIELD_LEN);
   	
   }
   
     /**
	 * 	Update CmnErrField 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrField(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrField+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnErrMsgArea
	 *	@return cmnErrMsgArea
	 */   
	 public CmnErrMsgArea getCmnErrMsgArea() {
   	return cmnErrMsgArea;
   }
   /**
	* 	Update CmnErrMsgArea with the passed value
	*   Corresponding COBOL Variable is CMN-ERR-MSG-AREA
	*	@param value
	*/
   public void setCmnErrMsgArea(char[] value) {
      cmnErrMsgArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnErrMsgArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsgArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsgArea.begin,cmnErrMsgArea.length());
   }
   
     /**
	 * 	Update CmnErrMsgArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsgArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsgArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnErrMsgArea with another Field
	 *	@param value
	 */
   public void setCmnErrMsgArea(Field source) {
   	replace(source,0,source.length(),cmnErrMsgArea.begin,cmnErrMsgArea.length());
   }  
   
     /**
	 * 	Update CmnErrMsgArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsgArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsgArea.begin,cmnErrMsgArea.length());
   }
   
     /**
	 * 	Update CmnErrMsgArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsgArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsgArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnErrMsgBytes
	 *	@return cmnErrMsgBytes
	 */   
	 public CmnErrMsgBytes getCmnErrMsgBytes() {
   	return cmnErrMsgBytes;
   }
   /**
	* 	Update CmnErrMsgBytes with the passed value
	*   Corresponding COBOL Variable is CMN-ERR-MSG-BYTES
	*	@param value
	*/
   public void setCmnErrMsgBytes(char[] value) {
      cmnErrMsgBytes.setString(value); 
   }   
    
     /**
	 * 	Update CmnErrMsgBytes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsgBytes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsgBytes.begin,cmnErrMsgBytes.length());
   }
   
     /**
	 * 	Update CmnErrMsgBytes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsgBytes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsgBytes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnErrMsgBytes with another Field
	 *	@param value
	 */
   public void setCmnErrMsgBytes(Field source) {
   	replace(source,0,source.length(),cmnErrMsgBytes.begin,cmnErrMsgBytes.length());
   }  
   
     /**
	 * 	Update CmnErrMsgBytes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsgBytes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsgBytes.begin,cmnErrMsgBytes.length());
   }
   
     /**
	 * 	Update CmnErrMsgBytes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsgBytes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsgBytes.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnApplMsgArea
	 *	@return cmnApplMsgArea
	 */   
	 public CmnApplMsgArea getCmnApplMsgArea() {
   	return cmnApplMsgArea;
   }
   /**
	* 	Update CmnApplMsgArea with the passed value
	*   Corresponding COBOL Variable is CMN-APPL-MSG-AREA
	*	@param value
	*/
   public void setCmnApplMsgArea(char[] value) {
      cmnApplMsgArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnApplMsgArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnApplMsgArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnApplMsgArea.begin,cmnApplMsgArea.length());
   }
   
     /**
	 * 	Update CmnApplMsgArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnApplMsgArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnApplMsgArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnApplMsgArea with another Field
	 *	@param value
	 */
   public void setCmnApplMsgArea(Field source) {
   	replace(source,0,source.length(),cmnApplMsgArea.begin,cmnApplMsgArea.length());
   }  
   
     /**
	 * 	Update CmnApplMsgArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnApplMsgArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnApplMsgArea.begin,cmnApplMsgArea.length());
   }
   
     /**
	 * 	Update CmnApplMsgArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnApplMsgArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnApplMsgArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnSqlca
	 *	@return cmnSqlca
	 */   
	 public CmnSqlca getCmnSqlca() {
   	return cmnSqlca;
   }
   /**
	* 	Update CmnSqlca with the passed value
	*   Corresponding COBOL Variable is CMN-SQLCA
	*	@param value
	*/
   public void setCmnSqlca(char[] value) {
      cmnSqlca.setString(value); 
   }   
    
     /**
	 * 	Update CmnSqlca 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnSqlca(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnSqlca.begin,cmnSqlca.length());
   }
   
     /**
	 * 	Update CmnSqlca 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnSqlca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnSqlca.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnSqlca with another Field
	 *	@param value
	 */
   public void setCmnSqlca(Field source) {
   	replace(source,0,source.length(),cmnSqlca.begin,cmnSqlca.length());
   }  
   
     /**
	 * 	Update CmnSqlca 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnSqlca(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnSqlca.begin,cmnSqlca.length());
   }
   
     /**
	 * 	Update CmnSqlca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnSqlca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnSqlca.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnApplName
	 *	@return cmnApplName
	 */
   public char[] getCmnApplName() throws CFException{
     if (isCmnApplNameModified()) { 
        cmnApplName = refreshCmnApplName();
     }
   		return cmnApplName;
   }

  
	/**
	*  set variable cmnApplName
	*  Corresponding COBOL Variable is CMN-APPL-NAME
	*  @param value
	**/
   public void setCmnApplName(char[] value) {
      cmnApplName = checkCmnApplNameConstraints(value);
      serializeCmnApplName(cmnApplName);
   } 

     /**
	 * 	Update CmnApplName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnApplName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnApplName,cmnApplName.length);
   	
   }
   
   public void setCmnApplName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnApplName,cmnApplName.length);
   	
   }
   
     /**
	 * 	Update CmnApplName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnApplName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnApplName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnApplName with another Field
	 *	@param value
	 */
   public void setCmnApplName(Field source) {
       replace(source,0,source.length(),beginCmnApplName,CMN_APPL_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update CmnApplName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnApplName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnApplName,CMN_APPL_NAME_LEN);
   	
   }
   
     /**
	 * 	Update CmnApplName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnApplName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnApplName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnFiller
	 *	@return cmnFiller
	 */
   public char[] getCmnFiller() throws CFException{
     if (isCmnFillerModified()) { 
        cmnFiller = refreshCmnFiller();
     }
   		return cmnFiller;
   }

  
	/**
	*  set variable cmnFiller
	*  Corresponding COBOL Variable is CMN-FILLER
	*  @param value
	**/
   public void setCmnFiller(char[] value) {
      cmnFiller = checkCmnFillerConstraints(value);
      serializeCmnFiller(cmnFiller);
   } 

     /**
	 * 	Update CmnFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnFiller,cmnFiller.length);
   	
   }
   
   public void setCmnFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnFiller,cmnFiller.length);
   	
   }
   
     /**
	 * 	Update CmnFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnFiller with another Field
	 *	@param value
	 */
   public void setCmnFiller(Field source) {
       replace(source,0,source.length(),beginCmnFiller,CMN_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update CmnFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnFiller,CMN_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update CmnFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnFiller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnUserAbendCd
	 *	@return cmnUserAbendCd
	 */
	public short getCmnUserAbendCd() throws CFException {
        if (isCmnUserAbendCdModified()) { 
           cmnUserAbendCd = refreshCmnUserAbendCd();
        }
   		return cmnUserAbendCd;
	}
	
	/**
	 * 	Update CmnUserAbendCd with the passed value
	 *  Corresponding COBOL Variable is CMN-USER-ABEND-CD
	 *	@param number
	 */
	public void setCmnUserAbendCd(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cmnUserAbendCd = checkCmnUserAbendCdMaxLimit(number); 
		serializeCmnUserAbendCd(cmnUserAbendCd);
	}

	public void setCmnUserAbendCd(int number) {
	    number = checkCmnUserAbendCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCmnUserAbendCd((short)number);
	}
	public void setCmnUserAbendCd(long number) {
	    number = checkCmnUserAbendCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCmnUserAbendCd((short)number);
	}
	

	/**
	 *	Returns the value of cmnAbendInd
	 *	@return cmnAbendInd
	 */
   public char[] getCmnAbendInd() throws CFException{
     if (isCmnAbendIndModified()) { 
        cmnAbendInd = refreshCmnAbendInd();
     }
   		return cmnAbendInd;
   }

  
	/**
	*  set variable cmnAbendInd
	*  Corresponding COBOL Variable is CMN-ABEND-IND
	*  @param value
	**/
   public void setCmnAbendInd(char[] value) {
      cmnAbendInd = checkCmnAbendIndConstraints(value);
      serializeCmnAbendInd(cmnAbendInd);
   } 

     /**
	 * 	Update CmnAbendInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnAbendInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnAbendInd,cmnAbendInd.length);
   	
   }
   
   public void setCmnAbendInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnAbendInd,cmnAbendInd.length);
   	
   }
   
     /**
	 * 	Update CmnAbendInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnAbendInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnAbendInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnAbendInd with another Field
	 *	@param value
	 */
   public void setCmnAbendInd(Field source) {
       replace(source,0,source.length(),beginCmnAbendInd,CMN_ABEND_IND_LEN);
   	
   }  
   
     /**
	 * 	Update CmnAbendInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnAbendInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnAbendInd,CMN_ABEND_IND_LEN);
   	
   }
   
     /**
	 * 	Update CmnAbendInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnAbendInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnAbendInd+targetIndex,targetLen);
    
   }
	char[] cmnGoAheadAndAbendMyPgm88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isCmnGoAheadAndAbendMyPgm()
	 *	@return  Returns true if isCmnGoAheadAndAbendMyPgm() is "Y"
	 */
   public boolean isCmnGoAheadAndAbendMyPgm() throws CFException {
      return (  compareChars( getCmnAbendInd() , cmnGoAheadAndAbendMyPgm88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setCmnGoAheadAndAbendMyPgmTrue() {  			
    	setCmnAbendInd( cmnGoAheadAndAbendMyPgm88Value);
   	}

	
	
	
	/**
	 * 	initializes CmnPgmArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCmnErrorType(CONSTANTS.SPACE_4);
         setCmnUserid(CONSTANTS.SPACE_8);
                     setCmnErrMsgNo(0);
         setCmnErrApplId(CONSTANTS.SPACE_5);
         setCmnErrPgmName(CONSTANTS.SPACE_8);
         setCmnErrPgmParanum(CONSTANTS.SPACE_4);
         setCmnErrPgmAction(CONSTANTS.SPACE_12);
                     setCmnErrSqlcode(0);
         setCmnErrField(CONSTANTS.SPACE_18);
          cmnErrMsgArea.initialize();
     
          cmnSqlca.initialize();
     
         setCmnApplName(CONSTANTS.SPACE_38);
         setCmnFiller(CONSTANTS.SPACE_242);
         	setCmnUserAbendCd((short)0);
         setCmnAbendInd(CONSTANTS.SPACE);
   }

		public static int getCmnPgmAreaFieldLength() {
			return CMN_PGM_AREA_LENGTH;
		}

}
  
