package com.cloudframe.app.init1.dto;

/**
*  The class IypPriorTbl8 is used to handle fields declared in it
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
public class IypPriorTbl8 extends IypPriorTbl8Serialized { 
   
			@Getter @Setter private List<IypPrior8> iypPrior8 = new ArrayList<>();
    	
	
	/**
	* Constructor for IypPriorTbl8
	**/
    public IypPriorTbl8() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypPriorTbl8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPriorTbl8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_8_SIZE;arrayIndex++) {
						getIypPrior8().add(new IypPrior8(this, beginIypPrior8 + 
						arrayIndex * IypPrior8.getIypPrior8FieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_8_SIZE;arrayIndex++) {
					getIypPrior8().add(new IypPrior8(this, beginIypPrior8 + 
						arrayIndex * IypPrior8.getIypPrior8FieldLength()));
			}
    } 

	/**
	 * 	initializes IypPriorTbl8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (iypPrior8.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IYP_PRIOR_8_SIZE;index++) {
              IypPrior8  newElement = new IypPrior8(this,beginIypPrior8 + index * IypPrior8.getIypPrior8FieldLength());
              newElement.initialize();
              getIypPrior8().add(newElement);
          }
     } else {
        if (iypPrior8.size() < IYP_PRIOR_8_SIZE) {
          // prefill it first
          for (int index = iypPrior8.size();index <  IYP_PRIOR_8_SIZE;index++) {
              IypPrior8  newElement = new IypPrior8(this,beginIypPrior8 + index * IypPrior8.getIypPrior8FieldLength());
              getIypPrior8().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IYP_PRIOR_8_SIZE;index++) {
     		IypPrior8 iypPrior8Var = iypPrior8.get(index);
 			if (iypPrior8Var == null) {
                iypPrior8Var = new IypPrior8(this,beginIypPrior8 + index * IypPrior8.getIypPrior8FieldLength());
                  getIypPrior8().set(index, iypPrior8Var);
			} 
			iypPrior8Var.initialize();
		}
     }
   }


}
  
