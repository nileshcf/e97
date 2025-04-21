package com.cloudframe.app.ip989010.dto;

/**
*  The class ElementsTable5001240200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class ElementsTable5001240200 extends ElementsTable5001240200Serialized {
   
			private List<TblEntry5001240200> tblEntry5001240200 = new ArrayList<>();
    	
	
	/**
	* Constructor for ElementsTable5001240200
	**/
    public ElementsTable5001240200() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TBL_ENTRY_5001240200_SIZE;arrayIndex++) {
						tblEntry5001240200.add(new TblEntry5001240200(this, beginTblEntry5001240200 + 
						arrayIndex * TblEntry5001240200.getTblEntry5001240200FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of tblEntry5001240200
	 *  Corresponding COBOL Variable is 500-1240200-TBL-ENTRY
	 *	@return tblEntry5001240200
	 */
   public List<TblEntry5001240200> getTblEntry5001240200() {
       return tblEntry5001240200;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tblEntry5001240200
	 */
	public TblEntry5001240200 getTblEntry5001240200(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTblEntry5001240200(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TBL_ENTRY_5001240200_SIZE) {
             	index = TBL_ENTRY_5001240200_SIZE -1; // can't exceed max array size
             	logger.trace("tblEntry5001240200 - Array index exceeded max Size {}, resetting it to max allowed",TBL_ENTRY_5001240200_SIZE); 
	    }
		if (index >= tblEntry5001240200.size()) {
       		for (int fillIndex =  tblEntry5001240200.size() -1; fillIndex < index;fillIndex++) {
		       tblEntry5001240200.add(null);
		    }
			tblEntry5001240200.set(index,
			   	   	new TblEntry5001240200(this,beginTblEntry5001240200 + index * TblEntry5001240200.getTblEntry5001240200FieldLength()) 
				                        ); 	
		} 
   	   TblEntry5001240200 value = tblEntry5001240200.get(index);
   	   if (value == null) {
   	      tblEntry5001240200.set(index,
			   	   	new TblEntry5001240200(this,beginTblEntry5001240200 + index * TblEntry5001240200.getTblEntry5001240200FieldLength()) 
				                        ); 
		  value = tblEntry5001240200.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TblEntry5001240200 at index with the passed value
	 *  Corresponding COBOL Variable is 500-1240200-TBL-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setTblEntry5001240200(int index,char[] value) {
   	getTblEntry5001240200(index).setString(value);
   }
   
	

	
	
	

		public static int getElementsTable5001240200FieldLength() {
			return ELEMENTS_TABLE_5001240200_LENGTH;
		}

}
  
