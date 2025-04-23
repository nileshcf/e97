package com.cloudframe.app.ip662010.dto;

/**
*  The class CharMapColumns600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CharMapColumns600 extends CharMapColumns600Serialized {
   

						private char[] ipmErrorColumns600 = new char[100];

	
	/**
	* Constructor for CharMapColumns600
	**/
    public CharMapColumns600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIpmErrorColumns600("----+----1----+----2----+----3----+----4----+----5----+----6----+----7----+----8----+----9----+----0".toCharArray());
       replaceValue( // serialize and save the value
             ("----+----1----+----2----+---").toCharArray()
             , getStartOffset() + 100
             ,28
             );
    }


 

	/**
	 *	Returns the value of ipmErrorColumns600
	 *	@return ipmErrorColumns600
	 */
   public char[] getIpmErrorColumns600() throws CFException{
     if (isIpmErrorColumns600Modified()) { 
        ipmErrorColumns600 = refreshIpmErrorColumns600();
     }
   		return ipmErrorColumns600;
   }

  
	/**
	*  set variable ipmErrorColumns600
	*  Corresponding COBOL Variable is 600-IPM-ERROR-COLUMNS
	*  @param value
	**/
   public void setIpmErrorColumns600(char[] value) {
      ipmErrorColumns600 = checkIpmErrorColumns600Constraints(value);
      serializeIpmErrorColumns600(ipmErrorColumns600);
   } 

     /**
	 * 	Update IpmErrorColumns600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorColumns600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIpmErrorColumns600,ipmErrorColumns600.length);
   	
   }
   
   public void setIpmErrorColumns600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorColumns600,ipmErrorColumns600.length);
   	
   }
   
     /**
	 * 	Update IpmErrorColumns600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorColumns600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorColumns600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IpmErrorColumns600 with another Field
	 *	@param value
	 */
   public void setIpmErrorColumns600(Field source) {
       replace(source,0,source.length(),beginIpmErrorColumns600,IPM_ERROR_COLUMNS_600_LEN);
   	
   }  
   
     /**
	 * 	Update IpmErrorColumns600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorColumns600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIpmErrorColumns600,IPM_ERROR_COLUMNS_600_LEN);
   	
   }
   
     /**
	 * 	Update IpmErrorColumns600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorColumns600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorColumns600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCharMapColumns600FieldLength() {
			return CHAR_MAP_COLUMNS_600_LENGTH;
		}

}
  
