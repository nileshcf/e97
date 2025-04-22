package com.cloudframe.app.sf327010.dto;

/**
*  The class TotWriteCountMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:11. using version 5.0.0.254
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TotWriteCountMsg600 extends TotWriteCountMsg600Serialized {
   


								private char[] writeCount600 = Field.fillLowValue(14);
	
	/**
	* Constructor for TotWriteCountMsg600
	**/
    public TotWriteCountMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" SF327010- TOTAL NUMBER OF RECORDS WRITTEN         = ").toCharArray()
             , getStartOffset() + 0
             ,53
             );
    }


 

	/**
	 *	Returns the value of writeCount600
	 *	@return writeCount600
	 */
   public char[] getWriteCount600() throws CFException{
     if (isWriteCount600Modified()) { 
        writeCount600 = refreshWriteCount600();
     }
   		return writeCount600;
   }

  
	/**
	*  set variable writeCount600
	*  Corresponding COBOL Variable is 600-WRITE-COUNT
	*  @param value
	**/
   public void setWriteCount600(char[] value) {
      writeCount600 = checkWriteCount600Constraints(value);
      serializeWriteCount600(writeCount600);
   } 

     /**
	 * 	Update WriteCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWriteCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWriteCount600,writeCount600.length);
   	
   }
   
   public void setWriteCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWriteCount600,writeCount600.length);
   	
   }
   
     /**
	 * 	Update WriteCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWriteCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWriteCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WriteCount600 with another Field
	 *	@param value
	 */
   public void setWriteCount600(Field source) {
       replace(source,0,source.length(),beginWriteCount600,WRITE_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update WriteCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWriteCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWriteCount600,WRITE_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update WriteCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWriteCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWriteCount600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTotWriteCountMsg600FieldLength() {
			return TOT_WRITE_COUNT_MSG_600_LENGTH;
		}

}
  
