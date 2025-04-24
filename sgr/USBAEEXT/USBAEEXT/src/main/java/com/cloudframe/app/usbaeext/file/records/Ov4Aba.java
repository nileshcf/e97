package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4Aba is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ov4Aba extends Ov4AbaSerialized { 
   

								private long ov4AbaNo;

	
	/**
	* Constructor for Ov4Aba
	**/
    public Ov4Aba() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4Aba. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4Aba(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 8
             ,1
             );
    } 

	/**
	 *	Returns the value of ov4AbaNo
	 *	@return ov4AbaNo
	 */
	public long getOv4AbaNo() throws CFException {
       if (isOv4AbaNoModified()) { 
           ov4AbaNo = refreshOv4AbaNo();
        }
   		return ov4AbaNo;
	}
	

	
	   
	/**
	 * 	Update Ov4AbaNo with the passed value
	 *  Corresponding COBOL Variable is OV4-ABA-NO
	 *	@param number
	 */
	public void setOv4AbaNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4AbaNo = checkOv4AbaNoMaxLimit(number); 
		serializeOv4AbaNo(ov4AbaNo);
	}
	

	/**
	 * 	Update Ov4AbaNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4AbaNo(char[] value) throws CFException {
		 ov4AbaNo = serializeOv4AbaNo(value);
	}
	/**
	 * 	Update Ov4AbaNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4AbaNoString(char[] value) throws CFException {
		 setOv4AbaNo(value);
	}

	
	
	

		public static int getOv4AbaFieldLength() {
			return OV_4_ABA_LENGTH;
		}

}
  
