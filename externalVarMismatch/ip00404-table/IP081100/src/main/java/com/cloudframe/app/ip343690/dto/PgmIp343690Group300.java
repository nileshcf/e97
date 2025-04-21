package com.cloudframe.app.ip343690.dto;

/**
*  The class PgmIp343690Group300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PgmIp343690Group300 extends PgmIp343690Group300Serialized { 
   

						private char[] pgmIp343690300 = new char[8];
	
	/**
	* Constructor for PgmIp343690Group300
	**/
    public PgmIp343690Group300() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PgmIp343690Group300. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmIp343690Group300(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPgmIp343690300(("IP343690").toCharArray());
    } 

	/**
	 *	Returns the value of pgmIp343690300
	 *	@return pgmIp343690300
	 */
   public char[] getPgmIp343690300() throws CFException{
     if (isPgmIp343690300Modified()) { 
        pgmIp343690300 = refreshPgmIp343690300();
     }
   		return pgmIp343690300;
   }

  
	/**
	*  set variable pgmIp343690300
	*  Corresponding COBOL Variable is 300-PGM-IP343690
	*  @param value
	**/
   public void setPgmIp343690300(char[] value) {
      pgmIp343690300 = checkPgmIp343690300Constraints(value);
      serializePgmIp343690300(pgmIp343690300);
   } 

     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmIp343690300,pgmIp343690300.length);
   	
   }
   
   public void setPgmIp343690300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp343690300,pgmIp343690300.length);
   	
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp343690300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmIp343690300 with another Field
	 *	@param value
	 */
   public void setPgmIp343690300(Field source) {
       replace(source,0,source.length(),beginPgmIp343690300,PGM_IP_343690300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmIp343690300,PGM_IP_343690300_LEN);
   	
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp343690300+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPgmIp343690Group300FieldLength() {
			return PGM_IP_343690_GROUP_300_LENGTH;
		}

}
  
