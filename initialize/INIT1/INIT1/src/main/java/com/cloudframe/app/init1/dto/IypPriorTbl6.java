package com.cloudframe.app.init1.dto;

/**
*  The class IypPriorTbl6 is used to handle fields declared in it
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
public class IypPriorTbl6 extends IypPriorTbl6Serialized { 
   
			@Getter @Setter private List<IypPrior6> iypPrior6 = new ArrayList<>();
    	
	
	/**
	* Constructor for IypPriorTbl6
	**/
    public IypPriorTbl6() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypPriorTbl6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPriorTbl6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_6_SIZE;arrayIndex++) {
						getIypPrior6().add(new IypPrior6(this, beginIypPrior6 + 
						arrayIndex * IypPrior6.getIypPrior6FieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_6_SIZE;arrayIndex++) {
					getIypPrior6().add(new IypPrior6(this, beginIypPrior6 + 
						arrayIndex * IypPrior6.getIypPrior6FieldLength()));
			}
    } 

	/**
	 * 	initializes IypPriorTbl6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (iypPrior6.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IYP_PRIOR_6_SIZE;index++) {
              IypPrior6  newElement = new IypPrior6(this,beginIypPrior6 + index * IypPrior6.getIypPrior6FieldLength());
              newElement.initialize();
              getIypPrior6().add(newElement);
          }
     } else {
        if (iypPrior6.size() < IYP_PRIOR_6_SIZE) {
          // prefill it first
          for (int index = iypPrior6.size();index <  IYP_PRIOR_6_SIZE;index++) {
              IypPrior6  newElement = new IypPrior6(this,beginIypPrior6 + index * IypPrior6.getIypPrior6FieldLength());
              getIypPrior6().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IYP_PRIOR_6_SIZE;index++) {
     		IypPrior6 iypPrior6Var = iypPrior6.get(index);
 			if (iypPrior6Var == null) {
                iypPrior6Var = new IypPrior6(this,beginIypPrior6 + index * IypPrior6.getIypPrior6FieldLength());
                  getIypPrior6().set(index, iypPrior6Var);
			} 
			iypPrior6Var.initialize();
		}
     }
   }


}
  
