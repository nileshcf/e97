package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583DataElementWorkArea1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Si583DataElementWorkArea1 extends Si583DataElementWorkArea1Serialized { 
   
			private List<Si583Filler1> si583Filler1 = new ArrayList<>();
    	
	
	/**
	* Constructor for Si583DataElementWorkArea1
	**/
    public Si583DataElementWorkArea1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Si583DataElementWorkArea1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583DataElementWorkArea1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of si583Filler1
	 *  Corresponding COBOL Variable is SI583-FILLER1
	 *	@return si583Filler1
	 */
   public List<Si583Filler1> getSi583Filler1() {
       return si583Filler1;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return si583Filler1
	 */
	public Si583Filler1 getSi583Filler1(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSi583Filler1(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SI_583_FILLER_1_SIZE) {
             	index = SI_583_FILLER_1_SIZE -1; // can't exceed max array size
             	logger.trace("si583Filler1 - Array index exceeded max Size {}, resetting it to max allowed",SI_583_FILLER_1_SIZE); 
	    }
		if (index >= si583Filler1.size()) {
       		for (int fillIndex =  si583Filler1.size() -1; fillIndex < index;fillIndex++) {
		       si583Filler1.add(null);
		    }
			si583Filler1.set(index,
			   	   	new Si583Filler1(this,beginSi583Filler1 + index * Si583Filler1.getSi583Filler1FieldLength()) 
				                        ); 	
		} 
   	   Si583Filler1 value = si583Filler1.get(index);
   	   if (value == null) {
   	      si583Filler1.set(index,
			   	   	new Si583Filler1(this,beginSi583Filler1 + index * Si583Filler1.getSi583Filler1FieldLength()) 
				                        ); 
		  value = si583Filler1.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Si583Filler1 at index with the passed value
	 *  Corresponding COBOL Variable is SI583-FILLER1
	 *  @param index
	 *	@param value
	 */
  public void setSi583Filler1(int index,char[] value) {
   	getSi583Filler1(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Si583DataElementWorkArea1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (si583Filler1.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  SI_583_FILLER_1_SIZE;index++) {
              Si583Filler1  newElement = new Si583Filler1(this,beginSi583Filler1 + index * Si583Filler1.getSi583Filler1FieldLength());
              newElement.initialize();
               si583Filler1.add(newElement);
          }
     } else {
        if (si583Filler1.size() < SI_583_FILLER_1_SIZE) {
          // prefill it first
          for (int index = si583Filler1.size();index <  SI_583_FILLER_1_SIZE;index++) {
              Si583Filler1  newElement = new Si583Filler1(this,beginSi583Filler1 + index * Si583Filler1.getSi583Filler1FieldLength());
               si583Filler1.add(newElement);
          }
        }
        
     	for (int index = 0;index <  SI_583_FILLER_1_SIZE;index++) {
     		Si583Filler1 si583Filler1Var = si583Filler1.get(index);
 			if (si583Filler1Var == null) {
                si583Filler1Var = new Si583Filler1(this,beginSi583Filler1 + index * Si583Filler1.getSi583Filler1FieldLength());
                  si583Filler1.set(index, si583Filler1Var);
			} 
			si583Filler1Var.initialize();
		}
     }
   }

		public static int getSi583DataElementWorkArea1FieldLength() {
			return SI_583_DATA_ELEMENT_WORK_AREA_1_LENGTH;
		}

}
  
