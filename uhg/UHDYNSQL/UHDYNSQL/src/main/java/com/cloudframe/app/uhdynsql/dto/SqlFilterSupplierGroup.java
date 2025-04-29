package com.cloudframe.app.uhdynsql.dto;

/**
*  The class SqlFilterSupplierGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:15. using version 5.0.0.257
**/


import com.cloudframe.app.uhdynsql.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SqlFilterSupplierGroup extends SqlFilterSupplierGroupSerialized { 
   

						private char[] sqlFilterSupplier = Field.fillLowValue(8);
	
	/**
	* Constructor for SqlFilterSupplierGroup
	**/
    public SqlFilterSupplierGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SqlFilterSupplierGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlFilterSupplierGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sqlFilterSupplier
	 *	@return sqlFilterSupplier
	 */
   public char[] getSqlFilterSupplier() throws CFException{
     if (isSqlFilterSupplierModified()) { 
        sqlFilterSupplier = refreshSqlFilterSupplier();
     }
   		return sqlFilterSupplier;
   }

  
	/**
	*  set variable sqlFilterSupplier
	*  Corresponding COBOL Variable is WS-SQL-FILTER-SUPPLIER
	*  @param value
	**/
   public void setSqlFilterSupplier(char[] value) {
      sqlFilterSupplier = checkSqlFilterSupplierConstraints(value);
      serializeSqlFilterSupplier(sqlFilterSupplier);
   } 

     /**
	 * 	Update SqlFilterSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterSupplier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlFilterSupplier,sqlFilterSupplier.length);
   	
   }
   
   public void setSqlFilterSupplier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlFilterSupplier,sqlFilterSupplier.length);
   	
   }
   
     /**
	 * 	Update SqlFilterSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlFilterSupplier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SqlFilterSupplier with another Field
	 *	@param value
	 */
   public void setSqlFilterSupplier(Field source) {
       replace(source,0,source.length(),beginSqlFilterSupplier,SQL_FILTER_SUPPLIER_LEN);
   	
   }  
   
     /**
	 * 	Update SqlFilterSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlFilterSupplier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlFilterSupplier,SQL_FILTER_SUPPLIER_LEN);
   	
   }
   
     /**
	 * 	Update SqlFilterSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlFilterSupplier+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSqlFilterSupplierGroupFieldLength() {
			return SQL_FILTER_SUPPLIER_GROUP_LENGTH;
		}

}
  
