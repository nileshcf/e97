package com.cloudframe.app.cfif01.dto;

/**
*  The class Array is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Array extends ArraySerialized { 
   
			@Getter @Setter private List<Tbl> tbl = new ArrayList<>();
    	
	
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
						getTbl().add(new Tbl(this, beginTbl + 
						arrayIndex * Tbl.getTblFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < TBL_SIZE;arrayIndex++) {
					getTbl().add(new Tbl(this, beginTbl + 
						arrayIndex * Tbl.getTblFieldLength()));
			}
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
              getTbl().add(newElement);
          }
     } else {
        if (tbl.size() < TBL_SIZE) {
          // prefill it first
          for (int index = tbl.size();index <  TBL_SIZE;index++) {
              Tbl  newElement = new Tbl(this,beginTbl + index * Tbl.getTblFieldLength());
              getTbl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  TBL_SIZE;index++) {
     		Tbl tblVar = tbl.get(index);
 			if (tblVar == null) {
                tblVar = new Tbl(this,beginTbl + index * Tbl.getTblFieldLength());
                  getTbl().set(index, tblVar);
			} 
			tblVar.initialize();
		}
     }
   }


}
  
