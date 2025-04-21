package com.cloudframe.app.ip989010.dto;

/**
*  The class ElementsTable5001644695 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class ElementsTable5001644695 extends ElementsTable5001644695Serialized {
   
			private List<TblEntry5001644695> tblEntry5001644695 = new ArrayList<>();
    	
	
	/**
	* Constructor for ElementsTable5001644695
	**/
    public ElementsTable5001644695() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TBL_ENTRY_5001644695_SIZE;arrayIndex++) {
						tblEntry5001644695.add(new TblEntry5001644695(this, beginTblEntry5001644695 + 
						arrayIndex * TblEntry5001644695.getTblEntry5001644695FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of tblEntry5001644695
	 *  Corresponding COBOL Variable is 500-1644695-TBL-ENTRY
	 *	@return tblEntry5001644695
	 */
   public List<TblEntry5001644695> getTblEntry5001644695() {
       return tblEntry5001644695;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tblEntry5001644695
	 */
	public TblEntry5001644695 getTblEntry5001644695(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTblEntry5001644695(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TBL_ENTRY_5001644695_SIZE) {
             	index = TBL_ENTRY_5001644695_SIZE -1; // can't exceed max array size
             	logger.trace("tblEntry5001644695 - Array index exceeded max Size {}, resetting it to max allowed",TBL_ENTRY_5001644695_SIZE); 
	    }
		if (index >= tblEntry5001644695.size()) {
       		for (int fillIndex =  tblEntry5001644695.size() -1; fillIndex < index;fillIndex++) {
		       tblEntry5001644695.add(null);
		    }
			tblEntry5001644695.set(index,
			   	   	new TblEntry5001644695(this,beginTblEntry5001644695 + index * TblEntry5001644695.getTblEntry5001644695FieldLength()) 
				                        ); 	
		} 
   	   TblEntry5001644695 value = tblEntry5001644695.get(index);
   	   if (value == null) {
   	      tblEntry5001644695.set(index,
			   	   	new TblEntry5001644695(this,beginTblEntry5001644695 + index * TblEntry5001644695.getTblEntry5001644695FieldLength()) 
				                        ); 
		  value = tblEntry5001644695.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TblEntry5001644695 at index with the passed value
	 *  Corresponding COBOL Variable is 500-1644695-TBL-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setTblEntry5001644695(int index,char[] value) {
   	getTblEntry5001644695(index).setString(value);
   }
   
	

	
	
	

		public static int getElementsTable5001644695FieldLength() {
			return ELEMENTS_TABLE_5001644695_LENGTH;
		}

}
  
