package com.cloudframe.app.cfsort09.file.records;

/**
*  The class SortworkRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.cfsort09.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;


public class SortworkRecord extends SortworkRecordSerialized {
   

								private long sortworkKeyZoneDec;

								private long sortworkKeyComp3;

								private int sortworkKeyBinary;

								private int sortworkKeyComp;

								private int sortworkKeyComp4;

								private int sortworkKeyComp5;
	
	/**
	* Constructor for SortworkRecord
	**/
    public SortworkRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sortworkKeyZoneDec
	 *	@return sortworkKeyZoneDec
	 */
	public long getSortworkKeyZoneDec() throws CFException {
       if (isSortworkKeyZoneDecModified()) { 
           sortworkKeyZoneDec = refreshSortworkKeyZoneDec();
        }
   		return sortworkKeyZoneDec;
	}
	

    /**
	 *	Returns the String value of sortworkKeyZoneDec
	 *	@return sortworkKeyZoneDec
	 */
	public char[]  getSortworkKeyZoneDecActualString() {
	    String value = String.valueOf(sortworkKeyZoneDec).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update SortworkKeyZoneDec with the passed value
	 *  Corresponding COBOL Variable is SORTWORK-KEY-ZONE-DEC
	 *	@param number
	 */
	public void setSortworkKeyZoneDec(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sortworkKeyZoneDec = checkSortworkKeyZoneDecMaxLimit(number); 
		serializeSortworkKeyZoneDec(sortworkKeyZoneDec);
	}
	

	/**
	 * 	Update SortworkKeyZoneDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setSortworkKeyZoneDec(char[] value) throws CFException {
		 sortworkKeyZoneDec = serializeSortworkKeyZoneDec(value);
	}
	/**
	 * 	Update SortworkKeyZoneDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSortworkKeyZoneDecString(char[] value) throws CFException {
		 setSortworkKeyZoneDec(value);
	}
	public long getSortworkKeyComp3() throws CFException {
        if (isSortworkKeyComp3Modified()) { 
           sortworkKeyComp3 = refreshSortworkKeyComp3();
        }
   		return sortworkKeyComp3;
	}
	
	/**
	 * 	Update SortworkKeyComp3 with the passed value
	 *  Corresponding COBOL Variable is SORTWORK-KEY-COMP-3
	 *	@param number
	 */
	public void setSortworkKeyComp3(long number) {
			sortworkKeyComp3 = checkSortworkKeyComp3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSortworkKeyComp3(sortworkKeyComp3);
	}


	/**
	 *	Returns the value of sortworkKeyBinary
	 *	@return sortworkKeyBinary
	 */
	public int getSortworkKeyBinary() throws CFException {
        if (isSortworkKeyBinaryModified()) { 
           sortworkKeyBinary = refreshSortworkKeyBinary();
        }
   		return sortworkKeyBinary;
	}
	
	/**
	 * 	Update SortworkKeyBinary with the passed value
	 *  Corresponding COBOL Variable is SORTWORK-KEY-BINARY
	 *	@param number
	 */
	public void setSortworkKeyBinary(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sortworkKeyBinary = checkSortworkKeyBinaryMaxLimit(number); 
		serializeSortworkKeyBinary(sortworkKeyBinary);
	}


	public void setSortworkKeyBinary(long number) {
	    number = checkSortworkKeyBinaryMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSortworkKeyBinary((int)number);
	}
	
	/**
	 *	Returns the value of sortworkKeyComp
	 *	@return sortworkKeyComp
	 */
	public int getSortworkKeyComp() throws CFException {
        if (isSortworkKeyCompModified()) { 
           sortworkKeyComp = refreshSortworkKeyComp();
        }
   		return sortworkKeyComp;
	}
	
	/**
	 * 	Update SortworkKeyComp with the passed value
	 *  Corresponding COBOL Variable is SORTWORK-KEY-COMP
	 *	@param number
	 */
	public void setSortworkKeyComp(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sortworkKeyComp = checkSortworkKeyCompMaxLimit(number); 
		serializeSortworkKeyComp(sortworkKeyComp);
	}


	public void setSortworkKeyComp(long number) {
	    number = checkSortworkKeyCompMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSortworkKeyComp((int)number);
	}
	
	/**
	 *	Returns the value of sortworkKeyComp4
	 *	@return sortworkKeyComp4
	 */
	public int getSortworkKeyComp4() throws CFException {
        if (isSortworkKeyComp4Modified()) { 
           sortworkKeyComp4 = refreshSortworkKeyComp4();
        }
   		return sortworkKeyComp4;
	}
	
	/**
	 * 	Update SortworkKeyComp4 with the passed value
	 *  Corresponding COBOL Variable is SORTWORK-KEY-COMP-4
	 *	@param number
	 */
	public void setSortworkKeyComp4(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sortworkKeyComp4 = checkSortworkKeyComp4MaxLimit(number); 
		serializeSortworkKeyComp4(sortworkKeyComp4);
	}


	public void setSortworkKeyComp4(long number) {
	    number = checkSortworkKeyComp4MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSortworkKeyComp4((int)number);
	}
	
	/**
	 *	Returns the value of sortworkKeyComp5
	 *	@return sortworkKeyComp5
	 */
	public int getSortworkKeyComp5() throws CFException {
        if (isSortworkKeyComp5Modified()) { 
           sortworkKeyComp5 = refreshSortworkKeyComp5();
        }
   		return sortworkKeyComp5;
	}
	
	/**
	 * 	Update SortworkKeyComp5 with the passed value
	 *  Corresponding COBOL Variable is SORTWORK-KEY-COMP-5
	 *	@param number
	 */
	public void setSortworkKeyComp5(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sortworkKeyComp5 = checkSortworkKeyComp5MaxLimit(number); 
		serializeSortworkKeyComp5(sortworkKeyComp5);
	}


	public void setSortworkKeyComp5(long number) {
	    number = checkSortworkKeyComp5MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSortworkKeyComp5((int)number);
	}
	

	
	
	

		public static int getSortworkRecordFieldLength() {
			return SORTWORK_RECORD_LENGTH;
		}

}
  
