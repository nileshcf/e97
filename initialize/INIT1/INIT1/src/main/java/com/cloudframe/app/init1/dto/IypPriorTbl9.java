package com.cloudframe.app.init1.dto;

/**
*  The class IypPriorTbl9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class IypPriorTbl9 extends IypPriorTbl9Serialized { 
   
			@Getter @Setter private List<IypPrior9> iypPrior9 = new ArrayList<>();
    	
	
	/**
	* Constructor for IypPriorTbl9
	**/
    public IypPriorTbl9() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypPriorTbl9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPriorTbl9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_9_SIZE;arrayIndex++) {
						getIypPrior9().add(new IypPrior9(this, beginIypPrior9 + 
						arrayIndex * IypPrior9.getIypPrior9FieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_9_SIZE;arrayIndex++) {
					getIypPrior9().add(new IypPrior9(this, beginIypPrior9 + 
						arrayIndex * IypPrior9.getIypPrior9FieldLength()));
			}
    } 

	/**
	 * 	initializes IypPriorTbl9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (iypPrior9.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IYP_PRIOR_9_SIZE;index++) {
              IypPrior9  newElement = new IypPrior9(this,beginIypPrior9 + index * IypPrior9.getIypPrior9FieldLength());
              newElement.initialize();
              getIypPrior9().add(newElement);
          }
     } else {
        if (iypPrior9.size() < IYP_PRIOR_9_SIZE) {
          // prefill it first
          for (int index = iypPrior9.size();index <  IYP_PRIOR_9_SIZE;index++) {
              IypPrior9  newElement = new IypPrior9(this,beginIypPrior9 + index * IypPrior9.getIypPrior9FieldLength());
              getIypPrior9().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IYP_PRIOR_9_SIZE;index++) {
     		IypPrior9 iypPrior9Var = iypPrior9.get(index);
 			if (iypPrior9Var == null) {
                iypPrior9Var = new IypPrior9(this,beginIypPrior9 + index * IypPrior9.getIypPrior9FieldLength());
                  getIypPrior9().set(index, iypPrior9Var);
			} 
			iypPrior9Var.initialize();
		}
     }
   }


}
  
