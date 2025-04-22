package com.cloudframe.app.db2prog1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.db2prog1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private short i;

								private char[] sqlcodeDisp = Field.fillLowValue(4);

						private char[] db2prog201 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDb2prog201(("DB2PROG2").toCharArray());
    }


 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is WS-I
	 *	@param number
	 */
	public void setI(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
	}

	public void setI(int number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	public void setI(long number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	

	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException{
     if (isSqlcodeDispModified()) { 
        sqlcodeDisp = refreshSqlcodeDisp();
     }
   		return sqlcodeDisp;
   }

  
	/**
	*  set variable sqlcodeDisp
	*  Corresponding COBOL Variable is SQLCODE-DISP
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) {
      sqlcodeDisp = checkSqlcodeDispConstraints(value);
      serializeSqlcodeDisp(sqlcodeDisp);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcodeDisp,sqlcodeDisp.length);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisp,sqlcodeDisp.length);
   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
       replace(source,0,source.length(),beginSqlcodeDisp,SQLCODE_DISP_LEN);
   	
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcodeDisp,SQLCODE_DISP_LEN);
   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2prog201
	 *	@return db2prog201
	 */
   public char[] getDb2prog201() throws CFException{
   		return db2prog201;
   }

  
	/**
	*  set variable db2prog201
	*  Corresponding COBOL Variable is WS-DB2PROG2
	*  @param value
	**/
   public void setDb2prog201(char[] value) {
       value = checkDb2prog201Constraints(value);
       arraycopy(value,0,db2prog201,0,value.length);
   } 
	public void setDb2prog201(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db2prog201,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
