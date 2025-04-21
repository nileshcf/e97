package com.cloudframe.app.global.sharedvar;

/**
*  The class SeprTableRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class SeprTableRedefined extends SeprTableRedefinedSerialized { 
   
			private List<SeprEntry> seprEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for SeprTableRedefined
	**/
    public SeprTableRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SeprTableRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeprTableRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of seprEntry
	 *  Corresponding COBOL Variable is SEPR-ENTRY
	 *	@return seprEntry
	 */
   public List<SeprEntry> getSeprEntry() {
       return seprEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return seprEntry
	 */
	public SeprEntry getSeprEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSeprEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SEPR_ENTRY_SIZE) {
             	index = SEPR_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("seprEntry - Array index exceeded max Size {}, resetting it to max allowed",SEPR_ENTRY_SIZE); 
	    }
		if (index >= seprEntry.size()) {
       		for (int fillIndex =  seprEntry.size() -1; fillIndex < index;fillIndex++) {
		       seprEntry.add(null);
		    }
			seprEntry.set(index,
			   	   	new SeprEntry(this,beginSeprEntry + index * SeprEntry.getSeprEntryFieldLength()) 
				                        ); 	
		} 
   	   SeprEntry value = seprEntry.get(index);
   	   if (value == null) {
   	      seprEntry.set(index,
			   	   	new SeprEntry(this,beginSeprEntry + index * SeprEntry.getSeprEntryFieldLength()) 
				                        ); 
		  value = seprEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SeprEntry at index with the passed value
	 *  Corresponding COBOL Variable is SEPR-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setSeprEntry(int index,char[] value) {
   	getSeprEntry(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes SeprTableRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (seprEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  SEPR_ENTRY_SIZE;index++) {
              SeprEntry  newElement = new SeprEntry(this,beginSeprEntry + index * SeprEntry.getSeprEntryFieldLength());
              newElement.initialize();
               seprEntry.add(newElement);
          }
     } else {
        if (seprEntry.size() < SEPR_ENTRY_SIZE) {
          // prefill it first
          for (int index = seprEntry.size();index <  SEPR_ENTRY_SIZE;index++) {
              SeprEntry  newElement = new SeprEntry(this,beginSeprEntry + index * SeprEntry.getSeprEntryFieldLength());
               seprEntry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  SEPR_ENTRY_SIZE;index++) {
     		SeprEntry seprEntryVar = seprEntry.get(index);
 			if (seprEntryVar == null) {
                seprEntryVar = new SeprEntry(this,beginSeprEntry + index * SeprEntry.getSeprEntryFieldLength());
                  seprEntry.set(index, seprEntryVar);
			} 
			seprEntryVar.initialize();
		}
     }
   }

		public static int getSeprTableRedefinedFieldLength() {
			return SEPR_TABLE_REDEFINED_LENGTH;
		}

}
  
