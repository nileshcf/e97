package com.cloudframe.app.dbissues.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:14. using version 5.0.0.256
**/


import com.cloudframe.app.dbissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Work extends WorkSerialized {
   

						private char[] fsFiz018i = Field.fillLowValue(2);

						private char[] fsFiz018o = Field.fillLowValue(2);

								private BigDecimal bodyHeight = BigDecimal.ZERO;

								private BigDecimal bodyHeightAux = BigDecimal.ZERO;

								private int heightBloqtotal;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBodyHeight(BigDecimal.ZERO);
								setBodyHeightAux(BigDecimal.ZERO);
								setHeightBloqtotal(0);
    }


 

	/**
	 *	Returns the value of fsFiz018i
	 *	@return fsFiz018i
	 */
   public char[] getFsFiz018i() throws CFException{
   		return fsFiz018i;
   }

  
	/**
	*  set variable fsFiz018i
	*  Corresponding COBOL Variable is FS-FIZ018I
	*  @param value
	**/
   public void setFsFiz018i(char[] value) {
       value = checkFsFiz018iConstraints(value);
       arraycopy(value,0,fsFiz018i,0,value.length);
   } 
	public void setFsFiz018i(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fsFiz018i,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fsFiz018o
	 *	@return fsFiz018o
	 */
   public char[] getFsFiz018o() throws CFException{
   		return fsFiz018o;
   }

  
	/**
	*  set variable fsFiz018o
	*  Corresponding COBOL Variable is FS-FIZ018O
	*  @param value
	**/
   public void setFsFiz018o(char[] value) {
       value = checkFsFiz018oConstraints(value);
       arraycopy(value,0,fsFiz018o,0,value.length);
   } 
	public void setFsFiz018o(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fsFiz018o,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bodyHeight
	 *	@return bodyHeight
	 */
	public BigDecimal getBodyHeight() throws CFException {
       if (isBodyHeightModified()) { 
           bodyHeight = refreshBodyHeight();
        }
   		return bodyHeight;
	}
	

    /**
	 *	Returns the String value of bodyHeight
	 *	@return bodyHeight
	 */
	public char[]  getBodyHeightActualString() {
	    String value = String.valueOf(bodyHeight).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update BodyHeight with the passed number
	 *  Corresponding COBOL Variable is WS-BODY-HEIGHT
	 *	@param number
	 */
	public void setBodyHeight(BigDecimal number) {
       bodyHeight = checkBodyHeightMaxLimit(number);
	    serializeBodyHeight(bodyHeight);
   }
	/**
	 * 	Update BodyHeight with the passed value
	 *	@param value (String or char[])
	 */
	public void setBodyHeight(char[] value) throws CFException {
		 bodyHeight = serializeBodyHeight(value);
	}   
	/**
	 *	Returns the value of bodyHeightAux
	 *	@return bodyHeightAux
	 */
	public BigDecimal getBodyHeightAux() throws CFException {
       if (isBodyHeightAuxModified()) { 
           bodyHeightAux = refreshBodyHeightAux();
        }
   		return bodyHeightAux;
	}
	

    /**
	 *	Returns the String value of bodyHeightAux
	 *	@return bodyHeightAux
	 */
	public char[]  getBodyHeightAuxActualString() {
	    String value = String.valueOf(bodyHeightAux).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update BodyHeightAux with the passed number
	 *  Corresponding COBOL Variable is WS-BODY-HEIGHT-AUX
	 *	@param number
	 */
	public void setBodyHeightAux(BigDecimal number) {
       bodyHeightAux = checkBodyHeightAuxMaxLimit(number);
	    serializeBodyHeightAux(bodyHeightAux);
   }
	/**
	 * 	Update BodyHeightAux with the passed value
	 *	@param value (String or char[])
	 */
	public void setBodyHeightAux(char[] value) throws CFException {
		 bodyHeightAux = serializeBodyHeightAux(value);
	}   
	/**
	 *	Returns the value of heightBloqtotal
	 *	@return heightBloqtotal
	 */
	public int getHeightBloqtotal() throws CFException {
       if (isHeightBloqtotalModified()) { 
           heightBloqtotal = refreshHeightBloqtotal();
        }
   		return heightBloqtotal;
	}
	

    /**
	 *	Returns the String value of heightBloqtotal
	 *	@return heightBloqtotal
	 */
	public char[]  getHeightBloqtotalActualString() {
	    String value = String.valueOf(heightBloqtotal).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update HeightBloqtotal with the passed value
	 *  Corresponding COBOL Variable is WS-HEIGHT-BLOQTOTAL
	 *	@param number
	 */
	public void setHeightBloqtotal(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    heightBloqtotal = checkHeightBloqtotalMaxLimit(number); 
		serializeHeightBloqtotal(heightBloqtotal);
	}
	

	public void setHeightBloqtotal(long number) {
	    number = checkHeightBloqtotalMaxLimit(number); // Truncate if value is beyond +/- Max range
		setHeightBloqtotal((int)number);
	}
	
	/**
	 * 	Update HeightBloqtotal with the passed value
	 *	@param value (String or char[])
	 */
	public void setHeightBloqtotal(char[] value) throws CFException {
		 heightBloqtotal = serializeHeightBloqtotal(value);
	}
	/**
	 * 	Update HeightBloqtotal with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHeightBloqtotalString(char[] value) throws CFException {
		 setHeightBloqtotal(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
