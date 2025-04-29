package com.cloudframe.app.sf327010.file.records;

/**
*  The class Group1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.sf327010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Group1 extends Group1Serialized {
   

						private char[] fillerString = Field.fillLowValue(75);
	
	/**
	* Constructor for Group1
	**/
    public Group1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fillerString
	 *	@return fillerString
	 */
   public char[] getFillerString() throws CFException{
     if (isFillerStringModified()) { 
        fillerString = refreshFillerString();
     }
   		return fillerString;
   }

  
	/**
	*  set variable fillerString
	*  Corresponding COBOL Variable is FILLER-STRING
	*  @param value
	**/
   public void setFillerString(char[] value) {
      fillerString = checkFillerStringConstraints(value);
      serializeFillerString(fillerString);
   } 

     /**
	 * 	Update FillerString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerString,fillerString.length);
   	
   }
   
   public void setFillerString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerString,fillerString.length);
   	
   }
   
     /**
	 * 	Update FillerString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerString with another Field
	 *	@param value
	 */
   public void setFillerString(Field source) {
       replace(source,0,source.length(),beginFillerString,FILLER_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FillerString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerString,FILLER_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FillerString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getGroup1FieldLength() {
			return GROUP_1_LENGTH;
		}

}
  
