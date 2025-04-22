package com.cloudframe.app.ip343690.file.records;

/**
*  The class Db2cloneRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Db2cloneRec extends Db2cloneRecSerialized {
   

						private char[] db2cloneRecString = Field.fillLowValue(80);
	
	/**
	* Constructor for Db2cloneRec
	**/
    public Db2cloneRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of db2cloneRecString
	 *	@return db2cloneRecString
	 */
   public char[] getDb2cloneRecString() throws CFException{
     if (isDb2cloneRecStringModified()) { 
        db2cloneRecString = refreshDb2cloneRecString();
     }
   		return db2cloneRecString;
   }

  
	/**
	*  set variable db2cloneRecString
	*  Corresponding COBOL Variable is DB2CLONE-REC-STRING
	*  @param value
	**/
   public void setDb2cloneRecString(char[] value) {
      db2cloneRecString = checkDb2cloneRecStringConstraints(value);
      serializeDb2cloneRecString(db2cloneRecString);
   } 

     /**
	 * 	Update Db2cloneRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2cloneRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2cloneRecString,db2cloneRecString.length);
   	
   }
   
   public void setDb2cloneRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2cloneRecString,db2cloneRecString.length);
   	
   }
   
     /**
	 * 	Update Db2cloneRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2cloneRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2cloneRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2cloneRecString with another Field
	 *	@param value
	 */
   public void setDb2cloneRecString(Field source) {
       replace(source,0,source.length(),beginDb2cloneRecString,DB_2CLONE_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Db2cloneRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2cloneRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2cloneRecString,DB_2CLONE_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Db2cloneRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2cloneRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2cloneRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDb2cloneRecFieldLength() {
			return DB_2CLONE_REC_LENGTH;
		}

}
  
