package com.cloudframe.app.mcissues.dto;

/**
*  The class SortKeyLthTable700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class SortKeyLthTable700 extends SortKeyLthTable700Serialized {
   
			private List<SortKeyLthEntry700> sortKeyLthEntry700 = new ArrayList<>();
    	
	
	/**
	* Constructor for SortKeyLthTable700
	**/
    public SortKeyLthTable700() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SORT_KEY_LTH_ENTRY_700_SIZE;arrayIndex++) {
						sortKeyLthEntry700.add(new SortKeyLthEntry700(this, beginSortKeyLthEntry700 + 
						arrayIndex * SortKeyLthEntry700.getSortKeyLthEntry700FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of sortKeyLthEntry700
	 *  Corresponding COBOL Variable is 700-SORT-KEY-LTH-ENTRY
	 *	@return sortKeyLthEntry700
	 */
   public List<SortKeyLthEntry700> getSortKeyLthEntry700() {
       return sortKeyLthEntry700;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return sortKeyLthEntry700
	 */
	public SortKeyLthEntry700 getSortKeyLthEntry700(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSortKeyLthEntry700(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SORT_KEY_LTH_ENTRY_700_SIZE) {
             	index = SORT_KEY_LTH_ENTRY_700_SIZE -1; // can't exceed max array size
             	logger.trace("sortKeyLthEntry700 - Array index exceeded max Size {}, resetting it to max allowed",SORT_KEY_LTH_ENTRY_700_SIZE); 
	    }
		if (index >= sortKeyLthEntry700.size()) {
       		for (int fillIndex =  sortKeyLthEntry700.size() -1; fillIndex < index;fillIndex++) {
		       sortKeyLthEntry700.add(null);
		    }
			sortKeyLthEntry700.set(index,
			   	   	new SortKeyLthEntry700(this,beginSortKeyLthEntry700 + index * SortKeyLthEntry700.getSortKeyLthEntry700FieldLength()) 
				                        ); 	
		} 
   	   SortKeyLthEntry700 value = sortKeyLthEntry700.get(index);
   	   if (value == null) {
   	      sortKeyLthEntry700.set(index,
			   	   	new SortKeyLthEntry700(this,beginSortKeyLthEntry700 + index * SortKeyLthEntry700.getSortKeyLthEntry700FieldLength()) 
				                        ); 
		  value = sortKeyLthEntry700.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SortKeyLthEntry700 at index with the passed value
	 *  Corresponding COBOL Variable is 700-SORT-KEY-LTH-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setSortKeyLthEntry700(int index,char[] value) {
   	getSortKeyLthEntry700(index).setString(value);
   }
   
	

	
	
	

		public static int getSortKeyLthTable700FieldLength() {
			return SORT_KEY_LTH_TABLE_700_LENGTH;
		}

}
  
