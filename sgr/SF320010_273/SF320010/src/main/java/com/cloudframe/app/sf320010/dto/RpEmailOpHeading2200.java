package com.cloudframe.app.sf320010.dto;

/**
*  The class RpEmailOpHeading2200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpEmailOpHeading2200 extends RpEmailOpHeading2200Serialized {
   





								private char[] rpOpPagenumber1200 = Field.fillLowValue(4);
	
	/**
	* Constructor for RpEmailOpHeading2200
	**/
    public RpEmailOpHeading2200() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(50)
             , getStartOffset() + 0
             ,50
             );
       replaceValue( // serialize and save the value
             ("          OPERATOR LOG          ").toCharArray()
             , getStartOffset() + 50
             ,32
             );
       replaceValue( // serialize and save the value
             fillSpace(37)
             , getStartOffset() + 82
             ,37
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 119
             ,9
             );
    }


 

	/**
	 *	Returns the value of rpOpPagenumber1200
	 *	@return rpOpPagenumber1200
	 */
   public char[] getRpOpPagenumber1200() throws CFException{
     if (isRpOpPagenumber1200Modified()) { 
        rpOpPagenumber1200 = refreshRpOpPagenumber1200();
     }
   		return rpOpPagenumber1200;
   }

  
	/**
	*  set variable rpOpPagenumber1200
	*  Corresponding COBOL Variable is 200-RP-OP-PAGENUMBER1
	*  @param value
	**/
   public void setRpOpPagenumber1200(char[] value) {
      rpOpPagenumber1200 = checkRpOpPagenumber1200Constraints(value);
      serializeRpOpPagenumber1200(rpOpPagenumber1200);
   } 

     /**
	 * 	Update RpOpPagenumber1200 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpPagenumber1200(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpPagenumber1200,rpOpPagenumber1200.length);
   	
   }
   
   public void setRpOpPagenumber1200(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpPagenumber1200,rpOpPagenumber1200.length);
   	
   }
   
     /**
	 * 	Update RpOpPagenumber1200 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpPagenumber1200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpPagenumber1200+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpPagenumber1200 with another Field
	 *	@param value
	 */
   public void setRpOpPagenumber1200(Field source) {
       replace(source,0,source.length(),beginRpOpPagenumber1200,RP_OP_PAGENUMBER_1200_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpPagenumber1200 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpPagenumber1200(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpPagenumber1200,RP_OP_PAGENUMBER_1200_LEN);
   	
   }
   
     /**
	 * 	Update RpOpPagenumber1200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpPagenumber1200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpPagenumber1200+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpEmailOpHeading2200FieldLength() {
			return RP_EMAIL_OP_HEADING_2200_LENGTH;
		}

}
  
