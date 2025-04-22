package com.cloudframe.app.init1.dto;

/**
*  The class IypPriorTbl7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class IypPriorTbl7 extends IypPriorTbl7Serialized { 
   
			private List<IypPrior7> iypPrior7 = new ArrayList<>();
    	
	
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
						iypPrior7.add(new IypPrior7(this, beginIypPrior7 + 
						arrayIndex * IypPrior7.getIypPrior7FieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_7_SIZE;arrayIndex++) {
					iypPrior7.add(new IypPrior7(this, beginIypPrior7 + 
						arrayIndex * IypPrior7.getIypPrior7FieldLength()));
			}
    } 

	/**
	 *	Returns the  value of iypPrior7
	 *  Corresponding COBOL Variable is WS-7IYP-PRIOR
	 *	@return iypPrior7
	 */
   public List<IypPrior7> getIypPrior7() {
       return iypPrior7;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return iypPrior7
	 */
	public IypPrior7 getIypPrior7(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIypPrior7(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IYP_PRIOR_7_SIZE) {
             	index = IYP_PRIOR_7_SIZE -1; // can't exceed max array size
             	logger.trace("iypPrior7 - Array index exceeded max Size {}, resetting it to max allowed",IYP_PRIOR_7_SIZE); 
	    }
		if (index >= iypPrior7.size()) {
       		for (int fillIndex =  iypPrior7.size() -1; fillIndex < index;fillIndex++) {
		       iypPrior7.add(null);
		    }
			iypPrior7.set(index,
			   	   	new IypPrior7(this,beginIypPrior7 + index * IypPrior7.getIypPrior7FieldLength()) 
				                        ); 	
		} 
   	   IypPrior7 value = iypPrior7.get(index);
   	   if (value == null) {
   	      iypPrior7.set(index,
			   	   	new IypPrior7(this,beginIypPrior7 + index * IypPrior7.getIypPrior7FieldLength()) 
				                        ); 
		  value = iypPrior7.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update IypPrior7 at index with the passed value
	 *  Corresponding COBOL Variable is WS-7IYP-PRIOR
	 *  @param index
	 *	@param value
	 */
  public void setIypPrior7(int index,char[] value) {
   	getIypPrior7(index).setString(value);
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
               iypPrior7.add(newElement);
          }
     } else {
        if (iypPrior7.size() < IYP_PRIOR_7_SIZE) {
          // prefill it first
          for (int index = iypPrior7.size();index <  IYP_PRIOR_7_SIZE;index++) {
              IypPrior7  newElement = new IypPrior7(this,beginIypPrior7 + index * IypPrior7.getIypPrior7FieldLength());
               iypPrior7.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IYP_PRIOR_7_SIZE;index++) {
     		IypPrior7 iypPrior7Var = iypPrior7.get(index);
 			if (iypPrior7Var == null) {
                iypPrior7Var = new IypPrior7(this,beginIypPrior7 + index * IypPrior7.getIypPrior7FieldLength());
                  iypPrior7.set(index, iypPrior7Var);
			} 
			iypPrior7Var.initialize();
		}
     }
   }

		public static int getIypPriorTbl7FieldLength() {
			return IYP_PRIOR_TBL_7_LENGTH;
		}

}
  
