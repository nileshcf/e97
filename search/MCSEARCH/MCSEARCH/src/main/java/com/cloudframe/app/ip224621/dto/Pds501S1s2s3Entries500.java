package com.cloudframe.app.ip224621.dto;

/**
*  The class Pds501S1s2s3Entries500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:50. using version 5.0.0.256
**/


import com.cloudframe.app.ip224621.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class Pds501S1s2s3Entries500 extends Pds501S1s2s3Entries500Serialized {
   

								private short pds501S1s2s3Tcnt500;
			private List<Pds501S1s2s3Table500> pds501S1s2s3Table500 = new ArrayList<>();
    	
	
	/**
	* Constructor for Pds501S1s2s3Entries500
	**/
    public Pds501S1s2s3Entries500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < PDS_501_S_1S_2S_3_TABLE_500_SIZE;arrayIndex++) {
						pds501S1s2s3Table500.add(new Pds501S1s2s3Table500(this, beginPds501S1s2s3Table500 + 
						arrayIndex * Pds501S1s2s3Table500.getPds501S1s2s3Table500FieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < PDS_501_S_1S_2S_3_TABLE_500_SIZE;arrayIndex++) {
					pds501S1s2s3Table500.add(new Pds501S1s2s3Table500(this, beginPds501S1s2s3Table500 + 
						arrayIndex * Pds501S1s2s3Table500.getPds501S1s2s3Table500FieldLength()));
			}
    }


 

	/**
	 *	Returns the value of pds501S1s2s3Tcnt500
	 *	@return pds501S1s2s3Tcnt500
	 */
	public short getPds501S1s2s3Tcnt500() throws CFException {
        if (isPds501S1s2s3Tcnt500Modified()) { 
           pds501S1s2s3Tcnt500 = refreshPds501S1s2s3Tcnt500();
        }
   		return pds501S1s2s3Tcnt500;
	}
	
	/**
	 * 	Update Pds501S1s2s3Tcnt500 with the passed value
	 *  Corresponding COBOL Variable is 500-PDS501-S1S2S3-TCNT
	 *	@param number
	 */
	public void setPds501S1s2s3Tcnt500(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pds501S1s2s3Tcnt500 = checkPds501S1s2s3Tcnt500MaxLimit(number); 
		serializePds501S1s2s3Tcnt500(pds501S1s2s3Tcnt500);
	}

	public void setPds501S1s2s3Tcnt500(int number) {
	    number = checkPds501S1s2s3Tcnt500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPds501S1s2s3Tcnt500((short)number);
	}
	public void setPds501S1s2s3Tcnt500(long number) {
	    number = checkPds501S1s2s3Tcnt500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPds501S1s2s3Tcnt500((short)number);
	}
	

	/**
	 *	Returns the  value of pds501S1s2s3Table500
	 *  Corresponding COBOL Variable is 500-PDS501-S1S2S3-TABLE
	 *	@return pds501S1s2s3Table500
	 */
   public List<Pds501S1s2s3Table500> getPds501S1s2s3Table500() {
       return pds501S1s2s3Table500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return pds501S1s2s3Table500
	 */
	public Pds501S1s2s3Table500 getPds501S1s2s3Table500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getPds501S1s2s3Table500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= PDS_501_S_1S_2S_3_TABLE_500_SIZE) {
             	index = PDS_501_S_1S_2S_3_TABLE_500_SIZE -1; // can't exceed max array size
             	logger.trace("pds501S1s2s3Table500 - Array index exceeded max Size {}, resetting it to max allowed",PDS_501_S_1S_2S_3_TABLE_500_SIZE); 
	    }
		if (index >= pds501S1s2s3Table500.size()) {
       		for (int fillIndex =  pds501S1s2s3Table500.size() -1; fillIndex < index;fillIndex++) {
		       pds501S1s2s3Table500.add(null);
		    }
			pds501S1s2s3Table500.set(index,
			   	   	new Pds501S1s2s3Table500(this,beginPds501S1s2s3Table500 + index * Pds501S1s2s3Table500.getPds501S1s2s3Table500FieldLength()) 
				                        ); 	
		} 
   	   Pds501S1s2s3Table500 value = pds501S1s2s3Table500.get(index);
   	   if (value == null) {
   	      pds501S1s2s3Table500.set(index,
			   	   	new Pds501S1s2s3Table500(this,beginPds501S1s2s3Table500 + index * Pds501S1s2s3Table500.getPds501S1s2s3Table500FieldLength()) 
				                        ); 
		  value = pds501S1s2s3Table500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Pds501S1s2s3Table500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-PDS501-S1S2S3-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setPds501S1s2s3Table500(int index,char[] value) {
   	getPds501S1s2s3Table500(index).setString(value);
   }
   
	

	
	
	

		public static int getPds501S1s2s3Entries500FieldLength() {
			return PDS_501_S_1S_2S_3_ENTRIES_500_LENGTH;
		}

}
  
