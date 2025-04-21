package com.cloudframe.app.asaprnt2.file.records;

/**
*  The class Reprec01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/


import com.cloudframe.app.asaprnt2.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Reprec01 extends Reprec01Serialized {
   

						private char[] reprecString = Field.fillLowValue(287);
	
	/**
	* Constructor for Reprec01
	**/
    public Reprec01() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of reprecString
	 *	@return reprecString
	 */
   public char[] getReprecString() throws CFException{
     if (isReprecStringModified()) { 
        reprecString = refreshReprecString();
     }
   		return reprecString;
   }

  
	/**
	*  set variable reprecString
	*  Corresponding COBOL Variable is REPREC-STRING
	*  @param value
	**/
   public void setReprecString(char[] value) {
      reprecString = checkReprecStringConstraints(value);
      serializeReprecString(reprecString);
   } 

     /**
	 * 	Update ReprecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReprecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReprecString,reprecString.length);
   	
   }
   
   public void setReprecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReprecString,reprecString.length);
   	
   }
   
     /**
	 * 	Update ReprecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReprecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReprecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReprecString with another Field
	 *	@param value
	 */
   public void setReprecString(Field source) {
       replace(source,0,source.length(),beginReprecString,REPREC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update ReprecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReprecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReprecString,REPREC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update ReprecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReprecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReprecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getReprec01FieldLength() {
			return REPREC_01_LENGTH;
		}

}
  
