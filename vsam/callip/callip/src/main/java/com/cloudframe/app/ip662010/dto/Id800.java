package com.cloudframe.app.ip662010.dto;

/**
*  The class Id800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Id800 extends Id800Serialized { 
   

								private short type800;

								private short no800;
	
	/**
	* Constructor for Id800
	**/
    public Id800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Id800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Id800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of type800
	 *	@return type800
	 */
	public short getType800() throws CFException {
        if (isType800Modified()) { 
           type800 = refreshType800();
        }
   		return type800;
	}
	
	/**
	 * 	Update Type800 with the passed value
	 *  Corresponding COBOL Variable is 800-TYPE
	 *	@param number
	 */
	public void setType800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    type800 = checkType800MaxLimit(number); 
		serializeType800(type800);
	}

	public void setType800(int number) {
	    number = checkType800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setType800((short)number);
	}
	public void setType800(long number) {
	    number = checkType800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setType800((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isTagHasBeenDeleted800()
	 *	@return  Returns true if isTagHasBeenDeleted800() is 0
	 */
   public boolean isTagHasBeenDeleted800() throws CFException {
      return (  getType800()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setTagHasBeenDeleted800True() {  			
    	setType800( (short)0);
   	}
	
	/**
	 *	Test condition 1 2 3 for isTagTypeIsValid800()
	 *	@return  Returns true if isTagTypeIsValid800() is 1 2 3
	 */
   public boolean isTagTypeIsValid800() throws CFException {
      return (  getType800()  ==  1  ||  getType800()  ==  2  ||  getType800()  ==  3  );
   }


	/**
	*  set values 1 2 3
	*/
   	public void setTagTypeIsValid800True() {  			
    	setType800( (short)1);
   	}
	
	/**
	 *	Test condition 1 for isItsAnMti800()
	 *	@return  Returns true if isItsAnMti800() is 1
	 */
   public boolean isItsAnMti800() throws CFException {
      return (  getType800()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setItsAnMti800True() {  			
    	setType800( (short)1);
   	}
	
	/**
	 *	Test condition 2 for isItsADataElement800()
	 *	@return  Returns true if isItsADataElement800() is 2
	 */
   public boolean isItsADataElement800() throws CFException {
      return (  getType800()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setItsADataElement800True() {  			
    	setType800( (short)2);
   	}
	
	/**
	 *	Test condition 3 for isItsAPds800()
	 *	@return  Returns true if isItsAPds800() is 3
	 */
   public boolean isItsAPds800() throws CFException {
      return (  getType800()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setItsAPds800True() {  			
    	setType800( (short)3);
   	}
	/**
	 *	Returns the value of no800
	 *	@return no800
	 */
	public short getNo800() throws CFException {
        if (isNo800Modified()) { 
           no800 = refreshNo800();
        }
   		return no800;
	}
	
	/**
	 * 	Update No800 with the passed value
	 *  Corresponding COBOL Variable is 800-NO
	 *	@param number
	 */
	public void setNo800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    no800 = checkNo800MaxLimit(number); 
		serializeNo800(no800);
	}

	public void setNo800(int number) {
	    number = checkNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNo800((short)number);
	}
	public void setNo800(long number) {
	    number = checkNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNo800((short)number);
	}
	

	
	/**
	 *	Test condition 2 THRU 128 for isDeNoIsValid800()
	 *	@return  Returns true if isDeNoIsValid800() is 2 THRU 128
	 */
   public boolean isDeNoIsValid800() throws CFException {
      return (   (getNo800()  >=  2 ) &&   (getNo800()  <=  128 )   );
   }


	/**
	*  set values 2 THRU 128
	*/
   	public void setDeNoIsValid800True() {  			
    	setNo800( (short)2);
   	}

	
	
	

		public static int getId800FieldLength() {
			return ID_800_LENGTH;
		}

}
  
