package com.cloudframe.app.dlcrntof.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.dlcrntof.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private char[] sqlcode_Ws = Field.fillLowValue(4);

								private short secnt;

								private char[] dispSecnt = Field.fillLowValue(4);

								private short chkpFreq;

								private short deleteCnt;

								private int recordsLoaded400;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setChkpFreq((short)100);
								setRecordsLoaded400(0);
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
	 *	Returns the value of secnt
	 *	@return secnt
	 */
	public short getSecnt() throws CFException {
   		return secnt;
	}
	
	/**
	 * 	Update Secnt with the passed value
	 *  Corresponding COBOL Variable is WS-SECNT
	 *	@param number
	 */
	public void setSecnt(short number) {
	     // Truncate if the number is beyond +/- Max range
	    secnt = checkSecntMaxLimit(number); 
	}

	public void setSecnt(int number) {
	    number = checkSecntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSecnt((short)number);
	}
	public void setSecnt(long number) {
	    number = checkSecntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSecnt((short)number);
	}
	

	/**
	 *	Returns the value of dispSecnt
	 *	@return dispSecnt
	 */
   public char[] getDispSecnt() throws CFException{
     if (isDispSecntModified()) { 
        dispSecnt = refreshDispSecnt();
     }
   		return dispSecnt;
   }

  
	/**
	*  set variable dispSecnt
	*  Corresponding COBOL Variable is WS-DISP-SECNT
	*  @param value
	**/
   public void setDispSecnt(char[] value) {
      dispSecnt = checkDispSecntConstraints(value);
      serializeDispSecnt(dispSecnt);
   } 

     /**
	 * 	Update DispSecnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDispSecnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDispSecnt,dispSecnt.length);
   	
   }
   
   public void setDispSecnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDispSecnt,dispSecnt.length);
   	
   }
   
     /**
	 * 	Update DispSecnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDispSecnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDispSecnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DispSecnt with another Field
	 *	@param value
	 */
   public void setDispSecnt(Field source) {
       replace(source,0,source.length(),beginDispSecnt,DISP_SECNT_LEN);
   	
   }  
   
     /**
	 * 	Update DispSecnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDispSecnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDispSecnt,DISP_SECNT_LEN);
   	
   }
   
     /**
	 * 	Update DispSecnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDispSecnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDispSecnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of chkpFreq
	 *	@return chkpFreq
	 */
	public short getChkpFreq() throws CFException {
   		return chkpFreq;
	}
	
	/**
	 * 	Update ChkpFreq with the passed value
	 *  Corresponding COBOL Variable is WS-CHKP-FREQ
	 *	@param number
	 */
	public void setChkpFreq(short number) {
	     // Truncate if the number is beyond +/- Max range
	    chkpFreq = checkChkpFreqMaxLimit(number); 
	}

	public void setChkpFreq(int number) {
	    number = checkChkpFreqMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setChkpFreq((short)number);
	}
	public void setChkpFreq(long number) {
	    number = checkChkpFreqMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setChkpFreq((short)number);
	}
	

	/**
	 *	Returns the value of deleteCnt
	 *	@return deleteCnt
	 */
	public short getDeleteCnt() throws CFException {
   		return deleteCnt;
	}
	
	/**
	 * 	Update DeleteCnt with the passed value
	 *  Corresponding COBOL Variable is WS-DELETE-CNT
	 *	@param number
	 */
	public void setDeleteCnt(short number) {
	     // Truncate if the number is beyond +/- Max range
	    deleteCnt = checkDeleteCntMaxLimit(number); 
	}

	public void setDeleteCnt(int number) {
	    number = checkDeleteCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDeleteCnt((short)number);
	}
	public void setDeleteCnt(long number) {
	    number = checkDeleteCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDeleteCnt((short)number);
	}
	

	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {
   		return recordsLoaded400;
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *  Corresponding COBOL Variable is 400-RECORDS-LOADED
	 *	@param number
	 */
	public void setRecordsLoaded400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    recordsLoaded400 = checkRecordsLoaded400MaxLimit(number); 
	}


	public void setRecordsLoaded400(long number) {
	    number = checkRecordsLoaded400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecordsLoaded400((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
