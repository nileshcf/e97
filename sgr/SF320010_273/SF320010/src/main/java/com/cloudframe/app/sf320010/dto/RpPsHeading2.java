package com.cloudframe.app.sf320010.dto;

/**
*  The class RpPsHeading2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpPsHeading2 extends RpPsHeading2Serialized {
   






								private char[] rpPsH2Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpPsHeading2
	**/
    public RpPsHeading2() {
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
             ("  POINT OF SALE TRANSACTION LOG ").toCharArray()
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
	 *	Returns the value of rpPsH2Pagenumber
	 *	@return rpPsH2Pagenumber
	 */
   public char[] getRpPsH2Pagenumber() throws CFException{
     if (isRpPsH2PagenumberModified()) { 
        rpPsH2Pagenumber = refreshRpPsH2Pagenumber();
     }
   		return rpPsH2Pagenumber;
   }

  
	/**
	*  set variable rpPsH2Pagenumber
	*  Corresponding COBOL Variable is RP-PS-H2-PAGENUMBER
	*  @param value
	**/
   public void setRpPsH2Pagenumber(char[] value) {
      rpPsH2Pagenumber = checkRpPsH2PagenumberConstraints(value);
      serializeRpPsH2Pagenumber(rpPsH2Pagenumber);
   } 

     /**
	 * 	Update RpPsH2Pagenumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsH2Pagenumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsH2Pagenumber,rpPsH2Pagenumber.length);
   	
   }
   
   public void setRpPsH2Pagenumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsH2Pagenumber,rpPsH2Pagenumber.length);
   	
   }
   
     /**
	 * 	Update RpPsH2Pagenumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsH2Pagenumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsH2Pagenumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsH2Pagenumber with another Field
	 *	@param value
	 */
   public void setRpPsH2Pagenumber(Field source) {
       replace(source,0,source.length(),beginRpPsH2Pagenumber,RP_PS_H_2_PAGENUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsH2Pagenumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsH2Pagenumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsH2Pagenumber,RP_PS_H_2_PAGENUMBER_LEN);
   	
   }
   
     /**
	 * 	Update RpPsH2Pagenumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsH2Pagenumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsH2Pagenumber+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpPsHeading2FieldLength() {
			return RP_PS_HEADING_2_LENGTH;
		}

}
  
