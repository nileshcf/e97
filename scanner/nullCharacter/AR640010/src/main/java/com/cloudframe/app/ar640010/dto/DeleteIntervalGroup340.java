package com.cloudframe.app.ar640010.dto;

/**
*  The class DeleteIntervalGroup340 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DeleteIntervalGroup340 extends DeleteIntervalGroup340Serialized { 
   

								private long deleteInterval340;
	
	/**
	* Constructor for DeleteIntervalGroup340
	**/
    public DeleteIntervalGroup340() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DeleteIntervalGroup340. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DeleteIntervalGroup340(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDeleteInterval340(200L);
    } 

	/**
	 *	Returns the value of deleteInterval340
	 *	@return deleteInterval340
	 */
	public long getDeleteInterval340() throws CFException {
       if (isDeleteInterval340Modified()) { 
           deleteInterval340 = refreshDeleteInterval340();
        }
   		return deleteInterval340;
	}
	

	
	   
	/**
	 * 	Update DeleteInterval340 with the passed value
	 *  Corresponding COBOL Variable is 340-DELETE-INTERVAL
	 *	@param number
	 */
	public void setDeleteInterval340(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    deleteInterval340 = checkDeleteInterval340MaxLimit(number); 
		serializeDeleteInterval340(deleteInterval340);
	}
	

	/**
	 * 	Update DeleteInterval340 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDeleteInterval340(char[] value) throws CFException {
		 deleteInterval340 = serializeDeleteInterval340(value);
	}
	/**
	 * 	Update DeleteInterval340 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDeleteInterval340String(char[] value) throws CFException {
		 setDeleteInterval340(value);
	}

	
	
	

		public static int getDeleteIntervalGroup340FieldLength() {
			return DELETE_INTERVAL_GROUP_340_LENGTH;
		}

}
  
