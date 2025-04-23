package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC8Heading3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpC8Heading3 extends RpC8Heading3Serialized {
   






								private char[] rpC8H3Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpC8Heading3
	**/
    public RpC8Heading3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(53)
             , getStartOffset() + 1
             ,53
             );
       replaceValue( // serialize and save the value
             ("REMOTE CONSOLE ACTIVITY LOG").toCharArray()
             , getStartOffset() + 54
             ,27
             );
       replaceValue( // serialize and save the value
             fillSpace(39)
             , getStartOffset() + 81
             ,39
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 120
             ,9
             );
    }


 

	/**
	 *	Returns the value of rpC8H3Pagenumber
	 *	@return rpC8H3Pagenumber
	 */
   public char[] getRpC8H3Pagenumber() throws CFException{
     if (isRpC8H3PagenumberModified()) { 
        rpC8H3Pagenumber = refreshRpC8H3Pagenumber();
     }
   		return rpC8H3Pagenumber;
   }

  
	/**
	*  set variable rpC8H3Pagenumber
	*  Corresponding COBOL Variable is RP-C8-H3-PAGENUMBER
	*  @param value
	**/
   public void setRpC8H3Pagenumber(char[] value) {
      rpC8H3Pagenumber = checkRpC8H3PagenumberConstraints(value);
      serializeRpC8H3Pagenumber(rpC8H3Pagenumber);
   } 

     /**
	 * 	Update RpC8H3Pagenumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8H3Pagenumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8H3Pagenumber,rpC8H3Pagenumber.length);
   	
   }
   
   public void setRpC8H3Pagenumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8H3Pagenumber,rpC8H3Pagenumber.length);
   	
   }
   
     /**
	 * 	Update RpC8H3Pagenumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8H3Pagenumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8H3Pagenumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8H3Pagenumber with another Field
	 *	@param value
	 */
   public void setRpC8H3Pagenumber(Field source) {
       replace(source,0,source.length(),beginRpC8H3Pagenumber,RP_C_8_H_3_PAGENUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8H3Pagenumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8H3Pagenumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8H3Pagenumber,RP_C_8_H_3_PAGENUMBER_LEN);
   	
   }
   
     /**
	 * 	Update RpC8H3Pagenumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8H3Pagenumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8H3Pagenumber+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpC8Heading3FieldLength() {
			return RP_C_8_HEADING_3_LENGTH;
		}

}
  
