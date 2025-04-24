package com.cloudframe.app.ar640010.dto;

/**
*  The class XtkMsg1600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class XtkMsg1600 extends XtkMsg1600Serialized { 
   



								private int xtkStartPosition600;
	
	/**
	* Constructor for XtkMsg1600
	**/
    public XtkMsg1600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for XtkMsg1600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XtkMsg1600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("1700-XTK PROCESS:").toCharArray()
             , getStartOffset() + 0
             ,17
             );
       replaceValue( // serialize and save the value
             ("TARAXTK CONFIG HAS ISSUE.START POSITION ").toCharArray()
             , getStartOffset() + 17
             ,40
             );
								setXtkStartPosition600(0);
    } 

	/**
	 *	Returns the value of xtkStartPosition600
	 *	@return xtkStartPosition600
	 */
	public int getXtkStartPosition600() throws CFException {
       if (isXtkStartPosition600Modified()) { 
           xtkStartPosition600 = refreshXtkStartPosition600();
        }
   		return xtkStartPosition600;
	}
	

	
	   
	/**
	 * 	Update XtkStartPosition600 with the passed value
	 *  Corresponding COBOL Variable is 600-XTK-START-POSITION
	 *	@param number
	 */
	public void setXtkStartPosition600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    xtkStartPosition600 = checkXtkStartPosition600MaxLimit(number); 
		serializeXtkStartPosition600(xtkStartPosition600);
	}
	

	public void setXtkStartPosition600(long number) {
	    number = checkXtkStartPosition600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setXtkStartPosition600((int)number);
	}
	
	/**
	 * 	Update XtkStartPosition600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setXtkStartPosition600(char[] value) throws CFException {
		 xtkStartPosition600 = serializeXtkStartPosition600(value);
	}
	/**
	 * 	Update XtkStartPosition600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXtkStartPosition600String(char[] value) throws CFException {
		 setXtkStartPosition600(value);
	}

	
	
	

		public static int getXtkMsg1600FieldLength() {
			return XTK_MSG_1600_LENGTH;
		}

}
  
