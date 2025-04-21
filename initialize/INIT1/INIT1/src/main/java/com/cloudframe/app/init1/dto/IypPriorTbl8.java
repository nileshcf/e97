package com.cloudframe.app.init1.dto;

/**
*  The class IypPriorTbl8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class IypPriorTbl8 extends IypPriorTbl8Serialized { 
   
			private List<IypPrior8> iypPrior8 = new ArrayList<>();
    	
	
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
						iypPrior8.add(new IypPrior8(this, beginIypPrior8 + 
						arrayIndex * IypPrior8.getIypPrior8FieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_8_SIZE;arrayIndex++) {
					iypPrior8.add(new IypPrior8(this, beginIypPrior8 + 
						arrayIndex * IypPrior8.getIypPrior8FieldLength()));
			}
    } 

	/**
	 *	Returns the  value of iypPrior8
	 *  Corresponding COBOL Variable is WS-8IYP-PRIOR
	 *	@return iypPrior8
	 */
   public List<IypPrior8> getIypPrior8() {
       return iypPrior8;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return iypPrior8
	 */
	public IypPrior8 getIypPrior8(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIypPrior8(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IYP_PRIOR_8_SIZE) {
             	index = IYP_PRIOR_8_SIZE -1; // can't exceed max array size
             	logger.trace("iypPrior8 - Array index exceeded max Size {}, resetting it to max allowed",IYP_PRIOR_8_SIZE); 
	    }
		if (index >= iypPrior8.size()) {
       		for (int fillIndex =  iypPrior8.size() -1; fillIndex < index;fillIndex++) {
		       iypPrior8.add(null);
		    }
			iypPrior8.set(index,
			   	   	new IypPrior8(this,beginIypPrior8 + index * IypPrior8.getIypPrior8FieldLength()) 
				                        ); 	
		} 
   	   IypPrior8 value = iypPrior8.get(index);
   	   if (value == null) {
   	      iypPrior8.set(index,
			   	   	new IypPrior8(this,beginIypPrior8 + index * IypPrior8.getIypPrior8FieldLength()) 
				                        ); 
		  value = iypPrior8.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update IypPrior8 at index with the passed value
	 *  Corresponding COBOL Variable is WS-8IYP-PRIOR
	 *  @param index
	 *	@param value
	 */
  public void setIypPrior8(int index,char[] value) {
   	getIypPrior8(index).setString(value);
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
               iypPrior8.add(newElement);
          }
     } else {
        if (iypPrior8.size() < IYP_PRIOR_8_SIZE) {
          // prefill it first
          for (int index = iypPrior8.size();index <  IYP_PRIOR_8_SIZE;index++) {
              IypPrior8  newElement = new IypPrior8(this,beginIypPrior8 + index * IypPrior8.getIypPrior8FieldLength());
               iypPrior8.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IYP_PRIOR_8_SIZE;index++) {
     		IypPrior8 iypPrior8Var = iypPrior8.get(index);
 			if (iypPrior8Var == null) {
                iypPrior8Var = new IypPrior8(this,beginIypPrior8 + index * IypPrior8.getIypPrior8FieldLength());
                  iypPrior8.set(index, iypPrior8Var);
			} 
			iypPrior8Var.initialize();
		}
     }
   }

		public static int getIypPriorTbl8FieldLength() {
			return IYP_PRIOR_TBL_8_LENGTH;
		}

}
  
