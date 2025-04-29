package com.cloudframe.app.ip989010.dto;

/**
*  The class ElementsTable5001644697 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class ElementsTable5001644697 extends ElementsTable5001644697Serialized {
   
			private List<TblEntry5001644697> tblEntry5001644697 = new ArrayList<>();
    	
	
	/**
	* Constructor for ElementsTable5001644697
	**/
    public ElementsTable5001644697() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TBL_ENTRY_5001644697_SIZE;arrayIndex++) {
						tblEntry5001644697.add(new TblEntry5001644697(this, beginTblEntry5001644697 + 
						arrayIndex * TblEntry5001644697.getTblEntry5001644697FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of tblEntry5001644697
	 *  Corresponding COBOL Variable is 500-1644697-TBL-ENTRY
	 *	@return tblEntry5001644697
	 */
   public List<TblEntry5001644697> getTblEntry5001644697() {
       return tblEntry5001644697;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tblEntry5001644697
	 */
	public TblEntry5001644697 getTblEntry5001644697(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTblEntry5001644697(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TBL_ENTRY_5001644697_SIZE) {
             	index = TBL_ENTRY_5001644697_SIZE -1; // can't exceed max array size
             	logger.trace("tblEntry5001644697 - Array index exceeded max Size {}, resetting it to max allowed",TBL_ENTRY_5001644697_SIZE); 
	    }
		if (index >= tblEntry5001644697.size()) {
       		for (int fillIndex =  tblEntry5001644697.size() -1; fillIndex < index;fillIndex++) {
		       tblEntry5001644697.add(null);
		    }
			tblEntry5001644697.set(index,
			   	   	new TblEntry5001644697(this,beginTblEntry5001644697 + index * TblEntry5001644697.getTblEntry5001644697FieldLength()) 
				                        ); 	
		} 
   	   TblEntry5001644697 value = tblEntry5001644697.get(index);
   	   if (value == null) {
   	      tblEntry5001644697.set(index,
			   	   	new TblEntry5001644697(this,beginTblEntry5001644697 + index * TblEntry5001644697.getTblEntry5001644697FieldLength()) 
				                        ); 
		  value = tblEntry5001644697.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TblEntry5001644697 at index with the passed value
	 *  Corresponding COBOL Variable is 500-1644697-TBL-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setTblEntry5001644697(int index,char[] value) {
   	getTblEntry5001644697(index).setString(value);
   }
   
	

	
	
	

		public static int getElementsTable5001644697FieldLength() {
			return ELEMENTS_TABLE_5001644697_LENGTH;
		}

}
  
