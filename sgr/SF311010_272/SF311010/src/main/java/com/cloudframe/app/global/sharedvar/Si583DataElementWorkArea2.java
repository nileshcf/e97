package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583DataElementWorkArea2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Si583DataElementWorkArea2 extends Si583DataElementWorkArea2Serialized { 
   
			private List<Si583Filler2> si583Filler2 = new ArrayList<>();
    	
	
	/**
	* Constructor for Si583DataElementWorkArea2
	**/
    public Si583DataElementWorkArea2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Si583DataElementWorkArea2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583DataElementWorkArea2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of si583Filler2
	 *  Corresponding COBOL Variable is SI583-FILLER2
	 *	@return si583Filler2
	 */
   public List<Si583Filler2> getSi583Filler2() {
       return si583Filler2;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return si583Filler2
	 */
	public Si583Filler2 getSi583Filler2(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSi583Filler2(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SI_583_FILLER_2_SIZE) {
             	index = SI_583_FILLER_2_SIZE -1; // can't exceed max array size
             	logger.trace("si583Filler2 - Array index exceeded max Size {}, resetting it to max allowed",SI_583_FILLER_2_SIZE); 
	    }
		if (index >= si583Filler2.size()) {
       		for (int fillIndex =  si583Filler2.size() -1; fillIndex < index;fillIndex++) {
		       si583Filler2.add(null);
		    }
			si583Filler2.set(index,
			   	   	new Si583Filler2(this,beginSi583Filler2 + index * Si583Filler2.getSi583Filler2FieldLength()) 
				                        ); 	
		} 
   	   Si583Filler2 value = si583Filler2.get(index);
   	   if (value == null) {
   	      si583Filler2.set(index,
			   	   	new Si583Filler2(this,beginSi583Filler2 + index * Si583Filler2.getSi583Filler2FieldLength()) 
				                        ); 
		  value = si583Filler2.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Si583Filler2 at index with the passed value
	 *  Corresponding COBOL Variable is SI583-FILLER2
	 *  @param index
	 *	@param value
	 */
  public void setSi583Filler2(int index,char[] value) {
   	getSi583Filler2(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Si583DataElementWorkArea2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (si583Filler2.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  SI_583_FILLER_2_SIZE;index++) {
              Si583Filler2  newElement = new Si583Filler2(this,beginSi583Filler2 + index * Si583Filler2.getSi583Filler2FieldLength());
              newElement.initialize();
               si583Filler2.add(newElement);
          }
     } else {
        if (si583Filler2.size() < SI_583_FILLER_2_SIZE) {
          // prefill it first
          for (int index = si583Filler2.size();index <  SI_583_FILLER_2_SIZE;index++) {
              Si583Filler2  newElement = new Si583Filler2(this,beginSi583Filler2 + index * Si583Filler2.getSi583Filler2FieldLength());
               si583Filler2.add(newElement);
          }
        }
        
     	for (int index = 0;index <  SI_583_FILLER_2_SIZE;index++) {
     		Si583Filler2 si583Filler2Var = si583Filler2.get(index);
 			if (si583Filler2Var == null) {
                si583Filler2Var = new Si583Filler2(this,beginSi583Filler2 + index * Si583Filler2.getSi583Filler2FieldLength());
                  si583Filler2.set(index, si583Filler2Var);
			} 
			si583Filler2Var.initialize();
		}
     }
   }

		public static int getSi583DataElementWorkArea2FieldLength() {
			return SI_583_DATA_ELEMENT_WORK_AREA_2_LENGTH;
		}

}
  
