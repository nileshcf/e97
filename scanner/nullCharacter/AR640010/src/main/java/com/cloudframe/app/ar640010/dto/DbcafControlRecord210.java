package com.cloudframe.app.ar640010.dto;

/**
*  The class DbcafControlRecord210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DbcafControlRecord210 extends DbcafControlRecord210Serialized {
   

						private char[] dbcafControlDbid210 = new char[8];


						private char[] dbcafControlDbpkg210 = new char[16];


						private char[] dbcafControlHlqid210 = new char[4];


						private char[] dbcafControlMgosDbpkg210 = new char[18];


						private char[] dbcafControlMgosDbid210 = new char[8];

	
	/**
	* Constructor for DbcafControlRecord210
	**/
    public DbcafControlRecord210() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDbcafControlDbid210(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 8
             ,1
             );
								setDbcafControlDbpkg210(fillSpace(16));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 25
             ,1
             );
								setDbcafControlHlqid210(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 30
             ,1
             );
								setDbcafControlMgosDbpkg210(fillSpace(18));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 49
             ,1
             );
								setDbcafControlMgosDbid210(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(22)
             , getStartOffset() + 58
             ,22
             );
    }


 

	/**
	 *	Returns the value of dbcafControlDbid210
	 *	@return dbcafControlDbid210
	 */
   public char[] getDbcafControlDbid210() throws CFException{
     if (isDbcafControlDbid210Modified()) { 
        dbcafControlDbid210 = refreshDbcafControlDbid210();
     }
   		return dbcafControlDbid210;
   }

  
	/**
	*  set variable dbcafControlDbid210
	*  Corresponding COBOL Variable is 210-DBCAF-CONTROL-DBID
	*  @param value
	**/
   public void setDbcafControlDbid210(char[] value) {
      dbcafControlDbid210 = checkDbcafControlDbid210Constraints(value);
      serializeDbcafControlDbid210(dbcafControlDbid210);
   } 

     /**
	 * 	Update DbcafControlDbid210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDbcafControlDbid210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDbcafControlDbid210,dbcafControlDbid210.length);
   	
   }
   
   public void setDbcafControlDbid210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlDbid210,dbcafControlDbid210.length);
   	
   }
   
     /**
	 * 	Update DbcafControlDbid210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlDbid210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlDbid210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DbcafControlDbid210 with another Field
	 *	@param value
	 */
   public void setDbcafControlDbid210(Field source) {
       replace(source,0,source.length(),beginDbcafControlDbid210,DBCAF_CONTROL_DBID_210_LEN);
   	
   }  
   
     /**
	 * 	Update DbcafControlDbid210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDbcafControlDbid210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDbcafControlDbid210,DBCAF_CONTROL_DBID_210_LEN);
   	
   }
   
     /**
	 * 	Update DbcafControlDbid210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlDbid210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlDbid210+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dbcafControlDbpkg210
	 *	@return dbcafControlDbpkg210
	 */
   public char[] getDbcafControlDbpkg210() throws CFException{
     if (isDbcafControlDbpkg210Modified()) { 
        dbcafControlDbpkg210 = refreshDbcafControlDbpkg210();
     }
   		return dbcafControlDbpkg210;
   }

  
	/**
	*  set variable dbcafControlDbpkg210
	*  Corresponding COBOL Variable is 210-DBCAF-CONTROL-DBPKG
	*  @param value
	**/
   public void setDbcafControlDbpkg210(char[] value) {
      dbcafControlDbpkg210 = checkDbcafControlDbpkg210Constraints(value);
      serializeDbcafControlDbpkg210(dbcafControlDbpkg210);
   } 

     /**
	 * 	Update DbcafControlDbpkg210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDbcafControlDbpkg210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDbcafControlDbpkg210,dbcafControlDbpkg210.length);
   	
   }
   
   public void setDbcafControlDbpkg210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlDbpkg210,dbcafControlDbpkg210.length);
   	
   }
   
     /**
	 * 	Update DbcafControlDbpkg210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlDbpkg210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlDbpkg210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DbcafControlDbpkg210 with another Field
	 *	@param value
	 */
   public void setDbcafControlDbpkg210(Field source) {
       replace(source,0,source.length(),beginDbcafControlDbpkg210,DBCAF_CONTROL_DBPKG_210_LEN);
   	
   }  
   
     /**
	 * 	Update DbcafControlDbpkg210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDbcafControlDbpkg210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDbcafControlDbpkg210,DBCAF_CONTROL_DBPKG_210_LEN);
   	
   }
   
     /**
	 * 	Update DbcafControlDbpkg210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlDbpkg210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlDbpkg210+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dbcafControlHlqid210
	 *	@return dbcafControlHlqid210
	 */
   public char[] getDbcafControlHlqid210() throws CFException{
     if (isDbcafControlHlqid210Modified()) { 
        dbcafControlHlqid210 = refreshDbcafControlHlqid210();
     }
   		return dbcafControlHlqid210;
   }

  
	/**
	*  set variable dbcafControlHlqid210
	*  Corresponding COBOL Variable is 210-DBCAF-CONTROL-HLQID
	*  @param value
	**/
   public void setDbcafControlHlqid210(char[] value) {
      dbcafControlHlqid210 = checkDbcafControlHlqid210Constraints(value);
      serializeDbcafControlHlqid210(dbcafControlHlqid210);
   } 

     /**
	 * 	Update DbcafControlHlqid210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDbcafControlHlqid210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDbcafControlHlqid210,dbcafControlHlqid210.length);
   	
   }
   
   public void setDbcafControlHlqid210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlHlqid210,dbcafControlHlqid210.length);
   	
   }
   
     /**
	 * 	Update DbcafControlHlqid210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlHlqid210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlHlqid210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DbcafControlHlqid210 with another Field
	 *	@param value
	 */
   public void setDbcafControlHlqid210(Field source) {
       replace(source,0,source.length(),beginDbcafControlHlqid210,DBCAF_CONTROL_HLQID_210_LEN);
   	
   }  
   
     /**
	 * 	Update DbcafControlHlqid210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDbcafControlHlqid210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDbcafControlHlqid210,DBCAF_CONTROL_HLQID_210_LEN);
   	
   }
   
     /**
	 * 	Update DbcafControlHlqid210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlHlqid210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlHlqid210+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dbcafControlMgosDbpkg210
	 *	@return dbcafControlMgosDbpkg210
	 */
   public char[] getDbcafControlMgosDbpkg210() throws CFException{
     if (isDbcafControlMgosDbpkg210Modified()) { 
        dbcafControlMgosDbpkg210 = refreshDbcafControlMgosDbpkg210();
     }
   		return dbcafControlMgosDbpkg210;
   }

  
	/**
	*  set variable dbcafControlMgosDbpkg210
	*  Corresponding COBOL Variable is 210-DBCAF-CONTROL-MGOS-DBPKG
	*  @param value
	**/
   public void setDbcafControlMgosDbpkg210(char[] value) {
      dbcafControlMgosDbpkg210 = checkDbcafControlMgosDbpkg210Constraints(value);
      serializeDbcafControlMgosDbpkg210(dbcafControlMgosDbpkg210);
   } 

     /**
	 * 	Update DbcafControlMgosDbpkg210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDbcafControlMgosDbpkg210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDbcafControlMgosDbpkg210,dbcafControlMgosDbpkg210.length);
   	
   }
   
   public void setDbcafControlMgosDbpkg210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlMgosDbpkg210,dbcafControlMgosDbpkg210.length);
   	
   }
   
     /**
	 * 	Update DbcafControlMgosDbpkg210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlMgosDbpkg210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlMgosDbpkg210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DbcafControlMgosDbpkg210 with another Field
	 *	@param value
	 */
   public void setDbcafControlMgosDbpkg210(Field source) {
       replace(source,0,source.length(),beginDbcafControlMgosDbpkg210,DBCAF_CONTROL_MGOS_DBPKG_210_LEN);
   	
   }  
   
     /**
	 * 	Update DbcafControlMgosDbpkg210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDbcafControlMgosDbpkg210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDbcafControlMgosDbpkg210,DBCAF_CONTROL_MGOS_DBPKG_210_LEN);
   	
   }
   
     /**
	 * 	Update DbcafControlMgosDbpkg210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlMgosDbpkg210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlMgosDbpkg210+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dbcafControlMgosDbid210
	 *	@return dbcafControlMgosDbid210
	 */
   public char[] getDbcafControlMgosDbid210() throws CFException{
     if (isDbcafControlMgosDbid210Modified()) { 
        dbcafControlMgosDbid210 = refreshDbcafControlMgosDbid210();
     }
   		return dbcafControlMgosDbid210;
   }

  
	/**
	*  set variable dbcafControlMgosDbid210
	*  Corresponding COBOL Variable is 210-DBCAF-CONTROL-MGOS-DBID
	*  @param value
	**/
   public void setDbcafControlMgosDbid210(char[] value) {
      dbcafControlMgosDbid210 = checkDbcafControlMgosDbid210Constraints(value);
      serializeDbcafControlMgosDbid210(dbcafControlMgosDbid210);
   } 

     /**
	 * 	Update DbcafControlMgosDbid210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDbcafControlMgosDbid210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDbcafControlMgosDbid210,dbcafControlMgosDbid210.length);
   	
   }
   
   public void setDbcafControlMgosDbid210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlMgosDbid210,dbcafControlMgosDbid210.length);
   	
   }
   
     /**
	 * 	Update DbcafControlMgosDbid210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlMgosDbid210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlMgosDbid210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DbcafControlMgosDbid210 with another Field
	 *	@param value
	 */
   public void setDbcafControlMgosDbid210(Field source) {
       replace(source,0,source.length(),beginDbcafControlMgosDbid210,DBCAF_CONTROL_MGOS_DBID_210_LEN);
   	
   }  
   
     /**
	 * 	Update DbcafControlMgosDbid210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDbcafControlMgosDbid210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDbcafControlMgosDbid210,DBCAF_CONTROL_MGOS_DBID_210_LEN);
   	
   }
   
     /**
	 * 	Update DbcafControlMgosDbid210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDbcafControlMgosDbid210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbcafControlMgosDbid210+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDbcafControlRecord210FieldLength() {
			return DBCAF_CONTROL_RECORD_210_LENGTH;
		}

}
  
