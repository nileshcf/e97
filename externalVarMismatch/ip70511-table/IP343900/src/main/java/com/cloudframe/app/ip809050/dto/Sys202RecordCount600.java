package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys202RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys202RecordCount600 extends Sys202RecordCount600Serialized {
   


								private char[] sys202Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys202RecordCount600
	**/
    public Sys202RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IP809050-SYS202: EDIT #1849                ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys202Count600
	 *	@return sys202Count600
	 */
   public char[] getSys202Count600() throws CFException{
     if (isSys202Count600Modified()) { 
        sys202Count600 = refreshSys202Count600();
     }
   		return sys202Count600;
   }

  
	/**
	*  set variable sys202Count600
	*  Corresponding COBOL Variable is 600-SYS202-COUNT
	*  @param value
	**/
   public void setSys202Count600(char[] value) {
      sys202Count600 = checkSys202Count600Constraints(value);
      serializeSys202Count600(sys202Count600);
   } 

     /**
	 * 	Update Sys202Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys202Count600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys202Count600,sys202Count600.length);
   	
   }
   
   public void setSys202Count600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys202Count600,sys202Count600.length);
   	
   }
   
     /**
	 * 	Update Sys202Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys202Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202Count600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys202Count600 with another Field
	 *	@param value
	 */
   public void setSys202Count600(Field source) {
       replace(source,0,source.length(),beginSys202Count600,SYS_202_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys202Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys202Count600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys202Count600,SYS_202_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Sys202Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys202Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202Count600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys202RecordCount600FieldLength() {
			return SYS_202_RECORD_COUNT_600_LENGTH;
		}

}
  
