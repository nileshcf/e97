package com.cloudframe.app.global.sharedvar;

/**
*  The class SeprTableRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class SeprTableRedefined extends SeprTableRedefinedSerialized { 
   
			@Getter @Setter private List<SeprEntry> seprEntry = new ArrayList<>();
    	
	
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
              getSeprEntry().add(newElement);
          }
     } else {
        if (seprEntry.size() < SEPR_ENTRY_SIZE) {
          // prefill it first
          for (int index = seprEntry.size();index <  SEPR_ENTRY_SIZE;index++) {
              SeprEntry  newElement = new SeprEntry(this,beginSeprEntry + index * SeprEntry.getSeprEntryFieldLength());
              getSeprEntry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  SEPR_ENTRY_SIZE;index++) {
     		SeprEntry seprEntryVar = seprEntry.get(index);
 			if (seprEntryVar == null) {
                seprEntryVar = new SeprEntry(this,beginSeprEntry + index * SeprEntry.getSeprEntryFieldLength());
                  getSeprEntry().set(index, seprEntryVar);
			} 
			seprEntryVar.initialize();
		}
     }
   }


}
  
