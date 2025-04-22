package com.cloudframe.app.sf320010.dto;

/**
*  The class RpOpHeading2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpOpHeading2 extends RpOpHeading2Serialized {
   






								private char[] rpOpH2Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpOpHeading2
	**/
    public RpOpHeading2() {
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
             ("          OPERATOR LOG          ").toCharArray()
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
	 *	Returns the value of rpOpH2Pagenumber
	 *	@return rpOpH2Pagenumber
	 */
   public char[] getRpOpH2Pagenumber() throws CFException{
     if (isRpOpH2PagenumberModified()) { 
        rpOpH2Pagenumber = refreshRpOpH2Pagenumber();
     }
   		return rpOpH2Pagenumber;
   }

  
	/**
	*  set variable rpOpH2Pagenumber
	*  Corresponding COBOL Variable is RP-OP-H2-PAGENUMBER
	*  @param value
	**/
   public void setRpOpH2Pagenumber(char[] value) {
      rpOpH2Pagenumber = checkRpOpH2PagenumberConstraints(value);
      serializeRpOpH2Pagenumber(rpOpH2Pagenumber);
   } 

     /**
	 * 	Update RpOpH2Pagenumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpH2Pagenumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpH2Pagenumber,rpOpH2Pagenumber.length);
   	
   }
   
   public void setRpOpH2Pagenumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpH2Pagenumber,rpOpH2Pagenumber.length);
   	
   }
   
     /**
	 * 	Update RpOpH2Pagenumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpH2Pagenumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpH2Pagenumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpH2Pagenumber with another Field
	 *	@param value
	 */
   public void setRpOpH2Pagenumber(Field source) {
       replace(source,0,source.length(),beginRpOpH2Pagenumber,RP_OP_H_2_PAGENUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpH2Pagenumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpH2Pagenumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpH2Pagenumber,RP_OP_H_2_PAGENUMBER_LEN);
   	
   }
   
     /**
	 * 	Update RpOpH2Pagenumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpH2Pagenumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpH2Pagenumber+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpOpHeading2FieldLength() {
			return RP_OP_HEADING_2_LENGTH;
		}

}
  
