package com.cloudframe.app.sf320010.dto;

/**
*  The class RpBdHeading2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpBdHeading2 extends RpBdHeading2Serialized {
   






								private char[] rpBdH2Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpBdHeading2
	**/
    public RpBdHeading2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(50)
             , getStartOffset() + 1
             ,50
             );
       replaceValue( // serialize and save the value
             ("   BULK DATA TRANSMISSION LOG   ").toCharArray()
             , getStartOffset() + 51
             ,32
             );
       replaceValue( // serialize and save the value
             fillSpace(37)
             , getStartOffset() + 83
             ,37
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 120
             ,9
             );
    }


 

	/**
	 *	Returns the value of rpBdH2Pagenumber
	 *	@return rpBdH2Pagenumber
	 */
   public char[] getRpBdH2Pagenumber() throws CFException{
     if (isRpBdH2PagenumberModified()) { 
        rpBdH2Pagenumber = refreshRpBdH2Pagenumber();
     }
   		return rpBdH2Pagenumber;
   }

  
	/**
	*  set variable rpBdH2Pagenumber
	*  Corresponding COBOL Variable is RP-BD-H2-PAGENUMBER
	*  @param value
	**/
   public void setRpBdH2Pagenumber(char[] value) {
      rpBdH2Pagenumber = checkRpBdH2PagenumberConstraints(value);
      serializeRpBdH2Pagenumber(rpBdH2Pagenumber);
   } 

     /**
	 * 	Update RpBdH2Pagenumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdH2Pagenumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdH2Pagenumber,rpBdH2Pagenumber.length);
   	
   }
   
   public void setRpBdH2Pagenumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdH2Pagenumber,rpBdH2Pagenumber.length);
   	
   }
   
     /**
	 * 	Update RpBdH2Pagenumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdH2Pagenumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdH2Pagenumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdH2Pagenumber with another Field
	 *	@param value
	 */
   public void setRpBdH2Pagenumber(Field source) {
       replace(source,0,source.length(),beginRpBdH2Pagenumber,RP_BD_H_2_PAGENUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdH2Pagenumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdH2Pagenumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdH2Pagenumber,RP_BD_H_2_PAGENUMBER_LEN);
   	
   }
   
     /**
	 * 	Update RpBdH2Pagenumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdH2Pagenumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdH2Pagenumber+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpBdHeading2FieldLength() {
			return RP_BD_HEADING_2_LENGTH;
		}

}
  
