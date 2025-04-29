package com.cloudframe.app.init1.dto;

/**
*  The class IypPriorTbl7 is used to handle fields declared in it
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
public class IypPriorTbl7 extends IypPriorTbl7Serialized { 
   
			@Getter @Setter private List<IypPrior7> iypPrior7 = new ArrayList<>();
    	
	
	/**
	* Constructor for IypPriorTbl7
	**/
    public IypPriorTbl7() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypPriorTbl7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPriorTbl7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_7_SIZE;arrayIndex++) {
						getIypPrior7().add(new IypPrior7(this, beginIypPrior7 + 
						arrayIndex * IypPrior7.getIypPrior7FieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_7_SIZE;arrayIndex++) {
					getIypPrior7().add(new IypPrior7(this, beginIypPrior7 + 
						arrayIndex * IypPrior7.getIypPrior7FieldLength()));
			}
    } 

	/**
	 * 	initializes IypPriorTbl7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (iypPrior7.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IYP_PRIOR_7_SIZE;index++) {
              IypPrior7  newElement = new IypPrior7(this,beginIypPrior7 + index * IypPrior7.getIypPrior7FieldLength());
              newElement.initialize();
              getIypPrior7().add(newElement);
          }
     } else {
        if (iypPrior7.size() < IYP_PRIOR_7_SIZE) {
          // prefill it first
          for (int index = iypPrior7.size();index <  IYP_PRIOR_7_SIZE;index++) {
              IypPrior7  newElement = new IypPrior7(this,beginIypPrior7 + index * IypPrior7.getIypPrior7FieldLength());
              getIypPrior7().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IYP_PRIOR_7_SIZE;index++) {
     		IypPrior7 iypPrior7Var = iypPrior7.get(index);
 			if (iypPrior7Var == null) {
                iypPrior7Var = new IypPrior7(this,beginIypPrior7 + index * IypPrior7.getIypPrior7FieldLength());
                  getIypPrior7().set(index, iypPrior7Var);
			} 
			iypPrior7Var.initialize();
		}
     }
   }


}
  
