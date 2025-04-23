package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC7Heading3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpC7Heading3 extends RpC7Heading3Serialized {
   






								private char[] rpC7H3Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpC7Heading3
	**/
    public RpC7Heading3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(45)
             , getStartOffset() + 1
             ,45
             );
       replaceValue( // serialize and save the value
             ("TYPE II PASS-THRU UNDELIVERED TRANSACTIONS").toCharArray()
             , getStartOffset() + 46
             ,42
             );
       replaceValue( // serialize and save the value
             fillSpace(32)
             , getStartOffset() + 88
             ,32
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 120
             ,9
             );
    }


 

	/**
	 *	Returns the value of rpC7H3Pagenumber
	 *	@return rpC7H3Pagenumber
	 */
   public char[] getRpC7H3Pagenumber() throws CFException{
     if (isRpC7H3PagenumberModified()) { 
        rpC7H3Pagenumber = refreshRpC7H3Pagenumber();
     }
   		return rpC7H3Pagenumber;
   }

  
	/**
	*  set variable rpC7H3Pagenumber
	*  Corresponding COBOL Variable is RP-C7-H3-PAGENUMBER
	*  @param value
	**/
   public void setRpC7H3Pagenumber(char[] value) {
      rpC7H3Pagenumber = checkRpC7H3PagenumberConstraints(value);
      serializeRpC7H3Pagenumber(rpC7H3Pagenumber);
   } 

     /**
	 * 	Update RpC7H3Pagenumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC7H3Pagenumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC7H3Pagenumber,rpC7H3Pagenumber.length);
   	
   }
   
   public void setRpC7H3Pagenumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7H3Pagenumber,rpC7H3Pagenumber.length);
   	
   }
   
     /**
	 * 	Update RpC7H3Pagenumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC7H3Pagenumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7H3Pagenumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC7H3Pagenumber with another Field
	 *	@param value
	 */
   public void setRpC7H3Pagenumber(Field source) {
       replace(source,0,source.length(),beginRpC7H3Pagenumber,RP_C_7_H_3_PAGENUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update RpC7H3Pagenumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC7H3Pagenumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC7H3Pagenumber,RP_C_7_H_3_PAGENUMBER_LEN);
   	
   }
   
     /**
	 * 	Update RpC7H3Pagenumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC7H3Pagenumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7H3Pagenumber+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpC7Heading3FieldLength() {
			return RP_C_7_HEADING_3_LENGTH;
		}

}
  
