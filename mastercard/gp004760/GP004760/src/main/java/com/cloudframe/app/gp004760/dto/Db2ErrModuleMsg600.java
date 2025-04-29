package com.cloudframe.app.gp004760.dto;

/**
*  The class Db2ErrModuleMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.gp004760.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Db2ErrModuleMsg600 extends Db2ErrModuleMsg600Serialized {
   


						private char[] db2ErrRtnCode600 = new char[18];
	
	/**
	* Constructor for Db2ErrModuleMsg600
	**/
    public Db2ErrModuleMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("RETURN CODE FROM DB200020: ").toCharArray()
             , getStartOffset() + 0
             ,27
             );
								setDb2ErrRtnCode600(fillSpace(18));
    }


 

	/**
	 *	Returns the value of db2ErrRtnCode600
	 *	@return db2ErrRtnCode600
	 */
   public char[] getDb2ErrRtnCode600() throws CFException{
     if (isDb2ErrRtnCode600Modified()) { 
        db2ErrRtnCode600 = refreshDb2ErrRtnCode600();
     }
   		return db2ErrRtnCode600;
   }

  
	/**
	*  set variable db2ErrRtnCode600
	*  Corresponding COBOL Variable is 600-DB2-ERR-RTN-CODE
	*  @param value
	**/
   public void setDb2ErrRtnCode600(char[] value) {
      db2ErrRtnCode600 = checkDb2ErrRtnCode600Constraints(value);
      serializeDb2ErrRtnCode600(db2ErrRtnCode600);
   } 

     /**
	 * 	Update Db2ErrRtnCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2ErrRtnCode600,db2ErrRtnCode600.length);
   	
   }
   
   public void setDb2ErrRtnCode600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2ErrRtnCode600,db2ErrRtnCode600.length);
   	
   }
   
     /**
	 * 	Update Db2ErrRtnCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2ErrRtnCode600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2ErrRtnCode600 with another Field
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(Field source) {
       replace(source,0,source.length(),beginDb2ErrRtnCode600,DB_2_ERR_RTN_CODE_600_LEN);
   	
   }  
   
     /**
	 * 	Update Db2ErrRtnCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2ErrRtnCode600,DB_2_ERR_RTN_CODE_600_LEN);
   	
   }
   
     /**
	 * 	Update Db2ErrRtnCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2ErrRtnCode600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDb2ErrModuleMsg600FieldLength() {
			return DB_2_ERR_MODULE_MSG_600_LENGTH;
		}

}
  
