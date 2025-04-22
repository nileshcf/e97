package com.cloudframe.app.ms00d363.dto;

/**
*  The class DaysInMoTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class DaysInMoTable extends DaysInMoTableSerialized {
   
			private List<DaysInMo> daysInMo = new ArrayList<>();
    	
	
	/**
	* Constructor for DaysInMoTable
	**/
    public DaysInMoTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DAYS_IN_MO_SIZE;arrayIndex++) {
						daysInMo.add(new DaysInMo(this, beginDaysInMo + 
						arrayIndex * DaysInMo.getDaysInMoFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of daysInMo
	 *  Corresponding COBOL Variable is DAYS-IN-MO
	 *	@return daysInMo
	 */
   public List<DaysInMo> getDaysInMo() {
       return daysInMo;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return daysInMo
	 */
	public DaysInMo getDaysInMo(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDaysInMo(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DAYS_IN_MO_SIZE) {
             	index = DAYS_IN_MO_SIZE -1; // can't exceed max array size
             	logger.trace("daysInMo - Array index exceeded max Size {}, resetting it to max allowed",DAYS_IN_MO_SIZE); 
	    }
		if (index >= daysInMo.size()) {
       		for (int fillIndex =  daysInMo.size() -1; fillIndex < index;fillIndex++) {
		       daysInMo.add(null);
		    }
			daysInMo.set(index,
			   	   	new DaysInMo(this,beginDaysInMo + index * DaysInMo.getDaysInMoFieldLength()) 
				                        ); 	
		} 
   	   DaysInMo value = daysInMo.get(index);
   	   if (value == null) {
   	      daysInMo.set(index,
			   	   	new DaysInMo(this,beginDaysInMo + index * DaysInMo.getDaysInMoFieldLength()) 
				                        ); 
		  value = daysInMo.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update DaysInMo at index with the passed value
	 *  Corresponding COBOL Variable is DAYS-IN-MO
	 *  @param index
	 *	@param value
	 */
  public void setDaysInMo(int index,char[] value) {
   	getDaysInMo(index).setString(value);
   }
   
	

	
	
	

		public static int getDaysInMoTableFieldLength() {
			return DAYS_IN_MO_TABLE_LENGTH;
		}

}
  
