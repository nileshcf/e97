package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpHeading2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpMpHeading2 extends RpMpHeading2Serialized {
   






								private char[] rpMpH2Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpMpHeading2
	**/
    public RpMpHeading2() {
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
             ("     MIP PROFILE LOG REPORT     ").toCharArray()
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
	 *	Returns the value of rpMpH2Pagenumber
	 *	@return rpMpH2Pagenumber
	 */
   public char[] getRpMpH2Pagenumber() throws CFException{
     if (isRpMpH2PagenumberModified()) { 
        rpMpH2Pagenumber = refreshRpMpH2Pagenumber();
     }
   		return rpMpH2Pagenumber;
   }

  
	/**
	*  set variable rpMpH2Pagenumber
	*  Corresponding COBOL Variable is RP-MP-H2-PAGENUMBER
	*  @param value
	**/
   public void setRpMpH2Pagenumber(char[] value) {
      rpMpH2Pagenumber = checkRpMpH2PagenumberConstraints(value);
      serializeRpMpH2Pagenumber(rpMpH2Pagenumber);
   } 

     /**
	 * 	Update RpMpH2Pagenumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpH2Pagenumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpH2Pagenumber,rpMpH2Pagenumber.length);
   	
   }
   
   public void setRpMpH2Pagenumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpH2Pagenumber,rpMpH2Pagenumber.length);
   	
   }
   
     /**
	 * 	Update RpMpH2Pagenumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpH2Pagenumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpH2Pagenumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpH2Pagenumber with another Field
	 *	@param value
	 */
   public void setRpMpH2Pagenumber(Field source) {
       replace(source,0,source.length(),beginRpMpH2Pagenumber,RP_MP_H_2_PAGENUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpH2Pagenumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpH2Pagenumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpH2Pagenumber,RP_MP_H_2_PAGENUMBER_LEN);
   	
   }
   
     /**
	 * 	Update RpMpH2Pagenumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpH2Pagenumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpH2Pagenumber+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpMpHeading2FieldLength() {
			return RP_MP_HEADING_2_LENGTH;
		}

}
  
