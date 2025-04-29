package com.cloudframe.app.ip343690.dto;

/**
*  The class SqlAbendMsg900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SqlAbendMsg900 extends SqlAbendMsg900Serialized {
   


								private char[] abendSqlCode900 = Field.fillLowValue(10);


						private char[] abendSqlerrmc900 = new char[50];
	
	/**
	* Constructor for SqlAbendMsg900
	**/
    public SqlAbendMsg900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP343690-ABEND-SQL-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,25
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 35
             ,1
             );
								setAbendSqlerrmc900(fillSpace(50));
    }


 

	/**
	 *	Returns the value of abendSqlCode900
	 *	@return abendSqlCode900
	 */
   public char[] getAbendSqlCode900() throws CFException{
     if (isAbendSqlCode900Modified()) { 
        abendSqlCode900 = refreshAbendSqlCode900();
     }
   		return abendSqlCode900;
   }

  
	/**
	*  set variable abendSqlCode900
	*  Corresponding COBOL Variable is 900-ABEND-SQL-CODE
	*  @param value
	**/
   public void setAbendSqlCode900(char[] value) {
      abendSqlCode900 = checkAbendSqlCode900Constraints(value);
      serializeAbendSqlCode900(abendSqlCode900);
   } 

     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendSqlCode900,abendSqlCode900.length);
   	
   }
   
   public void setAbendSqlCode900(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSqlCode900,abendSqlCode900.length);
   	
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSqlCode900+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendSqlCode900 with another Field
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source) {
       replace(source,0,source.length(),beginAbendSqlCode900,ABEND_SQL_CODE_900_LEN);
   	
   }  
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendSqlCode900,ABEND_SQL_CODE_900_LEN);
   	
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSqlCode900+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendSqlerrmc900
	 *	@return abendSqlerrmc900
	 */
   public char[] getAbendSqlerrmc900() throws CFException{
     if (isAbendSqlerrmc900Modified()) { 
        abendSqlerrmc900 = refreshAbendSqlerrmc900();
     }
   		return abendSqlerrmc900;
   }

  
	/**
	*  set variable abendSqlerrmc900
	*  Corresponding COBOL Variable is 900-ABEND-SQLERRMC
	*  @param value
	**/
   public void setAbendSqlerrmc900(char[] value) {
      abendSqlerrmc900 = checkAbendSqlerrmc900Constraints(value);
      serializeAbendSqlerrmc900(abendSqlerrmc900);
   } 

     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendSqlerrmc900,abendSqlerrmc900.length);
   	
   }
   
   public void setAbendSqlerrmc900(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSqlerrmc900,abendSqlerrmc900.length);
   	
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSqlerrmc900+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendSqlerrmc900 with another Field
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source) {
       replace(source,0,source.length(),beginAbendSqlerrmc900,ABEND_SQLERRMC_900_LEN);
   	
   }  
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendSqlerrmc900,ABEND_SQLERRMC_900_LEN);
   	
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSqlerrmc900+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSqlAbendMsg900FieldLength() {
			return SQL_ABEND_MSG_900_LENGTH;
		}

}
  
