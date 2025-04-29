package com.cloudframe.app.cfif01.dto;

/**
*  The class Array is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:12. using version 5.0.0.257
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Array extends ArraySerialized { 
   
			private List<Tbl> tbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Array
	**/
    public Array() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Array. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Array(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < TBL_SIZE;arrayIndex++) {
						tbl.add(new Tbl(this, beginTbl + 
						arrayIndex * Tbl.getTblFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < TBL_SIZE;arrayIndex++) {
					tbl.add(new Tbl(this, beginTbl + 
						arrayIndex * Tbl.getTblFieldLength()));
			}
    } 

	/**
	 *	Returns the  value of tbl
	 *  Corresponding COBOL Variable is WS-TBL
	 *	@return tbl
	 */
   public List<Tbl> getTbl() {
       return tbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tbl
	 */
	public Tbl getTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TBL_SIZE) {
             	index = TBL_SIZE -1; // can't exceed max array size
             	logger.trace("tbl - Array index exceeded max Size {}, resetting it to max allowed",TBL_SIZE); 
	    }
		if (index >= tbl.size()) {
       		for (int fillIndex =  tbl.size() -1; fillIndex < index;fillIndex++) {
		       tbl.add(null);
		    }
			tbl.set(index,
			   	   	new Tbl(this,beginTbl + index * Tbl.getTblFieldLength()) 
				                        ); 	
		} 
   	   Tbl value = tbl.get(index);
   	   if (value == null) {
   	      tbl.set(index,
			   	   	new Tbl(this,beginTbl + index * Tbl.getTblFieldLength()) 
				                        ); 
		  value = tbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Tbl at index with the passed value
	 *  Corresponding COBOL Variable is WS-TBL
	 *  @param index
	 *	@param value
	 */
  public void setTbl(int index,char[] value) {
   	getTbl(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Array
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (tbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  TBL_SIZE;index++) {
              Tbl  newElement = new Tbl(this,beginTbl + index * Tbl.getTblFieldLength());
              newElement.initialize();
               tbl.add(newElement);
          }
     } else {
        if (tbl.size() < TBL_SIZE) {
          // prefill it first
          for (int index = tbl.size();index <  TBL_SIZE;index++) {
              Tbl  newElement = new Tbl(this,beginTbl + index * Tbl.getTblFieldLength());
               tbl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  TBL_SIZE;index++) {
     		Tbl tblVar = tbl.get(index);
 			if (tblVar == null) {
                tblVar = new Tbl(this,beginTbl + index * Tbl.getTblFieldLength());
                  tbl.set(index, tblVar);
			} 
			tblVar.initialize();
		}
     }
   }

		public static int getArrayFieldLength() {
			return ARRAY_LENGTH;
		}

}
  
