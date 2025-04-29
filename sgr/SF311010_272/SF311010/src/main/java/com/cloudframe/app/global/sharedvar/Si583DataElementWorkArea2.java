package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583DataElementWorkArea2 is used to handle fields declared in it
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
public class Si583DataElementWorkArea2 extends Si583DataElementWorkArea2Serialized { 
   
			@Getter @Setter private List<Si583Filler2> si583Filler2 = new ArrayList<>();
    	
	
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
              getSi583Filler2().add(newElement);
          }
     } else {
        if (si583Filler2.size() < SI_583_FILLER_2_SIZE) {
          // prefill it first
          for (int index = si583Filler2.size();index <  SI_583_FILLER_2_SIZE;index++) {
              Si583Filler2  newElement = new Si583Filler2(this,beginSi583Filler2 + index * Si583Filler2.getSi583Filler2FieldLength());
              getSi583Filler2().add(newElement);
          }
        }
        
     	for (int index = 0;index <  SI_583_FILLER_2_SIZE;index++) {
     		Si583Filler2 si583Filler2Var = si583Filler2.get(index);
 			if (si583Filler2Var == null) {
                si583Filler2Var = new Si583Filler2(this,beginSi583Filler2 + index * Si583Filler2.getSi583Filler2FieldLength());
                  getSi583Filler2().set(index, si583Filler2Var);
			} 
			si583Filler2Var.initialize();
		}
     }
   }


}
  
