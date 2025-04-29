package com.cloudframe.app.db2varch.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.db2varch.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] db2varcl01 = new char[8];

								private char[] sqlcode_Ws = Field.fillLowValue(4);

						private char[] eofFlag = new char[1];

								private char[] prtBookId = Field.fillLowValue(10);

								private char[] prtIsbn = Field.fillLowValue(10);

								private int prtPublishedDateLen;

						private char[] prtPublishedDateText = Field.fillLowValue(255);

								private char[] prtPublisherId = Field.fillLowValue(10);

								private char[] prtRating = Field.fillLowValue(10);

								private int prtTitleLen;

						private char[] prtTitleText = Field.fillLowValue(255);

								private char[] prtTotalPages = Field.fillLowValue(10);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDb2varcl01(("DB2VARCL").toCharArray());
								setEofFlag(("N").toCharArray());
    }


 

	/**
	 *	Returns the value of db2varcl01
	 *	@return db2varcl01
	 */
   public char[] getDb2varcl01() throws CFException{
   		return db2varcl01;
   }

  
	/**
	*  set variable db2varcl01
	*  Corresponding COBOL Variable is WS-DB2VARCL
	*  @param value
	**/
   public void setDb2varcl01(char[] value) {
       value = checkDb2varcl01Constraints(value);
       arraycopy(value,0,db2varcl01,0,value.length);
   } 
	public void setDb2varcl01(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db2varcl01,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException{
     if (isSqlcode_WsModified()) { 
        sqlcode_Ws = refreshSqlcode_Ws();
     }
   		return sqlcode_Ws;
   }

  
	/**
	*  set variable sqlcode_Ws
	*  Corresponding COBOL Variable is WS-SQLCODE
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) {
      sqlcode_Ws = checkSqlcode_WsConstraints(value);
      serializeSqlcode_Ws(sqlcode_Ws);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
       replace(source,0,source.length(),beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
   public char[] getEofFlag() throws CFException{
   		return eofFlag;
   }

  
	/**
	*  set variable eofFlag
	*  Corresponding COBOL Variable is EOF-FLAG
	*  @param value
	**/
   public void setEofFlag(char[] value) {
       value = checkEofFlagConstraints(value);
       arraycopy(value,0,eofFlag,0,value.length);
   } 
	public void setEofFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofFlag,0,beginIndex + endIndex);
   }
	char[] endOfFile88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return (  compareChars( getEofFlag() , endOfFile88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue() {  			
    	setEofFlag( endOfFile88Value);
   	}
	/**
	 *	Returns the value of prtBookId
	 *	@return prtBookId
	 */
   public char[] getPrtBookId() throws CFException{
     if (isPrtBookIdModified()) { 
        prtBookId = refreshPrtBookId();
     }
   		return prtBookId;
   }

  
	/**
	*  set variable prtBookId
	*  Corresponding COBOL Variable is PRT-BOOK-ID
	*  @param value
	**/
   public void setPrtBookId(char[] value) {
      prtBookId = checkPrtBookIdConstraints(value);
      serializePrtBookId(prtBookId);
   } 

     /**
	 * 	Update PrtBookId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtBookId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtBookId,prtBookId.length);
   	
   }
   
   public void setPrtBookId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtBookId,prtBookId.length);
   	
   }
   
     /**
	 * 	Update PrtBookId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtBookId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtBookId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtBookId with another Field
	 *	@param value
	 */
   public void setPrtBookId(Field source) {
       replace(source,0,source.length(),beginPrtBookId,PRT_BOOK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update PrtBookId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtBookId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtBookId,PRT_BOOK_ID_LEN);
   	
   }
   
     /**
	 * 	Update PrtBookId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtBookId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtBookId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtIsbn
	 *	@return prtIsbn
	 */
   public char[] getPrtIsbn() throws CFException{
     if (isPrtIsbnModified()) { 
        prtIsbn = refreshPrtIsbn();
     }
   		return prtIsbn;
   }

  
	/**
	*  set variable prtIsbn
	*  Corresponding COBOL Variable is PRT-ISBN
	*  @param value
	**/
   public void setPrtIsbn(char[] value) {
      prtIsbn = checkPrtIsbnConstraints(value);
      serializePrtIsbn(prtIsbn);
   } 

     /**
	 * 	Update PrtIsbn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtIsbn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtIsbn,prtIsbn.length);
   	
   }
   
   public void setPrtIsbn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtIsbn,prtIsbn.length);
   	
   }
   
     /**
	 * 	Update PrtIsbn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtIsbn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtIsbn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtIsbn with another Field
	 *	@param value
	 */
   public void setPrtIsbn(Field source) {
       replace(source,0,source.length(),beginPrtIsbn,PRT_ISBN_LEN);
   	
   }  
   
     /**
	 * 	Update PrtIsbn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtIsbn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtIsbn,PRT_ISBN_LEN);
   	
   }
   
     /**
	 * 	Update PrtIsbn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtIsbn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtIsbn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtPublishedDateLen
	 *	@return prtPublishedDateLen
	 */
	public int getPrtPublishedDateLen() throws CFException {
       if (isPrtPublishedDateLenModified()) { 
           prtPublishedDateLen = refreshPrtPublishedDateLen();
        }
   		return prtPublishedDateLen;
	}
	

	
	   
	/**
	 * 	Update PrtPublishedDateLen with the passed value
	 *  Corresponding COBOL Variable is PRT-PUBLISHED-DATE-LEN
	 *	@param number
	 */
	public void setPrtPublishedDateLen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    prtPublishedDateLen = checkPrtPublishedDateLenMaxLimit(number); 
		serializePrtPublishedDateLen(prtPublishedDateLen);
	}
	

	public void setPrtPublishedDateLen(long number) {
	    number = checkPrtPublishedDateLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPrtPublishedDateLen((int)number);
	}
	
	/**
	 * 	Update PrtPublishedDateLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrtPublishedDateLen(char[] value) throws CFException {
		 prtPublishedDateLen = serializePrtPublishedDateLen(value);
	}
	/**
	 * 	Update PrtPublishedDateLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrtPublishedDateLenString(char[] value) throws CFException {
		 setPrtPublishedDateLen(value);
	}
	/**
	 *	Returns the value of prtPublishedDateText
	 *	@return prtPublishedDateText
	 */
   public char[] getPrtPublishedDateText() throws CFException{
   		return prtPublishedDateText;
   }

  
	/**
	*  set variable prtPublishedDateText
	*  Corresponding COBOL Variable is PRT-PUBLISHED-DATE-TEXT
	*  @param value
	**/
   public void setPrtPublishedDateText(char[] value) {
       value = checkPrtPublishedDateTextConstraints(value);
       arraycopy(value,0,prtPublishedDateText,0,value.length);
   } 
	public void setPrtPublishedDateText(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prtPublishedDateText,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prtPublisherId
	 *	@return prtPublisherId
	 */
   public char[] getPrtPublisherId() throws CFException{
     if (isPrtPublisherIdModified()) { 
        prtPublisherId = refreshPrtPublisherId();
     }
   		return prtPublisherId;
   }

  
	/**
	*  set variable prtPublisherId
	*  Corresponding COBOL Variable is PRT-PUBLISHER-ID
	*  @param value
	**/
   public void setPrtPublisherId(char[] value) {
      prtPublisherId = checkPrtPublisherIdConstraints(value);
      serializePrtPublisherId(prtPublisherId);
   } 

     /**
	 * 	Update PrtPublisherId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtPublisherId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtPublisherId,prtPublisherId.length);
   	
   }
   
   public void setPrtPublisherId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtPublisherId,prtPublisherId.length);
   	
   }
   
     /**
	 * 	Update PrtPublisherId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtPublisherId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtPublisherId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtPublisherId with another Field
	 *	@param value
	 */
   public void setPrtPublisherId(Field source) {
       replace(source,0,source.length(),beginPrtPublisherId,PRT_PUBLISHER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update PrtPublisherId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtPublisherId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtPublisherId,PRT_PUBLISHER_ID_LEN);
   	
   }
   
     /**
	 * 	Update PrtPublisherId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtPublisherId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtPublisherId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtRating
	 *	@return prtRating
	 */
   public char[] getPrtRating() throws CFException{
     if (isPrtRatingModified()) { 
        prtRating = refreshPrtRating();
     }
   		return prtRating;
   }

  
	/**
	*  set variable prtRating
	*  Corresponding COBOL Variable is PRT-RATING
	*  @param value
	**/
   public void setPrtRating(char[] value) {
      prtRating = checkPrtRatingConstraints(value);
      serializePrtRating(prtRating);
   } 

     /**
	 * 	Update PrtRating 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRating(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtRating,prtRating.length);
   	
   }
   
   public void setPrtRating(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRating,prtRating.length);
   	
   }
   
     /**
	 * 	Update PrtRating 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRating(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRating+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtRating with another Field
	 *	@param value
	 */
   public void setPrtRating(Field source) {
       replace(source,0,source.length(),beginPrtRating,PRT_RATING_LEN);
   	
   }  
   
     /**
	 * 	Update PrtRating 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRating(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtRating,PRT_RATING_LEN);
   	
   }
   
     /**
	 * 	Update PrtRating 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRating(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRating+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtTitleLen
	 *	@return prtTitleLen
	 */
	public int getPrtTitleLen() throws CFException {
       if (isPrtTitleLenModified()) { 
           prtTitleLen = refreshPrtTitleLen();
        }
   		return prtTitleLen;
	}
	

	
	   
	/**
	 * 	Update PrtTitleLen with the passed value
	 *  Corresponding COBOL Variable is PRT-TITLE-LEN
	 *	@param number
	 */
	public void setPrtTitleLen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    prtTitleLen = checkPrtTitleLenMaxLimit(number); 
		serializePrtTitleLen(prtTitleLen);
	}
	

	public void setPrtTitleLen(long number) {
	    number = checkPrtTitleLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPrtTitleLen((int)number);
	}
	
	/**
	 * 	Update PrtTitleLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrtTitleLen(char[] value) throws CFException {
		 prtTitleLen = serializePrtTitleLen(value);
	}
	/**
	 * 	Update PrtTitleLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrtTitleLenString(char[] value) throws CFException {
		 setPrtTitleLen(value);
	}
	/**
	 *	Returns the value of prtTitleText
	 *	@return prtTitleText
	 */
   public char[] getPrtTitleText() throws CFException{
   		return prtTitleText;
   }

  
	/**
	*  set variable prtTitleText
	*  Corresponding COBOL Variable is PRT-TITLE-TEXT
	*  @param value
	**/
   public void setPrtTitleText(char[] value) {
       value = checkPrtTitleTextConstraints(value);
       arraycopy(value,0,prtTitleText,0,value.length);
   } 
	public void setPrtTitleText(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prtTitleText,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prtTotalPages
	 *	@return prtTotalPages
	 */
   public char[] getPrtTotalPages() throws CFException{
     if (isPrtTotalPagesModified()) { 
        prtTotalPages = refreshPrtTotalPages();
     }
   		return prtTotalPages;
   }

  
	/**
	*  set variable prtTotalPages
	*  Corresponding COBOL Variable is PRT-TOTAL-PAGES
	*  @param value
	**/
   public void setPrtTotalPages(char[] value) {
      prtTotalPages = checkPrtTotalPagesConstraints(value);
      serializePrtTotalPages(prtTotalPages);
   } 

     /**
	 * 	Update PrtTotalPages 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtTotalPages(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtTotalPages,prtTotalPages.length);
   	
   }
   
   public void setPrtTotalPages(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtTotalPages,prtTotalPages.length);
   	
   }
   
     /**
	 * 	Update PrtTotalPages 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtTotalPages(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtTotalPages+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtTotalPages with another Field
	 *	@param value
	 */
   public void setPrtTotalPages(Field source) {
       replace(source,0,source.length(),beginPrtTotalPages,PRT_TOTAL_PAGES_LEN);
   	
   }  
   
     /**
	 * 	Update PrtTotalPages 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtTotalPages(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtTotalPages,PRT_TOTAL_PAGES_LEN);
   	
   }
   
     /**
	 * 	Update PrtTotalPages 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtTotalPages(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtTotalPages+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
