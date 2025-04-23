package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamAtype850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DynamAtype850 extends DynamAtype850Serialized { 
   


								private long dynamBlocks850;
	
	/**
	* Constructor for DynamAtype850
	**/
    public DynamAtype850() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DynamAtype850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamAtype850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 0
             ,7
             );
    } 

	/**
	 *	Returns the value of dynamBlocks850
	 *	@return dynamBlocks850
	 */
	public long getDynamBlocks850() throws CFException {
       if (isDynamBlocks850Modified()) { 
           dynamBlocks850 = refreshDynamBlocks850();
        }
   		return dynamBlocks850;
	}
	

	
	   
	/**
	 * 	Update DynamBlocks850 with the passed value
	 *  Corresponding COBOL Variable is 850-DYNAM-BLOCKS
	 *	@param number
	 */
	public void setDynamBlocks850(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dynamBlocks850 = checkDynamBlocks850MaxLimit(number); 
		serializeDynamBlocks850(dynamBlocks850);
	}
	

	/**
	 * 	Update DynamBlocks850 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDynamBlocks850(char[] value) throws CFException {
		 dynamBlocks850 = serializeDynamBlocks850(value);
	}
	/**
	 * 	Update DynamBlocks850 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDynamBlocks850String(char[] value) throws CFException {
		 setDynamBlocks850(value);
	}

	
	
	

		public static int getDynamAtype850FieldLength() {
			return DYNAM_ATYPE_850_LENGTH;
		}

}
  
