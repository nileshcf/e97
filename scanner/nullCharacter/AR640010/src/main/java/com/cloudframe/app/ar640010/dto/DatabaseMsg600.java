package com.cloudframe.app.ar640010.dto;

/**
*  The class DatabaseMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DatabaseMsg600 extends DatabaseMsg600Serialized {
   


						private char[] databaseDbid600 = new char[8];


						private char[] databaseDbpkg600 = new char[18];
	
	/**
	* Constructor for DatabaseMsg600
	**/
    public DatabaseMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0012-DATABASE ID: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setDatabaseDbid600(fillSpace(8));
       replaceValue( // serialize and save the value
             (" PKG: ").toCharArray()
             , getStartOffset() + 26
             ,6
             );
								setDatabaseDbpkg600(fillSpace(18));
    }


 

	/**
	 *	Returns the value of databaseDbid600
	 *	@return databaseDbid600
	 */
   public char[] getDatabaseDbid600() throws CFException{
     if (isDatabaseDbid600Modified()) { 
        databaseDbid600 = refreshDatabaseDbid600();
     }
   		return databaseDbid600;
   }

  
	/**
	*  set variable databaseDbid600
	*  Corresponding COBOL Variable is 600-DATABASE-DBID
	*  @param value
	**/
   public void setDatabaseDbid600(char[] value) {
      databaseDbid600 = checkDatabaseDbid600Constraints(value);
      serializeDatabaseDbid600(databaseDbid600);
   } 

     /**
	 * 	Update DatabaseDbid600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDatabaseDbid600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDatabaseDbid600,databaseDbid600.length);
   	
   }
   
   public void setDatabaseDbid600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDatabaseDbid600,databaseDbid600.length);
   	
   }
   
     /**
	 * 	Update DatabaseDbid600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDatabaseDbid600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDatabaseDbid600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DatabaseDbid600 with another Field
	 *	@param value
	 */
   public void setDatabaseDbid600(Field source) {
       replace(source,0,source.length(),beginDatabaseDbid600,DATABASE_DBID_600_LEN);
   	
   }  
   
     /**
	 * 	Update DatabaseDbid600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDatabaseDbid600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDatabaseDbid600,DATABASE_DBID_600_LEN);
   	
   }
   
     /**
	 * 	Update DatabaseDbid600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDatabaseDbid600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDatabaseDbid600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of databaseDbpkg600
	 *	@return databaseDbpkg600
	 */
   public char[] getDatabaseDbpkg600() throws CFException{
     if (isDatabaseDbpkg600Modified()) { 
        databaseDbpkg600 = refreshDatabaseDbpkg600();
     }
   		return databaseDbpkg600;
   }

  
	/**
	*  set variable databaseDbpkg600
	*  Corresponding COBOL Variable is 600-DATABASE-DBPKG
	*  @param value
	**/
   public void setDatabaseDbpkg600(char[] value) {
      databaseDbpkg600 = checkDatabaseDbpkg600Constraints(value);
      serializeDatabaseDbpkg600(databaseDbpkg600);
   } 

     /**
	 * 	Update DatabaseDbpkg600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDatabaseDbpkg600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDatabaseDbpkg600,databaseDbpkg600.length);
   	
   }
   
   public void setDatabaseDbpkg600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDatabaseDbpkg600,databaseDbpkg600.length);
   	
   }
   
     /**
	 * 	Update DatabaseDbpkg600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDatabaseDbpkg600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDatabaseDbpkg600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DatabaseDbpkg600 with another Field
	 *	@param value
	 */
   public void setDatabaseDbpkg600(Field source) {
       replace(source,0,source.length(),beginDatabaseDbpkg600,DATABASE_DBPKG_600_LEN);
   	
   }  
   
     /**
	 * 	Update DatabaseDbpkg600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDatabaseDbpkg600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDatabaseDbpkg600,DATABASE_DBPKG_600_LEN);
   	
   }
   
     /**
	 * 	Update DatabaseDbpkg600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDatabaseDbpkg600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDatabaseDbpkg600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDatabaseMsg600FieldLength() {
			return DATABASE_MSG_600_LENGTH;
		}

}
  
