package com.cloudframe.app.sqlcount.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.sqlcount.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private short shortCountComp;

								private int intCountComp;

								private long longCountComp;

								private short countComp34;

								private int countComp38;

								private long countComp311;

								private long countComp314;

								private BigDecimal countComp3104 = BigDecimal.ZERO;

								private char[] countEdit = Field.fillLowValue(14);

								private char[] countEdit2 = Field.fillLowValue(15);

								private char[] sqlcode_Ws = Field.fillLowValue(4);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of shortCountComp
	 *	@return shortCountComp
	 */
	public short getShortCountComp() throws CFException {
   		return shortCountComp;
	}
	
	/**
	 * 	Update ShortCountComp with the passed value
	 *  Corresponding COBOL Variable is WS-SHORT-COUNT-COMP
	 *	@param number
	 */
	public void setShortCountComp(short number) {
	     // Truncate if the number is beyond +/- Max range
	    shortCountComp = checkShortCountCompMaxLimit(number); 
	}

	public void setShortCountComp(int number) {
	    number = checkShortCountCompMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setShortCountComp((short)number);
	}
	public void setShortCountComp(long number) {
	    number = checkShortCountCompMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setShortCountComp((short)number);
	}
	

	/**
	 *	Returns the value of intCountComp
	 *	@return intCountComp
	 */
	public int getIntCountComp() throws CFException {
   		return intCountComp;
	}
	
	/**
	 * 	Update IntCountComp with the passed value
	 *  Corresponding COBOL Variable is WS-INT-COUNT-COMP
	 *	@param number
	 */
	public void setIntCountComp(int number) {
	     // Truncate if the number is beyond +/- Max range
	    intCountComp = checkIntCountCompMaxLimit(number); 
	}


	public void setIntCountComp(long number) {
	    number = checkIntCountCompMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIntCountComp((int)number);
	}
	
	/**
	 *	Returns the value of longCountComp
	 *	@return longCountComp
	 */
	public long getLongCountComp() throws CFException {
   		return longCountComp;
	}
	
	/**
	 * 	Update LongCountComp with the passed value
	 *  Corresponding COBOL Variable is WS-LONG-COUNT-COMP
	 *	@param number
	 */
	public void setLongCountComp(long number) {
	     // Truncate if the number is beyond +/- Max range
	    longCountComp = checkLongCountCompMaxLimit(number); 
	}


	public short getCountComp34() throws CFException {
        if (isCountComp34Modified()) { 
           countComp34 = refreshCountComp34();
        }
   		return countComp34;
	}
	
	/**
	 * 	Update CountComp34 with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT-COMP3-4
	 *	@param number
	 */
	public void setCountComp34(short number) {
			countComp34 = checkCountComp34MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCountComp34(countComp34);
	}

	public void setCountComp34(int number) {
	    number = checkCountComp34MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCountComp34((short)number);
	}
	public void setCountComp34(long number) {
	    number = checkCountComp34MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCountComp34((short)number);
	}
	

	public int getCountComp38() throws CFException {
        if (isCountComp38Modified()) { 
           countComp38 = refreshCountComp38();
        }
   		return countComp38;
	}
	
	/**
	 * 	Update CountComp38 with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT-COMP3-8
	 *	@param number
	 */
	public void setCountComp38(int number) {
			countComp38 = checkCountComp38MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCountComp38(countComp38);
	}


	public void setCountComp38(long number) {
	    number = checkCountComp38MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCountComp38((int)number);
	}
	
	public long getCountComp311() throws CFException {
        if (isCountComp311Modified()) { 
           countComp311 = refreshCountComp311();
        }
   		return countComp311;
	}
	
	/**
	 * 	Update CountComp311 with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT-COMP3-11
	 *	@param number
	 */
	public void setCountComp311(long number) {
			countComp311 = checkCountComp311MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCountComp311(countComp311);
	}


	public long getCountComp314() throws CFException {
        if (isCountComp314Modified()) { 
           countComp314 = refreshCountComp314();
        }
   		return countComp314;
	}
	
	/**
	 * 	Update CountComp314 with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT-COMP3-14
	 *	@param number
	 */
	public void setCountComp314(long number) {
			countComp314 = checkCountComp314MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCountComp314(countComp314);
	}


	public BigDecimal getCountComp3104() throws CFException {
        if (isCountComp3104Modified()) { 
           countComp3104 = refreshCountComp3104();
        }
   		return countComp3104;
	}

    public char[] getCountComp3104String() {
          return  countComp3104String();
    }
	
	/**
	 * 	Update CountComp3104 with the passed number
	 *  Corresponding COBOL Variable is WS-COUNT-COMP3-10-4
	 *	@param number
	 */
	public void setCountComp3104(BigDecimal number) {	
     countComp3104 = checkCountComp3104MaxLimit(number);
	    serializeCountComp3104(countComp3104);
   }
	/**
	 *	Returns the value of countEdit
	 *	@return countEdit
	 */
   public char[] getCountEdit() throws CFException{
     if (isCountEditModified()) { 
        countEdit = refreshCountEdit();
     }
   		return countEdit;
   }

  
	/**
	*  set variable countEdit
	*  Corresponding COBOL Variable is WS-COUNT-EDIT
	*  @param value
	**/
   public void setCountEdit(char[] value) {
      countEdit = checkCountEditConstraints(value);
      serializeCountEdit(countEdit);
   } 

     /**
	 * 	Update CountEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountEdit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCountEdit,countEdit.length);
   	
   }
   
   public void setCountEdit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCountEdit,countEdit.length);
   	
   }
   
     /**
	 * 	Update CountEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountEdit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CountEdit with another Field
	 *	@param value
	 */
   public void setCountEdit(Field source) {
       replace(source,0,source.length(),beginCountEdit,COUNT_EDIT_LEN);
   	
   }  
   
     /**
	 * 	Update CountEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountEdit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCountEdit,COUNT_EDIT_LEN);
   	
   }
   
     /**
	 * 	Update CountEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountEdit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of countEdit2
	 *	@return countEdit2
	 */
   public char[] getCountEdit2() throws CFException{
     if (isCountEdit2Modified()) { 
        countEdit2 = refreshCountEdit2();
     }
   		return countEdit2;
   }

  
	/**
	*  set variable countEdit2
	*  Corresponding COBOL Variable is WS-COUNT-EDIT2
	*  @param value
	**/
   public void setCountEdit2(char[] value) {
      countEdit2 = checkCountEdit2Constraints(value);
      serializeCountEdit2(countEdit2);
   } 

     /**
	 * 	Update CountEdit2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountEdit2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCountEdit2,countEdit2.length);
   	
   }
   
   public void setCountEdit2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCountEdit2,countEdit2.length);
   	
   }
   
     /**
	 * 	Update CountEdit2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountEdit2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountEdit2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CountEdit2 with another Field
	 *	@param value
	 */
   public void setCountEdit2(Field source) {
       replace(source,0,source.length(),beginCountEdit2,COUNT_EDIT_2_LEN);
   	
   }  
   
     /**
	 * 	Update CountEdit2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountEdit2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCountEdit2,COUNT_EDIT_2_LEN);
   	
   }
   
     /**
	 * 	Update CountEdit2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountEdit2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountEdit2+targetIndex,targetLen);
    
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

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
