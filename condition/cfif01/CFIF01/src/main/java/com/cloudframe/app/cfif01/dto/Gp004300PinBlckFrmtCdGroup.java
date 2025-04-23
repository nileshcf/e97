package com.cloudframe.app.cfif01.dto;

/**
*  The class Gp004300PinBlckFrmtCdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Gp004300PinBlckFrmtCdGroup extends Gp004300PinBlckFrmtCdGroupSerialized {
   

								private int gp004300PinBlckFrmtCd;

						private char[] gp004300PinBlckFrmt = Field.fillLowValue(2);
	
	/**
	* Constructor for Gp004300PinBlckFrmtCdGroup
	**/
    public Gp004300PinBlckFrmtCdGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of gp004300PinBlckFrmtCd
	 *	@return gp004300PinBlckFrmtCd
	 */
	public int getGp004300PinBlckFrmtCd() throws CFException {
       if (isGp004300PinBlckFrmtCdModified()) { 
           gp004300PinBlckFrmtCd = refreshGp004300PinBlckFrmtCd();
        }
   		return gp004300PinBlckFrmtCd;
	}
	

	
	   
	/**
	 * 	Update Gp004300PinBlckFrmtCd with the passed value
	 *  Corresponding COBOL Variable is GP004300-PIN-BLCK-FRMT-CD
	 *	@param number
	 */
	public void setGp004300PinBlckFrmtCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    gp004300PinBlckFrmtCd = checkGp004300PinBlckFrmtCdMaxLimit(number); 
		serializeGp004300PinBlckFrmtCd(gp004300PinBlckFrmtCd);
	}
	

	public void setGp004300PinBlckFrmtCd(long number) {
	    number = checkGp004300PinBlckFrmtCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGp004300PinBlckFrmtCd((int)number);
	}
	
	/**
	 * 	Update Gp004300PinBlckFrmtCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setGp004300PinBlckFrmtCd(char[] value) throws CFException {
		 gp004300PinBlckFrmtCd = serializeGp004300PinBlckFrmtCd(value);
	}
	/**
	 * 	Update Gp004300PinBlckFrmtCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGp004300PinBlckFrmtCdString(char[] value) throws CFException {
		 setGp004300PinBlckFrmtCd(value);
	}
	/**
	 *	Returns the value of gp004300PinBlckFrmt
	 *	@return gp004300PinBlckFrmt
	 */
   public char[] getGp004300PinBlckFrmt() throws CFException{
     if (isGp004300PinBlckFrmtModified()) { 
        gp004300PinBlckFrmt = refreshGp004300PinBlckFrmt();
     }
   		return gp004300PinBlckFrmt;
   }

  
	/**
	*  set variable gp004300PinBlckFrmt
	*  Corresponding COBOL Variable is GP004300-PIN-BLCK-FRMT
	*  @param value
	**/
   public void setGp004300PinBlckFrmt(char[] value) {
      gp004300PinBlckFrmt = checkGp004300PinBlckFrmtConstraints(value);
      serializeGp004300PinBlckFrmt(gp004300PinBlckFrmt);
   } 

     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGp004300PinBlckFrmt,gp004300PinBlckFrmt.length);
   	
   }
   
   public void setGp004300PinBlckFrmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGp004300PinBlckFrmt,gp004300PinBlckFrmt.length);
   	
   }
   
     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGp004300PinBlckFrmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Gp004300PinBlckFrmt with another Field
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(Field source) {
       replace(source,0,source.length(),beginGp004300PinBlckFrmt,GP_004300_PIN_BLCK_FRMT_LEN);
   	
   }  
   
     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGp004300PinBlckFrmt,GP_004300_PIN_BLCK_FRMT_LEN);
   	
   }
   
     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGp004300PinBlckFrmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getGp004300PinBlckFrmtCdGroupFieldLength() {
			return GP_004300_PIN_BLCK_FRMT_CD_GROUP_LENGTH;
		}

}
  
