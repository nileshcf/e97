package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC9Heading3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpC9Heading3 extends RpC9Heading3Serialized {
   






								private char[] rpC9H3Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpC9Heading3
	**/
    public RpC9Heading3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(58)
             , getStartOffset() + 1
             ,58
             );
       replaceValue( // serialize and save the value
             ("X9.2 ACTIVITY LOG").toCharArray()
             , getStartOffset() + 59
             ,17
             );
       replaceValue( // serialize and save the value
             fillSpace(44)
             , getStartOffset() + 76
             ,44
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 120
             ,9
             );
    }


 

	/**
	 *	Returns the value of rpC9H3Pagenumber
	 *	@return rpC9H3Pagenumber
	 */
   public char[] getRpC9H3Pagenumber() throws CFException{
     if (isRpC9H3PagenumberModified()) { 
        rpC9H3Pagenumber = refreshRpC9H3Pagenumber();
     }
   		return rpC9H3Pagenumber;
   }

  
	/**
	*  set variable rpC9H3Pagenumber
	*  Corresponding COBOL Variable is RP-C9-H3-PAGENUMBER
	*  @param value
	**/
   public void setRpC9H3Pagenumber(char[] value) {
      rpC9H3Pagenumber = checkRpC9H3PagenumberConstraints(value);
      serializeRpC9H3Pagenumber(rpC9H3Pagenumber);
   } 

     /**
	 * 	Update RpC9H3Pagenumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC9H3Pagenumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC9H3Pagenumber,rpC9H3Pagenumber.length);
   	
   }
   
   public void setRpC9H3Pagenumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9H3Pagenumber,rpC9H3Pagenumber.length);
   	
   }
   
     /**
	 * 	Update RpC9H3Pagenumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC9H3Pagenumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9H3Pagenumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC9H3Pagenumber with another Field
	 *	@param value
	 */
   public void setRpC9H3Pagenumber(Field source) {
       replace(source,0,source.length(),beginRpC9H3Pagenumber,RP_C_9_H_3_PAGENUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update RpC9H3Pagenumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC9H3Pagenumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC9H3Pagenumber,RP_C_9_H_3_PAGENUMBER_LEN);
   	
   }
   
     /**
	 * 	Update RpC9H3Pagenumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC9H3Pagenumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9H3Pagenumber+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpC9Heading3FieldLength() {
			return RP_C_9_HEADING_3_LENGTH;
		}

}
  
