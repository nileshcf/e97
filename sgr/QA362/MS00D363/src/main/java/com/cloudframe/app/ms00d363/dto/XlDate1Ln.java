package com.cloudframe.app.ms00d363.dto;

/**
*  The class XlDate1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class XlDate1Ln extends XlDate1LnSerialized {
   


								private int xl1Mm;


								private int xl1Dd;


								private int xl1Yy;

	
	/**
	* Constructor for XlDate1Ln
	**/
    public XlDate1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
								setXl1Mm(0);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 3
             ,1
             );
								setXl1Dd(0);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 6
             ,1
             );
								setXl1Yy(0);
       replaceValue( // serialize and save the value
             pad(491," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 9
             ,491
             );
    }


 

	/**
	 *	Returns the value of xl1Mm
	 *	@return xl1Mm
	 */
	public int getXl1Mm() throws CFException {
       if (isXl1MmModified()) { 
           xl1Mm = refreshXl1Mm();
        }
   		return xl1Mm;
	}
	

	
	   
	/**
	 * 	Update Xl1Mm with the passed value
	 *  Corresponding COBOL Variable is XL1-MM
	 *	@param number
	 */
	public void setXl1Mm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    xl1Mm = checkXl1MmMaxLimit(number); 
		serializeXl1Mm(xl1Mm);
	}
	

	public void setXl1Mm(long number) {
	    number = checkXl1MmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXl1Mm((int)number);
	}
	
	/**
	 * 	Update Xl1Mm with the passed value
	 *	@param value (String or char[])
	 */
	public void setXl1Mm(char[] value) throws CFException {
		 xl1Mm = serializeXl1Mm(value);
	}
	/**
	 * 	Update Xl1Mm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXl1MmString(char[] value) throws CFException {
		 setXl1Mm(value);
	}
	/**
	 *	Returns the value of xl1Dd
	 *	@return xl1Dd
	 */
	public int getXl1Dd() throws CFException {
       if (isXl1DdModified()) { 
           xl1Dd = refreshXl1Dd();
        }
   		return xl1Dd;
	}
	

	
	   
	/**
	 * 	Update Xl1Dd with the passed value
	 *  Corresponding COBOL Variable is XL1-DD
	 *	@param number
	 */
	public void setXl1Dd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    xl1Dd = checkXl1DdMaxLimit(number); 
		serializeXl1Dd(xl1Dd);
	}
	

	public void setXl1Dd(long number) {
	    number = checkXl1DdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXl1Dd((int)number);
	}
	
	/**
	 * 	Update Xl1Dd with the passed value
	 *	@param value (String or char[])
	 */
	public void setXl1Dd(char[] value) throws CFException {
		 xl1Dd = serializeXl1Dd(value);
	}
	/**
	 * 	Update Xl1Dd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXl1DdString(char[] value) throws CFException {
		 setXl1Dd(value);
	}
	/**
	 *	Returns the value of xl1Yy
	 *	@return xl1Yy
	 */
	public int getXl1Yy() throws CFException {
       if (isXl1YyModified()) { 
           xl1Yy = refreshXl1Yy();
        }
   		return xl1Yy;
	}
	

	
	   
	/**
	 * 	Update Xl1Yy with the passed value
	 *  Corresponding COBOL Variable is XL1-YY
	 *	@param number
	 */
	public void setXl1Yy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    xl1Yy = checkXl1YyMaxLimit(number); 
		serializeXl1Yy(xl1Yy);
	}
	

	public void setXl1Yy(long number) {
	    number = checkXl1YyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXl1Yy((int)number);
	}
	
	/**
	 * 	Update Xl1Yy with the passed value
	 *	@param value (String or char[])
	 */
	public void setXl1Yy(char[] value) throws CFException {
		 xl1Yy = serializeXl1Yy(value);
	}
	/**
	 * 	Update Xl1Yy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXl1YyString(char[] value) throws CFException {
		 setXl1Yy(value);
	}

	
	
	

		public static int getXlDate1LnFieldLength() {
			return XL_DATE_1_LN_LENGTH;
		}

}
  
