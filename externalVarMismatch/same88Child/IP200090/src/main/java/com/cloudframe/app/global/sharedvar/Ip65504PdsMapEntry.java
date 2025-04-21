package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsMapEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsMapEntry extends Ip65504PdsMapEntrySerialized { 
   

								private short ip65504PdsStart;

								private short ip65504PdsLngth;

								private int ip65504PdsFirstSubfld;
	
	/**
	* Constructor for Ip65504PdsMapEntry
	**/
    public Ip65504PdsMapEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsMapEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsMapEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504PdsStart
	 *	@return ip65504PdsStart
	 */
	public short getIp65504PdsStart() throws CFException {
        if (isIp65504PdsStartModified()) { 
           ip65504PdsStart = refreshIp65504PdsStart();
        }
   		return ip65504PdsStart;
	}
	
	/**
	 * 	Update Ip65504PdsStart with the passed value
	 *  Corresponding COBOL Variable is IP65504-PDS-START
	 *	@param number
	 */
	public void setIp65504PdsStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504PdsStart = checkIp65504PdsStartMaxLimit(number); 
		serializeIp65504PdsStart(ip65504PdsStart);
	}

	public void setIp65504PdsStart(int number) {
	    number = checkIp65504PdsStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504PdsStart((short)number);
	}
	public void setIp65504PdsStart(long number) {
	    number = checkIp65504PdsStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504PdsStart((short)number);
	}
	

	/**
	 *	Returns the value of ip65504PdsLngth
	 *	@return ip65504PdsLngth
	 */
	public short getIp65504PdsLngth() throws CFException {
        if (isIp65504PdsLngthModified()) { 
           ip65504PdsLngth = refreshIp65504PdsLngth();
        }
   		return ip65504PdsLngth;
	}
	
	/**
	 * 	Update Ip65504PdsLngth with the passed value
	 *  Corresponding COBOL Variable is IP65504-PDS-LNGTH
	 *	@param number
	 */
	public void setIp65504PdsLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504PdsLngth = checkIp65504PdsLngthMaxLimit(number); 
		serializeIp65504PdsLngth(ip65504PdsLngth);
	}

	public void setIp65504PdsLngth(int number) {
	    number = checkIp65504PdsLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504PdsLngth((short)number);
	}
	public void setIp65504PdsLngth(long number) {
	    number = checkIp65504PdsLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504PdsLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip65504PdsFirstSubfld
	 *	@return ip65504PdsFirstSubfld
	 */
	public int getIp65504PdsFirstSubfld() throws CFException {
        if (isIp65504PdsFirstSubfldModified()) { 
           ip65504PdsFirstSubfld = refreshIp65504PdsFirstSubfld();
        }
   		return ip65504PdsFirstSubfld;
	}
	
	/**
	 * 	Update Ip65504PdsFirstSubfld with the passed value
	 *  Corresponding COBOL Variable is IP65504-PDS-FIRST-SUBFLD
	 *	@param number
	 */
	public void setIp65504PdsFirstSubfld(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504PdsFirstSubfld = checkIp65504PdsFirstSubfldMaxLimit(number); 
		serializeIp65504PdsFirstSubfld(ip65504PdsFirstSubfld);
	}


	public void setIp65504PdsFirstSubfld(long number) {
	    number = checkIp65504PdsFirstSubfldMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp65504PdsFirstSubfld((int)number);
	}
	

	
	
	
	/**
	 * 	initializes Ip65504PdsMapEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504PdsStart((short)0);
         	setIp65504PdsLngth((short)0);
                     setIp65504PdsFirstSubfld(0);
   }

		public static int getIp65504PdsMapEntryFieldLength() {
			return IP_65504_PDS_MAP_ENTRY_LENGTH;
		}

}
  
