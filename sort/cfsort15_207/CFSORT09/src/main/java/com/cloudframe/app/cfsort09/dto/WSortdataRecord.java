package com.cloudframe.app.cfsort09.dto;

/**
*  The class WSortdataRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.cfsort09.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class WSortdataRecord extends WSortdataRecordSerialized {
   

								private long wSortdataKeyZoneDec;
	
	/**
	* Constructor for WSortdataRecord
	**/
    public WSortdataRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wSortdataKeyZoneDec
	 *	@return wSortdataKeyZoneDec
	 */
	public long getWSortdataKeyZoneDec() throws CFException {
       if (isWSortdataKeyZoneDecModified()) { 
           wSortdataKeyZoneDec = refreshWSortdataKeyZoneDec();
        }
   		return wSortdataKeyZoneDec;
	}
	

    /**
	 *	Returns the String value of wSortdataKeyZoneDec
	 *	@return wSortdataKeyZoneDec
	 */
	public char[]  getWSortdataKeyZoneDecActualString() {
	    String value = String.valueOf(wSortdataKeyZoneDec).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WSortdataKeyZoneDec with the passed value
	 *  Corresponding COBOL Variable is W-SORTDATA-KEY-ZONE-DEC
	 *	@param number
	 */
	public void setWSortdataKeyZoneDec(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wSortdataKeyZoneDec = checkWSortdataKeyZoneDecMaxLimit(number); 
		serializeWSortdataKeyZoneDec(wSortdataKeyZoneDec);
	}
	

	/**
	 * 	Update WSortdataKeyZoneDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setWSortdataKeyZoneDec(char[] value) throws CFException {
		 wSortdataKeyZoneDec = serializeWSortdataKeyZoneDec(value);
	}
	/**
	 * 	Update WSortdataKeyZoneDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWSortdataKeyZoneDecString(char[] value) throws CFException {
		 setWSortdataKeyZoneDec(value);
	}

	
	
	

		public static int getWSortdataRecordFieldLength() {
			return W_SORTDATA_RECORD_LENGTH;
		}

}
  
