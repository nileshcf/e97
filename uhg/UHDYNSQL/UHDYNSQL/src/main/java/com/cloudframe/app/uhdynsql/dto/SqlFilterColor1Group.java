package com.cloudframe.app.uhdynsql.dto;

/**
*  The class SqlFilterColor1Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:15. using version 5.0.0.257
**/


import com.cloudframe.app.uhdynsql.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SqlFilterColor1Group extends SqlFilterColor1GroupSerialized { 
   

						private char[] sqlFilterColor1 = Field.fillLowValue(6);
	
	/**
	* Constructor for SqlFilterColor1Group
	**/
    public SqlFilterColor1Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SqlFilterColor1Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlFilterColor1Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sqlFilterColor1
	 *	@return sqlFilterColor1
	 */
   public char[] getSqlFilterColor1() throws CFException{
     if (isSqlFilterColor1Modified()) { 
        sqlFilterColor1 = refreshSqlFilterColor1();
     }
   		return sqlFilterColor1;
   }

  
	/**
	*  set variable sqlFilterColor1
	*  Corresponding COBOL Variable is WS-SQL-FILTER-COLOR1
	*  @param value
	**/
   public void setSqlFilterColor1(char[] value) {
      sqlFilterColor1 = checkSqlFilterColor1Constraints(value);
      serializeSqlFilterColor1(sqlFilterColor1);
   } 

     /**
	 * 	Update SqlFilterColor1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlFilterColor1,sqlFilterColor1.length);
   	
   }
   
   public void setSqlFilterColor1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlFilterColor1,sqlFilterColor1.length);
   	
   }
   
     /**
	 * 	Update SqlFilterColor1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlFilterColor1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SqlFilterColor1 with another Field
	 *	@param value
	 */
   public void setSqlFilterColor1(Field source) {
       replace(source,0,source.length(),beginSqlFilterColor1,SQL_FILTER_COLOR_1_LEN);
   	
   }  
   
     /**
	 * 	Update SqlFilterColor1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlFilterColor1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlFilterColor1,SQL_FILTER_COLOR_1_LEN);
   	
   }
   
     /**
	 * 	Update SqlFilterColor1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlFilterColor1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSqlFilterColor1GroupFieldLength() {
			return SQL_FILTER_COLOR_1_GROUP_LENGTH;
		}

}
  
