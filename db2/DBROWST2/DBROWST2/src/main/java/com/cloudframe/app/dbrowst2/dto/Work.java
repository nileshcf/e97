package com.cloudframe.app.dbrowst2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.dbrowst2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private int maxRows;

								private short ix;

								private char[] sqlcode_Ws = Field.fillLowValue(4);

								private int dsnnrows;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMaxRows(30);
    }


 

	/**
	 *	Returns the value of maxRows
	 *	@return maxRows
	 */
	public int getMaxRows() throws CFException {
   		return maxRows;
	}
	
	/**
	 * 	Update MaxRows with the passed value
	 *  Corresponding COBOL Variable is WS-MAX-ROWS
	 *	@param number
	 */
	public void setMaxRows(int number) {
	     // Truncate if the number is beyond +/- Max range
	    maxRows = checkMaxRowsMaxLimit(number); 
	}


	public void setMaxRows(long number) {
	    number = checkMaxRowsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxRows((int)number);
	}
	
	/**
	 *	Returns the value of ix
	 *	@return ix
	 */
	public short getIx() throws CFException {
   		return ix;
	}
	
	/**
	 * 	Update Ix with the passed value
	 *  Corresponding COBOL Variable is IX
	 *	@param number
	 */
	public void setIx(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ix = checkIxMaxLimit(number); 
	}

	public void setIx(int number) {
	    number = checkIxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIx((short)number);
	}
	public void setIx(long number) {
	    number = checkIxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIx((short)number);
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
	 *	Returns the value of dsnnrows
	 *	@return dsnnrows
	 */
	public int getDsnnrows() throws CFException {
   		return dsnnrows;
	}
	
	/**
	 * 	Update Dsnnrows with the passed value
	 *  Corresponding COBOL Variable is DSNNROWS
	 *	@param number
	 */
	public void setDsnnrows(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dsnnrows = checkDsnnrowsMaxLimit(number); 
	}


	public void setDsnnrows(long number) {
	    number = checkDsnnrowsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDsnnrows((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
