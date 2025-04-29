package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583DataElementWorkArea1 is used to handle fields declared in it
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
public class Si583DataElementWorkArea1 extends Si583DataElementWorkArea1Serialized { 
   
			@Getter @Setter private List<Si583Filler1> si583Filler1 = new ArrayList<>();
    	
	
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
              getSi583Filler1().add(newElement);
          }
     } else {
        if (si583Filler1.size() < SI_583_FILLER_1_SIZE) {
          // prefill it first
          for (int index = si583Filler1.size();index <  SI_583_FILLER_1_SIZE;index++) {
              Si583Filler1  newElement = new Si583Filler1(this,beginSi583Filler1 + index * Si583Filler1.getSi583Filler1FieldLength());
              getSi583Filler1().add(newElement);
          }
        }
        
     	for (int index = 0;index <  SI_583_FILLER_1_SIZE;index++) {
     		Si583Filler1 si583Filler1Var = si583Filler1.get(index);
 			if (si583Filler1Var == null) {
                si583Filler1Var = new Si583Filler1(this,beginSi583Filler1 + index * Si583Filler1.getSi583Filler1FieldLength());
                  getSi583Filler1().set(index, si583Filler1Var);
			} 
			si583Filler1Var.initialize();
		}
     }
   }


}
  
