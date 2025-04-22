package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeMapEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504DeMapEntry extends Ip65504DeMapEntrySerialized { 
   

								private short ip65504DeStart;

								private short ip65504DeLngth;

								private int ip65504DeFirstSubfld;
	
	/**
	* Constructor for Ip65504DeMapEntry
	**/
    public Ip65504DeMapEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504DeMapEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeMapEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart() throws CFException {
        if (isIp65504DeStartModified()) { 
           ip65504DeStart = refreshIp65504DeStart();
        }
   		return ip65504DeStart;
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *  Corresponding COBOL Variable is IP65504-DE-START
	 *	@param number
	 */
	public void setIp65504DeStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504DeStart = checkIp65504DeStartMaxLimit(number); 
		serializeIp65504DeStart(ip65504DeStart);
	}

	public void setIp65504DeStart(int number) {
	    number = checkIp65504DeStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504DeStart((short)number);
	}
	public void setIp65504DeStart(long number) {
	    number = checkIp65504DeStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504DeStart((short)number);
	}
	

	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth() throws CFException {
        if (isIp65504DeLngthModified()) { 
           ip65504DeLngth = refreshIp65504DeLngth();
        }
   		return ip65504DeLngth;
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *  Corresponding COBOL Variable is IP65504-DE-LNGTH
	 *	@param number
	 */
	public void setIp65504DeLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504DeLngth = checkIp65504DeLngthMaxLimit(number); 
		serializeIp65504DeLngth(ip65504DeLngth);
	}

	public void setIp65504DeLngth(int number) {
	    number = checkIp65504DeLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504DeLngth((short)number);
	}
	public void setIp65504DeLngth(long number) {
	    number = checkIp65504DeLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504DeLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip65504DeFirstSubfld
	 *	@return ip65504DeFirstSubfld
	 */
	public int getIp65504DeFirstSubfld() throws CFException {
        if (isIp65504DeFirstSubfldModified()) { 
           ip65504DeFirstSubfld = refreshIp65504DeFirstSubfld();
        }
   		return ip65504DeFirstSubfld;
	}
	
	/**
	 * 	Update Ip65504DeFirstSubfld with the passed value
	 *  Corresponding COBOL Variable is IP65504-DE-FIRST-SUBFLD
	 *	@param number
	 */
	public void setIp65504DeFirstSubfld(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504DeFirstSubfld = checkIp65504DeFirstSubfldMaxLimit(number); 
		serializeIp65504DeFirstSubfld(ip65504DeFirstSubfld);
	}


	public void setIp65504DeFirstSubfld(long number) {
	    number = checkIp65504DeFirstSubfldMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp65504DeFirstSubfld((int)number);
	}
	

	
	
	
	/**
	 * 	initializes Ip65504DeMapEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504DeStart((short)0);
         	setIp65504DeLngth((short)0);
                     setIp65504DeFirstSubfld(0);
   }

		public static int getIp65504DeMapEntryFieldLength() {
			return IP_65504_DE_MAP_ENTRY_LENGTH;
		}

}
  
