package com.cloudframe.app.uhdynsql.dto;

/**
*  The class SqlFilterColor2Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:00. using version 5.0.0.256
**/


import com.cloudframe.app.uhdynsql.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SqlFilterColor2Group extends SqlFilterColor2GroupSerialized { 
   

						private char[] sqlFilterColor2 = Field.fillLowValue(6);
	
	/**
	* Constructor for SqlFilterColor2Group
	**/
    public SqlFilterColor2Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SqlFilterColor2Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlFilterColor2Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sqlFilterColor2
	 *	@return sqlFilterColor2
	 */
   public char[] getSqlFilterColor2() throws CFException{
     if (isSqlFilterColor2Modified()) { 
        sqlFilterColor2 = refreshSqlFilterColor2();
     }
   		return sqlFilterColor2;
   }

  
	/**
	*  set variable sqlFilterColor2
	*  Corresponding COBOL Variable is WS-SQL-FILTER-COLOR2
	*  @param value
	**/
   public void setSqlFilterColor2(char[] value) {
      sqlFilterColor2 = checkSqlFilterColor2Constraints(value);
      serializeSqlFilterColor2(sqlFilterColor2);
   } 

     /**
	 * 	Update SqlFilterColor2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlFilterColor2,sqlFilterColor2.length);
   	
   }
   
   public void setSqlFilterColor2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlFilterColor2,sqlFilterColor2.length);
   	
   }
   
     /**
	 * 	Update SqlFilterColor2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlFilterColor2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SqlFilterColor2 with another Field
	 *	@param value
	 */
   public void setSqlFilterColor2(Field source) {
       replace(source,0,source.length(),beginSqlFilterColor2,SQL_FILTER_COLOR_2_LEN);
   	
   }  
   
     /**
	 * 	Update SqlFilterColor2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlFilterColor2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlFilterColor2,SQL_FILTER_COLOR_2_LEN);
   	
   }
   
     /**
	 * 	Update SqlFilterColor2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlFilterColor2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSqlFilterColor2GroupFieldLength() {
			return SQL_FILTER_COLOR_2_GROUP_LENGTH;
		}

}
  
