package com.cloudframe.app.mcissues.dto;

/**
*  The class MapRow1ValGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MapRow1ValGroup800 extends MapRow1ValGroup800Serialized {
   

								private int mapRow1Val800;

								private int mapRow1800;
	
	/**
	* Constructor for MapRow1ValGroup800
	**/
    public MapRow1ValGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMapRow1Val800(0);
    }


 

	/**
	 *	Returns the value of mapRow1Val800
	 *	@return mapRow1Val800
	 */
	public int getMapRow1Val800() throws CFException {
        if (isMapRow1Val800Modified()) { 
           mapRow1Val800 = refreshMapRow1Val800();
        }
   		return mapRow1Val800;
	}
	
	/**
	 * 	Update MapRow1Val800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAP-ROW-1-VAL
	 *	@param number
	 */
	public void setMapRow1Val800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mapRow1Val800 = checkMapRow1Val800MaxLimit(number); 
		serializeMapRow1Val800(mapRow1Val800);
	}


	public void setMapRow1Val800(long number) {
	    number = checkMapRow1Val800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMapRow1Val800((int)number);
	}
	
	/**
	 *	Returns the value of mapRow1800
	 *	@return mapRow1800
	 */
	public int getMapRow1800() throws CFException {
        if (isMapRow1800Modified()) { 
           mapRow1800 = refreshMapRow1800();
        }
   		return mapRow1800;
	}
	
	/**
	 * 	Update MapRow1800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAP-ROW-1
	 *	@param number
	 */
	public void setMapRow1800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mapRow1800 = checkMapRow1800MaxLimit(number); 
		serializeMapRow1800(mapRow1800);
	}


	public void setMapRow1800(long number) {
	    number = checkMapRow1800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMapRow1800((int)number);
	}
	

	
	
	

		public static int getMapRow1ValGroup800FieldLength() {
			return MAP_ROW_1_VAL_GROUP_800_LENGTH;
		}

}
  
