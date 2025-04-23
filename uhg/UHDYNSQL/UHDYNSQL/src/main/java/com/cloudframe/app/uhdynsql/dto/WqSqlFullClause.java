package com.cloudframe.app.uhdynsql.dto;

/**
*  The class WqSqlFullClause is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:20. using version 5.0.0.254
**/


import com.cloudframe.app.uhdynsql.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WqSqlFullClause extends WqSqlFullClauseSerialized {
   

								private short wqSqlFullClauseLen;

						private char[] wqSqlFullClauseText = Field.fillLowValue(7000);
	
	/**
	* Constructor for WqSqlFullClause
	**/
    public WqSqlFullClause() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wqSqlFullClauseLen
	 *	@return wqSqlFullClauseLen
	 */
	public short getWqSqlFullClauseLen() throws CFException {
        if (isWqSqlFullClauseLenModified()) { 
           wqSqlFullClauseLen = refreshWqSqlFullClauseLen();
        }
   		return wqSqlFullClauseLen;
	}
	
	/**
	 * 	Update WqSqlFullClauseLen with the passed value
	 *  Corresponding COBOL Variable is WQ-SQL-FULL-CLAUSE-LEN
	 *	@param number
	 */
	public void setWqSqlFullClauseLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    wqSqlFullClauseLen = checkWqSqlFullClauseLenMaxLimit(number); 
		serializeWqSqlFullClauseLen(wqSqlFullClauseLen);
	}

	public void setWqSqlFullClauseLen(int number) {
	    number = checkWqSqlFullClauseLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWqSqlFullClauseLen((short)number);
	}
	public void setWqSqlFullClauseLen(long number) {
	    number = checkWqSqlFullClauseLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWqSqlFullClauseLen((short)number);
	}
	

	/**
	 *	Returns the value of wqSqlFullClauseText
	 *	@return wqSqlFullClauseText
	 */
   public char[] getWqSqlFullClauseText() throws CFException{
     if (isWqSqlFullClauseTextModified()) { 
        wqSqlFullClauseText = refreshWqSqlFullClauseText();
     }
   		return wqSqlFullClauseText;
   }

  
	/**
	*  set variable wqSqlFullClauseText
	*  Corresponding COBOL Variable is WQ-SQL-FULL-CLAUSE-TEXT
	*  @param value
	**/
   public void setWqSqlFullClauseText(char[] value) {
      wqSqlFullClauseText = checkWqSqlFullClauseTextConstraints(value);
      serializeWqSqlFullClauseText(wqSqlFullClauseText);
   } 

     /**
	 * 	Update WqSqlFullClauseText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWqSqlFullClauseText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWqSqlFullClauseText,wqSqlFullClauseText.length);
   	
   }
   
   public void setWqSqlFullClauseText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWqSqlFullClauseText,wqSqlFullClauseText.length);
   	
   }
   
     /**
	 * 	Update WqSqlFullClauseText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWqSqlFullClauseText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWqSqlFullClauseText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WqSqlFullClauseText with another Field
	 *	@param value
	 */
   public void setWqSqlFullClauseText(Field source) {
       replace(source,0,source.length(),beginWqSqlFullClauseText,WQ_SQL_FULL_CLAUSE_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update WqSqlFullClauseText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWqSqlFullClauseText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWqSqlFullClauseText,WQ_SQL_FULL_CLAUSE_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update WqSqlFullClauseText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWqSqlFullClauseText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWqSqlFullClauseText+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WqSqlFullClause
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setWqSqlFullClauseLen((short)0);
         setWqSqlFullClauseText(CONSTANTS.SPACE_7000);
   }

		public static int getWqSqlFullClauseFieldLength() {
			return WQ_SQL_FULL_CLAUSE_LENGTH;
		}

}
  
