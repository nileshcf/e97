package com.cloudframe.app.db2prog2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/


import com.cloudframe.app.db2prog2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private char[] sqlcodeDisp = Field.fillLowValue(4);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
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

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
