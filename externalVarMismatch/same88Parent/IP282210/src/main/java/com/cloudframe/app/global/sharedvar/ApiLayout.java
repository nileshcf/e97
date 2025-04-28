package com.cloudframe.app.global.sharedvar;

/**
*  The class ApiLayout is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:34. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class ApiLayout extends ApiLayoutSerialized { 
   

						private char[] actnCd100 = Field.fillLowValue(1);

								private short queryNo;

								private long noOfRows;

						private char[] apiStatus100 = Field.fillLowValue(1);

						private char[] apiSwitch100 = Field.fillLowValue(1);

						private char[] abendSwitch100 = Field.fillLowValue(1);

						private char[] isItConnectedToDb2100 = Field.fillLowValue(1);

						private char[] isItNull100 = Field.fillLowValue(1);
	
	/**
	* Constructor for ApiLayout
	**/
    public ApiLayout() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of actnCd100
	 *	@return actnCd100
	 */
   public char[] getActnCd100() throws CFException{
     if (isActnCd100Modified()) { 
        actnCd100 = refreshActnCd100();
     }
   		return actnCd100;
   }

  
	/**
	*  set variable actnCd100
	*  Corresponding COBOL Variable is 100-ACTN-CD
	*  @param value
	**/
   public void setActnCd100(char[] value) {
      actnCd100 = checkActnCd100Constraints(value);
      serializeActnCd100(actnCd100);
   } 

     /**
	 * 	Update ActnCd100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setActnCd100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginActnCd100,actnCd100.length);
   	
   }
   
   public void setActnCd100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginActnCd100,actnCd100.length);
   	
   }
   
     /**
	 * 	Update ActnCd100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setActnCd100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginActnCd100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ActnCd100 with another Field
	 *	@param value
	 */
   public void setActnCd100(Field source) {
       replace(source,0,source.length(),beginActnCd100,ACTN_CD_100_LEN);
   	
   }  
   
     /**
	 * 	Update ActnCd100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setActnCd100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginActnCd100,ACTN_CD_100_LEN);
   	
   }
   
     /**
	 * 	Update ActnCd100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setActnCd100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginActnCd100+targetIndex,targetLen);
    
   }
	char[] selectRtn8810088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSelectRtn88100()
	 *	@return  Returns true if isSelectRtn88100() is "S"
	 */
   public boolean isSelectRtn88100() throws CFException {
      return (  compareChars( getActnCd100() , selectRtn8810088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSelectRtn88100True() {  			
    	setActnCd100( selectRtn8810088Value);
   	}
	char[] updateRtn8810088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isUpdateRtn88100()
	 *	@return  Returns true if isUpdateRtn88100() is "U"
	 */
   public boolean isUpdateRtn88100() throws CFException {
      return (  compareChars( getActnCd100() , updateRtn8810088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setUpdateRtn88100True() {  			
    	setActnCd100( updateRtn8810088Value);
   	}
	char[] insertRtn8810088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isInsertRtn88100()
	 *	@return  Returns true if isInsertRtn88100() is "I"
	 */
   public boolean isInsertRtn88100() throws CFException {
      return (  compareChars( getActnCd100() , insertRtn8810088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setInsertRtn88100True() {  			
    	setActnCd100( insertRtn8810088Value);
   	}
	char[] deleteRtn8810088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isDeleteRtn88100()
	 *	@return  Returns true if isDeleteRtn88100() is "D"
	 */
   public boolean isDeleteRtn88100() throws CFException {
      return (  compareChars( getActnCd100() , deleteRtn8810088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setDeleteRtn88100True() {  			
    	setActnCd100( deleteRtn8810088Value);
   	}
	char[] commitRtn8810088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isCommitRtn88100()
	 *	@return  Returns true if isCommitRtn88100() is "C"
	 */
   public boolean isCommitRtn88100() throws CFException {
      return (  compareChars( getActnCd100() , commitRtn8810088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCommitRtn88100True() {  			
    	setActnCd100( commitRtn8810088Value);
   	}
	char[] rollbckRtn8810088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isRollbckRtn88100()
	 *	@return  Returns true if isRollbckRtn88100() is "R"
	 */
   public boolean isRollbckRtn88100() throws CFException {
      return (  compareChars( getActnCd100() , rollbckRtn8810088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setRollbckRtn88100True() {  			
    	setActnCd100( rollbckRtn8810088Value);
   	}
	/**
	 *	Returns the value of queryNo
	 *	@return queryNo
	 */
	public short getQueryNo() throws CFException {
        if (isQueryNoModified()) { 
           queryNo = refreshQueryNo();
        }
   		return queryNo;
	}
	
	/**
	 * 	Update QueryNo with the passed value
	 *  Corresponding COBOL Variable is QUERY-NO
	 *	@param number
	 */
	public void setQueryNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    queryNo = checkQueryNoMaxLimit(number); 
		serializeQueryNo(queryNo);
	}

	public void setQueryNo(int number) {
	    number = checkQueryNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setQueryNo((short)number);
	}
	public void setQueryNo(long number) {
	    number = checkQueryNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setQueryNo((short)number);
	}
	

	/**
	 *	Returns the value of noOfRows
	 *	@return noOfRows
	 */
	public long getNoOfRows() throws CFException {
       if (isNoOfRowsModified()) { 
           noOfRows = refreshNoOfRows();
        }
   		return noOfRows;
	}
	

	
	   
	/**
	 * 	Update NoOfRows with the passed value
	 *  Corresponding COBOL Variable is NO-OF-ROWS
	 *	@param number
	 */
	public void setNoOfRows(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    noOfRows = checkNoOfRowsMaxLimit(number); 
		serializeNoOfRows(noOfRows);
	}
	

	/**
	 * 	Update NoOfRows with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoOfRows(char[] value) throws CFException {
		 noOfRows = serializeNoOfRows(value);
	}
	/**
	 * 	Update NoOfRows with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoOfRowsString(char[] value) throws CFException {
		 setNoOfRows(value);
	}
	/**
	 *	Returns the value of apiStatus100
	 *	@return apiStatus100
	 */
   public char[] getApiStatus100() throws CFException{
     if (isApiStatus100Modified()) { 
        apiStatus100 = refreshApiStatus100();
     }
   		return apiStatus100;
   }

  
	/**
	*  set variable apiStatus100
	*  Corresponding COBOL Variable is 100-API-STATUS
	*  @param value
	**/
   public void setApiStatus100(char[] value) {
      apiStatus100 = checkApiStatus100Constraints(value);
      serializeApiStatus100(apiStatus100);
   } 

     /**
	 * 	Update ApiStatus100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApiStatus100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApiStatus100,apiStatus100.length);
   	
   }
   
   public void setApiStatus100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApiStatus100,apiStatus100.length);
   	
   }
   
     /**
	 * 	Update ApiStatus100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApiStatus100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApiStatus100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApiStatus100 with another Field
	 *	@param value
	 */
   public void setApiStatus100(Field source) {
       replace(source,0,source.length(),beginApiStatus100,API_STATUS_100_LEN);
   	
   }  
   
     /**
	 * 	Update ApiStatus100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApiStatus100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApiStatus100,API_STATUS_100_LEN);
   	
   }
   
     /**
	 * 	Update ApiStatus100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApiStatus100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApiStatus100+targetIndex,targetLen);
    
   }
	char[] rowsFound8810088Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isRowsFound88100()
	 *	@return  Returns true if isRowsFound88100() is "G"
	 */
   public boolean isRowsFound88100() throws CFException {
      return (  compareChars( getApiStatus100() , rowsFound8810088Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setRowsFound88100True() {  			
    	setApiStatus100( rowsFound8810088Value);
   	}
	char[] rowsNotFnd8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRowsNotFnd88100()
	 *	@return  Returns true if isRowsNotFnd88100() is "N"
	 */
   public boolean isRowsNotFnd88100() throws CFException {
      return (  compareChars( getApiStatus100() , rowsNotFnd8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRowsNotFnd88100True() {  			
    	setApiStatus100( rowsNotFnd8810088Value);
   	}
	char[] negativeCode8810088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isNegativeCode88100()
	 *	@return  Returns true if isNegativeCode88100() is "B"
	 */
   public boolean isNegativeCode88100() throws CFException {
      return (  compareChars( getApiStatus100() , negativeCode8810088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setNegativeCode88100True() {  			
    	setApiStatus100( negativeCode8810088Value);
   	}
	char[] duplicateCode8810088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isDuplicateCode88100()
	 *	@return  Returns true if isDuplicateCode88100() is "D"
	 */
   public boolean isDuplicateCode88100() throws CFException {
      return (  compareChars( getApiStatus100() , duplicateCode8810088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setDuplicateCode88100True() {  			
    	setApiStatus100( duplicateCode8810088Value);
   	}
	/**
	 *	Returns the value of apiSwitch100
	 *	@return apiSwitch100
	 */
   public char[] getApiSwitch100() throws CFException{
     if (isApiSwitch100Modified()) { 
        apiSwitch100 = refreshApiSwitch100();
     }
   		return apiSwitch100;
   }

  
	/**
	*  set variable apiSwitch100
	*  Corresponding COBOL Variable is 100-API-SWITCH
	*  @param value
	**/
   public void setApiSwitch100(char[] value) {
      apiSwitch100 = checkApiSwitch100Constraints(value);
      serializeApiSwitch100(apiSwitch100);
   } 

     /**
	 * 	Update ApiSwitch100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApiSwitch100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApiSwitch100,apiSwitch100.length);
   	
   }
   
   public void setApiSwitch100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApiSwitch100,apiSwitch100.length);
   	
   }
   
     /**
	 * 	Update ApiSwitch100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApiSwitch100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApiSwitch100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApiSwitch100 with another Field
	 *	@param value
	 */
   public void setApiSwitch100(Field source) {
       replace(source,0,source.length(),beginApiSwitch100,API_SWITCH_100_LEN);
   	
   }  
   
     /**
	 * 	Update ApiSwitch100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApiSwitch100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApiSwitch100,API_SWITCH_100_LEN);
   	
   }
   
     /**
	 * 	Update ApiSwitch100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApiSwitch100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApiSwitch100+targetIndex,targetLen);
    
   }
	char[] openFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isOpenFirstTime88100()
	 *	@return  Returns true if isOpenFirstTime88100() is "Y"
	 */
   public boolean isOpenFirstTime88100() throws CFException {
      return (  compareChars( getApiSwitch100() , openFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setOpenFirstTime88100True() {  			
    	setApiSwitch100( openFirstTime8810088Value);
   	}
	char[] notOpenFirstTime8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotOpenFirstTime88100()
	 *	@return  Returns true if isNotOpenFirstTime88100() is "N"
	 */
   public boolean isNotOpenFirstTime88100() throws CFException {
      return (  compareChars( getApiSwitch100() , notOpenFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotOpenFirstTime88100True() {  			
    	setApiSwitch100( notOpenFirstTime8810088Value);
   	}
	/**
	 *	Returns the value of abendSwitch100
	 *	@return abendSwitch100
	 */
   public char[] getAbendSwitch100() throws CFException{
     if (isAbendSwitch100Modified()) { 
        abendSwitch100 = refreshAbendSwitch100();
     }
   		return abendSwitch100;
   }

  
	/**
	*  set variable abendSwitch100
	*  Corresponding COBOL Variable is 100-ABEND-SWITCH
	*  @param value
	**/
   public void setAbendSwitch100(char[] value) {
      abendSwitch100 = checkAbendSwitch100Constraints(value);
      serializeAbendSwitch100(abendSwitch100);
   } 

     /**
	 * 	Update AbendSwitch100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSwitch100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendSwitch100,abendSwitch100.length);
   	
   }
   
   public void setAbendSwitch100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSwitch100,abendSwitch100.length);
   	
   }
   
     /**
	 * 	Update AbendSwitch100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSwitch100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSwitch100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendSwitch100 with another Field
	 *	@param value
	 */
   public void setAbendSwitch100(Field source) {
       replace(source,0,source.length(),beginAbendSwitch100,ABEND_SWITCH_100_LEN);
   	
   }  
   
     /**
	 * 	Update AbendSwitch100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSwitch100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendSwitch100,ABEND_SWITCH_100_LEN);
   	
   }
   
     /**
	 * 	Update AbendSwitch100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSwitch100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSwitch100+targetIndex,targetLen);
    
   }
	char[] itIsAbend8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsAbend88100()
	 *	@return  Returns true if isItIsAbend88100() is "Y"
	 */
   public boolean isItIsAbend88100() throws CFException {
      return (  compareChars( getAbendSwitch100() , itIsAbend8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsAbend88100True() {  			
    	setAbendSwitch100( itIsAbend8810088Value);
   	}
	char[] itIsNotAbend8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotAbend88100()
	 *	@return  Returns true if isItIsNotAbend88100() is "N"
	 */
   public boolean isItIsNotAbend88100() throws CFException {
      return (  compareChars( getAbendSwitch100() , itIsNotAbend8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotAbend88100True() {  			
    	setAbendSwitch100( itIsNotAbend8810088Value);
   	}
	/**
	 *	Returns the value of isItConnectedToDb2100
	 *	@return isItConnectedToDb2100
	 */
   public char[] getIsItConnectedToDb2100() throws CFException{
     if (isIsItConnectedToDb2100Modified()) { 
        isItConnectedToDb2100 = refreshIsItConnectedToDb2100();
     }
   		return isItConnectedToDb2100;
   }

  
	/**
	*  set variable isItConnectedToDb2100
	*  Corresponding COBOL Variable is 100-IS-IT-CONNECTED-TO-DB2
	*  @param value
	**/
   public void setIsItConnectedToDb2100(char[] value) {
      isItConnectedToDb2100 = checkIsItConnectedToDb2100Constraints(value);
      serializeIsItConnectedToDb2100(isItConnectedToDb2100);
   } 

     /**
	 * 	Update IsItConnectedToDb2100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsItConnectedToDb2100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsItConnectedToDb2100,isItConnectedToDb2100.length);
   	
   }
   
   public void setIsItConnectedToDb2100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsItConnectedToDb2100,isItConnectedToDb2100.length);
   	
   }
   
     /**
	 * 	Update IsItConnectedToDb2100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsItConnectedToDb2100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsItConnectedToDb2100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IsItConnectedToDb2100 with another Field
	 *	@param value
	 */
   public void setIsItConnectedToDb2100(Field source) {
       replace(source,0,source.length(),beginIsItConnectedToDb2100,IS_IT_CONNECTED_TO_DB_2100_LEN);
   	
   }  
   
     /**
	 * 	Update IsItConnectedToDb2100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsItConnectedToDb2100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsItConnectedToDb2100,IS_IT_CONNECTED_TO_DB_2100_LEN);
   	
   }
   
     /**
	 * 	Update IsItConnectedToDb2100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsItConnectedToDb2100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsItConnectedToDb2100+targetIndex,targetLen);
    
   }
	char[] itIsConnectedToDb28810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsConnectedToDb288100()
	 *	@return  Returns true if isItIsConnectedToDb288100() is "Y"
	 */
   public boolean isItIsConnectedToDb288100() throws CFException {
      return (  compareChars( getIsItConnectedToDb2100() , itIsConnectedToDb28810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsConnectedToDb288100True() {  			
    	setIsItConnectedToDb2100( itIsConnectedToDb28810088Value);
   	}
	char[] notConnectedToDb28810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotConnectedToDb288100()
	 *	@return  Returns true if isNotConnectedToDb288100() is "N"
	 */
   public boolean isNotConnectedToDb288100() throws CFException {
      return (  compareChars( getIsItConnectedToDb2100() , notConnectedToDb28810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotConnectedToDb288100True() {  			
    	setIsItConnectedToDb2100( notConnectedToDb28810088Value);
   	}
	/**
	 *	Returns the value of isItNull100
	 *	@return isItNull100
	 */
   public char[] getIsItNull100() throws CFException{
     if (isIsItNull100Modified()) { 
        isItNull100 = refreshIsItNull100();
     }
   		return isItNull100;
   }

  
	/**
	*  set variable isItNull100
	*  Corresponding COBOL Variable is 100-IS-IT-NULL
	*  @param value
	**/
   public void setIsItNull100(char[] value) {
      isItNull100 = checkIsItNull100Constraints(value);
      serializeIsItNull100(isItNull100);
   } 

     /**
	 * 	Update IsItNull100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsItNull100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsItNull100,isItNull100.length);
   	
   }
   
   public void setIsItNull100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsItNull100,isItNull100.length);
   	
   }
   
     /**
	 * 	Update IsItNull100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsItNull100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsItNull100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IsItNull100 with another Field
	 *	@param value
	 */
   public void setIsItNull100(Field source) {
       replace(source,0,source.length(),beginIsItNull100,IS_IT_NULL_100_LEN);
   	
   }  
   
     /**
	 * 	Update IsItNull100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsItNull100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsItNull100,IS_IT_NULL_100_LEN);
   	
   }
   
     /**
	 * 	Update IsItNull100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsItNull100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsItNull100+targetIndex,targetLen);
    
   }
	char[] itIsNull8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsNull88100()
	 *	@return  Returns true if isItIsNull88100() is "Y"
	 */
   public boolean isItIsNull88100() throws CFException {
      return (  compareChars( getIsItNull100() , itIsNull8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsNull88100True() {  			
    	setIsItNull100( itIsNull8810088Value);
   	}
	char[] itIsNotNull8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotNull88100()
	 *	@return  Returns true if isItIsNotNull88100() is "N"
	 */
   public boolean isItIsNotNull88100() throws CFException {
      return (  compareChars( getIsItNull100() , itIsNotNull8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotNull88100True() {  			
    	setIsItNull100( itIsNotNull8810088Value);
   	}

	
	
	
	/**
	 * 	initializes ApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setActnCd100(CONSTANTS.SPACE);
         	setQueryNo((short)0);
                     setNoOfRows(0);
         setApiStatus100(CONSTANTS.SPACE);
         setApiSwitch100(CONSTANTS.SPACE);
         setAbendSwitch100(CONSTANTS.SPACE);
         setIsItConnectedToDb2100(CONSTANTS.SPACE);
         setIsItNull100(CONSTANTS.SPACE);
   }

		public static int getApiLayoutFieldLength() {
			return API_LAYOUT_LENGTH;
		}

}
  
