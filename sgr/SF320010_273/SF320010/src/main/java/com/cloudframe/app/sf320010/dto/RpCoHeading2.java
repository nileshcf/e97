package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoHeading2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoHeading2 extends RpCoHeading2Serialized {
   






								private char[] rpCoH2Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpCoHeading2
	**/
    public RpCoHeading2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(46)
             , getStartOffset() + 1
             ,46
             );
       replaceValue( // serialize and save the value
             ("STATISTICS AND ERROR LOG CONTROL TOTALS").toCharArray()
             , getStartOffset() + 47
             ,39
             );
       replaceValue( // serialize and save the value
             fillSpace(34)
             , getStartOffset() + 86
             ,34
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 120
             ,9
             );
    }


 

	/**
	 *	Returns the value of rpCoH2Pagenumber
	 *	@return rpCoH2Pagenumber
	 */
   public char[] getRpCoH2Pagenumber() throws CFException{
     if (isRpCoH2PagenumberModified()) { 
        rpCoH2Pagenumber = refreshRpCoH2Pagenumber();
     }
   		return rpCoH2Pagenumber;
   }

  
	/**
	*  set variable rpCoH2Pagenumber
	*  Corresponding COBOL Variable is RP-CO-H2-PAGENUMBER
	*  @param value
	**/
   public void setRpCoH2Pagenumber(char[] value) {
      rpCoH2Pagenumber = checkRpCoH2PagenumberConstraints(value);
      serializeRpCoH2Pagenumber(rpCoH2Pagenumber);
   } 

     /**
	 * 	Update RpCoH2Pagenumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoH2Pagenumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoH2Pagenumber,rpCoH2Pagenumber.length);
   	
   }
   
   public void setRpCoH2Pagenumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoH2Pagenumber,rpCoH2Pagenumber.length);
   	
   }
   
     /**
	 * 	Update RpCoH2Pagenumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoH2Pagenumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoH2Pagenumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoH2Pagenumber with another Field
	 *	@param value
	 */
   public void setRpCoH2Pagenumber(Field source) {
       replace(source,0,source.length(),beginRpCoH2Pagenumber,RP_CO_H_2_PAGENUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoH2Pagenumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoH2Pagenumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoH2Pagenumber,RP_CO_H_2_PAGENUMBER_LEN);
   	
   }
   
     /**
	 * 	Update RpCoH2Pagenumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoH2Pagenumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoH2Pagenumber+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoHeading2FieldLength() {
			return RP_CO_HEADING_2_LENGTH;
		}

}
  
